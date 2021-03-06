/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 06 21:58:13 GMT 2021
 */

package org.elasticsearch.river.mongodb;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.node.internal.InternalNode;
import org.elasticsearch.node.settings.NodeSettingsService;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Indexer_ESTest extends Indexer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Settings settings0 = NodeSettingsService.getGlobalSettings();
      // EXCEPTION DIFF:
      // Different Exceptions were thrown:
      // Original Version:
      //     org.elasticsearch.common.util.concurrent.UncheckedExecutionException : org.evosuite.runtime.mock.java.lang.MockThrowable: org.evosuite.runtime.TooManyResourcesException: Loop has been executed more times than the allowed 10000
      // Modified Version:
      //     org.elasticsearch.common.util.concurrent.UncheckedExecutionException : org.evosuite.runtime.TooManyResourcesException: Loop has been executed more times than the allowed 10000
      InternalNode internalNode0 = null;
      try {
        internalNode0 = new InternalNode(settings0, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: org.evosuite.runtime.TooManyResourcesException: Loop has been executed more times than the allowed 10000
         //
         verifyException("org.elasticsearch.common.cache.LocalCache$Segment", e);
         assertTrue(e.getMessage().equals("org.evosuite.runtime.mock.java.lang.MockThrowable: org.evosuite.runtime.TooManyResourcesException: Loop has been executed more times than the allowed 10000"));   
      }
  }
}
