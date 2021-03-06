/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 09 02:38:55 GMT 2021
 */

package com.thinkaurelius.titan.graphdb.database.serialize;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.thinkaurelius.titan.diskstorage.util.ReadArrayBuffer;
import com.thinkaurelius.titan.graphdb.database.serialize.attribute.StringSerializer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SerializerInitialization_ESTest extends SerializerInitialization_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StringSerializer stringSerializer0 = new StringSerializer();
      byte[] byteArray0 = new byte[6];
      byteArray0[1] = (byte)43;
      byteArray0[2] = (byte)46;
      byteArray0[5] = (byte)99;
      ReadArrayBuffer readArrayBuffer0 = new ReadArrayBuffer(byteArray0);
      // EXCEPTION DIFF:
      // Different Exceptions were thrown:
      // Original Version:
      //     java.lang.ArrayIndexOutOfBoundsException : 6
      // Modified Version:
      //     org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException : BufferOverflow: Position 8 - Limit 6
      // Undeclared exception!
      try { 
        stringSerializer0.read(readArrayBuffer0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("com.thinkaurelius.titan.diskstorage.util.StaticArrayBuffer", e);
         assertTrue(e.getMessage().equals("6"));   
      }
  }
}
