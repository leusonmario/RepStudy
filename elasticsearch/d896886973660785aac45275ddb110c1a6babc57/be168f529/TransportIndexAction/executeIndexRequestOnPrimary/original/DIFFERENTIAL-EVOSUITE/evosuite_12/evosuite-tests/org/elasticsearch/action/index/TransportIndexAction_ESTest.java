/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 05 09:58:48 GMT 2021
 */

package org.elasticsearch.action.index;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.elasticsearch.action.index.IndexRequest;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TransportIndexAction_ESTest extends TransportIndexAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IndexRequest indexRequest0 = new IndexRequest("", (String) null);
      // EXCEPTION DIFF:
      // Different Exceptions were thrown:
      // Original Version:
      //     org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException : Unknown value for refresh: [MUST_NOT].
      // Modified Version:
      //     java.lang.IllegalArgumentException : object is not an instance of declaring class
      // Undeclared exception!
      try { 
        indexRequest0.setRefreshPolicy("MUST_NOT");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown value for refresh: [MUST_NOT].
         //
         verifyException("org.elasticsearch.action.support.WriteRequest$RefreshPolicy", e);
         assertTrue(e.getMessage().equals("Unknown value for refresh: [MUST_NOT]."));   
      }
  }
}
