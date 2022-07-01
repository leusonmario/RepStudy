import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test01501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01501");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        nestedInnerQueryParseSupport1.filterFound = true;
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test01502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01502");
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
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test01503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01503");
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
        org.apache.lucene.search.Filter filter15 = nestedInnerQueryParseSupport1.childFilter;
        boolean boolean16 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.elasticsearch.common.bytes.BytesReference bytesReference17 = null;
        nestedInnerQueryParseSupport1.source = bytesReference17;
        boolean boolean19 = nestedInnerQueryParseSupport1.queryFound;
        java.lang.Class<?> wildcardClass20 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bytesReference13);
        org.junit.Assert.assertNull(filter14);
        org.junit.Assert.assertNull(filter15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test01504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01504");
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
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test01505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01505");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.filterParsed = true;
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter7;
        org.apache.lucene.search.Filter filter9 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter9);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
    }

    @Test
    public void test01506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01506");
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
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test01507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01507");
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
        org.apache.lucene.search.Filter filter10 = nestedInnerQueryParseSupport1.getchildFilter();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper12;
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertNull(bitDocIdSetFilter9);
        org.junit.Assert.assertNull(filter10);
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test01508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01508");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        nestedInnerQueryParseSupport1.filterFound = true;
        nestedInnerQueryParseSupport1.filterParsed = true;
        nestedInnerQueryParseSupport1.queryFound = true;
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterFound();
        org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport1.getInnerFilter();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(query10);
    }

    @Test
    public void test01509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01509");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper5;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound;
        nestedInnerQueryParseSupport1.queryFound = false;
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test01510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01510");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport1.innerFilter = query4;
        nestedInnerQueryParseSupport1.path = "";
        boolean boolean8 = nestedInnerQueryParseSupport1.filterParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper9;
        java.lang.String str11 = nestedInnerQueryParseSupport1.getPath();
        java.lang.Class<?> wildcardClass12 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01511");
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
        org.elasticsearch.common.bytes.BytesReference bytesReference14 = null;
        nestedInnerQueryParseSupport1.source = bytesReference14;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(query9);
    }

    @Test
    public void test01512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01512");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter8);
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = null;
        nestedInnerQueryParseSupport1.source = bytesReference10;
        org.apache.lucene.search.Filter filter12 = nestedInnerQueryParseSupport1.childFilter;
        nestedInnerQueryParseSupport1.setfilterFound(true);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(filter12);
    }

    @Test
    public void test01513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01513");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.elasticsearch.index.query.QueryParseContext queryParseContext5 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper8;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(queryParseContext5);
    }

    @Test
    public void test01514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01514");
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
        boolean boolean15 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean16 = nestedInnerQueryParseSupport1.getfilterParsed();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test01515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01515");
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
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(filter7);
        org.junit.Assert.assertNull(filter10);
        org.junit.Assert.assertNull(bitDocIdSetFilter13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test01516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01516");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean7 = nestedInnerQueryParseSupport1.filterParsed;
        org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.innerQuery;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(query8);
    }

    @Test
    public void test01517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01517");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        boolean boolean7 = nestedInnerQueryParseSupport1.filterParsed;
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test01518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01518");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper9;
        boolean boolean11 = nestedInnerQueryParseSupport1.filterFound;
        nestedInnerQueryParseSupport1.setfilterFound(true);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper14;
        org.apache.lucene.search.Query query16 = null;
        nestedInnerQueryParseSupport1.innerFilter = query16;
        java.lang.String str18 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper19 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = objectMapper19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(objectMapper19);
    }

    @Test
    public void test01519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01519");
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
        org.apache.lucene.search.Query query12 = null;
        nestedInnerQueryParseSupport1.innerQuery = query12;
        org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport1.innerFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference15 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference15);
        java.lang.String str17 = nestedInnerQueryParseSupport1.path;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper18 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(query14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(objectMapper18);
    }

    @Test
    public void test01520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01520");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport1.getsource();
        org.apache.lucene.search.Filter filter6 = null;
        nestedInnerQueryParseSupport1.childFilter = filter6;
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport1.innerFilter = query10;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(bytesReference5);
    }

    @Test
    public void test01521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01521");
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
            org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport1.getInnerQuery();
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
    public void test01522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01522");
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
        boolean boolean13 = nestedInnerQueryParseSupport1.filterFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = nestedInnerQueryParseSupport1.parentFilter;
        org.apache.lucene.search.Filter filter15 = nestedInnerQueryParseSupport1.getchildFilter();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter14);
        org.junit.Assert.assertNull(filter15);
    }

    @Test
    public void test01523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01523");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference5);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter7);
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference9);
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.innerQuery;
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertNull(query11);
    }

    @Test
    public void test01524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01524");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.index.query.QueryParseContext queryParseContext4 = nestedInnerQueryParseSupport1.parseContext;
        org.elasticsearch.index.query.QueryParseContext queryParseContext5 = nestedInnerQueryParseSupport1.getparseContext();
        java.lang.String str6 = nestedInnerQueryParseSupport1.path;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport1.parentFilter;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(queryParseContext4);
        org.junit.Assert.assertNull(queryParseContext5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
    }

    @Test
    public void test01525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01525");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.queryParsed = true;
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        java.lang.String str8 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean9 = nestedInnerQueryParseSupport1.getqueryParsed();
        nestedInnerQueryParseSupport1.setfilterFound(true);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test01526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01526");
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
        boolean boolean17 = nestedInnerQueryParseSupport1.getqueryFound();
        org.apache.lucene.search.Filter filter18 = nestedInnerQueryParseSupport1.getchildFilter();
        boolean boolean19 = nestedInnerQueryParseSupport1.getfilterFound();
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
        org.junit.Assert.assertNull(objectMapper16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(filter18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test01527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01527");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(query10);
        org.junit.Assert.assertNull(bytesReference11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test01528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01528");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean13 = nestedInnerQueryParseSupport1.queryFound();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
        org.junit.Assert.assertNull(bitDocIdSetFilter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test01529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01529");
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
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport1.getparseContext();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(query8);
        org.junit.Assert.assertNull(queryParseContext11);
    }

    @Test
    public void test01530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01530");
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
        org.apache.lucene.search.Filter filter16 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter16);
        boolean boolean18 = nestedInnerQueryParseSupport1.getfilterFound();
        org.apache.lucene.search.Query query19 = null;
        nestedInnerQueryParseSupport1.innerFilter = query19;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter21 = nestedInnerQueryParseSupport1.parentFilter;
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter21);
    }

    @Test
    public void test01531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01531");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound;
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        nestedInnerQueryParseSupport1.setfilterFound(true);
        org.apache.lucene.search.Filter filter9 = null;
        nestedInnerQueryParseSupport1.childFilter = filter9;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper11;
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01532");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        java.lang.String str3 = nestedInnerQueryParseSupport1.path;
        nestedInnerQueryParseSupport1.queryFound = false;
        nestedInnerQueryParseSupport1.filterFound = false;
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterFound();
        java.lang.Class<?> wildcardClass9 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test01533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01533");
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
        nestedInnerQueryParseSupport1.path = "object";
        nestedInnerQueryParseSupport1.filterFound = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper19 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper19;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper21 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper21;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test01534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01534");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.query.QueryParseContext queryParseContext9 = nestedInnerQueryParseSupport1.parseContext;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper10;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(queryParseContext9);
    }

    @Test
    public void test01535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01535");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.filterParsed = true;
        org.apache.lucene.search.Filter filter5 = null;
        nestedInnerQueryParseSupport1.childFilter = filter5;
        boolean boolean7 = nestedInnerQueryParseSupport1.getfilterFound();
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test01536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01536");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper16 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = objectMapper16.getClass();
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
        org.junit.Assert.assertNull(objectMapper15);
        org.junit.Assert.assertNull(objectMapper16);
    }

    @Test
    public void test01537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01537");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter10;
        org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport1.innerFilter;
        boolean boolean13 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.elasticsearch.common.bytes.BytesReference bytesReference14 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(query12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test01538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01538");
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
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean12 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.elasticsearch.index.query.QueryParseContext queryParseContext13 = nestedInnerQueryParseSupport1.getparseContext();
        boolean boolean14 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(queryParseContext13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test01539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01539");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.path;
        nestedInnerQueryParseSupport1.queryFound = false;
        org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport1.innerFilter;
        nestedInnerQueryParseSupport1.path = "";
        org.apache.lucene.search.Filter filter9 = null;
        nestedInnerQueryParseSupport1.childFilter = filter9;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport1.innerFilter;
        org.apache.lucene.search.Filter filter13 = nestedInnerQueryParseSupport1.getchildFilter();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(query6);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertNull(query12);
        org.junit.Assert.assertNull(filter13);
    }

    @Test
    public void test01540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01540");
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
        nestedInnerQueryParseSupport1.filterFound = true;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test01541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01541");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound;
        java.lang.String str5 = nestedInnerQueryParseSupport1.path;
        nestedInnerQueryParseSupport1.filterFound = false;
        nestedInnerQueryParseSupport1.queryFound = false;
        org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport1.innerFilter;
        boolean boolean11 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean12 = nestedInnerQueryParseSupport1.getfilterFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(query10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test01542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01542");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper6;
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = nestedInnerQueryParseSupport1.parseContext;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter9;
        org.apache.lucene.search.Query query11 = null;
        nestedInnerQueryParseSupport1.innerQuery = query11;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter13);
        org.apache.lucene.search.Query query15 = null;
        nestedInnerQueryParseSupport1.innerFilter = query15;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(queryParseContext8);
    }

    @Test
    public void test01543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01543");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference5);
        boolean boolean7 = nestedInnerQueryParseSupport1.getfilterFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound;
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.innerQuery;
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(query9);
    }

    @Test
    public void test01544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01544");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = nestedInnerQueryParseSupport1.getparentFilter();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport1.getInnerQuery();
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
        org.junit.Assert.assertNull(bitDocIdSetFilter14);
    }

    @Test
    public void test01545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01545");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        nestedInnerQueryParseSupport1.setfilterFound(false);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter7);
        org.elasticsearch.index.query.QueryParseContext queryParseContext9 = nestedInnerQueryParseSupport1.getparseContext();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.innerFilter;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("object");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(queryParseContext9);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(query11);
    }

    @Test
    public void test01546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01546");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean14 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.Class<?> wildcardClass15 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test01547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01547");
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
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        boolean boolean14 = nestedInnerQueryParseSupport1.filterParsed;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("object");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(query8);
        org.junit.Assert.assertNull(filter11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test01548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01548");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.index.query.QueryParseContext queryParseContext4 = nestedInnerQueryParseSupport1.parseContext;
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport1.innerFilter;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
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
    public void test01549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01549");
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
        org.elasticsearch.common.bytes.BytesReference bytesReference15 = nestedInnerQueryParseSupport1.getsource();
        nestedInnerQueryParseSupport1.filterFound = true;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(filter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(bytesReference15);
    }

    @Test
    public void test01550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01550");
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
        boolean boolean15 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.elasticsearch.index.query.QueryParseContext queryParseContext16 = nestedInnerQueryParseSupport1.parseContext;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = queryParseContext16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(filter8);
        org.junit.Assert.assertNull(bytesReference9);
        org.junit.Assert.assertNull(queryParseContext10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(queryParseContext16);
    }

    @Test
    public void test01551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01551");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested0 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.NO;
        boolean boolean1 = nested0.isNested();
        boolean boolean2 = nested0.isNested();
        boolean boolean3 = nested0.isIncludeInParent();
        boolean boolean4 = nested0.isIncludeInRoot();
        boolean boolean5 = nested0.isIncludeInParent();
        boolean boolean6 = nested0.isNested();
        boolean boolean7 = nested0.isNested();
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
    public void test01552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01552");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = nestedInnerQueryParseSupport1.parentFilter;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
    }

    @Test
    public void test01553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01553");
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
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = null;
        nestedInnerQueryParseSupport1.source = bytesReference13;
        boolean boolean15 = nestedInnerQueryParseSupport1.queryFound;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query16 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test01554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01554");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.path;
        nestedInnerQueryParseSupport1.queryFound = false;
        org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport1.innerFilter;
        nestedInnerQueryParseSupport1.path = "";
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper9;
        nestedInnerQueryParseSupport1.filterParsed = true;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(query6);
    }

    @Test
    public void test01555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01555");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper17 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.query.QueryParseContext queryParseContext18 = nestedInnerQueryParseSupport1.parseContext;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query19 = nestedInnerQueryParseSupport1.getInnerFilter();
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
        org.junit.Assert.assertNull(objectMapper17);
        org.junit.Assert.assertNull(queryParseContext18);
    }

    @Test
    public void test01556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01556");
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
        nestedInnerQueryParseSupport1.queryParsed = false;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper18 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper18;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test01557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01557");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport1.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean8 = nestedInnerQueryParseSupport1.getqueryParsed();
        boolean boolean9 = nestedInnerQueryParseSupport1.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext10 = nestedInnerQueryParseSupport1.parseContext;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(query5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(queryParseContext10);
    }

    @Test
    public void test01558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01558");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        java.lang.String str8 = nestedInnerQueryParseSupport1.getPath();
        nestedInnerQueryParseSupport1.queryParsed = false;
        boolean boolean11 = nestedInnerQueryParseSupport1.filterFound;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test01559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01559");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport1.getparentFilter();
        nestedInnerQueryParseSupport1.setfilterFound(false);
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
    }

    @Test
    public void test01560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01560");
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
        org.elasticsearch.index.query.QueryParseContext queryParseContext14 = nestedInnerQueryParseSupport1.getparseContext();
        org.elasticsearch.common.bytes.BytesReference bytesReference15 = nestedInnerQueryParseSupport1.source;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "object" + "'", str13, "object");
        org.junit.Assert.assertNull(queryParseContext14);
        org.junit.Assert.assertNull(bytesReference15);
    }

    @Test
    public void test01561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01561");
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
        org.elasticsearch.index.query.QueryParseContext queryParseContext17 = nestedInnerQueryParseSupport1.parseContext;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(filter10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(query14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(queryParseContext16);
        org.junit.Assert.assertNull(queryParseContext17);
    }

    @Test
    public void test01562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01562");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.path;
        nestedInnerQueryParseSupport1.queryFound = false;
        org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport1.innerFilter;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.getqueryFound();
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.innerFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport1.getparentFilter();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter11;
        boolean boolean13 = nestedInnerQueryParseSupport1.filterFound();
        nestedInnerQueryParseSupport1.queryFound = true;
        org.apache.lucene.search.Query query16 = null;
        nestedInnerQueryParseSupport1.innerFilter = query16;
        org.elasticsearch.index.query.QueryParseContext queryParseContext18 = nestedInnerQueryParseSupport1.parseContext;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper19 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper19;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(query6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(query9);
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(queryParseContext18);
    }

    @Test
    public void test01563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01563");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.path = "nested";
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        org.apache.lucene.search.Filter filter12 = nestedInnerQueryParseSupport1.getchildFilter();
        nestedInnerQueryParseSupport1.queryParsed = false;
        boolean boolean15 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(filter12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test01564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01564");
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
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test01565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01565");
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
        org.apache.lucene.search.Query query19 = nestedInnerQueryParseSupport1.innerFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter20 = nestedInnerQueryParseSupport1.parentFilter;
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
        org.junit.Assert.assertNull(query19);
        org.junit.Assert.assertNull(bitDocIdSetFilter20);
    }

    @Test
    public void test01566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01566");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        java.lang.String str3 = nestedInnerQueryParseSupport1.path;
        nestedInnerQueryParseSupport1.queryFound = false;
        nestedInnerQueryParseSupport1.filterFound = false;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference9);
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test01567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01567");
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
        org.elasticsearch.common.bytes.BytesReference bytesReference19 = nestedInnerQueryParseSupport1.source;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper20 = nestedInnerQueryParseSupport1.parentObjectMapper;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = objectMapper20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        org.junit.Assert.assertNull(bytesReference19);
        org.junit.Assert.assertNull(objectMapper20);
    }

    @Test
    public void test01568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01568");
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
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
    }

    @Test
    public void test01569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01569");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.index.query.QueryParseContext queryParseContext4 = nestedInnerQueryParseSupport1.getparseContext();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        boolean boolean11 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(queryParseContext4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test01570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01570");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference8);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper10;
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = nestedInnerQueryParseSupport1.source;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(bytesReference12);
    }

    @Test
    public void test01571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01571");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter2);
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerQuery;
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryParsed;
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = nestedInnerQueryParseSupport1.source;
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
        org.junit.Assert.assertNull(bytesReference8);
    }

    @Test
    public void test01572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01572");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.filterParsed = true;
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport1.getInnerFilter();
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        boolean boolean8 = nestedInnerQueryParseSupport1.filterParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = nestedInnerQueryParseSupport1.getparentFilter();
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(query5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter9);
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test01573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01573");
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
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test01574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01574");
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
        boolean boolean15 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean16 = nestedInnerQueryParseSupport1.getfilterFound();
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
        org.junit.Assert.assertNull(query11);
        org.junit.Assert.assertNull(queryParseContext14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test01575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01575");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        nestedInnerQueryParseSupport1.path = "hi!";
        boolean boolean17 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper18 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(objectMapper14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(objectMapper18);
    }

    @Test
    public void test01576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01576");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound;
        java.lang.String str5 = nestedInnerQueryParseSupport1.path;
        boolean boolean6 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.apache.lucene.search.Filter filter7 = nestedInnerQueryParseSupport1.childFilter;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport1.innerFilter;
        boolean boolean11 = nestedInnerQueryParseSupport1.filterFound;
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(filter7);
        org.junit.Assert.assertNull(query10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test01577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01577");
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
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test01578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01578");
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
        boolean boolean14 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.index.query.QueryParseContext queryParseContext15 = nestedInnerQueryParseSupport1.parseContext;
        org.apache.lucene.search.Query query16 = null;
        nestedInnerQueryParseSupport1.innerFilter = query16;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bytesReference13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(queryParseContext15);
    }

    @Test
    public void test01579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01579");
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
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference13);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter15 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter15);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(filter10);
    }

    @Test
    public void test01580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01580");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport1.innerFilter = query4;
        nestedInnerQueryParseSupport1.path = "";
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound();
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test01581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01581");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.apache.lucene.search.Filter filter5 = nestedInnerQueryParseSupport1.getchildFilter();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper6;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        org.elasticsearch.index.query.QueryParseContext queryParseContext10 = nestedInnerQueryParseSupport1.getparseContext();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper11;
        boolean boolean13 = nestedInnerQueryParseSupport1.getqueryFound();
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(filter5);
        org.junit.Assert.assertNull(queryParseContext10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test01582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01582");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(query9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objectMapper15);
    }

    @Test
    public void test01583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01583");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        nestedInnerQueryParseSupport1.setfilterFound(false);
        org.apache.lucene.search.Filter filter7 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter7);
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
    }

    @Test
    public void test01584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01584");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.path = "nested";
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.parentObjectMapper;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter12;
        org.elasticsearch.common.bytes.BytesReference bytesReference14 = null;
        nestedInnerQueryParseSupport1.source = bytesReference14;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper16 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(objectMapper16);
    }

    @Test
    public void test01585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01585");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = nestedInnerQueryParseSupport1.getparentFilter();
        nestedInnerQueryParseSupport1.filterParsed = true;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(bitDocIdSetFilter9);
    }

    @Test
    public void test01586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01586");
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
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference11);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test01587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01587");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryParsed;
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        boolean boolean6 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference7 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference7);
        nestedInnerQueryParseSupport1.path = "hi!";
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper12;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test01588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01588");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryParsed;
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        boolean boolean6 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference7 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference7);
        java.lang.String str9 = nestedInnerQueryParseSupport1.getPath();
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport1.innerFilter = query10;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
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
    public void test01589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01589");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Filter filter8 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter8);
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Filter filter13 = null;
        nestedInnerQueryParseSupport1.childFilter = filter13;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test01590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01590");
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
        boolean boolean14 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport1.innerQuery;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query16 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(query15);
    }

    @Test
    public void test01591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01591");
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
        nestedInnerQueryParseSupport1.filterFound = false;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter15 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter15);
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper14);
    }

    @Test
    public void test01592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01592");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.index.query.QueryParseContext queryParseContext4 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport1.innerFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = nestedInnerQueryParseSupport1.getsource();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(queryParseContext4);
        org.junit.Assert.assertNull(query5);
        org.junit.Assert.assertNull(bytesReference6);
    }

    @Test
    public void test01593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01593");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport1.getsource();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryParsed;
        nestedInnerQueryParseSupport1.setqueryParsed(false);
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
        org.junit.Assert.assertNull(bytesReference5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test01594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01594");
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
        nestedInnerQueryParseSupport1.filterParsed = true;
        boolean boolean14 = nestedInnerQueryParseSupport1.filterFound;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test01595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01595");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper10;
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
    }

    @Test
    public void test01596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01596");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport1.innerFilter = query4;
        nestedInnerQueryParseSupport1.path = "";
        nestedInnerQueryParseSupport1.queryParsed = true;
        boolean boolean10 = nestedInnerQueryParseSupport1.getqueryParsed();
        nestedInnerQueryParseSupport1.path = "nested";
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper13;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test01597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01597");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper15;
        org.elasticsearch.index.query.QueryParseContext queryParseContext17 = nestedInnerQueryParseSupport1.parseContext;
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
        org.junit.Assert.assertNull(filter10);
        org.junit.Assert.assertNull(query11);
        org.junit.Assert.assertNull(bytesReference12);
        org.junit.Assert.assertNull(queryParseContext17);
    }

    @Test
    public void test01598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01598");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.filterParsed = true;
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport1.parentFilter;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
    }

    @Test
    public void test01599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01599");
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
        org.apache.lucene.search.Query query18 = null;
        nestedInnerQueryParseSupport1.innerFilter = query18;
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
        org.junit.Assert.assertNull(query13);
    }

    @Test
    public void test01600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01600");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean16 = nestedInnerQueryParseSupport1.queryParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper17 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(objectMapper15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(objectMapper17);
    }

    @Test
    public void test01601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01601");
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
        boolean boolean13 = nestedInnerQueryParseSupport1.filterParsed;
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper16 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(objectMapper16);
    }

    @Test
    public void test01602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01602");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.queryParsed = true;
        org.apache.lucene.search.Filter filter4 = nestedInnerQueryParseSupport1.childFilter;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport1.getparentFilter();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.junit.Assert.assertNull(filter4);
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test01603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01603");
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
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.Filter filter15 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter15);
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(filter10);
        org.junit.Assert.assertNull(query11);
        org.junit.Assert.assertNull(bytesReference12);
    }

    @Test
    public void test01604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01604");
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
        boolean boolean14 = nestedInnerQueryParseSupport1.filterFound;
        java.lang.String str15 = nestedInnerQueryParseSupport1.path;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertNull(filter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test01605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01605");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query17 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter14);
    }

    @Test
    public void test01606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01606");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        java.lang.String str3 = nestedInnerQueryParseSupport1.path;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.apache.lucene.search.Query query6 = null;
        nestedInnerQueryParseSupport1.innerFilter = query6;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test01607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01607");
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
        boolean boolean13 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        nestedInnerQueryParseSupport1.setfilterFound(false);
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(query9);
        org.junit.Assert.assertNull(bitDocIdSetFilter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(objectMapper14);
    }

    @Test
    public void test01608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01608");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query18 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bytesReference13);
        org.junit.Assert.assertNull(filter14);
        org.junit.Assert.assertNull(query15);
    }

    @Test
    public void test01609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01609");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper9;
        boolean boolean11 = nestedInnerQueryParseSupport1.filterFound;
        nestedInnerQueryParseSupport1.setfilterFound(true);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test01610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01610");
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
        boolean boolean16 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.apache.lucene.search.Filter filter17 = nestedInnerQueryParseSupport1.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper18 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper19 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bytesReference13);
        org.junit.Assert.assertNull(filter14);
        org.junit.Assert.assertNull(query15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(filter17);
        org.junit.Assert.assertNull(objectMapper18);
        org.junit.Assert.assertNull(objectMapper19);
    }

    @Test
    public void test01611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01611");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter5);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport1.getparentFilter();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = nestedInnerQueryParseSupport1.getparentFilter();
        nestedInnerQueryParseSupport1.setfilterFound(false);
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
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
        org.junit.Assert.assertNull(bitDocIdSetFilter8);
    }

    @Test
    public void test01612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01612");
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
        nestedInnerQueryParseSupport1.setfilterFound(true);
        org.elasticsearch.index.query.QueryParseContext queryParseContext21 = nestedInnerQueryParseSupport1.parseContext;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(queryParseContext12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(bytesReference18);
        org.junit.Assert.assertNull(queryParseContext21);
    }

    @Test
    public void test01613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01613");
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
        org.apache.lucene.search.Filter filter10 = nestedInnerQueryParseSupport1.getchildFilter();
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
        org.junit.Assert.assertNull(filter10);
    }

    @Test
    public void test01614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01614");
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
        org.apache.lucene.search.Filter filter13 = null;
        nestedInnerQueryParseSupport1.childFilter = filter13;
        boolean boolean15 = nestedInnerQueryParseSupport1.getfilterFound();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test01615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01615");
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
        nestedInnerQueryParseSupport1.innerQuery = query14;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter16 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean17 = nestedInnerQueryParseSupport1.getfilterFound();
        boolean boolean18 = nestedInnerQueryParseSupport1.filterFound();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(bitDocIdSetFilter16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test01616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01616");
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
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("nested");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(filter6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(queryParseContext8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test01617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01617");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter4);
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test01618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01618");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.path = "nested";
        nestedInnerQueryParseSupport1.setqueryFound(false);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test01619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01619");
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
        java.lang.String str13 = nestedInnerQueryParseSupport1.path;
        org.elasticsearch.common.bytes.BytesReference bytesReference14 = nestedInnerQueryParseSupport1.getsource();
        org.elasticsearch.common.bytes.BytesReference bytesReference15 = nestedInnerQueryParseSupport1.getsource();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(bytesReference14);
        org.junit.Assert.assertNull(bytesReference15);
    }

    @Test
    public void test01620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01620");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport1.getparentFilter();
        org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport1.innerQuery;
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference9);
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.innerQuery;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
        org.junit.Assert.assertNull(query6);
        org.junit.Assert.assertNull(query11);
    }

    @Test
    public void test01621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01621");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        java.lang.String str3 = nestedInnerQueryParseSupport1.path;
        nestedInnerQueryParseSupport1.queryFound = false;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test01622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01622");
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
        org.apache.lucene.search.Query query12 = null;
        nestedInnerQueryParseSupport1.innerQuery = query12;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper14;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(query10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test01623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01623");
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
        org.apache.lucene.search.Filter filter13 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter13);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter15 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter15);
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test01624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01624");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport1.innerFilter = query5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test01625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01625");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper16 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper17 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean18 = nestedInnerQueryParseSupport1.getqueryParsed();
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
        org.junit.Assert.assertNull(bitDocIdSetFilter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(query15);
        org.junit.Assert.assertNull(objectMapper16);
        org.junit.Assert.assertNull(objectMapper17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test01626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01626");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.index.query.QueryParseContext queryParseContext4 = nestedInnerQueryParseSupport1.parseContext;
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport1.innerFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter6;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(queryParseContext4);
        org.junit.Assert.assertNull(query5);
    }

    @Test
    public void test01627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01627");
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
        java.lang.String str14 = nestedInnerQueryParseSupport1.path;
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
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test01628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01628");
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
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
    }

    @Test
    public void test01629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01629");
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
        boolean boolean16 = nestedInnerQueryParseSupport1.filterParsed;
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
        org.junit.Assert.assertNull(queryParseContext11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test01630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01630");
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
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = null;
        nestedInnerQueryParseSupport1.source = bytesReference13;
        org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport1.innerFilter;
        boolean boolean16 = nestedInnerQueryParseSupport1.filterFound;
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(queryParseContext9);
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        org.junit.Assert.assertNull(query15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test01631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01631");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = nestedInnerQueryParseSupport1.getparentFilter();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "object" + "'", str10, "object");
        org.junit.Assert.assertNull(queryParseContext11);
        org.junit.Assert.assertNull(bitDocIdSetFilter12);
    }

    @Test
    public void test01632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01632");
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
        org.junit.Assert.assertNull(bitDocIdSetFilter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test01633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01633");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper17 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        org.junit.Assert.assertNull(query13);
        org.junit.Assert.assertNull(queryParseContext14);
        org.junit.Assert.assertNull(objectMapper17);
    }

    @Test
    public void test01634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01634");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter2);
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerFilter;
        nestedInnerQueryParseSupport1.queryFound = false;
        org.junit.Assert.assertNull(query4);
    }

    @Test
    public void test01635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01635");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.filterParsed = true;
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport1.innerQuery;
        boolean boolean6 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.apache.lucene.search.Filter filter7 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter7);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(query5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test01636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01636");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = nestedInnerQueryParseSupport1.getsource();
        nestedInnerQueryParseSupport1.filterFound = true;
        org.elasticsearch.index.query.QueryParseContext queryParseContext7 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(bytesReference4);
        org.junit.Assert.assertNull(queryParseContext7);
    }

    @Test
    public void test01637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01637");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.index.query.QueryParseContext queryParseContext4 = nestedInnerQueryParseSupport1.getparseContext();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(queryParseContext4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test01638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01638");
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
        nestedInnerQueryParseSupport1.filterFound = false;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
    }

    @Test
    public void test01639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01639");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper17 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper17;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter16);
    }

    @Test
    public void test01640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01640");
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
        org.apache.lucene.search.Filter filter12 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter12);
        org.apache.lucene.search.Filter filter14 = null;
        nestedInnerQueryParseSupport1.childFilter = filter14;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test01641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01641");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter10;
        org.apache.lucene.search.Filter filter12 = null;
        nestedInnerQueryParseSupport1.childFilter = filter12;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper14;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
    }

    @Test
    public void test01642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01642");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = nestedInnerQueryParseSupport1.getsource();
        org.apache.lucene.search.Filter filter5 = nestedInnerQueryParseSupport1.getchildFilter();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("object");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(bytesReference4);
        org.junit.Assert.assertNull(filter5);
    }

    @Test
    public void test01643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01643");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = null;
        nestedInnerQueryParseSupport1.source = bytesReference8;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport1.innerFilter = query10;
        boolean boolean12 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.Class<?> wildcardClass13 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01644");
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
        boolean boolean18 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean19 = nestedInnerQueryParseSupport1.queryFound();
        org.apache.lucene.search.Filter filter20 = null;
        nestedInnerQueryParseSupport1.childFilter = filter20;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bytesReference13);
        org.junit.Assert.assertNull(objectMapper16);
        org.junit.Assert.assertNull(queryParseContext17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test01645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01645");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter2);
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerQuery;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test01646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01646");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper19 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query20 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        org.junit.Assert.assertNull(query13);
        org.junit.Assert.assertNull(queryParseContext14);
        org.junit.Assert.assertNull(objectMapper19);
    }

    @Test
    public void test01647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01647");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.apache.lucene.search.Filter filter5 = nestedInnerQueryParseSupport1.getchildFilter();
        boolean boolean6 = nestedInnerQueryParseSupport1.getfilterFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = null;
        nestedInnerQueryParseSupport1.source = bytesReference9;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str12 = nestedInnerQueryParseSupport1.getPath();
        nestedInnerQueryParseSupport1.path = "object";
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper15;
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(filter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test01648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01648");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.queryParsed = true;
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerQuery;
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        nestedInnerQueryParseSupport1.setfilterFound(true);
        java.lang.String str8 = nestedInnerQueryParseSupport1.path;
        java.lang.String str9 = nestedInnerQueryParseSupport1.getPath();
        org.apache.lucene.search.Filter filter10 = nestedInnerQueryParseSupport1.getchildFilter();
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = null;
        nestedInnerQueryParseSupport1.source = bytesReference11;
        boolean boolean13 = nestedInnerQueryParseSupport1.filterFound();
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(filter10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test01649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01649");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.parseContext;
        org.elasticsearch.index.query.QueryParseContext queryParseContext3 = nestedInnerQueryParseSupport1.getparseContext();
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(queryParseContext3);
    }

    @Test
    public void test01650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01650");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter14);
        boolean boolean16 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean17 = nestedInnerQueryParseSupport1.queryFound();
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertNull(bitDocIdSetFilter9);
        org.junit.Assert.assertNull(query12);
        org.junit.Assert.assertNull(filter13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test01651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01651");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter4);
        nestedInnerQueryParseSupport1.path = "";
        org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.innerQuery;
        java.lang.String str9 = nestedInnerQueryParseSupport1.path;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(query8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test01652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01652");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        nestedInnerQueryParseSupport1.setfilterFound(false);
        boolean boolean7 = nestedInnerQueryParseSupport1.getfilterFound();
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter10;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test01653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01653");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.path;
        nestedInnerQueryParseSupport1.queryFound = false;
        org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport1.innerFilter;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.query.QueryParseContext queryParseContext9 = nestedInnerQueryParseSupport1.getparseContext();
        java.lang.String str10 = nestedInnerQueryParseSupport1.path;
        nestedInnerQueryParseSupport1.path = "hi!";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(query6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(queryParseContext9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test01654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01654");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper5;
        boolean boolean7 = nestedInnerQueryParseSupport1.getfilterFound();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test01655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01655");
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
        org.apache.lucene.search.Filter filter10 = null;
        nestedInnerQueryParseSupport1.childFilter = filter10;
        boolean boolean12 = nestedInnerQueryParseSupport1.queryFound();
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test01656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01656");
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
        boolean boolean15 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query16 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(query11);
        org.junit.Assert.assertNull(queryParseContext14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test01657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01657");
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
        boolean boolean13 = nestedInnerQueryParseSupport1.getfilterFound();
        org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport1.innerQuery;
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(query14);
    }

    @Test
    public void test01658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01658");
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
        nestedInnerQueryParseSupport1.filterFound = true;
        boolean boolean13 = nestedInnerQueryParseSupport1.getqueryFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test01659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01659");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.apache.lucene.search.Filter filter5 = nestedInnerQueryParseSupport1.getchildFilter();
        boolean boolean6 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean7 = nestedInnerQueryParseSupport1.getqueryFound();
        java.lang.String str8 = nestedInnerQueryParseSupport1.path;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(filter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test01660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01660");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        nestedInnerQueryParseSupport1.path = "";
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("object");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
    }

    @Test
    public void test01661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01661");
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
        org.elasticsearch.common.bytes.BytesReference bytesReference14 = null;
        nestedInnerQueryParseSupport1.source = bytesReference14;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper16 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper19 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper19;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertNull(objectMapper16);
    }

    @Test
    public void test01662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01662");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper14;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query16 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test01663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01663");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        org.elasticsearch.index.query.QueryParseContext queryParseContext3 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = nestedInnerQueryParseSupport1.source;
        nestedInnerQueryParseSupport1.filterFound = false;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertNull(queryParseContext3);
        org.junit.Assert.assertNull(bytesReference6);
    }

    @Test
    public void test01664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01664");
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
        boolean boolean14 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.apache.lucene.search.Filter filter15 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter15);
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
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(query10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test01665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01665");
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
        boolean boolean13 = nestedInnerQueryParseSupport1.filterParsed;
        org.apache.lucene.search.Filter filter14 = nestedInnerQueryParseSupport1.getchildFilter();
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        org.junit.Assert.assertNull(queryParseContext11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(filter14);
    }

    @Test
    public void test01666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01666");
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
        nestedInnerQueryParseSupport1.filterFound = false;
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test01667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01667");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter2);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.parentObjectMapper;
        nestedInnerQueryParseSupport1.setfilterFound(false);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("nested");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectMapper4);
    }

    @Test
    public void test01668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01668");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.filterParsed = true;
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.apache.lucene.search.Filter filter7 = nestedInnerQueryParseSupport1.getchildFilter();
        org.apache.lucene.search.Filter filter8 = nestedInnerQueryParseSupport1.getchildFilter();
        boolean boolean9 = nestedInnerQueryParseSupport1.filterParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        boolean boolean11 = nestedInnerQueryParseSupport1.getqueryFound();
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(filter7);
        org.junit.Assert.assertNull(filter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test01669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01669");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper16 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper16;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(objectMapper14);
        org.junit.Assert.assertNull(bytesReference15);
    }

    @Test
    public void test01670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01670");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(filter7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test01671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01671");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.apache.lucene.search.Filter filter5 = nestedInnerQueryParseSupport1.getchildFilter();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper6;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(filter5);
    }

    @Test
    public void test01672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01672");
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
        boolean boolean14 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.elasticsearch.common.bytes.BytesReference bytesReference15 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference15);
        org.apache.lucene.search.Query query17 = nestedInnerQueryParseSupport1.innerFilter;
        nestedInnerQueryParseSupport1.path = "object";
        org.elasticsearch.common.bytes.BytesReference bytesReference20 = nestedInnerQueryParseSupport1.source;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter21 = nestedInnerQueryParseSupport1.parentFilter;
        nestedInnerQueryParseSupport1.setfilterFound(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(query17);
        org.junit.Assert.assertNull(bytesReference20);
        org.junit.Assert.assertNull(bitDocIdSetFilter21);
    }

    @Test
    public void test01673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01673");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterFound();
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.innerFilter;
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean12 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.Filter filter13 = null;
        nestedInnerQueryParseSupport1.childFilter = filter13;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(query9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test01674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01674");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.index.query.QueryParseContext queryParseContext4 = nestedInnerQueryParseSupport1.parseContext;
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport1.innerFilter;
        org.apache.lucene.search.Filter filter6 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter6);
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(queryParseContext4);
        org.junit.Assert.assertNull(query5);
    }

    @Test
    public void test01675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01675");
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
        boolean boolean14 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        org.junit.Assert.assertNull(query13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test01676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01676");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.filterParsed = true;
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport1.getInnerFilter();
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        boolean boolean8 = nestedInnerQueryParseSupport1.filterParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = nestedInnerQueryParseSupport1.getparentFilter();
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = nestedInnerQueryParseSupport1.getparentFilter();
        org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport1.innerFilter;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(query5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter9);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertNull(bitDocIdSetFilter13);
        org.junit.Assert.assertNull(query14);
    }

    @Test
    public void test01677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01677");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter10;
        org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport1.innerFilter;
        boolean boolean13 = nestedInnerQueryParseSupport1.queryFound();
        org.apache.lucene.search.Filter filter14 = nestedInnerQueryParseSupport1.getchildFilter();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(query12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(filter14);
    }

    @Test
    public void test01678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01678");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport1.innerFilter = query4;
        nestedInnerQueryParseSupport1.path = "";
        nestedInnerQueryParseSupport1.queryParsed = true;
        boolean boolean10 = nestedInnerQueryParseSupport1.getqueryParsed();
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test01679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01679");
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
        org.apache.lucene.search.Filter filter11 = null;
        nestedInnerQueryParseSupport1.childFilter = filter11;
        org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport1.innerQuery;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("nested");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(query13);
    }

    @Test
    public void test01680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01680");
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
        boolean boolean16 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.elasticsearch.common.bytes.BytesReference bytesReference17 = nestedInnerQueryParseSupport1.getsource();
        org.apache.lucene.search.Query query18 = null;
        nestedInnerQueryParseSupport1.innerQuery = query18;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bytesReference13);
        org.junit.Assert.assertNull(filter14);
        org.junit.Assert.assertNull(query15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(bytesReference17);
    }

    @Test
    public void test01681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01681");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference6);
        org.apache.lucene.search.Filter filter8 = nestedInnerQueryParseSupport1.childFilter;
        nestedInnerQueryParseSupport1.queryFound = false;
        boolean boolean11 = nestedInnerQueryParseSupport1.getqueryParsed();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(filter8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test01682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01682");
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
            nestedInnerQueryParseSupport1.resetPathLevel();
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
    public void test01683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01683");
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
        boolean boolean13 = nestedInnerQueryParseSupport1.filterParsed;
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        java.lang.String str16 = nestedInnerQueryParseSupport1.getPath();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        org.apache.lucene.search.Query query19 = null;
        nestedInnerQueryParseSupport1.innerQuery = query19;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query21 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test01684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01684");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setfilterFound(true);
    }

    @Test
    public void test01685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01685");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter2);
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerQuery;
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport1.parentFilter;
        org.apache.lucene.search.Filter filter7 = null;
        nestedInnerQueryParseSupport1.childFilter = filter7;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
    }

    @Test
    public void test01686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01686");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = nestedInnerQueryParseSupport1.getparentFilter();
        boolean boolean14 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertNull(bitDocIdSetFilter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test01687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01687");
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
        org.apache.lucene.search.Query query15 = null;
        nestedInnerQueryParseSupport1.innerQuery = query15;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(query14);
    }

    @Test
    public void test01688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01688");
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
        org.apache.lucene.search.Query query17 = null;
        nestedInnerQueryParseSupport1.innerQuery = query17;
        boolean boolean19 = nestedInnerQueryParseSupport1.getfilterFound();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(filter12);
        org.junit.Assert.assertNull(bytesReference13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test01689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01689");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport1.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.parentObjectMapper;
        boolean boolean5 = nestedInnerQueryParseSupport1.getfilterFound();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertNull(query3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test01690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01690");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter19 = nestedInnerQueryParseSupport1.parentFilter;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bytesReference13);
        org.junit.Assert.assertNull(objectMapper16);
        org.junit.Assert.assertNull(queryParseContext17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(bitDocIdSetFilter19);
    }

    @Test
    public void test01691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01691");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport1.innerFilter = query4;
        nestedInnerQueryParseSupport1.path = "";
        nestedInnerQueryParseSupport1.queryParsed = true;
        boolean boolean10 = nestedInnerQueryParseSupport1.getqueryParsed();
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference13);
        nestedInnerQueryParseSupport1.path = "nested";
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test01692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01692");
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
        nestedInnerQueryParseSupport1.setqueryFound(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport1.getInnerQuery();
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
    public void test01693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01693");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper12;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.elasticsearch.index.query.QueryParseContext queryParseContext15 = nestedInnerQueryParseSupport1.getparseContext();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(objectMapper14);
        org.junit.Assert.assertNull(queryParseContext15);
    }

    @Test
    public void test01694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01694");
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
        boolean boolean11 = nestedInnerQueryParseSupport1.filterFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter12;
        boolean boolean14 = nestedInnerQueryParseSupport1.filterFound;
        org.apache.lucene.search.Query query15 = null;
        nestedInnerQueryParseSupport1.innerFilter = query15;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test01695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01695");
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
        boolean boolean13 = nestedInnerQueryParseSupport1.filterParsed;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(query10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(queryParseContext12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test01696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01696");
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
        org.apache.lucene.search.Filter filter15 = nestedInnerQueryParseSupport1.getchildFilter();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        org.junit.Assert.assertNull(query13);
        org.junit.Assert.assertNull(queryParseContext14);
        org.junit.Assert.assertNull(filter15);
    }

    @Test
    public void test01697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01697");
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
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Filter filter15 = nestedInnerQueryParseSupport1.getchildFilter();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query16 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(query9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(filter15);
    }

    @Test
    public void test01698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01698");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterParsed;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.apache.lucene.search.Filter filter6 = nestedInnerQueryParseSupport1.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper7;
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        nestedInnerQueryParseSupport1.queryParsed = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        nestedInnerQueryParseSupport1.path = "nested";
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(filter6);
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test01699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01699");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper18 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(filter12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(objectMapper18);
    }

    @Test
    public void test01700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01700");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.queryParsed = true;
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.apache.lucene.search.Filter filter6 = nestedInnerQueryParseSupport1.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(filter6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test01701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01701");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        org.apache.lucene.search.Filter filter3 = nestedInnerQueryParseSupport1.getchildFilter();
        org.elasticsearch.index.query.QueryParseContext queryParseContext4 = nestedInnerQueryParseSupport1.parseContext;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertNull(filter3);
        org.junit.Assert.assertNull(queryParseContext4);
    }

    @Test
    public void test01702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01702");
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
        boolean boolean11 = nestedInnerQueryParseSupport1.getfilterFound();
        org.apache.lucene.search.Query query12 = null;
        nestedInnerQueryParseSupport1.innerQuery = query12;
        boolean boolean14 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference15 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test01703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01703");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.path = "nested";
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test01704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01704");
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
        boolean boolean11 = nestedInnerQueryParseSupport1.getfilterFound();
        java.lang.Class<?> wildcardClass12 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01705");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        java.lang.String str3 = nestedInnerQueryParseSupport1.path;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        boolean boolean6 = nestedInnerQueryParseSupport1.getfilterFound();
        nestedInnerQueryParseSupport1.path = "nested";
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = nestedInnerQueryParseSupport1.getparentFilter();
        java.lang.Class<?> wildcardClass10 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01706");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter13;
        org.apache.lucene.search.Query query15 = null;
        nestedInnerQueryParseSupport1.innerFilter = query15;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test01707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01707");
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
        boolean boolean16 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.elasticsearch.common.bytes.BytesReference bytesReference17 = nestedInnerQueryParseSupport1.getsource();
        boolean boolean18 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.index.query.QueryParseContext queryParseContext19 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.path = "nested";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bytesReference13);
        org.junit.Assert.assertNull(filter14);
        org.junit.Assert.assertNull(query15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(bytesReference17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(queryParseContext19);
    }

    @Test
    public void test01708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01708");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterParsed;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.apache.lucene.search.Filter filter6 = nestedInnerQueryParseSupport1.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper7;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = nestedInnerQueryParseSupport1.source;
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(filter6);
        org.junit.Assert.assertNull(bytesReference9);
    }

    @Test
    public void test01709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01709");
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
        nestedInnerQueryParseSupport1.queryParsed = true;
        boolean boolean16 = nestedInnerQueryParseSupport1.filterParsed;
        org.elasticsearch.common.bytes.BytesReference bytesReference17 = nestedInnerQueryParseSupport1.getsource();
        java.lang.Class<?> wildcardClass18 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(bytesReference17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test01710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01710");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean15 = nestedInnerQueryParseSupport1.getqueryParsed();
        java.lang.String str16 = nestedInnerQueryParseSupport1.path;
        org.apache.lucene.search.Query query17 = null;
        nestedInnerQueryParseSupport1.innerFilter = query17;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(filter12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(bitDocIdSetFilter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test01711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01711");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.apache.lucene.search.Filter filter4 = nestedInnerQueryParseSupport1.childFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport1.getsource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = bytesReference5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(filter4);
        org.junit.Assert.assertNull(bytesReference5);
    }

    @Test
    public void test01712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01712");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter2);
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerQuery;
        org.apache.lucene.search.Filter filter5 = null;
        nestedInnerQueryParseSupport1.childFilter = filter5;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter7);
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("object");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(query4);
    }

    @Test
    public void test01713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01713");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        nestedInnerQueryParseSupport1.setqueryFound(false);
        boolean boolean8 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test01714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01714");
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
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean12 = nestedInnerQueryParseSupport1.getfilterFound();
        java.lang.String str13 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper14;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper16 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper16;
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
        org.junit.Assert.assertNull(queryParseContext11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test01715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01715");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query18 = nestedInnerQueryParseSupport1.getInnerQuery();
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
    public void test01716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01716");
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
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        org.apache.lucene.search.Query query19 = nestedInnerQueryParseSupport1.innerFilter;
        org.apache.lucene.search.Query query20 = nestedInnerQueryParseSupport1.innerQuery;
        boolean boolean21 = nestedInnerQueryParseSupport1.filterParsed;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query22 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertNull(query16);
        org.junit.Assert.assertNull(query19);
        org.junit.Assert.assertNull(query20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test01717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01717");
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
        org.elasticsearch.common.bytes.BytesReference bytesReference15 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference15);
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
    }

    @Test
    public void test01718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01718");
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
        org.apache.lucene.search.Query query11 = null;
        nestedInnerQueryParseSupport1.innerFilter = query11;
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = nestedInnerQueryParseSupport1.getsource();
        boolean boolean14 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(bytesReference13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(objectMapper15);
    }

    @Test
    public void test01719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01719");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport1.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.parentObjectMapper;
        boolean boolean5 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport1.innerQuery;
        nestedInnerQueryParseSupport1.setfilterFound(true);
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
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(query7);
    }

    @Test
    public void test01720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01720");
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
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport1.getparseContext();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.apache.lucene.search.Filter filter14 = nestedInnerQueryParseSupport1.getchildFilter();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(filter8);
        org.junit.Assert.assertNull(bytesReference9);
        org.junit.Assert.assertNull(queryParseContext10);
        org.junit.Assert.assertNull(queryParseContext11);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertNull(filter14);
    }

    @Test
    public void test01721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01721");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.path;
        nestedInnerQueryParseSupport1.queryFound = false;
        org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport1.innerFilter;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.getqueryFound();
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.innerFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport1.getparentFilter();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter11;
        boolean boolean13 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport1.getInnerFilter();
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
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test01722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01722");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter4);
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = nestedInnerQueryParseSupport1.source;
        org.apache.lucene.search.Query query7 = null;
        nestedInnerQueryParseSupport1.innerFilter = query7;
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean12 = nestedInnerQueryParseSupport1.getqueryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter13);
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bytesReference6);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test01723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01723");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = nestedInnerQueryParseSupport1.parentFilter;
        org.elasticsearch.index.query.QueryParseContext queryParseContext15 = nestedInnerQueryParseSupport1.getparseContext();
        boolean boolean16 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean17 = nestedInnerQueryParseSupport1.getqueryFound();
        org.apache.lucene.search.Filter filter18 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter18);
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter14);
        org.junit.Assert.assertNull(queryParseContext15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test01724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01724");
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
        org.apache.lucene.search.Query query16 = nestedInnerQueryParseSupport1.getInnerQuery();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(bitDocIdSetFilter13);
        org.junit.Assert.assertNull(query16);
    }

    @Test
    public void test01725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01725");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        nestedInnerQueryParseSupport1.queryParsed = true;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "object" + "'", str10, "object");
        org.junit.Assert.assertNull(queryParseContext11);
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test01726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01726");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper10;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        boolean boolean14 = nestedInnerQueryParseSupport1.filterParsed;
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
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test01727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01727");
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
        org.apache.lucene.search.Query query13 = null;
        nestedInnerQueryParseSupport1.innerQuery = query13;
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test01728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01728");
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
        java.lang.String str14 = nestedInnerQueryParseSupport1.path;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter15 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean16 = nestedInnerQueryParseSupport1.getqueryFound();
        org.apache.lucene.search.Query query17 = nestedInnerQueryParseSupport1.innerQuery;
        org.elasticsearch.common.bytes.BytesReference bytesReference18 = nestedInnerQueryParseSupport1.source;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(query11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(bitDocIdSetFilter15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(query17);
        org.junit.Assert.assertNull(bytesReference18);
    }

    @Test
    public void test01729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01729");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean6 = nestedInnerQueryParseSupport1.getqueryFound();
        nestedInnerQueryParseSupport1.filterFound = true;
        java.lang.String str9 = nestedInnerQueryParseSupport1.path;
        boolean boolean10 = nestedInnerQueryParseSupport1.filterParsed;
        org.apache.lucene.search.Query query11 = null;
        nestedInnerQueryParseSupport1.innerFilter = query11;
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test01730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01730");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.index.query.QueryParseContext queryParseContext4 = nestedInnerQueryParseSupport1.getparseContext();
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport1.getsource();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(queryParseContext4);
        org.junit.Assert.assertNull(bytesReference5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test01731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01731");
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
        nestedInnerQueryParseSupport1.filterFound = false;
        org.apache.lucene.search.Filter filter17 = null;
        nestedInnerQueryParseSupport1.childFilter = filter17;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(query11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test01732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01732");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.getInnerFilter();
        nestedInnerQueryParseSupport1.queryParsed = false;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(query8);
    }

    @Test
    public void test01733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01733");
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
        nestedInnerQueryParseSupport1.filterFound = false;
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
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(filter7);
        org.junit.Assert.assertNull(bitDocIdSetFilter12);
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test01734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01734");
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
        org.apache.lucene.search.Filter filter14 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter14);
        org.elasticsearch.index.query.QueryParseContext queryParseContext16 = nestedInnerQueryParseSupport1.parseContext;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper17 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper17;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter19 = nestedInnerQueryParseSupport1.parentFilter;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bytesReference12);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertNull(queryParseContext16);
        org.junit.Assert.assertNull(bitDocIdSetFilter19);
    }

    @Test
    public void test01735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01735");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound;
        nestedInnerQueryParseSupport1.queryFound = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = nestedInnerQueryParseSupport1.getsource();
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bytesReference6);
    }

    @Test
    public void test01736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01736");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query17 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(query8);
        org.junit.Assert.assertNull(filter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test01737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01737");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound;
        java.lang.String str5 = nestedInnerQueryParseSupport1.path;
        boolean boolean6 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.apache.lucene.search.Filter filter7 = nestedInnerQueryParseSupport1.childFilter;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport1.innerFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = nestedInnerQueryParseSupport1.getparentFilter();
        boolean boolean12 = nestedInnerQueryParseSupport1.filterParsed;
        boolean boolean13 = nestedInnerQueryParseSupport1.getqueryFound();
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
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(filter7);
        org.junit.Assert.assertNull(query10);
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test01738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01738");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport1.innerFilter = query4;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test01739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01739");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter14);
        nestedInnerQueryParseSupport1.filterFound = true;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test01740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01740");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport1.innerFilter = query4;
        nestedInnerQueryParseSupport1.path = "";
        nestedInnerQueryParseSupport1.queryParsed = true;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = nestedInnerQueryParseSupport1.getsource();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.apache.lucene.search.Filter filter15 = null;
        nestedInnerQueryParseSupport1.childFilter = filter15;
        nestedInnerQueryParseSupport1.path = "hi!";
        org.apache.lucene.search.Filter filter19 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(bytesReference10);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test01741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01741");
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
            org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(queryParseContext5);
        org.junit.Assert.assertNull(filter8);
    }

    @Test
    public void test01742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01742");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport1.innerFilter;
        nestedInnerQueryParseSupport1.path = "object";
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter8);
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = nestedInnerQueryParseSupport1.getparentFilter();
        boolean boolean12 = nestedInnerQueryParseSupport1.getqueryFound();
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(query5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test01743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01743");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference3 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference3);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test01744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01744");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper10;
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = nestedInnerQueryParseSupport1.source;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(bytesReference12);
    }

    @Test
    public void test01745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01745");
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
        nestedInnerQueryParseSupport1.path = "hi!";
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper15;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query17 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(queryParseContext9);
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
    }

    @Test
    public void test01746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01746");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter4);
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference6);
        nestedInnerQueryParseSupport1.filterParsed = false;
        nestedInnerQueryParseSupport1.setfilterFound(false);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("object");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test01747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01747");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        nestedInnerQueryParseSupport1.filterParsed = true;
        boolean boolean6 = nestedInnerQueryParseSupport1.getfilterParsed();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test01748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01748");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.filterParsed = true;
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport1.innerFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport1.parentFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper7;
        nestedInnerQueryParseSupport1.queryFound = false;
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.innerFilter;
        boolean boolean12 = nestedInnerQueryParseSupport1.getfilterFound();
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(query5);
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        org.junit.Assert.assertNull(query11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test01749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01749");
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
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test01750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01750");
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
        nestedInnerQueryParseSupport1.setfilterFound(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test01751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01751");
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
        nestedInnerQueryParseSupport1.filterFound = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.parentObjectMapper;
        nestedInnerQueryParseSupport1.path = "nested";
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query16 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test01752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01752");
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
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test01753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01753");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        nestedInnerQueryParseSupport1.setfilterFound(false);
        boolean boolean7 = nestedInnerQueryParseSupport1.getfilterFound();
        nestedInnerQueryParseSupport1.filterFound = true;
        boolean boolean10 = nestedInnerQueryParseSupport1.getqueryParsed();
        nestedInnerQueryParseSupport1.path = "hi!";
        boolean boolean13 = nestedInnerQueryParseSupport1.filterParsed;
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test01754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01754");
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
        boolean boolean14 = nestedInnerQueryParseSupport1.filterParsed;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test01755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01755");
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
        java.lang.String str13 = nestedInnerQueryParseSupport1.path;
        org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport1.innerQuery;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter15 = nestedInnerQueryParseSupport1.getparentFilter();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(query14);
        org.junit.Assert.assertNull(bitDocIdSetFilter15);
    }

    @Test
    public void test01756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01756");
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
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(filter7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(query9);
    }

    @Test
    public void test01757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01757");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.index.query.QueryParseContext queryParseContext4 = nestedInnerQueryParseSupport1.getparseContext();
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport1.getsource();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.getfilterParsed();
        nestedInnerQueryParseSupport1.queryParsed = false;
        boolean boolean10 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.apache.lucene.search.Query query12 = null;
        nestedInnerQueryParseSupport1.innerFilter = query12;
        nestedInnerQueryParseSupport1.queryFound = false;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test01758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01758");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport1.getInnerFilter();
        java.lang.String str16 = nestedInnerQueryParseSupport1.getPath();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertNull(query15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test01759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01759");
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
        org.apache.lucene.search.Query query11 = null;
        nestedInnerQueryParseSupport1.innerFilter = query11;
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = nestedInnerQueryParseSupport1.getsource();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(bytesReference13);
    }

    @Test
    public void test01760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01760");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.queryParsed = true;
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        org.apache.lucene.search.Filter filter7 = nestedInnerQueryParseSupport1.childFilter;
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(filter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test01761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01761");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter2);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.parentObjectMapper;
        boolean boolean5 = nestedInnerQueryParseSupport1.filterParsed;
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test01762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01762");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.path;
        boolean boolean4 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper6;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test01763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01763");
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
        boolean boolean17 = nestedInnerQueryParseSupport1.queryFound;
        org.elasticsearch.index.query.QueryParseContext queryParseContext18 = nestedInnerQueryParseSupport1.parseContext;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        org.junit.Assert.assertNull(query13);
        org.junit.Assert.assertNull(queryParseContext14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(queryParseContext18);
    }

    @Test
    public void test01764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01764");
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
        org.junit.Assert.assertNull(bitDocIdSetFilter16);
    }

    @Test
    public void test01765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01765");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport1.innerFilter = query4;
        org.apache.lucene.search.Query query6 = null;
        nestedInnerQueryParseSupport1.innerFilter = query6;
        nestedInnerQueryParseSupport1.setqueryParsed(false);
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
    public void test01766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01766");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound;
        java.lang.String str5 = nestedInnerQueryParseSupport1.path;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport1.getparentFilter();
        boolean boolean7 = nestedInnerQueryParseSupport1.getfilterParsed();
        nestedInnerQueryParseSupport1.filterFound = false;
        nestedInnerQueryParseSupport1.filterFound = true;
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
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test01767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01767");
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
        org.apache.lucene.search.Filter filter12 = nestedInnerQueryParseSupport1.getchildFilter();
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport1.innerFilter;
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(filter12);
        org.junit.Assert.assertNull(query15);
    }

    @Test
    public void test01768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01768");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = nestedInnerQueryParseSupport1.getsource();
        org.apache.lucene.search.Filter filter7 = nestedInnerQueryParseSupport1.getchildFilter();
        nestedInnerQueryParseSupport1.filterParsed = true;
        nestedInnerQueryParseSupport1.queryParsed = false;
        java.lang.String str12 = nestedInnerQueryParseSupport1.path;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(bytesReference6);
        org.junit.Assert.assertNull(filter7);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test01769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01769");
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
        boolean boolean18 = nestedInnerQueryParseSupport1.getqueryFound();
        boolean boolean19 = nestedInnerQueryParseSupport1.getqueryFound();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(queryParseContext12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test01770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01770");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        boolean boolean6 = nestedInnerQueryParseSupport1.queryParsed;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference9);
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.innerQuery;
        nestedInnerQueryParseSupport1.setfilterFound(true);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper14;
        boolean boolean16 = nestedInnerQueryParseSupport1.getqueryParsed();
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
        org.junit.Assert.assertNull(query11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test01771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01771");
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
        boolean boolean14 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test01772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01772");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter4);
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = nestedInnerQueryParseSupport1.source;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        nestedInnerQueryParseSupport1.filterFound = false;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bytesReference6);
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test01773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01773");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        nestedInnerQueryParseSupport1.filterFound = false;
        org.apache.lucene.search.Filter filter15 = nestedInnerQueryParseSupport1.childFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter16 = nestedInnerQueryParseSupport1.parentFilter;
        org.apache.lucene.search.Query query17 = nestedInnerQueryParseSupport1.innerFilter;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertNull(filter15);
        org.junit.Assert.assertNull(bitDocIdSetFilter16);
        org.junit.Assert.assertNull(query17);
    }

    @Test
    public void test01774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01774");
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
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test01775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01775");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterFound();
        nestedInnerQueryParseSupport1.filterParsed = true;
        java.lang.String str11 = nestedInnerQueryParseSupport1.getPath();
        org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport1.innerFilter;
        java.lang.String str13 = nestedInnerQueryParseSupport1.getPath();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = nestedInnerQueryParseSupport1.getparentFilter();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(query12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(bitDocIdSetFilter14);
    }

    @Test
    public void test01776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01776");
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
        nestedInnerQueryParseSupport1.queryParsed = true;
        org.elasticsearch.common.bytes.BytesReference bytesReference14 = nestedInnerQueryParseSupport1.getsource();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(bitDocIdSetFilter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(bytesReference14);
    }

    @Test
    public void test01777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01777");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter16 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter16;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(objectMapper15);
    }

    @Test
    public void test01778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01778");
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
        org.apache.lucene.search.Filter filter12 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter12);
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        java.lang.Class<?> wildcardClass16 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01779");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.path;
        org.apache.lucene.search.Filter filter4 = nestedInnerQueryParseSupport1.getchildFilter();
        nestedInnerQueryParseSupport1.path = "";
        nestedInnerQueryParseSupport1.filterParsed = true;
        nestedInnerQueryParseSupport1.path = "object";
        boolean boolean11 = nestedInnerQueryParseSupport1.getfilterFound();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(filter4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test01780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01780");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Filter filter8 = nestedInnerQueryParseSupport1.childFilter;
        org.apache.lucene.search.Query query9 = null;
        nestedInnerQueryParseSupport1.innerQuery = query9;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = nestedInnerQueryParseSupport1.parentFilter;
        nestedInnerQueryParseSupport1.path = "nested";
        org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport1.innerQuery;
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper17 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(filter8);
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
        org.junit.Assert.assertNull(query14);
        org.junit.Assert.assertNull(objectMapper17);
    }

    @Test
    public void test01781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01781");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter15 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter15;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("hi!");
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
    }

    @Test
    public void test01782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01782");
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
        org.apache.lucene.search.Filter filter11 = nestedInnerQueryParseSupport1.childFilter;
        org.apache.lucene.search.Query query12 = null;
        nestedInnerQueryParseSupport1.innerFilter = query12;
        org.apache.lucene.search.Query query14 = null;
        nestedInnerQueryParseSupport1.innerFilter = query14;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(filter11);
    }

    @Test
    public void test01783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01783");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter4);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter6;
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterFound();
        nestedInnerQueryParseSupport1.filterFound = true;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test01784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01784");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        nestedInnerQueryParseSupport1.setfilterFound(false);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter9;
        boolean boolean11 = nestedInnerQueryParseSupport1.filterFound;
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test01785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01785");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport1.innerFilter = query5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test01786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01786");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter13);
        org.apache.lucene.search.Query query15 = null;
        nestedInnerQueryParseSupport1.innerQuery = query15;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(query11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test01787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01787");
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
        org.apache.lucene.search.Filter filter16 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter16);
        org.elasticsearch.common.bytes.BytesReference bytesReference18 = nestedInnerQueryParseSupport1.source;
        boolean boolean19 = nestedInnerQueryParseSupport1.queryParsed;
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(bytesReference18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test01788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01788");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport1.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Filter filter5 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter5);
        nestedInnerQueryParseSupport1.queryFound = true;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = nestedInnerQueryParseSupport1.getsource();
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
        org.junit.Assert.assertNull(bytesReference9);
    }

    @Test
    public void test01789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01789");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        java.lang.String str3 = nestedInnerQueryParseSupport1.path;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        boolean boolean6 = nestedInnerQueryParseSupport1.getfilterFound();
        nestedInnerQueryParseSupport1.setfilterFound(false);
        org.apache.lucene.search.Filter filter9 = null;
        nestedInnerQueryParseSupport1.childFilter = filter9;
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test01790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01790");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.queryParsed = true;
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.apache.lucene.search.Filter filter6 = nestedInnerQueryParseSupport1.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.filterFound = true;
        java.lang.String str11 = nestedInnerQueryParseSupport1.path;
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = null;
        nestedInnerQueryParseSupport1.source = bytesReference12;
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(filter6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(queryParseContext8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test01791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01791");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.index.query.QueryParseContext queryParseContext4 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport1.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.getqueryParsed();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(queryParseContext4);
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test01792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01792");
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
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = nestedInnerQueryParseSupport1.getsource();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(filter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(queryParseContext7);
        org.junit.Assert.assertNull(queryParseContext8);
        org.junit.Assert.assertNull(bytesReference13);
    }

    @Test
    public void test01793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01793");
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
        nestedInnerQueryParseSupport1.setqueryFound(true);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test01794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01794");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper2 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper2;
        org.apache.lucene.search.Filter filter4 = nestedInnerQueryParseSupport1.childFilter;
        org.junit.Assert.assertNull(filter4);
    }

    @Test
    public void test01795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01795");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query18 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test01796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01796");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.filterParsed = true;
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.apache.lucene.search.Query query7 = null;
        nestedInnerQueryParseSupport1.innerFilter = query7;
        org.elasticsearch.index.query.QueryParseContext queryParseContext9 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport1.innerFilter = query10;
        org.apache.lucene.search.Filter filter12 = null;
        nestedInnerQueryParseSupport1.childFilter = filter12;
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(queryParseContext9);
    }

    @Test
    public void test01797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01797");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean15 = nestedInnerQueryParseSupport1.queryParsed;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(objectMapper14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test01798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01798");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.queryParsed = true;
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerQuery;
        boolean boolean5 = nestedInnerQueryParseSupport1.getfilterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterParsed;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport1.getInnerQuery();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(query7);
    }

    @Test
    public void test01799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01799");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport1.innerFilter = query4;
        nestedInnerQueryParseSupport1.path = "";
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = nestedInnerQueryParseSupport1.getsource();
        org.apache.lucene.search.Filter filter10 = null;
        nestedInnerQueryParseSupport1.childFilter = filter10;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper12;
        boolean boolean14 = nestedInnerQueryParseSupport1.queryFound;
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(bytesReference9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test01800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01800");
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
        nestedInnerQueryParseSupport1.path = "object";
        org.apache.lucene.search.Query query17 = null;
        nestedInnerQueryParseSupport1.innerQuery = query17;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test01801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01801");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter2);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Filter filter5 = null;
        nestedInnerQueryParseSupport1.childFilter = filter5;
        org.elasticsearch.common.bytes.BytesReference bytesReference7 = nestedInnerQueryParseSupport1.source;
        boolean boolean8 = nestedInnerQueryParseSupport1.queryParsed;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(bytesReference7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test01802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01802");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter10;
        org.apache.lucene.search.Filter filter12 = null;
        nestedInnerQueryParseSupport1.childFilter = filter12;
        boolean boolean14 = nestedInnerQueryParseSupport1.queryParsed;
        org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport1.innerFilter;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(query15);
    }

    @Test
    public void test01803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01803");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper14;
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter18 = nestedInnerQueryParseSupport1.getparentFilter();
        boolean boolean19 = nestedInnerQueryParseSupport1.getfilterFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query20 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test01804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01804");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.index.query.QueryParseContext queryParseContext4 = nestedInnerQueryParseSupport1.parseContext;
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport1.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.apache.lucene.search.Query query7 = null;
        nestedInnerQueryParseSupport1.innerQuery = query7;
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
        org.junit.Assert.assertNull(queryParseContext4);
        org.junit.Assert.assertNull(query5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test01805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01805");
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
        org.apache.lucene.search.Filter filter13 = null;
        nestedInnerQueryParseSupport1.childFilter = filter13;
        boolean boolean15 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean16 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.apache.lucene.search.Filter filter17 = nestedInnerQueryParseSupport1.childFilter;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(filter17);
    }

    @Test
    public void test01806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01806");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter4;
        org.apache.lucene.search.Query query6 = null;
        nestedInnerQueryParseSupport1.innerQuery = query6;
        java.lang.String str8 = nestedInnerQueryParseSupport1.getPath();
        nestedInnerQueryParseSupport1.setfilterFound(false);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test01807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01807");
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
        org.apache.lucene.search.Filter filter10 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter10);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper12;
        org.elasticsearch.common.bytes.BytesReference bytesReference14 = nestedInnerQueryParseSupport1.source;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bytesReference14);
    }

    @Test
    public void test01808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01808");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.path = "nested";
        nestedInnerQueryParseSupport1.setqueryFound(false);
        nestedInnerQueryParseSupport1.queryFound = false;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test01809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01809");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport1.innerFilter = query5;
        org.apache.lucene.search.Filter filter7 = nestedInnerQueryParseSupport1.getchildFilter();
        boolean boolean8 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(filter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test01810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01810");
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
        boolean boolean15 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.elasticsearch.common.bytes.BytesReference bytesReference16 = nestedInnerQueryParseSupport1.source;
        org.apache.lucene.search.Filter filter17 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter17);
        org.apache.lucene.search.Query query19 = nestedInnerQueryParseSupport1.innerQuery;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(query9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(bytesReference16);
        org.junit.Assert.assertNull(query19);
    }

    @Test
    public void test01811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01811");
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
        boolean boolean12 = nestedInnerQueryParseSupport1.getfilterParsed();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test01812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01812");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter10);
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
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test01813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01813");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested0 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.NO;
        boolean boolean1 = nested0.isIncludeInParent();
        boolean boolean2 = nested0.isIncludeInParent();
        boolean boolean3 = nested0.isIncludeInParent();
        boolean boolean4 = nested0.isNested();
        java.lang.Class<?> wildcardClass5 = nested0.getClass();
        org.junit.Assert.assertNotNull(nested0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test01814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01814");
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
        boolean boolean20 = nestedInnerQueryParseSupport1.filterParsed;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bytesReference13);
        org.junit.Assert.assertNull(filter14);
        org.junit.Assert.assertNull(query15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test01815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01815");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        nestedInnerQueryParseSupport1.queryFound = true;
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test01816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01816");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.apache.lucene.search.Query query6 = null;
        nestedInnerQueryParseSupport1.innerQuery = query6;
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = null;
        nestedInnerQueryParseSupport1.source = bytesReference8;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test01817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01817");
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
        java.lang.String str12 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean13 = nestedInnerQueryParseSupport1.queryParsed;
        java.lang.String str14 = nestedInnerQueryParseSupport1.getPath();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(filter8);
        org.junit.Assert.assertNull(bytesReference9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test01818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01818");
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
    }

    @Test
    public void test01819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01819");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport1.innerFilter;
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.common.bytes.BytesReference bytesReference7 = nestedInnerQueryParseSupport1.source;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        java.lang.String str10 = nestedInnerQueryParseSupport1.path;
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(query5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(bytesReference7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test01820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01820");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        boolean boolean6 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.Filter filter8 = null;
        nestedInnerQueryParseSupport1.childFilter = filter8;
        org.apache.lucene.search.Filter filter10 = nestedInnerQueryParseSupport1.getchildFilter();
        nestedInnerQueryParseSupport1.filterParsed = true;
        nestedInnerQueryParseSupport1.setfilterFound(false);
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
        org.junit.Assert.assertNull(filter10);
    }

    @Test
    public void test01821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01821");
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
        org.apache.lucene.search.Filter filter15 = nestedInnerQueryParseSupport1.childFilter;
        nestedInnerQueryParseSupport1.queryFound = false;
        boolean boolean18 = nestedInnerQueryParseSupport1.getfilterFound();
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bytesReference13);
        org.junit.Assert.assertNull(filter14);
        org.junit.Assert.assertNull(filter15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test01822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01822");
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
        org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport1.innerFilter;
        boolean boolean16 = nestedInnerQueryParseSupport1.filterParsed;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query17 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(query15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test01823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01823");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter5);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport1.getparentFilter();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = nestedInnerQueryParseSupport1.parentFilter;
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
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
        org.junit.Assert.assertNull(bitDocIdSetFilter8);
    }

    @Test
    public void test01824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01824");
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
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean12 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(queryParseContext11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test01825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01825");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.apache.lucene.search.Query query12 = null;
        nestedInnerQueryParseSupport1.innerQuery = query12;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test01826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01826");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport1.innerFilter;
        nestedInnerQueryParseSupport1.path = "object";
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter8);
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound();
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.innerQuery;
        boolean boolean12 = nestedInnerQueryParseSupport1.filterParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = nestedInnerQueryParseSupport1.getparentFilter();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter14);
        boolean boolean16 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.Filter filter17 = null;
        nestedInnerQueryParseSupport1.childFilter = filter17;
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(query5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(query11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test01827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01827");
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
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport1.getparseContext();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean14 = nestedInnerQueryParseSupport1.queryFound;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(filter8);
        org.junit.Assert.assertNull(bytesReference9);
        org.junit.Assert.assertNull(queryParseContext10);
        org.junit.Assert.assertNull(queryParseContext11);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test01828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01828");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter17 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter17;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objectMapper15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test01829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01829");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter2);
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerQuery;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference7 = null;
        nestedInnerQueryParseSupport1.source = bytesReference7;
        org.apache.lucene.search.Filter filter9 = nestedInnerQueryParseSupport1.childFilter;
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertNull(filter9);
    }

    @Test
    public void test01830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01830");
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
        org.apache.lucene.search.Filter filter12 = nestedInnerQueryParseSupport1.getchildFilter();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper13;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(bitDocIdSetFilter9);
        org.junit.Assert.assertNull(queryParseContext10);
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
        org.junit.Assert.assertNull(filter12);
    }

    @Test
    public void test01831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01831");
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
        org.apache.lucene.search.Query query18 = null;
        nestedInnerQueryParseSupport1.innerFilter = query18;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        org.apache.lucene.search.Filter filter22 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter22);
        java.lang.Class<?> wildcardClass24 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(query13);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test01832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01832");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.elasticsearch.index.query.QueryParseContext queryParseContext7 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport1.getInnerQuery();
        org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport1.innerQuery;
        nestedInnerQueryParseSupport1.setfilterFound(false);
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
        org.junit.Assert.assertNull(queryParseContext7);
        org.junit.Assert.assertNull(query12);
        org.junit.Assert.assertNull(query13);
    }

    @Test
    public void test01833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01833");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport1.getparentFilter();
        nestedInnerQueryParseSupport1.setfilterFound(false);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
    }

    @Test
    public void test01834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01834");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter14);
        nestedInnerQueryParseSupport1.queryParsed = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper18 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter19 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "object" + "'", str13, "object");
        org.junit.Assert.assertNull(objectMapper18);
    }

    @Test
    public void test01835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01835");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper5;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport1.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper9;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertNull(query7);
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test01836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01836");
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
        nestedInnerQueryParseSupport1.queryParsed = false;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper18 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper18;
        org.elasticsearch.common.bytes.BytesReference bytesReference20 = null;
        nestedInnerQueryParseSupport1.source = bytesReference20;
        java.lang.Class<?> wildcardClass22 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test01837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01837");
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
        org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport1.innerFilter;
        boolean boolean16 = nestedInnerQueryParseSupport1.filterParsed;
        java.lang.String str17 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper18 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(query15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(objectMapper18);
    }

    @Test
    public void test01838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01838");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport1.innerFilter = query4;
        nestedInnerQueryParseSupport1.filterFound = false;
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        boolean boolean10 = nestedInnerQueryParseSupport1.queryParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test01839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01839");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter2);
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerQuery;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.elasticsearch.index.query.QueryParseContext queryParseContext7 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.Filter filter8 = nestedInnerQueryParseSupport1.getchildFilter();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertNull(queryParseContext7);
        org.junit.Assert.assertNull(filter8);
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test01840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01840");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport1.innerFilter = query4;
        nestedInnerQueryParseSupport1.path = "";
        nestedInnerQueryParseSupport1.queryParsed = true;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = nestedInnerQueryParseSupport1.getsource();
        boolean boolean11 = nestedInnerQueryParseSupport1.getqueryFound();
        java.lang.String str12 = nestedInnerQueryParseSupport1.path;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(bytesReference10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test01841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01841");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        java.lang.String str3 = nestedInnerQueryParseSupport1.path;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        boolean boolean6 = nestedInnerQueryParseSupport1.getfilterFound();
        nestedInnerQueryParseSupport1.setfilterFound(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = null;
        nestedInnerQueryParseSupport1.source = bytesReference9;
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
    public void test01842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01842");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport1.innerFilter;
        nestedInnerQueryParseSupport1.path = "object";
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = nestedInnerQueryParseSupport1.parentFilter;
        org.apache.lucene.search.Filter filter9 = nestedInnerQueryParseSupport1.getchildFilter();
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference10);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = nestedInnerQueryParseSupport1.getparentFilter();
        nestedInnerQueryParseSupport1.path = "hi!";
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(query5);
        org.junit.Assert.assertNull(bitDocIdSetFilter8);
        org.junit.Assert.assertNull(filter9);
        org.junit.Assert.assertNull(bitDocIdSetFilter12);
    }

    @Test
    public void test01843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01843");
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
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test01844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01844");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query18 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(query8);
        org.junit.Assert.assertNull(filter11);
        org.junit.Assert.assertNull(bytesReference16);
        org.junit.Assert.assertNull(filter17);
    }

    @Test
    public void test01845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01845");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper12;
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference16 = nestedInnerQueryParseSupport1.getsource();
        org.elasticsearch.common.bytes.BytesReference bytesReference17 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference17);
        nestedInnerQueryParseSupport1.queryFound = false;
        java.lang.Class<?> wildcardClass21 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(bytesReference16);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test01846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01846");
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
        boolean boolean13 = nestedInnerQueryParseSupport1.filterParsed;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test01847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01847");
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
        boolean boolean14 = nestedInnerQueryParseSupport1.filterFound;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(query11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test01848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01848");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        org.elasticsearch.index.query.QueryParseContext queryParseContext3 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.filterParsed = false;
        java.lang.Class<?> wildcardClass6 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertNull(queryParseContext3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test01849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01849");
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
        boolean boolean15 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper16 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(bytesReference13);
        org.junit.Assert.assertNull(filter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(objectMapper16);
    }

    @Test
    public void test01850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01850");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference6);
        org.apache.lucene.search.Filter filter8 = nestedInnerQueryParseSupport1.childFilter;
        nestedInnerQueryParseSupport1.queryFound = false;
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound();
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(filter8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test01851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01851");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter4);
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference6);
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = nestedInnerQueryParseSupport1.getsource();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter9;
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = nestedInnerQueryParseSupport1.getsource();
        boolean boolean12 = nestedInnerQueryParseSupport1.getfilterFound();
        java.lang.String str13 = nestedInnerQueryParseSupport1.path;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bytesReference8);
        org.junit.Assert.assertNull(bytesReference11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test01852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01852");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport1.innerFilter;
        nestedInnerQueryParseSupport1.path = "object";
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = nestedInnerQueryParseSupport1.parentFilter;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = bitDocIdSetFilter8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(query5);
        org.junit.Assert.assertNull(bitDocIdSetFilter8);
    }

    @Test
    public void test01853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01853");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter16 = nestedInnerQueryParseSupport1.getparentFilter();
        org.apache.lucene.search.Query query17 = null;
        nestedInnerQueryParseSupport1.innerQuery = query17;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query19 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter16);
    }

    @Test
    public void test01854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01854");
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
        boolean boolean18 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(bytesReference15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(query17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test01855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01855");
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
        boolean boolean10 = nestedInnerQueryParseSupport1.queryParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter11);
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(bytesReference5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(bytesReference7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test01856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01856");
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
        nestedInnerQueryParseSupport1.queryFound = true;
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference13);
        boolean boolean15 = nestedInnerQueryParseSupport1.getqueryFound();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test01857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01857");
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
        org.elasticsearch.index.query.QueryParseContext queryParseContext15 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
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
        org.junit.Assert.assertNull(queryParseContext15);
    }

    @Test
    public void test01858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01858");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        java.lang.String str3 = nestedInnerQueryParseSupport1.path;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport1.source = bytesReference6;
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = nestedInnerQueryParseSupport1.getparseContext();
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(queryParseContext8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test01859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01859");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.index.query.QueryParseContext queryParseContext4 = nestedInnerQueryParseSupport1.getparseContext();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound();
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(queryParseContext4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test01860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01860");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.filterParsed = true;
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound;
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test01861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01861");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.elasticsearch.index.query.QueryParseContext queryParseContext7 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport1.getInnerQuery();
        org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport1.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(queryParseContext7);
        org.junit.Assert.assertNull(query12);
        org.junit.Assert.assertNull(query13);
        org.junit.Assert.assertNull(objectMapper14);
    }

    @Test
    public void test01862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01862");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter14);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter16 = nestedInnerQueryParseSupport1.parentFilter;
        org.elasticsearch.index.query.QueryParseContext queryParseContext17 = nestedInnerQueryParseSupport1.getparseContext();
        boolean boolean18 = nestedInnerQueryParseSupport1.filterFound;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        org.junit.Assert.assertNull(query13);
        org.junit.Assert.assertNull(bitDocIdSetFilter16);
        org.junit.Assert.assertNull(queryParseContext17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test01863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01863");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterParsed;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport1.filterParsed;
        org.apache.lucene.search.Filter filter7 = nestedInnerQueryParseSupport1.childFilter;
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(filter7);
    }

    @Test
    public void test01864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01864");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport1.parentFilter;
        org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport1.innerQuery;
        org.elasticsearch.common.bytes.BytesReference bytesReference7 = nestedInnerQueryParseSupport1.source;
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterFound();
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
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
        org.junit.Assert.assertNull(query6);
        org.junit.Assert.assertNull(bytesReference7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test01865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01865");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport1.getsource();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryParsed;
        org.elasticsearch.common.bytes.BytesReference bytesReference7 = nestedInnerQueryParseSupport1.getsource();
        nestedInnerQueryParseSupport1.setfilterFound(false);
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport1.innerQuery = query10;
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(bytesReference5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(bytesReference7);
    }

    @Test
    public void test01866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01866");
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
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test01867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01867");
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
        org.apache.lucene.search.Filter filter12 = null;
        nestedInnerQueryParseSupport1.childFilter = filter12;
        org.elasticsearch.common.bytes.BytesReference bytesReference14 = nestedInnerQueryParseSupport1.getsource();
        boolean boolean15 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter16 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter16);
        org.apache.lucene.search.Query query18 = null;
        nestedInnerQueryParseSupport1.innerQuery = query18;
        nestedInnerQueryParseSupport1.path = "nested";
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper22 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(query8);
        org.junit.Assert.assertNull(filter11);
        org.junit.Assert.assertNull(bytesReference14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(objectMapper22);
    }

    @Test
    public void test01868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01868");
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
        boolean boolean14 = nestedInnerQueryParseSupport1.getqueryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter15 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter15);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(bitDocIdSetFilter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test01869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01869");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter4);
        nestedInnerQueryParseSupport1.path = "";
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference8);
        nestedInnerQueryParseSupport1.setfilterFound(false);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test01870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01870");
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
        org.elasticsearch.common.bytes.BytesReference bytesReference24 = nestedInnerQueryParseSupport1.source;
        boolean boolean25 = nestedInnerQueryParseSupport1.queryFound();
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(filter7);
        org.junit.Assert.assertNull(filter10);
        org.junit.Assert.assertNull(bitDocIdSetFilter13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(bytesReference24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test01871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01871");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference5);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter7);
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference9);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter11);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(query4);
    }

    @Test
    public void test01872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01872");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport1.innerFilter = query4;
        nestedInnerQueryParseSupport1.path = "";
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference8);
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
    public void test01873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01873");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper2 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper2;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter4;
        nestedInnerQueryParseSupport1.filterParsed = true;
        org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.getInnerFilter();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(query8);
    }

    @Test
    public void test01874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01874");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean5 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = nestedInnerQueryParseSupport1.source;
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(bytesReference6);
    }

    @Test
    public void test01875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01875");
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
        boolean boolean12 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.apache.lucene.search.Query query13 = null;
        nestedInnerQueryParseSupport1.innerFilter = query13;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = nestedInnerQueryParseSupport1.parentObjectMapper;
        boolean boolean16 = nestedInnerQueryParseSupport1.filterParsed;
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(filter8);
        org.junit.Assert.assertNull(bytesReference9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(objectMapper15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test01876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01876");
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
        org.junit.Assert.assertNull(objectMapper15);
    }

    @Test
    public void test01877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01877");
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
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport1.parseContext;
        org.apache.lucene.search.Filter filter12 = nestedInnerQueryParseSupport1.childFilter;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(queryParseContext11);
        org.junit.Assert.assertNull(filter12);
    }

    @Test
    public void test01878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01878");
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
        boolean boolean12 = nestedInnerQueryParseSupport1.filterFound;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test01879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01879");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.filterParsed = true;
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.apache.lucene.search.Filter filter7 = nestedInnerQueryParseSupport1.getchildFilter();
        org.apache.lucene.search.Filter filter8 = nestedInnerQueryParseSupport1.getchildFilter();
        boolean boolean9 = nestedInnerQueryParseSupport1.filterParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = objectMapper10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(filter7);
        org.junit.Assert.assertNull(filter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test01880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01880");
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
        org.apache.lucene.search.Query query18 = null;
        nestedInnerQueryParseSupport1.innerFilter = query18;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        boolean boolean22 = nestedInnerQueryParseSupport1.filterParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper23 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper23;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(query13);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test01881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01881");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport1.innerFilter = query4;
        nestedInnerQueryParseSupport1.path = "";
        nestedInnerQueryParseSupport1.queryParsed = true;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = nestedInnerQueryParseSupport1.getsource();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        nestedInnerQueryParseSupport1.queryFound = false;
        boolean boolean14 = nestedInnerQueryParseSupport1.getfilterFound();
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.apache.lucene.search.Filter filter17 = nestedInnerQueryParseSupport1.getchildFilter();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(bytesReference10);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(filter17);
    }

    @Test
    public void test01882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01882");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter2);
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerQuery;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference5);
        nestedInnerQueryParseSupport1.filterFound = false;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.index.query.QueryParseContext queryParseContext10 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setfilterFound(false);
        boolean boolean13 = nestedInnerQueryParseSupport1.queryParsed;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(queryParseContext10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test01883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01883");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport1.innerFilter = query4;
        nestedInnerQueryParseSupport1.filterFound = false;
        boolean boolean8 = nestedInnerQueryParseSupport1.filterParsed;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference9);
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.innerQuery;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(query11);
    }

    @Test
    public void test01884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01884");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterFound();
        nestedInnerQueryParseSupport1.filterParsed = true;
        java.lang.String str11 = nestedInnerQueryParseSupport1.getPath();
        org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport1.innerFilter;
        java.lang.String str13 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper14;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter16 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter16;
        org.elasticsearch.common.bytes.BytesReference bytesReference18 = nestedInnerQueryParseSupport1.source;
        boolean boolean19 = nestedInnerQueryParseSupport1.getqueryFound();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(query12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(bytesReference18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test01885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01885");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport1.innerQuery = query5;
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound;
        nestedInnerQueryParseSupport1.filterFound = false;
        java.lang.Class<?> wildcardClass10 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01886");
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
        java.lang.Class<?> wildcardClass24 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(objectMapper18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test01887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01887");
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
        org.apache.lucene.search.Query query17 = null;
        nestedInnerQueryParseSupport1.innerQuery = query17;
        org.apache.lucene.search.Filter filter19 = nestedInnerQueryParseSupport1.childFilter;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(filter19);
    }

    @Test
    public void test01888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01888");
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
        org.apache.lucene.search.Filter filter14 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter14);
        nestedInnerQueryParseSupport1.filterFound = false;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(filter12);
        org.junit.Assert.assertNull(bytesReference13);
    }

    @Test
    public void test01889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01889");
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
        boolean boolean12 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.apache.lucene.search.Query query13 = null;
        nestedInnerQueryParseSupport1.innerFilter = query13;
        org.apache.lucene.search.Filter filter15 = nestedInnerQueryParseSupport1.getchildFilter();
        nestedInnerQueryParseSupport1.filterFound = true;
        boolean boolean18 = nestedInnerQueryParseSupport1.queryFound;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(filter8);
        org.junit.Assert.assertNull(bytesReference9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(filter15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test01890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01890");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean15 = nestedInnerQueryParseSupport1.getqueryParsed();
        java.lang.String str16 = nestedInnerQueryParseSupport1.path;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(filter12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(bitDocIdSetFilter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test01891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01891");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        nestedInnerQueryParseSupport1.path = "nested";
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = null;
        nestedInnerQueryParseSupport1.source = bytesReference11;
        boolean boolean13 = nestedInnerQueryParseSupport1.getqueryFound();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test01892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01892");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str9 = nestedInnerQueryParseSupport1.path;
        boolean boolean10 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test01893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01893");
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
        boolean boolean12 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean13 = nestedInnerQueryParseSupport1.getqueryFound();
        java.lang.Class<?> wildcardClass14 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01894");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.queryParsed = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = nestedInnerQueryParseSupport1.getsource();
        boolean boolean9 = nestedInnerQueryParseSupport1.filterParsed;
        nestedInnerQueryParseSupport1.filterFound = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = nestedInnerQueryParseSupport1.getsource();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(bytesReference8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(bytesReference12);
    }

    @Test
    public void test01895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01895");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.queryParsed = true;
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerQuery;
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        nestedInnerQueryParseSupport1.setfilterFound(true);
        nestedInnerQueryParseSupport1.path = "object";
        org.apache.lucene.search.Filter filter10 = nestedInnerQueryParseSupport1.getchildFilter();
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport1.parseContext;
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = nestedInnerQueryParseSupport1.getsource();
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(filter10);
        org.junit.Assert.assertNull(queryParseContext11);
        org.junit.Assert.assertNull(bytesReference12);
    }

    @Test
    public void test01896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01896");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        nestedInnerQueryParseSupport1.filterFound = true;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport1.getsource();
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        boolean boolean7 = nestedInnerQueryParseSupport1.getqueryParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(bytesReference5);
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test01897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01897");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter14);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter16 = nestedInnerQueryParseSupport1.parentFilter;
        nestedInnerQueryParseSupport1.queryParsed = true;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        org.junit.Assert.assertNull(query13);
        org.junit.Assert.assertNull(bitDocIdSetFilter16);
    }

    @Test
    public void test01898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01898");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.path = "nested";
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.parentObjectMapper;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test01899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01899");
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
        boolean boolean13 = nestedInnerQueryParseSupport1.queryParsed;
        nestedInnerQueryParseSupport1.queryParsed = true;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test01900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01900");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.apache.lucene.search.Filter filter13 = null;
        nestedInnerQueryParseSupport1.childFilter = filter13;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("nested");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test01901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01901");
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
        org.apache.lucene.search.Filter filter11 = nestedInnerQueryParseSupport1.childFilter;
        org.apache.lucene.search.Query query12 = null;
        nestedInnerQueryParseSupport1.innerFilter = query12;
        java.lang.Class<?> wildcardClass14 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(filter11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01902");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport1.source = bytesReference5;
        org.elasticsearch.common.bytes.BytesReference bytesReference7 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference7);
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper4);
    }

    @Test
    public void test01903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01903");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        nestedInnerQueryParseSupport1.filterFound = false;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("object");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test01904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01904");
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
        nestedInnerQueryParseSupport1.queryParsed = false;
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
    public void test01905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01905");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport1.innerFilter = query4;
        nestedInnerQueryParseSupport1.path = "";
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test01906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01906");
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
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test01907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01907");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        java.lang.String str10 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test01908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01908");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter14);
        org.elasticsearch.common.bytes.BytesReference bytesReference16 = nestedInnerQueryParseSupport1.getsource();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query17 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(filter10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(bytesReference16);
    }

    @Test
    public void test01909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01909");
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
        java.lang.String str14 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean15 = nestedInnerQueryParseSupport1.filterParsed;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "nested" + "'", str14, "nested");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test01910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01910");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean15 = nestedInnerQueryParseSupport1.getqueryParsed();
        java.lang.String str16 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.common.bytes.BytesReference bytesReference17 = nestedInnerQueryParseSupport1.getsource();
        org.apache.lucene.search.Filter filter18 = nestedInnerQueryParseSupport1.childFilter;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(filter12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(bitDocIdSetFilter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(bytesReference17);
        org.junit.Assert.assertNull(filter18);
    }

    @Test
    public void test01911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01911");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference15 = nestedInnerQueryParseSupport1.source;
        boolean boolean16 = nestedInnerQueryParseSupport1.filterFound;
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(objectMapper14);
        org.junit.Assert.assertNull(bytesReference15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test01912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01912");
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
        java.lang.String str14 = nestedInnerQueryParseSupport1.getPath();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter15 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter15;
        nestedInnerQueryParseSupport1.path = "nested";
        org.elasticsearch.index.query.QueryParseContext queryParseContext19 = nestedInnerQueryParseSupport1.getparseContext();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "nested" + "'", str14, "nested");
        org.junit.Assert.assertNull(queryParseContext19);
    }

    @Test
    public void test01913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01913");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound;
        java.lang.String str9 = nestedInnerQueryParseSupport1.path;
        boolean boolean10 = nestedInnerQueryParseSupport1.getqueryParsed();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test01914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01914");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        boolean boolean6 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound;
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(filter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test01915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01915");
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
        java.lang.String str19 = nestedInnerQueryParseSupport1.path;
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
    }

    @Test
    public void test01916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01916");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter20 = nestedInnerQueryParseSupport1.getparentFilter();
        java.lang.String str21 = nestedInnerQueryParseSupport1.path;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter15);
        org.junit.Assert.assertNull(bitDocIdSetFilter20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test01917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01917");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.parentObjectMapper;
        nestedInnerQueryParseSupport1.queryParsed = true;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
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
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test01918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01918");
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
        boolean boolean14 = nestedInnerQueryParseSupport1.queryFound();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(query13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test01919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01919");
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
        org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport1.innerFilter;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(bytesReference8);
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
        org.junit.Assert.assertNull(query14);
    }

    @Test
    public void test01920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01920");
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
        nestedInnerQueryParseSupport1.setfilterFound(true);
        org.apache.lucene.search.Query query14 = null;
        nestedInnerQueryParseSupport1.innerFilter = query14;
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
        org.junit.Assert.assertNull(query6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test01921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01921");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        java.lang.String str3 = nestedInnerQueryParseSupport1.path;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference6);
        org.apache.lucene.search.Filter filter8 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter8);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Query query12 = null;
        nestedInnerQueryParseSupport1.innerFilter = query12;
        java.lang.String str14 = nestedInnerQueryParseSupport1.path;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test01922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01922");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport1.innerFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport1.getparentFilter();
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(query5);
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
    }

    @Test
    public void test01923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01923");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport1.innerFilter;
        nestedInnerQueryParseSupport1.path = "object";
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = nestedInnerQueryParseSupport1.parentFilter;
        nestedInnerQueryParseSupport1.setfilterFound(false);
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(query5);
        org.junit.Assert.assertNull(bitDocIdSetFilter8);
    }

    @Test
    public void test01924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01924");
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
        boolean boolean11 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(filter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test01925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01925");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean5 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Filter filter8 = nestedInnerQueryParseSupport1.childFilter;
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(filter8);
    }

    @Test
    public void test01926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01926");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.path;
        nestedInnerQueryParseSupport1.queryFound = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = nestedInnerQueryParseSupport1.getsource();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport1.parentFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(bytesReference6);
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test01927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01927");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.filterParsed = true;
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport1.getInnerFilter();
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        boolean boolean8 = nestedInnerQueryParseSupport1.filterParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = nestedInnerQueryParseSupport1.getparentFilter();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        nestedInnerQueryParseSupport1.setfilterFound(false);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(query5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter9);
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test01928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01928");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        nestedInnerQueryParseSupport1.setfilterFound(false);
        boolean boolean7 = nestedInnerQueryParseSupport1.getfilterFound();
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerQuery = query8;
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean12 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test01929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01929");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter2);
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerQuery;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference5);
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerQuery = query8;
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test01930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01930");
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
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = null;
        nestedInnerQueryParseSupport1.source = bytesReference13;
        org.apache.lucene.search.Filter filter15 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter15);
        org.elasticsearch.common.bytes.BytesReference bytesReference17 = nestedInnerQueryParseSupport1.getsource();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertNull(bytesReference17);
    }

    @Test
    public void test01931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01931");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport1.innerFilter = query5;
        org.elasticsearch.index.query.QueryParseContext queryParseContext7 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.filterFound = true;
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(queryParseContext7);
    }

    @Test
    public void test01932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01932");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = nestedInnerQueryParseSupport1.getparentFilter();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(filter10);
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
    }

    @Test
    public void test01933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01933");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter2);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Filter filter5 = null;
        nestedInnerQueryParseSupport1.childFilter = filter5;
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = nestedInnerQueryParseSupport1.parentFilter;
        nestedInnerQueryParseSupport1.setfilterFound(false);
        boolean boolean11 = nestedInnerQueryParseSupport1.filterFound();
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport1.innerQuery;
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(query14);
    }

    @Test
    public void test01934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01934");
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
        org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport1.innerQuery;
        boolean boolean13 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.elasticsearch.index.query.QueryParseContext queryParseContext14 = nestedInnerQueryParseSupport1.parseContext;
        java.lang.String str15 = nestedInnerQueryParseSupport1.path;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(query12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(queryParseContext14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test01935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01935");
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
        boolean boolean15 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.apache.lucene.search.Query query16 = nestedInnerQueryParseSupport1.innerQuery;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(query14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(query16);
    }

    @Test
    public void test01936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01936");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test01937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01937");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Filter filter8 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter8);
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.parentObjectMapper;
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
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test01938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01938");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.filterParsed = true;
        java.lang.String str5 = nestedInnerQueryParseSupport1.path;
        nestedInnerQueryParseSupport1.queryParsed = true;
        org.apache.lucene.search.Filter filter8 = nestedInnerQueryParseSupport1.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper9;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(filter8);
    }

    @Test
    public void test01939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01939");
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
        org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport1.innerQuery;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = nestedInnerQueryParseSupport1.getparentFilter();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper14;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(query12);
        org.junit.Assert.assertNull(bitDocIdSetFilter13);
    }

    @Test
    public void test01940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01940");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = nestedInnerQueryParseSupport1.getsource();
        org.apache.lucene.search.Filter filter5 = nestedInnerQueryParseSupport1.getchildFilter();
        nestedInnerQueryParseSupport1.queryFound = true;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(bytesReference4);
        org.junit.Assert.assertNull(filter5);
    }

    @Test
    public void test01941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01941");
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
        org.elasticsearch.index.query.QueryParseContext queryParseContext12 = nestedInnerQueryParseSupport1.parseContext;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper13;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter15 = nestedInnerQueryParseSupport1.parentFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper16 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(queryParseContext12);
        org.junit.Assert.assertNull(bitDocIdSetFilter15);
        org.junit.Assert.assertNull(objectMapper16);
    }

    @Test
    public void test01942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01942");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.apache.lucene.search.Filter filter5 = nestedInnerQueryParseSupport1.getchildFilter();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper6;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport1.innerFilter = query8;
        org.elasticsearch.index.query.QueryParseContext queryParseContext10 = nestedInnerQueryParseSupport1.getparseContext();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper11;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper13;
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(filter5);
        org.junit.Assert.assertNull(queryParseContext10);
    }

    @Test
    public void test01943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01943");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport1.getparentFilter();
        nestedInnerQueryParseSupport1.filterFound = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper9;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport1.getInnerQuery();
        org.elasticsearch.common.bytes.BytesReference bytesReference14 = nestedInnerQueryParseSupport1.getsource();
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(query13);
        org.junit.Assert.assertNull(bytesReference14);
    }

    @Test
    public void test01944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01944");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport1.getparentFilter();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = nestedInnerQueryParseSupport1.parentFilter;
        org.elasticsearch.index.query.QueryParseContext queryParseContext12 = nestedInnerQueryParseSupport1.parseContext;
        org.apache.lucene.search.Filter filter13 = nestedInnerQueryParseSupport1.childFilter;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bytesReference8);
        org.junit.Assert.assertNull(query9);
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
        org.junit.Assert.assertNull(queryParseContext12);
        org.junit.Assert.assertNull(filter13);
    }

    @Test
    public void test01945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01945");
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
        nestedInnerQueryParseSupport1.path = "";
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter17 = nestedInnerQueryParseSupport1.getparentFilter();
        org.elasticsearch.common.bytes.BytesReference bytesReference18 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference18);
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        org.junit.Assert.assertNull(bitDocIdSetFilter17);
    }

    @Test
    public void test01946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01946");
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
        boolean boolean14 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.elasticsearch.common.bytes.BytesReference bytesReference15 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference15);
        org.apache.lucene.search.Query query17 = nestedInnerQueryParseSupport1.innerFilter;
        nestedInnerQueryParseSupport1.path = "object";
        org.elasticsearch.common.bytes.BytesReference bytesReference20 = nestedInnerQueryParseSupport1.source;
        nestedInnerQueryParseSupport1.setfilterFound(false);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(query17);
        org.junit.Assert.assertNull(bytesReference20);
    }

    @Test
    public void test01947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01947");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter2);
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerQuery;
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport1.parentFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference10);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test01948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01948");
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
        org.elasticsearch.common.bytes.BytesReference bytesReference18 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference18);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter20 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter20;
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(objectMapper16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test01949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01949");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport1.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.parentObjectMapper;
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.Filter filter6 = nestedInnerQueryParseSupport1.getchildFilter();
        boolean boolean7 = nestedInnerQueryParseSupport1.getfilterFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter8;
        org.apache.lucene.search.Filter filter10 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter10);
        boolean boolean12 = nestedInnerQueryParseSupport1.filterParsed;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertNull(query3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(filter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test01950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01950");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Filter filter8 = nestedInnerQueryParseSupport1.childFilter;
        org.apache.lucene.search.Query query9 = null;
        nestedInnerQueryParseSupport1.innerQuery = query9;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(filter8);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test01951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01951");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query16 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(filter12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test01952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01952");
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
        nestedInnerQueryParseSupport1.filterParsed = true;
        nestedInnerQueryParseSupport1.path = "hi!";
        org.apache.lucene.search.Query query19 = nestedInnerQueryParseSupport1.innerFilter;
        nestedInnerQueryParseSupport1.setfilterFound(false);
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(query9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(query19);
    }

    @Test
    public void test01953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01953");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        org.elasticsearch.index.query.QueryParseContext queryParseContext3 = nestedInnerQueryParseSupport1.parseContext;
        org.elasticsearch.index.query.QueryParseContext queryParseContext4 = nestedInnerQueryParseSupport1.getparseContext();
        boolean boolean5 = nestedInnerQueryParseSupport1.queryParsed;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = nestedInnerQueryParseSupport1.getsource();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertNull(queryParseContext3);
        org.junit.Assert.assertNull(queryParseContext4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(bytesReference6);
    }

    @Test
    public void test01954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01954");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.parentObjectMapper;
        nestedInnerQueryParseSupport1.queryFound = false;
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
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test01955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01955");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter16 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter16);
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test01956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01956");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport1.getsource();
        boolean boolean6 = nestedInnerQueryParseSupport1.queryParsed;
        org.elasticsearch.common.bytes.BytesReference bytesReference7 = nestedInnerQueryParseSupport1.getsource();
        nestedInnerQueryParseSupport1.setfilterFound(false);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter11;
        boolean boolean13 = nestedInnerQueryParseSupport1.filterParsed;
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(bytesReference5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(bytesReference7);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test01957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01957");
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
        boolean boolean12 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = null;
        nestedInnerQueryParseSupport1.source = bytesReference13;
        boolean boolean15 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper16 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(filter8);
        org.junit.Assert.assertNull(bytesReference9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(objectMapper16);
    }

    @Test
    public void test01958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01958");
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
        boolean boolean11 = nestedInnerQueryParseSupport1.queryParsed;
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(filter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test01959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01959");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter5);
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport1.innerQuery;
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = nestedInnerQueryParseSupport1.getsource();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        boolean boolean10 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.apache.lucene.search.Query query11 = null;
        nestedInnerQueryParseSupport1.innerFilter = query11;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean14 = nestedInnerQueryParseSupport1.filterParsed;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertNull(query7);
        org.junit.Assert.assertNull(bytesReference8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test01960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01960");
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
        org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport1.innerQuery;
        org.apache.lucene.search.Filter filter14 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter14);
        boolean boolean16 = nestedInnerQueryParseSupport1.filterFound();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(filter8);
        org.junit.Assert.assertNull(bytesReference9);
        org.junit.Assert.assertNull(queryParseContext10);
        org.junit.Assert.assertNull(query13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test01961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01961");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.filterParsed = true;
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport1.innerFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport1.parentFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper7;
        nestedInnerQueryParseSupport1.queryFound = false;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(query5);
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
    }

    @Test
    public void test01962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01962");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        nestedInnerQueryParseSupport1.filterFound = true;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport1.getsource();
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        boolean boolean7 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.apache.lucene.search.Filter filter8 = nestedInnerQueryParseSupport1.getchildFilter();
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.innerQuery;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(bytesReference5);
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(filter8);
        org.junit.Assert.assertNull(query9);
    }

    @Test
    public void test01963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01963");
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
        java.lang.Class<?> wildcardClass13 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(query11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01964");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound;
        java.lang.String str5 = nestedInnerQueryParseSupport1.path;
        org.apache.lucene.search.Filter filter6 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter6);
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.elasticsearch.index.query.QueryParseContext queryParseContext10 = nestedInnerQueryParseSupport1.getparseContext();
        boolean boolean11 = nestedInnerQueryParseSupport1.filterFound;
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(queryParseContext10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test01965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01965");
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
        org.elasticsearch.common.bytes.BytesReference bytesReference15 = nestedInnerQueryParseSupport1.getsource();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query18 = nestedInnerQueryParseSupport1.getInnerQuery();
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
        org.junit.Assert.assertNull(bytesReference15);
    }

    @Test
    public void test01966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01966");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        boolean boolean6 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound;
        org.elasticsearch.index.query.QueryParseContext queryParseContext9 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter10);
        org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport1.innerFilter;
        nestedInnerQueryParseSupport1.filterParsed = false;
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(queryParseContext9);
        org.junit.Assert.assertNull(query12);
    }

    @Test
    public void test01967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01967");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper6;
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = nestedInnerQueryParseSupport1.parseContext;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("object");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(queryParseContext8);
    }

    @Test
    public void test01968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01968");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.filterFound = true;
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter10;
        org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport1.innerFilter;
        nestedInnerQueryParseSupport1.filterParsed = false;
        nestedInnerQueryParseSupport1.queryFound = true;
        boolean boolean17 = nestedInnerQueryParseSupport1.filterParsed;
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(query12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test01969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01969");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport1.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        org.apache.lucene.search.Filter filter8 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(query5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test01970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01970");
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
        boolean boolean18 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper19 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper19;
        boolean boolean21 = nestedInnerQueryParseSupport1.queryParsed;
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test01971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01971");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper13;
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(filter6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(queryParseContext8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test01972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01972");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.index.query.QueryParseContext queryParseContext4 = nestedInnerQueryParseSupport1.getparseContext();
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport1.getsource();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(queryParseContext4);
        org.junit.Assert.assertNull(bytesReference5);
    }

    @Test
    public void test01973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01973");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        java.lang.String str3 = nestedInnerQueryParseSupport1.path;
        nestedInnerQueryParseSupport1.queryFound = false;
        org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport1.innerFilter;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = nestedInnerQueryParseSupport1.source;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(query6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(bytesReference9);
    }

    @Test
    public void test01974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01974");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.apache.lucene.search.Filter filter5 = nestedInnerQueryParseSupport1.getchildFilter();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper6;
        nestedInnerQueryParseSupport1.filterParsed = false;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(filter5);
    }

    @Test
    public void test01975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01975");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.filterParsed = true;
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport1.innerFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport1.parentFilter;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter11);
        boolean boolean13 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(query5);
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test01976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01976");
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
        org.apache.lucene.search.Query query17 = null;
        nestedInnerQueryParseSupport1.innerQuery = query17;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(filter12);
        org.junit.Assert.assertNull(bytesReference13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test01977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01977");
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
        org.elasticsearch.common.bytes.BytesReference bytesReference17 = null;
        nestedInnerQueryParseSupport1.source = bytesReference17;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test01978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01978");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        java.lang.String str3 = nestedInnerQueryParseSupport1.path;
        org.apache.lucene.search.Filter filter4 = nestedInnerQueryParseSupport1.getchildFilter();
        boolean boolean5 = nestedInnerQueryParseSupport1.filterParsed;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(filter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test01979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01979");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested0 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.NO;
        boolean boolean1 = nested0.isIncludeInParent();
        boolean boolean2 = nested0.isIncludeInParent();
        boolean boolean3 = nested0.isIncludeInParent();
        boolean boolean4 = nested0.isIncludeInRoot();
        boolean boolean5 = nested0.isIncludeInRoot();
        boolean boolean6 = nested0.isNested();
        boolean boolean7 = nested0.isNested();
        boolean boolean8 = nested0.isIncludeInParent();
        boolean boolean9 = nested0.isIncludeInRoot();
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
    public void test01980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01980");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter8);
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = null;
        nestedInnerQueryParseSupport1.source = bytesReference10;
        org.apache.lucene.search.Filter filter12 = nestedInnerQueryParseSupport1.childFilter;
        nestedInnerQueryParseSupport1.setfilterFound(true);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(filter12);
    }

    @Test
    public void test01981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01981");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper14;
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter18 = nestedInnerQueryParseSupport1.getparentFilter();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper19 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper19;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter18);
    }

    @Test
    public void test01982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01982");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter2);
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerQuery;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound;
        nestedInnerQueryParseSupport1.queryFound = false;
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test01983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01983");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper6;
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = nestedInnerQueryParseSupport1.parseContext;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter9;
        org.apache.lucene.search.Query query11 = null;
        nestedInnerQueryParseSupport1.innerQuery = query11;
        org.elasticsearch.index.query.QueryParseContext queryParseContext13 = nestedInnerQueryParseSupport1.getparseContext();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(queryParseContext8);
        org.junit.Assert.assertNull(queryParseContext13);
    }

    @Test
    public void test01984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01984");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport1.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.parentObjectMapper;
        boolean boolean5 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport1.innerFilter;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter10);
        boolean boolean12 = nestedInnerQueryParseSupport1.filterParsed;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertNull(query3);
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(query7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test01985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01985");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        boolean boolean6 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound;
        org.elasticsearch.index.query.QueryParseContext queryParseContext9 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter12);
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(queryParseContext9);
    }

    @Test
    public void test01986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01986");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper2 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        org.junit.Assert.assertNull(objectMapper2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test01987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01987");
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
        org.apache.lucene.search.Query query17 = nestedInnerQueryParseSupport1.innerFilter;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(query17);
    }

    @Test
    public void test01988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01988");
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
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = nestedInnerQueryParseSupport1.getsource();
        boolean boolean14 = nestedInnerQueryParseSupport1.filterFound;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertNull(bytesReference13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test01989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01989");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport1.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(query5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test01990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01990");
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
        nestedInnerQueryParseSupport1.filterParsed = false;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query17 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test01991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01991");
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
        boolean boolean14 = nestedInnerQueryParseSupport1.filterFound();
        nestedInnerQueryParseSupport1.filterFound = false;
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(filter10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test01992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01992");
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
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bytesReference12);
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test01993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01993");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean6 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        nestedInnerQueryParseSupport1.setfilterFound(false);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test01994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01994");
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
        org.apache.lucene.search.Query query16 = nestedInnerQueryParseSupport1.getInnerQuery();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(query16);
    }

    @Test
    public void test01995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01995");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = nestedInnerQueryParseSupport1.source;
        boolean boolean3 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference4);
        nestedInnerQueryParseSupport1.filterParsed = false;
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterFound();
        nestedInnerQueryParseSupport1.filterParsed = true;
        java.lang.String str11 = nestedInnerQueryParseSupport1.getPath();
        org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport1.innerFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference13);
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(query12);
    }

    @Test
    public void test01996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01996");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter2);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("nested");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01997");
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
        boolean boolean12 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.apache.lucene.search.Query query13 = null;
        nestedInnerQueryParseSupport1.innerFilter = query13;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(filter8);
        org.junit.Assert.assertNull(bytesReference9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test01998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01998");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        boolean boolean3 = nestedInnerQueryParseSupport1.queryParsed;
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport1.getInnerFilter();
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = nestedInnerQueryParseSupport1.getparseContext();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(query7);
        org.junit.Assert.assertNull(queryParseContext8);
    }

    @Test
    public void test01999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01999");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        nestedInnerQueryParseSupport1.queryParsed = false;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(objectMapper3);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test02000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test02000");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter2);
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport1.getfilterParsed();
        nestedInnerQueryParseSupport1.path = "object";
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }
}
