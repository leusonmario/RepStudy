/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 06 19:25:22 GMT 2021
 */

package org.elasticsearch.river.mongodb;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.jackson.core.JsonParser;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.common.xcontent.cbor.CborXContentParser;
import org.elasticsearch.common.xcontent.support.AbstractXContentParser;
import org.elasticsearch.node.settings.NodeSettingsService;
import org.elasticsearch.river.RiverName;
import org.elasticsearch.river.RiverSettings;
import org.elasticsearch.river.mongodb.Indexer;
import org.elasticsearch.river.mongodb.MongoDBRiver;
import org.elasticsearch.river.mongodb.MongoDBRiverDefinition;
import org.elasticsearch.river.mongodb.SharedContext;
import org.elasticsearch.river.mongodb.Status;
import org.elasticsearch.script.ScriptService;
import org.elasticsearch.search.aggregations.metrics.tophits.TopHitsContext;
import org.elasticsearch.search.internal.SearchContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockInetSocketAddress;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Indexer_ESTest extends Indexer_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test0()  throws Throwable  {
      String string0 = ">:/1";
      String string1 = "~.<%";
      RiverName riverName0 = new RiverName(string0, string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertEquals("~.<%", riverName0.name());
      assertEquals(">:/1", riverName0.getType());
      assertEquals("~.<%", riverName0.getName());
      assertEquals(">:/1", riverName0.type());
      assertNotNull(riverName0);
      
      Settings settings0 = NodeSettingsService.getGlobalSettings();
      assertNotNull(settings0);
      
      JsonParser jsonParser0 = null;
      CborXContentParser cborXContentParser0 = new CborXContentParser(jsonParser0);
      assertTrue(AbstractXContentParser.DEFAULT_NUMBER_COEERCE_POLICY);
      assertTrue(cborXContentParser0.estimatedNumberType());
      assertEquals(XContentType.CBOR, cborXContentParser0.contentType());
      assertNotNull(cborXContentParser0);
      
      // Undeclared exception!
      try { 
        cborXContentParser0.map();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.common.xcontent.json.JsonXContentParser", e);
      }
  }
}
