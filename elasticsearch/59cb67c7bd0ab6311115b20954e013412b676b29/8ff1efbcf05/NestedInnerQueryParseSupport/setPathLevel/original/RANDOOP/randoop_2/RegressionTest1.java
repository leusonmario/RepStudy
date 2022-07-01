import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test00501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00501");
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test00502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00502");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00503");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00504");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
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
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00505");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.getInnerFilter();
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
    }

    @Test
    public void test00506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00506");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(true, false);
        boolean boolean3 = nested2.isIncludeInRoot();
        boolean boolean4 = nested2.isIncludeInRoot();
        boolean boolean5 = nested2.isIncludeInRoot();
        boolean boolean6 = nested2.isNested();
        boolean boolean7 = nested2.isIncludeInParent();
        boolean boolean8 = nested2.isIncludeInParent();
        boolean boolean9 = nested2.isIncludeInRoot();
        java.lang.Class<?> wildcardClass10 = nested2.getClass();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00507");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport1.getInnerQuery();
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
    }

    @Test
    public void test00508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00508");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("object");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test00509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00509");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
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
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00510");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("object");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test00511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00511");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00512");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
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
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test00513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00513");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test00514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00514");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test00515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00515");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = objectMapper7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test00516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00516");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str8 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("");
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
    }

    @Test
    public void test00517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00517");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
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
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test00518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00518");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
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
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test00519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00519");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport1.getInnerQuery();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00520");
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
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00521");
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
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test00522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00522");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("nested");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00523");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test00524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00524");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
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
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00525");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str8 = nestedInnerQueryParseSupport1.getPath();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00526");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00527");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00528");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
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
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test00529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00529");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("object");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00530");
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
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("nested");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test00531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00531");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.getInnerQuery();
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
    }

    @Test
    public void test00532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00532");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.getInnerFilter();
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
    }

    @Test
    public void test00533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00533");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00534");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test00535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00535");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.getInnerFilter();
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
    }

    @Test
    public void test00536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00536");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test00537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00537");
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test00538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00538");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str8 = nestedInnerQueryParseSupport1.getPath();
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
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00539");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test00540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00540");
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
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00541");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = objectMapper6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test00542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00542");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test00543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00543");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.getInnerQuery();
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
    public void test00544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00544");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00545");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("object");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00546");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test00547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00547");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(true, false);
        boolean boolean3 = nested2.isNested();
        boolean boolean4 = nested2.isIncludeInParent();
        boolean boolean5 = nested2.isNested();
        java.lang.Class<?> wildcardClass6 = nested2.getClass();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00548");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str11 = nestedInnerQueryParseSupport1.getPath();
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
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00549");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested0 = org.elasticsearch.index.mapper.object.ObjectMapper.Defaults.NESTED;
        boolean boolean1 = nested0.isIncludeInParent();
        boolean boolean2 = nested0.isNested();
        boolean boolean3 = nested0.isNested();
        boolean boolean4 = nested0.isNested();
        boolean boolean5 = nested0.isNested();
        boolean boolean6 = nested0.isIncludeInParent();
        java.lang.Class<?> wildcardClass7 = nested0.getClass();
        org.junit.Assert.assertNotNull(nested0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00550");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00551");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
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
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00552");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
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
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test00553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00553");
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
        java.lang.Class<?> wildcardClass10 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00554");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00555");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.Class<?> wildcardClass9 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00556");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str8 = nestedInnerQueryParseSupport1.getPath();
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
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00557");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
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
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00558");
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
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00559");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str8 = nestedInnerQueryParseSupport1.getPath();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test00560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00560");
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00561");
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
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00562");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.Class<?> wildcardClass8 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00563");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getParentObjectMapper();
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
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test00564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00564");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test00565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00565");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
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
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00566");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test00567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00567");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00568");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = objectMapper6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test00569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00569");
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
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00570");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport1.getInnerQuery();
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
    }

    @Test
    public void test00571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00571");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
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
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00572");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00573");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.getInnerQuery();
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
    }

    @Test
    public void test00574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00574");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00575");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str8 = nestedInnerQueryParseSupport1.getPath();
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
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00576");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.Class<?> wildcardClass4 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00577");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
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
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00578");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
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
    }

    @Test
    public void test00579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00579");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
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
    }

    @Test
    public void test00580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00580");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00581");
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
        java.lang.String str10 = nestedInnerQueryParseSupport1.getPath();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00582");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test00583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00583");
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
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00584");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str8 = nestedInnerQueryParseSupport1.getPath();
        java.lang.Class<?> wildcardClass9 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00585");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test00586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00586");
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
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test00587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00587");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.getInnerFilter();
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
    }

    @Test
    public void test00588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00588");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.getInnerQuery();
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
    }

    @Test
    public void test00589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00589");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getParentObjectMapper();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test00590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00590");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.Class<?> wildcardClass10 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00591");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str8 = nestedInnerQueryParseSupport1.getPath();
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
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test00592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00592");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00593");
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
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00594");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.Class<?> wildcardClass8 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00595");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00596");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested0 = org.elasticsearch.index.mapper.object.ObjectMapper.Defaults.NESTED;
        boolean boolean1 = nested0.isIncludeInParent();
        boolean boolean2 = nested0.isNested();
        boolean boolean3 = nested0.isNested();
        boolean boolean4 = nested0.isIncludeInRoot();
        java.lang.Class<?> wildcardClass5 = nested0.getClass();
        org.junit.Assert.assertNotNull(nested0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00597");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
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
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test00598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00598");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test00599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00599");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00600");
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
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test00601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00601");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        java.lang.Class<?> wildcardClass5 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00602");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test00603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00603");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.getInnerQuery();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00604");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str8 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.getInnerFilter();
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
    }

    @Test
    public void test00605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00605");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00606");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str9 = nestedInnerQueryParseSupport1.getPath();
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
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00607");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
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
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test00608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00608");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.getInnerQuery();
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
    }

    @Test
    public void test00609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00609");
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
        java.lang.Class<?> wildcardClass10 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00610");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00611");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00612");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.getInnerFilter();
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
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test00613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00613");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.Class<?> wildcardClass6 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00614");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test00615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00615");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
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
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test00616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00616");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
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
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test00617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00617");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport1.getInnerQuery();
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
    }

    @Test
    public void test00618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00618");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
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
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test00619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00619");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test00620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00620");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("object");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00621");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("nested");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00622");
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
        java.lang.String str10 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean11 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("nested");
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
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00623");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str8 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00624");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
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
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test00625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00625");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(true, false);
        boolean boolean3 = nested2.isIncludeInRoot();
        boolean boolean4 = nested2.isIncludeInRoot();
        boolean boolean5 = nested2.isIncludeInRoot();
        boolean boolean6 = nested2.isNested();
        boolean boolean7 = nested2.isIncludeInParent();
        boolean boolean8 = nested2.isIncludeInRoot();
        boolean boolean9 = nested2.isIncludeInParent();
        boolean boolean10 = nested2.isNested();
        java.lang.Class<?> wildcardClass11 = nested2.getClass();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00626");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.Class<?> wildcardClass7 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00627");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str11 = nestedInnerQueryParseSupport1.getPath();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00628");
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
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test00629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00629");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.getInnerFilter();
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
    }

    @Test
    public void test00630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00630");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test00631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00631");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str8 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str10 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.getInnerQuery();
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
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00632");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test00633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00633");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.Class<?> wildcardClass8 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00634");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00635");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("object");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00636");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
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
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test00637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00637");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str8 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.getInnerFilter();
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
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test00638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00638");
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
        boolean boolean13 = nested2.isIncludeInParent();
        boolean boolean14 = nested2.isIncludeInParent();
        boolean boolean15 = nested2.isIncludeInRoot();
        java.lang.Class<?> wildcardClass16 = nested2.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00639");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = objectMapper11.getClass();
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
    }

    @Test
    public void test00640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00640");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test00641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00641");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
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
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00642");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00643");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00644");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
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
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test00645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00645");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper2 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectMapper2);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test00646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00646");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00647");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested0 = org.elasticsearch.index.mapper.object.ObjectMapper.Defaults.NESTED;
        boolean boolean1 = nested0.isIncludeInRoot();
        boolean boolean2 = nested0.isNested();
        boolean boolean3 = nested0.isIncludeInParent();
        java.lang.Class<?> wildcardClass4 = nested0.getClass();
        org.junit.Assert.assertNotNull(nested0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00648");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00649");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test00650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00650");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str8 = nestedInnerQueryParseSupport1.getPath();
        java.lang.Class<?> wildcardClass9 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00651");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
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
    }

    @Test
    public void test00652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00652");
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
        java.lang.Class<?> wildcardClass15 = nested2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00653");
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
    }

    @Test
    public void test00654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00654");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("nested");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00655");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = objectMapper6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test00656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00656");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
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
    }

    @Test
    public void test00657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00657");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
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
    }

    @Test
    public void test00658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00658");
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
        java.lang.Class<?> wildcardClass11 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00659");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
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
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test00660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00660");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.Class<?> wildcardClass9 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00661");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00662");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean13 = nestedInnerQueryParseSupport1.queryFound();
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
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00663");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str8 = nestedInnerQueryParseSupport1.getPath();
        java.lang.Class<?> wildcardClass9 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00664");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.getInnerQuery();
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
    }

    @Test
    public void test00665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00665");
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
    }

    @Test
    public void test00666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00666");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
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
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00667");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(true, true);
        boolean boolean3 = nested2.isNested();
        java.lang.Class<?> wildcardClass4 = nested2.getClass();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00668");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
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
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test00669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00669");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test00670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00670");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.Class<?> wildcardClass9 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00671");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("nested");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test00672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00672");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.Class<?> wildcardClass9 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00673");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.Class<?> wildcardClass9 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00674");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
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
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test00675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00675");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00676");
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
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test00677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00677");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test00678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00678");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test00679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00679");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("nested");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test00680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00680");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getParentObjectMapper();
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
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test00681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00681");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
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
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test00682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00682");
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
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00683");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00684");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test00685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00685");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test00686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00686");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("nested");
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
    }

    @Test
    public void test00687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00687");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00688");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00689");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper2 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectMapper2);
        org.junit.Assert.assertNull(objectMapper3);
    }

    @Test
    public void test00690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00690");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.Class<?> wildcardClass8 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00691");
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
        java.lang.String str13 = nestedInnerQueryParseSupport1.getPath();
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
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00692");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("nested");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00693");
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
        java.lang.String str13 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport1.getInnerFilter();
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
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00694");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = objectMapper10.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test00695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00695");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
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
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test00696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00696");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("nested");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test00697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00697");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("object");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test00698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00698");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport1.getInnerFilter();
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
    }

    @Test
    public void test00699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00699");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test00700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00700");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getParentObjectMapper();
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
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test00701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00701");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = objectMapper8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test00702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00702");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test00703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00703");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
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
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00704");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(true, false);
        boolean boolean3 = nested2.isNested();
        boolean boolean4 = nested2.isIncludeInRoot();
        boolean boolean5 = nested2.isNested();
        boolean boolean6 = nested2.isIncludeInParent();
        boolean boolean7 = nested2.isNested();
        boolean boolean8 = nested2.isIncludeInRoot();
        boolean boolean9 = nested2.isNested();
        boolean boolean10 = nested2.isIncludeInRoot();
        java.lang.Class<?> wildcardClass11 = nested2.getClass();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00705");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.Class<?> wildcardClass8 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00706");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("object");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00707");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound();
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
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00708");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper2 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectMapper2);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00709");
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
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00710");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
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
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test00711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00711");
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
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("nested");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00712");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
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
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00713");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.getInnerFilter();
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
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test00714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00714");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
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
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test00715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00715");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper2 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectMapper2);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00716");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.getInnerFilter();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00717");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
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
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test00718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00718");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test00719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00719");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00720");
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
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport1.getInnerQuery();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00721");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str10 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean12 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.Class<?> wildcardClass13 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00722");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.Class<?> wildcardClass7 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00723");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
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
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test00724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00724");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(true, true);
        boolean boolean3 = nested2.isNested();
        boolean boolean4 = nested2.isIncludeInParent();
        java.lang.Class<?> wildcardClass5 = nested2.getClass();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00725");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
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
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00726");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
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
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test00727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00727");
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
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00728");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(true, false);
        boolean boolean3 = nested2.isIncludeInRoot();
        boolean boolean4 = nested2.isIncludeInRoot();
        boolean boolean5 = nested2.isIncludeInParent();
        boolean boolean6 = nested2.isNested();
        boolean boolean7 = nested2.isIncludeInRoot();
        boolean boolean8 = nested2.isIncludeInParent();
        java.lang.Class<?> wildcardClass9 = nested2.getClass();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00729");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound();
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
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00730");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.getInnerFilter();
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
    }

    @Test
    public void test00731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00731");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("object");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00732");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.getInnerQuery();
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
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test00733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00733");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test00734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00734");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test00735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00735");
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
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound();
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
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00736");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
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
    }

    @Test
    public void test00737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00737");
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
        java.lang.Class<?> wildcardClass10 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00738");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
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
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00739");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test00740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00740");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("object");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test00741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00741");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("nested");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00742");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00743");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
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
    }

    @Test
    public void test00744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00744");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00745");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str8 = nestedInnerQueryParseSupport1.getPath();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00746");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.getInnerFilter();
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
    }

    @Test
    public void test00747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00747");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("");
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
    }

    @Test
    public void test00748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00748");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00749");
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test00750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00750");
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
        java.lang.String str10 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean11 = nestedInnerQueryParseSupport1.filterFound();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00751");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test00752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00752");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str9 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str10 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00753");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(true, false);
        boolean boolean3 = nested2.isIncludeInRoot();
        boolean boolean4 = nested2.isNested();
        boolean boolean5 = nested2.isIncludeInParent();
        boolean boolean6 = nested2.isIncludeInRoot();
        boolean boolean7 = nested2.isIncludeInRoot();
        boolean boolean8 = nested2.isIncludeInParent();
        java.lang.Class<?> wildcardClass9 = nested2.getClass();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00754");
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
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00755");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
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
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test00756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00756");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.Class<?> wildcardClass9 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00757");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = objectMapper8.getClass();
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
    }

    @Test
    public void test00758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00758");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query16 = nestedInnerQueryParseSupport1.getInnerQuery();
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
    }

    @Test
    public void test00759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00759");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test00760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00760");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
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
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test00761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00761");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.Class<?> wildcardClass7 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00762");
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
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00763");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test00764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00764");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.getInnerFilter();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00765");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str9 = nestedInnerQueryParseSupport1.getPath();
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
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00766");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.Class<?> wildcardClass8 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00767");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(true, false);
        boolean boolean3 = nested2.isIncludeInRoot();
        boolean boolean4 = nested2.isIncludeInRoot();
        boolean boolean5 = nested2.isIncludeInRoot();
        boolean boolean6 = nested2.isIncludeInParent();
        boolean boolean7 = nested2.isNested();
        boolean boolean8 = nested2.isIncludeInParent();
        java.lang.Class<?> wildcardClass9 = nested2.getClass();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00768");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00769");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.Class<?> wildcardClass8 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00770");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test00771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00771");
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
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00772");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
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
    }

    @Test
    public void test00773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00773");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getParentObjectMapper();
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
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test00774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00774");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
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
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test00775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00775");
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
        java.lang.String str13 = nestedInnerQueryParseSupport1.getPath();
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
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00776");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getParentObjectMapper();
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
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test00777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00777");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
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
    }

    @Test
    public void test00778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00778");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00779");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.Class<?> wildcardClass9 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00780");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(false, true);
        java.lang.Class<?> wildcardClass3 = nested2.getClass();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00781");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
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
    }

    @Test
    public void test00782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00782");
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
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.getInnerQuery();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00783");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
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
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test00784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00784");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00785");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.getInnerQuery();
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
    }

    @Test
    public void test00786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00786");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00787");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
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
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test00788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00788");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.Class<?> wildcardClass9 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00789");
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
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00790");
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
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("nested");
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
    }

    @Test
    public void test00791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00791");
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
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00792");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test00793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00793");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
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
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test00794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00794");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(true, false);
        boolean boolean3 = nested2.isIncludeInRoot();
        boolean boolean4 = nested2.isIncludeInRoot();
        boolean boolean5 = nested2.isIncludeInParent();
        boolean boolean6 = nested2.isIncludeInRoot();
        java.lang.Class<?> wildcardClass7 = nested2.getClass();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00795");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.getInnerFilter();
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
    }

    @Test
    public void test00796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00796");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00797");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00798");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport1.getInnerQuery();
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
    }

    @Test
    public void test00799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00799");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
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
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test00800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00800");
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
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("nested");
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
    }

    @Test
    public void test00801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00801");
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
        java.lang.Class<?> wildcardClass14 = nested2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00802");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
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
    }

    @Test
    public void test00803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00803");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
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
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00804");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str10 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00805");
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
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00806");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("nested");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test00807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00807");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str8 = nestedInnerQueryParseSupport1.getPath();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00808");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
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
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00809");
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
        boolean boolean14 = nested2.isIncludeInRoot();
        java.lang.Class<?> wildcardClass15 = nested2.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00810");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str11 = nestedInnerQueryParseSupport1.getPath();
        java.lang.Class<?> wildcardClass12 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00811");
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
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("");
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
    }

    @Test
    public void test00812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00812");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
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
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00813");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(true, false);
        boolean boolean3 = nested2.isIncludeInRoot();
        boolean boolean4 = nested2.isIncludeInRoot();
        boolean boolean5 = nested2.isIncludeInRoot();
        boolean boolean6 = nested2.isNested();
        boolean boolean7 = nested2.isIncludeInParent();
        boolean boolean8 = nested2.isIncludeInRoot();
        boolean boolean9 = nested2.isNested();
        boolean boolean10 = nested2.isNested();
        java.lang.Class<?> wildcardClass11 = nested2.getClass();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00814");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00815");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(true, false);
        boolean boolean3 = nested2.isIncludeInRoot();
        boolean boolean4 = nested2.isIncludeInRoot();
        boolean boolean5 = nested2.isIncludeInRoot();
        boolean boolean6 = nested2.isIncludeInParent();
        boolean boolean7 = nested2.isNested();
        boolean boolean8 = nested2.isIncludeInRoot();
        boolean boolean9 = nested2.isIncludeInRoot();
        boolean boolean10 = nested2.isIncludeInParent();
        java.lang.Class<?> wildcardClass11 = nested2.getClass();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00816");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str10 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.Class<?> wildcardClass12 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00817");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.Class<?> wildcardClass8 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00818");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
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
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test00819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00819");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.getInnerQuery();
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
    }

    @Test
    public void test00820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00820");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
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
    }

    @Test
    public void test00821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00821");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00822");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00823");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
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
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test00824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00824");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
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
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00825");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test00826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00826");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.getInnerFilter();
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
    }

    @Test
    public void test00827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00827");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
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
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test00828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00828");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str8 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.getInnerQuery();
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
    }

    @Test
    public void test00829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00829");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
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
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test00830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00830");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport1.getInnerQuery();
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
    }

    @Test
    public void test00831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00831");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
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
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test00832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00832");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.getInnerFilter();
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
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test00833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00833");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.getInnerFilter();
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
    }

    @Test
    public void test00834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00834");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("hi!");
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
    }

    @Test
    public void test00835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00835");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("nested");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00836");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
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
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test00837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00837");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00838");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.Class<?> wildcardClass7 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00839");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.getInnerFilter();
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
    }

    @Test
    public void test00840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00840");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = objectMapper6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test00841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00841");
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
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test00842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00842");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str8 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00843");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getParentObjectMapper();
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
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test00844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00844");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
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
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00845");
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
        boolean boolean15 = nestedInnerQueryParseSupport1.filterFound();
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
    }

    @Test
    public void test00846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00846");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00847");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
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
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00848");
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
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound();
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
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00849");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00850");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("nested");
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
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test00851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00851");
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
        java.lang.Class<?> wildcardClass14 = nestedInnerQueryParseSupport1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00852");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
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
    }

    @Test
    public void test00853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00853");
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
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00854");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test00855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00855");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00856");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
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
    }

    @Test
    public void test00857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00857");
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
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00858");
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
        boolean boolean14 = nestedInnerQueryParseSupport1.filterFound();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00859");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
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
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00860");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
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
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00861");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str10 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.Class<?> wildcardClass12 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00862");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
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
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00863");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test00864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00864");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("object");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test00865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00865");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
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
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test00866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00866");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00867");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00868");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.query();
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
    }

    @Test
    public void test00869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00869");
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
        boolean boolean15 = nested2.isIncludeInRoot();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00870");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound();
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
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00871");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00872");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("object");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00873");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(true, true);
        boolean boolean3 = nested2.isNested();
        boolean boolean4 = nested2.isNested();
        boolean boolean5 = nested2.isIncludeInParent();
        java.lang.Class<?> wildcardClass6 = nested2.getClass();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00874");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
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
    }

    @Test
    public void test00875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00875");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test00876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00876");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
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
    }

    @Test
    public void test00877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00877");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
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
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test00878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00878");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper2 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectMapper2);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00879");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        java.lang.Class<?> wildcardClass7 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00880");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(false, true);
        boolean boolean3 = nested2.isIncludeInRoot();
        boolean boolean4 = nested2.isIncludeInRoot();
        boolean boolean5 = nested2.isIncludeInRoot();
        java.lang.Class<?> wildcardClass6 = nested2.getClass();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00881");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.getInnerFilter();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00882");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
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
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test00883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00883");
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
    }

    @Test
    public void test00884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00884");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str11 = nestedInnerQueryParseSupport1.getPath();
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
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test00885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00885");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
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
    }

    @Test
    public void test00886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00886");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
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
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00887");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("object");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test00888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00888");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00889");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00890");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str8 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00891");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00892");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
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
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00893");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound();
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
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00894");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("object");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test00895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00895");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test00896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00896");
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
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test00897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00897");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00898");
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
        boolean boolean11 = nestedInnerQueryParseSupport1.filterFound();
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
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00899");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.Class<?> wildcardClass6 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00900");
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
        boolean boolean11 = nestedInnerQueryParseSupport1.filterFound();
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
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00901");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test00902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00902");
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
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00903");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00904");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str9 = nestedInnerQueryParseSupport1.getPath();
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
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00905");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test00906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00906");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getParentObjectMapper();
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
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test00907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00907");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        java.lang.Class<?> wildcardClass8 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00908");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
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
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00909");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.Class<?> wildcardClass11 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00910");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.Class<?> wildcardClass9 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00911");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
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
    }

    @Test
    public void test00912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00912");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00913");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
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
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00914");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.getInnerQuery();
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
    }

    @Test
    public void test00915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00915");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
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
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test00916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00916");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
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
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00917");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
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
    }

    @Test
    public void test00918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00918");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00919");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00920");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00921");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00922");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
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
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test00923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00923");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
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
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test00924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00924");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
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
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00925");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.filter();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00926");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str8 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = objectMapper9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test00927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00927");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test00928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00928");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00929");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00930");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean12 = nestedInnerQueryParseSupport1.filterFound();
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
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00931");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.Class<?> wildcardClass8 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00932");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
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
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00933");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
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
    }

    @Test
    public void test00934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00934");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str8 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.getInnerFilter();
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
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00935");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test00936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00936");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(objectMapper3);
    }

    @Test
    public void test00937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00937");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getParentObjectMapper();
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
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test00938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00938");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.Class<?> wildcardClass8 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00939");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("object");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00940");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper2 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectMapper2);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(objectMapper4);
    }

    @Test
    public void test00941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00941");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
    }

    @Test
    public void test00942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00942");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00943");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test00944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00944");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str9 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = objectMapper10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test00945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00945");
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
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00946");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
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
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00947");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.getInnerQuery();
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
    }

    @Test
    public void test00948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00948");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00949");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getParentObjectMapper();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test00950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00950");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.getInnerFilter();
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
    }

    @Test
    public void test00951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00951");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("nested");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00952");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str10 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00953");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00954");
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
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00955");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00956");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00957");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound();
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
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00958");
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
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound();
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
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00959");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.Class<?> wildcardClass6 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00960");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
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
    }

    @Test
    public void test00961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00961");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("object");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00962");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str13 = nestedInnerQueryParseSupport1.getPath();
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
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00963");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound();
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
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00964");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00965");
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
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00966");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00967");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
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
    }

    @Test
    public void test00968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00968");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test00969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00969");
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
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.getInnerFilter();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00970");
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test00971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00971");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
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
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test00972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00972");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.getInnerQuery();
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
    }

    @Test
    public void test00973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00973");
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
        boolean boolean15 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query16 = nestedInnerQueryParseSupport1.getInnerFilter();
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
    }

    @Test
    public void test00974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00974");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.Class<?> wildcardClass8 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00975");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
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
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00976");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test00977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00977");
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
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test00978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00978");
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
        java.lang.Class<?> wildcardClass10 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00979");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00980");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = objectMapper8.getClass();
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
    }

    @Test
    public void test00981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00981");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = objectMapper4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(objectMapper4);
    }

    @Test
    public void test00982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00982");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getParentObjectMapper();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test00983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00983");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00984");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str8 = nestedInnerQueryParseSupport1.getPath();
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
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00985");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(true, false);
        boolean boolean3 = nested2.isIncludeInRoot();
        boolean boolean4 = nested2.isNested();
        boolean boolean5 = nested2.isNested();
        boolean boolean6 = nested2.isNested();
        java.lang.Class<?> wildcardClass7 = nested2.getClass();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00986");
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
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test00987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00987");
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
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00988");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
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
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00989");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00990");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test00991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00991");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.getInnerFilter();
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
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test00992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00992");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.String str2 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str3 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
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
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test00993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00993");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = objectMapper7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test00994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00994");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00995");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.Class<?> wildcardClass9 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00996");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str10 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("nested");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00997");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
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
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00998");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean12 = nestedInnerQueryParseSupport1.filterFound();
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
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00999");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str10 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.getInnerQuery();
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
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test01000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test01000");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.String str4 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.getInnerQuery();
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
    }
}

