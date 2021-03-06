/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 05 21:07:26 GMT 2021
 */

package org.elasticsearch.action.support.replication;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.elasticsearch.action.support.replication.TransportReplicationAction;
import org.elasticsearch.action.support.replication.TransportReplicationActionTests;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TransportReplicationAction_ESTest extends TransportReplicationAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // EXCEPTION DIFF:
      // The original version did not exhibit this exception:
      //     java.lang.IncompatibleClassChangeError : org.elasticsearch.action.support.replication.TransportReplicationAction and org.elasticsearch.action.support.replication.TransportReplicationAction$ReplicaResponse disagree on InnerClasses attribute
      TransportReplicationAction.ReplicaResponse transportReplicationAction_ReplicaResponse0 = new TransportReplicationAction.ReplicaResponse("unexpected error during the primary phase for action [{}], request [{}]", 0L);
      // EXCEPTION DIFF:
      // The modified version did not exhibit this exception:
      //     java.lang.NoClassDefFoundError : Could not initialize class org.elasticsearch.action.support.replication.TransportReplicationActionTests
      TransportReplicationActionTests transportReplicationActionTests0 = null;
      try {
        transportReplicationActionTests0 = new TransportReplicationActionTests();
       //  fail("Expecting exception: NoClassDefFoundError");
       // Unstable assertion
      } catch(NoClassDefFoundError e) {
         assertTrue(e.getMessage().equals("Could not initialize class org.elasticsearch.action.support.replication.TransportReplicationActionTests"));   
      }
  }
}
