/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 01 18:25:19 GMT 2021
 */

package fitnesse.testsystems.slim.tables;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import fitnesse.testsystems.slim.tables.ScenarioTable;
import fitnesse.testsystems.slim.tables.SlimTableFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SlimTableFactory_ESTest extends SlimTableFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      Class<ScenarioTable> class0 = ScenarioTable.class;
      // EXCEPTION DIFF:
      // The modified version did not exhibit this exception:
      //     org.evosuite.runtime.mock.java.lang.MockIllegalStateException : A table type named 'dynamic decision:' already exists
      // Undeclared exception!
      try { 
        slimTableFactory0.addTableType("dynamic decision:", class0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // A table type named 'dynamic decision:' already exists
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactory", e);
         assertTrue(e.getMessage().equals("A table type named 'dynamic decision:' already exists"));   
      }
  }
}
