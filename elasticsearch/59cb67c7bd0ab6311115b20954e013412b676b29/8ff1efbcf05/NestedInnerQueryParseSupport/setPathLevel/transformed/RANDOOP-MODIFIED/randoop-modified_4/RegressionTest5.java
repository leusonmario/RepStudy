import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test02501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02501");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryParsed;
        org.apache.lucene.search.Filter filter11 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter11);
        org.apache.lucene.search.Filter filter13 = null;
        nestedInnerQueryParseSupport1.childFilter = filter13;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test02502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02502");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter11);
        boolean boolean13 = nestedInnerQueryParseSupport1.getfilterFound();
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper16 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("nested");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(objectMapper16);
    }

    @Test
    public void test02503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02503");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport1.innerFilter = query4;
        nestedInnerQueryParseSupport1.path = "";
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean10 = nestedInnerQueryParseSupport1.getqueryFound();
        nestedInnerQueryParseSupport1.setfilterFound(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test02504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02504");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter2);
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerQuery;
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.Filter filter6 = nestedInnerQueryParseSupport1.getchildFilter();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(filter6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test02505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02505");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport1.getparentFilter();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter11;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter15 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter15);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter17 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter17);
        nestedInnerQueryParseSupport1.filterParsed = true;
        org.apache.lucene.search.Query query21 = nestedInnerQueryParseSupport1.innerFilter;
        nestedInnerQueryParseSupport1.filterParsed = true;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        org.junit.Assert.assertNull(query21);
    }

    @Test
    public void test02506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02506");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter8;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = null;
        nestedInnerQueryParseSupport1.source = bytesReference10;
        org.apache.lucene.search.Query query12 = null;
        nestedInnerQueryParseSupport1.innerFilter = query12;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = nestedInnerQueryParseSupport1.parentFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference15 = null;
        nestedInnerQueryParseSupport1.source = bytesReference15;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper17 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper17;
        nestedInnerQueryParseSupport1.path = "hi!";
        boolean boolean21 = nestedInnerQueryParseSupport1.queryFound;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test02507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02507");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        java.lang.String str3 = nestedInnerQueryParseSupport1.path;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        boolean boolean6 = nestedInnerQueryParseSupport1.getfilterFound();
        nestedInnerQueryParseSupport1.path = "nested";
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = nestedInnerQueryParseSupport1.getparentFilter();
        org.apache.lucene.search.Filter filter10 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter10);
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter9);
    }

    @Test
    public void test02508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02508");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter11);
        boolean boolean13 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(objectMapper14);
    }

    @Test
    public void test02509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02509");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter2);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Filter filter5 = null;
        nestedInnerQueryParseSupport1.childFilter = filter5;
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = nestedInnerQueryParseSupport1.parentFilter;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport1.getparseContext();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter8);
        org.junit.Assert.assertNull(queryParseContext11);
    }

    @Test
    public void test02510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02510");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport1.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Filter filter5 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter5);
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertNull(query3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test02511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02511");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.parentObjectMapper;
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound;
        nestedInnerQueryParseSupport1.queryFound = false;
        boolean boolean11 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.apache.lucene.search.Filter filter12 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter12);
        java.lang.Class<?> wildcardClass14 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02512");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        nestedInnerQueryParseSupport1.path = "object";
        java.lang.String str10 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.elasticsearch.common.bytes.BytesReference bytesReference14 = nestedInnerQueryParseSupport1.getsource();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("nested");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "object" + "'", str10, "object");
        org.junit.Assert.assertNull(queryParseContext11);
        org.junit.Assert.assertNull(bytesReference14);
    }

    @Test
    public void test02513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02513");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport1.innerFilter = query5;
        org.apache.lucene.search.Filter filter7 = nestedInnerQueryParseSupport1.getchildFilter();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.parentObjectMapper;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(filter7);
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test02514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02514");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.path;
        nestedInnerQueryParseSupport1.queryFound = false;
        org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport1.innerFilter;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.getqueryFound();
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.innerFilter;
        nestedInnerQueryParseSupport1.setfilterFound(true);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(query6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(query9);
    }

    @Test
    public void test02515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02515");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        boolean boolean6 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean10 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport1.getparseContext();
        boolean boolean12 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper13;
        boolean boolean15 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean16 = nestedInnerQueryParseSupport1.getqueryFound();
        org.apache.lucene.search.Filter filter17 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter17);
        org.elasticsearch.index.query.QueryParseContext queryParseContext19 = nestedInnerQueryParseSupport1.getparseContext();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(queryParseContext11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(queryParseContext19);
    }

    @Test
    public void test02516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02516");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        nestedInnerQueryParseSupport1.filterParsed = false;
        boolean boolean12 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean13 = nestedInnerQueryParseSupport1.getqueryFound();
        org.apache.lucene.search.Filter filter14 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter14);
        boolean boolean16 = nestedInnerQueryParseSupport1.queryFound;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test02517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02517");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.queryParsed = false;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter11);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = nestedInnerQueryParseSupport1.parentFilter;
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        org.apache.lucene.search.Query query16 = nestedInnerQueryParseSupport1.getInnerQuery();
        boolean boolean17 = nestedInnerQueryParseSupport1.getqueryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter18 = nestedInnerQueryParseSupport1.getparentFilter();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(bitDocIdSetFilter13);
        org.junit.Assert.assertNull(query16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter18);
    }

    @Test
    public void test02518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02518");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.index.query.QueryParseContext queryParseContext4 = nestedInnerQueryParseSupport1.getparseContext();
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport1.getsource();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter10;
        nestedInnerQueryParseSupport1.queryParsed = true;
        nestedInnerQueryParseSupport1.queryFound = false;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(queryParseContext4);
        org.junit.Assert.assertNull(bytesReference5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test02519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02519");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.queryParsed = false;
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter9);
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.Filter filter13 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter13);
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        java.lang.Class<?> wildcardClass17 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test02520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02520");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference6);
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference8);
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        nestedInnerQueryParseSupport1.path = "hi!";
        nestedInnerQueryParseSupport1.filterFound = false;
        boolean boolean17 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test02521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02521");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        nestedInnerQueryParseSupport1.filterParsed = true;
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean10 = nestedInnerQueryParseSupport1.getqueryFound();
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test02522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02522");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound;
        java.lang.String str5 = nestedInnerQueryParseSupport1.path;
        boolean boolean6 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryParsed;
        org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.innerFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = nestedInnerQueryParseSupport1.source;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        boolean boolean12 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(query8);
        org.junit.Assert.assertNull(bytesReference9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test02523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02523");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter2);
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerQuery;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference5);
        nestedInnerQueryParseSupport1.setqueryFound(false);
        nestedInnerQueryParseSupport1.setfilterFound(true);
        org.junit.Assert.assertNull(query4);
    }

    @Test
    public void test02524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02524");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryParsed;
        org.apache.lucene.search.Filter filter11 = null;
        nestedInnerQueryParseSupport1.childFilter = filter11;
        org.apache.lucene.search.Filter filter13 = nestedInnerQueryParseSupport1.getchildFilter();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(bitDocIdSetFilter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(filter13);
    }

    @Test
    public void test02525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02525");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterFound();
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.innerFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter10);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = nestedInnerQueryParseSupport1.parentFilter;
        nestedInnerQueryParseSupport1.filterFound = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter15 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter15);
        org.apache.lucene.search.Filter filter17 = nestedInnerQueryParseSupport1.childFilter;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query18 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(query9);
        org.junit.Assert.assertNull(bitDocIdSetFilter12);
        org.junit.Assert.assertNull(filter17);
    }

    @Test
    public void test02526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02526");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterFound();
        nestedInnerQueryParseSupport1.filterParsed = true;
        boolean boolean11 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.query.QueryParseContext queryParseContext12 = nestedInnerQueryParseSupport1.getparseContext();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(queryParseContext12);
    }

    @Test
    public void test02527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02527");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.parentObjectMapper;
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound;
        nestedInnerQueryParseSupport1.queryFound = false;
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.innerQuery;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter12);
        java.lang.String str14 = nestedInnerQueryParseSupport1.getPath();
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(query11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test02528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02528");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper2 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper2;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter4;
        boolean boolean6 = nestedInnerQueryParseSupport1.queryParsed;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext9 = nestedInnerQueryParseSupport1.parseContext;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport1.getparentFilter();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(queryParseContext9);
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test02529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02529");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        nestedInnerQueryParseSupport1.filterFound = false;
        boolean boolean13 = nestedInnerQueryParseSupport1.getqueryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = nestedInnerQueryParseSupport1.getparentFilter();
        org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport1.innerFilter;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query16 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter14);
        org.junit.Assert.assertNull(query15);
    }

    @Test
    public void test02530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02530");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterFound();
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean11 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean12 = nestedInnerQueryParseSupport1.filterFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = nestedInnerQueryParseSupport1.parentFilter;
        nestedInnerQueryParseSupport1.path = "";
        java.lang.String str16 = nestedInnerQueryParseSupport1.path;
        boolean boolean17 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper18 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper18;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test02531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02531");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        nestedInnerQueryParseSupport1.filterFound = true;
        nestedInnerQueryParseSupport1.filterParsed = true;
        org.apache.lucene.search.Query query7 = null;
        nestedInnerQueryParseSupport1.innerQuery = query7;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper9;
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.innerQuery;
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = nestedInnerQueryParseSupport1.source;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(query11);
        org.junit.Assert.assertNull(bytesReference12);
    }

    @Test
    public void test02532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02532");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport1.innerQuery = query5;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = nestedInnerQueryParseSupport1.parentFilter;
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter9);
    }

    @Test
    public void test02533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02533");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        nestedInnerQueryParseSupport1.setfilterFound(false);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter7);
        org.apache.lucene.search.Filter filter9 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter9);
        boolean boolean11 = nestedInnerQueryParseSupport1.filterParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean13 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.apache.lucene.search.Filter filter14 = null;
        nestedInnerQueryParseSupport1.childFilter = filter14;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query16 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test02534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02534");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.path;
        nestedInnerQueryParseSupport1.queryFound = false;
        org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport1.innerFilter;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.getqueryFound();
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.innerFilter;
        boolean boolean10 = nestedInnerQueryParseSupport1.getqueryFound();
        org.apache.lucene.search.Filter filter11 = nestedInnerQueryParseSupport1.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.parentObjectMapper;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(query6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(query9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(filter11);
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test02535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02535");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter3;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper5;
        org.elasticsearch.common.bytes.BytesReference bytesReference7 = nestedInnerQueryParseSupport1.source;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        nestedInnerQueryParseSupport1.path = "";
        org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport1.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper13;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertNull(bytesReference7);
        org.junit.Assert.assertNull(query12);
    }

    @Test
    public void test02536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02536");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport1.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.parentObjectMapper;
        boolean boolean5 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport1.innerQuery;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = nestedInnerQueryParseSupport1.getparentFilter();
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertNull(query3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(query7);
        org.junit.Assert.assertNull(bitDocIdSetFilter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test02537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02537");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        boolean boolean6 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean10 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport1.getparseContext();
        boolean boolean12 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper13;
        nestedInnerQueryParseSupport1.queryParsed = false;
        boolean boolean17 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean18 = nestedInnerQueryParseSupport1.getfilterFound();
        nestedInnerQueryParseSupport1.queryFound = true;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(queryParseContext11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test02538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02538");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        java.lang.String str3 = nestedInnerQueryParseSupport1.path;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper4;
        boolean boolean6 = nestedInnerQueryParseSupport1.getqueryParsed();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test02539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02539");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.filterParsed = true;
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter7;
        org.apache.lucene.search.Filter filter9 = nestedInnerQueryParseSupport1.getchildFilter();
        java.lang.String str10 = nestedInnerQueryParseSupport1.path;
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(filter9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test02540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02540");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        boolean boolean6 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean10 = nestedInnerQueryParseSupport1.getqueryParsed();
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        nestedInnerQueryParseSupport1.setfilterFound(true);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test02541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02541");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter11);
        boolean boolean13 = nestedInnerQueryParseSupport1.getfilterFound();
        boolean boolean14 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean15 = nestedInnerQueryParseSupport1.filterFound();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test02542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02542");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.index.query.QueryParseContext queryParseContext4 = nestedInnerQueryParseSupport1.parseContext;
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport1.innerFilter;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(queryParseContext4);
        org.junit.Assert.assertNull(query5);
    }

    @Test
    public void test02543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02543");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter2);
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerQuery;
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport1.parentFilter;
        org.apache.lucene.search.Filter filter7 = null;
        nestedInnerQueryParseSupport1.childFilter = filter7;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test02544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02544");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        nestedInnerQueryParseSupport1.setfilterFound(false);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter9;
        nestedInnerQueryParseSupport1.filterParsed = true;
        boolean boolean13 = nestedInnerQueryParseSupport1.filterFound();
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test02545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02545");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryParsed;
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference6);
        nestedInnerQueryParseSupport1.filterFound = false;
        nestedInnerQueryParseSupport1.queryParsed = false;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test02546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02546");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        java.lang.String str3 = nestedInnerQueryParseSupport1.path;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        boolean boolean6 = nestedInnerQueryParseSupport1.getfilterFound();
        nestedInnerQueryParseSupport1.setfilterFound(false);
        org.apache.lucene.search.Filter filter9 = null;
        nestedInnerQueryParseSupport1.childFilter = filter9;
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = nestedInnerQueryParseSupport1.getsource();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(bytesReference13);
    }

    @Test
    public void test02547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02547");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.queryParsed = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = null;
        nestedInnerQueryParseSupport1.source = bytesReference8;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.parentObjectMapper;
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper13;
        org.apache.lucene.search.Filter filter15 = null;
        nestedInnerQueryParseSupport1.childFilter = filter15;
        boolean boolean17 = nestedInnerQueryParseSupport1.queryParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper18 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper18;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test02548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02548");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.index.query.QueryParseContext queryParseContext4 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport1.innerFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = nestedInnerQueryParseSupport1.getsource();
        nestedInnerQueryParseSupport1.path = "hi!";
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter9);
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(queryParseContext4);
        org.junit.Assert.assertNull(query5);
        org.junit.Assert.assertNull(bytesReference6);
    }

    @Test
    public void test02549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02549");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        boolean boolean6 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound;
        nestedInnerQueryParseSupport1.queryParsed = false;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test02550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02550");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter2);
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerQuery;
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport1.parentFilter;
        org.apache.lucene.search.Filter filter7 = null;
        nestedInnerQueryParseSupport1.childFilter = filter7;
        org.apache.lucene.search.Query query9 = null;
        nestedInnerQueryParseSupport1.innerFilter = query9;
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        org.apache.lucene.search.Filter filter13 = null;
        nestedInnerQueryParseSupport1.childFilter = filter13;
        boolean boolean15 = nestedInnerQueryParseSupport1.getfilterFound();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test02551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02551");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterFound();
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.innerFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = nestedInnerQueryParseSupport1.source;
        boolean boolean11 = nestedInnerQueryParseSupport1.getfilterFound();
        java.lang.Class<?> wildcardClass12 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(query9);
        org.junit.Assert.assertNull(bytesReference10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02552");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference6);
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference8);
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.apache.lucene.search.Filter filter12 = nestedInnerQueryParseSupport1.getchildFilter();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = nestedInnerQueryParseSupport1.parentFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        nestedInnerQueryParseSupport1.path = "";
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(filter12);
        org.junit.Assert.assertNull(bitDocIdSetFilter13);
        org.junit.Assert.assertNull(objectMapper14);
    }

    @Test
    public void test02553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02553");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        nestedInnerQueryParseSupport1.filterParsed = false;
        nestedInnerQueryParseSupport1.path = "nested";
        org.elasticsearch.index.query.QueryParseContext queryParseContext14 = nestedInnerQueryParseSupport1.parseContext;
        org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport1.innerQuery;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(queryParseContext14);
        org.junit.Assert.assertNull(query15);
    }

    @Test
    public void test02554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02554");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.queryParsed = true;
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.apache.lucene.search.Filter filter6 = nestedInnerQueryParseSupport1.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = nestedInnerQueryParseSupport1.parseContext;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str10 = nestedInnerQueryParseSupport1.getPath();
        org.apache.lucene.search.Filter filter11 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter11);
        nestedInnerQueryParseSupport1.filterParsed = true;
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(filter6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(queryParseContext8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test02555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02555");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.queryParsed = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = null;
        nestedInnerQueryParseSupport1.source = bytesReference8;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.parentObjectMapper;
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        nestedInnerQueryParseSupport1.path = "object";
        boolean boolean15 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.Query query16 = nestedInnerQueryParseSupport1.innerFilter;
        boolean boolean17 = nestedInnerQueryParseSupport1.getfilterParsed();
        java.lang.Class<?> wildcardClass18 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(query16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test02556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02556");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        nestedInnerQueryParseSupport1.filterParsed = false;
        nestedInnerQueryParseSupport1.path = "nested";
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference16 = null;
        nestedInnerQueryParseSupport1.source = bytesReference16;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper18 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper18;
        nestedInnerQueryParseSupport1.setfilterFound(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
    }

    @Test
    public void test02557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02557");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        boolean boolean6 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.apache.lucene.search.Query query12 = null;
        nestedInnerQueryParseSupport1.innerQuery = query12;
        org.elasticsearch.index.query.QueryParseContext queryParseContext14 = nestedInnerQueryParseSupport1.parseContext;
        org.elasticsearch.common.bytes.BytesReference bytesReference15 = nestedInnerQueryParseSupport1.getsource();
        boolean boolean16 = nestedInnerQueryParseSupport1.queryParsed;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(queryParseContext14);
        org.junit.Assert.assertNull(bytesReference15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test02558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02558");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        nestedInnerQueryParseSupport1.setfilterFound(false);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter7);
        org.apache.lucene.search.Filter filter9 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter9);
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean12 = nestedInnerQueryParseSupport1.filterParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper13;
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test02559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02559");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        nestedInnerQueryParseSupport1.setfilterFound(false);
        org.apache.lucene.search.Filter filter7 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter7);
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.innerQuery;
        nestedInnerQueryParseSupport1.queryFound = false;
        boolean boolean12 = nestedInnerQueryParseSupport1.filterFound();
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(query9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test02560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02560");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter10);
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = nestedInnerQueryParseSupport1.source;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(bytesReference12);
    }

    @Test
    public void test02561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02561");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter4);
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport1.source = bytesReference6;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper11;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test02562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02562");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.index.query.QueryParseContext queryParseContext4 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport1.innerFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = nestedInnerQueryParseSupport1.getsource();
        nestedInnerQueryParseSupport1.path = "hi!";
        nestedInnerQueryParseSupport1.filterFound = false;
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(queryParseContext4);
        org.junit.Assert.assertNull(query5);
        org.junit.Assert.assertNull(bytesReference6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test02563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02563");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter2);
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerQuery;
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter6;
        java.lang.String str8 = nestedInnerQueryParseSupport1.path;
        nestedInnerQueryParseSupport1.queryParsed = true;
        boolean boolean11 = nestedInnerQueryParseSupport1.filterParsed;
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test02564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02564");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterFound();
        nestedInnerQueryParseSupport1.filterParsed = true;
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter12;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(objectMapper14);
    }

    @Test
    public void test02565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02565");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean11 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference12);
        boolean boolean14 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.apache.lucene.search.Query query15 = null;
        nestedInnerQueryParseSupport1.innerFilter = query15;
        org.apache.lucene.search.Query query17 = null;
        nestedInnerQueryParseSupport1.innerFilter = query17;
        nestedInnerQueryParseSupport1.queryFound = true;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test02566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02566");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport1.innerQuery;
        org.elasticsearch.index.query.QueryParseContext queryParseContext4 = nestedInnerQueryParseSupport1.getparseContext();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertNull(query3);
        org.junit.Assert.assertNull(queryParseContext4);
    }

    @Test
    public void test02567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02567");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter2);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Filter filter5 = null;
        nestedInnerQueryParseSupport1.childFilter = filter5;
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = nestedInnerQueryParseSupport1.parentFilter;
        nestedInnerQueryParseSupport1.queryFound = true;
        boolean boolean11 = nestedInnerQueryParseSupport1.filterFound();
        org.apache.lucene.search.Filter filter12 = nestedInnerQueryParseSupport1.childFilter;
        nestedInnerQueryParseSupport1.setfilterFound(true);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(filter12);
    }

    @Test
    public void test02568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02568");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        nestedInnerQueryParseSupport1.filterFound = true;
        nestedInnerQueryParseSupport1.filterParsed = true;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter9;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02569");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.apache.lucene.search.Filter filter5 = nestedInnerQueryParseSupport1.getchildFilter();
        boolean boolean6 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.elasticsearch.index.query.QueryParseContext queryParseContext7 = nestedInnerQueryParseSupport1.getparseContext();
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = nestedInnerQueryParseSupport1.parseContext;
        org.apache.lucene.search.Filter filter9 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter9);
        nestedInnerQueryParseSupport1.queryFound = true;
        java.lang.Class<?> wildcardClass13 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(filter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(queryParseContext7);
        org.junit.Assert.assertNull(queryParseContext8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02570");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter2);
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerQuery;
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport1.parentFilter;
        org.apache.lucene.search.Filter filter7 = null;
        nestedInnerQueryParseSupport1.childFilter = filter7;
        nestedInnerQueryParseSupport1.path = "nested";
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport1.getparseContext();
        boolean boolean12 = nestedInnerQueryParseSupport1.queryFound;
        org.elasticsearch.index.query.QueryParseContext queryParseContext13 = nestedInnerQueryParseSupport1.parseContext;
        org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport1.innerQuery;
        org.apache.lucene.search.Filter filter15 = nestedInnerQueryParseSupport1.childFilter;
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        org.junit.Assert.assertNull(queryParseContext11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(queryParseContext13);
        org.junit.Assert.assertNull(query14);
        org.junit.Assert.assertNull(filter15);
    }

    @Test
    public void test02571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02571");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.apache.lucene.search.Filter filter8 = nestedInnerQueryParseSupport1.getchildFilter();
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(filter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test02572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02572");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference6);
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference8);
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = nestedInnerQueryParseSupport1.source;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        nestedInnerQueryParseSupport1.setfilterFound(true);
        boolean boolean17 = nestedInnerQueryParseSupport1.getfilterParsed();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference20 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference20);
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bytesReference12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test02573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02573");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        nestedInnerQueryParseSupport1.filterFound = true;
        nestedInnerQueryParseSupport1.filterParsed = true;
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test02574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02574");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper9;
        org.apache.lucene.search.Filter filter11 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter11);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper13;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter15 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter15;
        org.elasticsearch.index.query.QueryParseContext queryParseContext17 = nestedInnerQueryParseSupport1.parseContext;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(queryParseContext17);
    }

    @Test
    public void test02575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02575");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.apache.lucene.search.Filter filter8 = nestedInnerQueryParseSupport1.getchildFilter();
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterParsed();
        nestedInnerQueryParseSupport1.path = "hi!";
        boolean boolean12 = nestedInnerQueryParseSupport1.getqueryFound();
        boolean boolean13 = nestedInnerQueryParseSupport1.getfilterParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(filter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test02576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02576");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound();
        org.apache.lucene.search.Query query11 = null;
        nestedInnerQueryParseSupport1.innerFilter = query11;
        boolean boolean13 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean14 = nestedInnerQueryParseSupport1.getfilterFound();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test02577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02577");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter11);
        boolean boolean13 = nestedInnerQueryParseSupport1.getfilterFound();
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper16 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(objectMapper16);
    }

    @Test
    public void test02578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02578");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference6);
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference8);
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        nestedInnerQueryParseSupport1.filterFound = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference15 = nestedInnerQueryParseSupport1.getsource();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertNull(bytesReference15);
    }

    @Test
    public void test02579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02579");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.path = "nested";
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        nestedInnerQueryParseSupport1.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter14);
        boolean boolean16 = nestedInnerQueryParseSupport1.getqueryParsed();
        java.lang.Class<?> wildcardClass17 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test02580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02580");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterFound();
        org.apache.lucene.search.Filter filter10 = nestedInnerQueryParseSupport1.childFilter;
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.innerQuery;
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = nestedInnerQueryParseSupport1.source;
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = null;
        nestedInnerQueryParseSupport1.source = bytesReference13;
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference17 = nestedInnerQueryParseSupport1.source;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(filter10);
        org.junit.Assert.assertNull(query11);
        org.junit.Assert.assertNull(bytesReference12);
        org.junit.Assert.assertNull(bytesReference17);
    }

    @Test
    public void test02581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02581");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.apache.lucene.search.Filter filter5 = nestedInnerQueryParseSupport1.getchildFilter();
        boolean boolean6 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean7 = nestedInnerQueryParseSupport1.getqueryFound();
        java.lang.String str8 = nestedInnerQueryParseSupport1.path;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("nested");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(filter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test02582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02582");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper5;
        nestedInnerQueryParseSupport1.queryParsed = true;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper4);
    }

    @Test
    public void test02583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02583");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        boolean boolean5 = nestedInnerQueryParseSupport1.filterParsed;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test02584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02584");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound;
        java.lang.String str5 = nestedInnerQueryParseSupport1.path;
        org.apache.lucene.search.Filter filter6 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter6);
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean9 = nestedInnerQueryParseSupport1.filterParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper10;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test02585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02585");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference6);
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference8);
        org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport1.innerFilter;
        java.lang.String str11 = nestedInnerQueryParseSupport1.path;
        org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport1.innerFilter;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(query10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(query12);
    }

    @Test
    public void test02586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02586");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter8;
        org.apache.lucene.search.Filter filter10 = nestedInnerQueryParseSupport1.childFilter;
        java.lang.String str11 = nestedInnerQueryParseSupport1.path;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport1.innerQuery;
        boolean boolean15 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.index.query.QueryParseContext queryParseContext16 = nestedInnerQueryParseSupport1.getparseContext();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper17 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(filter10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(query14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(queryParseContext16);
        org.junit.Assert.assertNull(objectMapper17);
    }

    @Test
    public void test02587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02587");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference5);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter7);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = nestedInnerQueryParseSupport1.parentFilter;
        org.apache.lucene.search.Filter filter10 = null;
        nestedInnerQueryParseSupport1.childFilter = filter10;
        org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport1.innerFilter;
        org.apache.lucene.search.Filter filter13 = nestedInnerQueryParseSupport1.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Query query16 = null;
        nestedInnerQueryParseSupport1.innerFilter = query16;
        org.elasticsearch.common.bytes.BytesReference bytesReference18 = null;
        nestedInnerQueryParseSupport1.source = bytesReference18;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertNull(bitDocIdSetFilter9);
        org.junit.Assert.assertNull(query12);
        org.junit.Assert.assertNull(filter13);
        org.junit.Assert.assertNull(objectMapper14);
        org.junit.Assert.assertNull(objectMapper15);
    }

    @Test
    public void test02588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02588");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        nestedInnerQueryParseSupport1.filterFound = true;
        nestedInnerQueryParseSupport1.filterParsed = true;
        boolean boolean7 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter8;
        org.apache.lucene.search.Filter filter10 = null;
        nestedInnerQueryParseSupport1.childFilter = filter10;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test02589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02589");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport1.innerFilter = query5;
        org.apache.lucene.search.Filter filter7 = nestedInnerQueryParseSupport1.getchildFilter();
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        boolean boolean10 = nestedInnerQueryParseSupport1.filterParsed;
        nestedInnerQueryParseSupport1.queryFound = true;
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(filter7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objectMapper15);
    }

    @Test
    public void test02590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02590");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        boolean boolean6 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound;
        java.lang.String str8 = nestedInnerQueryParseSupport1.path;
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound();
        org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport1.innerFilter;
        boolean boolean11 = nestedInnerQueryParseSupport1.filterParsed;
        org.apache.lucene.search.Filter filter12 = null;
        nestedInnerQueryParseSupport1.childFilter = filter12;
        nestedInnerQueryParseSupport1.setfilterFound(false);
        boolean boolean16 = nestedInnerQueryParseSupport1.filterFound;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("object");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(query10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test02591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02591");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport1.getparentFilter();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter11;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter15 = nestedInnerQueryParseSupport1.getparentFilter();
        org.apache.lucene.search.Query query16 = null;
        nestedInnerQueryParseSupport1.innerQuery = query16;
        nestedInnerQueryParseSupport1.path = "";
        nestedInnerQueryParseSupport1.queryParsed = true;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        org.junit.Assert.assertNull(bitDocIdSetFilter15);
    }

    @Test
    public void test02592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02592");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        boolean boolean6 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean10 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport1.getparseContext();
        boolean boolean12 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper13;
        nestedInnerQueryParseSupport1.path = "hi!";
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper17 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper17;
        nestedInnerQueryParseSupport1.filterFound = false;
        boolean boolean21 = nestedInnerQueryParseSupport1.getfilterFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("nested");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(queryParseContext11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test02593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02593");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        nestedInnerQueryParseSupport1.filterParsed = false;
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter12);
        boolean boolean14 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference15 = null;
        nestedInnerQueryParseSupport1.source = bytesReference15;
        org.elasticsearch.common.bytes.BytesReference bytesReference17 = nestedInnerQueryParseSupport1.getsource();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(bytesReference17);
    }

    @Test
    public void test02594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02594");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter4);
        org.apache.lucene.search.Query query6 = null;
        nestedInnerQueryParseSupport1.innerQuery = query6;
        nestedInnerQueryParseSupport1.queryParsed = false;
        boolean boolean10 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport1.getparseContext();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(queryParseContext11);
    }

    @Test
    public void test02595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02595");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryParsed;
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport1.getInnerFilter();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(query7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test02596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02596");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.index.query.QueryParseContext queryParseContext4 = nestedInnerQueryParseSupport1.parseContext;
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport1.innerQuery;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = nestedInnerQueryParseSupport1.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter9;
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.path = "";
        boolean boolean14 = nestedInnerQueryParseSupport1.filterFound;
        org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport1.innerQuery;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(queryParseContext4);
        org.junit.Assert.assertNull(query5);
        org.junit.Assert.assertNull(bitDocIdSetFilter8);
        org.junit.Assert.assertNull(queryParseContext11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(query15);
    }

    @Test
    public void test02597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02597");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryParsed;
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = nestedInnerQueryParseSupport1.getsource();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = nestedInnerQueryParseSupport1.getparentFilter();
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(bytesReference11);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertNull(bitDocIdSetFilter14);
    }

    @Test
    public void test02598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02598");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.path;
        nestedInnerQueryParseSupport1.queryFound = false;
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean7 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = nestedInnerQueryParseSupport1.source;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(bytesReference8);
    }

    @Test
    public void test02599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02599");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        java.lang.String str3 = nestedInnerQueryParseSupport1.path;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = nestedInnerQueryParseSupport1.getparentFilter();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport1.source = bytesReference6;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(bitDocIdSetFilter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test02600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02600");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter4);
        nestedInnerQueryParseSupport1.queryParsed = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.innerQuery;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(query9);
    }

    @Test
    public void test02601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02601");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.filterParsed = true;
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport1.innerQuery;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport1.source = bytesReference6;
        org.apache.lucene.search.Filter filter8 = nestedInnerQueryParseSupport1.getchildFilter();
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = null;
        nestedInnerQueryParseSupport1.source = bytesReference9;
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = null;
        nestedInnerQueryParseSupport1.source = bytesReference11;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper13;
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(query5);
        org.junit.Assert.assertNull(filter8);
    }

    @Test
    public void test02602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02602");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.queryParsed = true;
        org.apache.lucene.search.Filter filter4 = nestedInnerQueryParseSupport1.childFilter;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        boolean boolean7 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.junit.Assert.assertNull(filter4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test02603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02603");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        nestedInnerQueryParseSupport1.filterFound = false;
        boolean boolean13 = nestedInnerQueryParseSupport1.getqueryFound();
        boolean boolean14 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean15 = nestedInnerQueryParseSupport1.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter16 = nestedInnerQueryParseSupport1.getparentFilter();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter16);
    }

    @Test
    public void test02604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02604");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.filterParsed = true;
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport1.getInnerFilter();
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        boolean boolean8 = nestedInnerQueryParseSupport1.filterParsed;
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.innerFilter;
        nestedInnerQueryParseSupport1.queryParsed = false;
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(query5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(query9);
    }

    @Test
    public void test02605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02605");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterFound();
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean11 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Filter filter13 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter13);
        org.elasticsearch.common.bytes.BytesReference bytesReference15 = null;
        nestedInnerQueryParseSupport1.source = bytesReference15;
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test02606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02606");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        org.elasticsearch.index.query.QueryParseContext queryParseContext3 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterParsed;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertNull(queryParseContext3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test02607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02607");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport1.getparentFilter();
        org.apache.lucene.search.Filter filter11 = nestedInnerQueryParseSupport1.getchildFilter();
        boolean boolean12 = nestedInnerQueryParseSupport1.getqueryFound();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        org.junit.Assert.assertNull(filter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test02608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02608");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.queryParsed = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = null;
        nestedInnerQueryParseSupport1.source = bytesReference8;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport1.innerFilter = query10;
        boolean boolean12 = nestedInnerQueryParseSupport1.filterParsed;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test02609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02609");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        nestedInnerQueryParseSupport1.filterParsed = false;
        boolean boolean12 = nestedInnerQueryParseSupport1.filterFound;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test02610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02610");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterFound();
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.innerFilter;
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound;
        nestedInnerQueryParseSupport1.path = "hi!";
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter13;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(query9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test02611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02611");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        boolean boolean6 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean10 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper11;
        boolean boolean13 = nestedInnerQueryParseSupport1.queryParsed;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test02612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02612");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        boolean boolean6 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean10 = nestedInnerQueryParseSupport1.getqueryParsed();
        nestedInnerQueryParseSupport1.filterParsed = true;
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference15 = nestedInnerQueryParseSupport1.source;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(bytesReference15);
    }

    @Test
    public void test02613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02613");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport1.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.parentObjectMapper;
        boolean boolean5 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport1.innerQuery;
        boolean boolean8 = nestedInnerQueryParseSupport1.getqueryFound();
        nestedInnerQueryParseSupport1.filterFound = false;
        java.lang.Class<?> wildcardClass11 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertNull(query3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(query7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02614");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterFound();
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.parentObjectMapper;
        boolean boolean12 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test02615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02615");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter2);
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerQuery;
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = nestedInnerQueryParseSupport1.getparentFilter();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter9;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter11;
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter8);
    }

    @Test
    public void test02616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02616");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryParsed;
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference6);
        org.apache.lucene.search.Filter filter8 = nestedInnerQueryParseSupport1.childFilter;
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean10 = nestedInnerQueryParseSupport1.getqueryFound();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(filter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test02617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02617");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference5);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter7);
        org.apache.lucene.search.Filter filter9 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter9);
        nestedInnerQueryParseSupport1.filterFound = false;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.parentObjectMapper;
        nestedInnerQueryParseSupport1.setfilterFound(false);
        org.apache.lucene.search.Query query16 = nestedInnerQueryParseSupport1.innerFilter;
        boolean boolean17 = nestedInnerQueryParseSupport1.queryFound;
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertNull(query16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test02618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02618");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.apache.lucene.search.Filter filter8 = nestedInnerQueryParseSupport1.getchildFilter();
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(filter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test02619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02619");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound;
        java.lang.String str5 = nestedInnerQueryParseSupport1.path;
        boolean boolean6 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.apache.lucene.search.Filter filter7 = nestedInnerQueryParseSupport1.childFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter8;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = nestedInnerQueryParseSupport1.parentFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(filter7);
        org.junit.Assert.assertNull(bitDocIdSetFilter12);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertNull(objectMapper14);
    }

    @Test
    public void test02620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02620");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        nestedInnerQueryParseSupport1.path = "";
        boolean boolean10 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean11 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test02621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02621");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter2);
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerQuery;
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport1.parentFilter;
        org.apache.lucene.search.Filter filter7 = null;
        nestedInnerQueryParseSupport1.childFilter = filter7;
        nestedInnerQueryParseSupport1.path = "nested";
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.Filter filter12 = null;
        nestedInnerQueryParseSupport1.childFilter = filter12;
        org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport1.innerFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter15 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter15;
        org.apache.lucene.search.Query query17 = null;
        nestedInnerQueryParseSupport1.innerQuery = query17;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        org.junit.Assert.assertNull(queryParseContext11);
        org.junit.Assert.assertNull(query14);
    }

    @Test
    public void test02622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02622");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter11);
        boolean boolean13 = nestedInnerQueryParseSupport1.getfilterFound();
        boolean boolean14 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Query query16 = null;
        nestedInnerQueryParseSupport1.innerFilter = query16;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(objectMapper15);
    }

    @Test
    public void test02623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02623");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        nestedInnerQueryParseSupport1.setfilterFound(false);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter9;
        nestedInnerQueryParseSupport1.filterParsed = true;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02624");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.elasticsearch.index.query.QueryParseContext queryParseContext5 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.Filter filter8 = nestedInnerQueryParseSupport1.getchildFilter();
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        java.lang.Class<?> wildcardClass11 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(queryParseContext5);
        org.junit.Assert.assertNull(filter8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02625");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.index.query.QueryParseContext queryParseContext4 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean5 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = nestedInnerQueryParseSupport1.getparseContext();
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = nestedInnerQueryParseSupport1.getsource();
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = nestedInnerQueryParseSupport1.source;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(queryParseContext4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(queryParseContext8);
        org.junit.Assert.assertNull(bytesReference9);
        org.junit.Assert.assertNull(bytesReference10);
    }

    @Test
    public void test02626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02626");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.path;
        nestedInnerQueryParseSupport1.queryFound = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = nestedInnerQueryParseSupport1.getsource();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        nestedInnerQueryParseSupport1.filterFound = true;
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(bytesReference6);
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test02627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02627");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = null;
        nestedInnerQueryParseSupport1.source = bytesReference8;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.parentObjectMapper;
        java.lang.String str11 = nestedInnerQueryParseSupport1.path;
        java.lang.Class<?> wildcardClass12 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02628");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter4);
        nestedInnerQueryParseSupport1.queryParsed = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.innerQuery;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(query9);
    }

    @Test
    public void test02629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02629");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound();
        nestedInnerQueryParseSupport1.path = "";
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = nestedInnerQueryParseSupport1.source;
        org.apache.lucene.search.Filter filter14 = nestedInnerQueryParseSupport1.childFilter;
        org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport1.innerQuery;
        boolean boolean16 = nestedInnerQueryParseSupport1.getfilterFound();
        org.apache.lucene.search.Query query17 = null;
        nestedInnerQueryParseSupport1.innerQuery = query17;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bytesReference13);
        org.junit.Assert.assertNull(filter14);
        org.junit.Assert.assertNull(query15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test02630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02630");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference6);
        org.apache.lucene.search.Filter filter8 = nestedInnerQueryParseSupport1.childFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = nestedInnerQueryParseSupport1.getsource();
        nestedInnerQueryParseSupport1.filterFound = false;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.elasticsearch.index.query.QueryParseContext queryParseContext15 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(filter8);
        org.junit.Assert.assertNull(bytesReference9);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertNull(queryParseContext15);
    }

    @Test
    public void test02631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02631");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        nestedInnerQueryParseSupport1.filterFound = true;
        nestedInnerQueryParseSupport1.path = "hi!";
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        nestedInnerQueryParseSupport1.setfilterFound(true);
        nestedInnerQueryParseSupport1.queryParsed = false;
        java.lang.String str12 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test02632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02632");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport1.getparentFilter();
        java.lang.String str11 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        boolean boolean13 = nestedInnerQueryParseSupport1.getqueryParsed();
        nestedInnerQueryParseSupport1.queryParsed = false;
        org.apache.lucene.search.Filter filter16 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter16);
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test02633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02633");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        boolean boolean6 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound;
        java.lang.String str8 = nestedInnerQueryParseSupport1.path;
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound();
        org.apache.lucene.search.Filter filter10 = nestedInnerQueryParseSupport1.childFilter;
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(filter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test02634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02634");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        boolean boolean6 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound;
        java.lang.String str8 = nestedInnerQueryParseSupport1.path;
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound();
        org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport1.innerFilter;
        boolean boolean11 = nestedInnerQueryParseSupport1.filterParsed;
        org.apache.lucene.search.Filter filter12 = null;
        nestedInnerQueryParseSupport1.childFilter = filter12;
        boolean boolean14 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference15 = null;
        nestedInnerQueryParseSupport1.source = bytesReference15;
        java.lang.Class<?> wildcardClass17 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(query10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test02635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02635");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter9;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper11;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test02636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02636");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.apache.lucene.search.Filter filter5 = nestedInnerQueryParseSupport1.getchildFilter();
        boolean boolean6 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.index.query.QueryParseContext queryParseContext7 = nestedInnerQueryParseSupport1.parseContext;
        org.apache.lucene.search.Filter filter8 = nestedInnerQueryParseSupport1.childFilter;
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(filter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(queryParseContext7);
        org.junit.Assert.assertNull(filter8);
    }

    @Test
    public void test02637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02637");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = nestedInnerQueryParseSupport1.getsource();
        nestedInnerQueryParseSupport1.queryFound = false;
        nestedInnerQueryParseSupport1.queryFound = false;
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.innerFilter;
        nestedInnerQueryParseSupport1.queryFound = false;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.parentObjectMapper;
        java.lang.Class<?> wildcardClass13 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(bytesReference4);
        org.junit.Assert.assertNull(query9);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02638");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.queryParsed = false;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter11);
        nestedInnerQueryParseSupport1.setqueryFound(false);
        java.lang.Class<?> wildcardClass15 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test02639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02639");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        nestedInnerQueryParseSupport1.path = "hi!";
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test02640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02640");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport1.parentFilter;
        org.apache.lucene.search.Filter filter8 = nestedInnerQueryParseSupport1.getchildFilter();
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = nestedInnerQueryParseSupport1.getsource();
        org.elasticsearch.index.query.QueryParseContext queryParseContext10 = nestedInnerQueryParseSupport1.parseContext;
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference11);
        boolean boolean13 = nestedInnerQueryParseSupport1.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter14;
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
        org.junit.Assert.assertNull(filter8);
        org.junit.Assert.assertNull(bytesReference9);
        org.junit.Assert.assertNull(queryParseContext10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test02641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02641");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport1.getparentFilter();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.query.QueryParseContext queryParseContext7 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(queryParseContext7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test02642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02642");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter2);
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerQuery;
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = nestedInnerQueryParseSupport1.getparentFilter();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter8);
    }

    @Test
    public void test02643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02643");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.index.query.QueryParseContext queryParseContext4 = nestedInnerQueryParseSupport1.parseContext;
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport1.innerQuery;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(queryParseContext4);
        org.junit.Assert.assertNull(query5);
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test02644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02644");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference6);
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference8);
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext12 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.Filter filter13 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter13);
        org.apache.lucene.search.Filter filter15 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter15);
        boolean boolean17 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean18 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference19 = nestedInnerQueryParseSupport1.getsource();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query20 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(queryParseContext12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(bytesReference19);
    }

    @Test
    public void test02645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02645");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterFound();
        org.apache.lucene.search.Filter filter10 = nestedInnerQueryParseSupport1.childFilter;
        org.apache.lucene.search.Filter filter11 = nestedInnerQueryParseSupport1.getchildFilter();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper12;
        org.elasticsearch.common.bytes.BytesReference bytesReference14 = nestedInnerQueryParseSupport1.source;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(filter10);
        org.junit.Assert.assertNull(filter11);
        org.junit.Assert.assertNull(bytesReference14);
    }

    @Test
    public void test02646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02646");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport1.getparentFilter();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter11;
        org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport1.innerFilter;
        org.elasticsearch.index.query.QueryParseContext queryParseContext14 = nestedInnerQueryParseSupport1.parseContext;
        org.elasticsearch.common.bytes.BytesReference bytesReference15 = nestedInnerQueryParseSupport1.getsource();
        boolean boolean16 = nestedInnerQueryParseSupport1.filterFound();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        org.junit.Assert.assertNull(query13);
        org.junit.Assert.assertNull(queryParseContext14);
        org.junit.Assert.assertNull(bytesReference15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test02647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02647");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterFound();
        org.apache.lucene.search.Filter filter10 = nestedInnerQueryParseSupport1.childFilter;
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.innerQuery;
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = nestedInnerQueryParseSupport1.source;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper13;
        org.apache.lucene.search.Filter filter15 = null;
        nestedInnerQueryParseSupport1.childFilter = filter15;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(filter10);
        org.junit.Assert.assertNull(query11);
        org.junit.Assert.assertNull(bytesReference12);
    }

    @Test
    public void test02648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02648");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound();
        org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport1.innerQuery;
        boolean boolean11 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.query.QueryParseContext queryParseContext12 = nestedInnerQueryParseSupport1.getparseContext();
        org.elasticsearch.index.query.QueryParseContext queryParseContext13 = nestedInnerQueryParseSupport1.parseContext;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("nested");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(query10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(queryParseContext12);
        org.junit.Assert.assertNull(queryParseContext13);
    }

    @Test
    public void test02649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02649");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter8);
        nestedInnerQueryParseSupport1.filterParsed = true;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test02650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02650");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.getInnerFilter();
        nestedInnerQueryParseSupport1.queryParsed = false;
        org.apache.lucene.search.Filter filter11 = nestedInnerQueryParseSupport1.getchildFilter();
        boolean boolean12 = nestedInnerQueryParseSupport1.queryParsed;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.Filter filter15 = null;
        nestedInnerQueryParseSupport1.childFilter = filter15;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(query8);
        org.junit.Assert.assertNull(filter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test02651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02651");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound();
        nestedInnerQueryParseSupport1.path = "";
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = nestedInnerQueryParseSupport1.source;
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper16 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.query.QueryParseContext queryParseContext17 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean18 = nestedInnerQueryParseSupport1.filterParsed;
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        nestedInnerQueryParseSupport1.queryParsed = false;
        java.lang.Class<?> wildcardClass23 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bytesReference13);
        org.junit.Assert.assertNull(objectMapper16);
        org.junit.Assert.assertNull(queryParseContext17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test02652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02652");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        boolean boolean6 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean10 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport1.getparseContext();
        boolean boolean12 = nestedInnerQueryParseSupport1.queryFound();
        org.apache.lucene.search.Query query13 = null;
        nestedInnerQueryParseSupport1.innerQuery = query13;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Filter filter18 = nestedInnerQueryParseSupport1.childFilter;
        boolean boolean19 = nestedInnerQueryParseSupport1.getqueryParsed();
        boolean boolean20 = nestedInnerQueryParseSupport1.queryParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper21 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper21;
        boolean boolean23 = nestedInnerQueryParseSupport1.getqueryFound();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(queryParseContext11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(objectMapper15);
        org.junit.Assert.assertNull(filter18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test02653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02653");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.apache.lucene.search.Filter filter8 = nestedInnerQueryParseSupport1.getchildFilter();
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterParsed();
        nestedInnerQueryParseSupport1.path = "hi!";
        boolean boolean12 = nestedInnerQueryParseSupport1.queryParsed;
        org.apache.lucene.search.Query query13 = null;
        nestedInnerQueryParseSupport1.innerQuery = query13;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter15 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter15);
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(filter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test02654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02654");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter8;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport1.innerFilter = query10;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter12);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport1.innerFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter16 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter16;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query18 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper14);
        org.junit.Assert.assertNull(query15);
    }

    @Test
    public void test02655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02655");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper5;
        boolean boolean7 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test02656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02656");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.path = "nested";
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = nestedInnerQueryParseSupport1.parentFilter;
        org.apache.lucene.search.Filter filter12 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter12);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
    }

    @Test
    public void test02657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02657");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        boolean boolean6 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean10 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport1.getparseContext();
        boolean boolean12 = nestedInnerQueryParseSupport1.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean14 = nestedInnerQueryParseSupport1.filterFound();
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.elasticsearch.index.query.QueryParseContext queryParseContext17 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query20 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(queryParseContext11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(queryParseContext17);
    }

    @Test
    public void test02658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02658");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference6);
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference8);
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.apache.lucene.search.Filter filter12 = nestedInnerQueryParseSupport1.getchildFilter();
        nestedInnerQueryParseSupport1.queryFound = true;
        boolean boolean15 = nestedInnerQueryParseSupport1.getfilterFound();
        boolean boolean16 = nestedInnerQueryParseSupport1.filterFound();
        org.apache.lucene.search.Filter filter17 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter17);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(filter12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test02659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02659");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport1.innerFilter;
        nestedInnerQueryParseSupport1.path = "object";
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter8);
        boolean boolean10 = nestedInnerQueryParseSupport1.getqueryParsed();
        nestedInnerQueryParseSupport1.filterFound = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = nestedInnerQueryParseSupport1.getsource();
        nestedInnerQueryParseSupport1.queryParsed = true;
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(query5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(bytesReference13);
    }

    @Test
    public void test02660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02660");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        nestedInnerQueryParseSupport1.filterFound = true;
        nestedInnerQueryParseSupport1.filterParsed = true;
        org.apache.lucene.search.Query query7 = null;
        nestedInnerQueryParseSupport1.innerQuery = query7;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper9;
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.innerQuery;
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = nestedInnerQueryParseSupport1.source;
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = null;
        nestedInnerQueryParseSupport1.source = bytesReference13;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(query11);
        org.junit.Assert.assertNull(bytesReference12);
    }

    @Test
    public void test02661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02661");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference6);
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference8);
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext12 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.Filter filter13 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter13);
        org.apache.lucene.search.Filter filter15 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter15);
        boolean boolean17 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference18 = nestedInnerQueryParseSupport1.source;
        org.apache.lucene.search.Query query19 = nestedInnerQueryParseSupport1.innerFilter;
        nestedInnerQueryParseSupport1.filterParsed = true;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(queryParseContext12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(bytesReference18);
        org.junit.Assert.assertNull(query19);
    }

    @Test
    public void test02662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02662");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        boolean boolean6 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound;
        java.lang.String str8 = nestedInnerQueryParseSupport1.path;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        boolean boolean10 = nestedInnerQueryParseSupport1.filterParsed;
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = null;
        nestedInnerQueryParseSupport1.source = bytesReference11;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test02663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02663");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.apache.lucene.search.Filter filter5 = nestedInnerQueryParseSupport1.getchildFilter();
        boolean boolean6 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.elasticsearch.index.query.QueryParseContext queryParseContext7 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.filterParsed = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(filter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(queryParseContext7);
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test02664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02664");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryParsed;
        nestedInnerQueryParseSupport1.path = "object";
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport1.innerQuery;
        boolean boolean15 = nestedInnerQueryParseSupport1.queryParsed;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertNull(query14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test02665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02665");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference6);
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference8);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter10);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter12;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test02666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02666");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02667");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter11);
        boolean boolean13 = nestedInnerQueryParseSupport1.getfilterFound();
        boolean boolean14 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter15 = nestedInnerQueryParseSupport1.parentFilter;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query16 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter15);
    }

    @Test
    public void test02668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02668");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterFound();
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.innerFilter;
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(query9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test02669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02669");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        java.lang.String str3 = nestedInnerQueryParseSupport1.path;
        org.apache.lucene.search.Filter filter4 = nestedInnerQueryParseSupport1.getchildFilter();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(filter4);
    }

    @Test
    public void test02670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02670");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = nestedInnerQueryParseSupport1.getsource();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter8;
        org.apache.lucene.search.Filter filter10 = null;
        nestedInnerQueryParseSupport1.childFilter = filter10;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(bytesReference6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test02671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02671");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        java.lang.String str3 = nestedInnerQueryParseSupport1.path;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        boolean boolean6 = nestedInnerQueryParseSupport1.queryParsed;
        nestedInnerQueryParseSupport1.setfilterFound(true);
        nestedInnerQueryParseSupport1.path = "hi!";
        org.apache.lucene.search.Query query11 = null;
        nestedInnerQueryParseSupport1.innerQuery = query11;
        boolean boolean13 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test02672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02672");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        java.lang.String str3 = nestedInnerQueryParseSupport1.path;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = nestedInnerQueryParseSupport1.getparentFilter();
        org.apache.lucene.search.Filter filter5 = null;
        nestedInnerQueryParseSupport1.childFilter = filter5;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(bitDocIdSetFilter4);
    }

    @Test
    public void test02673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02673");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport1.getparentFilter();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter11;
        org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport1.innerFilter;
        org.elasticsearch.index.query.QueryParseContext queryParseContext14 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.path = "nested";
        org.apache.lucene.search.Filter filter17 = null;
        nestedInnerQueryParseSupport1.childFilter = filter17;
        boolean boolean19 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        org.junit.Assert.assertNull(query13);
        org.junit.Assert.assertNull(queryParseContext14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test02674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02674");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        boolean boolean6 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean10 = nestedInnerQueryParseSupport1.getqueryParsed();
        nestedInnerQueryParseSupport1.filterParsed = true;
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objectMapper15);
    }

    @Test
    public void test02675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02675");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper9;
        nestedInnerQueryParseSupport1.setfilterFound(false);
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter15 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter15;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test02676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02676");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterFound();
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.innerFilter;
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound;
        nestedInnerQueryParseSupport1.queryParsed = false;
        org.apache.lucene.search.Filter filter13 = null;
        nestedInnerQueryParseSupport1.childFilter = filter13;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(query9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test02677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02677");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.index.query.QueryParseContext queryParseContext4 = nestedInnerQueryParseSupport1.getparseContext();
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport1.getsource();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter10;
        nestedInnerQueryParseSupport1.queryParsed = true;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(queryParseContext4);
        org.junit.Assert.assertNull(bytesReference5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test02678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02678");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        java.lang.String str3 = nestedInnerQueryParseSupport1.path;
        nestedInnerQueryParseSupport1.queryFound = false;
        nestedInnerQueryParseSupport1.filterFound = false;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper8;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter11;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test02679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02679");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference6);
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference8);
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = nestedInnerQueryParseSupport1.source;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter15 = nestedInnerQueryParseSupport1.getparentFilter();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper16 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        boolean boolean17 = nestedInnerQueryParseSupport1.filterParsed;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bytesReference12);
        org.junit.Assert.assertNull(bitDocIdSetFilter15);
        org.junit.Assert.assertNull(objectMapper16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test02680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02680");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound;
        java.lang.String str5 = nestedInnerQueryParseSupport1.path;
        nestedInnerQueryParseSupport1.filterFound = false;
        nestedInnerQueryParseSupport1.queryFound = false;
        org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport1.innerFilter;
        boolean boolean11 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean12 = nestedInnerQueryParseSupport1.getqueryParsed();
        java.lang.String str13 = nestedInnerQueryParseSupport1.path;
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(query10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test02681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02681");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.queryParsed = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = null;
        nestedInnerQueryParseSupport1.source = bytesReference8;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.parentObjectMapper;
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        org.apache.lucene.search.Filter filter13 = null;
        nestedInnerQueryParseSupport1.childFilter = filter13;
        org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport1.innerQuery;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(query15);
    }

    @Test
    public void test02682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02682");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound;
        java.lang.String str5 = nestedInnerQueryParseSupport1.path;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport1.getparentFilter();
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper9;
        org.apache.lucene.search.Filter filter11 = nestedInnerQueryParseSupport1.childFilter;
        boolean boolean12 = nestedInnerQueryParseSupport1.getqueryFound();
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        org.junit.Assert.assertNull(filter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test02683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02683");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport1.innerFilter = query4;
        nestedInnerQueryParseSupport1.path = "";
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper11;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper13;
        org.apache.lucene.search.Filter filter15 = null;
        nestedInnerQueryParseSupport1.childFilter = filter15;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test02684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02684");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        nestedInnerQueryParseSupport1.filterFound = true;
        nestedInnerQueryParseSupport1.filterParsed = true;
        nestedInnerQueryParseSupport1.queryFound = true;
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterFound();
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound();
        org.apache.lucene.search.Filter filter11 = null;
        nestedInnerQueryParseSupport1.childFilter = filter11;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test02685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02685");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound();
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.innerQuery;
        org.apache.lucene.search.Filter filter12 = null;
        nestedInnerQueryParseSupport1.childFilter = filter12;
        org.elasticsearch.index.query.QueryParseContext queryParseContext14 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.Query query15 = null;
        nestedInnerQueryParseSupport1.innerQuery = query15;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(query11);
        org.junit.Assert.assertNull(queryParseContext14);
    }

    @Test
    public void test02686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02686");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter8;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = null;
        nestedInnerQueryParseSupport1.source = bytesReference10;
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference12);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper14;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter16 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter16;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test02687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02687");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        nestedInnerQueryParseSupport1.path = "object";
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test02688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02688");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.queryParsed = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = null;
        nestedInnerQueryParseSupport1.source = bytesReference8;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.parentObjectMapper;
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper13;
        org.elasticsearch.common.bytes.BytesReference bytesReference15 = null;
        nestedInnerQueryParseSupport1.source = bytesReference15;
        org.apache.lucene.search.Filter filter17 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter17);
        java.lang.String str19 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.common.bytes.BytesReference bytesReference20 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference20);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query22 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test02689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02689");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(false, false);
        boolean boolean3 = nested2.isNested();
        boolean boolean4 = nested2.isIncludeInParent();
        boolean boolean5 = nested2.isIncludeInRoot();
        boolean boolean6 = nested2.isNested();
        boolean boolean7 = nested2.isIncludeInRoot();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test02690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02690");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper9;
        boolean boolean11 = nestedInnerQueryParseSupport1.queryParsed;
        org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport1.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(query12);
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test02691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02691");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.queryParsed = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = nestedInnerQueryParseSupport1.getsource();
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference9);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = nestedInnerQueryParseSupport1.getparentFilter();
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Filter filter14 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter14);
        nestedInnerQueryParseSupport1.queryFound = false;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(bytesReference8);
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
    }

    @Test
    public void test02692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02692");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        boolean boolean6 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean10 = nestedInnerQueryParseSupport1.getqueryParsed();
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference13);
        boolean boolean15 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean16 = nestedInnerQueryParseSupport1.filterFound();
        org.apache.lucene.search.Filter filter17 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter17);
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test02693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02693");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter11);
        boolean boolean13 = nestedInnerQueryParseSupport1.getfilterFound();
        org.apache.lucene.search.Query query14 = null;
        nestedInnerQueryParseSupport1.innerFilter = query14;
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        nestedInnerQueryParseSupport1.setqueryFound(false);
        boolean boolean20 = nestedInnerQueryParseSupport1.filterParsed;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test02694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02694");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("nested");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test02695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02695");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        java.lang.String str3 = nestedInnerQueryParseSupport1.path;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        boolean boolean6 = nestedInnerQueryParseSupport1.getfilterFound();
        nestedInnerQueryParseSupport1.path = "nested";
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = nestedInnerQueryParseSupport1.source;
        nestedInnerQueryParseSupport1.queryParsed = true;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(bytesReference9);
    }

    @Test
    public void test02696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02696");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean11 = nestedInnerQueryParseSupport1.getfilterFound();
        nestedInnerQueryParseSupport1.queryFound = true;
        boolean boolean14 = nestedInnerQueryParseSupport1.queryParsed;
        org.apache.lucene.search.Filter filter15 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter15);
        boolean boolean17 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test02697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02697");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.path = "nested";
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport1.getparentFilter();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.parentObjectMapper;
        boolean boolean12 = nestedInnerQueryParseSupport1.queryParsed;
        org.apache.lucene.search.Query query13 = null;
        nestedInnerQueryParseSupport1.innerQuery = query13;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("object");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test02698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02698");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter7;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02699");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        nestedInnerQueryParseSupport1.filterParsed = false;
        nestedInnerQueryParseSupport1.queryParsed = false;
        boolean boolean14 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference15 = nestedInnerQueryParseSupport1.getsource();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(bytesReference15);
    }

    @Test
    public void test02700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02700");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference6);
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference8);
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext12 = nestedInnerQueryParseSupport1.getparseContext();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter14);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper16 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper17 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean18 = nestedInnerQueryParseSupport1.getfilterFound();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(queryParseContext12);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertNull(objectMapper16);
        org.junit.Assert.assertNull(objectMapper17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test02701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02701");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound;
        java.lang.String str5 = nestedInnerQueryParseSupport1.path;
        boolean boolean6 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.apache.lucene.search.Filter filter7 = nestedInnerQueryParseSupport1.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.innerQuery;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter11);
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(filter7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(query9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test02702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02702");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryParsed;
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference6);
        org.apache.lucene.search.Filter filter8 = nestedInnerQueryParseSupport1.childFilter;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(filter8);
    }

    @Test
    public void test02703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02703");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference9);
        nestedInnerQueryParseSupport1.queryFound = false;
        java.lang.String str13 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test02704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02704");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.index.query.QueryParseContext queryParseContext4 = nestedInnerQueryParseSupport1.parseContext;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.parentObjectMapper;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.innerQuery;
        boolean boolean9 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(queryParseContext4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(query8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test02705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02705");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        nestedInnerQueryParseSupport1.setfilterFound(false);
        boolean boolean7 = nestedInnerQueryParseSupport1.getfilterFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.apache.lucene.search.Query query9 = null;
        nestedInnerQueryParseSupport1.innerQuery = query9;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = nestedInnerQueryParseSupport1.parentFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test02706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02706");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound;
        java.lang.String str5 = nestedInnerQueryParseSupport1.path;
        boolean boolean6 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryParsed;
        org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.innerFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = nestedInnerQueryParseSupport1.source;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Query query11 = null;
        nestedInnerQueryParseSupport1.innerFilter = query11;
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(query8);
        org.junit.Assert.assertNull(bytesReference9);
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test02707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02707");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.queryParsed = true;
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        org.apache.lucene.search.Filter filter7 = nestedInnerQueryParseSupport1.childFilter;
        org.apache.lucene.search.Filter filter8 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter8);
        org.apache.lucene.search.Filter filter10 = null;
        nestedInnerQueryParseSupport1.childFilter = filter10;
        nestedInnerQueryParseSupport1.filterFound = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference14 = nestedInnerQueryParseSupport1.getsource();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper15;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(filter7);
        org.junit.Assert.assertNull(bytesReference14);
    }

    @Test
    public void test02708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02708");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter4);
        nestedInnerQueryParseSupport1.path = "";
        nestedInnerQueryParseSupport1.setqueryFound(true);
        java.lang.String str10 = nestedInnerQueryParseSupport1.path;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test02709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02709");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter2);
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerQuery;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test02710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02710");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean5 = nestedInnerQueryParseSupport1.filterParsed;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.innerFilter;
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(query8);
    }

    @Test
    public void test02711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02711");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = null;
        nestedInnerQueryParseSupport1.source = bytesReference8;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.parentObjectMapper;
        nestedInnerQueryParseSupport1.queryParsed = true;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test02712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02712");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        boolean boolean6 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean10 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport1.getparseContext();
        boolean boolean12 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper13;
        nestedInnerQueryParseSupport1.queryParsed = false;
        org.apache.lucene.search.Query query17 = null;
        nestedInnerQueryParseSupport1.innerQuery = query17;
        boolean boolean19 = nestedInnerQueryParseSupport1.queryFound;
        nestedInnerQueryParseSupport1.path = "object";
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query22 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(queryParseContext11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test02713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02713");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.queryParsed = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = null;
        nestedInnerQueryParseSupport1.source = bytesReference8;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.parentObjectMapper;
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        org.apache.lucene.search.Filter filter13 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter13);
        org.apache.lucene.search.Filter filter15 = nestedInnerQueryParseSupport1.childFilter;
        org.apache.lucene.search.Filter filter16 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter16);
        org.apache.lucene.search.Query query18 = nestedInnerQueryParseSupport1.innerQuery;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(filter15);
        org.junit.Assert.assertNull(query18);
    }

    @Test
    public void test02714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02714");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport1.getparentFilter();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query11 = null;
        nestedInnerQueryParseSupport1.innerFilter = query11;
        java.lang.String str13 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test02715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02715");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        boolean boolean6 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean10 = nestedInnerQueryParseSupport1.getqueryParsed();
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference13);
        boolean boolean15 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean16 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.query.QueryParseContext queryParseContext17 = nestedInnerQueryParseSupport1.parseContext;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(queryParseContext17);
    }

    @Test
    public void test02716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02716");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryParsed;
        nestedInnerQueryParseSupport1.path = "object";
        java.lang.String str13 = nestedInnerQueryParseSupport1.path;
        boolean boolean14 = nestedInnerQueryParseSupport1.getqueryFound();
        boolean boolean15 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.apache.lucene.search.Filter filter16 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "object" + "'", str13, "object");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test02717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02717");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter2);
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerQuery;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference5);
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.Filter filter8 = nestedInnerQueryParseSupport1.getchildFilter();
        boolean boolean9 = nestedInnerQueryParseSupport1.getqueryParsed();
        boolean boolean10 = nestedInnerQueryParseSupport1.filterParsed;
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference11);
        java.lang.String str13 = nestedInnerQueryParseSupport1.getPath();
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(filter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test02718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02718");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport1.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.parentObjectMapper;
        boolean boolean5 = nestedInnerQueryParseSupport1.getfilterFound();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        nestedInnerQueryParseSupport1.setfilterFound(false);
        org.apache.lucene.search.Query query9 = null;
        nestedInnerQueryParseSupport1.innerQuery = query9;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = nestedInnerQueryParseSupport1.parentFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = nestedInnerQueryParseSupport1.source;
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = null;
        nestedInnerQueryParseSupport1.source = bytesReference13;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertNull(query3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
        org.junit.Assert.assertNull(bytesReference12);
    }

    @Test
    public void test02719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02719");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport1.innerFilter = query5;
        org.apache.lucene.search.Filter filter7 = nestedInnerQueryParseSupport1.getchildFilter();
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(filter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test02720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02720");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        boolean boolean6 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean10 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport1.getparseContext();
        boolean boolean12 = nestedInnerQueryParseSupport1.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean14 = nestedInnerQueryParseSupport1.filterFound();
        org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport1.innerFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference16 = null;
        nestedInnerQueryParseSupport1.source = bytesReference16;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter18 = nestedInnerQueryParseSupport1.getparentFilter();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper19 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.query.QueryParseContext queryParseContext20 = nestedInnerQueryParseSupport1.parseContext;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query21 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(queryParseContext11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(query15);
        org.junit.Assert.assertNull(bitDocIdSetFilter18);
        org.junit.Assert.assertNull(objectMapper19);
        org.junit.Assert.assertNull(queryParseContext20);
    }

    @Test
    public void test02721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02721");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter8;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = null;
        nestedInnerQueryParseSupport1.source = bytesReference10;
        org.apache.lucene.search.Query query12 = null;
        nestedInnerQueryParseSupport1.innerFilter = query12;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = nestedInnerQueryParseSupport1.parentFilter;
        org.apache.lucene.search.Filter filter15 = null;
        nestedInnerQueryParseSupport1.childFilter = filter15;
        java.lang.String str17 = nestedInnerQueryParseSupport1.path;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test02722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02722");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.index.query.QueryParseContext queryParseContext4 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean5 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        nestedInnerQueryParseSupport1.queryParsed = true;
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.innerFilter;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(queryParseContext4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(query9);
    }

    @Test
    public void test02723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02723");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterFound();
        nestedInnerQueryParseSupport1.filterParsed = true;
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound();
        nestedInnerQueryParseSupport1.queryFound = true;
        org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport1.innerFilter;
        boolean boolean15 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper16 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper16;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(query14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test02724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02724");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterFound();
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.innerFilter;
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound;
        nestedInnerQueryParseSupport1.path = "hi!";
        nestedInnerQueryParseSupport1.filterParsed = true;
        nestedInnerQueryParseSupport1.setfilterFound(false);
        org.apache.lucene.search.Filter filter17 = nestedInnerQueryParseSupport1.childFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference18 = null;
        nestedInnerQueryParseSupport1.source = bytesReference18;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper20 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper20;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper22 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper22;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(query9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(filter17);
    }

    @Test
    public void test02725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02725");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.index.query.QueryParseContext queryParseContext4 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean5 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = nestedInnerQueryParseSupport1.getsource();
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.apache.lucene.search.Filter filter10 = nestedInnerQueryParseSupport1.childFilter;
        java.lang.String str11 = nestedInnerQueryParseSupport1.getPath();
        nestedInnerQueryParseSupport1.queryFound = false;
        org.apache.lucene.search.Filter filter14 = nestedInnerQueryParseSupport1.getchildFilter();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(queryParseContext4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(bytesReference6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(filter10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(filter14);
    }

    @Test
    public void test02726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02726");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterFound();
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean11 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Filter filter13 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter13);
        boolean boolean15 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference16 = nestedInnerQueryParseSupport1.source;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query17 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(bytesReference16);
    }

    @Test
    public void test02727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02727");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.queryParsed = false;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter11);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = nestedInnerQueryParseSupport1.parentFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference14 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference14);
        org.apache.lucene.search.Query query16 = null;
        nestedInnerQueryParseSupport1.innerQuery = query16;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(bitDocIdSetFilter13);
    }

    @Test
    public void test02728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02728");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound();
        nestedInnerQueryParseSupport1.path = "";
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = nestedInnerQueryParseSupport1.source;
        boolean boolean14 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean15 = nestedInnerQueryParseSupport1.getqueryFound();
        org.apache.lucene.search.Filter filter16 = null;
        nestedInnerQueryParseSupport1.childFilter = filter16;
        org.elasticsearch.common.bytes.BytesReference bytesReference18 = null;
        nestedInnerQueryParseSupport1.source = bytesReference18;
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bytesReference13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test02729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02729");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterFound();
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.innerFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter10);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean13 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport1.parentObjectMapper;
        nestedInnerQueryParseSupport1.path = "object";
        org.elasticsearch.common.bytes.BytesReference bytesReference17 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference17);
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(query9);
        org.junit.Assert.assertNull(bitDocIdSetFilter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(objectMapper14);
    }

    @Test
    public void test02730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02730");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        boolean boolean6 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean10 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport1.getparseContext();
        boolean boolean12 = nestedInnerQueryParseSupport1.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean14 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean15 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean16 = nestedInnerQueryParseSupport1.queryParsed;
        nestedInnerQueryParseSupport1.path = "";
        boolean boolean19 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference20 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference20);
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(queryParseContext11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test02731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02731");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.index.query.QueryParseContext queryParseContext4 = nestedInnerQueryParseSupport1.parseContext;
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport1.innerFilter;
        org.apache.lucene.search.Filter filter6 = nestedInnerQueryParseSupport1.childFilter;
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterParsed;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(queryParseContext4);
        org.junit.Assert.assertNull(query5);
        org.junit.Assert.assertNull(filter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test02732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02732");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.parentObjectMapper;
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound;
        nestedInnerQueryParseSupport1.queryFound = false;
        boolean boolean11 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = null;
        nestedInnerQueryParseSupport1.source = bytesReference12;
        boolean boolean14 = nestedInnerQueryParseSupport1.queryParsed;
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test02733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02733");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper5;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport1.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = nestedInnerQueryParseSupport1.getsource();
        boolean boolean10 = nestedInnerQueryParseSupport1.filterParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper11;
        org.apache.lucene.search.Filter filter13 = nestedInnerQueryParseSupport1.childFilter;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertNull(query7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(bytesReference9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(filter13);
    }

    @Test
    public void test02734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02734");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport1.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.parentObjectMapper;
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.Filter filter6 = nestedInnerQueryParseSupport1.getchildFilter();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference9);
        org.apache.lucene.search.Query query11 = null;
        nestedInnerQueryParseSupport1.innerQuery = query11;
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference13);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertNull(query3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(filter6);
    }

    @Test
    public void test02735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02735");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.path;
        nestedInnerQueryParseSupport1.queryFound = false;
        org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport1.innerFilter;
        nestedInnerQueryParseSupport1.path = "";
        org.apache.lucene.search.Filter filter9 = null;
        nestedInnerQueryParseSupport1.childFilter = filter9;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        nestedInnerQueryParseSupport1.queryFound = true;
        org.elasticsearch.index.query.QueryParseContext queryParseContext14 = nestedInnerQueryParseSupport1.parseContext;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(query6);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertNull(queryParseContext14);
    }

    @Test
    public void test02736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02736");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.index.query.QueryParseContext queryParseContext4 = nestedInnerQueryParseSupport1.parseContext;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.parentObjectMapper;
        nestedInnerQueryParseSupport1.filterFound = false;
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(queryParseContext4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test02737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02737");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        nestedInnerQueryParseSupport1.path = "object";
        java.lang.String str10 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "object" + "'", str10, "object");
    }

    @Test
    public void test02738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02738");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference5);
        nestedInnerQueryParseSupport1.filterFound = false;
        java.lang.String str9 = nestedInnerQueryParseSupport1.getPath();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport1.getparentFilter();
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Filter filter13 = nestedInnerQueryParseSupport1.getchildFilter();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        org.junit.Assert.assertNull(filter13);
    }

    @Test
    public void test02739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02739");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterFound();
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean11 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.parentObjectMapper;
        nestedInnerQueryParseSupport1.path = "nested";
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper15;
        org.elasticsearch.common.bytes.BytesReference bytesReference17 = nestedInnerQueryParseSupport1.source;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertNull(bytesReference17);
    }

    @Test
    public void test02740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02740");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        java.lang.String str3 = nestedInnerQueryParseSupport1.path;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        boolean boolean6 = nestedInnerQueryParseSupport1.getfilterFound();
        nestedInnerQueryParseSupport1.path = "nested";
        org.apache.lucene.search.Filter filter9 = null;
        nestedInnerQueryParseSupport1.childFilter = filter9;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean12 = nestedInnerQueryParseSupport1.queryParsed;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test02741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02741");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.getInnerFilter();
        nestedInnerQueryParseSupport1.queryParsed = false;
        org.apache.lucene.search.Filter filter11 = nestedInnerQueryParseSupport1.getchildFilter();
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        org.apache.lucene.search.Filter filter14 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter14);
        org.elasticsearch.common.bytes.BytesReference bytesReference16 = nestedInnerQueryParseSupport1.source;
        org.apache.lucene.search.Filter filter17 = nestedInnerQueryParseSupport1.childFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference18 = nestedInnerQueryParseSupport1.source;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(query8);
        org.junit.Assert.assertNull(filter11);
        org.junit.Assert.assertNull(bytesReference16);
        org.junit.Assert.assertNull(filter17);
        org.junit.Assert.assertNull(bytesReference18);
    }

    @Test
    public void test02742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02742");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = nestedInnerQueryParseSupport1.parentFilter;
        java.lang.String str10 = nestedInnerQueryParseSupport1.getPath();
        nestedInnerQueryParseSupport1.path = "object";
        boolean boolean13 = nestedInnerQueryParseSupport1.getqueryParsed();
        nestedInnerQueryParseSupport1.queryParsed = true;
        nestedInnerQueryParseSupport1.setfilterFound(false);
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(bitDocIdSetFilter9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test02743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02743");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.index.query.QueryParseContext queryParseContext4 = nestedInnerQueryParseSupport1.getparseContext();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterParsed;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(queryParseContext4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test02744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02744");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference5);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter7);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = nestedInnerQueryParseSupport1.parentFilter;
        org.apache.lucene.search.Filter filter10 = null;
        nestedInnerQueryParseSupport1.childFilter = filter10;
        org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport1.innerFilter;
        org.apache.lucene.search.Filter filter13 = nestedInnerQueryParseSupport1.childFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = nestedInnerQueryParseSupport1.getparentFilter();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertNull(bitDocIdSetFilter9);
        org.junit.Assert.assertNull(query12);
        org.junit.Assert.assertNull(filter13);
        org.junit.Assert.assertNull(bitDocIdSetFilter14);
    }

    @Test
    public void test02745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02745");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport1.getparentFilter();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter11;
        nestedInnerQueryParseSupport1.path = "";
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.Filter filter17 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter17);
        org.apache.lucene.search.Filter filter19 = nestedInnerQueryParseSupport1.getchildFilter();
        org.apache.lucene.search.Filter filter20 = nestedInnerQueryParseSupport1.childFilter;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        org.junit.Assert.assertNull(filter19);
        org.junit.Assert.assertNull(filter20);
    }

    @Test
    public void test02746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02746");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.filterParsed = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper5;
        org.apache.lucene.search.Query query7 = null;
        nestedInnerQueryParseSupport1.innerFilter = query7;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = null;
        nestedInnerQueryParseSupport1.source = bytesReference9;
        org.junit.Assert.assertNull(queryParseContext2);
    }

    @Test
    public void test02747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02747");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter11);
        boolean boolean13 = nestedInnerQueryParseSupport1.getfilterFound();
        boolean boolean14 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter15 = nestedInnerQueryParseSupport1.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter16 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter16);
        org.apache.lucene.search.Query query18 = null;
        nestedInnerQueryParseSupport1.innerFilter = query18;
        boolean boolean20 = nestedInnerQueryParseSupport1.filterFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter21 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter21);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test02748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02748");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport1.innerFilter = query5;
        org.apache.lucene.search.Filter filter7 = nestedInnerQueryParseSupport1.getchildFilter();
        boolean boolean8 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper9;
        nestedInnerQueryParseSupport1.path = "";
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(filter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test02749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02749");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound();
        nestedInnerQueryParseSupport1.path = "";
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = nestedInnerQueryParseSupport1.source;
        org.apache.lucene.search.Filter filter14 = nestedInnerQueryParseSupport1.childFilter;
        org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport1.innerQuery;
        org.apache.lucene.search.Query query16 = null;
        nestedInnerQueryParseSupport1.innerQuery = query16;
        org.apache.lucene.search.Query query18 = null;
        nestedInnerQueryParseSupport1.innerFilter = query18;
        org.apache.lucene.search.Query query20 = nestedInnerQueryParseSupport1.innerFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference21 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference21);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bytesReference13);
        org.junit.Assert.assertNull(filter14);
        org.junit.Assert.assertNull(query15);
        org.junit.Assert.assertNull(query20);
    }

    @Test
    public void test02750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02750");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport1.getparentFilter();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter11;
        nestedInnerQueryParseSupport1.path = "";
        nestedInnerQueryParseSupport1.queryFound = true;
        org.apache.lucene.search.Filter filter17 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter17);
        org.apache.lucene.search.Filter filter19 = nestedInnerQueryParseSupport1.childFilter;
        boolean boolean20 = nestedInnerQueryParseSupport1.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper21 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper21;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        org.junit.Assert.assertNull(filter19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test02751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02751");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryParsed;
        nestedInnerQueryParseSupport1.setfilterFound(false);
        org.apache.lucene.search.Filter filter6 = nestedInnerQueryParseSupport1.childFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter7);
        org.elasticsearch.index.query.QueryParseContext queryParseContext9 = nestedInnerQueryParseSupport1.parseContext;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(filter6);
        org.junit.Assert.assertNull(queryParseContext9);
    }

    @Test
    public void test02752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02752");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter5);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport1.getparentFilter();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean9 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = nestedInnerQueryParseSupport1.getsource();
        nestedInnerQueryParseSupport1.filterParsed = false;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
        org.junit.Assert.assertNull(bitDocIdSetFilter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(bytesReference10);
    }

    @Test
    public void test02753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02753");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        boolean boolean6 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound;
        java.lang.String str8 = nestedInnerQueryParseSupport1.path;
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound();
        org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport1.innerFilter;
        boolean boolean11 = nestedInnerQueryParseSupport1.filterParsed;
        org.apache.lucene.search.Filter filter12 = null;
        nestedInnerQueryParseSupport1.childFilter = filter12;
        boolean boolean14 = nestedInnerQueryParseSupport1.getfilterFound();
        nestedInnerQueryParseSupport1.path = "";
        boolean boolean17 = nestedInnerQueryParseSupport1.queryFound();
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference20 = nestedInnerQueryParseSupport1.source;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(query10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(bytesReference20);
    }

    @Test
    public void test02754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02754");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean5 = nestedInnerQueryParseSupport1.filterParsed;
        org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport1.innerFilter;
        nestedInnerQueryParseSupport1.filterFound = true;
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(query6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test02755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02755");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.getInnerFilter();
        nestedInnerQueryParseSupport1.queryParsed = false;
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.innerQuery;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport1.getInnerFilter();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(query8);
        org.junit.Assert.assertNull(query11);
        org.junit.Assert.assertNull(query14);
    }

    @Test
    public void test02756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02756");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        nestedInnerQueryParseSupport1.filterFound = true;
        nestedInnerQueryParseSupport1.filterParsed = true;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = nestedInnerQueryParseSupport1.getsource();
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = null;
        nestedInnerQueryParseSupport1.source = bytesReference10;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(bytesReference9);
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test02757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02757");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        nestedInnerQueryParseSupport1.filterFound = true;
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound;
        org.apache.lucene.search.Filter filter6 = null;
        nestedInnerQueryParseSupport1.childFilter = filter6;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.innerQuery;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(query9);
    }

    @Test
    public void test02758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02758");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        java.lang.String str3 = nestedInnerQueryParseSupport1.path;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport1.source = bytesReference6;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test02759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02759");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport1.innerFilter = query4;
        nestedInnerQueryParseSupport1.path = "";
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = nestedInnerQueryParseSupport1.getsource();
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(bytesReference9);
    }

    @Test
    public void test02760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02760");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        nestedInnerQueryParseSupport1.filterParsed = false;
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        org.apache.lucene.search.Filter filter12 = nestedInnerQueryParseSupport1.childFilter;
        boolean boolean13 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference14 = null;
        nestedInnerQueryParseSupport1.source = bytesReference14;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(filter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test02761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02761");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter11);
        boolean boolean13 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference17 = null;
        nestedInnerQueryParseSupport1.source = bytesReference17;
        org.elasticsearch.common.bytes.BytesReference bytesReference19 = null;
        nestedInnerQueryParseSupport1.source = bytesReference19;
        java.lang.Class<?> wildcardClass21 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(objectMapper14);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test02762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02762");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference6);
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference8);
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = nestedInnerQueryParseSupport1.source;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        nestedInnerQueryParseSupport1.filterParsed = true;
        boolean boolean16 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.elasticsearch.common.bytes.BytesReference bytesReference17 = nestedInnerQueryParseSupport1.source;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bytesReference12);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(bytesReference17);
    }

    @Test
    public void test02763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02763");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean11 = nestedInnerQueryParseSupport1.queryParsed;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport1.parentObjectMapper;
        boolean boolean15 = nestedInnerQueryParseSupport1.filterParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext16 = nestedInnerQueryParseSupport1.getparseContext();
        boolean boolean17 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper18 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(objectMapper14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(queryParseContext16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(objectMapper18);
    }

    @Test
    public void test02764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02764");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter8;
        org.apache.lucene.search.Filter filter10 = nestedInnerQueryParseSupport1.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper11;
        boolean boolean13 = nestedInnerQueryParseSupport1.queryParsed;
        org.apache.lucene.search.Query query14 = null;
        nestedInnerQueryParseSupport1.innerFilter = query14;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(filter10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test02765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02765");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean11 = nestedInnerQueryParseSupport1.filterFound;
        org.apache.lucene.search.Filter filter12 = nestedInnerQueryParseSupport1.getchildFilter();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper13;
        org.elasticsearch.index.query.QueryParseContext queryParseContext15 = nestedInnerQueryParseSupport1.parseContext;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(bitDocIdSetFilter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(filter12);
        org.junit.Assert.assertNull(queryParseContext15);
    }

    @Test
    public void test02766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02766");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterFound();
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.innerFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter10);
        org.apache.lucene.search.Filter filter12 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter12);
        org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport1.innerFilter;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(query9);
        org.junit.Assert.assertNull(query14);
    }

    @Test
    public void test02767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02767");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference5);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter7);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper9;
        nestedInnerQueryParseSupport1.queryFound = true;
        boolean boolean13 = nestedInnerQueryParseSupport1.filterFound();
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper16 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper16;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter18 = nestedInnerQueryParseSupport1.parentFilter;
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter18);
    }

    @Test
    public void test02768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02768");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        nestedInnerQueryParseSupport1.path = "nested";
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean12 = nestedInnerQueryParseSupport1.queryFound();
        nestedInnerQueryParseSupport1.queryParsed = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference15 = nestedInnerQueryParseSupport1.getsource();
        boolean boolean16 = nestedInnerQueryParseSupport1.filterParsed;
        org.apache.lucene.search.Query query17 = nestedInnerQueryParseSupport1.innerQuery;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter18 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter18);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(bytesReference15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(query17);
    }

    @Test
    public void test02769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02769");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        boolean boolean6 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean10 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.innerQuery;
        boolean boolean12 = nestedInnerQueryParseSupport1.getfilterFound();
        boolean boolean13 = nestedInnerQueryParseSupport1.getqueryFound();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(query11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test02770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02770");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference5);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter7);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper9;
        nestedInnerQueryParseSupport1.queryFound = true;
        boolean boolean13 = nestedInnerQueryParseSupport1.filterFound();
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper16 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper16;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper18 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(objectMapper18);
    }

    @Test
    public void test02771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02771");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        nestedInnerQueryParseSupport1.setfilterFound(false);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter7);
        org.apache.lucene.search.Filter filter9 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter9);
        boolean boolean11 = nestedInnerQueryParseSupport1.queryParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Filter filter13 = null;
        nestedInnerQueryParseSupport1.childFilter = filter13;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test02772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02772");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport1.innerFilter = query4;
        nestedInnerQueryParseSupport1.path = "";
        nestedInnerQueryParseSupport1.queryParsed = true;
        boolean boolean10 = nestedInnerQueryParseSupport1.getqueryParsed();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test02773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02773");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference6);
        org.apache.lucene.search.Filter filter8 = nestedInnerQueryParseSupport1.childFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = nestedInnerQueryParseSupport1.getsource();
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.Filter filter11 = nestedInnerQueryParseSupport1.getchildFilter();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(filter8);
        org.junit.Assert.assertNull(bytesReference9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(filter11);
    }

    @Test
    public void test02774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02774");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter4);
        org.apache.lucene.search.Query query6 = null;
        nestedInnerQueryParseSupport1.innerQuery = query6;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test02775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02775");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        boolean boolean6 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean10 = nestedInnerQueryParseSupport1.getfilterFound();
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.innerFilter;
        boolean boolean12 = nestedInnerQueryParseSupport1.filterFound;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(query11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test02776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02776");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.path = "nested";
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        nestedInnerQueryParseSupport1.filterFound = false;
        org.apache.lucene.search.Query query15 = null;
        nestedInnerQueryParseSupport1.innerFilter = query15;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter17 = nestedInnerQueryParseSupport1.getparentFilter();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper18 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean19 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean20 = nestedInnerQueryParseSupport1.getqueryFound();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertNull(bitDocIdSetFilter17);
        org.junit.Assert.assertNull(objectMapper18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test02777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02777");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterFound();
        org.apache.lucene.search.Filter filter9 = nestedInnerQueryParseSupport1.getchildFilter();
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(filter9);
    }

    @Test
    public void test02778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02778");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound;
        java.lang.String str5 = nestedInnerQueryParseSupport1.path;
        boolean boolean6 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryParsed;
        org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.innerFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = nestedInnerQueryParseSupport1.source;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        org.elasticsearch.index.query.QueryParseContext queryParseContext12 = nestedInnerQueryParseSupport1.parseContext;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper13;
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(query8);
        org.junit.Assert.assertNull(bytesReference9);
        org.junit.Assert.assertNull(queryParseContext12);
    }

    @Test
    public void test02779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02779");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.queryParsed = true;
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.apache.lucene.search.Filter filter6 = nestedInnerQueryParseSupport1.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.filterFound = true;
        java.lang.String str11 = nestedInnerQueryParseSupport1.getPath();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(filter6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(queryParseContext8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test02780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02780");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterFound();
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean11 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean12 = nestedInnerQueryParseSupport1.filterFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = nestedInnerQueryParseSupport1.parentFilter;
        nestedInnerQueryParseSupport1.path = "";
        org.elasticsearch.index.query.QueryParseContext queryParseContext16 = nestedInnerQueryParseSupport1.parseContext;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter13);
        org.junit.Assert.assertNull(queryParseContext16);
    }

    @Test
    public void test02781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02781");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        nestedInnerQueryParseSupport1.filterFound = false;
        boolean boolean13 = nestedInnerQueryParseSupport1.getqueryFound();
        org.apache.lucene.search.Filter filter14 = nestedInnerQueryParseSupport1.getchildFilter();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(filter14);
        org.junit.Assert.assertNull(objectMapper15);
    }

    @Test
    public void test02782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02782");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(true, false);
        boolean boolean3 = nested2.isNested();
        boolean boolean4 = nested2.isIncludeInParent();
        boolean boolean5 = nested2.isNested();
        boolean boolean6 = nested2.isIncludeInParent();
        boolean boolean7 = nested2.isIncludeInRoot();
        boolean boolean8 = nested2.isIncludeInRoot();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test02783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02783");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound();
        org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport1.innerFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = nestedInnerQueryParseSupport1.source;
        boolean boolean12 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = nestedInnerQueryParseSupport1.getsource();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(query10);
        org.junit.Assert.assertNull(bytesReference11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(bytesReference13);
    }

    @Test
    public void test02784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02784");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        boolean boolean6 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean10 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport1.getparseContext();
        boolean boolean12 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper13;
        nestedInnerQueryParseSupport1.path = "hi!";
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Filter filter19 = nestedInnerQueryParseSupport1.getchildFilter();
        boolean boolean20 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper21 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper21;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(queryParseContext11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(filter19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test02785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02785");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.queryParsed = false;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter11);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = nestedInnerQueryParseSupport1.parentFilter;
        org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport1.innerQuery;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(bitDocIdSetFilter13);
        org.junit.Assert.assertNull(query14);
    }

    @Test
    public void test02786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02786");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        java.lang.String str3 = nestedInnerQueryParseSupport1.path;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        boolean boolean6 = nestedInnerQueryParseSupport1.queryParsed;
        nestedInnerQueryParseSupport1.setfilterFound(true);
        nestedInnerQueryParseSupport1.path = "hi!";
        org.apache.lucene.search.Query query11 = null;
        nestedInnerQueryParseSupport1.innerQuery = query11;
        boolean boolean13 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(objectMapper14);
    }

    @Test
    public void test02787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02787");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference6);
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference8);
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.apache.lucene.search.Filter filter12 = nestedInnerQueryParseSupport1.getchildFilter();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = nestedInnerQueryParseSupport1.parentFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference15 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference15);
        nestedInnerQueryParseSupport1.queryParsed = true;
        org.elasticsearch.index.query.QueryParseContext queryParseContext19 = nestedInnerQueryParseSupport1.parseContext;
        org.apache.lucene.search.Query query20 = nestedInnerQueryParseSupport1.innerFilter;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query21 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(filter12);
        org.junit.Assert.assertNull(bitDocIdSetFilter13);
        org.junit.Assert.assertNull(objectMapper14);
        org.junit.Assert.assertNull(queryParseContext19);
        org.junit.Assert.assertNull(query20);
    }

    @Test
    public void test02788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02788");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport1.getparentFilter();
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference6);
        org.apache.lucene.search.Filter filter8 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter8);
        org.apache.lucene.search.Filter filter10 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter10);
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = nestedInnerQueryParseSupport1.getsource();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str14 = nestedInnerQueryParseSupport1.getPath();
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
        org.junit.Assert.assertNull(bytesReference12);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test02789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02789");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference6);
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference8);
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext12 = nestedInnerQueryParseSupport1.getparseContext();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper13;
        java.lang.String str15 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(queryParseContext12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test02790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02790");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter4);
        nestedInnerQueryParseSupport1.queryFound = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference8);
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test02791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02791");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.apache.lucene.search.Filter filter5 = nestedInnerQueryParseSupport1.getchildFilter();
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter10;
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(filter5);
    }

    @Test
    public void test02792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02792");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.apache.lucene.search.Filter filter12 = nestedInnerQueryParseSupport1.childFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = nestedInnerQueryParseSupport1.getsource();
        boolean boolean14 = nestedInnerQueryParseSupport1.getfilterFound();
        org.apache.lucene.search.Filter filter15 = null;
        nestedInnerQueryParseSupport1.childFilter = filter15;
        nestedInnerQueryParseSupport1.queryParsed = true;
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper21 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(filter12);
        org.junit.Assert.assertNull(bytesReference13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(objectMapper21);
    }

    @Test
    public void test02793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02793");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.getInnerFilter();
        org.apache.lucene.search.Query query9 = null;
        nestedInnerQueryParseSupport1.innerFilter = query9;
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference11);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter13);
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(query8);
    }

    @Test
    public void test02794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02794");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(true, false);
        boolean boolean3 = nested2.isIncludeInRoot();
        boolean boolean4 = nested2.isIncludeInRoot();
        boolean boolean5 = nested2.isNested();
        boolean boolean6 = nested2.isIncludeInRoot();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test02795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02795");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.queryParsed = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = null;
        nestedInnerQueryParseSupport1.source = bytesReference8;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.parentObjectMapper;
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        org.apache.lucene.search.Filter filter13 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter13);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(objectMapper15);
    }

    @Test
    public void test02796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02796");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport1.getparseContext();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper12;
        org.elasticsearch.common.bytes.BytesReference bytesReference14 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference14);
        org.apache.lucene.search.Filter filter16 = null;
        nestedInnerQueryParseSupport1.childFilter = filter16;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(queryParseContext11);
    }

    @Test
    public void test02797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02797");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference9);
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport1.innerQuery;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(query13);
    }

    @Test
    public void test02798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02798");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        boolean boolean6 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound;
        java.lang.String str8 = nestedInnerQueryParseSupport1.path;
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound();
        org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport1.innerFilter;
        boolean boolean11 = nestedInnerQueryParseSupport1.filterParsed;
        org.apache.lucene.search.Filter filter12 = null;
        nestedInnerQueryParseSupport1.childFilter = filter12;
        boolean boolean14 = nestedInnerQueryParseSupport1.getfilterFound();
        nestedInnerQueryParseSupport1.path = "";
        boolean boolean17 = nestedInnerQueryParseSupport1.getfilterFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(query10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test02799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02799");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.queryParsed = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = nestedInnerQueryParseSupport1.getsource();
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference9);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = nestedInnerQueryParseSupport1.getparentFilter();
        org.apache.lucene.search.Filter filter12 = null;
        nestedInnerQueryParseSupport1.childFilter = filter12;
        org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport1.innerQuery;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(bytesReference8);
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
        org.junit.Assert.assertNull(query14);
    }

    @Test
    public void test02800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02800");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter8;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport1.innerFilter = query10;
        java.lang.String str12 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean13 = nestedInnerQueryParseSupport1.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = nestedInnerQueryParseSupport1.getparentFilter();
        org.elasticsearch.common.bytes.BytesReference bytesReference15 = null;
        nestedInnerQueryParseSupport1.source = bytesReference15;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter17 = nestedInnerQueryParseSupport1.getparentFilter();
        boolean boolean18 = nestedInnerQueryParseSupport1.queryFound();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter14);
        org.junit.Assert.assertNull(bitDocIdSetFilter17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test02801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02801");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        boolean boolean6 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean10 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport1.getparseContext();
        boolean boolean12 = nestedInnerQueryParseSupport1.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean14 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean15 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean16 = nestedInnerQueryParseSupport1.queryParsed;
        nestedInnerQueryParseSupport1.path = "";
        org.apache.lucene.search.Query query19 = nestedInnerQueryParseSupport1.innerFilter;
        boolean boolean20 = nestedInnerQueryParseSupport1.filterParsed;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query21 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(queryParseContext11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(query19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test02802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02802");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.path = "nested";
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean12 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean13 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter15 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter15);
        org.elasticsearch.index.query.QueryParseContext queryParseContext17 = nestedInnerQueryParseSupport1.parseContext;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(objectMapper14);
        org.junit.Assert.assertNull(queryParseContext17);
    }

    @Test
    public void test02803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02803");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryParsed;
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = nestedInnerQueryParseSupport1.getsource();
        nestedInnerQueryParseSupport1.setqueryFound(false);
        java.lang.String str14 = nestedInnerQueryParseSupport1.path;
        org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport1.innerFilter;
        nestedInnerQueryParseSupport1.path = "";
        java.lang.String str18 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.common.bytes.BytesReference bytesReference19 = nestedInnerQueryParseSupport1.source;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(bytesReference11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(query15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(bytesReference19);
    }

    @Test
    public void test02804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02804");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound;
        java.lang.String str5 = nestedInnerQueryParseSupport1.path;
        boolean boolean6 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.apache.lucene.search.Filter filter7 = nestedInnerQueryParseSupport1.childFilter;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        nestedInnerQueryParseSupport1.setfilterFound(false);
        boolean boolean12 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.parentObjectMapper;
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(filter7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test02805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02805");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter4);
        nestedInnerQueryParseSupport1.queryParsed = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.apache.lucene.search.Filter filter9 = nestedInnerQueryParseSupport1.childFilter;
        boolean boolean10 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = nestedInnerQueryParseSupport1.getsource();
        org.apache.lucene.search.Filter filter12 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter12);
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(filter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(bytesReference11);
    }

    @Test
    public void test02806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02806");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryParsed;
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        boolean boolean6 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference7 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference7);
        java.lang.String str9 = nestedInnerQueryParseSupport1.getPath();
        nestedInnerQueryParseSupport1.path = "";
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test02807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02807");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport1.getparentFilter();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter11;
        nestedInnerQueryParseSupport1.path = "";
        nestedInnerQueryParseSupport1.queryFound = true;
        org.apache.lucene.search.Filter filter17 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter17);
        org.apache.lucene.search.Filter filter19 = nestedInnerQueryParseSupport1.childFilter;
        boolean boolean20 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean21 = nestedInnerQueryParseSupport1.getqueryFound();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        org.junit.Assert.assertNull(filter19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test02808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02808");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference5);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter7);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = nestedInnerQueryParseSupport1.parentFilter;
        org.apache.lucene.search.Filter filter10 = nestedInnerQueryParseSupport1.childFilter;
        org.apache.lucene.search.Filter filter11 = nestedInnerQueryParseSupport1.getchildFilter();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertNull(bitDocIdSetFilter9);
        org.junit.Assert.assertNull(filter10);
        org.junit.Assert.assertNull(filter11);
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test02809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02809");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        boolean boolean6 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean10 = nestedInnerQueryParseSupport1.getqueryParsed();
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference13);
        boolean boolean15 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("object");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test02810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02810");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.index.query.QueryParseContext queryParseContext4 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean5 = nestedInnerQueryParseSupport1.getfilterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        org.apache.lucene.search.Filter filter7 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter7);
        org.elasticsearch.index.query.QueryParseContext queryParseContext9 = nestedInnerQueryParseSupport1.parseContext;
        org.elasticsearch.index.query.QueryParseContext queryParseContext10 = nestedInnerQueryParseSupport1.getparseContext();
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport1.parseContext;
        org.apache.lucene.search.Filter filter12 = nestedInnerQueryParseSupport1.getchildFilter();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(queryParseContext4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(queryParseContext9);
        org.junit.Assert.assertNull(queryParseContext10);
        org.junit.Assert.assertNull(queryParseContext11);
        org.junit.Assert.assertNull(filter12);
    }

    @Test
    public void test02811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02811");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.index.query.QueryParseContext queryParseContext4 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean5 = nestedInnerQueryParseSupport1.getfilterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        nestedInnerQueryParseSupport1.queryParsed = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(queryParseContext4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test02812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02812");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.queryParsed = false;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter11);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = nestedInnerQueryParseSupport1.parentFilter;
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        org.apache.lucene.search.Query query16 = nestedInnerQueryParseSupport1.getInnerQuery();
        boolean boolean17 = nestedInnerQueryParseSupport1.getqueryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter18 = nestedInnerQueryParseSupport1.getparentFilter();
        org.apache.lucene.search.Filter filter19 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter19);
        org.apache.lucene.search.Filter filter21 = nestedInnerQueryParseSupport1.getchildFilter();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(bitDocIdSetFilter13);
        org.junit.Assert.assertNull(query16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter18);
        org.junit.Assert.assertNull(filter21);
    }

    @Test
    public void test02813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02813");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.apache.lucene.search.Filter filter12 = nestedInnerQueryParseSupport1.childFilter;
        java.lang.String str13 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper14;
        boolean boolean16 = nestedInnerQueryParseSupport1.queryFound;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("object");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(filter12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test02814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02814");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter2);
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerQuery;
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport1.parentFilter;
        org.apache.lucene.search.Filter filter7 = null;
        nestedInnerQueryParseSupport1.childFilter = filter7;
        nestedInnerQueryParseSupport1.path = "nested";
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
    }

    @Test
    public void test02815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02815");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        nestedInnerQueryParseSupport1.filterFound = true;
        nestedInnerQueryParseSupport1.filterParsed = true;
        org.apache.lucene.search.Query query7 = null;
        nestedInnerQueryParseSupport1.innerQuery = query7;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper9;
        org.apache.lucene.search.Query query11 = null;
        nestedInnerQueryParseSupport1.innerQuery = query11;
        nestedInnerQueryParseSupport1.filterFound = false;
        nestedInnerQueryParseSupport1.filterParsed = true;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02816");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = nestedInnerQueryParseSupport1.parentFilter;
        java.lang.String str10 = nestedInnerQueryParseSupport1.getPath();
        nestedInnerQueryParseSupport1.path = "object";
        boolean boolean13 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.apache.lucene.search.Filter filter14 = nestedInnerQueryParseSupport1.childFilter;
        boolean boolean15 = nestedInnerQueryParseSupport1.filterFound;
        nestedInnerQueryParseSupport1.path = "nested";
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(bitDocIdSetFilter9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(filter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test02817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02817");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        java.lang.String str8 = nestedInnerQueryParseSupport1.getPath();
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.innerQuery;
        boolean boolean10 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(query9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test02818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02818");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport1.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.parentObjectMapper;
        boolean boolean5 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport1.innerQuery;
        nestedInnerQueryParseSupport1.setfilterFound(true);
        nestedInnerQueryParseSupport1.filterParsed = false;
        boolean boolean12 = nestedInnerQueryParseSupport1.filterParsed;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertNull(query3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(query7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test02819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02819");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested0 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.NO;
        boolean boolean1 = nested0.isIncludeInParent();
        boolean boolean2 = nested0.isIncludeInParent();
        boolean boolean3 = nested0.isIncludeInParent();
        boolean boolean4 = nested0.isIncludeInParent();
        boolean boolean5 = nested0.isIncludeInRoot();
        boolean boolean6 = nested0.isNested();
        boolean boolean7 = nested0.isIncludeInParent();
        org.junit.Assert.assertNotNull(nested0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test02820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02820");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterFound();
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.innerFilter;
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound;
        nestedInnerQueryParseSupport1.path = "hi!";
        nestedInnerQueryParseSupport1.filterParsed = false;
        boolean boolean15 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.query.QueryParseContext queryParseContext16 = nestedInnerQueryParseSupport1.parseContext;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(query9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(queryParseContext16);
    }

    @Test
    public void test02821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02821");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.apache.lucene.search.Filter filter5 = nestedInnerQueryParseSupport1.getchildFilter();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.getfilterFound();
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(filter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test02822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02822");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.path = "nested";
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        nestedInnerQueryParseSupport1.queryFound = true;
        org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport1.innerFilter;
        org.elasticsearch.index.query.QueryParseContext queryParseContext15 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.apache.lucene.search.Query query18 = null;
        nestedInnerQueryParseSupport1.innerFilter = query18;
        org.elasticsearch.common.bytes.BytesReference bytesReference20 = nestedInnerQueryParseSupport1.getsource();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(query14);
        org.junit.Assert.assertNull(queryParseContext15);
        org.junit.Assert.assertNull(bytesReference20);
    }

    @Test
    public void test02823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02823");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference12);
        org.elasticsearch.index.query.QueryParseContext queryParseContext14 = nestedInnerQueryParseSupport1.getparseContext();
        org.elasticsearch.index.query.QueryParseContext queryParseContext15 = nestedInnerQueryParseSupport1.parseContext;
        org.apache.lucene.search.Query query16 = nestedInnerQueryParseSupport1.innerFilter;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(queryParseContext14);
        org.junit.Assert.assertNull(queryParseContext15);
        org.junit.Assert.assertNull(query16);
    }

    @Test
    public void test02824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02824");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport1.getparentFilter();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter11;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.Filter filter15 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter15);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper17 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper17;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper19 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Filter filter20 = null;
        nestedInnerQueryParseSupport1.childFilter = filter20;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        org.junit.Assert.assertNull(objectMapper19);
    }

    @Test
    public void test02825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02825");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        nestedInnerQueryParseSupport1.setfilterFound(false);
        org.apache.lucene.search.Filter filter7 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter7);
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.innerQuery;
        org.apache.lucene.search.Filter filter10 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter10);
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(query9);
    }

    @Test
    public void test02826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02826");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterFound();
        org.apache.lucene.search.Filter filter10 = nestedInnerQueryParseSupport1.childFilter;
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.innerQuery;
        nestedInnerQueryParseSupport1.path = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(filter10);
        org.junit.Assert.assertNull(query11);
    }

    @Test
    public void test02827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02827");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter11);
        boolean boolean13 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test02828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02828");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        nestedInnerQueryParseSupport1.filterParsed = false;
        nestedInnerQueryParseSupport1.path = "nested";
        org.apache.lucene.search.Query query14 = null;
        nestedInnerQueryParseSupport1.innerFilter = query14;
        boolean boolean16 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test02829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02829");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        nestedInnerQueryParseSupport1.path = "nested";
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean12 = nestedInnerQueryParseSupport1.queryFound();
        nestedInnerQueryParseSupport1.queryParsed = false;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        boolean boolean17 = nestedInnerQueryParseSupport1.getqueryParsed();
        nestedInnerQueryParseSupport1.setfilterFound(false);
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test02830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02830");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter4);
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = nestedInnerQueryParseSupport1.source;
        org.apache.lucene.search.Query query7 = null;
        nestedInnerQueryParseSupport1.innerFilter = query7;
        boolean boolean9 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport1.parseContext;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bytesReference6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(queryParseContext11);
    }

    @Test
    public void test02831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02831");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.index.query.QueryParseContext queryParseContext4 = nestedInnerQueryParseSupport1.getparseContext();
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport1.getsource();
        boolean boolean6 = nestedInnerQueryParseSupport1.getqueryFound();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(queryParseContext4);
        org.junit.Assert.assertNull(bytesReference5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test02832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02832");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper9;
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = nestedInnerQueryParseSupport1.getsource();
        nestedInnerQueryParseSupport1.queryFound = false;
        boolean boolean15 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(bytesReference12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test02833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02833");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.queryParsed = false;
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test02834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02834");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        nestedInnerQueryParseSupport1.setfilterFound(false);
        boolean boolean7 = nestedInnerQueryParseSupport1.getfilterFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.apache.lucene.search.Query query9 = null;
        nestedInnerQueryParseSupport1.innerQuery = query9;
        nestedInnerQueryParseSupport1.path = "nested";
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean14 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test02835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02835");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.path = "nested";
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter12);
        boolean boolean14 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean15 = nestedInnerQueryParseSupport1.filterParsed;
        boolean boolean16 = nestedInnerQueryParseSupport1.getqueryParsed();
        boolean boolean17 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.index.query.QueryParseContext queryParseContext18 = nestedInnerQueryParseSupport1.getparseContext();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(queryParseContext18);
    }

    @Test
    public void test02836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02836");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter4);
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference6);
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = nestedInnerQueryParseSupport1.getsource();
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean10 = nestedInnerQueryParseSupport1.getqueryParsed();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("nested");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bytesReference8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test02837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02837");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter4);
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport1.source = bytesReference6;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference11);
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference13);
        java.lang.String str15 = nestedInnerQueryParseSupport1.getPath();
        nestedInnerQueryParseSupport1.path = "";
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper18 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper18;
        boolean boolean20 = nestedInnerQueryParseSupport1.getqueryFound();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test02838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02838");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter4;
        org.apache.lucene.search.Filter filter6 = null;
        nestedInnerQueryParseSupport1.childFilter = filter6;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter8;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test02839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02839");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        boolean boolean6 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean10 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport1.getparseContext();
        boolean boolean12 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper13;
        nestedInnerQueryParseSupport1.path = "hi!";
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper17 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper17;
        nestedInnerQueryParseSupport1.filterFound = false;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(queryParseContext11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test02840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02840");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference6);
        org.apache.lucene.search.Filter filter8 = nestedInnerQueryParseSupport1.childFilter;
        org.apache.lucene.search.Query query9 = null;
        nestedInnerQueryParseSupport1.innerQuery = query9;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.apache.lucene.search.Filter filter12 = nestedInnerQueryParseSupport1.getchildFilter();
        org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport1.innerFilter;
        org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport1.innerQuery;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(filter8);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertNull(filter12);
        org.junit.Assert.assertNull(query13);
        org.junit.Assert.assertNull(query14);
    }

    @Test
    public void test02841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02841");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.index.query.QueryParseContext queryParseContext4 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean5 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = nestedInnerQueryParseSupport1.getsource();
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = nestedInnerQueryParseSupport1.parentFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = nestedInnerQueryParseSupport1.getsource();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = nestedInnerQueryParseSupport1.getparentFilter();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(queryParseContext4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(bytesReference6);
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
        org.junit.Assert.assertNull(bytesReference12);
        org.junit.Assert.assertNull(bitDocIdSetFilter13);
    }

    @Test
    public void test02842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02842");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound;
        java.lang.String str5 = nestedInnerQueryParseSupport1.path;
        boolean boolean6 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryParsed;
        org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.innerFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = nestedInnerQueryParseSupport1.source;
        boolean boolean10 = nestedInnerQueryParseSupport1.filterParsed;
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = null;
        nestedInnerQueryParseSupport1.source = bytesReference11;
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(query8);
        org.junit.Assert.assertNull(bytesReference9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test02843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02843");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.path;
        nestedInnerQueryParseSupport1.queryFound = false;
        org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport1.innerFilter;
        nestedInnerQueryParseSupport1.path = "";
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.apache.lucene.search.Filter filter10 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter10);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        nestedInnerQueryParseSupport1.filterParsed = true;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("nested");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(query6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test02844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02844");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        boolean boolean6 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean10 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport1.getparseContext();
        boolean boolean12 = nestedInnerQueryParseSupport1.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean14 = nestedInnerQueryParseSupport1.filterFound();
        org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport1.innerFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference16 = null;
        nestedInnerQueryParseSupport1.source = bytesReference16;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter18 = nestedInnerQueryParseSupport1.getparentFilter();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper19 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.query.QueryParseContext queryParseContext20 = nestedInnerQueryParseSupport1.parseContext;
        java.lang.String str21 = nestedInnerQueryParseSupport1.path;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(queryParseContext11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(query15);
        org.junit.Assert.assertNull(bitDocIdSetFilter18);
        org.junit.Assert.assertNull(objectMapper19);
        org.junit.Assert.assertNull(queryParseContext20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test02845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02845");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter4);
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport1.source = bytesReference6;
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = nestedInnerQueryParseSupport1.getsource();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bytesReference8);
    }

    @Test
    public void test02846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02846");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter4);
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = nestedInnerQueryParseSupport1.source;
        org.apache.lucene.search.Filter filter7 = nestedInnerQueryParseSupport1.getchildFilter();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bytesReference6);
        org.junit.Assert.assertNull(filter7);
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test02847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02847");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport1.getsource();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryParsed;
        org.elasticsearch.common.bytes.BytesReference bytesReference7 = nestedInnerQueryParseSupport1.getsource();
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference8);
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = nestedInnerQueryParseSupport1.getparentFilter();
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(bytesReference5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(bytesReference7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
    }

    @Test
    public void test02848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02848");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter4);
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference6);
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = nestedInnerQueryParseSupport1.getsource();
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.innerQuery;
        boolean boolean10 = nestedInnerQueryParseSupport1.getfilterFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter11);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bytesReference8);
        org.junit.Assert.assertNull(query9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test02849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02849");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.queryParsed = true;
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerQuery;
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        nestedInnerQueryParseSupport1.setfilterFound(true);
        java.lang.String str8 = nestedInnerQueryParseSupport1.path;
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference10);
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test02850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02850");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean11 = nestedInnerQueryParseSupport1.filterFound;
        nestedInnerQueryParseSupport1.queryFound = false;
        nestedInnerQueryParseSupport1.setfilterFound(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query16 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(bitDocIdSetFilter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test02851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02851");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport1.getparentFilter();
        org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport1.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterFound();
        nestedInnerQueryParseSupport1.queryParsed = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        nestedInnerQueryParseSupport1.filterFound = false;
        nestedInnerQueryParseSupport1.queryParsed = false;
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
        org.junit.Assert.assertNull(query6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test02852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02852");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.queryParsed = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = nestedInnerQueryParseSupport1.getsource();
        boolean boolean9 = nestedInnerQueryParseSupport1.filterParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext10 = nestedInnerQueryParseSupport1.parseContext;
        org.apache.lucene.search.Filter filter11 = nestedInnerQueryParseSupport1.getchildFilter();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.parentObjectMapper;
        java.lang.Class<?> wildcardClass13 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(bytesReference8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(queryParseContext10);
        org.junit.Assert.assertNull(filter11);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02853");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        boolean boolean6 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean10 = nestedInnerQueryParseSupport1.getqueryParsed();
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference13);
        nestedInnerQueryParseSupport1.setfilterFound(true);
        boolean boolean17 = nestedInnerQueryParseSupport1.getqueryFound();
        nestedInnerQueryParseSupport1.path = "object";
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test02854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02854");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        nestedInnerQueryParseSupport1.filterFound = true;
        nestedInnerQueryParseSupport1.filterParsed = true;
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerQuery = query8;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport1.innerQuery = query10;
        java.lang.String str12 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("object");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test02855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02855");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter2);
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerQuery;
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound;
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.Filter filter9 = null;
        nestedInnerQueryParseSupport1.childFilter = filter9;
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(queryParseContext8);
    }

    @Test
    public void test02856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02856");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(true, false);
        boolean boolean3 = nested2.isNested();
        boolean boolean4 = nested2.isIncludeInParent();
        boolean boolean5 = nested2.isIncludeInRoot();
        boolean boolean6 = nested2.isIncludeInParent();
        boolean boolean7 = nested2.isIncludeInParent();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test02857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02857");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound;
        java.lang.String str5 = nestedInnerQueryParseSupport1.path;
        boolean boolean6 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.apache.lucene.search.Filter filter7 = nestedInnerQueryParseSupport1.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = nestedInnerQueryParseSupport1.getparentFilter();
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(filter7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(bitDocIdSetFilter9);
    }

    @Test
    public void test02858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02858");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.queryParsed = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = null;
        nestedInnerQueryParseSupport1.source = bytesReference8;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.parentObjectMapper;
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper13;
        nestedInnerQueryParseSupport1.filterParsed = false;
        boolean boolean17 = nestedInnerQueryParseSupport1.queryParsed;
        org.apache.lucene.search.Filter filter18 = nestedInnerQueryParseSupport1.childFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter19 = nestedInnerQueryParseSupport1.getparentFilter();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(filter18);
        org.junit.Assert.assertNull(bitDocIdSetFilter19);
    }

    @Test
    public void test02859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02859");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.queryParsed = true;
        boolean boolean4 = nestedInnerQueryParseSupport1.filterParsed;
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test02860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02860");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        boolean boolean6 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound;
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        java.lang.String str10 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test02861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02861");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference6);
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference8);
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext12 = nestedInnerQueryParseSupport1.getparseContext();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper13;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter15 = nestedInnerQueryParseSupport1.getparentFilter();
        org.apache.lucene.search.Filter filter16 = nestedInnerQueryParseSupport1.getchildFilter();
        org.apache.lucene.search.Filter filter17 = null;
        nestedInnerQueryParseSupport1.childFilter = filter17;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("object");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(queryParseContext12);
        org.junit.Assert.assertNull(bitDocIdSetFilter15);
        org.junit.Assert.assertNull(filter16);
    }

    @Test
    public void test02862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02862");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference6);
        org.apache.lucene.search.Filter filter8 = nestedInnerQueryParseSupport1.childFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = nestedInnerQueryParseSupport1.getsource();
        org.elasticsearch.index.query.QueryParseContext queryParseContext10 = nestedInnerQueryParseSupport1.getparseContext();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper11;
        org.apache.lucene.search.Query query13 = null;
        nestedInnerQueryParseSupport1.innerFilter = query13;
        boolean boolean15 = nestedInnerQueryParseSupport1.queryParsed;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(filter8);
        org.junit.Assert.assertNull(bytesReference9);
        org.junit.Assert.assertNull(queryParseContext10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test02863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02863");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterFound();
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean11 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean12 = nestedInnerQueryParseSupport1.filterFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = nestedInnerQueryParseSupport1.parentFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport1.parentObjectMapper;
        java.lang.Class<?> wildcardClass15 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter13);
        org.junit.Assert.assertNull(objectMapper14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test02864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02864");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        nestedInnerQueryParseSupport1.filterParsed = false;
        nestedInnerQueryParseSupport1.path = "nested";
        org.apache.lucene.search.Query query14 = null;
        nestedInnerQueryParseSupport1.innerFilter = query14;
        boolean boolean16 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference17 = nestedInnerQueryParseSupport1.source;
        nestedInnerQueryParseSupport1.queryFound = false;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(bytesReference17);
    }

    @Test
    public void test02865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02865");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter4);
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference6);
        nestedInnerQueryParseSupport1.filterParsed = false;
        nestedInnerQueryParseSupport1.filterParsed = true;
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = nestedInnerQueryParseSupport1.getsource();
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference13);
        org.elasticsearch.index.query.QueryParseContext queryParseContext15 = nestedInnerQueryParseSupport1.parseContext;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bytesReference12);
        org.junit.Assert.assertNull(queryParseContext15);
    }

    @Test
    public void test02866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02866");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter4;
        org.apache.lucene.search.Filter filter6 = null;
        nestedInnerQueryParseSupport1.childFilter = filter6;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter8;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        boolean boolean12 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean13 = nestedInnerQueryParseSupport1.queryParsed;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference16 = null;
        nestedInnerQueryParseSupport1.source = bytesReference16;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper18 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(objectMapper18);
    }

    @Test
    public void test02867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02867");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        nestedInnerQueryParseSupport1.setfilterFound(false);
        boolean boolean7 = nestedInnerQueryParseSupport1.getfilterFound();
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport1.innerFilter = query10;
        nestedInnerQueryParseSupport1.setfilterFound(false);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper14;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test02868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02868");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference5);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter7);
        org.apache.lucene.search.Filter filter9 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter9);
        nestedInnerQueryParseSupport1.filterFound = false;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.parentObjectMapper;
        nestedInnerQueryParseSupport1.setfilterFound(false);
        org.apache.lucene.search.Query query16 = nestedInnerQueryParseSupport1.innerFilter;
        boolean boolean17 = nestedInnerQueryParseSupport1.queryParsed;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query18 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertNull(query16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test02869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02869");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter11);
        boolean boolean13 = nestedInnerQueryParseSupport1.getfilterFound();
        org.apache.lucene.search.Filter filter14 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter14);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter16 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter16);
        nestedInnerQueryParseSupport1.setfilterFound(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query20 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test02870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02870");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter11);
        boolean boolean13 = nestedInnerQueryParseSupport1.getfilterFound();
        boolean boolean14 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean15 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.query.QueryParseContext queryParseContext16 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean17 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(queryParseContext16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test02871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02871");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter8;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport1.innerFilter = query10;
        java.lang.String str12 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean13 = nestedInnerQueryParseSupport1.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = nestedInnerQueryParseSupport1.getparentFilter();
        org.elasticsearch.common.bytes.BytesReference bytesReference15 = null;
        nestedInnerQueryParseSupport1.source = bytesReference15;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("nested");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter14);
    }

    @Test
    public void test02872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02872");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        boolean boolean6 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean10 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport1.getparseContext();
        boolean boolean12 = nestedInnerQueryParseSupport1.getqueryFound();
        nestedInnerQueryParseSupport1.filterFound = false;
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(queryParseContext11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test02873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02873");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.apache.lucene.search.Filter filter5 = nestedInnerQueryParseSupport1.getchildFilter();
        boolean boolean6 = nestedInnerQueryParseSupport1.getfilterFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(filter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test02874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02874");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.filterParsed = true;
        org.apache.lucene.search.Filter filter5 = null;
        nestedInnerQueryParseSupport1.childFilter = filter5;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
    }

    @Test
    public void test02875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02875");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter2);
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerQuery;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter5);
        org.apache.lucene.search.Filter filter7 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter7);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        nestedInnerQueryParseSupport1.queryParsed = true;
        org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport1.getInnerQuery();
        org.elasticsearch.common.bytes.BytesReference bytesReference15 = null;
        nestedInnerQueryParseSupport1.source = bytesReference15;
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(query14);
    }

    @Test
    public void test02876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02876");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound();
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.innerQuery;
        java.lang.String str12 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str13 = nestedInnerQueryParseSupport1.path;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = nestedInnerQueryParseSupport1.getparentFilter();
        java.lang.String str15 = nestedInnerQueryParseSupport1.path;
        org.elasticsearch.common.bytes.BytesReference bytesReference16 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(query11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(bitDocIdSetFilter14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test02877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02877");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound;
        java.lang.String str5 = nestedInnerQueryParseSupport1.path;
        boolean boolean6 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.apache.lucene.search.Filter filter7 = nestedInnerQueryParseSupport1.childFilter;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        nestedInnerQueryParseSupport1.setfilterFound(false);
        boolean boolean12 = nestedInnerQueryParseSupport1.getfilterFound();
        boolean boolean13 = nestedInnerQueryParseSupport1.getqueryParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(filter7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test02878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02878");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound();
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.innerQuery;
        org.apache.lucene.search.Filter filter12 = null;
        nestedInnerQueryParseSupport1.childFilter = filter12;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.apache.lucene.search.Query query15 = null;
        nestedInnerQueryParseSupport1.innerQuery = query15;
        nestedInnerQueryParseSupport1.queryParsed = true;
        nestedInnerQueryParseSupport1.filterParsed = true;
        nestedInnerQueryParseSupport1.path = "nested";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(query11);
        org.junit.Assert.assertNull(objectMapper14);
    }

    @Test
    public void test02879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02879");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper4);
    }

    @Test
    public void test02880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02880");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport1.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper11;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(query10);
    }

    @Test
    public void test02881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02881");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound();
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.innerQuery;
        org.apache.lucene.search.Filter filter12 = null;
        nestedInnerQueryParseSupport1.childFilter = filter12;
        boolean boolean14 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.index.query.QueryParseContext queryParseContext15 = nestedInnerQueryParseSupport1.parseContext;
        java.lang.String str16 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str17 = nestedInnerQueryParseSupport1.path;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(query11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(queryParseContext15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test02882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02882");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport1.innerFilter = query4;
        nestedInnerQueryParseSupport1.filterFound = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = nestedInnerQueryParseSupport1.source;
        nestedInnerQueryParseSupport1.filterFound = true;
        nestedInnerQueryParseSupport1.setfilterFound(false);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = nestedInnerQueryParseSupport1.getparentFilter();
        java.lang.Class<?> wildcardClass14 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(bytesReference8);
        org.junit.Assert.assertNull(bitDocIdSetFilter13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02883");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterFound();
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.index.query.QueryParseContext queryParseContext12 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean13 = nestedInnerQueryParseSupport1.queryFound;
        org.elasticsearch.index.query.QueryParseContext queryParseContext14 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport1.innerQuery;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertNull(queryParseContext12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(queryParseContext14);
        org.junit.Assert.assertNull(query15);
    }

    @Test
    public void test02884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02884");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport1.innerFilter = query4;
        nestedInnerQueryParseSupport1.path = "";
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound();
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport1.innerFilter = query10;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.apache.lucene.search.Filter filter13 = nestedInnerQueryParseSupport1.childFilter;
        org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport1.innerQuery;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertNull(filter13);
        org.junit.Assert.assertNull(query14);
    }

    @Test
    public void test02885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02885");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport1.innerQuery;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertNull(query3);
    }

    @Test
    public void test02886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02886");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        boolean boolean6 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter11);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = nestedInnerQueryParseSupport1.getparentFilter();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter13);
    }

    @Test
    public void test02887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02887");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.filterParsed = true;
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.apache.lucene.search.Query query7 = null;
        nestedInnerQueryParseSupport1.innerFilter = query7;
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean10 = nestedInnerQueryParseSupport1.getqueryFound();
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound;
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test02888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02888");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.path;
        nestedInnerQueryParseSupport1.queryFound = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = nestedInnerQueryParseSupport1.getsource();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.Class<?> wildcardClass8 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(bytesReference6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test02889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02889");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.path;
        nestedInnerQueryParseSupport1.queryFound = false;
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference7 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference7);
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        nestedInnerQueryParseSupport1.queryFound = true;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test02890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02890");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport1.getparseContext();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(queryParseContext11);
    }

    @Test
    public void test02891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02891");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter4;
        org.apache.lucene.search.Filter filter6 = null;
        nestedInnerQueryParseSupport1.childFilter = filter6;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter8;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport1.innerQuery = query10;
        boolean boolean12 = nestedInnerQueryParseSupport1.getqueryParsed();
        nestedInnerQueryParseSupport1.queryParsed = true;
        boolean boolean15 = nestedInnerQueryParseSupport1.getqueryFound();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test02892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02892");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport1.innerFilter = query4;
        nestedInnerQueryParseSupport1.path = "";
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str9 = nestedInnerQueryParseSupport1.getPath();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport1.getparentFilter();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper11;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
    }

    @Test
    public void test02893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02893");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport1.innerFilter = query5;
        org.apache.lucene.search.Filter filter7 = nestedInnerQueryParseSupport1.getchildFilter();
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        org.apache.lucene.search.Filter filter10 = nestedInnerQueryParseSupport1.childFilter;
        org.apache.lucene.search.Query query11 = null;
        nestedInnerQueryParseSupport1.innerFilter = query11;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = nestedInnerQueryParseSupport1.getparentFilter();
        org.apache.lucene.search.Query query14 = null;
        nestedInnerQueryParseSupport1.innerFilter = query14;
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        java.lang.String str18 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean19 = nestedInnerQueryParseSupport1.getqueryParsed();
        nestedInnerQueryParseSupport1.path = "object";
        nestedInnerQueryParseSupport1.filterFound = false;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper24 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper24;
        nestedInnerQueryParseSupport1.setfilterFound(true);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("object");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(filter7);
        org.junit.Assert.assertNull(filter10);
        org.junit.Assert.assertNull(bitDocIdSetFilter13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test02894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02894");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        boolean boolean6 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport1.getparentFilter();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.parentObjectMapper;
        nestedInnerQueryParseSupport1.filterParsed = true;
        org.apache.lucene.search.Filter filter14 = nestedInnerQueryParseSupport1.childFilter;
        nestedInnerQueryParseSupport1.filterFound = false;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertNull(filter14);
    }

    @Test
    public void test02895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02895");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter2);
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerQuery;
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter6;
        java.lang.String str8 = nestedInnerQueryParseSupport1.path;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter9);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test02896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02896");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.path;
        org.apache.lucene.search.Filter filter4 = nestedInnerQueryParseSupport1.getchildFilter();
        boolean boolean5 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = nestedInnerQueryParseSupport1.source;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(filter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(bytesReference6);
    }

    @Test
    public void test02897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02897");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper2 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper2;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter4;
        boolean boolean6 = nestedInnerQueryParseSupport1.queryParsed;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext9 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        nestedInnerQueryParseSupport1.path = "object";
        org.apache.lucene.search.Filter filter14 = nestedInnerQueryParseSupport1.getchildFilter();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(queryParseContext9);
        org.junit.Assert.assertNull(filter14);
    }

    @Test
    public void test02898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02898");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        nestedInnerQueryParseSupport1.filterFound = true;
        nestedInnerQueryParseSupport1.path = "hi!";
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = nestedInnerQueryParseSupport1.getparentFilter();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(bitDocIdSetFilter8);
    }

    @Test
    public void test02899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02899");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter4);
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference6);
        nestedInnerQueryParseSupport1.filterParsed = false;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryParsed;
        java.lang.String str11 = nestedInnerQueryParseSupport1.path;
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = null;
        nestedInnerQueryParseSupport1.source = bytesReference12;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference15 = nestedInnerQueryParseSupport1.source;
        boolean boolean16 = nestedInnerQueryParseSupport1.filterParsed;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Filter filter19 = nestedInnerQueryParseSupport1.childFilter;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(objectMapper14);
        org.junit.Assert.assertNull(bytesReference15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(filter19);
    }

    @Test
    public void test02900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02900");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport1.innerFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference6);
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound;
        nestedInnerQueryParseSupport1.filterParsed = true;
        boolean boolean11 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(query5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test02901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02901");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        boolean boolean6 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean10 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport1.getparseContext();
        boolean boolean12 = nestedInnerQueryParseSupport1.queryFound();
        org.apache.lucene.search.Query query13 = null;
        nestedInnerQueryParseSupport1.innerQuery = query13;
        boolean boolean15 = nestedInnerQueryParseSupport1.queryParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper16 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean17 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean18 = nestedInnerQueryParseSupport1.filterParsed;
        org.apache.lucene.search.Query query19 = nestedInnerQueryParseSupport1.innerQuery;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(queryParseContext11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(objectMapper16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(query19);
    }

    @Test
    public void test02902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02902");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport1.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper11;
        org.apache.lucene.search.Filter filter13 = nestedInnerQueryParseSupport1.getchildFilter();
        org.apache.lucene.search.Filter filter14 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter14);
        org.apache.lucene.search.Query query16 = null;
        nestedInnerQueryParseSupport1.innerFilter = query16;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(query10);
        org.junit.Assert.assertNull(filter13);
    }

    @Test
    public void test02903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02903");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter2);
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerQuery;
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport1.parentFilter;
        org.apache.lucene.search.Filter filter7 = null;
        nestedInnerQueryParseSupport1.childFilter = filter7;
        nestedInnerQueryParseSupport1.path = "nested";
        nestedInnerQueryParseSupport1.filterFound = true;
        nestedInnerQueryParseSupport1.filterFound = false;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        org.junit.Assert.assertNull(objectMapper15);
    }

    @Test
    public void test02904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02904");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = nestedInnerQueryParseSupport1.getsource();
        nestedInnerQueryParseSupport1.queryFound = false;
        nestedInnerQueryParseSupport1.queryFound = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = nestedInnerQueryParseSupport1.getparentFilter();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(bytesReference4);
        org.junit.Assert.assertNull(bitDocIdSetFilter9);
    }

    @Test
    public void test02905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02905");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        boolean boolean6 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean10 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport1.getparseContext();
        boolean boolean12 = nestedInnerQueryParseSupport1.queryFound();
        org.apache.lucene.search.Query query13 = null;
        nestedInnerQueryParseSupport1.innerQuery = query13;
        boolean boolean15 = nestedInnerQueryParseSupport1.queryParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper16 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.apache.lucene.search.Query query17 = null;
        nestedInnerQueryParseSupport1.innerFilter = query17;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter19 = nestedInnerQueryParseSupport1.parentFilter;
        java.lang.Class<?> wildcardClass20 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(queryParseContext11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(objectMapper16);
        org.junit.Assert.assertNull(bitDocIdSetFilter19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test02906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02906");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter4);
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference6);
        nestedInnerQueryParseSupport1.filterParsed = false;
        nestedInnerQueryParseSupport1.filterParsed = true;
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = nestedInnerQueryParseSupport1.getsource();
        org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport1.innerQuery;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bytesReference12);
        org.junit.Assert.assertNull(query13);
    }

    @Test
    public void test02907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02907");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter8;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = null;
        nestedInnerQueryParseSupport1.source = bytesReference10;
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference12);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.elasticsearch.common.bytes.BytesReference bytesReference16 = nestedInnerQueryParseSupport1.source;
        org.apache.lucene.search.Query query17 = nestedInnerQueryParseSupport1.innerFilter;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query18 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bytesReference16);
        org.junit.Assert.assertNull(query17);
    }

    @Test
    public void test02908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02908");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter11);
        boolean boolean13 = nestedInnerQueryParseSupport1.getfilterFound();
        boolean boolean14 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = nestedInnerQueryParseSupport1.parentObjectMapper;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(objectMapper15);
    }

    @Test
    public void test02909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02909");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport1.innerFilter = query10;
        nestedInnerQueryParseSupport1.queryFound = false;
        java.lang.String str14 = nestedInnerQueryParseSupport1.path;
        nestedInnerQueryParseSupport1.setfilterFound(false);
        nestedInnerQueryParseSupport1.queryFound = false;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test02910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02910");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference6);
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference8);
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = nestedInnerQueryParseSupport1.source;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        nestedInnerQueryParseSupport1.setfilterFound(true);
        boolean boolean17 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper18 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        java.lang.String str19 = nestedInnerQueryParseSupport1.getPath();
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.Filter filter22 = nestedInnerQueryParseSupport1.childFilter;
        nestedInnerQueryParseSupport1.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter25 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter25);
        boolean boolean27 = nestedInnerQueryParseSupport1.filterParsed;
        org.apache.lucene.search.Query query28 = nestedInnerQueryParseSupport1.innerFilter;
        boolean boolean29 = nestedInnerQueryParseSupport1.getqueryParsed();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bytesReference12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(objectMapper18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(filter22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(query28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test02911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02911");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryParsed;
        nestedInnerQueryParseSupport1.path = "object";
        org.apache.lucene.search.Query query13 = null;
        nestedInnerQueryParseSupport1.innerQuery = query13;
        boolean boolean15 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.elasticsearch.common.bytes.BytesReference bytesReference16 = null;
        nestedInnerQueryParseSupport1.source = bytesReference16;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test02912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02912");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.filterParsed = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper5;
        org.apache.lucene.search.Filter filter7 = nestedInnerQueryParseSupport1.childFilter;
        nestedInnerQueryParseSupport1.queryParsed = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper10;
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(filter7);
    }

    @Test
    public void test02913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02913");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(false, false);
        boolean boolean3 = nested2.isNested();
        boolean boolean4 = nested2.isNested();
        boolean boolean5 = nested2.isIncludeInParent();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test02914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02914");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        boolean boolean6 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean10 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport1.getparseContext();
        boolean boolean12 = nestedInnerQueryParseSupport1.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean14 = nestedInnerQueryParseSupport1.filterFound();
        org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport1.innerFilter;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(queryParseContext11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(query15);
    }

    @Test
    public void test02915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02915");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference6);
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference8);
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.apache.lucene.search.Filter filter12 = nestedInnerQueryParseSupport1.getchildFilter();
        nestedInnerQueryParseSupport1.queryFound = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper15;
        boolean boolean17 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.Query query18 = null;
        nestedInnerQueryParseSupport1.innerFilter = query18;
        java.lang.Class<?> wildcardClass20 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(filter12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test02916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02916");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter2);
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerQuery;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound();
        org.apache.lucene.search.Filter filter9 = null;
        nestedInnerQueryParseSupport1.childFilter = filter9;
        boolean boolean11 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.query.QueryParseContext queryParseContext12 = nestedInnerQueryParseSupport1.parseContext;
        org.apache.lucene.search.Filter filter13 = nestedInnerQueryParseSupport1.getchildFilter();
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(queryParseContext12);
        org.junit.Assert.assertNull(filter13);
    }

    @Test
    public void test02917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02917");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.apache.lucene.search.Filter filter6 = nestedInnerQueryParseSupport1.childFilter;
        org.elasticsearch.index.query.QueryParseContext queryParseContext7 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerQuery = query8;
        java.lang.Class<?> wildcardClass10 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(filter6);
        org.junit.Assert.assertNull(queryParseContext7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02918");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter2);
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerQuery;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.innerFilter;
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(query8);
    }

    @Test
    public void test02919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02919");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        nestedInnerQueryParseSupport1.path = "object";
        java.lang.String str10 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean11 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport1.innerFilter;
        boolean boolean14 = nestedInnerQueryParseSupport1.getfilterFound();
        nestedInnerQueryParseSupport1.path = "object";
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "object" + "'", str10, "object");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertNull(query13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test02920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02920");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.parentObjectMapper;
        nestedInnerQueryParseSupport1.path = "nested";
        org.elasticsearch.index.query.QueryParseContext queryParseContext14 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryParsed = true;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertNull(queryParseContext14);
    }

    @Test
    public void test02921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02921");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.queryParsed = true;
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        org.apache.lucene.search.Filter filter7 = nestedInnerQueryParseSupport1.childFilter;
        org.apache.lucene.search.Filter filter8 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter8);
        org.apache.lucene.search.Filter filter10 = null;
        nestedInnerQueryParseSupport1.childFilter = filter10;
        nestedInnerQueryParseSupport1.filterFound = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference14 = nestedInnerQueryParseSupport1.getsource();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper15;
        org.apache.lucene.search.Filter filter17 = nestedInnerQueryParseSupport1.childFilter;
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(filter7);
        org.junit.Assert.assertNull(bytesReference14);
        org.junit.Assert.assertNull(filter17);
    }

    @Test
    public void test02922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02922");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.queryParsed = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = null;
        nestedInnerQueryParseSupport1.source = bytesReference8;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.parentObjectMapper;
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper13;
        org.elasticsearch.common.bytes.BytesReference bytesReference15 = null;
        nestedInnerQueryParseSupport1.source = bytesReference15;
        org.apache.lucene.search.Filter filter17 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter17);
        java.lang.String str19 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.common.bytes.BytesReference bytesReference20 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference20);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query22 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test02923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02923");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.index.query.QueryParseContext queryParseContext4 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport1.innerFilter;
        org.apache.lucene.search.Query query6 = null;
        nestedInnerQueryParseSupport1.innerFilter = query6;
        org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.innerFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = nestedInnerQueryParseSupport1.source;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(queryParseContext4);
        org.junit.Assert.assertNull(query5);
        org.junit.Assert.assertNull(query8);
        org.junit.Assert.assertNull(bytesReference9);
    }

    @Test
    public void test02924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02924");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        boolean boolean6 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test02925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02925");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport1.getparentFilter();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter11;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter15 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter15);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter17 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter17);
        nestedInnerQueryParseSupport1.filterParsed = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper21 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        org.junit.Assert.assertNull(objectMapper21);
    }

    @Test
    public void test02926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02926");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        nestedInnerQueryParseSupport1.filterFound = false;
        nestedInnerQueryParseSupport1.setfilterFound(true);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean16 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.Filter filter17 = nestedInnerQueryParseSupport1.childFilter;
        boolean boolean18 = nestedInnerQueryParseSupport1.queryParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter19 = nestedInnerQueryParseSupport1.parentFilter;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objectMapper15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(filter17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter19);
    }

    @Test
    public void test02927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02927");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.path = "nested";
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport1.innerQuery = query10;
        java.lang.String str12 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "nested" + "'", str12, "nested");
    }

    @Test
    public void test02928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02928");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        nestedInnerQueryParseSupport1.filterParsed = false;
        nestedInnerQueryParseSupport1.path = "nested";
        org.elasticsearch.index.query.QueryParseContext queryParseContext14 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean15 = nestedInnerQueryParseSupport1.getqueryParsed();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(queryParseContext14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test02929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02929");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        nestedInnerQueryParseSupport1.setfilterFound(false);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter7);
        org.elasticsearch.index.query.QueryParseContext queryParseContext9 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport1.getparentFilter();
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = null;
        nestedInnerQueryParseSupport1.source = bytesReference11;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.parentObjectMapper;
        boolean boolean14 = nestedInnerQueryParseSupport1.getfilterParsed();
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(queryParseContext9);
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test02930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02930");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter8;
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test02931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02931");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter8;
        org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport1.innerQuery;
        org.apache.lucene.search.Query query11 = null;
        nestedInnerQueryParseSupport1.innerQuery = query11;
        java.lang.Class<?> wildcardClass13 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(query10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02932");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference5);
        boolean boolean7 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.Filter filter10 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter10);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = nestedInnerQueryParseSupport1.parentFilter;
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter12);
    }

    @Test
    public void test02933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02933");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
    }

    @Test
    public void test02934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02934");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        boolean boolean6 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean10 = nestedInnerQueryParseSupport1.getqueryParsed();
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference13);
        boolean boolean15 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean16 = nestedInnerQueryParseSupport1.filterFound();
        org.apache.lucene.search.Query query17 = nestedInnerQueryParseSupport1.innerQuery;
        org.apache.lucene.search.Query query18 = nestedInnerQueryParseSupport1.innerFilter;
        boolean boolean19 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean20 = nestedInnerQueryParseSupport1.getqueryFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(query17);
        org.junit.Assert.assertNull(query18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test02935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02935");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference5);
        nestedInnerQueryParseSupport1.filterFound = false;
        java.lang.String str9 = nestedInnerQueryParseSupport1.getPath();
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = nestedInnerQueryParseSupport1.source;
        boolean boolean13 = nestedInnerQueryParseSupport1.queryParsed;
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(bytesReference12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test02936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02936");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport1.innerFilter = query5;
        org.apache.lucene.search.Filter filter7 = nestedInnerQueryParseSupport1.getchildFilter();
        boolean boolean8 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference9);
        nestedInnerQueryParseSupport1.filterFound = false;
        org.elasticsearch.index.query.QueryParseContext queryParseContext13 = nestedInnerQueryParseSupport1.getparseContext();
        org.elasticsearch.index.query.QueryParseContext queryParseContext14 = nestedInnerQueryParseSupport1.getparseContext();
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(filter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(queryParseContext13);
        org.junit.Assert.assertNull(queryParseContext14);
    }

    @Test
    public void test02937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02937");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter4);
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport1.source = bytesReference6;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper11;
        boolean boolean13 = nestedInnerQueryParseSupport1.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport1.parentObjectMapper;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(objectMapper14);
    }

    @Test
    public void test02938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02938");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        nestedInnerQueryParseSupport1.filterParsed = false;
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter12);
        boolean boolean14 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference15 = null;
        nestedInnerQueryParseSupport1.source = bytesReference15;
        boolean boolean17 = nestedInnerQueryParseSupport1.filterFound;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test02939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02939");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        boolean boolean6 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean10 = nestedInnerQueryParseSupport1.getqueryParsed();
        nestedInnerQueryParseSupport1.filterParsed = true;
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference15 = nestedInnerQueryParseSupport1.source;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper18 = nestedInnerQueryParseSupport1.parentObjectMapper;
        java.lang.Class<?> wildcardClass19 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(bytesReference15);
        org.junit.Assert.assertNull(objectMapper18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test02940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02940");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter2);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport1.innerQuery = query5;
        nestedInnerQueryParseSupport1.filterFound = true;
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        org.junit.Assert.assertNull(objectMapper4);
    }

    @Test
    public void test02941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02941");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = null;
        nestedInnerQueryParseSupport1.source = bytesReference8;
        org.elasticsearch.index.query.QueryParseContext queryParseContext10 = nestedInnerQueryParseSupport1.getparseContext();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(queryParseContext10);
    }

    @Test
    public void test02942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02942");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.queryParsed = true;
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerQuery;
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        nestedInnerQueryParseSupport1.setfilterFound(true);
        java.lang.String str8 = nestedInnerQueryParseSupport1.path;
        java.lang.String str9 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean10 = nestedInnerQueryParseSupport1.getfilterParsed();
        java.lang.String str11 = nestedInnerQueryParseSupport1.path;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper12;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test02943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02943");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport1.innerFilter;
        nestedInnerQueryParseSupport1.path = "object";
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterFound();
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.innerFilter;
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(query5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(query9);
    }

    @Test
    public void test02944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02944");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested0 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.NO;
        boolean boolean1 = nested0.isIncludeInParent();
        boolean boolean2 = nested0.isIncludeInRoot();
        boolean boolean3 = nested0.isNested();
        boolean boolean4 = nested0.isNested();
        boolean boolean5 = nested0.isIncludeInParent();
        boolean boolean6 = nested0.isIncludeInRoot();
        boolean boolean7 = nested0.isIncludeInRoot();
        boolean boolean8 = nested0.isIncludeInRoot();
        java.lang.Class<?> wildcardClass9 = nested0.getClass();
        org.junit.Assert.assertNotNull(nested0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
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
    public void test02945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02945");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryParsed;
        org.apache.lucene.search.Filter filter11 = nestedInnerQueryParseSupport1.getchildFilter();
        java.lang.String str12 = nestedInnerQueryParseSupport1.path;
        org.apache.lucene.search.Query query13 = null;
        nestedInnerQueryParseSupport1.innerFilter = query13;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(bitDocIdSetFilter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(filter11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test02946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02946");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter11);
        boolean boolean13 = nestedInnerQueryParseSupport1.getfilterFound();
        org.apache.lucene.search.Filter filter14 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter14);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter16 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter16);
        java.lang.String str18 = nestedInnerQueryParseSupport1.path;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper19 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.apache.lucene.search.Query query20 = null;
        nestedInnerQueryParseSupport1.innerQuery = query20;
        nestedInnerQueryParseSupport1.filterParsed = true;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(objectMapper19);
    }

    @Test
    public void test02947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02947");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport1.innerFilter = query10;
        nestedInnerQueryParseSupport1.queryFound = false;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
    }

    @Test
    public void test02948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02948");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.index.query.QueryParseContext queryParseContext4 = nestedInnerQueryParseSupport1.parseContext;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper7;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(queryParseContext4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test02949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02949");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.index.query.QueryParseContext queryParseContext4 = nestedInnerQueryParseSupport1.parseContext;
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport1.innerFilter;
        org.apache.lucene.search.Filter filter6 = nestedInnerQueryParseSupport1.childFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport1.parentFilter;
        nestedInnerQueryParseSupport1.filterParsed = true;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport1.innerFilter = query10;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(queryParseContext4);
        org.junit.Assert.assertNull(query5);
        org.junit.Assert.assertNull(filter6);
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
    }

    @Test
    public void test02950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02950");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.path;
        nestedInnerQueryParseSupport1.setfilterFound(false);
        org.apache.lucene.search.Filter filter6 = nestedInnerQueryParseSupport1.childFilter;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryParsed;
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(filter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test02951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02951");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport1.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.parentObjectMapper;
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.Filter filter6 = nestedInnerQueryParseSupport1.getchildFilter();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference9);
        org.apache.lucene.search.Query query11 = null;
        nestedInnerQueryParseSupport1.innerQuery = query11;
        boolean boolean13 = nestedInnerQueryParseSupport1.queryFound();
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.elasticsearch.index.query.QueryParseContext queryParseContext16 = nestedInnerQueryParseSupport1.parseContext;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertNull(query3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(filter6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(queryParseContext16);
    }

    @Test
    public void test02952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02952");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.queryParsed = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = null;
        nestedInnerQueryParseSupport1.source = bytesReference8;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.parentObjectMapper;
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper13;
        org.elasticsearch.common.bytes.BytesReference bytesReference15 = null;
        nestedInnerQueryParseSupport1.source = bytesReference15;
        boolean boolean17 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper18 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean19 = nestedInnerQueryParseSupport1.filterParsed;
        org.apache.lucene.search.Filter filter20 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter20);
        boolean boolean22 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean23 = nestedInnerQueryParseSupport1.filterFound();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(objectMapper18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test02953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02953");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport1.getparentFilter();
        java.lang.String str11 = nestedInnerQueryParseSupport1.getPath();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = nestedInnerQueryParseSupport1.parentFilter;
        org.apache.lucene.search.Query query13 = null;
        nestedInnerQueryParseSupport1.innerFilter = query13;
        boolean boolean15 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean16 = nestedInnerQueryParseSupport1.filterFound();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(bitDocIdSetFilter12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test02954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02954");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound();
        nestedInnerQueryParseSupport1.path = "";
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = nestedInnerQueryParseSupport1.getparentFilter();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bitDocIdSetFilter13);
    }

    @Test
    public void test02955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02955");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        boolean boolean6 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean10 = nestedInnerQueryParseSupport1.getqueryParsed();
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference13);
        boolean boolean15 = nestedInnerQueryParseSupport1.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter16 = nestedInnerQueryParseSupport1.getparentFilter();
        nestedInnerQueryParseSupport1.filterParsed = false;
        java.lang.String str19 = nestedInnerQueryParseSupport1.path;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter20 = nestedInnerQueryParseSupport1.getparentFilter();
        boolean boolean21 = nestedInnerQueryParseSupport1.queryParsed;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("object");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(bitDocIdSetFilter20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test02956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02956");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter4);
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport1.source = bytesReference6;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference11);
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference13);
        nestedInnerQueryParseSupport1.setfilterFound(false);
        boolean boolean17 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper18 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(objectMapper18);
    }

    @Test
    public void test02957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02957");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound();
        nestedInnerQueryParseSupport1.path = "";
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = nestedInnerQueryParseSupport1.source;
        nestedInnerQueryParseSupport1.path = "object";
        nestedInnerQueryParseSupport1.filterParsed = false;
        nestedInnerQueryParseSupport1.queryFound = false;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query20 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bytesReference13);
    }

    @Test
    public void test02958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02958");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean11 = nestedInnerQueryParseSupport1.queryParsed;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport1.parentObjectMapper;
        boolean boolean15 = nestedInnerQueryParseSupport1.filterParsed;
        boolean boolean16 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(objectMapper14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test02959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02959");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.index.query.QueryParseContext queryParseContext4 = nestedInnerQueryParseSupport1.parseContext;
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport1.innerQuery;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = nestedInnerQueryParseSupport1.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter9;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter11;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(queryParseContext4);
        org.junit.Assert.assertNull(query5);
        org.junit.Assert.assertNull(bitDocIdSetFilter8);
        org.junit.Assert.assertNull(objectMapper15);
    }

    @Test
    public void test02960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02960");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
    }

    @Test
    public void test02961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02961");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterFound();
        org.apache.lucene.search.Filter filter10 = nestedInnerQueryParseSupport1.childFilter;
        org.apache.lucene.search.Filter filter11 = nestedInnerQueryParseSupport1.getchildFilter();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper12;
        org.apache.lucene.search.Query query14 = null;
        nestedInnerQueryParseSupport1.innerFilter = query14;
        boolean boolean16 = nestedInnerQueryParseSupport1.getqueryParsed();
        java.lang.String str17 = nestedInnerQueryParseSupport1.getPath();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(filter10);
        org.junit.Assert.assertNull(filter11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test02962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02962");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference5);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter7);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper9;
        nestedInnerQueryParseSupport1.queryFound = true;
        boolean boolean13 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean14 = nestedInnerQueryParseSupport1.filterParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter15 = nestedInnerQueryParseSupport1.getparentFilter();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter15);
    }

    @Test
    public void test02963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02963");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        boolean boolean6 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean10 = nestedInnerQueryParseSupport1.getqueryParsed();
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference13);
        boolean boolean15 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean16 = nestedInnerQueryParseSupport1.filterFound();
        org.apache.lucene.search.Query query17 = nestedInnerQueryParseSupport1.innerQuery;
        org.apache.lucene.search.Query query18 = nestedInnerQueryParseSupport1.innerFilter;
        boolean boolean19 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.query.QueryParseContext queryParseContext20 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(query17);
        org.junit.Assert.assertNull(query18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(queryParseContext20);
    }

    @Test
    public void test02964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02964");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        boolean boolean6 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean10 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport1.getparseContext();
        boolean boolean12 = nestedInnerQueryParseSupport1.queryFound();
        org.apache.lucene.search.Query query13 = null;
        nestedInnerQueryParseSupport1.innerQuery = query13;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        java.lang.String str18 = nestedInnerQueryParseSupport1.path;
        org.apache.lucene.search.Filter filter19 = null;
        nestedInnerQueryParseSupport1.childFilter = filter19;
        org.apache.lucene.search.Query query21 = null;
        nestedInnerQueryParseSupport1.innerQuery = query21;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter23 = nestedInnerQueryParseSupport1.getparentFilter();
        boolean boolean24 = nestedInnerQueryParseSupport1.getfilterFound();
        org.apache.lucene.search.Query query25 = nestedInnerQueryParseSupport1.getInnerFilter();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(queryParseContext11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(objectMapper15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(bitDocIdSetFilter23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(query25);
    }

    @Test
    public void test02965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02965");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested0 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.NO;
        boolean boolean1 = nested0.isIncludeInParent();
        boolean boolean2 = nested0.isIncludeInParent();
        boolean boolean3 = nested0.isIncludeInParent();
        boolean boolean4 = nested0.isIncludeInParent();
        boolean boolean5 = nested0.isIncludeInRoot();
        boolean boolean6 = nested0.isIncludeInParent();
        boolean boolean7 = nested0.isIncludeInParent();
        boolean boolean8 = nested0.isIncludeInParent();
        boolean boolean9 = nested0.isIncludeInRoot();
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
    public void test02966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02966");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.filterParsed = true;
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport1.getInnerFilter();
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.parentObjectMapper;
        nestedInnerQueryParseSupport1.setfilterFound(false);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("nested");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(query5);
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test02967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02967");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport1.innerFilter = query4;
        nestedInnerQueryParseSupport1.path = "";
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = nestedInnerQueryParseSupport1.parentFilter;
        org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport1.innerFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = nestedInnerQueryParseSupport1.getparentFilter();
        java.lang.Class<?> wildcardClass14 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
        org.junit.Assert.assertNull(query12);
        org.junit.Assert.assertNull(bitDocIdSetFilter13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02968");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport1.getparentFilter();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter11;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter15 = nestedInnerQueryParseSupport1.getparentFilter();
        boolean boolean16 = nestedInnerQueryParseSupport1.queryParsed;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        org.junit.Assert.assertNull(bitDocIdSetFilter15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test02969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02969");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter8;
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.parentObjectMapper;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test02970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02970");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterFound();
        nestedInnerQueryParseSupport1.filterParsed = true;
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter12;
        nestedInnerQueryParseSupport1.setfilterFound(true);
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper18 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper19 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper19;
        boolean boolean21 = nestedInnerQueryParseSupport1.getqueryFound();
        org.apache.lucene.search.Filter filter22 = null;
        nestedInnerQueryParseSupport1.childFilter = filter22;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper24 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(objectMapper18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(objectMapper24);
    }

    @Test
    public void test02971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02971");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper9;
        boolean boolean11 = nestedInnerQueryParseSupport1.queryParsed;
        org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport1.innerQuery;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(query12);
    }

    @Test
    public void test02972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02972");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.index.query.QueryParseContext queryParseContext4 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport1.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext9 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean11 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(queryParseContext4);
        org.junit.Assert.assertNull(query5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(queryParseContext9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test02973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02973");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.Class<?> wildcardClass6 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test02974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02974");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter9;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter11;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test02975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02975");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.elasticsearch.index.query.QueryParseContext queryParseContext5 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.Filter filter8 = nestedInnerQueryParseSupport1.getchildFilter();
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(queryParseContext5);
        org.junit.Assert.assertNull(filter8);
    }

    @Test
    public void test02976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02976");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.path;
        nestedInnerQueryParseSupport1.setfilterFound(false);
        org.apache.lucene.search.Filter filter6 = nestedInnerQueryParseSupport1.childFilter;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(filter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test02977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02977");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryParsed;
        nestedInnerQueryParseSupport1.path = "object";
        java.lang.String str13 = nestedInnerQueryParseSupport1.path;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper14;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "object" + "'", str13, "object");
    }

    @Test
    public void test02978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02978");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = nestedInnerQueryParseSupport1.parentFilter;
        org.elasticsearch.index.query.QueryParseContext queryParseContext10 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = nestedInnerQueryParseSupport1.parentFilter;
        org.apache.lucene.search.Query query12 = null;
        nestedInnerQueryParseSupport1.innerQuery = query12;
        boolean boolean14 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference15 = nestedInnerQueryParseSupport1.getsource();
        java.lang.String str16 = nestedInnerQueryParseSupport1.getPath();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(bitDocIdSetFilter9);
        org.junit.Assert.assertNull(queryParseContext10);
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(bytesReference15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test02979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02979");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference6);
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference8);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter10);
        boolean boolean12 = nestedInnerQueryParseSupport1.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter13;
        nestedInnerQueryParseSupport1.queryParsed = false;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test02980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02980");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter4;
        org.apache.lucene.search.Query query6 = null;
        nestedInnerQueryParseSupport1.innerQuery = query6;
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = nestedInnerQueryParseSupport1.getsource();
        org.apache.lucene.search.Filter filter9 = nestedInnerQueryParseSupport1.getchildFilter();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(bytesReference8);
        org.junit.Assert.assertNull(filter9);
    }

    @Test
    public void test02981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02981");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterFound();
        nestedInnerQueryParseSupport1.filterParsed = true;
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound();
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport1.innerQuery;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(query14);
    }

    @Test
    public void test02982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02982");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        boolean boolean6 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean10 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.apache.lucene.search.Filter filter11 = null;
        nestedInnerQueryParseSupport1.childFilter = filter11;
        org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport1.innerFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter14;
        org.apache.lucene.search.Query query16 = null;
        nestedInnerQueryParseSupport1.innerFilter = query16;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Filter filter20 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter20);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(query13);
    }

    @Test
    public void test02983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02983");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound();
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.innerQuery;
        java.lang.String str12 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str13 = nestedInnerQueryParseSupport1.path;
        java.lang.String str14 = nestedInnerQueryParseSupport1.path;
        org.apache.lucene.search.Filter filter15 = nestedInnerQueryParseSupport1.childFilter;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(query11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(filter15);
    }

    @Test
    public void test02984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02984");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterFound();
        org.apache.lucene.search.Filter filter10 = nestedInnerQueryParseSupport1.childFilter;
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.innerQuery;
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = nestedInnerQueryParseSupport1.source;
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = null;
        nestedInnerQueryParseSupport1.source = bytesReference13;
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.elasticsearch.index.query.QueryParseContext queryParseContext17 = nestedInnerQueryParseSupport1.getparseContext();
        boolean boolean18 = nestedInnerQueryParseSupport1.queryFound;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(filter10);
        org.junit.Assert.assertNull(query11);
        org.junit.Assert.assertNull(bytesReference12);
        org.junit.Assert.assertNull(queryParseContext17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test02985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02985");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport1.getparentFilter();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter11;
        org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport1.innerFilter;
        org.elasticsearch.index.query.QueryParseContext queryParseContext14 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.Filter filter15 = null;
        nestedInnerQueryParseSupport1.childFilter = filter15;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter17 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter17;
        org.apache.lucene.search.Filter filter19 = null;
        nestedInnerQueryParseSupport1.childFilter = filter19;
        boolean boolean21 = nestedInnerQueryParseSupport1.getqueryFound();
        boolean boolean22 = nestedInnerQueryParseSupport1.queryFound;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query23 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        org.junit.Assert.assertNull(query13);
        org.junit.Assert.assertNull(queryParseContext14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test02986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02986");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter4);
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference6);
        nestedInnerQueryParseSupport1.filterParsed = false;
        nestedInnerQueryParseSupport1.filterParsed = true;
        org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport1.getInnerFilter();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(query12);
    }

    @Test
    public void test02987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02987");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.queryParsed = false;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter11);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean14 = nestedInnerQueryParseSupport1.queryFound;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(bitDocIdSetFilter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test02988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02988");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport1.parseContext;
        org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport1.innerFilter;
        boolean boolean13 = nestedInnerQueryParseSupport1.getqueryFound();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(bitDocIdSetFilter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(queryParseContext11);
        org.junit.Assert.assertNull(query12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test02989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02989");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport1.getparseContext();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper12;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(queryParseContext11);
    }

    @Test
    public void test02990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02990");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter11);
        boolean boolean13 = nestedInnerQueryParseSupport1.getfilterFound();
        boolean boolean14 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter15 = nestedInnerQueryParseSupport1.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter16 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter16);
        boolean boolean18 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference19 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference19);
        boolean boolean21 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test02991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02991");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference6);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter8);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test02992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02992");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter2);
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerQuery;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.elasticsearch.index.query.QueryParseContext queryParseContext7 = nestedInnerQueryParseSupport1.getparseContext();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = queryParseContext7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertNull(queryParseContext7);
    }

    @Test
    public void test02993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02993");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        nestedInnerQueryParseSupport1.setfilterFound(false);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter7);
        org.elasticsearch.index.query.QueryParseContext queryParseContext9 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport1.getparentFilter();
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = null;
        nestedInnerQueryParseSupport1.source = bytesReference11;
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = nestedInnerQueryParseSupport1.source;
        org.apache.lucene.search.Filter filter14 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter14);
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(queryParseContext9);
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        org.junit.Assert.assertNull(bytesReference13);
    }

    @Test
    public void test02994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02994");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.queryParsed = false;
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean9 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.apache.lucene.search.Filter filter10 = nestedInnerQueryParseSupport1.childFilter;
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        org.apache.lucene.search.Filter filter13 = nestedInnerQueryParseSupport1.childFilter;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(filter10);
        org.junit.Assert.assertNull(filter13);
    }

    @Test
    public void test02995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02995");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.queryParsed = false;
        nestedInnerQueryParseSupport1.queryFound = false;
        org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport1.innerFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference11);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(query10);
    }

    @Test
    public void test02996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02996");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper6;
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound;
        nestedInnerQueryParseSupport1.path = "nested";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test02997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02997");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.path;
        nestedInnerQueryParseSupport1.queryFound = false;
        org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport1.innerFilter;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.getqueryFound();
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.innerFilter;
        boolean boolean10 = nestedInnerQueryParseSupport1.getqueryFound();
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.innerFilter;
        boolean boolean12 = nestedInnerQueryParseSupport1.getqueryFound();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(query6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(query9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(query11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test02998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02998");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter11);
        boolean boolean13 = nestedInnerQueryParseSupport1.getfilterFound();
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference16 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference16);
        org.elasticsearch.common.bytes.BytesReference bytesReference18 = null;
        nestedInnerQueryParseSupport1.source = bytesReference18;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper20 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query21 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(objectMapper20);
    }

    @Test
    public void test02999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02999");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterFound();
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.innerFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter10);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = nestedInnerQueryParseSupport1.parentFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.parentObjectMapper;
        boolean boolean14 = nestedInnerQueryParseSupport1.getqueryFound();
        boolean boolean15 = nestedInnerQueryParseSupport1.filterFound();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(query9);
        org.junit.Assert.assertNull(bitDocIdSetFilter12);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test03000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test03000");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.filterParsed = true;
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport1.innerFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport1.parentFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper7;
        nestedInnerQueryParseSupport1.queryFound = false;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(query5);
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        org.junit.Assert.assertNull(objectMapper11);
    }
}
