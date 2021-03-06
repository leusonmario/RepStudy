/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 05 00:25:51 GMT 2021
 */

package org.springframework.boot.autoconfigure.logging;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport;
import org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AutoConfigurationReportLoggingInitializer_ESTest extends AutoConfigurationReportLoggingInitializer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AutoConfigurationReportLoggingInitializer autoConfigurationReportLoggingInitializer0 = new AutoConfigurationReportLoggingInitializer();
      // Undeclared exception!
      try { 
        autoConfigurationReportLoggingInitializer0.getLogMessage((ConditionEvaluationReport) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.springframework.boot.autoconfigure.logging.AutoConfigurationReportLoggingInitializer", e);
      }
  }
}
