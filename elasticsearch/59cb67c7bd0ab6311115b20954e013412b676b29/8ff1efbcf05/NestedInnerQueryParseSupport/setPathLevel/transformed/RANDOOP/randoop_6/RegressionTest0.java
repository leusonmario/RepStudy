import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test00001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00001");
        org.elasticsearch.index.mapper.object.ObjectMapper.Dynamic dynamic0 = org.elasticsearch.index.mapper.object.ObjectMapper.Defaults.DYNAMIC;
        org.junit.Assert.assertNull(dynamic0);
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        org.elasticsearch.index.mapper.ContentPath.Type type0 = org.elasticsearch.index.mapper.object.ObjectMapper.Defaults.PATH_TYPE;
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.elasticsearch.index.mapper.ContentPath.Type.FULL + "'", type0.equals(org.elasticsearch.index.mapper.ContentPath.Type.FULL));
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        java.lang.String str0 = org.elasticsearch.index.mapper.object.ObjectMapper.NESTED_CONTENT_TYPE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "nested" + "'", str0, "nested");
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        org.elasticsearch.common.xcontent.XContentParser xContentParser0 = null;
        org.elasticsearch.search.internal.SearchContext searchContext1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport2 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(xContentParser0, searchContext1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        org.elasticsearch.index.mapper.object.ObjectMapper.Defaults defaults0 = new org.elasticsearch.index.mapper.object.ObjectMapper.Defaults();
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        org.elasticsearch.index.mapper.object.ObjectMapper.Dynamic dynamic0 = org.elasticsearch.index.mapper.object.ObjectMapper.Dynamic.TRUE;
        org.junit.Assert.assertTrue("'" + dynamic0 + "' != '" + org.elasticsearch.index.mapper.object.ObjectMapper.Dynamic.TRUE + "'", dynamic0.equals(org.elasticsearch.index.mapper.object.ObjectMapper.Dynamic.TRUE));
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        java.lang.String str0 = org.elasticsearch.index.mapper.object.ObjectMapper.CONTENT_TYPE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "object" + "'", str0, "object");
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        org.elasticsearch.common.xcontent.ToXContent.Params params0 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        org.junit.Assert.assertNotNull(params0);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        org.elasticsearch.index.mapper.object.ObjectMapper.Dynamic dynamic0 = org.elasticsearch.index.mapper.object.ObjectMapper.Dynamic.STRICT;
        org.junit.Assert.assertTrue("'" + dynamic0 + "' != '" + org.elasticsearch.index.mapper.object.ObjectMapper.Dynamic.STRICT + "'", dynamic0.equals(org.elasticsearch.index.mapper.object.ObjectMapper.Dynamic.STRICT));
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        java.lang.Class<?> wildcardClass2 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query2 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        org.elasticsearch.index.mapper.object.ObjectMapper.Dynamic dynamic0 = org.elasticsearch.index.mapper.object.ObjectMapper.Dynamic.FALSE;
        java.lang.Class<?> wildcardClass1 = dynamic0.getClass();
        org.junit.Assert.assertTrue("'" + dynamic0 + "' != '" + org.elasticsearch.index.mapper.object.ObjectMapper.Dynamic.FALSE + "'", dynamic0.equals(org.elasticsearch.index.mapper.object.ObjectMapper.Dynamic.FALSE));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(true, true);
        java.lang.Class<?> wildcardClass3 = nested2.getClass();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        boolean boolean0 = org.elasticsearch.index.mapper.object.ObjectMapper.Defaults.ENABLED;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryParsed;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter9);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = nestedInnerQueryParseSupport1.parentFilter;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        org.elasticsearch.index.mapper.object.ObjectMapper.TypeParser typeParser0 = new org.elasticsearch.index.mapper.object.ObjectMapper.TypeParser();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        org.elasticsearch.index.mapper.Mapper.TypeParser.ParserContext parserContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.mapper.Mapper.Builder builder4 = typeParser0.parse("hi!", strMap2, parserContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter7);
        boolean boolean9 = nestedInnerQueryParseSupport1.getqueryParsed();
        java.lang.Class<?> wildcardClass10 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.elasticsearch.index.query.QueryParseContext queryParseContext9 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.Filter filter10 = nestedInnerQueryParseSupport1.childFilter;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(queryParseContext9);
        org.junit.Assert.assertNull(filter10);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter9);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter9;
        java.lang.Class<?> wildcardClass11 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.innerFilter;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = query9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(query9);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryParsed;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.innerFilter;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(query9);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.innerFilter;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(query9);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterParsed;
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.getqueryFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.getqueryFound();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter5;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport1.getfilterFound();
        nestedInnerQueryParseSupport1.setqueryFound(true);
        java.lang.Class<?> wildcardClass9 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        boolean boolean6 = nestedInnerQueryParseSupport1.getqueryParsed();
        boolean boolean7 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.parentObjectMapper;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = objectMapper9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        boolean boolean6 = nestedInnerQueryParseSupport1.getqueryParsed();
        boolean boolean7 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.parentObjectMapper;
        java.lang.Class<?> wildcardClass10 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter9);
        org.apache.lucene.search.Filter filter11 = nestedInnerQueryParseSupport1.getchildFilter();
        org.apache.lucene.search.Query query12 = null;
        nestedInnerQueryParseSupport1.innerFilter = query12;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(filter11);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = nestedInnerQueryParseSupport1.getsource();
        nestedInnerQueryParseSupport1.path = "";
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport1.innerQuery;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = query15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(bytesReference10);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertNull(objectMapper14);
        org.junit.Assert.assertNull(query15);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        nestedInnerQueryParseSupport1.filterFound = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter6);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.innerFilter;
        nestedInnerQueryParseSupport1.setfilterFound(true);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(query11);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter6;
        org.apache.lucene.search.Filter filter8 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter8);
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.innerFilter;
        nestedInnerQueryParseSupport1.setfilterFound(true);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(query11);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter9);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = nestedInnerQueryParseSupport1.parentFilter;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport1.source = bytesReference5;
        java.lang.Class<?> wildcardClass7 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport1.innerQuery = query4;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport1.source = bytesReference5;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport1.innerFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = nestedInnerQueryParseSupport1.getparentFilter();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(query7);
        org.junit.Assert.assertNull(bitDocIdSetFilter8);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        org.elasticsearch.common.bytes.BytesReference bytesReference7 = null;
        nestedInnerQueryParseSupport1.source = bytesReference7;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter9);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport1.innerFilter = query10;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter9);
        org.apache.lucene.search.Filter filter11 = nestedInnerQueryParseSupport1.getchildFilter();
        org.apache.lucene.search.Query query12 = null;
        nestedInnerQueryParseSupport1.innerFilter = query12;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(filter11);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter9);
        org.apache.lucene.search.Filter filter11 = nestedInnerQueryParseSupport1.getchildFilter();
        org.apache.lucene.search.Query query12 = null;
        nestedInnerQueryParseSupport1.innerFilter = query12;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(filter11);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectMapper4);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter10;
        boolean boolean12 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        boolean boolean4 = nestedInnerQueryParseSupport1.getfilterFound();
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport1.innerQuery = query5;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.innerFilter;
        boolean boolean12 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(query11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Filter filter4 = nestedInnerQueryParseSupport1.childFilter;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.elasticsearch.common.bytes.BytesReference bytesReference7 = null;
        nestedInnerQueryParseSupport1.source = bytesReference7;
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(filter4);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter9);
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = nestedInnerQueryParseSupport1.getsource();
        java.lang.Class<?> wildcardClass12 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(bytesReference11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper6;
        nestedInnerQueryParseSupport1.filterParsed = true;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter11;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.apache.lucene.search.Filter filter14 = nestedInnerQueryParseSupport1.getchildFilter();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertNull(filter14);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.innerFilter;
        boolean boolean12 = nestedInnerQueryParseSupport1.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter13);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(query11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterParsed;
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
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
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter7);
        boolean boolean9 = nestedInnerQueryParseSupport1.getqueryParsed();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Filter filter4 = nestedInnerQueryParseSupport1.childFilter;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.Filter filter7 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter7);
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.index.query.QueryParseContext queryParseContext10 = nestedInnerQueryParseSupport1.parseContext;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(filter4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(queryParseContext10);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper6;
        nestedInnerQueryParseSupport1.filterParsed = true;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter11;
        boolean boolean13 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.query.QueryParseContext queryParseContext14 = nestedInnerQueryParseSupport1.getparseContext();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(queryParseContext14);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper6;
        nestedInnerQueryParseSupport1.filterParsed = true;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter11;
        boolean boolean13 = nestedInnerQueryParseSupport1.getqueryFound();
        boolean boolean14 = nestedInnerQueryParseSupport1.getqueryFound();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Filter filter4 = nestedInnerQueryParseSupport1.childFilter;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(filter4);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.elasticsearch.index.query.QueryParseContext queryParseContext9 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.Filter filter10 = nestedInnerQueryParseSupport1.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper11;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.parentObjectMapper;
        boolean boolean14 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(queryParseContext9);
        org.junit.Assert.assertNull(filter10);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.innerFilter;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(query9);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.elasticsearch.index.query.QueryParseContext queryParseContext9 = nestedInnerQueryParseSupport1.getparseContext();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(queryParseContext9);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterParsed;
        org.apache.lucene.search.Filter filter3 = nestedInnerQueryParseSupport1.childFilter;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(filter3);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.apache.lucene.search.Query query6 = null;
        nestedInnerQueryParseSupport1.innerFilter = query6;
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport1.getfilterFound();
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter9;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = nestedInnerQueryParseSupport1.getparentFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = bitDocIdSetFilter11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        boolean boolean4 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper6;
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        boolean boolean4 = nestedInnerQueryParseSupport1.getfilterFound();
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport1.innerQuery = query5;
        java.lang.Class<?> wildcardClass7 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper6;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.elasticsearch.index.query.QueryParseContext queryParseContext9 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.Filter filter10 = nestedInnerQueryParseSupport1.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper11;
        boolean boolean13 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = nestedInnerQueryParseSupport1.parentFilter;
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(queryParseContext9);
        org.junit.Assert.assertNull(filter10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(bitDocIdSetFilter14);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.elasticsearch.index.mapper.object.ObjectMapper.TypeParser typeParser0 = new org.elasticsearch.index.mapper.object.ObjectMapper.TypeParser();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        org.elasticsearch.index.mapper.Mapper.TypeParser.ParserContext parserContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.mapper.Mapper.Builder builder4 = typeParser0.parse("nested", strMap2, parserContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        boolean boolean5 = nestedInnerQueryParseSupport1.getfilterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.getfilterFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper11;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean10 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean12 = nestedInnerQueryParseSupport1.filterFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter13;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(true, false);
        java.lang.Class<?> wildcardClass3 = nested2.getClass();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter5;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean12 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean13 = nestedInnerQueryParseSupport1.getqueryFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.elasticsearch.index.query.QueryParseContext queryParseContext9 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.Filter filter10 = nestedInnerQueryParseSupport1.childFilter;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(queryParseContext9);
        org.junit.Assert.assertNull(filter10);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = nestedInnerQueryParseSupport1.getsource();
        nestedInnerQueryParseSupport1.path = "nested";
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference4);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.innerFilter;
        nestedInnerQueryParseSupport1.setfilterFound(true);
        org.elasticsearch.index.query.QueryParseContext queryParseContext14 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean15 = nestedInnerQueryParseSupport1.getqueryParsed();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(query11);
        org.junit.Assert.assertNull(queryParseContext14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter6);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean11 = nestedInnerQueryParseSupport1.getfilterParsed();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = null;
        nestedInnerQueryParseSupport1.source = bytesReference9;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        nestedInnerQueryParseSupport1.setqueryFound(true);
        nestedInnerQueryParseSupport1.filterFound = false;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.innerFilter;
        boolean boolean12 = nestedInnerQueryParseSupport1.queryFound();
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("object");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(query11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Filter filter4 = nestedInnerQueryParseSupport1.childFilter;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.Filter filter7 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter7);
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.index.query.QueryParseContext queryParseContext10 = nestedInnerQueryParseSupport1.parseContext;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(filter4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(queryParseContext10);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = nestedInnerQueryParseSupport1.getsource();
        nestedInnerQueryParseSupport1.path = "";
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = nestedInnerQueryParseSupport1.parentFilter;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(bytesReference10);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertNull(bitDocIdSetFilter14);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterParsed;
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter5);
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
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = nestedInnerQueryParseSupport1.getsource();
        nestedInnerQueryParseSupport1.path = "nested";
        nestedInnerQueryParseSupport1.path = "";
        org.apache.lucene.search.Filter filter9 = nestedInnerQueryParseSupport1.childFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport1.parentFilter;
        java.lang.Class<?> wildcardClass11 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(bytesReference4);
        org.junit.Assert.assertNull(filter9);
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Filter filter4 = nestedInnerQueryParseSupport1.childFilter;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.Filter filter7 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter7);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper9;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(filter4);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = nestedInnerQueryParseSupport1.getsource();
        nestedInnerQueryParseSupport1.path = "nested";
        nestedInnerQueryParseSupport1.path = "";
        org.apache.lucene.search.Filter filter9 = nestedInnerQueryParseSupport1.childFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport1.parentFilter;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("nested");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference4);
        org.junit.Assert.assertNull(filter9);
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter9;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = nestedInnerQueryParseSupport1.getsource();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter10);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(bytesReference9);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport1.source = bytesReference5;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport1.innerFilter;
        nestedInnerQueryParseSupport1.filterParsed = false;
        nestedInnerQueryParseSupport1.path = "nested";
        org.apache.lucene.search.Filter filter12 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter12);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(query7);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        boolean boolean6 = nestedInnerQueryParseSupport1.getqueryParsed();
        boolean boolean7 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterParsed;
        org.apache.lucene.search.Filter filter3 = nestedInnerQueryParseSupport1.childFilter;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport1.innerFilter = query4;
        java.lang.Class<?> wildcardClass6 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(filter3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport1.getparseContext();
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference12);
        org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport1.innerQuery;
        nestedInnerQueryParseSupport1.setfilterFound(false);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(queryParseContext11);
        org.junit.Assert.assertNull(query14);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Filter filter4 = nestedInnerQueryParseSupport1.childFilter;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        boolean boolean7 = nestedInnerQueryParseSupport1.getqueryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter8);
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(filter4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter6;
        org.apache.lucene.search.Filter filter8 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter8);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter10);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = null;
        nestedInnerQueryParseSupport1.source = bytesReference9;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter11);
        boolean boolean13 = nestedInnerQueryParseSupport1.filterFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter14;
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        boolean boolean4 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter6);
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Filter filter4 = nestedInnerQueryParseSupport1.childFilter;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.Filter filter7 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter7);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper9;
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = null;
        nestedInnerQueryParseSupport1.source = bytesReference11;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(filter4);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = null;
        nestedInnerQueryParseSupport1.source = bytesReference9;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter11);
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        org.apache.lucene.search.Query query15 = null;
        nestedInnerQueryParseSupport1.innerQuery = query15;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query17 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter5;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterParsed;
        org.apache.lucene.search.Filter filter3 = nestedInnerQueryParseSupport1.childFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.filterParsed;
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport1.innerFilter = query5;
        org.apache.lucene.search.Query query7 = null;
        nestedInnerQueryParseSupport1.innerFilter = query7;
        java.lang.Class<?> wildcardClass9 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(filter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = nestedInnerQueryParseSupport1.parentFilter;
        nestedInnerQueryParseSupport1.queryParsed = false;
        org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport1.innerFilter;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query16 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(queryParseContext11);
        org.junit.Assert.assertNull(bitDocIdSetFilter12);
        org.junit.Assert.assertNull(query15);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        boolean boolean6 = nestedInnerQueryParseSupport1.getqueryParsed();
        boolean boolean7 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.parentObjectMapper;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper6;
        nestedInnerQueryParseSupport1.filterParsed = true;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport1.innerQuery = query4;
        org.apache.lucene.search.Filter filter6 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter9);
        org.apache.lucene.search.Filter filter11 = nestedInnerQueryParseSupport1.getchildFilter();
        boolean boolean12 = nestedInnerQueryParseSupport1.queryFound;
        java.lang.Class<?> wildcardClass13 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(filter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.elasticsearch.index.mapper.object.ObjectMapper.TypeParser typeParser0 = new org.elasticsearch.index.mapper.object.ObjectMapper.TypeParser();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        org.elasticsearch.index.mapper.Mapper.TypeParser.ParserContext parserContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.mapper.Mapper.Builder builder4 = typeParser0.parse("", strMap2, parserContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter5;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean12 = nestedInnerQueryParseSupport1.queryParsed;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = nestedInnerQueryParseSupport1.getsource();
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = nestedInnerQueryParseSupport1.getsource();
        org.apache.lucene.search.Query query12 = null;
        nestedInnerQueryParseSupport1.innerFilter = query12;
        java.lang.String str14 = nestedInnerQueryParseSupport1.path;
        java.lang.Class<?> wildcardClass15 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(bytesReference10);
        org.junit.Assert.assertNull(bytesReference11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter9);
        org.apache.lucene.search.Filter filter11 = nestedInnerQueryParseSupport1.getchildFilter();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("nested");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(filter11);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Filter filter4 = nestedInnerQueryParseSupport1.childFilter;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        boolean boolean7 = nestedInnerQueryParseSupport1.getqueryFound();
        nestedInnerQueryParseSupport1.setfilterFound(false);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(filter4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = nestedInnerQueryParseSupport1.getsource();
        nestedInnerQueryParseSupport1.path = "object";
        nestedInnerQueryParseSupport1.setfilterFound(false);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference4);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Filter filter4 = nestedInnerQueryParseSupport1.childFilter;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.Filter filter7 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter7);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper9;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        nestedInnerQueryParseSupport1.filterParsed = true;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(filter4);
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.innerFilter;
        boolean boolean12 = nestedInnerQueryParseSupport1.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter13);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(query11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper4;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = nestedInnerQueryParseSupport1.getsource();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        nestedInnerQueryParseSupport1.filterFound = true;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference4);
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter9);
        org.apache.lucene.search.Filter filter11 = nestedInnerQueryParseSupport1.getchildFilter();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(filter11);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = nestedInnerQueryParseSupport1.getsource();
        nestedInnerQueryParseSupport1.path = "nested";
        nestedInnerQueryParseSupport1.path = "";
        org.apache.lucene.search.Filter filter9 = nestedInnerQueryParseSupport1.childFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter10);
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference12);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference4);
        org.junit.Assert.assertNull(filter9);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter9);
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = nestedInnerQueryParseSupport1.getsource();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(bytesReference11);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        boolean boolean4 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport1.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("nested");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(query10);
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        nestedInnerQueryParseSupport1.setqueryFound(true);
        nestedInnerQueryParseSupport1.filterFound = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = nestedInnerQueryParseSupport1.source;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(bytesReference13);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        nestedInnerQueryParseSupport1.filterParsed = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter7;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectMapper4);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Filter filter4 = null;
        nestedInnerQueryParseSupport1.childFilter = filter4;
        boolean boolean6 = nestedInnerQueryParseSupport1.getfilterParsed();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Filter filter4 = nestedInnerQueryParseSupport1.childFilter;
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport1.innerFilter = query5;
        org.apache.lucene.search.Filter filter7 = nestedInnerQueryParseSupport1.getchildFilter();
        nestedInnerQueryParseSupport1.queryParsed = false;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(filter4);
        org.junit.Assert.assertNull(filter7);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        boolean boolean4 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter6);
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = nestedInnerQueryParseSupport1.getparseContext();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(queryParseContext8);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Filter filter4 = nestedInnerQueryParseSupport1.childFilter;
        java.lang.String str5 = nestedInnerQueryParseSupport1.path;
        boolean boolean6 = nestedInnerQueryParseSupport1.getqueryFound();
        nestedInnerQueryParseSupport1.queryFound = true;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(filter4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter5;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.apache.lucene.search.Filter filter11 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter11);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("nested");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        nestedInnerQueryParseSupport1.filterFound = false;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        nestedInnerQueryParseSupport1.path = "";
        org.apache.lucene.search.Query query11 = null;
        nestedInnerQueryParseSupport1.innerFilter = query11;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        boolean boolean4 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        nestedInnerQueryParseSupport1.path = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
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
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport1.innerFilter = query10;
        boolean boolean12 = nestedInnerQueryParseSupport1.getqueryParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Filter filter2 = nestedInnerQueryParseSupport1.getchildFilter();
        org.apache.lucene.search.Filter filter3 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter3);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(filter2);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = nestedInnerQueryParseSupport1.getsource();
        boolean boolean7 = nestedInnerQueryParseSupport1.getqueryFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport1.getparseContext();
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference12);
        org.apache.lucene.search.Filter filter14 = nestedInnerQueryParseSupport1.childFilter;
        org.apache.lucene.search.Filter filter15 = nestedInnerQueryParseSupport1.childFilter;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("object");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(queryParseContext11);
        org.junit.Assert.assertNull(filter14);
        org.junit.Assert.assertNull(filter15);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        nestedInnerQueryParseSupport1.filterParsed = true;
        nestedInnerQueryParseSupport1.setfilterFound(false);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectMapper4);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        nestedInnerQueryParseSupport1.setqueryFound(true);
        nestedInnerQueryParseSupport1.queryFound = true;
        boolean boolean13 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean14 = nestedInnerQueryParseSupport1.getfilterFound();
        boolean boolean15 = nestedInnerQueryParseSupport1.queryParsed;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.elasticsearch.index.query.QueryParseContext queryParseContext9 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.Filter filter10 = nestedInnerQueryParseSupport1.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper11;
        boolean boolean13 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = nestedInnerQueryParseSupport1.parentFilter;
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query17 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(queryParseContext9);
        org.junit.Assert.assertNull(filter10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(bitDocIdSetFilter14);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.elasticsearch.index.query.QueryParseContext queryParseContext9 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.Filter filter10 = nestedInnerQueryParseSupport1.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper11;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(queryParseContext9);
        org.junit.Assert.assertNull(filter10);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter3);
        java.lang.Class<?> wildcardClass5 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.apache.lucene.search.Query query6 = null;
        nestedInnerQueryParseSupport1.innerFilter = query6;
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean9 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference10);
        org.apache.lucene.search.Filter filter12 = null;
        nestedInnerQueryParseSupport1.childFilter = filter12;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.Filter filter3 = nestedInnerQueryParseSupport1.childFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.filterFound;
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(filter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport1.innerQuery = query4;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport1.source = bytesReference5;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport1.innerFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = nestedInnerQueryParseSupport1.getparentFilter();
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean10 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(query7);
        org.junit.Assert.assertNull(bitDocIdSetFilter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport1.getparseContext();
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference12);
        boolean boolean14 = nestedInnerQueryParseSupport1.filterFound;
        nestedInnerQueryParseSupport1.filterFound = true;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query19 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(queryParseContext11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport1.getfilterFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.getqueryParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        boolean boolean4 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter6);
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.path = "";
        nestedInnerQueryParseSupport1.path = "nested";
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(queryParseContext8);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = nestedInnerQueryParseSupport1.getsource();
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = null;
        nestedInnerQueryParseSupport1.source = bytesReference11;
        org.apache.lucene.search.Filter filter13 = nestedInnerQueryParseSupport1.getchildFilter();
        boolean boolean14 = nestedInnerQueryParseSupport1.filterFound();
        nestedInnerQueryParseSupport1.queryFound = true;
        org.apache.lucene.search.Filter filter17 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter17);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(bytesReference10);
        org.junit.Assert.assertNull(filter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper6;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper8;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter10);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = nestedInnerQueryParseSupport1.getsource();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = nestedInnerQueryParseSupport1.getparentFilter();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(bytesReference10);
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = nestedInnerQueryParseSupport1.getsource();
        boolean boolean7 = nestedInnerQueryParseSupport1.getqueryFound();
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        boolean boolean10 = nestedInnerQueryParseSupport1.getfilterFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport1.innerFilter;
        java.lang.Class<?> wildcardClass11 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(query10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Filter filter4 = nestedInnerQueryParseSupport1.childFilter;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.Filter filter7 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter7);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper9;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        nestedInnerQueryParseSupport1.filterParsed = true;
        boolean boolean14 = nestedInnerQueryParseSupport1.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper15;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(filter4);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter9);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = nestedInnerQueryParseSupport1.parentFilter;
        nestedInnerQueryParseSupport1.setfilterFound(false);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter14;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper10;
        org.elasticsearch.index.query.QueryParseContext queryParseContext12 = nestedInnerQueryParseSupport1.parseContext;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = queryParseContext12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(query9);
        org.junit.Assert.assertNull(queryParseContext12);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter10;
        org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport1.innerQuery;
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = nestedInnerQueryParseSupport1.getsource();
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(query12);
        org.junit.Assert.assertNull(bytesReference13);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = nestedInnerQueryParseSupport1.getsource();
        java.lang.String str11 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference12);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(bytesReference10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper6;
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        boolean boolean5 = nestedInnerQueryParseSupport1.getfilterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.getfilterFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.elasticsearch.index.mapper.object.ObjectMapper.TypeParser typeParser0 = new org.elasticsearch.index.mapper.object.ObjectMapper.TypeParser();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = null;
        org.elasticsearch.index.mapper.Mapper.TypeParser.ParserContext parserContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.mapper.Mapper.Builder builder4 = typeParser0.parse("object", strMap2, parserContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter6;
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = nestedInnerQueryParseSupport1.getsource();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference8);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = nestedInnerQueryParseSupport1.getsource();
        nestedInnerQueryParseSupport1.path = "nested";
        nestedInnerQueryParseSupport1.path = "";
        java.lang.Class<?> wildcardClass9 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(bytesReference4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Filter filter4 = nestedInnerQueryParseSupport1.childFilter;
        java.lang.String str5 = nestedInnerQueryParseSupport1.path;
        org.apache.lucene.search.Filter filter6 = nestedInnerQueryParseSupport1.childFilter;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(filter4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(filter6);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = nestedInnerQueryParseSupport1.getsource();
        java.lang.String str11 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        nestedInnerQueryParseSupport1.setfilterFound(true);
        org.elasticsearch.common.bytes.BytesReference bytesReference15 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference15);
        org.apache.lucene.search.Query query17 = nestedInnerQueryParseSupport1.innerQuery;
        nestedInnerQueryParseSupport1.path = "hi!";
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(bytesReference10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertNull(query17);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = nestedInnerQueryParseSupport1.getsource();
        nestedInnerQueryParseSupport1.path = "nested";
        nestedInnerQueryParseSupport1.path = "";
        org.apache.lucene.search.Filter filter9 = nestedInnerQueryParseSupport1.childFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter10);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper12;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference4);
        org.junit.Assert.assertNull(filter9);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.innerFilter;
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        boolean boolean12 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper13;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(query9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Filter filter2 = nestedInnerQueryParseSupport1.getchildFilter();
        org.apache.lucene.search.Filter filter3 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter3);
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport1.innerFilter = query5;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(filter2);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(true, true);
        boolean boolean3 = nested2.isIncludeInParent();
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
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = nestedInnerQueryParseSupport1.getsource();
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = nestedInnerQueryParseSupport1.getsource();
        nestedInnerQueryParseSupport1.filterFound = true;
        java.lang.String str14 = nestedInnerQueryParseSupport1.getPath();
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(bytesReference10);
        org.junit.Assert.assertNull(bytesReference11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = nestedInnerQueryParseSupport1.getsource();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        nestedInnerQueryParseSupport1.filterFound = true;
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference4);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(queryParseContext8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        boolean boolean4 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str7 = nestedInnerQueryParseSupport1.path;
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterParsed;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.innerFilter;
        org.apache.lucene.search.Filter filter10 = null;
        nestedInnerQueryParseSupport1.childFilter = filter10;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(query9);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.query.QueryParseContext queryParseContext7 = nestedInnerQueryParseSupport1.getparseContext();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(queryParseContext7);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport1.innerQuery = query4;
        org.apache.lucene.search.Filter filter6 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter6);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper10;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(query9);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.elasticsearch.index.query.QueryParseContext queryParseContext9 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.Filter filter10 = nestedInnerQueryParseSupport1.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper11;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.parentObjectMapper;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(queryParseContext9);
        org.junit.Assert.assertNull(filter10);
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Filter filter4 = nestedInnerQueryParseSupport1.childFilter;
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport1.innerQuery;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(filter4);
        org.junit.Assert.assertNull(query5);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport1.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        boolean boolean12 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(query10);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterParsed;
        org.apache.lucene.search.Filter filter3 = nestedInnerQueryParseSupport1.childFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.filterParsed;
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport1.innerFilter = query5;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(filter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        boolean boolean4 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean7 = nestedInnerQueryParseSupport1.getqueryParsed();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter5;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean10 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean12 = nestedInnerQueryParseSupport1.filterFound;
        java.lang.String str13 = nestedInnerQueryParseSupport1.path;
        org.apache.lucene.search.Query query14 = null;
        nestedInnerQueryParseSupport1.innerFilter = query14;
        org.apache.lucene.search.Filter filter16 = nestedInnerQueryParseSupport1.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper17 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper17;
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(filter16);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.elasticsearch.index.query.QueryParseContext queryParseContext9 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.Filter filter10 = nestedInnerQueryParseSupport1.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper11;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.parentObjectMapper;
        boolean boolean14 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(queryParseContext9);
        org.junit.Assert.assertNull(filter10);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper4;
        org.apache.lucene.search.Filter filter6 = nestedInnerQueryParseSupport1.childFilter;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter9;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(filter6);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        nestedInnerQueryParseSupport1.filterParsed = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter7;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectMapper4);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Filter filter4 = nestedInnerQueryParseSupport1.childFilter;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        nestedInnerQueryParseSupport1.queryFound = true;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(filter4);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper6;
        nestedInnerQueryParseSupport1.filterParsed = true;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter11;
        boolean boolean13 = nestedInnerQueryParseSupport1.getqueryFound();
        org.apache.lucene.search.Query query14 = null;
        nestedInnerQueryParseSupport1.innerQuery = query14;
        org.apache.lucene.search.Filter filter16 = nestedInnerQueryParseSupport1.getchildFilter();
        org.apache.lucene.search.Query query17 = null;
        nestedInnerQueryParseSupport1.innerQuery = query17;
        java.lang.Class<?> wildcardClass19 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(filter16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = nestedInnerQueryParseSupport1.getsource();
        nestedInnerQueryParseSupport1.path = "";
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean15 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean16 = nestedInnerQueryParseSupport1.getqueryFound();
        nestedInnerQueryParseSupport1.filterParsed = true;
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(bytesReference10);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertNull(bitDocIdSetFilter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        boolean boolean4 = nestedInnerQueryParseSupport1.getfilterFound();
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport1.innerQuery = query5;
        org.elasticsearch.index.query.QueryParseContext queryParseContext7 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.queryFound = false;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(queryParseContext7);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Filter filter4 = nestedInnerQueryParseSupport1.childFilter;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.Filter filter7 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter7);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper9;
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = null;
        nestedInnerQueryParseSupport1.source = bytesReference11;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter13);
        nestedInnerQueryParseSupport1.setqueryFound(false);
        boolean boolean17 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.apache.lucene.search.Filter filter18 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter18);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(filter4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = nestedInnerQueryParseSupport1.getsource();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference4);
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport1.parentFilter;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper6;
        nestedInnerQueryParseSupport1.filterParsed = true;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter11;
        boolean boolean13 = nestedInnerQueryParseSupport1.getqueryFound();
        boolean boolean14 = nestedInnerQueryParseSupport1.getqueryFound();
        java.lang.Class<?> wildcardClass15 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = nestedInnerQueryParseSupport1.parentFilter;
        nestedInnerQueryParseSupport1.path = "object";
        org.elasticsearch.common.bytes.BytesReference bytesReference15 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference15);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query17 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(queryParseContext11);
        org.junit.Assert.assertNull(bitDocIdSetFilter12);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Filter filter4 = nestedInnerQueryParseSupport1.childFilter;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        boolean boolean7 = nestedInnerQueryParseSupport1.getqueryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter8);
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound;
        nestedInnerQueryParseSupport1.queryParsed = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter13;
        java.lang.Class<?> wildcardClass15 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(filter4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Filter filter4 = nestedInnerQueryParseSupport1.childFilter;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.Filter filter7 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter7);
        java.lang.Class<?> wildcardClass9 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(filter4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterParsed;
        org.apache.lucene.search.Filter filter3 = nestedInnerQueryParseSupport1.childFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.filterParsed;
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport1.innerFilter = query5;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(filter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.elasticsearch.index.query.QueryParseContext queryParseContext9 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.Filter filter10 = nestedInnerQueryParseSupport1.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper11;
        boolean boolean13 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = nestedInnerQueryParseSupport1.parentFilter;
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Query query17 = null;
        nestedInnerQueryParseSupport1.innerQuery = query17;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(queryParseContext9);
        org.junit.Assert.assertNull(filter10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(bitDocIdSetFilter14);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean10 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean12 = nestedInnerQueryParseSupport1.filterFound;
        nestedInnerQueryParseSupport1.queryParsed = false;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper6;
        nestedInnerQueryParseSupport1.filterParsed = true;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter11;
        boolean boolean13 = nestedInnerQueryParseSupport1.getqueryFound();
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        boolean boolean16 = nestedInnerQueryParseSupport1.queryFound;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter9);
        org.apache.lucene.search.Filter filter11 = nestedInnerQueryParseSupport1.getchildFilter();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        boolean boolean13 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference14 = null;
        nestedInnerQueryParseSupport1.source = bytesReference14;
        java.lang.String str16 = nestedInnerQueryParseSupport1.getPath();
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(filter11);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        nestedInnerQueryParseSupport1.setqueryFound(true);
        nestedInnerQueryParseSupport1.queryFound = true;
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        java.lang.Class<?> wildcardClass15 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter9);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = nestedInnerQueryParseSupport1.parentFilter;
        nestedInnerQueryParseSupport1.setfilterFound(false);
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper16 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper16;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper18 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query19 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
        org.junit.Assert.assertNull(objectMapper18);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = nestedInnerQueryParseSupport1.getsource();
        nestedInnerQueryParseSupport1.path = "nested";
        nestedInnerQueryParseSupport1.path = "";
        org.apache.lucene.search.Filter filter9 = nestedInnerQueryParseSupport1.childFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter10);
        org.elasticsearch.index.query.QueryParseContext queryParseContext12 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = nestedInnerQueryParseSupport1.getparentFilter();
        nestedInnerQueryParseSupport1.path = "object";
        java.lang.Class<?> wildcardClass16 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(bytesReference4);
        org.junit.Assert.assertNull(filter9);
        org.junit.Assert.assertNull(queryParseContext12);
        org.junit.Assert.assertNull(bitDocIdSetFilter13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        org.elasticsearch.common.bytes.BytesReference bytesReference7 = null;
        nestedInnerQueryParseSupport1.source = bytesReference7;
        boolean boolean9 = nestedInnerQueryParseSupport1.filterParsed;
        boolean boolean10 = nestedInnerQueryParseSupport1.getqueryFound();
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        nestedInnerQueryParseSupport1.setqueryFound(true);
        nestedInnerQueryParseSupport1.queryFound = true;
        boolean boolean13 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter14);
        org.apache.lucene.search.Filter filter16 = nestedInnerQueryParseSupport1.getchildFilter();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(filter16);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Filter filter4 = nestedInnerQueryParseSupport1.childFilter;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.Filter filter7 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter7);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper9;
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = null;
        nestedInnerQueryParseSupport1.source = bytesReference11;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter13);
        nestedInnerQueryParseSupport1.setqueryFound(false);
        boolean boolean17 = nestedInnerQueryParseSupport1.getqueryParsed();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(filter4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = nestedInnerQueryParseSupport1.getsource();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter10);
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport1.getInnerQuery();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = query15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(bytesReference9);
        org.junit.Assert.assertNull(objectMapper14);
        org.junit.Assert.assertNull(query15);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterParsed;
        org.apache.lucene.search.Filter filter3 = nestedInnerQueryParseSupport1.childFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.filterParsed;
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport1.innerFilter = query5;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper8;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(filter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.innerFilter;
        boolean boolean12 = nestedInnerQueryParseSupport1.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter13);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(query11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean10 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean12 = nestedInnerQueryParseSupport1.filterFound;
        java.lang.String str13 = nestedInnerQueryParseSupport1.path;
        org.apache.lucene.search.Query query14 = null;
        nestedInnerQueryParseSupport1.innerFilter = query14;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter9);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter11;
        nestedInnerQueryParseSupport1.filterParsed = false;
        java.lang.Class<?> wildcardClass15 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper6;
        nestedInnerQueryParseSupport1.filterParsed = true;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter11;
        boolean boolean13 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference14 = nestedInnerQueryParseSupport1.getsource();
        java.lang.String str15 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(bytesReference14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper6;
        nestedInnerQueryParseSupport1.filterParsed = true;
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = nestedInnerQueryParseSupport1.parentFilter;
        org.apache.lucene.search.Query query12 = null;
        nestedInnerQueryParseSupport1.innerQuery = query12;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        boolean boolean6 = nestedInnerQueryParseSupport1.getqueryParsed();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.innerFilter;
        nestedInnerQueryParseSupport1.setfilterFound(true);
        org.elasticsearch.index.query.QueryParseContext queryParseContext14 = nestedInnerQueryParseSupport1.parseContext;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(query11);
        org.junit.Assert.assertNull(queryParseContext14);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.innerFilter;
        org.apache.lucene.search.Filter filter10 = null;
        nestedInnerQueryParseSupport1.childFilter = filter10;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(query9);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper6;
        java.lang.Class<?> wildcardClass8 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport1.getfilterFound();
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter9;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = nestedInnerQueryParseSupport1.getparentFilter();
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter14);
        boolean boolean16 = nestedInnerQueryParseSupport1.filterFound;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.elasticsearch.index.query.QueryParseContext queryParseContext9 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.Filter filter10 = nestedInnerQueryParseSupport1.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper11;
        boolean boolean13 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = nestedInnerQueryParseSupport1.parentFilter;
        org.apache.lucene.search.Query query15 = null;
        nestedInnerQueryParseSupport1.innerQuery = query15;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(queryParseContext9);
        org.junit.Assert.assertNull(filter10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(bitDocIdSetFilter14);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = null;
        nestedInnerQueryParseSupport1.source = bytesReference9;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter11);
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        org.apache.lucene.search.Query query15 = null;
        nestedInnerQueryParseSupport1.innerQuery = query15;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport1.parentFilter;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = nestedInnerQueryParseSupport1.getsource();
        boolean boolean7 = nestedInnerQueryParseSupport1.getqueryFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.innerFilter;
        boolean boolean12 = nestedInnerQueryParseSupport1.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter13);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(query11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = nestedInnerQueryParseSupport1.getsource();
        nestedInnerQueryParseSupport1.path = "nested";
        nestedInnerQueryParseSupport1.path = "";
        org.apache.lucene.search.Filter filter9 = nestedInnerQueryParseSupport1.childFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter10);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference4);
        org.junit.Assert.assertNull(filter9);
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = nestedInnerQueryParseSupport1.getsource();
        nestedInnerQueryParseSupport1.path = "";
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean15 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference16 = nestedInnerQueryParseSupport1.getsource();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(bytesReference10);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertNull(bitDocIdSetFilter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(bytesReference16);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean10 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean12 = nestedInnerQueryParseSupport1.filterFound;
        java.lang.String str13 = nestedInnerQueryParseSupport1.path;
        org.apache.lucene.search.Filter filter14 = null;
        nestedInnerQueryParseSupport1.childFilter = filter14;
        org.elasticsearch.common.bytes.BytesReference bytesReference16 = nestedInnerQueryParseSupport1.getsource();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query17 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(bytesReference16);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean10 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean12 = nestedInnerQueryParseSupport1.filterFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean14 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference15 = null;
        nestedInnerQueryParseSupport1.source = bytesReference15;
        java.lang.Class<?> wildcardClass17 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper6;
        nestedInnerQueryParseSupport1.filterParsed = true;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter11;
        boolean boolean13 = nestedInnerQueryParseSupport1.getqueryFound();
        org.apache.lucene.search.Query query14 = null;
        nestedInnerQueryParseSupport1.innerQuery = query14;
        org.apache.lucene.search.Filter filter16 = nestedInnerQueryParseSupport1.getchildFilter();
        org.apache.lucene.search.Query query17 = null;
        nestedInnerQueryParseSupport1.innerQuery = query17;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(filter16);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Filter filter4 = nestedInnerQueryParseSupport1.childFilter;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.elasticsearch.common.bytes.BytesReference bytesReference7 = null;
        nestedInnerQueryParseSupport1.source = bytesReference7;
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Filter filter11 = nestedInnerQueryParseSupport1.getchildFilter();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(filter4);
        org.junit.Assert.assertNull(filter11);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.innerFilter;
        org.apache.lucene.search.Filter filter10 = null;
        nestedInnerQueryParseSupport1.childFilter = filter10;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter12;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter14);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper16 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(query9);
        org.junit.Assert.assertNull(objectMapper16);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        java.lang.Class<?> wildcardClass10 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound;
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.innerFilter;
        boolean boolean12 = nestedInnerQueryParseSupport1.getqueryParsed();
        boolean boolean13 = nestedInnerQueryParseSupport1.filterFound;
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(query11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper6;
        nestedInnerQueryParseSupport1.filterParsed = true;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound();
        nestedInnerQueryParseSupport1.queryParsed = true;
        org.apache.lucene.search.Filter filter14 = nestedInnerQueryParseSupport1.childFilter;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(filter14);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        boolean boolean4 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport1.innerFilter;
        boolean boolean7 = nestedInnerQueryParseSupport1.filterParsed;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(query6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = nestedInnerQueryParseSupport1.getsource();
        java.lang.String str11 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.query.QueryParseContext queryParseContext13 = nestedInnerQueryParseSupport1.getparseContext();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(bytesReference10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertNull(queryParseContext13);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter5;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean12 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean13 = nestedInnerQueryParseSupport1.getqueryFound();
        nestedInnerQueryParseSupport1.setfilterFound(false);
        java.lang.String str16 = nestedInnerQueryParseSupport1.getPath();
        nestedInnerQueryParseSupport1.queryFound = false;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested2 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.newNested(true, true);
        boolean boolean3 = nested2.isIncludeInParent();
        boolean boolean4 = nested2.isIncludeInRoot();
        boolean boolean5 = nested2.isIncludeInParent();
        boolean boolean6 = nested2.isNested();
        boolean boolean7 = nested2.isIncludeInParent();
        boolean boolean8 = nested2.isNested();
        boolean boolean9 = nested2.isIncludeInRoot();
        java.lang.Class<?> wildcardClass10 = nested2.getClass();
        org.junit.Assert.assertNotNull(nested2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.innerFilter;
        boolean boolean12 = nestedInnerQueryParseSupport1.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter13);
        org.apache.lucene.search.Filter filter15 = null;
        nestedInnerQueryParseSupport1.childFilter = filter15;
        org.apache.lucene.search.Query query17 = null;
        nestedInnerQueryParseSupport1.innerFilter = query17;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter19 = nestedInnerQueryParseSupport1.parentFilter;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(query11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(bitDocIdSetFilter19);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.innerFilter;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        boolean boolean12 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean13 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean14 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(query9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = nestedInnerQueryParseSupport1.getsource();
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = null;
        nestedInnerQueryParseSupport1.source = bytesReference11;
        nestedInnerQueryParseSupport1.queryFound = false;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(bytesReference10);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport1.source = bytesReference5;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport1.innerFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = nestedInnerQueryParseSupport1.getparentFilter();
        nestedInnerQueryParseSupport1.setqueryFound(false);
        boolean boolean11 = nestedInnerQueryParseSupport1.getfilterParsed();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("nested");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(query7);
        org.junit.Assert.assertNull(bitDocIdSetFilter8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter5;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterParsed;
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.getfilterFound();
        nestedInnerQueryParseSupport1.setfilterFound(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = nestedInnerQueryParseSupport1.getsource();
        nestedInnerQueryParseSupport1.path = "nested";
        nestedInnerQueryParseSupport1.path = "";
        org.apache.lucene.search.Filter filter9 = nestedInnerQueryParseSupport1.childFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter10);
        nestedInnerQueryParseSupport1.filterParsed = false;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference4);
        org.junit.Assert.assertNull(filter9);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Filter filter4 = nestedInnerQueryParseSupport1.childFilter;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        nestedInnerQueryParseSupport1.queryFound = true;
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(filter4);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter5;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean12 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean13 = nestedInnerQueryParseSupport1.getqueryFound();
        nestedInnerQueryParseSupport1.setfilterFound(false);
        java.lang.String str16 = nestedInnerQueryParseSupport1.getPath();
        nestedInnerQueryParseSupport1.queryFound = false;
        boolean boolean19 = nestedInnerQueryParseSupport1.getqueryFound();
        org.apache.lucene.search.Filter filter20 = null;
        nestedInnerQueryParseSupport1.childFilter = filter20;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query22 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterParsed;
        org.apache.lucene.search.Filter filter3 = nestedInnerQueryParseSupport1.childFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.filterParsed;
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport1.innerFilter = query5;
        nestedInnerQueryParseSupport1.queryParsed = true;
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.innerQuery;
        org.elasticsearch.index.query.QueryParseContext queryParseContext10 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean11 = nestedInnerQueryParseSupport1.filterFound;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(filter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(query9);
        org.junit.Assert.assertNull(queryParseContext10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper2 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = nestedInnerQueryParseSupport1.getsource();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference4);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = nestedInnerQueryParseSupport1.getsource();
        nestedInnerQueryParseSupport1.path = "nested";
        nestedInnerQueryParseSupport1.path = "";
        nestedInnerQueryParseSupport1.filterParsed = true;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference4);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport1.getfilterFound();
        nestedInnerQueryParseSupport1.setqueryFound(true);
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.parentObjectMapper;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = null;
        nestedInnerQueryParseSupport1.source = bytesReference9;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter11);
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        nestedInnerQueryParseSupport1.path = "nested";
        org.apache.lucene.search.Filter filter17 = nestedInnerQueryParseSupport1.getchildFilter();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(filter17);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean10 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean12 = nestedInnerQueryParseSupport1.filterFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean14 = nestedInnerQueryParseSupport1.filterFound();
        nestedInnerQueryParseSupport1.queryParsed = false;
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        boolean boolean4 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str7 = nestedInnerQueryParseSupport1.path;
        org.apache.lucene.search.Filter filter8 = nestedInnerQueryParseSupport1.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.parentObjectMapper;
        nestedInnerQueryParseSupport1.queryParsed = false;
        boolean boolean12 = nestedInnerQueryParseSupport1.filterFound;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(filter8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        boolean boolean5 = nestedInnerQueryParseSupport1.getfilterFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        boolean boolean6 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper7;
        java.lang.String str9 = nestedInnerQueryParseSupport1.getPath();
        nestedInnerQueryParseSupport1.filterParsed = false;
        java.lang.Class<?> wildcardClass12 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean10 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean12 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = nestedInnerQueryParseSupport1.getsource();
        boolean boolean7 = nestedInnerQueryParseSupport1.getqueryFound();
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        boolean boolean10 = nestedInnerQueryParseSupport1.filterParsed;
        nestedInnerQueryParseSupport1.filterFound = false;
        java.lang.Class<?> wildcardClass13 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(bytesReference6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper4;
        org.apache.lucene.search.Filter filter6 = nestedInnerQueryParseSupport1.childFilter;
        nestedInnerQueryParseSupport1.filterFound = true;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(filter6);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport1.innerFilter = query10;
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = null;
        nestedInnerQueryParseSupport1.source = bytesReference12;
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport1.getparseContext();
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference12);
        boolean boolean14 = nestedInnerQueryParseSupport1.getqueryFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(queryParseContext11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        boolean boolean4 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter6);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter7);
        boolean boolean9 = nestedInnerQueryParseSupport1.getqueryParsed();
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterParsed;
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter5);
        org.apache.lucene.search.Query query7 = null;
        nestedInnerQueryParseSupport1.innerQuery = query7;
        boolean boolean9 = nestedInnerQueryParseSupport1.getqueryFound();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper6;
        nestedInnerQueryParseSupport1.filterParsed = true;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter11;
        boolean boolean13 = nestedInnerQueryParseSupport1.getqueryFound();
        org.apache.lucene.search.Query query14 = null;
        nestedInnerQueryParseSupport1.innerQuery = query14;
        org.apache.lucene.search.Filter filter16 = nestedInnerQueryParseSupport1.getchildFilter();
        org.apache.lucene.search.Query query17 = null;
        nestedInnerQueryParseSupport1.innerQuery = query17;
        boolean boolean19 = nestedInnerQueryParseSupport1.getfilterParsed();
        java.lang.String str20 = nestedInnerQueryParseSupport1.getPath();
        boolean boolean21 = nestedInnerQueryParseSupport1.filterFound;
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(filter16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = nestedInnerQueryParseSupport1.getsource();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = nestedInnerQueryParseSupport1.getparentFilter();
        boolean boolean12 = nestedInnerQueryParseSupport1.queryParsed;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(bytesReference10);
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.innerFilter;
        boolean boolean12 = nestedInnerQueryParseSupport1.queryFound();
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Query query15 = null;
        nestedInnerQueryParseSupport1.innerQuery = query15;
        org.elasticsearch.index.query.QueryParseContext queryParseContext17 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean18 = nestedInnerQueryParseSupport1.filterFound;
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(query11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(queryParseContext17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.elasticsearch.index.query.QueryParseContext queryParseContext9 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.Filter filter10 = nestedInnerQueryParseSupport1.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper11;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.parentObjectMapper;
        boolean boolean14 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean15 = nestedInnerQueryParseSupport1.filterFound;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(queryParseContext9);
        org.junit.Assert.assertNull(filter10);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = nestedInnerQueryParseSupport1.getsource();
        java.lang.String str11 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        nestedInnerQueryParseSupport1.setfilterFound(true);
        boolean boolean15 = nestedInnerQueryParseSupport1.filterFound();
        java.lang.Class<?> wildcardClass16 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(bytesReference10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter9);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean10 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean12 = nestedInnerQueryParseSupport1.filterFound;
        nestedInnerQueryParseSupport1.queryParsed = false;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Filter filter4 = nestedInnerQueryParseSupport1.childFilter;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.Query query7 = null;
        nestedInnerQueryParseSupport1.innerFilter = query7;
        org.apache.lucene.search.Query query9 = null;
        nestedInnerQueryParseSupport1.innerQuery = query9;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(filter4);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = nestedInnerQueryParseSupport1.getsource();
        nestedInnerQueryParseSupport1.path = "";
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter14);
        boolean boolean16 = nestedInnerQueryParseSupport1.queryFound();
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(bytesReference10);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = null;
        nestedInnerQueryParseSupport1.source = bytesReference9;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper9;
        org.apache.lucene.search.Query query11 = null;
        nestedInnerQueryParseSupport1.innerFilter = query11;
        java.lang.String str13 = nestedInnerQueryParseSupport1.getPath();
        org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport1.innerFilter;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(query14);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        boolean boolean6 = nestedInnerQueryParseSupport1.getqueryParsed();
        boolean boolean7 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = nestedInnerQueryParseSupport1.getsource();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter11;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(bytesReference10);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterParsed;
        org.apache.lucene.search.Filter filter3 = nestedInnerQueryParseSupport1.childFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.filterParsed;
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport1.innerFilter = query5;
        nestedInnerQueryParseSupport1.queryParsed = true;
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.innerQuery;
        org.elasticsearch.index.query.QueryParseContext queryParseContext10 = nestedInnerQueryParseSupport1.parseContext;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(filter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(query9);
        org.junit.Assert.assertNull(queryParseContext10);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = nestedInnerQueryParseSupport1.getsource();
        nestedInnerQueryParseSupport1.path = "nested";
        nestedInnerQueryParseSupport1.path = "";
        org.apache.lucene.search.Filter filter9 = nestedInnerQueryParseSupport1.childFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter10);
        org.elasticsearch.index.query.QueryParseContext queryParseContext12 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.Filter filter13 = null;
        nestedInnerQueryParseSupport1.childFilter = filter13;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference4);
        org.junit.Assert.assertNull(filter9);
        org.junit.Assert.assertNull(queryParseContext12);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Filter filter4 = nestedInnerQueryParseSupport1.childFilter;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        boolean boolean7 = nestedInnerQueryParseSupport1.getqueryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter8);
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = nestedInnerQueryParseSupport1.getsource();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(filter4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(bytesReference10);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport1.parentFilter;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound();
        nestedInnerQueryParseSupport1.filterFound = true;
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        java.lang.String str7 = nestedInnerQueryParseSupport1.getPath();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = nestedInnerQueryParseSupport1.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = nestedInnerQueryParseSupport1.getparentFilter();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(bitDocIdSetFilter8);
        org.junit.Assert.assertNull(bitDocIdSetFilter9);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport1.getfilterFound();
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter9;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = nestedInnerQueryParseSupport1.getparentFilter();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.parentObjectMapper;
        java.lang.String str13 = nestedInnerQueryParseSupport1.path;
        nestedInnerQueryParseSupport1.path = "object";
        nestedInnerQueryParseSupport1.setqueryFound(true);
        nestedInnerQueryParseSupport1.setfilterFound(false);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.elasticsearch.index.query.QueryParseContext queryParseContext9 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.Filter filter10 = null;
        nestedInnerQueryParseSupport1.childFilter = filter10;
        boolean boolean12 = nestedInnerQueryParseSupport1.queryFound;
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(queryParseContext9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter5;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper11;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = nestedInnerQueryParseSupport1.getparentFilter();
        boolean boolean14 = nestedInnerQueryParseSupport1.filterParsed;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(bitDocIdSetFilter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean10 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean12 = nestedInnerQueryParseSupport1.filterFound;
        java.lang.String str13 = nestedInnerQueryParseSupport1.path;
        org.apache.lucene.search.Query query14 = null;
        nestedInnerQueryParseSupport1.innerFilter = query14;
        org.apache.lucene.search.Filter filter16 = nestedInnerQueryParseSupport1.childFilter;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper19 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference20 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference20);
        org.apache.lucene.search.Query query22 = null;
        nestedInnerQueryParseSupport1.innerFilter = query22;
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(filter16);
        org.junit.Assert.assertNull(objectMapper19);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport1.source = bytesReference5;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport1.innerFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = nestedInnerQueryParseSupport1.getparentFilter();
        nestedInnerQueryParseSupport1.setqueryFound(false);
        java.lang.String str11 = nestedInnerQueryParseSupport1.getPath();
        java.lang.Class<?> wildcardClass12 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(query7);
        org.junit.Assert.assertNull(bitDocIdSetFilter8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        boolean boolean4 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter6);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = nestedInnerQueryParseSupport1.getparentFilter();
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference10);
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(bitDocIdSetFilter9);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterParsed;
        org.apache.lucene.search.Filter filter3 = nestedInnerQueryParseSupport1.childFilter;
        nestedInnerQueryParseSupport1.filterFound = true;
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.Class<?> wildcardClass9 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(filter3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        nestedInnerQueryParseSupport1.filterParsed = true;
        org.apache.lucene.search.Filter filter7 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter7);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper9;
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport1.getparseContext();
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(queryParseContext11);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper2 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper2;
        boolean boolean4 = nestedInnerQueryParseSupport1.getqueryParsed();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Filter filter4 = nestedInnerQueryParseSupport1.childFilter;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.Filter filter7 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter7);
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.index.query.QueryParseContext queryParseContext10 = nestedInnerQueryParseSupport1.parseContext;
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.filterParsed = false;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(filter4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(queryParseContext10);
        org.junit.Assert.assertNull(queryParseContext11);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        boolean boolean4 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str7 = nestedInnerQueryParseSupport1.path;
        org.apache.lucene.search.Filter filter8 = nestedInnerQueryParseSupport1.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.parentObjectMapper;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(filter8);
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterParsed;
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper5;
        org.apache.lucene.search.Filter filter7 = nestedInnerQueryParseSupport1.childFilter;
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("object");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(query4);
        org.junit.Assert.assertNull(filter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = nestedInnerQueryParseSupport1.getsource();
        boolean boolean11 = nestedInnerQueryParseSupport1.filterFound;
        org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport1.innerFilter;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(bytesReference10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(query12);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter6;
        java.lang.String str8 = nestedInnerQueryParseSupport1.path;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterParsed;
        org.apache.lucene.search.Filter filter3 = nestedInnerQueryParseSupport1.childFilter;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport1.innerFilter = query4;
        nestedInnerQueryParseSupport1.path = "";
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.apache.lucene.search.Filter filter9 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter9);
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference11);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.parentObjectMapper;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(filter3);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean11 = nestedInnerQueryParseSupport1.getqueryParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = null;
        nestedInnerQueryParseSupport1.source = bytesReference9;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.parentObjectMapper;
        boolean boolean13 = nestedInnerQueryParseSupport1.queryParsed;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterParsed;
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter5);
        org.apache.lucene.search.Query query7 = null;
        nestedInnerQueryParseSupport1.innerQuery = query7;
        org.apache.lucene.search.Query query9 = null;
        nestedInnerQueryParseSupport1.innerFilter = query9;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper6;
        nestedInnerQueryParseSupport1.filterParsed = true;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter11;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport1.innerFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter15 = nestedInnerQueryParseSupport1.getparentFilter();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertNull(query14);
        org.junit.Assert.assertNull(bitDocIdSetFilter15);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Filter filter4 = nestedInnerQueryParseSupport1.childFilter;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.Filter filter7 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter7);
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.index.query.QueryParseContext queryParseContext10 = nestedInnerQueryParseSupport1.parseContext;
        org.apache.lucene.search.Filter filter11 = null;
        nestedInnerQueryParseSupport1.childFilter = filter11;
        org.apache.lucene.search.Query query13 = null;
        nestedInnerQueryParseSupport1.innerFilter = query13;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.junit.Assert.assertNull(filter4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(queryParseContext10);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        nestedInnerQueryParseSupport1.setqueryFound(true);
        nestedInnerQueryParseSupport1.queryFound = true;
        boolean boolean13 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query16 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.innerFilter;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport1.innerQuery = query10;
        nestedInnerQueryParseSupport1.queryFound = true;
        boolean boolean14 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(query9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(objectMapper15);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.innerFilter;
        nestedInnerQueryParseSupport1.setfilterFound(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(query11);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport1.getfilterFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = nestedInnerQueryParseSupport1.getparseContext();
        boolean boolean9 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(queryParseContext8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.Filter filter5 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterParsed;
        org.elasticsearch.common.bytes.BytesReference bytesReference3 = nestedInnerQueryParseSupport1.getsource();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(bytesReference3);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.innerFilter;
        nestedInnerQueryParseSupport1.filterParsed = false;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(query9);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference9);
        java.lang.Class<?> wildcardClass11 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        boolean boolean6 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper7;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.apache.lucene.search.Filter filter10 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter10);
        boolean boolean12 = nestedInnerQueryParseSupport1.filterParsed;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.Filter filter3 = nestedInnerQueryParseSupport1.childFilter;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(filter3);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        boolean boolean6 = nestedInnerQueryParseSupport1.getqueryParsed();
        boolean boolean7 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.apache.lucene.search.Filter filter9 = nestedInnerQueryParseSupport1.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(filter9);
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        java.lang.Class<?> wildcardClass10 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = nestedInnerQueryParseSupport1.getsource();
        boolean boolean7 = nestedInnerQueryParseSupport1.getqueryFound();
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        boolean boolean10 = nestedInnerQueryParseSupport1.filterParsed;
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        boolean boolean4 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper7;
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper6;
        nestedInnerQueryParseSupport1.filterParsed = true;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter11;
        boolean boolean13 = nestedInnerQueryParseSupport1.queryParsed;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = nestedInnerQueryParseSupport1.getsource();
        boolean boolean7 = nestedInnerQueryParseSupport1.getqueryFound();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = nestedInnerQueryParseSupport1.getsource();
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = nestedInnerQueryParseSupport1.getsource();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(bytesReference10);
        org.junit.Assert.assertNull(bytesReference11);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.elasticsearch.index.query.QueryParseContext queryParseContext9 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.Filter filter10 = nestedInnerQueryParseSupport1.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper11;
        org.elasticsearch.index.query.QueryParseContext queryParseContext13 = nestedInnerQueryParseSupport1.getparseContext();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(queryParseContext9);
        org.junit.Assert.assertNull(filter10);
        org.junit.Assert.assertNull(queryParseContext13);
        org.junit.Assert.assertNull(objectMapper14);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean10 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.apache.lucene.search.Query query11 = null;
        nestedInnerQueryParseSupport1.innerFilter = query11;
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterParsed;
        org.apache.lucene.search.Filter filter3 = nestedInnerQueryParseSupport1.childFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.filterParsed;
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport1.innerFilter = query5;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper8;
        nestedInnerQueryParseSupport1.setfilterFound(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(filter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterParsed;
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = nestedInnerQueryParseSupport1.getsource();
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
        org.junit.Assert.assertNull(bytesReference6);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Filter filter4 = null;
        nestedInnerQueryParseSupport1.childFilter = filter4;
        org.apache.lucene.search.Filter filter6 = nestedInnerQueryParseSupport1.childFilter;
        org.apache.lucene.search.Filter filter7 = nestedInnerQueryParseSupport1.getchildFilter();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(filter6);
        org.junit.Assert.assertNull(filter7);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Filter filter4 = nestedInnerQueryParseSupport1.childFilter;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.Filter filter7 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter7);
        nestedInnerQueryParseSupport1.path = "object";
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = nestedInnerQueryParseSupport1.parentFilter;
        java.lang.String str12 = nestedInnerQueryParseSupport1.path;
        org.junit.Assert.assertNull(filter4);
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "object" + "'", str12, "object");
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.apache.lucene.search.Query query6 = null;
        nestedInnerQueryParseSupport1.innerFilter = query6;
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean9 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference10);
        org.apache.lucene.search.Filter filter12 = null;
        nestedInnerQueryParseSupport1.childFilter = filter12;
        org.apache.lucene.search.Query query14 = null;
        nestedInnerQueryParseSupport1.innerQuery = query14;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("nested");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        boolean boolean5 = nestedInnerQueryParseSupport1.getfilterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference7 = nestedInnerQueryParseSupport1.source;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(bytesReference7);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = nestedInnerQueryParseSupport1.getsource();
        boolean boolean7 = nestedInnerQueryParseSupport1.getqueryFound();
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        boolean boolean10 = nestedInnerQueryParseSupport1.filterParsed;
        nestedInnerQueryParseSupport1.filterFound = false;
        java.lang.String str13 = nestedInnerQueryParseSupport1.path;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter15 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter15;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(objectMapper14);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Filter filter4 = nestedInnerQueryParseSupport1.childFilter;
        java.lang.String str5 = nestedInnerQueryParseSupport1.path;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport1.getparentFilter();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(filter4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.innerFilter;
        nestedInnerQueryParseSupport1.setfilterFound(true);
        org.elasticsearch.index.query.QueryParseContext queryParseContext14 = nestedInnerQueryParseSupport1.parseContext;
        org.elasticsearch.common.bytes.BytesReference bytesReference15 = nestedInnerQueryParseSupport1.getsource();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(query11);
        org.junit.Assert.assertNull(queryParseContext14);
        org.junit.Assert.assertNull(bytesReference15);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper4;
        org.apache.lucene.search.Filter filter6 = nestedInnerQueryParseSupport1.childFilter;
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = nestedInnerQueryParseSupport1.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = nestedInnerQueryParseSupport1.getparentFilter();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(filter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter8);
        org.junit.Assert.assertNull(bitDocIdSetFilter9);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterParsed;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        boolean boolean4 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter7;
        java.lang.String str9 = nestedInnerQueryParseSupport1.path;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterParsed;
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.getqueryParsed();
        nestedInnerQueryParseSupport1.filterFound = false;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        boolean boolean4 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter6);
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.path = "";
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(queryParseContext8);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterParsed;
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.getfilterFound();
        nestedInnerQueryParseSupport1.setqueryFound(false);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter9);
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = null;
        nestedInnerQueryParseSupport1.source = bytesReference11;
        nestedInnerQueryParseSupport1.setfilterFound(true);
        boolean boolean15 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean16 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean10 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean12 = nestedInnerQueryParseSupport1.filterFound;
        nestedInnerQueryParseSupport1.queryParsed = false;
        org.apache.lucene.search.Query query15 = null;
        nestedInnerQueryParseSupport1.innerFilter = query15;
        boolean boolean17 = nestedInnerQueryParseSupport1.queryParsed;
        nestedInnerQueryParseSupport1.filterFound = false;
        org.elasticsearch.index.query.QueryParseContext queryParseContext20 = nestedInnerQueryParseSupport1.getparseContext();
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(queryParseContext20);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        boolean boolean4 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport1.innerFilter;
        boolean boolean7 = nestedInnerQueryParseSupport1.filterParsed;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper10;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(query6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterParsed;
        org.apache.lucene.search.Filter filter3 = nestedInnerQueryParseSupport1.childFilter;
        boolean boolean4 = nestedInnerQueryParseSupport1.filterParsed;
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport1.innerFilter = query5;
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper8;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound();
        java.lang.Class<?> wildcardClass11 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(filter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryParsed;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter9);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter11;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        nestedInnerQueryParseSupport1.setfilterFound(false);
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        nestedInnerQueryParseSupport1.setqueryFound(true);
        nestedInnerQueryParseSupport1.queryFound = true;
        org.apache.lucene.search.Filter filter13 = nestedInnerQueryParseSupport1.childFilter;
        org.apache.lucene.search.Query query14 = null;
        nestedInnerQueryParseSupport1.innerFilter = query14;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(filter13);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean10 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean12 = nestedInnerQueryParseSupport1.filterFound;
        java.lang.String str13 = nestedInnerQueryParseSupport1.path;
        org.apache.lucene.search.Query query14 = null;
        nestedInnerQueryParseSupport1.innerFilter = query14;
        org.elasticsearch.index.query.QueryParseContext queryParseContext16 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.path = "object";
        org.apache.lucene.search.Filter filter19 = nestedInnerQueryParseSupport1.childFilter;
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(queryParseContext16);
        org.junit.Assert.assertNull(filter19);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Filter filter4 = nestedInnerQueryParseSupport1.childFilter;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.Filter filter7 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter7);
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(filter4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = nestedInnerQueryParseSupport1.getsource();
        java.lang.String str11 = nestedInnerQueryParseSupport1.getPath();
        nestedInnerQueryParseSupport1.filterParsed = false;
        java.lang.String str14 = nestedInnerQueryParseSupport1.getPath();
        org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport1.innerQuery;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter18 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter18);
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(bytesReference10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(query15);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = nestedInnerQueryParseSupport1.getsource();
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = null;
        nestedInnerQueryParseSupport1.source = bytesReference11;
        nestedInnerQueryParseSupport1.queryFound = false;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.Filter filter17 = nestedInnerQueryParseSupport1.childFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter18 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter18);
        org.apache.lucene.search.Query query20 = null;
        nestedInnerQueryParseSupport1.innerFilter = query20;
        org.elasticsearch.common.bytes.BytesReference bytesReference22 = nestedInnerQueryParseSupport1.getsource();
        org.apache.lucene.search.Filter filter23 = nestedInnerQueryParseSupport1.childFilter;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass24 = filter23.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(bytesReference10);
        org.junit.Assert.assertNull(filter17);
        org.junit.Assert.assertNull(bytesReference22);
        org.junit.Assert.assertNull(filter23);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.query.QueryParseContext queryParseContext7 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = nestedInnerQueryParseSupport1.parentFilter;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(queryParseContext7);
        org.junit.Assert.assertNull(bitDocIdSetFilter8);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport1.getfilterFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter8;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper6;
        nestedInnerQueryParseSupport1.filterParsed = true;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter11;
        java.lang.String str13 = nestedInnerQueryParseSupport1.getPath();
        nestedInnerQueryParseSupport1.queryParsed = false;
        org.apache.lucene.search.Query query16 = nestedInnerQueryParseSupport1.getInnerFilter();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper17 = nestedInnerQueryParseSupport1.parentObjectMapper;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(query16);
        org.junit.Assert.assertNull(objectMapper17);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter5;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean12 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean13 = nestedInnerQueryParseSupport1.getqueryFound();
        nestedInnerQueryParseSupport1.setfilterFound(false);
        java.lang.String str16 = nestedInnerQueryParseSupport1.getPath();
        nestedInnerQueryParseSupport1.queryFound = false;
        boolean boolean19 = nestedInnerQueryParseSupport1.getqueryFound();
        nestedInnerQueryParseSupport1.queryFound = false;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.innerFilter;
        nestedInnerQueryParseSupport1.setfilterFound(true);
        org.elasticsearch.index.query.QueryParseContext queryParseContext14 = nestedInnerQueryParseSupport1.parseContext;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(query11);
        org.junit.Assert.assertNull(queryParseContext14);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Filter filter4 = nestedInnerQueryParseSupport1.childFilter;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.Filter filter7 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter7);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper9;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        boolean boolean12 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(filter4);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.elasticsearch.index.mapper.object.ObjectMapper.Nested nested0 = org.elasticsearch.index.mapper.object.ObjectMapper.Nested.NO;
        boolean boolean1 = nested0.isIncludeInParent();
        boolean boolean2 = nested0.isIncludeInParent();
        boolean boolean3 = nested0.isIncludeInRoot();
        boolean boolean4 = nested0.isNested();
        org.junit.Assert.assertNotNull(nested0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter9);
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = null;
        nestedInnerQueryParseSupport1.source = bytesReference11;
        nestedInnerQueryParseSupport1.setfilterFound(true);
        boolean boolean15 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean16 = nestedInnerQueryParseSupport1.getfilterFound();
        boolean boolean17 = nestedInnerQueryParseSupport1.filterParsed;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query18 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean10 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean12 = nestedInnerQueryParseSupport1.filterFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = nestedInnerQueryParseSupport1.parentFilter;
        boolean boolean14 = nestedInnerQueryParseSupport1.filterFound();
        nestedInnerQueryParseSupport1.queryFound = true;
        boolean boolean17 = nestedInnerQueryParseSupport1.getqueryParsed();
        boolean boolean18 = nestedInnerQueryParseSupport1.queryParsed;
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Filter filter4 = nestedInnerQueryParseSupport1.childFilter;
        java.lang.String str5 = nestedInnerQueryParseSupport1.path;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport1.getparentFilter();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.getqueryFound();
        org.apache.lucene.search.Query query9 = null;
        nestedInnerQueryParseSupport1.innerFilter = query9;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(filter4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper6;
        nestedInnerQueryParseSupport1.filterParsed = true;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter11;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.apache.lucene.search.Filter filter14 = nestedInnerQueryParseSupport1.getchildFilter();
        boolean boolean15 = nestedInnerQueryParseSupport1.getqueryParsed();
        boolean boolean16 = nestedInnerQueryParseSupport1.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper17 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper17;
        boolean boolean19 = nestedInnerQueryParseSupport1.filterParsed;
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertNull(filter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectMapper4);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = nestedInnerQueryParseSupport1.parentFilter;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(queryParseContext11);
        org.junit.Assert.assertNull(bitDocIdSetFilter12);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Filter filter4 = nestedInnerQueryParseSupport1.childFilter;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.Filter filter7 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter7);
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.index.query.QueryParseContext queryParseContext10 = nestedInnerQueryParseSupport1.parseContext;
        org.apache.lucene.search.Filter filter11 = null;
        nestedInnerQueryParseSupport1.childFilter = filter11;
        org.apache.lucene.search.Query query13 = null;
        nestedInnerQueryParseSupport1.innerFilter = query13;
        boolean boolean15 = nestedInnerQueryParseSupport1.getqueryFound();
        boolean boolean16 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter17 = nestedInnerQueryParseSupport1.parentFilter;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query18 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(filter4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(queryParseContext10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(bitDocIdSetFilter17);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = nestedInnerQueryParseSupport1.parentFilter;
        java.lang.String str13 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(queryParseContext11);
        org.junit.Assert.assertNull(bitDocIdSetFilter12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Filter filter4 = nestedInnerQueryParseSupport1.childFilter;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.elasticsearch.common.bytes.BytesReference bytesReference7 = null;
        nestedInnerQueryParseSupport1.source = bytesReference7;
        org.apache.lucene.search.Query query9 = null;
        nestedInnerQueryParseSupport1.innerFilter = query9;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(filter4);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Filter filter4 = nestedInnerQueryParseSupport1.childFilter;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        boolean boolean7 = nestedInnerQueryParseSupport1.getqueryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter8);
        boolean boolean10 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = null;
        nestedInnerQueryParseSupport1.source = bytesReference11;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.junit.Assert.assertNull(filter4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper9;
        org.apache.lucene.search.Query query11 = null;
        nestedInnerQueryParseSupport1.innerFilter = query11;
        java.lang.String str13 = nestedInnerQueryParseSupport1.getPath();
        nestedInnerQueryParseSupport1.setqueryFound(true);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean10 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper12;
        org.elasticsearch.index.query.QueryParseContext queryParseContext14 = nestedInnerQueryParseSupport1.getparseContext();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(queryParseContext14);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport1.getfilterFound();
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter9;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = nestedInnerQueryParseSupport1.getparentFilter();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.parentObjectMapper;
        java.lang.String str13 = nestedInnerQueryParseSupport1.path;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference15 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference15);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(objectMapper14);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.elasticsearch.index.query.QueryParseContext queryParseContext9 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.Filter filter10 = nestedInnerQueryParseSupport1.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper11;
        org.elasticsearch.index.query.QueryParseContext queryParseContext13 = nestedInnerQueryParseSupport1.getparseContext();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(queryParseContext9);
        org.junit.Assert.assertNull(filter10);
        org.junit.Assert.assertNull(queryParseContext13);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter3);
        org.elasticsearch.index.query.QueryParseContext queryParseContext5 = nestedInnerQueryParseSupport1.parseContext;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter6);
        boolean boolean8 = nestedInnerQueryParseSupport1.filterParsed;
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterParsed();
        nestedInnerQueryParseSupport1.filterFound = true;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(queryParseContext5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = nestedInnerQueryParseSupport1.getsource();
        nestedInnerQueryParseSupport1.path = "nested";
        nestedInnerQueryParseSupport1.path = "";
        org.apache.lucene.search.Filter filter9 = nestedInnerQueryParseSupport1.childFilter;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.Filter filter12 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter12);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference4);
        org.junit.Assert.assertNull(filter9);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter5;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper11;
        nestedInnerQueryParseSupport1.path = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.elasticsearch.index.query.QueryParseContext queryParseContext9 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.Filter filter10 = null;
        nestedInnerQueryParseSupport1.childFilter = filter10;
        boolean boolean12 = nestedInnerQueryParseSupport1.getfilterParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(queryParseContext9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper6;
        nestedInnerQueryParseSupport1.filterParsed = true;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.Query query11 = null;
        nestedInnerQueryParseSupport1.innerFilter = query11;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper6;
        nestedInnerQueryParseSupport1.filterParsed = true;
        org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport1.getInnerFilter();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(query10);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Filter filter4 = nestedInnerQueryParseSupport1.childFilter;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        boolean boolean7 = nestedInnerQueryParseSupport1.getqueryFound();
        nestedInnerQueryParseSupport1.queryParsed = false;
        java.lang.String str10 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(filter4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = null;
        nestedInnerQueryParseSupport1.source = bytesReference9;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter11);
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        boolean boolean15 = nestedInnerQueryParseSupport1.getfilterFound();
        org.apache.lucene.search.Query query16 = null;
        nestedInnerQueryParseSupport1.innerQuery = query16;
        boolean boolean18 = nestedInnerQueryParseSupport1.filterParsed;
        boolean boolean19 = nestedInnerQueryParseSupport1.getqueryParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query20 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterParsed;
        org.apache.lucene.search.Filter filter3 = nestedInnerQueryParseSupport1.childFilter;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport1.innerFilter = query4;
        nestedInnerQueryParseSupport1.path = "";
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.apache.lucene.search.Filter filter9 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter9);
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference11);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(filter3);
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport1.getParentObjectMapper();
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
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport1.getfilterFound();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter8;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("nested");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.elasticsearch.index.query.QueryParseContext queryParseContext9 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.Filter filter10 = null;
        nestedInnerQueryParseSupport1.childFilter = filter10;
        boolean boolean12 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean13 = nestedInnerQueryParseSupport1.getqueryParsed();
        boolean boolean14 = nestedInnerQueryParseSupport1.getfilterFound();
        org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport1.innerQuery;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(queryParseContext9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(query15);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryParsed;
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport1.innerFilter = query5;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper6;
        nestedInnerQueryParseSupport1.filterParsed = true;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter11;
        java.lang.String str13 = nestedInnerQueryParseSupport1.getPath();
        nestedInnerQueryParseSupport1.queryParsed = false;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query16 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.innerFilter;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport1.innerQuery = query10;
        nestedInnerQueryParseSupport1.queryFound = true;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(query9);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterParsed;
        org.apache.lucene.search.Filter filter3 = nestedInnerQueryParseSupport1.childFilter;
        nestedInnerQueryParseSupport1.filterFound = true;
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        org.apache.lucene.search.Filter filter7 = null;
        nestedInnerQueryParseSupport1.childFilter = filter7;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(filter3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter6;
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter5;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean12 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean13 = nestedInnerQueryParseSupport1.getqueryFound();
        nestedInnerQueryParseSupport1.setfilterFound(false);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter16 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter16);
        boolean boolean18 = nestedInnerQueryParseSupport1.queryFound;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = nestedInnerQueryParseSupport1.getsource();
        java.lang.String str11 = nestedInnerQueryParseSupport1.getPath();
        nestedInnerQueryParseSupport1.filterParsed = false;
        java.lang.String str14 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter16 = nestedInnerQueryParseSupport1.getparentFilter();
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(bytesReference10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(objectMapper15);
        org.junit.Assert.assertNull(bitDocIdSetFilter16);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterParsed;
        org.apache.lucene.search.Filter filter3 = nestedInnerQueryParseSupport1.childFilter;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport1.innerFilter = query4;
        nestedInnerQueryParseSupport1.path = "";
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.apache.lucene.search.Filter filter9 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter9);
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference11);
        org.apache.lucene.search.Filter filter13 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(filter3);
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport1.innerFilter = query10;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean10 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean12 = nestedInnerQueryParseSupport1.filterFound;
        java.lang.String str13 = nestedInnerQueryParseSupport1.path;
        org.apache.lucene.search.Query query14 = null;
        nestedInnerQueryParseSupport1.innerFilter = query14;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query16 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter5;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean12 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean13 = nestedInnerQueryParseSupport1.getqueryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = nestedInnerQueryParseSupport1.parentFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        boolean boolean16 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.apache.lucene.search.Query query17 = null;
        nestedInnerQueryParseSupport1.innerFilter = query17;
        java.lang.Class<?> wildcardClass19 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter14);
        org.junit.Assert.assertNull(objectMapper15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper5;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = nestedInnerQueryParseSupport1.getsource();
        java.lang.String str11 = nestedInnerQueryParseSupport1.getPath();
        nestedInnerQueryParseSupport1.filterParsed = false;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        nestedInnerQueryParseSupport1.queryParsed = false;
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(bytesReference10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(objectMapper14);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        boolean boolean6 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper7;
        nestedInnerQueryParseSupport1.setfilterParsed(false);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("object");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport1.source = bytesReference5;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport1.innerFilter;
        nestedInnerQueryParseSupport1.filterParsed = false;
        nestedInnerQueryParseSupport1.path = "nested";
        java.lang.String str12 = nestedInnerQueryParseSupport1.path;
        boolean boolean13 = nestedInnerQueryParseSupport1.filterParsed;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertNull(query7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "nested" + "'", str12, "nested");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper6;
        nestedInnerQueryParseSupport1.filterParsed = true;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter11;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.apache.lucene.search.Filter filter14 = nestedInnerQueryParseSupport1.getchildFilter();
        boolean boolean15 = nestedInnerQueryParseSupport1.getqueryParsed();
        boolean boolean16 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertNull(filter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport1.getparseContext();
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference12);
        boolean boolean14 = nestedInnerQueryParseSupport1.filterFound;
        nestedInnerQueryParseSupport1.filterFound = true;
        org.apache.lucene.search.Query query17 = null;
        nestedInnerQueryParseSupport1.innerFilter = query17;
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(queryParseContext11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport1.getparseContext();
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference12);
        org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport1.innerQuery;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query17 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(queryParseContext11);
        org.junit.Assert.assertNull(query14);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        java.lang.String str11 = nestedInnerQueryParseSupport1.getPath();
        org.apache.lucene.search.Filter filter12 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter12);
        org.apache.lucene.search.Filter filter14 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter14);
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        java.lang.String str11 = nestedInnerQueryParseSupport1.getPath();
        org.apache.lucene.search.Filter filter12 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter12);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = nestedInnerQueryParseSupport1.getsource();
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = null;
        nestedInnerQueryParseSupport1.source = bytesReference11;
        nestedInnerQueryParseSupport1.queryFound = false;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper17 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query18 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(bytesReference10);
        org.junit.Assert.assertNull(objectMapper17);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper6;
        nestedInnerQueryParseSupport1.filterParsed = true;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter11;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        boolean boolean15 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference16 = nestedInnerQueryParseSupport1.getsource();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(bytesReference16);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper6;
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.index.query.QueryParseContext queryParseContext9 = nestedInnerQueryParseSupport1.getparseContext();
        java.lang.String str10 = nestedInnerQueryParseSupport1.path;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(queryParseContext9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter6;
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterParsed();
        nestedInnerQueryParseSupport1.filterFound = true;
        java.lang.Class<?> wildcardClass11 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        nestedInnerQueryParseSupport1.setqueryFound(true);
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = nestedInnerQueryParseSupport1.getparentFilter();
        org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport1.innerFilter;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(bitDocIdSetFilter12);
        org.junit.Assert.assertNull(query13);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter6;
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = nestedInnerQueryParseSupport1.parseContext;
        org.elasticsearch.index.query.QueryParseContext queryParseContext9 = nestedInnerQueryParseSupport1.parseContext;
        org.junit.Assert.assertNull(queryParseContext8);
        org.junit.Assert.assertNull(queryParseContext9);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport1.innerFilter;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(query10);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = nestedInnerQueryParseSupport1.getsource();
        java.lang.String str11 = nestedInnerQueryParseSupport1.getPath();
        nestedInnerQueryParseSupport1.filterFound = false;
        boolean boolean14 = nestedInnerQueryParseSupport1.queryFound();
        nestedInnerQueryParseSupport1.queryParsed = false;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(bytesReference10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Filter filter4 = nestedInnerQueryParseSupport1.childFilter;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        nestedInnerQueryParseSupport1.queryFound = true;
        org.apache.lucene.search.Filter filter9 = null;
        nestedInnerQueryParseSupport1.childFilter = filter9;
        org.junit.Assert.assertNull(filter4);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        boolean boolean4 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper6;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter9);
        org.apache.lucene.search.Filter filter11 = nestedInnerQueryParseSupport1.getchildFilter();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        boolean boolean13 = nestedInnerQueryParseSupport1.filterFound;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(filter11);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.query.QueryParseContext queryParseContext7 = nestedInnerQueryParseSupport1.getparseContext();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = queryParseContext7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(queryParseContext7);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        boolean boolean4 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str6 = nestedInnerQueryParseSupport1.path;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter5;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean12 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean13 = nestedInnerQueryParseSupport1.getqueryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = nestedInnerQueryParseSupport1.parentFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        boolean boolean16 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.apache.lucene.search.Query query17 = null;
        nestedInnerQueryParseSupport1.innerFilter = query17;
        boolean boolean19 = nestedInnerQueryParseSupport1.queryFound;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter14);
        org.junit.Assert.assertNull(objectMapper15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean7 = nestedInnerQueryParseSupport1.filterParsed;
        nestedInnerQueryParseSupport1.filterParsed = true;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = nestedInnerQueryParseSupport1.getsource();
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = null;
        nestedInnerQueryParseSupport1.source = bytesReference11;
        nestedInnerQueryParseSupport1.queryFound = false;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.Filter filter17 = nestedInnerQueryParseSupport1.childFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter18 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter18);
        org.apache.lucene.search.Filter filter20 = nestedInnerQueryParseSupport1.getchildFilter();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query21 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(bytesReference10);
        org.junit.Assert.assertNull(filter17);
        org.junit.Assert.assertNull(filter20);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter6;
        org.apache.lucene.search.Filter filter8 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = nestedInnerQueryParseSupport1.getsource();
        nestedInnerQueryParseSupport1.path = "";
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport1.parentObjectMapper;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(bytesReference10);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertNull(objectMapper14);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter9);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = nestedInnerQueryParseSupport1.parentFilter;
        nestedInnerQueryParseSupport1.path = "nested";
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper6;
        nestedInnerQueryParseSupport1.filterParsed = true;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter11;
        boolean boolean13 = nestedInnerQueryParseSupport1.getqueryFound();
        org.apache.lucene.search.Query query14 = null;
        nestedInnerQueryParseSupport1.innerQuery = query14;
        org.apache.lucene.search.Filter filter16 = nestedInnerQueryParseSupport1.getchildFilter();
        org.apache.lucene.search.Query query17 = null;
        nestedInnerQueryParseSupport1.innerQuery = query17;
        boolean boolean19 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean20 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean21 = nestedInnerQueryParseSupport1.queryParsed;
        java.lang.String str22 = nestedInnerQueryParseSupport1.getPath();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(filter16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper4;
        boolean boolean6 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean7 = nestedInnerQueryParseSupport1.queryFound();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.common.bytes.BytesReference bytesReference7 = null;
        nestedInnerQueryParseSupport1.source = bytesReference7;
        nestedInnerQueryParseSupport1.path = "object";
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter5;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean12 = nestedInnerQueryParseSupport1.queryParsed;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        boolean boolean6 = nestedInnerQueryParseSupport1.getqueryParsed();
        boolean boolean7 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.apache.lucene.search.Filter filter9 = nestedInnerQueryParseSupport1.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.parentObjectMapper;
        boolean boolean11 = nestedInnerQueryParseSupport1.filterFound();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(filter9);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        boolean boolean5 = nestedInnerQueryParseSupport1.getfilterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.getfilterFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport1.parentFilter;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter9);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = nestedInnerQueryParseSupport1.parentFilter;
        nestedInnerQueryParseSupport1.setfilterFound(false);
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.elasticsearch.common.bytes.BytesReference bytesReference16 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference16);
        org.apache.lucene.search.Query query18 = null;
        nestedInnerQueryParseSupport1.innerQuery = query18;
        java.lang.Class<?> wildcardClass20 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.elasticsearch.index.query.QueryParseContext queryParseContext9 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.Filter filter10 = null;
        nestedInnerQueryParseSupport1.childFilter = filter10;
        org.apache.lucene.search.Query query12 = null;
        nestedInnerQueryParseSupport1.innerFilter = query12;
        boolean boolean14 = nestedInnerQueryParseSupport1.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(queryParseContext9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Filter filter4 = nestedInnerQueryParseSupport1.childFilter;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.Filter filter7 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter7);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper9;
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = null;
        nestedInnerQueryParseSupport1.source = bytesReference11;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter13);
        org.apache.lucene.search.Filter filter15 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter15);
        org.elasticsearch.common.bytes.BytesReference bytesReference17 = null;
        nestedInnerQueryParseSupport1.source = bytesReference17;
        org.apache.lucene.search.Filter filter19 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter19);
        java.lang.Class<?> wildcardClass21 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(filter4);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        boolean boolean5 = nestedInnerQueryParseSupport1.queryFound();
        org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport1.getInnerFilter();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(query6);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean10 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean12 = nestedInnerQueryParseSupport1.filterFound;
        java.lang.String str13 = nestedInnerQueryParseSupport1.path;
        org.apache.lucene.search.Query query14 = null;
        nestedInnerQueryParseSupport1.innerFilter = query14;
        org.elasticsearch.index.query.QueryParseContext queryParseContext16 = nestedInnerQueryParseSupport1.getparseContext();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query17 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(queryParseContext16);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.apache.lucene.search.Query query6 = null;
        nestedInnerQueryParseSupport1.innerFilter = query6;
        boolean boolean8 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.query.QueryParseContext queryParseContext9 = nestedInnerQueryParseSupport1.parseContext;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(queryParseContext9);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport1.getparseContext();
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = nestedInnerQueryParseSupport1.getsource();
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = nestedInnerQueryParseSupport1.getsource();
        boolean boolean14 = nestedInnerQueryParseSupport1.queryParsed;
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        org.apache.lucene.search.Filter filter17 = null;
        nestedInnerQueryParseSupport1.childFilter = filter17;
        org.apache.lucene.search.Query query19 = nestedInnerQueryParseSupport1.innerQuery;
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(queryParseContext11);
        org.junit.Assert.assertNull(bytesReference12);
        org.junit.Assert.assertNull(bytesReference13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(query19);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter6;
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterParsed();
        boolean boolean9 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper11;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter9);
        org.apache.lucene.search.Filter filter11 = nestedInnerQueryParseSupport1.getchildFilter();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = nestedInnerQueryParseSupport1.getparentFilter();
        org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport1.innerQuery;
        boolean boolean15 = nestedInnerQueryParseSupport1.filterParsed;
        java.lang.Class<?> wildcardClass16 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(filter11);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertNull(bitDocIdSetFilter13);
        org.junit.Assert.assertNull(query14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter9);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = nestedInnerQueryParseSupport1.parentFilter;
        nestedInnerQueryParseSupport1.setfilterFound(false);
        nestedInnerQueryParseSupport1.setqueryFound(true);
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter9);
        org.apache.lucene.search.Filter filter11 = nestedInnerQueryParseSupport1.getchildFilter();
        org.apache.lucene.search.Query query12 = null;
        nestedInnerQueryParseSupport1.innerFilter = query12;
        org.elasticsearch.common.bytes.BytesReference bytesReference14 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference14);
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(filter11);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterParsed;
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.getfilterFound();
        nestedInnerQueryParseSupport1.setqueryFound(false);
        java.lang.Class<?> wildcardClass7 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean7 = nestedInnerQueryParseSupport1.filterFound();
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        boolean boolean10 = nestedInnerQueryParseSupport1.getqueryFound();
        nestedInnerQueryParseSupport1.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = nestedInnerQueryParseSupport1.parentFilter;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter13);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Filter filter4 = nestedInnerQueryParseSupport1.childFilter;
        boolean boolean5 = nestedInnerQueryParseSupport1.getqueryFound();
        java.lang.String str6 = nestedInnerQueryParseSupport1.path;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport1.innerFilter;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(filter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(query7);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.innerFilter;
        nestedInnerQueryParseSupport1.setfilterFound(true);
        org.elasticsearch.index.query.QueryParseContext queryParseContext14 = nestedInnerQueryParseSupport1.parseContext;
        boolean boolean15 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper16 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = objectMapper16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(query11);
        org.junit.Assert.assertNull(queryParseContext14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(objectMapper16);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper6;
        nestedInnerQueryParseSupport1.filterParsed = true;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter11;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        boolean boolean14 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean15 = nestedInnerQueryParseSupport1.queryFound;
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterParsed;
        boolean boolean3 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport1.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport1.getqueryFound();
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        boolean boolean9 = nestedInnerQueryParseSupport1.getqueryFound();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Filter filter4 = nestedInnerQueryParseSupport1.childFilter;
        java.lang.String str5 = nestedInnerQueryParseSupport1.path;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport1.getparentFilter();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.apache.lucene.search.Query query9 = null;
        nestedInnerQueryParseSupport1.innerFilter = query9;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(filter4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        boolean boolean4 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str7 = nestedInnerQueryParseSupport1.path;
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound;
        org.apache.lucene.search.Filter filter9 = nestedInnerQueryParseSupport1.getchildFilter();
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = nestedInnerQueryParseSupport1.source;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(filter9);
        org.junit.Assert.assertNull(bytesReference10);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport1.getparseContext();
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference12);
        org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport1.innerQuery;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        org.elasticsearch.common.bytes.BytesReference bytesReference17 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference17);
        org.elasticsearch.common.bytes.BytesReference bytesReference19 = nestedInnerQueryParseSupport1.getsource();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query20 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(queryParseContext11);
        org.junit.Assert.assertNull(query14);
        org.junit.Assert.assertNull(bytesReference19);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        boolean boolean6 = nestedInnerQueryParseSupport1.getqueryParsed();
        boolean boolean7 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = nestedInnerQueryParseSupport1.getsource();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(bytesReference10);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        boolean boolean4 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str7 = nestedInnerQueryParseSupport1.path;
        org.apache.lucene.search.Filter filter8 = nestedInnerQueryParseSupport1.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.parentObjectMapper;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(filter8);
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = nestedInnerQueryParseSupport1.getsource();
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = nestedInnerQueryParseSupport1.getsource();
        nestedInnerQueryParseSupport1.filterFound = true;
        java.lang.String str14 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(bytesReference10);
        org.junit.Assert.assertNull(bytesReference11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(objectMapper15);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = nestedInnerQueryParseSupport1.getsource();
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport1.innerFilter;
        boolean boolean6 = nestedInnerQueryParseSupport1.filterParsed;
        boolean boolean7 = nestedInnerQueryParseSupport1.getqueryFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference4);
        org.junit.Assert.assertNull(query5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        boolean boolean4 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter6);
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = nestedInnerQueryParseSupport1.getparseContext();
        boolean boolean9 = nestedInnerQueryParseSupport1.filterParsed;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(queryParseContext8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterParsed;
        org.apache.lucene.search.Filter filter3 = nestedInnerQueryParseSupport1.childFilter;
        nestedInnerQueryParseSupport1.filterFound = true;
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.parentObjectMapper;
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound;
        boolean boolean9 = nestedInnerQueryParseSupport1.filterParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter10;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(filter3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport1.getfilterFound();
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter9;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = nestedInnerQueryParseSupport1.getparentFilter();
        boolean boolean12 = nestedInnerQueryParseSupport1.queryFound();
        org.apache.lucene.search.Filter filter13 = nestedInnerQueryParseSupport1.getchildFilter();
        nestedInnerQueryParseSupport1.setfilterFound(true);
        org.elasticsearch.common.bytes.BytesReference bytesReference16 = null;
        nestedInnerQueryParseSupport1.source = bytesReference16;
        java.lang.Class<?> wildcardClass18 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(filter13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport1.getparseContext();
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference12);
        org.apache.lucene.search.Filter filter14 = nestedInnerQueryParseSupport1.childFilter;
        nestedInnerQueryParseSupport1.filterParsed = true;
        nestedInnerQueryParseSupport1.queryFound = false;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(queryParseContext11);
        org.junit.Assert.assertNull(filter14);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter3);
        org.elasticsearch.index.query.QueryParseContext queryParseContext5 = nestedInnerQueryParseSupport1.parseContext;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter6);
        boolean boolean8 = nestedInnerQueryParseSupport1.filterParsed;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(queryParseContext5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = nestedInnerQueryParseSupport1.getsource();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        nestedInnerQueryParseSupport1.filterFound = true;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference4);
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper10;
        org.elasticsearch.index.query.QueryParseContext queryParseContext12 = nestedInnerQueryParseSupport1.parseContext;
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference13);
        java.lang.Class<?> wildcardClass15 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(query9);
        org.junit.Assert.assertNull(queryParseContext12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = nestedInnerQueryParseSupport1.getsource();
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = null;
        nestedInnerQueryParseSupport1.source = bytesReference11;
        nestedInnerQueryParseSupport1.queryFound = false;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper17 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean18 = nestedInnerQueryParseSupport1.getqueryParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query19 = nestedInnerQueryParseSupport1.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(bytesReference10);
        org.junit.Assert.assertNull(objectMapper17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Filter filter4 = null;
        nestedInnerQueryParseSupport1.childFilter = filter4;
        org.apache.lucene.search.Filter filter6 = nestedInnerQueryParseSupport1.childFilter;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(filter6);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        org.apache.lucene.search.Filter filter4 = nestedInnerQueryParseSupport1.childFilter;
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.Filter filter7 = null;
        nestedInnerQueryParseSupport1.setchildFilter(filter7);
        nestedInnerQueryParseSupport1.path = "object";
        nestedInnerQueryParseSupport1.filterParsed = true;
        boolean boolean13 = nestedInnerQueryParseSupport1.queryParsed;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(filter4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("object");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter3);
        org.elasticsearch.index.query.QueryParseContext queryParseContext5 = nestedInnerQueryParseSupport1.parseContext;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.query();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(queryParseContext5);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        boolean boolean5 = nestedInnerQueryParseSupport1.getfilterFound();
        boolean boolean6 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport1.getfilterParsed();
        nestedInnerQueryParseSupport1.filterFound = false;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        boolean boolean12 = nestedInnerQueryParseSupport1.getqueryFound();
        java.lang.Class<?> wildcardClass13 = nestedInnerQueryParseSupport1.getClass();
        org.junit.Assert.assertNull(objectMapper4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport1.getparseContext();
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = nestedInnerQueryParseSupport1.getsource();
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = nestedInnerQueryParseSupport1.getsource();
        boolean boolean14 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean15 = nestedInnerQueryParseSupport1.filterFound();
        nestedInnerQueryParseSupport1.queryParsed = false;
        org.apache.lucene.search.Query query18 = nestedInnerQueryParseSupport1.innerFilter;
        boolean boolean19 = nestedInnerQueryParseSupport1.getfilterFound();
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(queryParseContext11);
        org.junit.Assert.assertNull(bytesReference12);
        org.junit.Assert.assertNull(bytesReference13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(query18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = nestedInnerQueryParseSupport1.getsource();
        java.lang.String str11 = nestedInnerQueryParseSupport1.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.getNestedObjectMapper();
        nestedInnerQueryParseSupport1.setfilterFound(true);
        org.elasticsearch.common.bytes.BytesReference bytesReference15 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference15);
        org.apache.lucene.search.Query query17 = nestedInnerQueryParseSupport1.innerQuery;
        nestedInnerQueryParseSupport1.setfilterFound(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query20 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(bytesReference10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertNull(query17);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        boolean boolean6 = nestedInnerQueryParseSupport1.getqueryParsed();
        boolean boolean7 = nestedInnerQueryParseSupport1.getqueryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = nestedInnerQueryParseSupport1.getsource();
        boolean boolean11 = nestedInnerQueryParseSupport1.getqueryFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertNull(bytesReference10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryFound = true;
        org.elasticsearch.index.query.QueryParseContext queryParseContext9 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.Filter filter10 = nestedInnerQueryParseSupport1.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper11;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper13;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(queryParseContext9);
        org.junit.Assert.assertNull(filter10);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport1.innerFilter;
        nestedInnerQueryParseSupport1.setfilterFound(true);
        org.elasticsearch.index.query.QueryParseContext queryParseContext14 = nestedInnerQueryParseSupport1.parseContext;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(query11);
        org.junit.Assert.assertNull(queryParseContext14);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        boolean boolean4 = nestedInnerQueryParseSupport1.getfilterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        java.lang.String str6 = nestedInnerQueryParseSupport1.getPath();
        java.lang.String str7 = nestedInnerQueryParseSupport1.path;
        boolean boolean8 = nestedInnerQueryParseSupport1.filterFound;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(objectMapper5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = nestedInnerQueryParseSupport1.getsource();
        nestedInnerQueryParseSupport1.path = "nested";
        nestedInnerQueryParseSupport1.path = "";
        org.apache.lucene.search.Filter filter9 = nestedInnerQueryParseSupport1.childFilter;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference4);
        org.junit.Assert.assertNull(filter9);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport1.getfilterFound();
        nestedInnerQueryParseSupport1.setqueryFound(true);
        nestedInnerQueryParseSupport1.path = "hi!";
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter11;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper6;
        nestedInnerQueryParseSupport1.filterParsed = true;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter11;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.apache.lucene.search.Filter filter14 = nestedInnerQueryParseSupport1.getchildFilter();
        boolean boolean15 = nestedInnerQueryParseSupport1.getqueryParsed();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper16 = null;
        nestedInnerQueryParseSupport1.nestedObjectMapper = objectMapper16;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query18 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertNull(filter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        nestedInnerQueryParseSupport1.setfilterParsed(true);
        nestedInnerQueryParseSupport1.filterFound = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter6);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objectMapper8);
        org.junit.Assert.assertNull(objectMapper9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        boolean boolean9 = nestedInnerQueryParseSupport1.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = nestedInnerQueryParseSupport1.getsource();
        java.lang.String str11 = nestedInnerQueryParseSupport1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(bytesReference10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        boolean boolean4 = nestedInnerQueryParseSupport1.queryParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter5;
        nestedInnerQueryParseSupport1.setqueryParsed(true);
        boolean boolean9 = nestedInnerQueryParseSupport1.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport1.getParentObjectMapper();
        boolean boolean12 = nestedInnerQueryParseSupport1.queryParsed;
        boolean boolean13 = nestedInnerQueryParseSupport1.getqueryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = nestedInnerQueryParseSupport1.parentFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = nestedInnerQueryParseSupport1.nestedObjectMapper;
        boolean boolean16 = nestedInnerQueryParseSupport1.getfilterParsed();
        org.apache.lucene.search.Query query17 = null;
        nestedInnerQueryParseSupport1.innerFilter = query17;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectMapper10);
        org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter14);
        org.junit.Assert.assertNull(objectMapper15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport1.getparseContext();
        nestedInnerQueryParseSupport1.setqueryParsed(false);
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = nestedInnerQueryParseSupport1.parentFilter;
        nestedInnerQueryParseSupport1.queryParsed = false;
        nestedInnerQueryParseSupport1.filterFound = false;
        org.junit.Assert.assertNull(queryParseContext6);
        org.junit.Assert.assertNull(queryParseContext11);
        org.junit.Assert.assertNull(bitDocIdSetFilter12);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterParsed;
        org.apache.lucene.search.Filter filter3 = nestedInnerQueryParseSupport1.childFilter;
        nestedInnerQueryParseSupport1.filterFound = true;
        boolean boolean6 = nestedInnerQueryParseSupport1.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport1.parentObjectMapper;
        boolean boolean8 = nestedInnerQueryParseSupport1.filterParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext9 = nestedInnerQueryParseSupport1.parseContext;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(filter3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectMapper7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(queryParseContext9);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        boolean boolean2 = nestedInnerQueryParseSupport1.filterParsed;
        org.apache.lucene.search.Filter filter3 = nestedInnerQueryParseSupport1.childFilter;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport1.innerFilter = query4;
        nestedInnerQueryParseSupport1.path = "";
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(filter3);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport1.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport1.getfilterFound();
        nestedInnerQueryParseSupport1.setqueryFound(true);
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter9;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = nestedInnerQueryParseSupport1.getparentFilter();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport1.parentObjectMapper;
        java.lang.String str13 = nestedInnerQueryParseSupport1.path;
        nestedInnerQueryParseSupport1.path = "object";
        nestedInnerQueryParseSupport1.setqueryFound(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query18 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
        org.junit.Assert.assertNull(objectMapper12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = nestedInnerQueryParseSupport1.getparseContext();
        org.apache.lucene.search.Filter filter3 = nestedInnerQueryParseSupport1.childFilter;
        nestedInnerQueryParseSupport1.queryFound = false;
        org.apache.lucene.search.Filter filter6 = nestedInnerQueryParseSupport1.childFilter;
        // The following exception was thrown during execution in test generation
        try {
// flaky:             nestedInnerQueryParseSupport1.filter();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(queryParseContext2);
        org.junit.Assert.assertNull(filter3);
        org.junit.Assert.assertNull(filter6);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport1.innerFilter = query2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = nestedInnerQueryParseSupport1.getsource();
        nestedInnerQueryParseSupport1.path = "nested";
        nestedInnerQueryParseSupport1.path = "";
        org.apache.lucene.search.Filter filter9 = nestedInnerQueryParseSupport1.childFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport1.setparentFilter(bitDocIdSetFilter10);
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = null;
        nestedInnerQueryParseSupport1.setsource(bytesReference12);
        boolean boolean14 = nestedInnerQueryParseSupport1.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = nestedInnerQueryParseSupport1.parentObjectMapper;
        org.elasticsearch.index.query.QueryParseContext queryParseContext16 = nestedInnerQueryParseSupport1.parseContext;
        nestedInnerQueryParseSupport1.queryParsed = false;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport1.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bytesReference4);
        org.junit.Assert.assertNull(filter9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(objectMapper15);
        org.junit.Assert.assertNull(queryParseContext16);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.elasticsearch.index.query.QueryParseContext queryParseContext0 = null;
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport1 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport(queryParseContext0);
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport1.source = bytesReference2;
        nestedInnerQueryParseSupport1.setqueryFound(false);
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport1.parentObjectMapper = objectMapper6;
        nestedInnerQueryParseSupport1.filterParsed = true;
        boolean boolean10 = nestedInnerQueryParseSupport1.queryFound;
        boolean boolean11 = nestedInnerQueryParseSupport1.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = null;
        nestedInnerQueryParseSupport1.parentFilter = bitDocIdSetFilter12;
        nestedInnerQueryParseSupport1.filterFound = false;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query16 = nestedInnerQueryParseSupport1.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }
}
