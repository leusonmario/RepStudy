import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest33 {

    public static boolean debug = false;

    @Test
    public void test16501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16501");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder8.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.Operator operator13 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.operator(operator13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.maxExpansions((int) (short) 1);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray26);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery32 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.zeroTermsQuery(zeroTermsQuery32);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.queryName("hi!");
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery38 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder37.zeroTermsQuery(zeroTermsQuery38);
        boolean boolean40 = multiMatchQueryBuilder16.equals((java.lang.Object) multiMatchQueryBuilder37);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder16.field("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder44 = multiMatchQueryBuilder16.boost((float) (-1L));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder46 = multiMatchQueryBuilder44.lenient(true);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder29);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder31);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder33);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder35);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder37);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder42);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder44);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder46);
    }

    @Test
    public void test16502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16502");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.rewrite("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"rewrite\" : \"multi_match\",\n    \"fuzzyRewrite\" : \"hi!\",\n    \"lenient\" : false,\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray24);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.fuzzyRewrite("hi!");
        java.lang.String str30 = multiMatchQueryBuilder27.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder27.rewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder27.analyzer("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String str35 = multiMatchQueryBuilder27.queryName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder27.tieBreaker(10.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder27.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"cross_fields\",\n    \"analyzer\" : \"multi_match\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"use_dis_max\" : true,\n    \"boost\" : 0.0\n  }\n}", (float) 'a');
        org.elasticsearch.index.query.QueryValidationException queryValidationException41 = multiMatchQueryBuilder27.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder44 = multiMatchQueryBuilder27.field("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzyRewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzziness\" : \"{\\n  \\\"MULTIMATCH\\\" : {\\n    \\\"QUERY\\\" : 0.0,\\n    \\\"FIELDS\\\" : [ \\\"HI!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"FUZZYREWRITE\\\" : \\\"\\\",\\n    \\\"BOOST\\\" : 1.0\\n  }\\n}\",\n    \"rewrite\" : \"multi_match\",\n    \"fuzzyRewrite\" : \"hi!\",\n    \"lenient\" : false,\n    \"boost\" : 1.0\n  }\n}", (float) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder10.fuzziness((java.lang.Object) (short) 0);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder27);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "multi_match" + "'", str30, "multi_match");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder32);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder37);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder40);
        org.junit.Assert.assertNull(queryValidationException41);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder44);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder45);
    }

    @Test
    public void test16503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16503");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery13 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.zeroTermsQuery(zeroTermsQuery13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery17 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder14.zeroTermsQuery(zeroTermsQuery17);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray26);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery32 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.zeroTermsQuery(zeroTermsQuery32);
        java.lang.String str34 = multiMatchQueryBuilder33.getName();
        boolean boolean35 = multiMatchQueryBuilder18.equals((java.lang.Object) multiMatchQueryBuilder33);
        java.lang.String str36 = multiMatchQueryBuilder33.getWriteableName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder33.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder33.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder33.useDisMax(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder44 = multiMatchQueryBuilder33.minimumShouldMatch("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"best_fields\",\n    \"slop\" : 35,\n    \"fuzzyRewrite\" : \"\",\n    \"useDisMax\" : false,\n    \"tieBreaker\" : 0.0,\n    \"lenient\" : false,\n    \"cutoffFrequency\" : 32.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder46 = multiMatchQueryBuilder44.minimumShouldMatch("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder48 = multiMatchQueryBuilder46.rewrite("{\n  \"multi_match\" : {\n    \"query\" : 100,\n    \"fields\" : [ \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzyRewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\" ],\n    \"cutoff_frequency\" : 0.0,\n    \"boost\" : 1.0\n  }\n}");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder29);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder31);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "multi_match" + "'", str34, "multi_match");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "multi_match" + "'", str36, "multi_match");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder38);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder40);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder42);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder44);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder46);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder48);
    }

    @Test
    public void test16504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16504");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder8.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.Operator operator13 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.operator(operator13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.maxExpansions((int) (short) 1);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray26);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder16, strArray26);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder16.field("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder30.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"multi_match\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}^10.0\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\" ],\n    \"fuzzy_rewrite\" : \"\",\n    \"boost\" : 1.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery33 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder30.zeroTermsQuery(zeroTermsQuery33);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery35 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder30.zeroTermsQuery(zeroTermsQuery35);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder36.fuzzyRewrite("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery39 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder36.zeroTermsQuery(zeroTermsQuery39);
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder49 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray48);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder51 = multiMatchQueryBuilder49.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder53 = multiMatchQueryBuilder51.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery54 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder55 = multiMatchQueryBuilder53.zeroTermsQuery(zeroTermsQuery54);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder57 = multiMatchQueryBuilder55.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder59 = multiMatchQueryBuilder57.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder61 = multiMatchQueryBuilder59.analyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder63 = multiMatchQueryBuilder59.rewrite("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimumShouldMatch\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"type\\\" : \\\"phrase_prefix\\\",\\n    \\\"maxExpansions\\\" : 10,\\n    \\\"fuzzyRewrite\\\" : \\\"\\\",\\n    \\\"tieBreaker\\\" : 0.0,\\n    \\\"cutoffFrequency\\\" : 0.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzyRewrite\" : \"hi!\",\n    \"lenient\" : false,\n    \"cutoffFrequency\" : -1.0,\n    \"boost\" : 1.0\n  }\n}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder64 = multiMatchQueryBuilder40.type((java.lang.Object) "{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimumShouldMatch\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"type\\\" : \\\"phrase_prefix\\\",\\n    \\\"maxExpansions\\\" : 10,\\n    \\\"fuzzyRewrite\\\" : \\\"\\\",\\n    \\\"tieBreaker\\\" : 0.0,\\n    \\\"cutoffFrequency\\\" : 0.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzyRewrite\" : \"hi!\",\n    \"lenient\" : false,\n    \"cutoffFrequency\" : -1.0,\n    \"boost\" : 1.0\n  }\n}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: failed to parse [multi_match] query type [{?  \"multimatch\" : {?    \"query\" : 0.0,?    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],?    \"analyzer\" : \"hi!\",?    \"minimumshouldmatch\" : \"{\\n  \\\"multimatch\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"type\\\" : \\\"phrase_prefix\\\",\\n    \\\"maxexpansions\\\" : 10,\\n    \\\"fuzzyrewrite\\\" : \\\"\\\",\\n    \\\"tiebreaker\\\" : 0.0,\\n    \\\"cutofffrequency\\\" : 0.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",?    \"fuzzyrewrite\" : \"hi!\",?    \"lenient\" : false,?    \"cutofffrequency\" : -1.0,?    \"boost\" : 1.0?  }?}]. unknown type.");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder30);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder32);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder34);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder36);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder38);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder40);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder51);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder53);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder55);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder57);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder59);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder61);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder63);
    }

    @Test
    public void test16505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16505");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder8.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.Operator operator13 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.operator(operator13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.maxExpansions((int) (short) 1);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray26);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder16, strArray26);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder16.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder16.useDisMax(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder32.rewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.QueryValidationException queryValidationException35 = multiMatchQueryBuilder32.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type36 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS;
        float float37 = type36.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder32.type(type36);
        float float39 = multiMatchQueryBuilder38.boost();
        java.lang.String str40 = null; // flaky: multiMatchQueryBuilder38.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder38.prefixLength((int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder30);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder32);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder34);
        org.junit.Assert.assertNull(queryValidationException35);
        org.junit.Assert.assertTrue("'" + type36 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS + "'", type36.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS));
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 0.0f + "'", float37 == 0.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder38);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 1.0f + "'", float39 == 1.0f);
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"cross_fields\",\n    \"max_expansions\" : 1,\n    \"rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"slop\\\" : -1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"\",\n    \"use_dis_max\" : true,\n    \"lenient\" : true,\n    \"boost\" : 1.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\"\n  }\n}" + "'", str40, "{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"cross_fields\",\n    \"max_expansions\" : 1,\n    \"rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"slop\\\" : -1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"\",\n    \"use_dis_max\" : true,\n    \"lenient\" : true,\n    \"boost\" : 1.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder42);
    }

    @Test
    public void test16506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16506");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery13 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.zeroTermsQuery(zeroTermsQuery13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder16.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder16.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder16.tieBreaker((float) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder16.boost((float) (-1));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder26.maxExpansions(0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder26.field("{\n  \"multi_match\" : {\n    \"query\" : \"PHRASE_PREFIX\",\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzziness\" : \"10\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.QueryValidationException queryValidationException31 = multiMatchQueryBuilder30.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder30.cutoffFrequency((float) (byte) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder30.boost((float) 1L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder30.cutoffFrequency((float) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder37.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"max_expansions\" : 1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.Operator operator40 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder37.operator(operator40);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder41.rewrite("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzyRewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"rewrite\" : \"multi_match\",\n    \"fuzzyRewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder20);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder22);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder24);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder28);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder30);
        org.junit.Assert.assertNull(queryValidationException31);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder33);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder35);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder37);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder39);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder41);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder43);
    }

    @Test
    public void test16507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16507");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery13 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.zeroTermsQuery(zeroTermsQuery13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery17 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder14.zeroTermsQuery(zeroTermsQuery17);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray26);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery32 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.zeroTermsQuery(zeroTermsQuery32);
        java.lang.String str34 = multiMatchQueryBuilder33.getName();
        boolean boolean35 = multiMatchQueryBuilder18.equals((java.lang.Object) multiMatchQueryBuilder33);
        java.lang.String str36 = multiMatchQueryBuilder33.getWriteableName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder33.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder33.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder40.cutoffFrequency((float) ' ');
        java.lang.String str43 = multiMatchQueryBuilder42.getWriteableName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder42.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"minimum_should_match\" : \"\",\n    \"rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"slop\\\" : -1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 52.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = multiMatchQueryBuilder42.rewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}^-1.0\" ],\n    \"type\" : \"phrase_prefix\",\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"multi_match\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"slop\" : -1,\n    \"fuzziness\" : \"-1\",\n    \"prefix_length\" : 35,\n    \"minimum_should_match\" : \"hi!\",\n    \"rewrite\" : \"\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0,\n    \"_name\" : \"multi_match\"\n  }\n}");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder29);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder31);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "multi_match" + "'", str34, "multi_match");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "multi_match" + "'", str36, "multi_match");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder38);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder40);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "multi_match" + "'", str43, "multi_match");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder45);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder47);
    }

    @Test
    public void test16508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16508");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery13 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.zeroTermsQuery(zeroTermsQuery13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery17 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder14.zeroTermsQuery(zeroTermsQuery17);
        java.lang.String str19 = multiMatchQueryBuilder14.getWriteableName();
        java.lang.String str20 = null; // flaky: multiMatchQueryBuilder14.toString();
        java.lang.String str21 = multiMatchQueryBuilder14.queryName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder14.rewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"multi_match\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}^10.0\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\" ],\n    \"fuzzy_rewrite\" : \"\",\n    \"boost\" : 1.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder23.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}", (float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder23.useDisMax(false);
        org.elasticsearch.index.query.QueryValidationException queryValidationException29 = multiMatchQueryBuilder28.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder28.useDisMax(true);
        org.elasticsearch.index.query.QueryValidationException queryValidationException32 = multiMatchQueryBuilder31.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder31.rewrite("{\n  \"multi_match\" : {\n    \"query\" : \"class org.elasticsearch.index.query.MultiMatchQueryBuilder$Type\",\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"use_dis_max\" : false,\n    \"boost\" : 1.0,\n    \"_name\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzyRewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        java.lang.Class<?> wildcardClass35 = multiMatchQueryBuilder31.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "multi_match" + "'", str19, "multi_match");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}" + "'", str20, "{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder28);
        org.junit.Assert.assertNull(queryValidationException29);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder31);
        org.junit.Assert.assertNull(queryValidationException32);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test16509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16509");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder8.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.Operator operator13 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.operator(operator13);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery15 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder12.zeroTermsQuery(zeroTermsQuery15);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder16.boost((float) 10L);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray28);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder29.cutoffFrequency((float) 100);
        java.lang.String str34 = multiMatchQueryBuilder33.queryName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder33.boost((float) '4');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder36.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder38.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"best_fields\",\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"multi_match\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"\",\n    \"tie_breaker\" : 0.0,\n    \"cutoff_frequency\" : 0.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder38.minimumShouldMatch("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"useDisMax\" : true,\n    \"lenient\" : true,\n    \"cutoffFrequency\" : -1.0,\n    \"boost\" : 1.0,\n    \"Name\" : \"\"\n  }\n}");
        boolean boolean43 = multiMatchQueryBuilder20.equals((java.lang.Object) multiMatchQueryBuilder42);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder20);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder31);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder36);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder38);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder40);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test16510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16510");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.minimumShouldMatch("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.maxExpansions(0);
        org.elasticsearch.index.query.Operator operator19 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder18.operator(operator19);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder18.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"hi!\" ],\n    \"max_expansions\" : 10,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"use_dis_max\" : false,\n    \"tie_breaker\" : 35.0,\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray30);
        java.lang.Object obj32 = null;
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray41);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 10.0f, strArray41);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder44 = new org.elasticsearch.index.query.MultiMatchQueryBuilder(obj32, strArray41);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray41);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type46 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float47 = type46.tieBreaker();
        org.elasticsearch.common.ParseField parseField48 = type46.parseField();
        org.elasticsearch.index.search.MatchQuery.Type type49 = type46.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = multiMatchQueryBuilder45.type(type46);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder51 = multiMatchQueryBuilder18.type(type46);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder20);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder22);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + type46 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX + "'", type46.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX));
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 0.0f + "'", float47 == 0.0f);
        org.junit.Assert.assertNotNull(parseField48);
        org.junit.Assert.assertTrue("'" + type49 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX + "'", type49.equals(org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder50);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder51);
    }

    @Test
    public void test16511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16511");
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
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder22.boost(35.0f);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput27 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiMatchQueryBuilder22.writeTo(streamOutput27);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertTrue("'" + type13 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX + "'", type13.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "multi_match" + "'", str20, "multi_match");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder22);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder24);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
    }

    @Test
    public void test16512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16512");
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
        float float27 = multiMatchQueryBuilder24.boost();
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray35);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder36.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder38.fuzzyRewrite("hi!");
        java.lang.String str41 = multiMatchQueryBuilder38.getName();
        float float42 = multiMatchQueryBuilder38.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder44 = multiMatchQueryBuilder38.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder46 = multiMatchQueryBuilder38.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type47 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type48 = type47.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type49 = type47.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = multiMatchQueryBuilder38.type(type47);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder52 = multiMatchQueryBuilder38.queryName("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder54 = multiMatchQueryBuilder52.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder56 = multiMatchQueryBuilder52.lenient(true);
        org.elasticsearch.index.query.Operator operator57 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder58 = multiMatchQueryBuilder52.operator(operator57);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder60 = multiMatchQueryBuilder58.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder63 = multiMatchQueryBuilder60.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzyRewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"slop\" : 100,\n    \"rewrite\" : \"multi_match\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : false,\n    \"boost\" : 1.0\n  }\n}", 1.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder65 = multiMatchQueryBuilder63.fuzzyRewrite("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        float float66 = multiMatchQueryBuilder65.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder68 = multiMatchQueryBuilder65.analyzer("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"type\\\" : \\\"phrase_prefix\\\",\\n    \\\"max_expansions\\\" : 10,\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\",\\n    \\\"tie_breaker\\\" : 0.0,\\n    \\\"cutoff_frequency\\\" : 0.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}^1.0\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"useDisMax\" : false,\n    \"boost\" : 0.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder69 = null; // flaky: multiMatchQueryBuilder24.fuzziness((java.lang.Object) multiMatchQueryBuilder65);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "multi_match" + "'", str13, "multi_match");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertTrue("'" + type19 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX + "'", type19.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX));
        org.junit.Assert.assertTrue("'" + type20 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX + "'", type20.equals(org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX));
        org.junit.Assert.assertTrue("'" + type21 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX + "'", type21.equals(org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder22);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder24);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 1.0f + "'", float27 == 1.0f);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder38);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "multi_match" + "'", str41, "multi_match");
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 1.0f + "'", float42 == 1.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder44);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder46);
        org.junit.Assert.assertTrue("'" + type47 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX + "'", type47.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX));
        org.junit.Assert.assertTrue("'" + type48 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX + "'", type48.equals(org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX));
        org.junit.Assert.assertTrue("'" + type49 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX + "'", type49.equals(org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder50);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder52);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder54);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder56);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder58);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder60);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder63);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder65);
        org.junit.Assert.assertTrue("'" + float66 + "' != '" + 1.0f + "'", float66 == 1.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder68);
// flaky:         org.junit.Assert.assertNotNull(multiMatchQueryBuilder69);
    }

    @Test
    public void test16513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16513");
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
        org.elasticsearch.index.query.Operator operator22 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.operator(operator22);
        java.lang.String str24 = multiMatchQueryBuilder21.getWriteableName();
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray32);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder35.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder35.boost(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder35.field("");
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder52 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray51);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder54 = multiMatchQueryBuilder52.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder56 = multiMatchQueryBuilder54.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type57 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float58 = type57.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder59 = multiMatchQueryBuilder54.type(type57);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder61 = multiMatchQueryBuilder54.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder63 = multiMatchQueryBuilder54.queryName("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder66 = multiMatchQueryBuilder63.field("", (float) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder67 = null; // flaky: multiMatchQueryBuilder35.fuzziness((java.lang.Object) multiMatchQueryBuilder63);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder69 = null; // flaky: multiMatchQueryBuilder67.maxExpansions(0);
        boolean boolean70 = multiMatchQueryBuilder21.equals((java.lang.Object) multiMatchQueryBuilder69);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput71 = null;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             multiMatchQueryBuilder69.writeTo(streamOutput71);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertTrue("'" + type13 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX + "'", type13.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "multi_match" + "'", str24, "multi_match");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder35);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder37);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder39);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder41);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder43);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder54);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder56);
        org.junit.Assert.assertTrue("'" + type57 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX + "'", type57.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX));
        org.junit.Assert.assertTrue("'" + float58 + "' != '" + 0.0f + "'", float58 == 0.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder59);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder61);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder63);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder66);
// flaky:         org.junit.Assert.assertNotNull(multiMatchQueryBuilder67);
// flaky:         org.junit.Assert.assertNotNull(multiMatchQueryBuilder69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test16514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16514");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.tieBreaker((float) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.useDisMax(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder14.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"minimum_should_match\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"slop\\\" : -1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"boost\" : 1.0\n  }\n}", (float) (byte) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"slop\" : -1,\n    \"minimum_should_match\" : \"\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"{\\\\n  \\\\\\\"multi_match\\\\\\\" : {\\\\n    \\\\\\\"query\\\\\\\" : 0.0,\\\\n    \\\\\\\"fields\\\\\\\" : [ \\\\\\\"hi!\\\\\\\", \\\\\\\"\\\\\\\", \\\\\\\"\\\\\\\", \\\\\\\"\\\\\\\", \\\\\\\"\\\\\\\", \\\\\\\"\\\\\\\" ],\\\\n    \\\\\\\"slop\\\\\\\" : -1,\\\\n    \\\\\\\"fuzzy_rewrite\\\\\\\" : \\\\\\\"hi!\\\\\\\",\\\\n    \\\\\\\"lenient\\\\\\\" : true,\\\\n    \\\\\\\"boost\\\\\\\" : 1.0\\\\n  }\\\\n}\\\",\\n    \\\"boost\\\" : 1.0,\\n    \\\"_name\\\" : \\\"hi!\\\"\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.index.query.Operator operator24 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder21.operator(operator24);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder21.cutoffFrequency(52.0f);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder25);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder27);
    }

    @Test
    public void test16515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16515");
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
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder30.fuzzyRewrite("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"rewrite\\\" : \\\"multi_match\\\",\\n    \\\"fuzzyRewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : false,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder32.field("", 52.0f);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "multi_match" + "'", str13, "multi_match");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertTrue("'" + type19 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX + "'", type19.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX));
        org.junit.Assert.assertTrue("'" + type20 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX + "'", type20.equals(org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX));
        org.junit.Assert.assertTrue("'" + type21 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX + "'", type21.equals(org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder22);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder24);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder28);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder30);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder32);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder35);
    }

    @Test
    public void test16516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16516");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray18);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type24 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float25 = type24.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder21.type(type24);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder21.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder21.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type31 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type32 = type31.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder21.type(type31);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder8.fuzziness((java.lang.Object) type31);
        org.elasticsearch.index.query.Operator operator35 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder34.operator(operator35);
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray44);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = multiMatchQueryBuilder45.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder49 = multiMatchQueryBuilder47.fuzzyRewrite("hi!");
        java.lang.String str50 = multiMatchQueryBuilder47.getName();
        float float51 = multiMatchQueryBuilder47.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder53 = multiMatchQueryBuilder47.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder55 = multiMatchQueryBuilder47.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type56 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type57 = type56.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type58 = type56.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder59 = multiMatchQueryBuilder47.type(type56);
        org.elasticsearch.index.search.MatchQuery.Type type60 = type56.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder61 = multiMatchQueryBuilder36.fuzziness((java.lang.Object) type60);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery62 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder63 = multiMatchQueryBuilder36.zeroTermsQuery(zeroTermsQuery62);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder65 = multiMatchQueryBuilder36.cutoffFrequency((float) (byte) 1);
        org.elasticsearch.common.xcontent.XContentType xContentType66 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.bytes.BytesReference bytesReference67 = multiMatchQueryBuilder65.buildAsBytes(xContentType66);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchException; message: Failed to build ToXContent");
        } catch (org.elasticsearch.ElasticsearchException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
        org.junit.Assert.assertTrue("'" + type24 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX + "'", type24.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX));
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.0f + "'", float25 == 0.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder28);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder30);
        org.junit.Assert.assertTrue("'" + type31 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS + "'", type31.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS));
        org.junit.Assert.assertTrue("'" + type32 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type32.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder33);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder34);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder36);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder47);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "multi_match" + "'", str50, "multi_match");
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 1.0f + "'", float51 == 1.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder53);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder55);
        org.junit.Assert.assertTrue("'" + type56 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX + "'", type56.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX));
        org.junit.Assert.assertTrue("'" + type57 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX + "'", type57.equals(org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX));
        org.junit.Assert.assertTrue("'" + type58 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX + "'", type58.equals(org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder59);
        org.junit.Assert.assertTrue("'" + type60 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX + "'", type60.equals(org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder61);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder63);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder65);
    }

    @Test
    public void test16517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16517");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String str19 = multiMatchQueryBuilder18.getWriteableName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder18.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"max_expansions\" : 1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String str22 = null; // flaky: multiMatchQueryBuilder21.toString();
        org.elasticsearch.index.query.Operator operator23 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder21.operator(operator23);
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray32);
        java.lang.Object obj34 = null;
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder44 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray43);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 10.0f, strArray43);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder46 = new org.elasticsearch.index.query.MultiMatchQueryBuilder(obj34, strArray43);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray43);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder49 = multiMatchQueryBuilder47.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder51 = multiMatchQueryBuilder49.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder53 = multiMatchQueryBuilder49.useDisMax(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder55 = multiMatchQueryBuilder49.prefixLength((int) '4');
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder64 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray63);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder66 = multiMatchQueryBuilder64.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder68 = multiMatchQueryBuilder66.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type69 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float70 = type69.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder71 = multiMatchQueryBuilder66.type(type69);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder73 = multiMatchQueryBuilder66.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder75 = multiMatchQueryBuilder66.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type76 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type77 = type76.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder78 = multiMatchQueryBuilder66.type(type76);
        float float79 = type76.tieBreaker();
        org.elasticsearch.index.search.MatchQuery.Type type80 = type76.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder81 = multiMatchQueryBuilder55.fuzziness((java.lang.Object) type80);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder82 = multiMatchQueryBuilder24.type((java.lang.Object) type80);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "multi_match" + "'", str19, "multi_match");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"slop\\\" : -1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"max_expansions\\\" : 1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\" ],\n    \"analyzer\" : \"\",\n    \"fuzzy_rewrite\" : \"\",\n    \"tie_breaker\" : 0.0,\n    \"cutoff_frequency\" : 0.0,\n    \"boost\" : 1.0\n  }\n}" + "'", str22, "{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"slop\\\" : -1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"max_expansions\\\" : 1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\" ],\n    \"analyzer\" : \"\",\n    \"fuzzy_rewrite\" : \"\",\n    \"tie_breaker\" : 0.0,\n    \"cutoff_frequency\" : 0.0,\n    \"boost\" : 1.0\n  }\n}");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder24);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder49);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder51);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder53);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder55);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder66);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder68);
        org.junit.Assert.assertTrue("'" + type69 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX + "'", type69.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX));
        org.junit.Assert.assertTrue("'" + float70 + "' != '" + 0.0f + "'", float70 == 0.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder71);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder73);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder75);
        org.junit.Assert.assertTrue("'" + type76 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS + "'", type76.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS));
        org.junit.Assert.assertTrue("'" + type77 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type77.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder78);
        org.junit.Assert.assertTrue("'" + float79 + "' != '" + 0.0f + "'", float79 == 0.0f);
        org.junit.Assert.assertTrue("'" + type80 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type80.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder81);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder82);
    }

    @Test
    public void test16518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16518");
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
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"max_expansions\" : 10,\n    \"fuzzy_rewrite\" : \"\",\n    \"tie_breaker\" : 0.0,\n    \"cutoff_frequency\" : 0.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.cutoffFrequency((float) 10);
        java.lang.String str34 = null; // flaky: multiMatchQueryBuilder31.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder31.maxExpansions((int) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder36.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"max_expansions\" : 52,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0,\n    \"_name\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzyRewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\"\n  }\n}", 52.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder39.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"slop\\\" : -1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\" ],\n    \"analyzer\" : \"\",\n    \"max_expansions\" : 0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        float float42 = multiMatchQueryBuilder41.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder44 = multiMatchQueryBuilder41.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder46 = multiMatchQueryBuilder44.maxExpansions(100);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "multi_match" + "'", str13, "multi_match");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertTrue("'" + type19 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX + "'", type19.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX));
        org.junit.Assert.assertTrue("'" + type20 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX + "'", type20.equals(org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX));
        org.junit.Assert.assertTrue("'" + type21 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX + "'", type21.equals(org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder22);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder24);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 1.0f + "'", float27 == 1.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder29);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder31);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder33);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"type\\\" : \\\"phrase_prefix\\\",\\n    \\\"max_expansions\\\" : 10,\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\",\\n    \\\"tie_breaker\\\" : 0.0,\\n    \\\"cutoff_frequency\\\" : 0.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"multi_match\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"lenient\" : true,\n    \"cutoff_frequency\" : 10.0,\n    \"boost\" : 1.0\n  }\n}" + "'", str34, "{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"type\\\" : \\\"phrase_prefix\\\",\\n    \\\"max_expansions\\\" : 10,\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\",\\n    \\\"tie_breaker\\\" : 0.0,\\n    \\\"cutoff_frequency\\\" : 0.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"multi_match\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"lenient\" : true,\n    \"cutoff_frequency\" : 10.0,\n    \"boost\" : 1.0\n  }\n}");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder36);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder39);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder41);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 1.0f + "'", float42 == 1.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder44);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder46);
    }

    @Test
    public void test16519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16519");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.maxExpansions(1);
        org.elasticsearch.index.query.QueryValidationException queryValidationException15 = multiMatchQueryBuilder14.validate();
        java.lang.String str16 = null; // flaky: multiMatchQueryBuilder14.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder14.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder18.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"\",\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 52.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.rewrite("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"type\\\" : \\\"phrase_prefix\\\",\\n    \\\"max_expansions\\\" : 10,\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\",\\n    \\\"tie_breaker\\\" : 0.0,\\n    \\\"cutoff_frequency\\\" : 0.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"slop\" : -1,\n    \"fuzzyRewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"multi_match\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"lenient\" : true,\n    \"cutoffFrequency\" : 10.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"best_fields\",\n    \"analyzer\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"type\\\" : \\\"phrase_prefix\\\",\\n    \\\"maxExpansions\\\" : 10,\\n    \\\"fuzzyRewrite\\\" : \\\"\\\",\\n    \\\"tieBreaker\\\" : 0.0,\\n    \\\"cutoffFrequency\\\" : 0.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"use_dis_max\" : false,\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNull(queryValidationException15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"max_expansions\" : 1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}" + "'", str16, "{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"max_expansions\" : 1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder20);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder22);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder24);
    }

    @Test
    public void test16520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16520");
        java.lang.String[] strArray2 = new java.lang.String[] { "{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder3 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (short) 100, strArray2);
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray11);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder3, strArray11);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray21);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery27 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder26.zeroTermsQuery(zeroTermsQuery27);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder28.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder30.queryName("hi!");
        java.lang.String str33 = multiMatchQueryBuilder30.queryName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder30.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String str36 = multiMatchQueryBuilder30.getWriteableName();
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray44);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = multiMatchQueryBuilder45.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder49 = multiMatchQueryBuilder47.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery50 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder51 = multiMatchQueryBuilder49.zeroTermsQuery(zeroTermsQuery50);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder53 = multiMatchQueryBuilder51.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery54 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder55 = multiMatchQueryBuilder51.zeroTermsQuery(zeroTermsQuery54);
        boolean boolean56 = multiMatchQueryBuilder30.equals((java.lang.Object) zeroTermsQuery54);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder57 = multiMatchQueryBuilder3.fuzziness((java.lang.Object) boolean56);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder59 = multiMatchQueryBuilder3.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder61 = multiMatchQueryBuilder59.useDisMax(false);
        java.lang.String[] strArray69 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder70 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray69);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder72 = multiMatchQueryBuilder70.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder74 = multiMatchQueryBuilder72.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder76 = multiMatchQueryBuilder74.tieBreaker((float) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder78 = multiMatchQueryBuilder76.useDisMax(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder80 = multiMatchQueryBuilder78.boost((float) 100L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder82 = multiMatchQueryBuilder80.fuzzyRewrite("");
        java.lang.String str83 = multiMatchQueryBuilder82.queryName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder84 = multiMatchQueryBuilder61.type((java.lang.Object) str83);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder86 = multiMatchQueryBuilder61.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : \"class org.elasticsearch.index.query.MultiMatchQueryBuilder$Type\",\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"use_dis_max\" : false,\n    \"lenient\" : true,\n    \"boost\" : 1.0,\n    \"_name\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzyRewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder88 = multiMatchQueryBuilder86.maxExpansions((int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder24);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder28);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder30);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "multi_match" + "'", str36, "multi_match");
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder47);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder49);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder51);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder53);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder57);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder59);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder61);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder72);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder74);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder76);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder78);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder80);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder82);
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder84);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder86);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder88);
    }

    @Test
    public void test16521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16521");
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
        org.elasticsearch.index.query.Operator operator29 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder24.operator(operator29);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder30.analyzer("");
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray41);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder44 = multiMatchQueryBuilder42.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder46 = multiMatchQueryBuilder42.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.Operator operator47 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder48 = multiMatchQueryBuilder46.operator(operator47);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = multiMatchQueryBuilder48.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder52 = multiMatchQueryBuilder50.maxExpansions((int) (short) 1);
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder61 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray60);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder62 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder50, strArray60);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder63 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (byte) 1, strArray60);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder64 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder30, strArray60);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder67 = multiMatchQueryBuilder30.field("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"type\\\" : \\\"phrase_prefix\\\",\\n    \\\"max_expansions\\\" : 10,\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\",\\n    \\\"tie_breaker\\\" : 0.0,\\n    \\\"cutoff_frequency\\\" : 0.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"slop\" : -1,\n    \"fuzzyRewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"multi_match\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"lenient\" : true,\n    \"cutoffFrequency\" : 10.0,\n    \"boost\" : 1.0\n  }\n}", (float) (byte) 100);
        java.lang.String[] strArray70 = new java.lang.String[] { "{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder71 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (short) 100, strArray70);
        java.lang.String[] strArray79 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder80 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray79);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder81 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder71, strArray79);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder82 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (byte) 100, strArray79);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "multi_match" + "'", str13, "multi_match");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertTrue("'" + type19 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX + "'", type19.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX));
        org.junit.Assert.assertTrue("'" + type20 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX + "'", type20.equals(org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX));
        org.junit.Assert.assertTrue("'" + type21 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX + "'", type21.equals(org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder22);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder24);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder28);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder30);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder32);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder44);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder46);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder48);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder50);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder52);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder67);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertNotNull(strArray79);
    }

    @Test
    public void test16522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16522");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery13 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.zeroTermsQuery(zeroTermsQuery13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.fuzzyRewrite("hi!");
        java.lang.String str17 = null; // flaky: multiMatchQueryBuilder16.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder16.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"slop\\\" : -1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 52.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder16.rewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder16.cutoffFrequency((float) 'a');
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray31);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder32.fuzzyRewrite("");
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray42);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder43.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = multiMatchQueryBuilder45.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type48 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float49 = type48.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = multiMatchQueryBuilder45.type(type48);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder52 = multiMatchQueryBuilder45.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder54 = multiMatchQueryBuilder45.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type55 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type56 = type55.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder57 = multiMatchQueryBuilder45.type(type55);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder58 = multiMatchQueryBuilder32.fuzziness((java.lang.Object) type55);
        float float59 = type55.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder60 = multiMatchQueryBuilder16.type(type55);
        java.lang.String str61 = multiMatchQueryBuilder16.getName();
        java.lang.String[] strArray69 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder70 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray69);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder72 = multiMatchQueryBuilder70.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder74 = multiMatchQueryBuilder70.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.Operator operator75 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder76 = multiMatchQueryBuilder74.operator(operator75);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder78 = multiMatchQueryBuilder76.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder80 = multiMatchQueryBuilder78.maxExpansions((int) (short) 1);
        java.lang.String str81 = multiMatchQueryBuilder78.getWriteableName();
        java.lang.String str82 = multiMatchQueryBuilder78.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder83 = null; // flaky: multiMatchQueryBuilder16.fuzziness((java.lang.Object) multiMatchQueryBuilder78);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder85 = null; // flaky: multiMatchQueryBuilder83.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"best_fields\",\n    \"analyzer\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"type\\\" : \\\"phrase_prefix\\\",\\n    \\\"maxExpansions\\\" : 10,\\n    \\\"fuzzyRewrite\\\" : \\\"\\\",\\n    \\\"tieBreaker\\\" : 0.0,\\n    \\\"cutoffFrequency\\\" : 0.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"use_dis_max\" : false,\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder87 = null; // flaky: multiMatchQueryBuilder83.boost((float) 0L);
        float float88 = 0.0f; // flaky: multiMatchQueryBuilder87.boost();
        org.elasticsearch.index.query.QueryShardContext queryShardContext89 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query90 = multiMatchQueryBuilder87.toQuery(queryShardContext89);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}" + "'", str17, "{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder34);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder45);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder47);
        org.junit.Assert.assertTrue("'" + type48 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX + "'", type48.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX));
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + 0.0f + "'", float49 == 0.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder50);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder52);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder54);
        org.junit.Assert.assertTrue("'" + type55 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS + "'", type55.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS));
        org.junit.Assert.assertTrue("'" + type56 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type56.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder57);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder58);
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + 0.0f + "'", float59 == 0.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "multi_match" + "'", str61, "multi_match");
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder72);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder74);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder76);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder78);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "multi_match" + "'", str81, "multi_match");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "multi_match" + "'", str82, "multi_match");
// flaky:         org.junit.Assert.assertNotNull(multiMatchQueryBuilder83);
// flaky:         org.junit.Assert.assertNotNull(multiMatchQueryBuilder85);
// flaky:         org.junit.Assert.assertNotNull(multiMatchQueryBuilder87);
        org.junit.Assert.assertTrue("'" + float88 + "' != '" + 0.0f + "'", float88 == 0.0f);
    }

    @Test
    public void test16523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16523");
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
        float float43 = multiMatchQueryBuilder10.boost();
        org.elasticsearch.index.query.Operator operator44 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder10.operator(operator44);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = multiMatchQueryBuilder10.maxExpansions((int) (short) 10);
        java.lang.Object obj48 = null;
        java.lang.String[] strArray49 = new java.lang.String[] {};
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = new org.elasticsearch.index.query.MultiMatchQueryBuilder(obj48, strArray49);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder51 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder47, strArray49);
        java.lang.String[] strArray59 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder60 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray59);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder62 = multiMatchQueryBuilder60.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder64 = multiMatchQueryBuilder62.fuzzyRewrite("hi!");
        java.lang.String str65 = multiMatchQueryBuilder62.getName();
        float float66 = multiMatchQueryBuilder62.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder68 = multiMatchQueryBuilder62.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder70 = multiMatchQueryBuilder62.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type71 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type72 = type71.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type73 = type71.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder74 = multiMatchQueryBuilder62.type(type71);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder76 = multiMatchQueryBuilder62.queryName("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder78 = multiMatchQueryBuilder76.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder80 = multiMatchQueryBuilder76.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder82 = multiMatchQueryBuilder76.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"prefix_length\" : -1,\n    \"rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"multi_match^0.0\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 0.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : false,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type83 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type84 = type83.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type85 = type83.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder86 = multiMatchQueryBuilder76.type(type83);
        org.elasticsearch.index.search.MatchQuery.Type type87 = type83.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type88 = type83.matchQueryType();
        org.elasticsearch.common.ParseField parseField89 = type83.parseField();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder90 = multiMatchQueryBuilder51.type((java.lang.Object) parseField89);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertTrue("'" + type13 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX + "'", type13.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertTrue("'" + type20 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS + "'", type20.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS));
        org.junit.Assert.assertTrue("'" + type21 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type21.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder22);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder24);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder35);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder37);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder42);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 1.0f + "'", float43 == 1.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder45);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder47);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder62);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "multi_match" + "'", str65, "multi_match");
        org.junit.Assert.assertTrue("'" + float66 + "' != '" + 1.0f + "'", float66 == 1.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder68);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder70);
        org.junit.Assert.assertTrue("'" + type71 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX + "'", type71.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX));
        org.junit.Assert.assertTrue("'" + type72 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX + "'", type72.equals(org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX));
        org.junit.Assert.assertTrue("'" + type73 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX + "'", type73.equals(org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder74);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder76);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder78);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder80);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder82);
        org.junit.Assert.assertTrue("'" + type83 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS + "'", type83.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS));
        org.junit.Assert.assertTrue("'" + type84 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type84.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertTrue("'" + type85 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type85.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder86);
        org.junit.Assert.assertTrue("'" + type87 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type87.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertTrue("'" + type88 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type88.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertNotNull(parseField89);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder90);
    }

    @Test
    public void test16524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16524");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery13 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.zeroTermsQuery(zeroTermsQuery13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder16.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder16.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder16.tieBreaker((float) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder16.field("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder26.lenient(true);
        org.elasticsearch.index.query.Operator operator29 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder26.operator(operator29);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery31 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder30.zeroTermsQuery(zeroTermsQuery31);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder32.prefixLength((int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder20);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder22);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder24);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder28);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder30);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder32);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder34);
    }

    @Test
    public void test16525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16525");
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
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray31);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder32.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder34.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery37 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder36.zeroTermsQuery(zeroTermsQuery37);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder38.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery41 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder38.zeroTermsQuery(zeroTermsQuery41);
        java.lang.String str43 = multiMatchQueryBuilder38.getWriteableName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder44 = multiMatchQueryBuilder19.fuzziness((java.lang.Object) str43);
        org.elasticsearch.index.query.Operator operator45 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder46 = multiMatchQueryBuilder44.operator(operator45);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery47 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder48 = multiMatchQueryBuilder44.zeroTermsQuery(zeroTermsQuery47);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = multiMatchQueryBuilder44.rewrite("{\n  \"multi_match\" : {\n    \"query\" : \"class org.elasticsearch.index.query.MultiMatchQueryBuilder$Type\",\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"boost\" : 1.0,\n    \"_name\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzyRewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder52 = multiMatchQueryBuilder50.prefixLength((int) 'a');
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "multi_match" + "'", str17, "multi_match");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder34);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder36);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder38);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder40);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "multi_match" + "'", str43, "multi_match");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder44);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder46);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder48);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder50);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder52);
    }

    @Test
    public void test16526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16526");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        float float14 = multiMatchQueryBuilder10.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.lenient(true);
        java.lang.String str17 = null; // flaky: multiMatchQueryBuilder10.toString();
        java.lang.String str18 = null; // flaky: multiMatchQueryBuilder10.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder10.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"prefix_length\" : -1,\n    \"rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"multi_match^0.0\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 0.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : false,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.QueryValidationException queryValidationException21 = multiMatchQueryBuilder20.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder20.rewrite("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"best_fields\",\n    \"slop\" : 35,\n    \"fuzzyRewrite\" : \"\",\n    \"useDisMax\" : false,\n    \"tieBreaker\" : 0.0,\n    \"lenient\" : false,\n    \"cutoffFrequency\" : 32.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder23.field("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"slop\\\" : -1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzyRewrite\" : \"hi!\",\n    \"tieBreaker\" : 52.0,\n    \"boost\" : -1.0\n  }\n}", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder26.useDisMax(true);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "multi_match" + "'", str13, "multi_match");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}" + "'", str17, "{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}" + "'", str18, "{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder20);
        org.junit.Assert.assertNull(queryValidationException21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder28);
    }

    @Test
    public void test16527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16527");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder8.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.Operator operator13 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.operator(operator13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.maxExpansions((int) (short) 1);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray26);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder16, strArray26);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder16.field("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder16.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.Operator operator33 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder16.operator(operator33);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder16.useDisMax(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder36.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder36.slop((int) (short) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder36.prefixLength((int) 'a');
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder30);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder32);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder34);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder36);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder38);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder40);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder42);
    }

    @Test
    public void test16528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16528");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery13 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.zeroTermsQuery(zeroTermsQuery13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery17 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder14.zeroTermsQuery(zeroTermsQuery17);
        java.lang.String str19 = multiMatchQueryBuilder14.getWriteableName();
        java.lang.String str20 = null; // flaky: multiMatchQueryBuilder14.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder14.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String str23 = multiMatchQueryBuilder14.queryName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder14.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzyRewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"prefix_length\" : 97,\n    \"rewrite\" : \"multi_match\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 100.0,\n    \"lenient\" : false,\n    \"boost\" : 1.0\n  }\n}");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "multi_match" + "'", str19, "multi_match");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}" + "'", str20, "{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder25);
    }

    @Test
    public void test16529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16529");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String str11 = null; // flaky: multiMatchQueryBuilder8.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder8.boost((float) (short) 1);
        java.lang.String str14 = multiMatchQueryBuilder13.getWriteableName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder13.field("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"maxExpansions\" : 1,\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder13.prefixLength((int) '4');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder13.boost(0.0f);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray28);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery34 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.zeroTermsQuery(zeroTermsQuery34);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder37.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder37.fuzzyRewrite("hi!");
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray49);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder52 = multiMatchQueryBuilder50.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder54 = multiMatchQueryBuilder52.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type55 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float56 = type55.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder57 = multiMatchQueryBuilder52.type(type55);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder59 = multiMatchQueryBuilder52.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder61 = multiMatchQueryBuilder52.queryName("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder64 = multiMatchQueryBuilder61.field("", (float) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder65 = multiMatchQueryBuilder41.fuzziness((java.lang.Object) "");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder67 = multiMatchQueryBuilder41.maxExpansions((int) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder69 = multiMatchQueryBuilder41.cutoffFrequency((float) 100L);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery70 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder71 = multiMatchQueryBuilder41.zeroTermsQuery(zeroTermsQuery70);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder73 = multiMatchQueryBuilder41.prefixLength((int) ' ');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder75 = multiMatchQueryBuilder73.cutoffFrequency((float) (short) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder76 = null; // flaky: multiMatchQueryBuilder20.fuzziness((java.lang.Object) multiMatchQueryBuilder73);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput77 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiMatchQueryBuilder73.writeTo(streamOutput77);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"minimum_should_match\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"slop\\\" : -1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"boost\" : 1.0\n  }\n}" + "'", str11, "{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"minimum_should_match\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"slop\\\" : -1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"boost\" : 1.0\n  }\n}");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "multi_match" + "'", str14, "multi_match");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder20);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder31);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder33);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder35);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder37);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder39);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder41);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder52);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder54);
        org.junit.Assert.assertTrue("'" + type55 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX + "'", type55.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX));
        org.junit.Assert.assertTrue("'" + float56 + "' != '" + 0.0f + "'", float56 == 0.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder57);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder59);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder61);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder64);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder65);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder67);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder69);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder71);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder73);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder75);
// flaky:         org.junit.Assert.assertNotNull(multiMatchQueryBuilder76);
    }

    @Test
    public void test16530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16530");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.analyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder10.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"multi_match^0.0\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 0.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}^52.0\" ],\n    \"max_expansions\" : 1,\n    \"fuzzy_rewrite\" : \"\",\n    \"lenient\" : true,\n    \"boost\" : 1.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"best_fields\",\n    \"analyzer\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"type\\\" : \\\"phrase_prefix\\\",\\n    \\\"maxExpansions\\\" : 10,\\n    \\\"fuzzyRewrite\\\" : \\\"\\\",\\n    \\\"tieBreaker\\\" : 0.0,\\n    \\\"cutoffFrequency\\\" : 0.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String str26 = multiMatchQueryBuilder23.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder23.cutoffFrequency((float) (byte) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder23.prefixLength(10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder30.useDisMax(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder32.prefixLength(100);
        org.elasticsearch.common.io.stream.StreamInput streamInput35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder32.readFrom(streamInput35);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "multi_match" + "'", str13, "multi_match");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "multi_match" + "'", str26, "multi_match");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder28);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder30);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder32);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder34);
    }

    @Test
    public void test16531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16531");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.cutoffFrequency((float) 100L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.fuzzyRewrite("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.useDisMax(false);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray26);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.fuzzyRewrite("hi!");
        java.lang.String str32 = multiMatchQueryBuilder29.getName();
        float float33 = multiMatchQueryBuilder29.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder29.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder29.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type38 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type39 = type38.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type40 = type38.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder29.type(type38);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder29.queryName("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder43.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder48 = multiMatchQueryBuilder43.field("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0,\n    \"Name\" : \"hi!\"\n  }\n}", (float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = multiMatchQueryBuilder43.useDisMax(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder52 = multiMatchQueryBuilder43.useDisMax(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type53 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float54 = type53.tieBreaker();
        float float55 = type53.tieBreaker();
        org.elasticsearch.common.ParseField parseField56 = type53.parseField();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder57 = multiMatchQueryBuilder43.type(type53);
        org.elasticsearch.index.search.MatchQuery.Type type58 = type53.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder59 = multiMatchQueryBuilder18.type(type53);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder29);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "multi_match" + "'", str32, "multi_match");
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 1.0f + "'", float33 == 1.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder35);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder37);
        org.junit.Assert.assertTrue("'" + type38 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX + "'", type38.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX));
        org.junit.Assert.assertTrue("'" + type39 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX + "'", type39.equals(org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX));
        org.junit.Assert.assertTrue("'" + type40 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX + "'", type40.equals(org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder41);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder43);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder45);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder48);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder50);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder52);
        org.junit.Assert.assertTrue("'" + type53 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX + "'", type53.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX));
        org.junit.Assert.assertTrue("'" + float54 + "' != '" + 0.0f + "'", float54 == 0.0f);
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + 0.0f + "'", float55 == 0.0f);
        org.junit.Assert.assertNotNull(parseField56);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder57);
        org.junit.Assert.assertTrue("'" + type58 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX + "'", type58.equals(org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder59);
    }

    @Test
    public void test16532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16532");
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
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder14.prefixLength((int) (short) 100);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery46 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = multiMatchQueryBuilder14.zeroTermsQuery(zeroTermsQuery46);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder49 = multiMatchQueryBuilder47.prefixLength((int) (short) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder51 = multiMatchQueryBuilder49.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"max_expansions\" : 1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"cutoff_frequency\" : 0.0,\n    \"boost\" : 0.0\n  }\n}");
        java.lang.String str52 = multiMatchQueryBuilder49.queryName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder54 = multiMatchQueryBuilder49.maxExpansions(1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder56 = multiMatchQueryBuilder49.boost(100.0f);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder27);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder29);
        org.junit.Assert.assertTrue("'" + type30 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX + "'", type30.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX));
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.0f + "'", float31 == 0.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder32);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder34);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder36);
        org.junit.Assert.assertTrue("'" + type37 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS + "'", type37.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS));
        org.junit.Assert.assertTrue("'" + type38 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type38.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder39);
        org.junit.Assert.assertTrue("'" + type40 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type40.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder41);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder43);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder45);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder47);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder49);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder51);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder54);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder56);
    }

    @Test
    public void test16533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16533");
        java.lang.Object obj0 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray8);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.fuzzyRewrite("hi!");
        java.lang.String str14 = multiMatchQueryBuilder11.getName();
        float float15 = multiMatchQueryBuilder11.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder11.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder11.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type20 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type21 = type20.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type22 = type20.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder11.type(type20);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery24 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.zeroTermsQuery(zeroTermsQuery24);
        java.lang.Object obj26 = null;
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray34);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder37.fuzzyRewrite("hi!");
        java.lang.String str40 = multiMatchQueryBuilder37.getName();
        float float41 = multiMatchQueryBuilder37.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder37.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder37.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = multiMatchQueryBuilder37.cutoffFrequency((float) (-1L));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder49 = multiMatchQueryBuilder37.useDisMax(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder51 = multiMatchQueryBuilder37.cutoffFrequency((float) (short) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder53 = multiMatchQueryBuilder37.cutoffFrequency((float) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder55 = multiMatchQueryBuilder37.slop((int) (byte) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type56 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float57 = type56.tieBreaker();
        float float58 = type56.tieBreaker();
        org.elasticsearch.index.search.MatchQuery.Type type59 = type56.matchQueryType();
        java.lang.String[] strArray67 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder68 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray67);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder70 = multiMatchQueryBuilder68.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder72 = multiMatchQueryBuilder68.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.Operator operator73 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder74 = multiMatchQueryBuilder72.operator(operator73);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder76 = multiMatchQueryBuilder74.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder78 = multiMatchQueryBuilder76.maxExpansions((int) (short) 1);
        java.lang.String[] strArray86 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder87 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray86);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder88 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder76, strArray86);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder89 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) type56, strArray86);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder90 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (byte) 10, strArray86);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder91 = new org.elasticsearch.index.query.MultiMatchQueryBuilder(obj26, strArray86);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder92 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder23, strArray86);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder93 = new org.elasticsearch.index.query.MultiMatchQueryBuilder(obj0, strArray86);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder95 = multiMatchQueryBuilder93.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"multi_match^0.0\" ],\n    \"type\" : \"phrase_prefix\",\n    \"prefix_length\" : 97,\n    \"fuzzy_rewrite\" : \"\",\n    \"tie_breaker\" : 0.0,\n    \"boost\" : 1.0\n  }\n}");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "multi_match" + "'", str14, "multi_match");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertTrue("'" + type20 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX + "'", type20.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX));
        org.junit.Assert.assertTrue("'" + type21 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX + "'", type21.equals(org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX));
        org.junit.Assert.assertTrue("'" + type22 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX + "'", type22.equals(org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder25);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder37);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "multi_match" + "'", str40, "multi_match");
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 1.0f + "'", float41 == 1.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder43);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder45);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder47);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder49);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder51);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder53);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder55);
        org.junit.Assert.assertTrue("'" + type56 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX + "'", type56.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX));
        org.junit.Assert.assertTrue("'" + float57 + "' != '" + 0.0f + "'", float57 == 0.0f);
        org.junit.Assert.assertTrue("'" + float58 + "' != '" + 0.0f + "'", float58 == 0.0f);
        org.junit.Assert.assertTrue("'" + type59 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX + "'", type59.equals(org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX));
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder70);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder72);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder74);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder76);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder78);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder95);
    }

    @Test
    public void test16534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16534");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder8.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.Operator operator13 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.operator(operator13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder12.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}", 10.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder12.field("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}", 0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.prefixLength((int) ' ');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder20.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"rewrite\" : \"\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : false,\n    \"boost\" : 1.0\n  }\n}");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder20);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder22);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder24);
    }

    @Test
    public void test16535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16535");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder12.prefixLength((int) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder12.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"slop\\\" : -1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 52.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder12.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"cross_fields\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 32.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder12.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder12.field("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"best_fields\",\n    \"analyzer\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"type\\\" : \\\"phrase_prefix\\\",\\n    \\\"maxExpansions\\\" : 10,\\n    \\\"fuzzyRewrite\\\" : \\\"\\\",\\n    \\\"tieBreaker\\\" : 0.0,\\n    \\\"cutoffFrequency\\\" : 0.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzyRewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery25 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder12.zeroTermsQuery(zeroTermsQuery25);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder26.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"max_expansions\" : 1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"use_dis_max\" : true,\n    \"lenient\" : true,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0,\n    \"_name\" : \"\"\n  }\n}");
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray36);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder37.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder39.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder39.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder43.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = multiMatchQueryBuilder43.tieBreaker((float) '4');
        float float48 = multiMatchQueryBuilder43.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder49 = multiMatchQueryBuilder26.fuzziness((java.lang.Object) float48);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder20);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder22);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder24);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder28);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder39);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder41);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder43);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder45);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder47);
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + 1.0f + "'", float48 == 1.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder49);
    }

    @Test
    public void test16536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16536");
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type2 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.parse("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"fuzzy_rewrite\" : \"\",\n    \"tie_breaker\" : 0.0,\n    \"boost\" : 1.0\n  }\n}", parseFieldMatcher1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16537");
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
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder24.queryName("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"multi_match\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}^10.0\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\" ],\n    \"maxExpansions\" : 10,\n    \"fuzzyRewrite\" : \"\",\n    \"boost\" : 1.0,\n    \"Name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder28.boost(1.0f);
        org.elasticsearch.common.io.stream.StreamInput streamInput31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder28.readFrom(streamInput31);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertTrue("'" + type13 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX + "'", type13.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder24);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder28);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder30);
    }

    @Test
    public void test16538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16538");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.rewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.prefixLength((int) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.tieBreaker(1.0f);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray29);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder30.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder30.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.Operator operator35 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder34.operator(operator35);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder36.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder38.maxExpansions((int) (short) 1);
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder49 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray48);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder38, strArray48);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder52 = multiMatchQueryBuilder38.field("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder54 = multiMatchQueryBuilder38.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.Operator operator55 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder56 = multiMatchQueryBuilder38.operator(operator55);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder58 = multiMatchQueryBuilder56.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"multi_match\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}^10.0\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\" ],\n    \"max_expansions\" : 10,\n    \"fuzzy_rewrite\" : \"\",\n    \"boost\" : 1.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        java.lang.String str59 = multiMatchQueryBuilder58.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder61 = multiMatchQueryBuilder58.minimumShouldMatch("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"fuzzyRewrite\" : \"hi!\",\n    \"tieBreaker\" : 100.0,\n    \"boost\" : 0.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder62 = multiMatchQueryBuilder19.fuzziness((java.lang.Object) "{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"fuzzyRewrite\" : \"hi!\",\n    \"tieBreaker\" : 100.0,\n    \"boost\" : 0.0\n  }\n}");
        java.lang.Class<?> wildcardClass63 = multiMatchQueryBuilder62.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "multi_match" + "'", str13, "multi_match");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder32);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder34);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder36);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder38);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder40);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder52);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder54);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder56);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "multi_match" + "'", str59, "multi_match");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder61);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder62);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test16539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16539");
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
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder10.useDisMax(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder10.slop((int) (short) 1);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "multi_match" + "'", str13, "multi_match");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder30);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder32);
    }

    @Test
    public void test16540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16540");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.rewrite("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder14.maxExpansions((int) (byte) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder14.rewrite("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : 100,\n    \"fuzzyRewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"boost\" : 1.0\n  }\n}");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder20);
    }

    @Test
    public void test16541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16541");
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
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder28.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.Operator operator33 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder32.operator(operator33);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder34.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder36.maxExpansions((int) (short) 1);
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray46);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder48 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder36, strArray46);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = multiMatchQueryBuilder36.boost((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder51 = null; // flaky: multiMatchQueryBuilder18.fuzziness((java.lang.Object) multiMatchQueryBuilder36);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery52 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder53 = multiMatchQueryBuilder18.zeroTermsQuery(zeroTermsQuery52);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder55 = multiMatchQueryBuilder18.lenient(false);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery56 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder57 = multiMatchQueryBuilder18.zeroTermsQuery(zeroTermsQuery56);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder59 = multiMatchQueryBuilder18.tieBreaker((float) (byte) 0);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder30);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder32);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder34);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder36);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder38);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder50);
// flaky:         org.junit.Assert.assertNotNull(multiMatchQueryBuilder51);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder53);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder55);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder57);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder59);
    }

    @Test
    public void test16542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16542");
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type0 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float1 = type0.tieBreaker();
        java.lang.Class<?> wildcardClass2 = type0.getClass();
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray10);
        java.lang.Object obj12 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray21);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 10.0f, strArray21);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = new org.elasticsearch.index.query.MultiMatchQueryBuilder(obj12, strArray21);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray21);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) wildcardClass2, strArray21);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder26.cutoffFrequency((float) 1L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder26.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"max_expansions\" : 10,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"use_dis_max\" : true,\n    \"tie_breaker\" : 35.0,\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder30.cutoffFrequency((float) 100L);
        org.elasticsearch.common.io.stream.StreamInput streamInput33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder32.readFrom(streamInput33);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX + "'", type0.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder28);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder30);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder32);
    }

    @Test
    public void test16543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16543");
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
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder28.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.Operator operator33 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder32.operator(operator33);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder34.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder36.maxExpansions((int) (short) 1);
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray46);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder48 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder36, strArray46);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = multiMatchQueryBuilder36.boost((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder51 = null; // flaky: multiMatchQueryBuilder18.fuzziness((java.lang.Object) multiMatchQueryBuilder36);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery52 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder53 = multiMatchQueryBuilder18.zeroTermsQuery(zeroTermsQuery52);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder55 = multiMatchQueryBuilder53.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder57 = multiMatchQueryBuilder55.queryName("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.QueryShardContext queryShardContext58 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query59 = multiMatchQueryBuilder57.toFilter(queryShardContext58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder30);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder32);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder34);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder36);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder38);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder50);
// flaky:         org.junit.Assert.assertNotNull(multiMatchQueryBuilder51);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder53);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder55);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder57);
    }

    @Test
    public void test16544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16544");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery13 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.zeroTermsQuery(zeroTermsQuery13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery17 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder14.zeroTermsQuery(zeroTermsQuery17);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray26);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery32 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.zeroTermsQuery(zeroTermsQuery32);
        java.lang.String str34 = multiMatchQueryBuilder33.getName();
        boolean boolean35 = multiMatchQueryBuilder18.equals((java.lang.Object) multiMatchQueryBuilder33);
        java.lang.String str36 = multiMatchQueryBuilder33.getWriteableName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder33.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder33.lenient(false);
        java.lang.String str41 = multiMatchQueryBuilder40.queryName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder40.minimumShouldMatch("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"maxExpansions\" : 10,\n    \"fuzzyRewrite\" : \"\",\n    \"tieBreaker\" : 0.0,\n    \"cutoffFrequency\" : 0.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder40.cutoffFrequency((float) (byte) -1);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery46 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = multiMatchQueryBuilder45.zeroTermsQuery(zeroTermsQuery46);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder49 = multiMatchQueryBuilder47.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder51 = multiMatchQueryBuilder47.useDisMax(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder53 = multiMatchQueryBuilder47.slop(1);
        org.elasticsearch.index.query.QueryShardContext queryShardContext54 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query55 = multiMatchQueryBuilder53.toQuery(queryShardContext54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder29);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder31);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "multi_match" + "'", str34, "multi_match");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "multi_match" + "'", str36, "multi_match");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder38);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder43);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder45);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder47);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder49);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder51);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder53);
    }

    @Test
    public void test16545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16545");
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
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder21.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder21.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"best_fields\",\n    \"analyzer\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"type\\\" : \\\"phrase_prefix\\\",\\n    \\\"maxExpansions\\\" : 10,\\n    \\\"fuzzyRewrite\\\" : \\\"\\\",\\n    \\\"tieBreaker\\\" : 0.0,\\n    \\\"cutoffFrequency\\\" : 0.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "multi_match" + "'", str17, "multi_match");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
        org.junit.Assert.assertTrue("'" + type24 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS + "'", type24.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS));
        org.junit.Assert.assertNotNull(parseField25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "multi_match" + "'", str27, "multi_match");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder29);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder31);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder33);
    }

    @Test
    public void test16546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16546");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder8.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.Operator operator13 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.operator(operator13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder12.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}", 10.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery20 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.zeroTermsQuery(zeroTermsQuery20);
        org.elasticsearch.index.query.Operator operator22 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.operator(operator22);
        java.lang.String str24 = multiMatchQueryBuilder23.getWriteableName();
        org.elasticsearch.index.query.Operator operator25 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder23.operator(operator25);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder23.maxExpansions(10);
        java.lang.String str29 = null; // flaky: multiMatchQueryBuilder28.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder28.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : 0,\n    \"prefix_length\" : 0,\n    \"rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"multi_match\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : false,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.queryName("");
        java.lang.String str34 = multiMatchQueryBuilder33.getWriteableName();
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery35 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder33.zeroTermsQuery(zeroTermsQuery35);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder33.boost((float) (byte) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder33.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"max_expansions\" : 10,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"use_dis_max\" : true,\n    \"lenient\" : true,\n    \"cutoff_frequency\" : 0.0,\n    \"boost\" : 1.0,\n    \"_name\" : \"\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder40.useDisMax(false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "multi_match" + "'", str24, "multi_match");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder28);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"multi_match\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}^10.0\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\" ],\n    \"max_expansions\" : 10,\n    \"fuzzy_rewrite\" : \"\",\n    \"boost\" : 1.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\"\n  }\n}" + "'", str29, "{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"multi_match\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}^10.0\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\" ],\n    \"max_expansions\" : 10,\n    \"fuzzy_rewrite\" : \"\",\n    \"boost\" : 1.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder31);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "multi_match" + "'", str34, "multi_match");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder36);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder38);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder40);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder42);
    }

    @Test
    public void test16547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16547");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder8.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.Operator operator13 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.operator(operator13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder14.boost((float) 'a');
        org.elasticsearch.common.io.stream.StreamOutput streamOutput19 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiMatchQueryBuilder18.writeTo(streamOutput19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
    }

    @Test
    public void test16548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16548");
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type2 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.parse("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"max_expansions\" : 1,\n    \"minimum_should_match\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"slop\\\" : 0,\\n    \\\"prefix_length\\\" : 0,\\n    \\\"rewrite\\\" : \\\"{\\\\n  \\\\\\\"multi_match\\\\\\\" : {\\\\n    \\\\\\\"query\\\\\\\" : 0.0,\\\\n    \\\\\\\"fields\\\\\\\" : [ \\\\\\\"hi!\\\\\\\", \\\\\\\"\\\\\\\", \\\\\\\"\\\\\\\", \\\\\\\"\\\\\\\", \\\\\\\"\\\\\\\", \\\\\\\"\\\\\\\" ],\\\\n    \\\\\\\"analyzer\\\\\\\" : \\\\\\\"multi_match\\\\\\\",\\\\n    \\\\\\\"fuzzy_rewrite\\\\\\\" : \\\\\\\"hi!\\\\\\\",\\\\n    \\\\\\\"boost\\\\\\\" : 1.0\\\\n  }\\\\n}\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : false,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}", parseFieldMatcher1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16549");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery13 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.zeroTermsQuery(zeroTermsQuery13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery17 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder14.zeroTermsQuery(zeroTermsQuery17);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray26);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery32 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.zeroTermsQuery(zeroTermsQuery32);
        java.lang.String str34 = multiMatchQueryBuilder33.getName();
        boolean boolean35 = multiMatchQueryBuilder18.equals((java.lang.Object) multiMatchQueryBuilder33);
        java.lang.String str36 = multiMatchQueryBuilder33.getWriteableName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder33.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder33.field("");
        java.lang.String str41 = multiMatchQueryBuilder33.queryName();
        org.elasticsearch.index.query.Operator operator42 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder33.operator(operator42);
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder52 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray51);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder54 = multiMatchQueryBuilder52.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder56 = multiMatchQueryBuilder54.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder58 = multiMatchQueryBuilder56.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder60 = multiMatchQueryBuilder56.prefixLength((int) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder62 = multiMatchQueryBuilder56.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"slop\\\" : -1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 52.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.QueryValidationException queryValidationException63 = multiMatchQueryBuilder62.validate();
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery64 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder65 = multiMatchQueryBuilder62.zeroTermsQuery(zeroTermsQuery64);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder67 = multiMatchQueryBuilder65.tieBreaker((float) ' ');
        boolean boolean68 = multiMatchQueryBuilder33.equals((java.lang.Object) ' ');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder70 = multiMatchQueryBuilder33.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"max_expansions\" : 1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"use_dis_max\" : true,\n    \"boost\" : 0.0\n  }\n}");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder29);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder31);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "multi_match" + "'", str34, "multi_match");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "multi_match" + "'", str36, "multi_match");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder38);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder43);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder54);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder56);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder58);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder60);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder62);
        org.junit.Assert.assertNull(queryValidationException63);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder65);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder70);
    }

    @Test
    public void test16550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16550");
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
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder14.analyzer("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"maxExpansions\" : 10,\n    \"fuzzyRewrite\" : \"\",\n    \"tieBreaker\" : 0.0,\n    \"cutoffFrequency\" : 0.0,\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String str46 = multiMatchQueryBuilder14.getName();
        java.lang.String str47 = multiMatchQueryBuilder14.queryName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder49 = multiMatchQueryBuilder14.fuzzyRewrite("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"slop\\\" : -1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"max_expansions\\\" : 1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\" ],\n    \"analyzer\" : \"\",\n    \"fuzzyRewrite\" : \"\",\n    \"tieBreaker\" : 0.0,\n    \"cutoffFrequency\" : 0.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder51 = multiMatchQueryBuilder49.minimumShouldMatch("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"slop\\\" : -1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"boost\" : 1.0,\n    \"Name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder53 = multiMatchQueryBuilder51.fuzzyRewrite("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"minimumShouldMatch\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"slop\\\" : -1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.common.io.stream.StreamInput streamInput54 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder55 = multiMatchQueryBuilder53.readFrom(streamInput54);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder27);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder29);
        org.junit.Assert.assertTrue("'" + type30 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX + "'", type30.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX));
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.0f + "'", float31 == 0.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder32);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder34);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder36);
        org.junit.Assert.assertTrue("'" + type37 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS + "'", type37.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS));
        org.junit.Assert.assertTrue("'" + type38 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type38.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder39);
        org.junit.Assert.assertTrue("'" + type40 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type40.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder41);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder43);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "multi_match" + "'", str46, "multi_match");
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder49);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder51);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder53);
    }

    @Test
    public void test16551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16551");
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
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.lenient(true);
        java.lang.String str25 = multiMatchQueryBuilder22.getName();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder26 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params27 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            multiMatchQueryBuilder22.doXContent(xContentBuilder26, params27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertTrue("'" + type13 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX + "'", type13.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertTrue("'" + type20 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX + "'", type20.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX));
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.0f + "'", float21 == 0.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder22);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "multi_match" + "'", str25, "multi_match");
        org.junit.Assert.assertNotNull(params27);
    }

    @Test
    public void test16552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16552");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery13 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.zeroTermsQuery(zeroTermsQuery13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder18.analyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder18.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}", 0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder18.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder18.tieBreaker((float) (-1L));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.tieBreaker((float) (short) -1);
        org.elasticsearch.index.query.Operator operator30 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.operator(operator30);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.tieBreaker((-1.0f));
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder34 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params35 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder36 = multiMatchQueryBuilder31.toXContent(xContentBuilder34, params35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder20);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder25);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder27);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder29);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder31);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder33);
        org.junit.Assert.assertNotNull(params35);
    }

    @Test
    public void test16553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16553");
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
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder19.prefixLength((int) (byte) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder19.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type28 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS;
        float float29 = type28.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder19.type(type28);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder30.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : 100,\n    \"fuzzy_rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"boost\" : 1.0\n  }\n}");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "multi_match" + "'", str17, "multi_match");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder25);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder27);
        org.junit.Assert.assertTrue("'" + type28 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS + "'", type28.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS));
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder30);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder32);
    }

    @Test
    public void test16554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16554");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.prefixLength(1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.prefixLength((int) ' ');
        org.elasticsearch.index.query.QueryValidationException queryValidationException18 = multiMatchQueryBuilder10.validate();
        org.elasticsearch.index.query.QueryShardContext queryShardContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query20 = multiMatchQueryBuilder10.toFilter(queryShardContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "multi_match" + "'", str13, "multi_match");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNull(queryValidationException18);
    }

    @Test
    public void test16555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16555");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery13 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.zeroTermsQuery(zeroTermsQuery13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.queryName("hi!");
        java.lang.String str19 = multiMatchQueryBuilder16.queryName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder16.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String str22 = multiMatchQueryBuilder16.getWriteableName();
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery23 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder16.zeroTermsQuery(zeroTermsQuery23);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.boost(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder24.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"rewrite\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzyRewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 10.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray36);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder37.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder39.fuzzyRewrite("hi!");
        java.lang.String str42 = multiMatchQueryBuilder39.getName();
        float float43 = multiMatchQueryBuilder39.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder39.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = multiMatchQueryBuilder39.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type48 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type49 = type48.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type50 = type48.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder51 = multiMatchQueryBuilder39.type(type48);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder53 = multiMatchQueryBuilder39.queryName("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder55 = multiMatchQueryBuilder53.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder57 = multiMatchQueryBuilder53.lenient(true);
        java.lang.String[] strArray65 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder66 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray65);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder68 = multiMatchQueryBuilder66.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder70 = multiMatchQueryBuilder68.fuzzyRewrite("hi!");
        java.lang.String str71 = multiMatchQueryBuilder68.getName();
        float float72 = multiMatchQueryBuilder68.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder74 = multiMatchQueryBuilder68.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder76 = multiMatchQueryBuilder68.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder78 = multiMatchQueryBuilder68.cutoffFrequency((float) (-1L));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder79 = multiMatchQueryBuilder53.fuzziness((java.lang.Object) (-1L));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder81 = multiMatchQueryBuilder79.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"multi_match\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}^10.0\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\" ],\n    \"max_expansions\" : 10,\n    \"fuzzy_rewrite\" : \"\",\n    \"boost\" : 1.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.index.query.Operator operator82 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder83 = multiMatchQueryBuilder79.operator(operator82);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder85 = multiMatchQueryBuilder79.useDisMax(true);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder86 = null; // flaky: multiMatchQueryBuilder24.type((java.lang.Object) multiMatchQueryBuilder85);
// flaky:             org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: failed to parse [multi_match] query type [{?  \"multi_match\" : {?    \"query\" : 0.0,?    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"{\\\\n  \\\\\\\"multi_match\\\\\\\" : {\\\\n    \\\\\\\"query\\\\\\\" : 0.0,\\\\n    \\\\\\\"fields\\\\\\\" : [ \\\\\\\"hi!\\\\\\\", \\\\\\\"\\\\\\\", \\\\\\\"\\\\\\\", \\\\\\\"\\\\\\\", \\\\\\\"\\\\\\\", \\\\\\\"\\\\\\\" ],\\\\n    \\\\\\\"analyzer\\\\\\\" : \\\\\\\"multi_match\\\\\\\",\\\\n    \\\\\\\"fuzzy_rewrite\\\\\\\" : \\\\\\\"hi!\\\\\\\",\\\\n    \\\\\\\"boost\\\\\\\" : 1.0\\\\n  }\\\\n}^10.0\\\", \\\"{\\\\n  \\\\\\\"multi_match\\\\\\\" : {\\\\n    \\\\\\\"query\\\\\\\" : 0.0,\\\\n    \\\\\\\"fields\\\\\\\" : [ \\\\\\\"hi!\\\\\\\", \\\\\\\"\\\\\\\", \\\\\\\"\\\\\\\", \\\\\\\"\\\\\\\", \\\\\\\"\\\\\\\", \\\\\\\"\\\\\\\" ],\\\\n    \\\\\\\"fuzzy_rewrite\\\\\\\" : \\\\\\\"hi!\\\\\\\",\\\\n    \\\\\\\"boost\\\\\\\" : 1.0\\\\n  }\\\\n}\\\" ],\\n    \\\"max_expansions\\\" : 10,\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\",\\n    \\\"boost\\\" : 1.0,\\n    \\\"_name\\\" : \\\"{\\\\n  \\\\\\\"multi_match\\\\\\\" : {\\\\n    \\\\\\\"query\\\\\\\" : 0.0,\\\\n    \\\\\\\"fields\\\\\\\" : [ \\\\\\\"hi!\\\\\\\", \\\\\\\"\\\\\\\", \\\\\\\"\\\\\\\", \\\\\\\"\\\\\\\", \\\\\\\"\\\\\\\", \\\\\\\"\\\\\\\" ],\\\\n    \\\\\\\"fuzzy_rewrite\\\\\\\" : \\\\\\\"hi!\\\\\\\",\\\\n    \\\\\\\"boost\\\\\\\" : 1.0\\\\n  }\\\\n}\\\"\\n  }\\n}\" ],?    \"type\" : \"phrase_prefix\",?    \"slop\" : -1,?    \"fuzziness\" : \"-1\",?    \"minimum_should_match\" : \"hi!\",?    \"fuzzy_rewrite\" : \"hi!\",?    \"use_dis_max\" : true,?    \"lenient\" : true,?    \"boost\" : 1.0,?    \"_name\" : \"multi_match\"?  }?}]. unknown type.");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "multi_match" + "'", str22, "multi_match");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder24);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder28);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder39);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "multi_match" + "'", str42, "multi_match");
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 1.0f + "'", float43 == 1.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder45);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder47);
        org.junit.Assert.assertTrue("'" + type48 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX + "'", type48.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX));
        org.junit.Assert.assertTrue("'" + type49 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX + "'", type49.equals(org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX));
        org.junit.Assert.assertTrue("'" + type50 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX + "'", type50.equals(org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder51);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder53);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder55);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder57);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder68);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "multi_match" + "'", str71, "multi_match");
        org.junit.Assert.assertTrue("'" + float72 + "' != '" + 1.0f + "'", float72 == 1.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder74);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder76);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder78);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder79);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder81);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder83);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder85);
    }

    @Test
    public void test16556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16556");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder8.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.Operator operator13 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.operator(operator13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder16.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0,\n    \"_name\" : \"hi!\"\n  }\n}", (float) 10L);
        java.lang.String str20 = multiMatchQueryBuilder19.getWriteableName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder19.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type23 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type24 = type23.matchQueryType();
        org.elasticsearch.common.ParseField parseField25 = type23.parseField();
        org.elasticsearch.common.ParseField parseField26 = type23.parseField();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder22.fuzziness((java.lang.Object) parseField26);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder22.rewrite("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"fuzzyRewrite\" : \"\",\n    \"tieBreaker\" : 0.0,\n    \"cutoffFrequency\" : 0.0,\n    \"boost\" : 32.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.analyzer("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"type\\\" : \\\"phrase_prefix\\\",\\n    \\\"max_expansions\\\" : 10,\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\",\\n    \\\"tie_breaker\\\" : 0.0,\\n    \\\"cutoff_frequency\\\" : 0.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"slop\" : -1,\n    \"fuzzyRewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"multi_match\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"lenient\" : true,\n    \"cutoffFrequency\" : 10.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.maxExpansions(0);
        java.lang.Class<?> wildcardClass34 = multiMatchQueryBuilder31.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "multi_match" + "'", str20, "multi_match");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder22);
        org.junit.Assert.assertTrue("'" + type23 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX + "'", type23.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX));
        org.junit.Assert.assertTrue("'" + type24 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX + "'", type24.equals(org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX));
        org.junit.Assert.assertNotNull(parseField25);
        org.junit.Assert.assertNotNull(parseField26);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder27);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder29);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder31);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test16557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16557");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.analyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.cutoffFrequency((float) (short) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.minimumShouldMatch("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray27);
        java.lang.Object obj29 = null;
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray38);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 10.0f, strArray38);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = new org.elasticsearch.index.query.MultiMatchQueryBuilder(obj29, strArray38);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray38);
        org.elasticsearch.index.query.Operator operator43 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder44 = multiMatchQueryBuilder42.operator(operator43);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder46 = multiMatchQueryBuilder44.cutoffFrequency((float) (-1L));
        boolean boolean47 = multiMatchQueryBuilder19.equals((java.lang.Object) multiMatchQueryBuilder44);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder49 = multiMatchQueryBuilder19.analyzer("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"multi_match\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"maxExpansions\" : 10,\n    \"fuzzyRewrite\" : \"\",\n    \"tieBreaker\" : 0.0,\n    \"lenient\" : false,\n    \"cutoffFrequency\" : 0.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.Operator operator50 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder51 = multiMatchQueryBuilder19.operator(operator50);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "multi_match" + "'", str13, "multi_match");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder44);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder49);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder51);
    }

    @Test
    public void test16558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16558");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.minimumShouldMatch("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.maxExpansions(0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder18.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : 0,\n    \"prefix_length\" : 0,\n    \"rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"multi_match\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : false,\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String str21 = multiMatchQueryBuilder20.getWriteableName();
        org.elasticsearch.index.query.Operator operator22 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder20.operator(operator22);
        org.elasticsearch.common.xcontent.XContentType xContentType24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.bytes.BytesReference bytesReference25 = multiMatchQueryBuilder20.buildAsBytes(xContentType24);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchException; message: Failed to build ToXContent");
        } catch (org.elasticsearch.ElasticsearchException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "multi_match" + "'", str21, "multi_match");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
    }

    @Test
    public void test16559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16559");
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
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"max_expansions\" : 10,\n    \"fuzzy_rewrite\" : \"\",\n    \"tie_breaker\" : 0.0,\n    \"cutoff_frequency\" : 0.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder29.analyzer("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String str34 = multiMatchQueryBuilder29.getWriteableName();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "multi_match" + "'", str13, "multi_match");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertTrue("'" + type19 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX + "'", type19.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX));
        org.junit.Assert.assertTrue("'" + type20 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX + "'", type20.equals(org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX));
        org.junit.Assert.assertTrue("'" + type21 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX + "'", type21.equals(org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder22);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder24);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 1.0f + "'", float27 == 1.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder29);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder31);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "multi_match" + "'", str34, "multi_match");
    }

    @Test
    public void test16560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16560");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder8.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.Operator operator13 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.operator(operator13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.maxExpansions((int) (short) 1);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray26);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder16, strArray26);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder16.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery31 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder16.zeroTermsQuery(zeroTermsQuery31);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder32.tieBreaker((float) (byte) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder32.minimumShouldMatch("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"\",\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String str37 = multiMatchQueryBuilder32.getName();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder30);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder32);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder34);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "multi_match" + "'", str37, "multi_match");
    }

    @Test
    public void test16561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16561");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder8.cutoffFrequency((float) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder8.boost((float) 100);
        org.elasticsearch.index.query.Operator operator15 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.operator(operator15);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.boost((float) (byte) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder16.queryName("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"slop\\\" : -1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzyRewrite\" : \"hi!\",\n    \"tieBreaker\" : 52.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type21 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float22 = type21.tieBreaker();
        org.elasticsearch.common.ParseField parseField23 = type21.parseField();
        org.elasticsearch.index.search.MatchQuery.Type type24 = type21.matchQueryType();
        org.elasticsearch.common.ParseField parseField25 = type21.parseField();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder20.type((java.lang.Object) type21);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder20.rewrite("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"maxExpansions\" : 0,\n    \"fuzzyRewrite\" : \"\",\n    \"tieBreaker\" : 0.0,\n    \"lenient\" : false,\n    \"cutoffFrequency\" : 52.0,\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray36);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder37.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder39.fuzzyRewrite("hi!");
        java.lang.String str42 = multiMatchQueryBuilder39.getName();
        float float43 = multiMatchQueryBuilder39.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder39.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = multiMatchQueryBuilder39.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder49 = multiMatchQueryBuilder47.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder51 = multiMatchQueryBuilder47.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"multi_match\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}^10.0\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\" ],\n    \"max_expansions\" : 10,\n    \"fuzzy_rewrite\" : \"\",\n    \"boost\" : 1.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.index.query.QueryValidationException queryValidationException52 = multiMatchQueryBuilder47.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder54 = multiMatchQueryBuilder47.analyzer("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"{\\\\n  \\\\\\\"multi_match\\\\\\\" : {\\\\n    \\\\\\\"query\\\\\\\" : 0.0,\\\\n    \\\\\\\"fields\\\\\\\" : [ \\\\\\\"hi!\\\\\\\", \\\\\\\"\\\\\\\", \\\\\\\"\\\\\\\", \\\\\\\"\\\\\\\", \\\\\\\"\\\\\\\", \\\\\\\"\\\\\\\" ],\\\\n    \\\\\\\"slop\\\\\\\" : -1,\\\\n    \\\\\\\"fuzzy_rewrite\\\\\\\" : \\\\\\\"hi!\\\\\\\",\\\\n    \\\\\\\"lenient\\\\\\\" : true,\\\\n    \\\\\\\"boost\\\\\\\" : 1.0\\\\n  }\\\\n}\\\",\\n    \\\"boost\\\" : 1.0,\\n    \\\"_name\\\" : \\\"hi!\\\"\\n  }\\n}\" ],\n    \"analyzer\" : \"multi_match\",\n    \"fuzzyRewrite\" : \"hi!\",\n    \"useDisMax\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder56 = multiMatchQueryBuilder47.field("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"type\\\" : \\\"phrase_prefix\\\",\\n    \\\"maxExpansions\\\" : 10,\\n    \\\"fuzzyRewrite\\\" : \\\"\\\",\\n    \\\"tieBreaker\\\" : 0.0,\\n    \\\"cutoffFrequency\\\" : 0.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}^1.0\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"cutoffFrequency\" : 10.0,\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String[] strArray64 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder65 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray64);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder67 = multiMatchQueryBuilder65.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder69 = multiMatchQueryBuilder67.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type70 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float71 = type70.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder72 = multiMatchQueryBuilder67.type(type70);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder74 = multiMatchQueryBuilder67.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder76 = multiMatchQueryBuilder67.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type77 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float78 = type77.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder79 = multiMatchQueryBuilder76.type(type77);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder81 = multiMatchQueryBuilder79.maxExpansions((int) (short) -1);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery82 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder83 = multiMatchQueryBuilder79.zeroTermsQuery(zeroTermsQuery82);
        java.lang.String[] strArray87 = new java.lang.String[] { "{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"prefix_length\" : -1,\n    \"rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"multi_match^0.0\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 0.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : false,\n    \"boost\" : 1.0\n  }\n}", "{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"slop\\\" : -1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\" ],\n    \"analyzer\" : \"\",\n    \"max_expansions\" : 0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}", "{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"cutoffFrequency\" : 0.0,\n    \"boost\" : 0.0\n  }\n}" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder88 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder83, strArray87);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder89 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder47, strArray87);
        boolean boolean90 = multiMatchQueryBuilder20.equals((java.lang.Object) multiMatchQueryBuilder89);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder20);
        org.junit.Assert.assertTrue("'" + type21 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX + "'", type21.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX));
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertNotNull(parseField23);
        org.junit.Assert.assertTrue("'" + type24 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX + "'", type24.equals(org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX));
        org.junit.Assert.assertNotNull(parseField25);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder28);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder39);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "multi_match" + "'", str42, "multi_match");
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 1.0f + "'", float43 == 1.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder45);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder47);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder49);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder51);
        org.junit.Assert.assertNull(queryValidationException52);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder54);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder56);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder67);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder69);
        org.junit.Assert.assertTrue("'" + type70 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX + "'", type70.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX));
        org.junit.Assert.assertTrue("'" + float71 + "' != '" + 0.0f + "'", float71 == 0.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder72);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder74);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder76);
        org.junit.Assert.assertTrue("'" + type77 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX + "'", type77.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX));
        org.junit.Assert.assertTrue("'" + float78 + "' != '" + 0.0f + "'", float78 == 0.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder79);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder81);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder83);
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test16562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16562");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        float float14 = multiMatchQueryBuilder10.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.slop((int) (short) -1);
        java.lang.String str19 = multiMatchQueryBuilder10.queryName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder10.prefixLength((int) (byte) 0);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray29);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder30.fuzzyRewrite("");
        java.lang.String str33 = multiMatchQueryBuilder32.getWriteableName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder32.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"^32.0\", \"^32.0\", \"^32.0\", \"^32.0\", \"^32.0\", \"^32.0\" ],\n    \"minimum_should_match\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0,\n    \"_name\" : \"\"\n  }\n}", (float) (short) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = null; // flaky: multiMatchQueryBuilder21.fuzziness((java.lang.Object) multiMatchQueryBuilder36);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "multi_match" + "'", str13, "multi_match");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "multi_match" + "'", str33, "multi_match");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder36);
// flaky:         org.junit.Assert.assertNotNull(multiMatchQueryBuilder37);
    }

    @Test
    public void test16563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16563");
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
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery70 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder71 = multiMatchQueryBuilder10.zeroTermsQuery(zeroTermsQuery70);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery72 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder73 = multiMatchQueryBuilder71.zeroTermsQuery(zeroTermsQuery72);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder75 = multiMatchQueryBuilder71.maxExpansions((int) (short) 1);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertTrue("'" + type13 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX + "'", type13.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertTrue("'" + type20 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS + "'", type20.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS));
        org.junit.Assert.assertTrue("'" + type21 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type21.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder22);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder24);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder35);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder37);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder42);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder53);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder55);
        org.junit.Assert.assertTrue("'" + type56 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX + "'", type56.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX));
        org.junit.Assert.assertTrue("'" + float57 + "' != '" + 0.0f + "'", float57 == 0.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder58);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder60);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder62);
        org.junit.Assert.assertTrue("'" + type63 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS + "'", type63.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS));
        org.junit.Assert.assertTrue("'" + type64 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type64.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder65);
        org.junit.Assert.assertNotNull(parseField66);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder67);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder69);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder71);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder73);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder75);
    }

    @Test
    public void test16564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16564");
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
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder22.field("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : 0,\n    \"prefixLength\" : 0,\n    \"rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"multi_match\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzyRewrite\" : \"hi!\",\n    \"lenient\" : false,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.common.xcontent.XContentType xContentType43 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.bytes.BytesReference bytesReference44 = multiMatchQueryBuilder42.buildAsBytes(xContentType43);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchException; message: Failed to build ToXContent");
        } catch (org.elasticsearch.ElasticsearchException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder20);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder22);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder33);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder35);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder37);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder42);
    }

    @Test
    public void test16565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16565");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.rewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.tieBreaker((float) '4');
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery18 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.zeroTermsQuery(zeroTermsQuery18);
        org.elasticsearch.index.query.Operator operator20 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder10.operator(operator20);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder10.cutoffFrequency((float) '#');
        org.elasticsearch.index.query.QueryShardContext queryShardContext24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query25 = multiMatchQueryBuilder10.toFilter(queryShardContext24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "multi_match" + "'", str13, "multi_match");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
    }
}
