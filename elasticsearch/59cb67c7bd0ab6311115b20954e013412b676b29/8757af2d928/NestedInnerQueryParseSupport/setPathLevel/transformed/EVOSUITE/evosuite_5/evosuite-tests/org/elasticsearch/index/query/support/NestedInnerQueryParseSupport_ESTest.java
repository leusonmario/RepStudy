/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 29 20:22:19 GMT 2021
 */

package org.elasticsearch.index.query.support;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.lucene.search.join.BitDocIdSetFilter;
import org.elasticsearch.common.bytes.BytesReference;
import org.elasticsearch.common.xcontent.XContentParser;
import org.elasticsearch.index.query.QueryShardContext;
import org.elasticsearch.index.query.support.NestedInnerQueryParseSupport;
import org.elasticsearch.index.translog.Translog;
import org.elasticsearch.search.internal.SearchContext;
import org.elasticsearch.search.internal.SubSearchContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NestedInnerQueryParseSupport_ESTest extends NestedInnerQueryParseSupport_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test0()  throws Throwable  {
      QueryShardContext queryShardContext0 = null;
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = null;
      try {
        nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport(queryShardContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.support.NestedInnerQueryParseSupport", e);
      }
  }

  @Test(timeout = 11000)
  public void test1()  throws Throwable  {
      XContentParser xContentParser0 = null;
      SearchContext searchContext0 = SearchContext.current();
      assertNull(searchContext0);
      
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = null;
      try {
        nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport(xContentParser0, searchContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.support.NestedInnerQueryParseSupport", e);
      }
  }

  @Test(timeout = 11000)
  public void test2()  throws Throwable  {
      QueryShardContext queryShardContext0 = null;
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = null;
      try {
        nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport(queryShardContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.support.NestedInnerQueryParseSupport", e);
      }
  }

  @Test(timeout = 11000)
  public void test3()  throws Throwable  {
      XContentParser xContentParser0 = null;
      SearchContext searchContext0 = null;
      SubSearchContext subSearchContext0 = new SubSearchContext(searchContext0);
      assertEquals(0, subSearchContext0.from());
      assertFalse(subSearchContext0.explain());
      assertFalse(subSearchContext0.version());
      assertFalse(subSearchContext0.hasFieldNames());
      assertFalse(subSearchContext0.trackScores());
      assertEquals(0, subSearchContext0.docIdsToLoadSize());
      assertEquals(0, subSearchContext0.docIdsToLoadFrom());
      assertFalse(subSearchContext0.nowInMillisUsed());
      assertEquals(3, subSearchContext0.size());
      assertFalse(subSearchContext0.sourceRequested());
      assertFalse(subSearchContext0.hasFetchSourceContext());
      assertFalse(subSearchContext0.hasScriptFields());
      assertNotNull(subSearchContext0);
      assertEquals(0, SearchContext.DEFAULT_TERMINATE_AFTER);
      
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = null;
      try {
        nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport(xContentParser0, subSearchContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.search.internal.FilteredSearchContext", e);
      }
  }

  @Test(timeout = 11000)
  public void test4()  throws Throwable  {
      XContentParser xContentParser0 = null;
      SearchContext searchContext0 = SearchContext.current();
      assertNull(searchContext0);
      
      QueryShardContext queryShardContext0 = null;
      NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = null;
      try {
        nestedInnerQueryParseSupport0 = new NestedInnerQueryParseSupport(queryShardContext0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.index.query.support.NestedInnerQueryParseSupport", e);
      }
  }
}
