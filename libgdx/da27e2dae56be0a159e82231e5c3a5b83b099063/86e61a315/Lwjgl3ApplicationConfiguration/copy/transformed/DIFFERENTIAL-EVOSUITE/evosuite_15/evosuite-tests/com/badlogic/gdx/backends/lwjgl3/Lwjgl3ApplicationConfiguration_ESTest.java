/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 09 01:48:36 GMT 2021
 */

package com.badlogic.gdx.backends.lwjgl3;

import org.junit.Test;
import static org.junit.Assert.*;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Lwjgl3ApplicationConfiguration_ESTest extends Lwjgl3ApplicationConfiguration_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new Lwjgl3ApplicationConfiguration();
      // EXCEPTION DIFF:
      // The original version did not exhibit this exception:
      //     java.lang.IllegalArgumentException : object is not an instance of declaring class
      lwjgl3ApplicationConfiguration0.getwindowMinWidth();
  }
}
