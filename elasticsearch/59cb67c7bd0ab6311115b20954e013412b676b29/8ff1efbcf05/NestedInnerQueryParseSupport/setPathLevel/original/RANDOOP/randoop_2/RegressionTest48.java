import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest48 {

    public static boolean debug = false;

    @Test
    public void test24001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24001");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test24002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24002");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(false, false);
        boolean boolean3 = nested2.isNested();
        boolean boolean4 = nested2.isNested();
        boolean boolean5 = nested2.isIncludeInRoot();
        boolean boolean6 = nested2.isIncludeInRoot();
        boolean boolean7 = nested2.isIncludeInParent();
        boolean boolean8 = nested2.isNested();
        boolean boolean9 = nested2.isIncludeInParent();
        boolean boolean10 = nested2.isNested();
        boolean boolean11 = nested2.isIncludeInRoot();
        boolean boolean12 = nested2.isIncludeInParent();
        boolean boolean13 = nested2.isNested();
        boolean boolean14 = nested2.isIncludeInParent();
        boolean boolean15 = nested2.isIncludeInParent();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test24003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24003");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str9 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean11 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str12 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str13 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean15 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper16 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean17 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query18 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(objectMapper14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(objectMapper16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test24004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24004");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test24005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24005");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str10 = nestedInnerQueryParseSupport1.getPath();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test24006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24006");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str11 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str13 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean14 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean16 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean17 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper18 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = objectMapper18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(objectMapper15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(objectMapper18);
    }

    @Test
    public void test24007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24007");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(true, true);
        boolean boolean3 = nested2.isNested();
        boolean boolean4 = nested2.isNested();
        boolean boolean5 = nested2.isIncludeInParent();
        boolean boolean6 = nested2.isIncludeInRoot();
        boolean boolean7 = nested2.isIncludeInParent();
        boolean boolean8 = nested2.isIncludeInParent();
        boolean boolean9 = nested2.isIncludeInRoot();
        boolean boolean10 = nested2.isIncludeInParent();
        boolean boolean11 = nested2.isIncludeInRoot();
        boolean boolean12 = nested2.isNested();
        boolean boolean13 = nested2.isIncludeInParent();
        boolean boolean14 = nested2.isIncludeInRoot();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test24008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24008");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str9 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str11 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str14 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str15 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str16 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean17 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean18 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query19 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test24009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24009");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str8 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str10 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test24010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24010");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested0 = org.elasticsearch.index.mapper.object.ObjectMapper.Defaults.NESTED;
        boolean boolean1 = nested0.isIncludeInParent();
        boolean boolean2 = nested0.isNested();
        boolean boolean3 = nested0.isNested();
        boolean boolean4 = nested0.isIncludeInRoot();
        boolean boolean5 = nested0.isIncludeInRoot();
        boolean boolean6 = nested0.isIncludeInParent();
        boolean boolean7 = nested0.isIncludeInRoot();
        boolean boolean8 = nested0.isIncludeInRoot();
        boolean boolean9 = nested0.isNested();
        org.junit.Assert.assertNotNull(nested0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test24011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24011");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str10 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test24012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24012");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str8 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str11 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test24013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24013");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test24014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24014");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str11 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test24015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24015");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test24016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24016");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test24017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24017");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test24018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24018");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str11 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str12 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test24019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24019");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str10 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test24020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24020");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test24021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24021");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str9 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean14 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query16 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(objectMapper15);
    }

    @Test
    public void test24022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24022");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean12 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str14 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean15 = nestedInnerQueryParseSupport1.queryFound();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test24023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24023");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test24024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24024");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test24025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24025");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(true, false);
        boolean boolean3 = nested2.isIncludeInRoot();
        boolean boolean4 = nested2.isIncludeInRoot();
        boolean boolean5 = nested2.isIncludeInRoot();
        boolean boolean6 = nested2.isIncludeInRoot();
        boolean boolean7 = nested2.isIncludeInRoot();
        boolean boolean8 = nested2.isNested();
        boolean boolean9 = nested2.isIncludeInParent();
        boolean boolean10 = nested2.isIncludeInParent();
        boolean boolean11 = nested2.isIncludeInRoot();
        boolean boolean12 = nested2.isNested();
        boolean boolean13 = nested2.isIncludeInRoot();
        boolean boolean14 = nested2.isIncludeInParent();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test24026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24026");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = objectMapper10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test24027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24027");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(true, true);
        boolean boolean3 = nested2.isIncludeInParent();
        boolean boolean4 = nested2.isIncludeInParent();
        boolean boolean5 = nested2.isIncludeInParent();
        boolean boolean6 = nested2.isIncludeInRoot();
        boolean boolean7 = nested2.isIncludeInRoot();
        boolean boolean8 = nested2.isNested();
        boolean boolean9 = nested2.isIncludeInParent();
        boolean boolean10 = nested2.isIncludeInParent();
        boolean boolean11 = nested2.isIncludeInRoot();
        boolean boolean12 = nested2.isIncludeInParent();
        boolean boolean13 = nested2.isIncludeInRoot();
        java.lang.Class<?> wildcardClass14 = nested2.getClass();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test24028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24028");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str10 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean11 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean12 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str13 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(objectMapper14);
    }

    @Test
    public void test24029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24029");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str9 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str11 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean13 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean14 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(objectMapper15);
    }

    @Test
    public void test24030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24030");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = objectMapper7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test24031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24031");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test24032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24032");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str10 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean13 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper16 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper17 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean18 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean19 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean20 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper21 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(objectMapper14);
        org.junit.Assert.assertNull(objectMapper15);
        org.junit.Assert.assertNull(objectMapper16);
        org.junit.Assert.assertNull(objectMapper17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(objectMapper21);
    }

    @Test
    public void test24033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24033");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str10 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str12 = nestedInnerQueryParseSupport1.getPath();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test24034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24034");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str9 = nestedInnerQueryParseSupport1.getPath();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test24035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24035");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str10 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean13 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean16 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str17 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean18 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper19 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str20 = nestedInnerQueryParseSupport1.getPath();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(objectMapper14);
        org.junit.Assert.assertNull(objectMapper15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(objectMapper19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test24036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24036");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(true, false);
        boolean boolean3 = nested2.isIncludeInRoot();
        boolean boolean4 = nested2.isIncludeInRoot();
        boolean boolean5 = nested2.isIncludeInRoot();
        boolean boolean6 = nested2.isIncludeInParent();
        boolean boolean7 = nested2.isNested();
        boolean boolean8 = nested2.isNested();
        boolean boolean9 = nested2.isNested();
        boolean boolean10 = nested2.isIncludeInParent();
        boolean boolean11 = nested2.isIncludeInRoot();
        boolean boolean12 = nested2.isIncludeInParent();
        boolean boolean13 = nested2.isNested();
        boolean boolean14 = nested2.isNested();
        boolean boolean15 = nested2.isIncludeInRoot();
        boolean boolean16 = nested2.isNested();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test24037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24037");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean12 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str14 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper16 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean17 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(objectMapper15);
        org.junit.Assert.assertNull(objectMapper16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test24038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24038");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test24039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24039");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(true, false);
        boolean boolean3 = nested2.isIncludeInRoot();
        boolean boolean4 = nested2.isIncludeInRoot();
        boolean boolean5 = nested2.isIncludeInRoot();
        boolean boolean6 = nested2.isNested();
        boolean boolean7 = nested2.isIncludeInRoot();
        boolean boolean8 = nested2.isIncludeInRoot();
        boolean boolean9 = nested2.isIncludeInRoot();
        boolean boolean10 = nested2.isNested();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test24040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24040");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test24041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24041");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str8 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean12 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean13 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str14 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean15 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query16 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test24042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24042");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str8 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean11 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean12 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean13 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean15 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper16 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean17 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper18 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query19 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(objectMapper14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(objectMapper16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(objectMapper18);
    }

    @Test
    public void test24043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24043");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(true, true);
        boolean boolean3 = nested2.isIncludeInParent();
        boolean boolean4 = nested2.isIncludeInParent();
        boolean boolean5 = nested2.isNested();
        boolean boolean6 = nested2.isIncludeInRoot();
        boolean boolean7 = nested2.isIncludeInRoot();
        boolean boolean8 = nested2.isIncludeInParent();
        boolean boolean9 = nested2.isIncludeInParent();
        boolean boolean10 = nested2.isNested();
        boolean boolean11 = nested2.isIncludeInParent();
        boolean boolean12 = nested2.isIncludeInParent();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test24044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24044");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str9 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean11 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean13 = nestedInnerQueryParseSupport1.filterFound();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test24045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24045");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean12 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertNull(objectMapper14);
    }

    @Test
    public void test24046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24046");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str11 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str13 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean14 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper16 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(objectMapper15);
        org.junit.Assert.assertNull(objectMapper16);
    }

    @Test
    public void test24047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24047");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test24048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24048");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str8 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test24049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24049");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str9 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean12 = nestedInnerQueryParseSupport1.queryFound();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test24050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24050");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str9 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str11 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str13 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean14 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str16 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query17 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(objectMapper15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test24051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24051");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str9 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str12 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean15 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str16 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean17 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("object");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertNull(objectMapper14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test24052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24052");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test24053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24053");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str9 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean11 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test24054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24054");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str8 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test24055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24055");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str8 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.Class<?> wildcardClass11 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test24056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24056");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = objectMapper9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test24057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24057");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str9 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str11 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str13 = nestedInnerQueryParseSupport1.getPath();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test24058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24058");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str8 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str9 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean11 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test24059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24059");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str10 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean11 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test24060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24060");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str8 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str9 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str11 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean12 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean15 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper16 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper17 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper18 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertNull(objectMapper14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(objectMapper16);
        org.junit.Assert.assertNull(objectMapper17);
        org.junit.Assert.assertNull(objectMapper18);
    }

    @Test
    public void test24061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24061");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str13 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str14 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str15 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper16 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(objectMapper16);
    }

    @Test
    public void test24062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24062");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str11 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean12 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str16 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean17 = nestedInnerQueryParseSupport1.queryFound();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertNull(objectMapper14);
        org.junit.Assert.assertNull(objectMapper15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test24063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24063");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str10 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str11 = nestedInnerQueryParseSupport1.getPath();
        java.lang.Class<?> wildcardClass12 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test24064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24064");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str8 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean12 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str13 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper16 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean17 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query18 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(objectMapper14);
        org.junit.Assert.assertNull(objectMapper15);
        org.junit.Assert.assertNull(objectMapper16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test24065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24065");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str8 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean11 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test24066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24066");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper2 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectMapper2);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test24067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24067");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str9 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean12 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean13 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean14 = nestedInnerQueryParseSupport1.filterFound();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test24068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24068");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str12 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean13 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test24069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24069");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(true, true);
        boolean boolean3 = nested2.isIncludeInParent();
        boolean boolean4 = nested2.isIncludeInParent();
        boolean boolean5 = nested2.isIncludeInRoot();
        boolean boolean6 = nested2.isNested();
        boolean boolean7 = nested2.isNested();
        boolean boolean8 = nested2.isNested();
        boolean boolean9 = nested2.isIncludeInRoot();
        boolean boolean10 = nested2.isIncludeInRoot();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test24070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24070");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(false, true);
        boolean boolean3 = nested2.isIncludeInRoot();
        boolean boolean4 = nested2.isIncludeInRoot();
        boolean boolean5 = nested2.isIncludeInParent();
        boolean boolean6 = nested2.isIncludeInParent();
        boolean boolean7 = nested2.isNested();
        boolean boolean8 = nested2.isIncludeInParent();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test24071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24071");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str8 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test24072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24072");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str9 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test24073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24073");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str9 = nestedInnerQueryParseSupport1.getPath();
        java.lang.Class<?> wildcardClass10 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test24074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24074");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(true, false);
        boolean boolean3 = nested2.isIncludeInRoot();
        boolean boolean4 = nested2.isIncludeInRoot();
        boolean boolean5 = nested2.isIncludeInParent();
        boolean boolean6 = nested2.isNested();
        boolean boolean7 = nested2.isIncludeInParent();
        boolean boolean8 = nested2.isIncludeInParent();
        boolean boolean9 = nested2.isIncludeInRoot();
        boolean boolean10 = nested2.isIncludeInRoot();
        boolean boolean11 = nested2.isIncludeInRoot();
        boolean boolean12 = nested2.isIncludeInParent();
        boolean boolean13 = nested2.isIncludeInParent();
        boolean boolean14 = nested2.isIncludeInRoot();
        boolean boolean15 = nested2.isIncludeInParent();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test24075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24075");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean11 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean12 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str13 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper16 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(objectMapper14);
        org.junit.Assert.assertNull(objectMapper15);
        org.junit.Assert.assertNull(objectMapper16);
    }

    @Test
    public void test24076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24076");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str10 = nestedInnerQueryParseSupport1.getPath();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test24077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24077");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str9 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertNull(objectMapper14);
    }

    @Test
    public void test24078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24078");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(true, false);
        boolean boolean3 = nested2.isNested();
        boolean boolean4 = nested2.isIncludeInRoot();
        boolean boolean5 = nested2.isIncludeInRoot();
        boolean boolean6 = nested2.isIncludeInParent();
        boolean boolean7 = nested2.isIncludeInRoot();
        boolean boolean8 = nested2.isIncludeInRoot();
        boolean boolean9 = nested2.isIncludeInRoot();
        boolean boolean10 = nested2.isNested();
        boolean boolean11 = nested2.isNested();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test24079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24079");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean13 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean15 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper16 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(objectMapper14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(objectMapper16);
    }

    @Test
    public void test24080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24080");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str11 = nestedInnerQueryParseSupport1.getPath();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test24081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24081");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str10 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test24082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24082");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str9 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean12 = nestedInnerQueryParseSupport1.filterFound();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test24083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24083");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(true, false);
        boolean boolean3 = nested2.isIncludeInRoot();
        boolean boolean4 = nested2.isIncludeInRoot();
        boolean boolean5 = nested2.isIncludeInRoot();
        boolean boolean6 = nested2.isNested();
        boolean boolean7 = nested2.isIncludeInParent();
        boolean boolean8 = nested2.isIncludeInRoot();
        boolean boolean9 = nested2.isNested();
        boolean boolean10 = nested2.isNested();
        boolean boolean11 = nested2.isNested();
        boolean boolean12 = nested2.isNested();
        boolean boolean13 = nested2.isIncludeInParent();
        java.lang.Class<?> wildcardClass14 = nested2.getClass();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test24084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24084");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str12 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean14 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("object");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test24085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24085");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(true, false);
        boolean boolean3 = nested2.isIncludeInRoot();
        boolean boolean4 = nested2.isIncludeInRoot();
        boolean boolean5 = nested2.isIncludeInRoot();
        boolean boolean6 = nested2.isIncludeInParent();
        boolean boolean7 = nested2.isNested();
        boolean boolean8 = nested2.isIncludeInParent();
        boolean boolean9 = nested2.isIncludeInParent();
        boolean boolean10 = nested2.isNested();
        boolean boolean11 = nested2.isIncludeInParent();
        boolean boolean12 = nested2.isNested();
        boolean boolean13 = nested2.isIncludeInRoot();
        boolean boolean14 = nested2.isIncludeInRoot();
        boolean boolean15 = nested2.isIncludeInParent();
        boolean boolean16 = nested2.isNested();
        boolean boolean17 = nested2.isIncludeInParent();
        boolean boolean18 = nested2.isIncludeInRoot();
        boolean boolean19 = nested2.isNested();
        boolean boolean20 = nested2.isIncludeInRoot();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test24086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24086");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str11 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str12 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean13 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str14 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper16 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper17 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str18 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(objectMapper15);
        org.junit.Assert.assertNull(objectMapper16);
        org.junit.Assert.assertNull(objectMapper17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test24087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24087");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str10 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str12 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test24088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24088");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str9 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str11 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean13 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str15 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper16 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper17 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(objectMapper14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(objectMapper16);
        org.junit.Assert.assertNull(objectMapper17);
    }

    @Test
    public void test24089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24089");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test24090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24090");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test24091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24091");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test24092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24092");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str10 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str12 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean14 = nestedInnerQueryParseSupport1.queryFound();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test24093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24093");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(true, false);
        boolean boolean3 = nested2.isIncludeInRoot();
        boolean boolean4 = nested2.isIncludeInRoot();
        boolean boolean5 = nested2.isIncludeInRoot();
        boolean boolean6 = nested2.isNested();
        boolean boolean7 = nested2.isIncludeInParent();
        boolean boolean8 = nested2.isIncludeInParent();
        boolean boolean9 = nested2.isNested();
        boolean boolean10 = nested2.isIncludeInRoot();
        boolean boolean11 = nested2.isIncludeInRoot();
        boolean boolean12 = nested2.isIncludeInRoot();
        boolean boolean13 = nested2.isIncludeInParent();
        boolean boolean14 = nested2.isIncludeInParent();
        boolean boolean15 = nested2.isIncludeInRoot();
        boolean boolean16 = nested2.isIncludeInParent();
        boolean boolean17 = nested2.isIncludeInRoot();
        boolean boolean18 = nested2.isIncludeInRoot();
        boolean boolean19 = nested2.isNested();
        boolean boolean20 = nested2.isNested();
        boolean boolean21 = nested2.isIncludeInRoot();
        java.lang.Class<?> wildcardClass22 = nested2.getClass();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test24094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24094");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean11 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str12 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str13 = nestedInnerQueryParseSupport1.getPath();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test24095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24095");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(true, false);
        boolean boolean3 = nested2.isIncludeInRoot();
        boolean boolean4 = nested2.isIncludeInRoot();
        boolean boolean5 = nested2.isIncludeInParent();
        boolean boolean6 = nested2.isIncludeInParent();
        boolean boolean7 = nested2.isNested();
        boolean boolean8 = nested2.isIncludeInParent();
        boolean boolean9 = nested2.isIncludeInParent();
        boolean boolean10 = nested2.isIncludeInParent();
        boolean boolean11 = nested2.isIncludeInParent();
        boolean boolean12 = nested2.isIncludeInRoot();
        boolean boolean13 = nested2.isNested();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test24096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24096");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str8 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("nested");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test24097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24097");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str9 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str10 = nestedInnerQueryParseSupport1.getPath();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test24098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24098");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test24099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24099");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.Class<?> wildcardClass10 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test24100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24100");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test24101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24101");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean11 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean13 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean14 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper16 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(objectMapper15);
        org.junit.Assert.assertNull(objectMapper16);
    }

    @Test
    public void test24102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24102");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean12 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean14 = nestedInnerQueryParseSupport1.filterFound();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test24103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24103");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(true, false);
        boolean boolean3 = nested2.isIncludeInRoot();
        boolean boolean4 = nested2.isIncludeInRoot();
        boolean boolean5 = nested2.isNested();
        boolean boolean6 = nested2.isIncludeInParent();
        boolean boolean7 = nested2.isIncludeInRoot();
        boolean boolean8 = nested2.isIncludeInParent();
        boolean boolean9 = nested2.isIncludeInParent();
        boolean boolean10 = nested2.isIncludeInParent();
        java.lang.Class<?> wildcardClass11 = nested2.getClass();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test24104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24104");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str9 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test24105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24105");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test24106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24106");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str10 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str12 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str13 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean14 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean15 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper16 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper17 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean18 = nestedInnerQueryParseSupport1.filterFound();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(objectMapper16);
        org.junit.Assert.assertNull(objectMapper17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test24107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24107");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test24108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24108");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(true, false);
        boolean boolean3 = nested2.isNested();
        boolean boolean4 = nested2.isNested();
        boolean boolean5 = nested2.isNested();
        boolean boolean6 = nested2.isIncludeInParent();
        boolean boolean7 = nested2.isIncludeInParent();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test24109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24109");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str9 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean11 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str12 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str13 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean15 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str16 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean17 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean18 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query19 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(objectMapper14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test24110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24110");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = objectMapper7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test24111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24111");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str8 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean11 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str12 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test24112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24112");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str11 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str15 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean16 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertNull(objectMapper14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test24113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24113");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str10 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean11 = nestedInnerQueryParseSupport1.filterFound();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test24114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24114");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str12 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean14 = nestedInnerQueryParseSupport1.queryFound();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test24115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24115");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test24116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24116");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.Class<?> wildcardClass10 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test24117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24117");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str10 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str11 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test24118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24118");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(true, false);
        boolean boolean3 = nested2.isIncludeInRoot();
        boolean boolean4 = nested2.isIncludeInRoot();
        boolean boolean5 = nested2.isIncludeInRoot();
        boolean boolean6 = nested2.isNested();
        boolean boolean7 = nested2.isIncludeInParent();
        boolean boolean8 = nested2.isIncludeInRoot();
        boolean boolean9 = nested2.isNested();
        boolean boolean10 = nested2.isNested();
        boolean boolean11 = nested2.isIncludeInParent();
        boolean boolean12 = nested2.isIncludeInParent();
        boolean boolean13 = nested2.isNested();
        boolean boolean14 = nested2.isIncludeInParent();
        boolean boolean15 = nested2.isNested();
        boolean boolean16 = nested2.isIncludeInRoot();
        boolean boolean17 = nested2.isIncludeInRoot();
        boolean boolean18 = nested2.isIncludeInParent();
        boolean boolean19 = nested2.isNested();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test24119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24119");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean12 = nestedInnerQueryParseSupport1.filterFound();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test24120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24120");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str11 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test24121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24121");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean12 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str14 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(objectMapper15);
    }

    @Test
    public void test24122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24122");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str12 = nestedInnerQueryParseSupport1.getPath();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test24123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24123");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str13 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean14 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.Class<?> wildcardClass15 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test24124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24124");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str8 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test24125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24125");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str8 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test24126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24126");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(false, false);
        boolean boolean3 = nested2.isNested();
        boolean boolean4 = nested2.isIncludeInParent();
        boolean boolean5 = nested2.isNested();
        boolean boolean6 = nested2.isNested();
        boolean boolean7 = nested2.isNested();
        boolean boolean8 = nested2.isIncludeInRoot();
        boolean boolean9 = nested2.isNested();
        boolean boolean10 = nested2.isNested();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test24127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24127");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str9 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str12 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test24128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24128");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(true, false);
        boolean boolean3 = nested2.isIncludeInRoot();
        boolean boolean4 = nested2.isIncludeInRoot();
        boolean boolean5 = nested2.isIncludeInRoot();
        boolean boolean6 = nested2.isIncludeInRoot();
        boolean boolean7 = nested2.isIncludeInRoot();
        boolean boolean8 = nested2.isIncludeInParent();
        boolean boolean9 = nested2.isNested();
        boolean boolean10 = nested2.isIncludeInParent();
        boolean boolean11 = nested2.isIncludeInRoot();
        boolean boolean12 = nested2.isIncludeInParent();
        boolean boolean13 = nested2.isIncludeInParent();
        boolean boolean14 = nested2.isIncludeInRoot();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test24129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24129");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(true, false);
        boolean boolean3 = nested2.isIncludeInRoot();
        boolean boolean4 = nested2.isNested();
        boolean boolean5 = nested2.isIncludeInParent();
        boolean boolean6 = nested2.isIncludeInRoot();
        boolean boolean7 = nested2.isIncludeInParent();
        boolean boolean8 = nested2.isIncludeInRoot();
        boolean boolean9 = nested2.isIncludeInRoot();
        boolean boolean10 = nested2.isNested();
        boolean boolean11 = nested2.isIncludeInRoot();
        boolean boolean12 = nested2.isNested();
        boolean boolean13 = nested2.isIncludeInRoot();
        boolean boolean14 = nested2.isIncludeInParent();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test24130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24130");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str9 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test24131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24131");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(true, false);
        boolean boolean3 = nested2.isIncludeInRoot();
        boolean boolean4 = nested2.isIncludeInRoot();
        boolean boolean5 = nested2.isIncludeInRoot();
        boolean boolean6 = nested2.isNested();
        boolean boolean7 = nested2.isNested();
        boolean boolean8 = nested2.isIncludeInParent();
        boolean boolean9 = nested2.isNested();
        boolean boolean10 = nested2.isNested();
        boolean boolean11 = nested2.isIncludeInRoot();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test24132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24132");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test24133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24133");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test24134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24134");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str10 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str12 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper16 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper17 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertNull(objectMapper14);
        org.junit.Assert.assertNull(objectMapper15);
        org.junit.Assert.assertNull(objectMapper16);
        org.junit.Assert.assertNull(objectMapper17);
    }

    @Test
    public void test24135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24135");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(false, false);
        boolean boolean3 = nested2.isNested();
        boolean boolean4 = nested2.isIncludeInParent();
        boolean boolean5 = nested2.isIncludeInRoot();
        boolean boolean6 = nested2.isNested();
        boolean boolean7 = nested2.isIncludeInParent();
        boolean boolean8 = nested2.isIncludeInParent();
        boolean boolean9 = nested2.isIncludeInParent();
        boolean boolean10 = nested2.isIncludeInParent();
        boolean boolean11 = nested2.isNested();
        boolean boolean12 = nested2.isIncludeInParent();
        boolean boolean13 = nested2.isIncludeInParent();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test24136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24136");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test24137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24137");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str13 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean15 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(objectMapper14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test24138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24138");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test24139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24139");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(false, true);
        boolean boolean3 = nested2.isIncludeInRoot();
        boolean boolean4 = nested2.isNested();
        boolean boolean5 = nested2.isIncludeInRoot();
        boolean boolean6 = nested2.isNested();
        boolean boolean7 = nested2.isNested();
        boolean boolean8 = nested2.isIncludeInParent();
        boolean boolean9 = nested2.isIncludeInRoot();
        boolean boolean10 = nested2.isIncludeInRoot();
        boolean boolean11 = nested2.isIncludeInParent();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test24140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24140");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test24141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24141");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean11 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean13 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(objectMapper14);
    }

    @Test
    public void test24142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24142");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test24143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24143");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test24144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24144");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str9 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean13 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test24145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24145");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(false, true);
        boolean boolean3 = nested2.isIncludeInRoot();
        boolean boolean4 = nested2.isIncludeInRoot();
        boolean boolean5 = nested2.isIncludeInRoot();
        boolean boolean6 = nested2.isIncludeInRoot();
        boolean boolean7 = nested2.isIncludeInRoot();
        boolean boolean8 = nested2.isNested();
        boolean boolean9 = nested2.isIncludeInRoot();
        boolean boolean10 = nested2.isNested();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test24146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24146");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test24147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24147");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test24148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24148");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str11 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean15 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean16 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper17 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertNull(objectMapper14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(objectMapper17);
    }

    @Test
    public void test24149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24149");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test24150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24150");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(true, false);
        boolean boolean3 = nested2.isIncludeInRoot();
        boolean boolean4 = nested2.isIncludeInRoot();
        boolean boolean5 = nested2.isIncludeInRoot();
        boolean boolean6 = nested2.isIncludeInParent();
        boolean boolean7 = nested2.isNested();
        boolean boolean8 = nested2.isIncludeInParent();
        boolean boolean9 = nested2.isNested();
        boolean boolean10 = nested2.isIncludeInParent();
        boolean boolean11 = nested2.isIncludeInParent();
        boolean boolean12 = nested2.isNested();
        boolean boolean13 = nested2.isIncludeInRoot();
        boolean boolean14 = nested2.isNested();
        boolean boolean15 = nested2.isNested();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test24151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24151");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str11 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test24152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24152");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str9 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str11 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str12 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean15 = nestedInnerQueryParseSupport1.queryFound();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertNull(objectMapper14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test24153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24153");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(true, false);
        boolean boolean3 = nested2.isIncludeInRoot();
        boolean boolean4 = nested2.isIncludeInRoot();
        boolean boolean5 = nested2.isIncludeInRoot();
        boolean boolean6 = nested2.isIncludeInRoot();
        boolean boolean7 = nested2.isIncludeInRoot();
        boolean boolean8 = nested2.isIncludeInParent();
        boolean boolean9 = nested2.isIncludeInParent();
        boolean boolean10 = nested2.isIncludeInParent();
        boolean boolean11 = nested2.isIncludeInParent();
        boolean boolean12 = nested2.isNested();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test24154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24154");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str8 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean12 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str13 = nestedInnerQueryParseSupport1.getPath();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test24155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24155");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(true, false);
        boolean boolean3 = nested2.isIncludeInRoot();
        boolean boolean4 = nested2.isIncludeInRoot();
        boolean boolean5 = nested2.isIncludeInParent();
        boolean boolean6 = nested2.isNested();
        boolean boolean7 = nested2.isIncludeInRoot();
        boolean boolean8 = nested2.isNested();
        boolean boolean9 = nested2.isNested();
        boolean boolean10 = nested2.isNested();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test24156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24156");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test24157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24157");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str9 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean12 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean14 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str15 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean16 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test24158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24158");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str9 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean11 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test24159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24159");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str9 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str11 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean13 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean14 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean16 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(objectMapper15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test24160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24160");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str10 = nestedInnerQueryParseSupport1.getPath();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test24161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24161");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper2 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str8 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = objectMapper9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectMapper2);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test24162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24162");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test24163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24163");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test24164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24164");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str9 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean11 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean12 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean13 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str15 = nestedInnerQueryParseSupport1.getPath();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(objectMapper14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test24165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24165");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test24166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24166");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str9 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test24167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24167");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str9 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean12 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean14 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str15 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query16 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test24168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24168");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str9 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str11 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean12 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test24169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24169");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str8 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str9 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str12 = nestedInnerQueryParseSupport1.getPath();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test24170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24170");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test24171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24171");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str8 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str9 = nestedInnerQueryParseSupport1.getPath();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test24172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24172");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test24173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24173");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str9 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean11 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean12 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str14 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str15 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test24174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24174");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str10 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean11 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean13 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean15 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean16 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean17 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query18 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(objectMapper14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test24175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24175");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str12 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test24176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24176");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str9 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str10 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean12 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str13 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(objectMapper14);
        org.junit.Assert.assertNull(objectMapper15);
    }

    @Test
    public void test24177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24177");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(true, false);
        boolean boolean3 = nested2.isIncludeInRoot();
        boolean boolean4 = nested2.isIncludeInRoot();
        boolean boolean5 = nested2.isIncludeInRoot();
        boolean boolean6 = nested2.isIncludeInParent();
        boolean boolean7 = nested2.isNested();
        boolean boolean8 = nested2.isIncludeInParent();
        boolean boolean9 = nested2.isNested();
        boolean boolean10 = nested2.isIncludeInParent();
        boolean boolean11 = nested2.isIncludeInParent();
        boolean boolean12 = nested2.isIncludeInParent();
        boolean boolean13 = nested2.isIncludeInParent();
        boolean boolean14 = nested2.isIncludeInParent();
        java.lang.Class<?> wildcardClass15 = nested2.getClass();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test24178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24178");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str9 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test24179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24179");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str11 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean12 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test24180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24180");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test24181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24181");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean12 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.Class<?> wildcardClass13 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test24182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24182");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test24183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24183");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested0 = org.elasticsearch.index.mapper.object.ObjectMapper.Defaults.NESTED;
        boolean boolean1 = nested0.isIncludeInParent();
        boolean boolean2 = nested0.isNested();
        boolean boolean3 = nested0.isNested();
        boolean boolean4 = nested0.isNested();
        boolean boolean5 = nested0.isNested();
        boolean boolean6 = nested0.isIncludeInRoot();
        boolean boolean7 = nested0.isIncludeInRoot();
        boolean boolean8 = nested0.isIncludeInParent();
        boolean boolean9 = nested0.isNested();
        boolean boolean10 = nested0.isIncludeInRoot();
        boolean boolean11 = nested0.isNested();
        org.junit.Assert.assertNotNull(nested0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test24184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24184");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test24185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24185");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str8 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str9 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("nested");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test24186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24186");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested0 = org.elasticsearch.index.mapper.object.ObjectMapper.Defaults.NESTED;
        boolean boolean1 = nested0.isIncludeInParent();
        boolean boolean2 = nested0.isNested();
        boolean boolean3 = nested0.isNested();
        boolean boolean4 = nested0.isNested();
        boolean boolean5 = nested0.isNested();
        boolean boolean6 = nested0.isIncludeInParent();
        boolean boolean7 = nested0.isNested();
        boolean boolean8 = nested0.isNested();
        boolean boolean9 = nested0.isIncludeInParent();
        boolean boolean10 = nested0.isIncludeInRoot();
        boolean boolean11 = nested0.isIncludeInParent();
        boolean boolean12 = nested0.isNested();
        boolean boolean13 = nested0.isNested();
        boolean boolean14 = nested0.isNested();
        org.junit.Assert.assertNotNull(nested0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test24187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24187");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str8 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test24188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24188");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested0 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.NO;
        boolean boolean1 = nested0.isNested();
        boolean boolean2 = nested0.isIncludeInRoot();
        boolean boolean3 = nested0.isIncludeInRoot();
        boolean boolean4 = nested0.isNested();
        boolean boolean5 = nested0.isIncludeInRoot();
        boolean boolean6 = nested0.isIncludeInRoot();
        boolean boolean7 = nested0.isIncludeInParent();
        boolean boolean8 = nested0.isIncludeInParent();
        boolean boolean9 = nested0.isIncludeInRoot();
        boolean boolean10 = nested0.isIncludeInParent();
        boolean boolean11 = nested0.isIncludeInRoot();
        boolean boolean12 = nested0.isIncludeInParent();
        org.junit.Assert.assertNotNull(nested0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test24189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24189");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test24190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24190");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str9 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str11 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str12 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test24191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24191");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str8 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test24192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24192");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str10 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str11 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean12 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str13 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean14 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(objectMapper15);
    }

    @Test
    public void test24193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24193");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(true, false);
        boolean boolean3 = nested2.isIncludeInRoot();
        boolean boolean4 = nested2.isNested();
        boolean boolean5 = nested2.isIncludeInParent();
        boolean boolean6 = nested2.isIncludeInRoot();
        boolean boolean7 = nested2.isIncludeInRoot();
        boolean boolean8 = nested2.isIncludeInParent();
        boolean boolean9 = nested2.isIncludeInRoot();
        boolean boolean10 = nested2.isNested();
        boolean boolean11 = nested2.isIncludeInRoot();
        boolean boolean12 = nested2.isIncludeInRoot();
        boolean boolean13 = nested2.isNested();
        boolean boolean14 = nested2.isIncludeInRoot();
        boolean boolean15 = nested2.isNested();
        boolean boolean16 = nested2.isIncludeInParent();
        boolean boolean17 = nested2.isIncludeInRoot();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test24194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24194");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str9 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean14 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str15 = nestedInnerQueryParseSupport1.getPath();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test24195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24195");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str11 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str13 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean14 = nestedInnerQueryParseSupport1.queryFound();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test24196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24196");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str8 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str9 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean11 = nestedInnerQueryParseSupport1.filterFound();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test24197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24197");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str11 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean12 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean14 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test24198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24198");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str10 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test24199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24199");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(false, false);
        boolean boolean3 = nested2.isIncludeInParent();
        boolean boolean4 = nested2.isIncludeInParent();
        boolean boolean5 = nested2.isIncludeInRoot();
        boolean boolean6 = nested2.isIncludeInRoot();
        boolean boolean7 = nested2.isNested();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test24200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24200");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(true, false);
        boolean boolean3 = nested2.isIncludeInRoot();
        boolean boolean4 = nested2.isIncludeInRoot();
        boolean boolean5 = nested2.isIncludeInRoot();
        boolean boolean6 = nested2.isNested();
        boolean boolean7 = nested2.isIncludeInParent();
        boolean boolean8 = nested2.isIncludeInParent();
        boolean boolean9 = nested2.isIncludeInRoot();
        boolean boolean10 = nested2.isIncludeInParent();
        boolean boolean11 = nested2.isIncludeInParent();
        boolean boolean12 = nested2.isNested();
        boolean boolean13 = nested2.isNested();
        boolean boolean14 = nested2.isIncludeInParent();
        boolean boolean15 = nested2.isIncludeInRoot();
        boolean boolean16 = nested2.isIncludeInParent();
        boolean boolean17 = nested2.isNested();
        boolean boolean18 = nested2.isNested();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test24201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24201");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str11 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str12 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean14 = nestedInnerQueryParseSupport1.queryFound();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test24202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24202");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean12 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test24203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24203");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test24204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24204");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(true, false);
        boolean boolean3 = nested2.isNested();
        boolean boolean4 = nested2.isIncludeInRoot();
        boolean boolean5 = nested2.isNested();
        boolean boolean6 = nested2.isIncludeInParent();
        boolean boolean7 = nested2.isNested();
        boolean boolean8 = nested2.isIncludeInRoot();
        java.lang.Class<?> wildcardClass9 = nested2.getClass();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test24205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24205");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str12 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test24206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24206");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str8 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test24207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24207");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str9 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean13 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str14 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean15 = nestedInnerQueryParseSupport1.filterFound();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test24208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24208");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test24209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24209");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(true, true);
        boolean boolean3 = nested2.isIncludeInParent();
        boolean boolean4 = nested2.isIncludeInParent();
        boolean boolean5 = nested2.isIncludeInRoot();
        boolean boolean6 = nested2.isNested();
        boolean boolean7 = nested2.isNested();
        boolean boolean8 = nested2.isNested();
        boolean boolean9 = nested2.isIncludeInRoot();
        boolean boolean10 = nested2.isNested();
        boolean boolean11 = nested2.isIncludeInParent();
        boolean boolean12 = nested2.isIncludeInParent();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test24210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24210");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(true, false);
        boolean boolean3 = nested2.isIncludeInRoot();
        boolean boolean4 = nested2.isIncludeInRoot();
        boolean boolean5 = nested2.isIncludeInRoot();
        boolean boolean6 = nested2.isNested();
        boolean boolean7 = nested2.isIncludeInParent();
        boolean boolean8 = nested2.isIncludeInParent();
        boolean boolean9 = nested2.isNested();
        boolean boolean10 = nested2.isIncludeInRoot();
        boolean boolean11 = nested2.isIncludeInRoot();
        boolean boolean12 = nested2.isIncludeInRoot();
        boolean boolean13 = nested2.isIncludeInRoot();
        boolean boolean14 = nested2.isNested();
        boolean boolean15 = nested2.isNested();
        boolean boolean16 = nested2.isNested();
        boolean boolean17 = nested2.isIncludeInRoot();
        boolean boolean18 = nested2.isNested();
        java.lang.Class<?> wildcardClass19 = nested2.getClass();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test24211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24211");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test24212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24212");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(true, false);
        boolean boolean3 = nested2.isIncludeInRoot();
        boolean boolean4 = nested2.isNested();
        boolean boolean5 = nested2.isIncludeInParent();
        boolean boolean6 = nested2.isIncludeInRoot();
        boolean boolean7 = nested2.isIncludeInParent();
        boolean boolean8 = nested2.isIncludeInParent();
        boolean boolean9 = nested2.isIncludeInParent();
        boolean boolean10 = nested2.isNested();
        boolean boolean11 = nested2.isIncludeInRoot();
        boolean boolean12 = nested2.isIncludeInParent();
        boolean boolean13 = nested2.isIncludeInParent();
        boolean boolean14 = nested2.isIncludeInRoot();
        boolean boolean15 = nested2.isIncludeInRoot();
        boolean boolean16 = nested2.isIncludeInRoot();
        boolean boolean17 = nested2.isNested();
        boolean boolean18 = nested2.isNested();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test24213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24213");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertNull(objectMapper14);
    }

    @Test
    public void test24214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24214");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(true, false);
        boolean boolean3 = nested2.isIncludeInRoot();
        boolean boolean4 = nested2.isIncludeInRoot();
        boolean boolean5 = nested2.isIncludeInRoot();
        boolean boolean6 = nested2.isNested();
        boolean boolean7 = nested2.isIncludeInParent();
        boolean boolean8 = nested2.isIncludeInParent();
        boolean boolean9 = nested2.isIncludeInRoot();
        boolean boolean10 = nested2.isIncludeInRoot();
        boolean boolean11 = nested2.isIncludeInParent();
        boolean boolean12 = nested2.isNested();
        boolean boolean13 = nested2.isIncludeInParent();
        boolean boolean14 = nested2.isIncludeInRoot();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test24215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24215");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str10 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test24216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24216");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str12 = nestedInnerQueryParseSupport1.getPath();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test24217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24217");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test24218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest48.test24218");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(str7);
    }
}

