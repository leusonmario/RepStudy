/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 06 21:08:12 GMT 2021
 */

package org.elasticsearch.river.mongodb;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.LinkedHashSet;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.io.stream.StreamInput;
import org.elasticsearch.common.settings.ImmutableSettings;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.env.Environment;
import org.elasticsearch.river.RiverName;
import org.elasticsearch.river.RiverSettings;
import org.elasticsearch.river.mongodb.Indexer;
import org.elasticsearch.river.mongodb.MongoDBRiver;
import org.elasticsearch.river.mongodb.MongoDBRiverDefinition;
import org.elasticsearch.river.mongodb.SharedContext;
import org.elasticsearch.script.ScriptEngineService;
import org.elasticsearch.script.ScriptService;
import org.elasticsearch.watcher.ResourceWatcherService;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Indexer_ESTest extends Indexer_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test0()  throws Throwable  {
      String string0 = "l]_kX]";
      String string1 = "yY%edcs";
      RiverName riverName0 = new RiverName(string0, string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertEquals("l]_kX]", riverName0.type());
      assertEquals("yY%edcs", riverName0.name());
      assertEquals("l]_kX]", riverName0.getType());
      assertEquals("yY%edcs", riverName0.getName());
      assertNotNull(riverName0);
      
      StreamInput streamInput0 = null;
      // Undeclared exception!
      try { 
        ImmutableSettings.readSettingsFromStream(streamInput0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.common.settings.ImmutableSettings", e);
      }
  }
}
