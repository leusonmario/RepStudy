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
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder9.boost(1.0f);
        org.elasticsearch.index.query.MatchQueryBuilder.Operator operator14 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder9.operator(operator14);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.tieBreaker((float) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.maxExpansions(1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder21.field("", (float) '4');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder26.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n    \"analyzer\" : \"hi!\",\n    \"prefix_length\" : 0,\n    \"max_expansions\" : 0,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 97.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder28.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"\",\n    \"prefix_length\" : 0,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 1.0\\n  }\\n}\"\n  }\n}", (float) (byte) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder28.useDisMax(true);
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray40);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder41.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder41.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = multiMatchQueryBuilder45.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder49 = multiMatchQueryBuilder47.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 0.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type50 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE;
        float float51 = type50.tieBreaker();
        org.elasticsearch.common.ParseField parseField52 = type50.parseField();
        org.elasticsearch.index.search.MatchQuery.Type type53 = type50.matchQueryType();
        float float54 = type50.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder55 = multiMatchQueryBuilder47.type(type50);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder57 = multiMatchQueryBuilder55.cutoffFrequency((float) (byte) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder59 = multiMatchQueryBuilder57.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder60 = multiMatchQueryBuilder33.fuzziness((java.lang.Object) multiMatchQueryBuilder57);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder62 = multiMatchQueryBuilder33.useDisMax(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder64 = multiMatchQueryBuilder62.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"\",\n    \"boost\" : 1.0,\n    \"slop\" : 35,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : -1.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder65 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params66 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder67 = multiMatchQueryBuilder64.toXContent(xContentBuilder65, params66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder28);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder31);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder33);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder43);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder45);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder47);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder49);
        org.junit.Assert.assertTrue("'" + type50 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE + "'", type50.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE));
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 0.0f + "'", float51 == 0.0f);
        org.junit.Assert.assertNotNull(parseField52);
        org.junit.Assert.assertTrue("'" + type53 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.PHRASE + "'", type53.equals(org.elasticsearch.index.search.MatchQuery.Type.PHRASE));
        org.junit.Assert.assertTrue("'" + float54 + "' != '" + 0.0f + "'", float54 == 0.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder55);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder57);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder59);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder60);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder62);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder64);
        org.junit.Assert.assertNotNull(params66);
    }

    @Test
    public void test17002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17002");
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
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder35.maxExpansions(100);
        org.elasticsearch.index.query.MatchQueryBuilder.Operator operator40 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder39.operator(operator40);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}" + "'", str22, "{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder24);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder28);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder31);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder33);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder35);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder37);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder39);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder41);
    }

    @Test
    public void test17003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17003");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.slop((int) (byte) 100);
        org.elasticsearch.index.query.MatchQueryBuilder.Operator operator14 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.operator(operator14);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder15.field("", (float) 1L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder15.field("hi!", (float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder21.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.tieBreaker((float) (-1L));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder25.useDisMax(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.tieBreaker((float) (short) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder29.boost((-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"\",\n    \"boost\" : 1.0,\n    \"slop\" : 35,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : -1.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray42);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder43.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = multiMatchQueryBuilder45.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder49 = multiMatchQueryBuilder47.slop((int) (byte) 100);
        org.elasticsearch.index.query.MatchQueryBuilder.Operator operator50 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder51 = multiMatchQueryBuilder47.operator(operator50);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder54 = multiMatchQueryBuilder51.field("", (float) 1L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder57 = multiMatchQueryBuilder51.field("hi!", (float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder59 = multiMatchQueryBuilder57.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder61 = multiMatchQueryBuilder57.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder63 = multiMatchQueryBuilder61.maxExpansions(1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder66 = multiMatchQueryBuilder61.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ]\n  }\n}", (float) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder68 = multiMatchQueryBuilder66.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"boost\" : 1.0,\n    \"fuzziness\" : \"UNDERSCORE\",\n    \"prefix_length\" : 97,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"cutoff_frequency\" : 32.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder69 = multiMatchQueryBuilder35.fuzziness((java.lang.Object) multiMatchQueryBuilder66);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder71 = multiMatchQueryBuilder66.field("{\n  \"multiMatch\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"type\" : \"most_fields\",\n    \"analyzer\" : \"\",\n    \"prefixLength\" : 100,\n    \"maxExpansions\" : 52,\n    \"minimumShouldMatch\" : \"hi!\",\n    \"fuzzyRewrite\" : \"hi!\",\n    \"tieBreaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder73 = multiMatchQueryBuilder66.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder75 = multiMatchQueryBuilder73.slop((int) 'a');
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder25);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder27);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder29);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder31);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder33);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder35);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder45);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder47);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder49);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder51);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder54);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder57);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder59);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder61);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder63);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder66);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder68);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder69);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder71);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder73);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder75);
    }

    @Test
    public void test17004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17004");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder13.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"slop\" : 100,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder13.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^1.0\", \"hi!\", \"^1.0\", \"^1.0\", \"^1.0\" ],\n    \"slop\" : 100,\n    \"minimum_should_match\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ]\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"use_dis_max\" : false,\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder13.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\"\\n  }\\n}\" ],\n    \"analyzer\" : \"hi!\",\n    \"prefix_length\" : -1,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : -1.0\n  }\n}", 1.0f);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder24);
    }

    @Test
    public void test17005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17005");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder9.boost(1.0f);
        org.elasticsearch.index.query.MatchQueryBuilder.Operator operator14 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder9.operator(operator14);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder15.field("");
        org.elasticsearch.common.xcontent.XContentBuilder.FieldCaseConversion fieldCaseConversion20 = org.elasticsearch.common.xcontent.XContentBuilder.FieldCaseConversion.UNDERSCORE;
        org.elasticsearch.common.xcontent.XContentBuilder.globalFieldCaseConversion(fieldCaseConversion20);
        org.elasticsearch.common.xcontent.XContentBuilder.globalFieldCaseConversion(fieldCaseConversion20);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder15.fuzziness((java.lang.Object) fieldCaseConversion20);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder15.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ]\n  }\n}");
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray32);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder35.field("", (float) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder35.prefixLength((int) (byte) -1);
        org.elasticsearch.index.query.MatchQueryBuilder.Operator operator41 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder40.operator(operator41);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type43 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder44 = multiMatchQueryBuilder42.type(type43);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder25.type(type43);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = multiMatchQueryBuilder45.prefixLength((int) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder49 = multiMatchQueryBuilder45.analyzer("{\n  \"multi_match\" : {\n    \"query\" : \"CROSS_FIELDS\",\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ]\n  }\n}");
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder50 = null;
        java.lang.String[] strArray57 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder58 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray57);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder60 = multiMatchQueryBuilder58.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder62 = multiMatchQueryBuilder58.fuzzyRewrite("");
        java.lang.String str63 = multiMatchQueryBuilder58.toString();
        org.elasticsearch.index.query.MatchQueryBuilder.Operator operator64 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder65 = multiMatchQueryBuilder58.operator(operator64);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder67 = multiMatchQueryBuilder58.maxExpansions((int) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder69 = multiMatchQueryBuilder58.slop((int) (short) -1);
        org.elasticsearch.common.xcontent.ToXContent.Params params70 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder71 = multiMatchQueryBuilder58.fuzziness((java.lang.Object) params70);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder72 = multiMatchQueryBuilder45.toXContent(xContentBuilder50, params70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertTrue("'" + fieldCaseConversion20 + "' != '" + org.elasticsearch.common.xcontent.XContentBuilder.FieldCaseConversion.UNDERSCORE + "'", fieldCaseConversion20.equals(org.elasticsearch.common.xcontent.XContentBuilder.FieldCaseConversion.UNDERSCORE));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder25);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder35);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder38);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder40);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder42);
        org.junit.Assert.assertTrue("'" + type43 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS + "'", type43.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder44);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder45);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder47);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder49);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder60);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"\"\n  }\n}" + "'", str63, "{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"\"\n  }\n}");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder65);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder67);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder69);
        org.junit.Assert.assertNotNull(params70);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder71);
    }

    @Test
    public void test17006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17006");
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
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.boost((float) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder27.cutoffFrequency((float) (short) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.useDisMax(true);
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray40);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder41.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder41.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = multiMatchQueryBuilder45.useDisMax(false);
        java.lang.String[] strArray54 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder55 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray54);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder57 = multiMatchQueryBuilder55.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder59 = multiMatchQueryBuilder57.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder61 = multiMatchQueryBuilder57.boost(1.0f);
        org.elasticsearch.index.query.MatchQueryBuilder.Operator operator62 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder63 = multiMatchQueryBuilder57.operator(operator62);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder65 = multiMatchQueryBuilder63.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder67 = multiMatchQueryBuilder65.tieBreaker((float) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder69 = multiMatchQueryBuilder65.cutoffFrequency((float) 100L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type70 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type71 = type70.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder72 = multiMatchQueryBuilder69.type(type70);
        org.elasticsearch.common.ParseField parseField73 = type70.parseField();
        org.elasticsearch.index.search.MatchQuery.Type type74 = type70.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder75 = multiMatchQueryBuilder45.type((java.lang.Object) type70);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder76 = multiMatchQueryBuilder31.type(type70);
        org.elasticsearch.common.ParseField parseField77 = type70.parseField();
        float float78 = type70.tieBreaker();
        org.elasticsearch.index.search.MatchQuery.Type type79 = type70.matchQueryType();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder25);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder27);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder29);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder31);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder33);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder43);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder45);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder47);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder57);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder59);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder61);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder63);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder65);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder67);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder69);
        org.junit.Assert.assertTrue("'" + type70 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS + "'", type70.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS));
        org.junit.Assert.assertTrue("'" + type71 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type71.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder72);
        org.junit.Assert.assertNotNull(parseField73);
        org.junit.Assert.assertTrue("'" + type74 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type74.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder75);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder76);
        org.junit.Assert.assertNotNull(parseField77);
        org.junit.Assert.assertTrue("'" + float78 + "' != '" + 0.0f + "'", float78 == 0.0f);
        org.junit.Assert.assertTrue("'" + type79 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type79.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
    }

    @Test
    public void test17007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17007");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder9.boost(1.0f);
        org.elasticsearch.index.query.MatchQueryBuilder.Operator operator14 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder9.operator(operator14);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.tieBreaker((float) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.maxExpansions(1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder21.field("", (float) '4');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder26.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder28.maxExpansions(100);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery31 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder30.zeroTermsQuery(zeroTermsQuery31);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder32.field("{\n  \"multi_match\" : {\n    \"query\" : {\n      \"multi_match\" : {\n        \"query\" : 0,\n        \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n        \"analyzer\" : \"hi!\",\n        \"max_expansions\" : 0,\n        \"minimum_should_match\" : \"hi!\",\n        \"fuzzy_rewrite\" : \"hi!\",\n        \"tie_breaker\" : 97.0,\n        \"_name\" : \"hi!\"\n      }\n    },\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"use_dis_max\" : false\n  }\n}", (float) 0L);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery36 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder32.zeroTermsQuery(zeroTermsQuery36);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type38 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE;
        float float39 = type38.tieBreaker();
        org.elasticsearch.common.ParseField parseField40 = type38.parseField();
        org.elasticsearch.index.search.MatchQuery.Type type41 = type38.matchQueryType();
        float float42 = type38.tieBreaker();
        float float43 = type38.tieBreaker();
        org.elasticsearch.common.ParseField parseField44 = type38.parseField();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder37.type(type38);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder28);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder30);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder32);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder35);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder37);
        org.junit.Assert.assertTrue("'" + type38 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE + "'", type38.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE));
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 0.0f + "'", float39 == 0.0f);
        org.junit.Assert.assertNotNull(parseField40);
        org.junit.Assert.assertTrue("'" + type41 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.PHRASE + "'", type41.equals(org.elasticsearch.index.search.MatchQuery.Type.PHRASE));
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 0.0f + "'", float42 == 0.0f);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 0.0f + "'", float43 == 0.0f);
        org.junit.Assert.assertNotNull(parseField44);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder45);
    }

    @Test
    public void test17008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17008");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder16.prefixLength((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"minimum_should_match\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.maxExpansions((-1));
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray31);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder32.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder34.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder34.boost(1.0f);
        org.elasticsearch.index.query.MatchQueryBuilder.Operator operator39 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder34.operator(operator39);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder40.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder44 = multiMatchQueryBuilder42.tieBreaker((float) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder46 = multiMatchQueryBuilder44.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder48 = multiMatchQueryBuilder46.maxExpansions(1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder51 = multiMatchQueryBuilder46.field("", (float) '4');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder53 = multiMatchQueryBuilder51.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n    \"analyzer\" : \"hi!\",\n    \"prefix_length\" : 0,\n    \"max_expansions\" : 0,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 97.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder55 = multiMatchQueryBuilder53.boost((float) 10);
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder63 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray62);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder65 = multiMatchQueryBuilder63.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder67 = multiMatchQueryBuilder65.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder69 = multiMatchQueryBuilder67.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder71 = multiMatchQueryBuilder69.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder73 = multiMatchQueryBuilder71.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder76 = multiMatchQueryBuilder73.field("", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder78 = multiMatchQueryBuilder76.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder80 = multiMatchQueryBuilder78.maxExpansions((int) (byte) 0);
        java.lang.String[] strArray87 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder88 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray87);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder89 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder80, strArray87);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder90 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder55, strArray87);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder91 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder24, strArray87);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder92 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray87);
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
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder22);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder24);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder34);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder36);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder38);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder40);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder42);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder44);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder46);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder48);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder51);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder53);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder55);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder65);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder67);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder69);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder71);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder73);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder76);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder78);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder80);
        org.junit.Assert.assertNotNull(strArray87);
    }

    @Test
    public void test17009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17009");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder9.boost(1.0f);
        org.elasticsearch.index.query.MatchQueryBuilder.Operator operator14 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder9.operator(operator14);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.tieBreaker((float) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.maxExpansions(1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder21.field("", (float) '4');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder26.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder26.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n    \"analyzer\" : \"hi!\",\n    \"prefix_length\" : 0,\n    \"max_expansions\" : 0,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 97.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder30.tieBreaker(0.0f);
        org.elasticsearch.index.query.MatchQueryBuilder.Operator operator33 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder30.operator(operator33);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder30.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder36.maxExpansions((int) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder36.lenient(true);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder28);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder30);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder32);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder34);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder36);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder38);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder40);
    }

    @Test
    public void test17010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17010");
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
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery25 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.zeroTermsQuery(zeroTermsQuery25);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder26.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"\",\n    \"prefix_length\" : 0,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder28.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"boost\" : 0.0,\n    \"slop\" : 100,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder30.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder32.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^1.0\", \"hi!\", \"^1.0\", \"^1.0\", \"^1.0\" ],\n    \"fuzziness\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!^10.0\\\", \\\"^1.0\\\", \\\"hi!^10.0\\\", \\\"^1.0\\\", \\\"^1.0\\\", \\\"^1.0\\\", \\\"hi!^10.0\\\" ],\\n    \\\"slop\\\" : 100,\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\",\\n    \\\"tie_breaker\\\" : 10.0,\\n    \\\"_name\\\" : \\\"\\\"\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 0.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder34.cutoffFrequency((float) (byte) 100);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery37 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder34.zeroTermsQuery(zeroTermsQuery37);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}" + "'", str22, "{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder24);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder28);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder30);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder32);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder34);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder36);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder38);
    }

    @Test
    public void test17011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17011");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder9.boost(1.0f);
        org.elasticsearch.index.query.MatchQueryBuilder.Operator operator14 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder9.operator(operator14);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.prefixLength((int) (byte) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder17.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"\",\n    \"boost\" : 1.0,\n    \"slop\" : 35,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : -1.0,\n    \"cutoff_frequency\" : 1.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder17.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"boost\" : 0.0,\n    \"prefix_length\" : 35,\n    \"max_expansions\" : -1,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"use_dis_max\" : true,\n    \"tie_breaker\" : 97.0,\n    \"lenient\" : false\n  }\n}");
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder26 = null;
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray33);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder34.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder34.fuzzyRewrite("");
        java.lang.String str39 = multiMatchQueryBuilder34.toString();
        org.elasticsearch.index.query.MatchQueryBuilder.Operator operator40 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder34.operator(operator40);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder34.maxExpansions((int) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder34.slop((int) (short) -1);
        org.elasticsearch.common.xcontent.ToXContent.Params params46 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = multiMatchQueryBuilder34.fuzziness((java.lang.Object) params46);
        // The following exception was thrown during execution in test generation
        try {
            multiMatchQueryBuilder17.doXContent(xContentBuilder26, params46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder25);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder36);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"\"\n  }\n}" + "'", str39, "{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"\"\n  }\n}");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder41);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder43);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder45);
        org.junit.Assert.assertNotNull(params46);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder47);
    }

    @Test
    public void test17012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17012");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder9.boost(1.0f);
        org.elasticsearch.index.query.MatchQueryBuilder.Operator operator14 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder9.operator(operator14);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder15.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!^10.0\", \"^100.0\", \"hi!^10.0\", \"^100.0\", \"^100.0\", \"hi!^10.0\", \"^100.0\" ],\n    \"slop\" : 100,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
    }

    @Test
    public void test17013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17013");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.slop((int) (byte) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 0.0\n  }\n}");
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray22);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.slop((int) (byte) 100);
        org.elasticsearch.index.query.MatchQueryBuilder.Operator operator30 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder27.operator(operator30);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder31.field("", (float) 1L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder34.tieBreaker((float) (short) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder15.fuzziness((java.lang.Object) (short) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder15.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n    \"analyzer\" : \"hi!\",\n    \"prefix_length\" : 0,\n    \"max_expansions\" : 0,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 97.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type40 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE;
        float float41 = type40.tieBreaker();
        float float42 = type40.tieBreaker();
        org.elasticsearch.index.search.MatchQuery.Type type43 = type40.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type44 = type40.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder15.type(type40);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = multiMatchQueryBuilder15.boost((float) 'a');
        org.elasticsearch.common.xcontent.XContentType xContentType48 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.bytes.BytesReference bytesReference49 = multiMatchQueryBuilder15.buildAsBytes(xContentType48);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchException; message: Failed to build ToXContent");
        } catch (org.elasticsearch.ElasticsearchException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder25);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder27);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder29);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder31);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder34);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder36);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder37);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder39);
        org.junit.Assert.assertTrue("'" + type40 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE + "'", type40.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE));
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 0.0f + "'", float41 == 0.0f);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 0.0f + "'", float42 == 0.0f);
        org.junit.Assert.assertTrue("'" + type43 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.PHRASE + "'", type43.equals(org.elasticsearch.index.search.MatchQuery.Type.PHRASE));
        org.junit.Assert.assertTrue("'" + type44 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.PHRASE + "'", type44.equals(org.elasticsearch.index.search.MatchQuery.Type.PHRASE));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder45);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder47);
    }

    @Test
    public void test17014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17014");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder14.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder18.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.prefixLength((int) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type23 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.type(type23);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.prefixLength(100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder24.maxExpansions((int) '4');
        java.lang.Object obj29 = null;
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "", "", "hi!", "{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = new org.elasticsearch.index.query.MultiMatchQueryBuilder(obj29, strArray35);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) '4', strArray35);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "{\n  \"multi_match\" : {\n    \"query\" : \"hi!\",\n    \"fields\" : [ \"hi!\", \"\", \"\", \"hi!\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 1.0\\n  }\\n}\" ],\n    \"max_expansions\" : 35\n  }\n}", strArray35);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder20);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder22);
        org.junit.Assert.assertTrue("'" + type23 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS + "'", type23.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder24);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder28);
        org.junit.Assert.assertNotNull(strArray35);
    }

    @Test
    public void test17015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17015");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder13.tieBreaker((float) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder13.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\"\\n  }\\n}\" ],\n    \"analyzer\" : \"\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"lenient\" : true\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder21.field("", 1.0f);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery25 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.zeroTermsQuery(zeroTermsQuery25);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder26.type((java.lang.Object) "{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\"\\n  }\\n}\" ],\n    \"analyzer\" : \"\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"cutoff_frequency\" : 1.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 1.0\\n  }\\n}\"\n  }\n}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: failed to parse [multi_match] query type [{?  \"multi_match\" : {?    \"query\" : 0,?    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\"\\n  }\\n}\" ],?    \"analyzer\" : \"\",?    \"minimum_should_match\" : \"hi!\",?    \"fuzzy_rewrite\" : \"hi!\",?    \"tie_breaker\" : 10.0,?    \"cutoff_frequency\" : 1.0,?    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 1.0\\n  }\\n}\"?  }?}]. unknown type.");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder24);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
    }

    @Test
    public void test17016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17016");
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
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder34.maxExpansions((int) (short) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder36.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!^10.0\", \"^1.0\", \"hi!^10.0\", \"^1.0\", \"^1.0\", \"^1.0\", \"hi!^10.0\" ],\n    \"boost\" : 1.0,\n    \"slop\" : 100,\n    \"max_expansions\" : 10,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"_name\" : \"\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder36.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"^1.0\\\", \\\"hi!\\\", \\\"^1.0\\\", \\\"^1.0\\\", \\\"^1.0\\\" ],\\n    \\\"slop\\\" : 100,\\n    \\\"fuzzyRewrite\\\" : \\\"hi!\\\",\\n    \\\"useDisMax\\\" : false,\\n    \\\"tieBreaker\\\" : 10.0,\\n    \\\"cutoffFrequency\\\" : -1.0\\n  }\\n}\" ],\n    \"analyzer\" : \"\",\n    \"boost\" : 1.0,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 1.0\\n  }\\n}\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder20);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder22);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder24);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
        org.junit.Assert.assertTrue("'" + type27 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX + "'", type27.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX));
        org.junit.Assert.assertTrue("'" + type28 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX + "'", type28.equals(org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX));
        org.junit.Assert.assertNotNull(parseField29);
        org.junit.Assert.assertNotNull(parseField30);
        org.junit.Assert.assertTrue("'" + type31 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX + "'", type31.equals(org.elasticsearch.index.search.MatchQuery.Type.PHRASE_PREFIX));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder32);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder34);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder36);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder38);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder40);
    }

    @Test
    public void test17017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17017");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder15.prefixLength((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"minimum_should_match\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MatchQueryBuilder.Operator operator22 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder19.operator(operator22);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder19.maxExpansions((-1));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder19.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"minimum_should_match\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 10.0\\n  }\\n}\",\n    \"use_dis_max\" : false,\n    \"lenient\" : false,\n    \"cutoff_frequency\" : 10.0\n  }\n}", 1.0f);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder25);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder28);
    }

    @Test
    public void test17018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17018");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder9.boost(1.0f);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery14 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.zeroTermsQuery(zeroTermsQuery14);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.boost((float) (byte) -1);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery18 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.zeroTermsQuery(zeroTermsQuery18);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.maxExpansions((-1));
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type22 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder19.type(type22);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder19.tieBreaker((float) (byte) 100);
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray32);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder37.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder37.boost((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder37.tieBreaker((float) 10);
        org.elasticsearch.index.query.MatchQueryBuilder.Operator operator44 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder43.operator(operator44);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = multiMatchQueryBuilder43.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 97.0,\n    \"lenient\" : false,\n    \"_name\" : \"hi!\"\n  }\n}");
        java.lang.Object obj48 = null;
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder56 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray55);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder58 = multiMatchQueryBuilder56.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder60 = multiMatchQueryBuilder58.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder62 = multiMatchQueryBuilder60.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder64 = multiMatchQueryBuilder62.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder66 = multiMatchQueryBuilder64.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder69 = multiMatchQueryBuilder66.field("", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder71 = multiMatchQueryBuilder69.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder73 = multiMatchQueryBuilder71.maxExpansions((int) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder75 = multiMatchQueryBuilder71.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder77 = multiMatchQueryBuilder75.slop((int) (byte) 100);
        java.lang.Object obj79 = null;
        java.lang.String[] strArray85 = new java.lang.String[] { "hi!", "", "", "hi!", "{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder86 = new org.elasticsearch.index.query.MultiMatchQueryBuilder(obj79, strArray85);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder87 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "hi!", strArray85);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder88 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (byte) 100, strArray85);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder89 = new org.elasticsearch.index.query.MultiMatchQueryBuilder(obj48, strArray85);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder90 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 97.0,\n    \"lenient\" : false,\n    \"_name\" : \"hi!\"\n  }\n}", strArray85);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder91 = multiMatchQueryBuilder25.type((java.lang.Object) strArray85);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: failed to parse [multi_match] query type [[ljava.lang.string;@4c745ab8]. unknown type.");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder25);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder35);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder37);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder39);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder41);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder43);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder45);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder47);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder58);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder60);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder62);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder64);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder66);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder69);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder71);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder73);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder75);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder77);
        org.junit.Assert.assertNotNull(strArray85);
    }

    @Test
    public void test17019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17019");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.queryName("");
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery14 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.zeroTermsQuery(zeroTermsQuery14);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\"\\n  }\\n}\" ],\n    \"analyzer\" : \"\",\n    \"boost\" : 1.0,\n    \"fuzziness\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"^1.0\\\", \\\"hi!\\\", \\\"^1.0\\\", \\\"^1.0\\\", \\\"^1.0\\\" ],\\n    \\\"slop\\\" : 100,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 10.0\\n  }\\n}\",\n    \"max_expansions\" : 1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 35.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder13.slop(1);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray26);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder31.boost((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder31.field("hi!", (-1.0f));
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery39 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder38.zeroTermsQuery(zeroTermsQuery39);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type41 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        float float42 = type41.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder40.type(type41);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder43.prefixLength((int) (short) 0);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery46 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = multiMatchQueryBuilder45.zeroTermsQuery(zeroTermsQuery46);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder49 = multiMatchQueryBuilder45.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 0.0\\n  }\\n}^100.0\" ],\n    \"type\" : \"cross_fields\",\n    \"boost\" : 1.0,\n    \"minimum_should_match\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\"\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 35.0,\n    \"cutoff_frequency\" : 100.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder51 = multiMatchQueryBuilder45.cutoffFrequency((float) (byte) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder53 = multiMatchQueryBuilder51.slop((int) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder55 = multiMatchQueryBuilder53.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 10.0,\\n    \\\"lenient\\\" : true,\\n    \\\"_name\\\" : \\\"\\\"\\n  }\\n}\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder56 = multiMatchQueryBuilder19.type((java.lang.Object) "{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 10.0,\\n    \\\"lenient\\\" : true,\\n    \\\"_name\\\" : \\\"\\\"\\n  }\\n}\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: failed to parse [multi_match] query type [{?  \"multi_match\" : {?    \"query\" : 0,?    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 10.0,\\n    \\\"lenient\\\" : true,\\n    \\\"_name\\\" : \\\"\\\"\\n  }\\n}\" ],?    \"analyzer\" : \"hi!\",?    \"minimum_should_match\" : \"hi!\",?    \"fuzzy_rewrite\" : \"hi!\",?    \"tie_breaker\" : 10.0?  }?}]. unknown type.");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder29);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder31);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder33);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder35);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder38);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder40);
        org.junit.Assert.assertTrue("'" + type41 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS + "'", type41.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS));
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 0.0f + "'", float42 == 0.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder43);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder45);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder47);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder49);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder51);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder53);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder55);
    }

    @Test
    public void test17020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17020");
        java.lang.Object obj0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.prefixLength((int) '4');
        java.lang.String str13 = multiMatchQueryBuilder12.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder12.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 97.0,\n    \"lenient\" : false,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.lenient(true);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray24);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder35.field("", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder38.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder40.maxExpansions((int) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder44 = multiMatchQueryBuilder40.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder46 = multiMatchQueryBuilder44.slop((int) (byte) 100);
        java.lang.Object obj48 = null;
        java.lang.String[] strArray54 = new java.lang.String[] { "hi!", "", "", "hi!", "{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder55 = new org.elasticsearch.index.query.MultiMatchQueryBuilder(obj48, strArray54);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder56 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "hi!", strArray54);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder57 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (byte) 100, strArray54);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder58 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) true, strArray54);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder59 = new org.elasticsearch.index.query.MultiMatchQueryBuilder(obj0, strArray54);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"prefix_length\" : 52,\n    \"use_dis_max\" : false\n  }\n}" + "'", str13, "{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"prefix_length\" : 52,\n    \"use_dis_max\" : false\n  }\n}");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder27);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder29);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder31);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder33);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder35);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder38);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder40);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder42);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder44);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder46);
        org.junit.Assert.assertNotNull(strArray54);
    }

    @Test
    public void test17021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17021");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder13.field("", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.boost((float) (-1));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder18.maxExpansions((int) ' ');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.maxExpansions((int) (short) 0);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray29);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder30.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder32.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder32.boost(1.0f);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery37 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder36.zeroTermsQuery(zeroTermsQuery37);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder38.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder40.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 1.0\\n  }\\n}\" ],\n    \"analyzer\" : \"\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder20.fuzziness((java.lang.Object) multiMatchQueryBuilder40);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder43.lenient(true);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder20);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder22);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder32);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder34);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder36);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder38);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder40);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder42);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder43);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder45);
    }

    @Test
    public void test17022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17022");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder9.boost(1.0f);
        org.elasticsearch.index.query.MatchQueryBuilder.Operator operator14 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder9.operator(operator14);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.tieBreaker((float) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.maxExpansions(1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder21.field("", (float) '4');
        java.lang.Object obj27 = null;
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "", "", "hi!", "{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = new org.elasticsearch.index.query.MultiMatchQueryBuilder(obj27, strArray33);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) '4', strArray33);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.maxExpansions(0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder35.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"prefix_length\" : 52,\n    \"use_dis_max\" : false\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder39.cutoffFrequency((float) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder41.fuzzyRewrite("");
        org.elasticsearch.index.query.MatchQueryBuilder.Operator operator44 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder41.operator(operator44);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder37);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder39);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder41);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder43);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder45);
    }

    @Test
    public void test17023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17023");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder9.boost(1.0f);
        org.elasticsearch.index.query.MatchQueryBuilder.Operator operator14 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder9.operator(operator14);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.tieBreaker((float) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.cutoffFrequency((float) 100L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type22 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type23 = type22.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder21.type(type22);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type25 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.type((java.lang.Object) type25);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder26.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder26.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"slop\" : 97,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"cutoff_frequency\" : 100.0,\n    \"_name\" : \"\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder30.prefixLength((-1));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder30.queryName("");
        org.elasticsearch.index.query.MatchQueryBuilder.Operator operator35 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder30.operator(operator35);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder30.prefixLength((int) (short) 1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertTrue("'" + type22 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS + "'", type22.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS));
        org.junit.Assert.assertTrue("'" + type23 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type23.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder24);
        org.junit.Assert.assertTrue("'" + type25 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX + "'", type25.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder28);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder30);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder32);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder34);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder36);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder38);
    }

    @Test
    public void test17024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17024");
        java.lang.Object obj1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "hi!", "{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder(obj1, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "hi!", strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.maxExpansions((int) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder9.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.prefixLength((int) (short) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"lenient\" : true,\n    \"_name\" : \"\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder13.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"fuzziness\" : \"class org.elasticsearch.index.query.MultiMatchQueryBuilder\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"use_dis_max\" : false,\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder13.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\"\\n  }\\n}\" ],\n    \"analyzer\" : \"\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"cutoff_frequency\" : 10.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder13.field("", 0.0f);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder25 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params26 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder27 = multiMatchQueryBuilder24.toXContent(xContentBuilder25, params26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder24);
        org.junit.Assert.assertNotNull(params26);
    }

    @Test
    public void test17025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17025");
        org.elasticsearch.common.ParseFieldMatcher parseFieldMatcher1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type2 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.parse("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"boost\" : 1.0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"use_dis_max\" : true,\n    \"tie_breaker\" : 10.0,\n    \"_name\" : \"hi!\"\n  }\n}", parseFieldMatcher1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test17026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17026");
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
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder37.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 0.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder39.tieBreaker((float) 1L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder41.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!^-1.0\", \"\", \"hi!^-1.0\", \"\", \"\", \"hi!^-1.0\" ],\n    \"type\" : \"best_fields\",\n    \"boost\" : 0.0,\n    \"prefix_length\" : 0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"_name\" : \"\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder43.boost((float) (byte) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = multiMatchQueryBuilder45.maxExpansions((int) (short) 1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder27);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder29);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder30);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder32);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"\",\n    \"boost\" : 10.0,\n    \"fuzziness\" : \"10\",\n    \"prefix_length\" : 0,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}" + "'", str35, "{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"\",\n    \"boost\" : 10.0,\n    \"fuzziness\" : \"10\",\n    \"prefix_length\" : 0,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder37);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder39);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder41);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder43);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder45);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder47);
    }

    @Test
    public void test17027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17027");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder9.field("", (float) 1);
        org.elasticsearch.index.query.MatchQueryBuilder.Operator operator13 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder9.operator(operator13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.boost((float) (byte) 10);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray23);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder26.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder28.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder30.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder30.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder34.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder34.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}", (float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder39.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\"\\n  }\\n}\" ],\n    \"analyzer\" : \"\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"lenient\" : true\n  }\n}", (float) ' ');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder44 = multiMatchQueryBuilder39.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder46 = multiMatchQueryBuilder39.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = multiMatchQueryBuilder16.fuzziness((java.lang.Object) multiMatchQueryBuilder39);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder49 = multiMatchQueryBuilder39.tieBreaker(100.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder51 = multiMatchQueryBuilder49.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"type\" : \"cross_fields\",\n    \"boost\" : 1.0,\n    \"slop\" : 100,\n    \"fuzzy_rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"^-1.0\\\", \\\"hi!\\\", \\\"^-1.0\\\", \\\"^-1.0\\\", \\\"^-1.0\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"prefix_length\\\" : 0,\\n    \\\"max_expansions\\\" : 0,\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 97.0,\\n    \\\"_name\\\" : \\\"hi!\\\"\\n  }\\n}\",\n    \"tie_breaker\" : 35.0,\n    \"cutoff_frequency\" : 100.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder53 = multiMatchQueryBuilder49.lenient(true);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder54 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params55 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder56 = multiMatchQueryBuilder53.toXContent(xContentBuilder54, params55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder28);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder30);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder32);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder34);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder36);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder39);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder42);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder44);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder46);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder47);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder49);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder51);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder53);
        org.junit.Assert.assertNotNull(params55);
    }

    @Test
    public void test17028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17028");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder9.boost(1.0f);
        org.elasticsearch.index.query.MatchQueryBuilder.Operator operator14 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder9.operator(operator14);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.queryName("hi!");
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray24);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder27.field("", (float) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder27.cutoffFrequency((float) (-1L));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder27.prefixLength((int) (byte) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder27.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"boost\" : 0.0,\n    \"max_expansions\" : 10,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"use_dis_max\" : false,\n    \"tie_breaker\" : 10.0,\n    \"lenient\" : false,\n    \"_name\" : \"\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder15.fuzziness((java.lang.Object) multiMatchQueryBuilder36);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder27);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder30);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder32);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder34);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder36);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder37);
    }

    @Test
    public void test17029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17029");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder9.boost(1.0f);
        org.elasticsearch.index.query.MatchQueryBuilder.Operator operator14 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder9.operator(operator14);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.tieBreaker((float) '#');
        org.elasticsearch.index.query.MatchQueryBuilder.Operator operator20 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.operator(operator20);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.useDisMax(true);
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray30);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder37.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder37.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder41.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder43.tieBreaker((float) 1L);
        java.lang.String str46 = multiMatchQueryBuilder43.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder48 = multiMatchQueryBuilder43.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = multiMatchQueryBuilder48.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder52 = multiMatchQueryBuilder50.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder55 = multiMatchQueryBuilder52.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}", 0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder56 = multiMatchQueryBuilder21.fuzziness((java.lang.Object) multiMatchQueryBuilder52);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder58 = multiMatchQueryBuilder52.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder60 = multiMatchQueryBuilder52.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 97.0,\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 100.0\\n  }\\n}\",\n    \"prefix_length\" : 10,\n    \"fuzzy_rewrite\" : \"\",\n    \"cutoff_frequency\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type61 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE;
        org.elasticsearch.index.search.MatchQuery.Type type62 = type61.matchQueryType();
        org.elasticsearch.common.ParseField parseField63 = type61.parseField();
        org.elasticsearch.index.search.MatchQuery.Type type64 = type61.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type65 = type61.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type66 = type61.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder67 = multiMatchQueryBuilder60.type((java.lang.Object) type61);
        org.elasticsearch.index.query.MatchQueryBuilder.Operator operator68 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder69 = multiMatchQueryBuilder60.operator(operator68);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder71 = multiMatchQueryBuilder69.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"boost\\\" : 0.0,\\n    \\\"slop\\\" : 100,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 10.0\\n  }\\n}^-1.0\" ],\n    \"analyzer\" : \"\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder33);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder35);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder37);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder39);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder41);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder43);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}" + "'", str46, "{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder48);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder50);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder52);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder55);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder56);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder58);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder60);
        org.junit.Assert.assertTrue("'" + type61 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE + "'", type61.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE));
        org.junit.Assert.assertTrue("'" + type62 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.PHRASE + "'", type62.equals(org.elasticsearch.index.search.MatchQuery.Type.PHRASE));
        org.junit.Assert.assertNotNull(parseField63);
        org.junit.Assert.assertTrue("'" + type64 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.PHRASE + "'", type64.equals(org.elasticsearch.index.search.MatchQuery.Type.PHRASE));
        org.junit.Assert.assertTrue("'" + type65 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.PHRASE + "'", type65.equals(org.elasticsearch.index.search.MatchQuery.Type.PHRASE));
        org.junit.Assert.assertTrue("'" + type66 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.PHRASE + "'", type66.equals(org.elasticsearch.index.search.MatchQuery.Type.PHRASE));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder67);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder69);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder71);
    }

    @Test
    public void test17030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17030");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder17.field("", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.queryName("hi!");
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery23 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.zeroTermsQuery(zeroTermsQuery23);
        org.elasticsearch.index.query.MatchQueryBuilder.Operator operator25 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder22.operator(operator25);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery27 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder22.zeroTermsQuery(zeroTermsQuery27);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder22.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"boost\" : 1.0,\n    \"slop\" : 52,\n    \"prefix_length\" : 0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder22.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"boost\" : 1.0,\n    \"prefix_length\" : 0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\"\\n  }\\n}\"\n  }\n}");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder20);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder22);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder24);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder28);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder30);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder32);
    }

    @Test
    public void test17031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17031");
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
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery27 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder26.zeroTermsQuery(zeroTermsQuery27);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery29 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder26.zeroTermsQuery(zeroTermsQuery29);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder30.cutoffFrequency((float) '#');
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder24);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder28);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder30);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder32);
    }

    @Test
    public void test17032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17032");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder7.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.prefixLength((int) ' ');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder11.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\"\\n  }\\n}\" ],\n    \"analyzer\" : \"\",\n    \"boost\" : 1.0,\n    \"fuzziness\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"^1.0\\\", \\\"hi!\\\", \\\"^1.0\\\", \\\"^1.0\\\", \\\"^1.0\\\" ],\\n    \\\"slop\\\" : 100,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 10.0\\n  }\\n}\",\n    \"max_expansions\" : 1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 35.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.prefixLength((int) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^1.0\", \"hi!\", \"^1.0\", \"^1.0\", \"^1.0\" ],\n    \"slop\" : 100,\n    \"minimum_should_match\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ]\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"use_dis_max\" : false,\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder21.tieBreaker((float) 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder25);
    }

    @Test
    public void test17033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17033");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.queryName("");
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery14 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.zeroTermsQuery(zeroTermsQuery14);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\"\\n  }\\n}\" ],\n    \"analyzer\" : \"\",\n    \"boost\" : 1.0,\n    \"fuzziness\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"^1.0\\\", \\\"hi!\\\", \\\"^1.0\\\", \\\"^1.0\\\", \\\"^1.0\\\" ],\\n    \\\"slop\\\" : 100,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 10.0\\n  }\\n}\",\n    \"max_expansions\" : 1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 35.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder13.boost((float) 100L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder13.queryName("{\n  \"multi_match\" : {\n    \"query\" : {\n      \"multi_match\" : {\n        \"query\" : 0,\n        \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n        \"analyzer\" : \"hi!\",\n        \"max_expansions\" : 0,\n        \"minimum_should_match\" : \"hi!\",\n        \"fuzzy_rewrite\" : \"hi!\",\n        \"tie_breaker\" : 97.0,\n        \"_name\" : \"hi!\"\n      }\n    },\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"use_dis_max\" : false,\n    \"lenient\" : false\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.maxExpansions(1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
    }

    @Test
    public void test17034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17034");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder15.prefixLength((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"minimum_should_match\" : \"hi!\"\n  }\n}");
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray28);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder37.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder39.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder39.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder43.slop((int) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = multiMatchQueryBuilder43.tieBreaker((-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder49 = multiMatchQueryBuilder47.boost((float) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder51 = multiMatchQueryBuilder49.cutoffFrequency((float) 1L);
        java.lang.Object obj52 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder53 = multiMatchQueryBuilder51.type(obj52);
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder61 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray60);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder63 = multiMatchQueryBuilder61.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder65 = multiMatchQueryBuilder63.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder67 = multiMatchQueryBuilder65.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder69 = multiMatchQueryBuilder67.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder71 = multiMatchQueryBuilder69.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder74 = multiMatchQueryBuilder71.field("", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder76 = multiMatchQueryBuilder74.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder78 = multiMatchQueryBuilder76.maxExpansions((int) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder80 = multiMatchQueryBuilder76.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder82 = multiMatchQueryBuilder80.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type83 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS;
        float float84 = type83.tieBreaker();
        float float85 = type83.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder86 = multiMatchQueryBuilder82.type(type83);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder87 = multiMatchQueryBuilder51.type((java.lang.Object) type83);
        float float88 = type83.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder89 = multiMatchQueryBuilder21.type(type83);
        float float90 = type83.tieBreaker();
        float float91 = type83.tieBreaker();
        float float92 = type83.tieBreaker();
        float float93 = type83.tieBreaker();
        org.elasticsearch.index.search.MatchQuery.Type type94 = type83.matchQueryType();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder31);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder33);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder35);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder37);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder39);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder41);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder43);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder45);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder47);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder49);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder51);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder53);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder63);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder65);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder67);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder69);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder71);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder74);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder76);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder78);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder80);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder82);
        org.junit.Assert.assertTrue("'" + type83 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS + "'", type83.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS));
        org.junit.Assert.assertTrue("'" + float84 + "' != '" + 1.0f + "'", float84 == 1.0f);
        org.junit.Assert.assertTrue("'" + float85 + "' != '" + 1.0f + "'", float85 == 1.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder86);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder87);
        org.junit.Assert.assertTrue("'" + float88 + "' != '" + 1.0f + "'", float88 == 1.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder89);
        org.junit.Assert.assertTrue("'" + float90 + "' != '" + 1.0f + "'", float90 == 1.0f);
        org.junit.Assert.assertTrue("'" + float91 + "' != '" + 1.0f + "'", float91 == 1.0f);
        org.junit.Assert.assertTrue("'" + float92 + "' != '" + 1.0f + "'", float92 == 1.0f);
        org.junit.Assert.assertTrue("'" + float93 + "' != '" + 1.0f + "'", float93 == 1.0f);
        org.junit.Assert.assertTrue("'" + type94 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type94.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
    }

    @Test
    public void test17035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17035");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.slop((int) (byte) 100);
        org.elasticsearch.index.query.MatchQueryBuilder.Operator operator14 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.operator(operator14);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder15.field("", (float) 1L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder18.tieBreaker((float) (short) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder18.prefixLength(10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder18.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder18.fuzzyRewrite("{\n  \"multiMatch\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ]\\n  }\\n}^1.0\" ],\n    \"type\" : \"best_fields\",\n    \"boost\" : 1.0,\n    \"fuzzyRewrite\" : \"hi!\",\n    \"tieBreaker\" : 10.0,\n    \"Name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder18.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!^10.0\", \"^1.0\", \"hi!^10.0\", \"^1.0\", \"^1.0\", \"^1.0\", \"hi!^10.0\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ]\\n  }\\n}^1.0\" ],\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\"\\n  }\\n}\",\n    \"slop\" : 100,\n    \"max_expansions\" : 1,\n    \"fuzzy_rewrite\" : \"\",\n    \"tie_breaker\" : 10.0,\n    \"_name\" : \"\"\n  }\n}");
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray35);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder36.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder38.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder38.boost(1.0f);
        org.elasticsearch.index.query.MatchQueryBuilder.Operator operator43 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder44 = multiMatchQueryBuilder38.operator(operator43);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder46 = multiMatchQueryBuilder44.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder48 = multiMatchQueryBuilder46.tieBreaker((float) '#');
        org.elasticsearch.index.query.MatchQueryBuilder.Operator operator49 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = multiMatchQueryBuilder46.operator(operator49);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder53 = multiMatchQueryBuilder50.field("{\n  \"multi_match\" : {\n    \"query\" : {\n      \"multi_match\" : {\n        \"query\" : 0,\n        \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n        \"analyzer\" : \"hi!\",\n        \"max_expansions\" : 0,\n        \"minimum_should_match\" : \"hi!\",\n        \"fuzzy_rewrite\" : \"hi!\",\n        \"tie_breaker\" : 97.0,\n        \"_name\" : \"hi!\"\n      }\n    },\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"use_dis_max\" : false\n  }\n}", 1.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder55 = multiMatchQueryBuilder53.useDisMax(false);
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder63 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray62);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder65 = multiMatchQueryBuilder63.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder67 = multiMatchQueryBuilder65.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder69 = multiMatchQueryBuilder65.boost(1.0f);
        org.elasticsearch.index.query.MatchQueryBuilder.Operator operator70 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder71 = multiMatchQueryBuilder65.operator(operator70);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder73 = multiMatchQueryBuilder71.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder75 = multiMatchQueryBuilder73.tieBreaker((float) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder77 = multiMatchQueryBuilder75.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder79 = multiMatchQueryBuilder77.maxExpansions(1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder82 = multiMatchQueryBuilder77.field("", (float) '4');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder84 = multiMatchQueryBuilder82.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder86 = multiMatchQueryBuilder82.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n    \"analyzer\" : \"hi!\",\n    \"prefix_length\" : 0,\n    \"max_expansions\" : 0,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 97.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder87 = multiMatchQueryBuilder55.fuzziness((java.lang.Object) "{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n    \"analyzer\" : \"hi!\",\n    \"prefix_length\" : 0,\n    \"max_expansions\" : 0,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 97.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder90 = multiMatchQueryBuilder55.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\"\\n  }\\n}\" ],\n    \"analyzer\" : \"\",\n    \"boost\" : 1.0,\n    \"fuzziness\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"^1.0\\\", \\\"hi!\\\", \\\"^1.0\\\", \\\"^1.0\\\", \\\"^1.0\\\" ],\\n    \\\"slop\\\" : 100,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 10.0\\n  }\\n}\",\n    \"max_expansions\" : 1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 35.0,\n    \"_name\" : \"hi!\"\n  }\n}", (float) (short) 100);
        org.elasticsearch.index.query.MatchQueryBuilder.Operator operator91 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder92 = multiMatchQueryBuilder90.operator(operator91);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type93 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE;
        float float94 = type93.tieBreaker();
        float float95 = type93.tieBreaker();
        org.elasticsearch.index.search.MatchQuery.Type type96 = type93.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder97 = multiMatchQueryBuilder92.fuzziness((java.lang.Object) type93);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder98 = multiMatchQueryBuilder18.type(type93);
        org.elasticsearch.index.search.MatchQuery.Type type99 = type93.matchQueryType();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder20);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder22);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder24);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder28);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder38);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder40);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder42);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder44);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder46);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder48);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder50);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder53);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder55);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder65);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder67);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder69);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder71);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder73);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder75);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder77);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder79);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder82);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder84);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder86);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder87);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder90);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder92);
        org.junit.Assert.assertTrue("'" + type93 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE + "'", type93.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE));
        org.junit.Assert.assertTrue("'" + float94 + "' != '" + 0.0f + "'", float94 == 0.0f);
        org.junit.Assert.assertTrue("'" + float95 + "' != '" + 0.0f + "'", float95 == 0.0f);
        org.junit.Assert.assertTrue("'" + type96 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.PHRASE + "'", type96.equals(org.elasticsearch.index.search.MatchQuery.Type.PHRASE));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder97);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder98);
        org.junit.Assert.assertTrue("'" + type99 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.PHRASE + "'", type99.equals(org.elasticsearch.index.search.MatchQuery.Type.PHRASE));
    }
}

