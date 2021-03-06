/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 06 11:29:53 GMT 2021
 */

package org.elasticsearch.cluster.metadata;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.elasticsearch.cluster.routing.allocation.decider.AwarenessAllocationDecider;
import org.elasticsearch.common.settings.Settings;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MetaDataCreateIndexService_ESTest extends MetaDataCreateIndexService_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Settings settings0 = Settings.Builder.EMPTY_SETTINGS;
      // EXCEPTION DIFF:
      // Different Exceptions were thrown:
      // Original Version:
      //     org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException : illegal settings key: [org.elasticsearch.common.settings.Setting$SimpleKey@0000000011]
      // Modified Version:
      //     org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException : illegal settings key: [org.elasticsearch.common.settings.Setting$GroupKey@0000000011]
      AwarenessAllocationDecider awarenessAllocationDecider0 = null;
      try {
        awarenessAllocationDecider0 = new AwarenessAllocationDecider(settings0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // illegal settings key: [org.elasticsearch.common.settings.Setting$SimpleKey@0000000007]
         //
         verifyException("org.elasticsearch.common.settings.AbstractScopedSettings", e);
         assertTrue(e.getMessage().equals("illegal settings key: [org.elasticsearch.common.settings.Setting$SimpleKey@0000000007]"));   
      }
  }
}
