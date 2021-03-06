/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 06 23:31:07 GMT 2021
 */

package org.elasticsearch.river.mongodb;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.mongodb.DBCollection;
import com.mongodb.LazyDBList;
import com.mongodb.ServerAddress;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.PriorityBlockingQueue;
import org.bson.LazyBSONCallback;
import org.bson.LazyBSONList;
import org.bson.io.BSONByteBuffer;
import org.elasticsearch.action.update.UpdateRequest;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.collect.ImmutableList;
import org.elasticsearch.common.collect.ImmutableMap;
import org.elasticsearch.common.settings.ImmutableSettings;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.env.Environment;
import org.elasticsearch.river.RiverSettings;
import org.elasticsearch.river.mongodb.MongoDBRiver;
import org.elasticsearch.river.mongodb.MongoDBRiverDefinition;
import org.elasticsearch.river.mongodb.SharedContext;
import org.elasticsearch.river.mongodb.Slurper;
import org.elasticsearch.river.mongodb.Status;
import org.elasticsearch.script.ScriptEngineService;
import org.elasticsearch.script.ScriptService;
import org.elasticsearch.search.aggregations.metrics.tophits.TopHitsContext;
import org.elasticsearch.search.internal.SearchContext;
import org.elasticsearch.threadpool.ThreadPool;
import org.elasticsearch.watcher.ResourceWatcherService;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Slurper_ESTest extends Slurper_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test0()  throws Throwable  {
      String string0 = "";
      int int0 = 1359;
      ServerAddress serverAddress0 = new ServerAddress(string0, int0);
      assertNotNull(serverAddress0);
      assertEquals(27017, serverAddress0.defaultPort());
      assertEquals("127.0.0.1", serverAddress0.getHost());
      assertEquals(1359, serverAddress0.getPort());
      assertEquals("127.0.0.1", serverAddress0.defaultHost());
      
      ImmutableList<ServerAddress> immutableList0 = ImmutableList.of(serverAddress0, serverAddress0);
      assertNotNull(immutableList0);
      assertTrue(immutableList0.contains(serverAddress0));
      assertEquals(27017, serverAddress0.defaultPort());
      assertEquals("127.0.0.1", serverAddress0.getHost());
      assertEquals(1359, serverAddress0.getPort());
      assertEquals("127.0.0.1", serverAddress0.defaultHost());
      assertEquals(2, immutableList0.size());
      
      String string1 = "4C/~cJbh\\{TA";
      ImmutableSettings immutableSettings0 = (ImmutableSettings)ImmutableSettings.EMPTY;
      assertNotNull(immutableSettings0);
      
      Map<String, Object> map0 = null;
      RiverSettings riverSettings0 = new RiverSettings(immutableSettings0, map0);
      assertNotNull(riverSettings0);
      
      SearchContext searchContext0 = SearchContext.current();
      assertNull(searchContext0);
      
      TopHitsContext topHitsContext0 = new TopHitsContext(searchContext0);
      assertNotNull(topHitsContext0);
      assertFalse(topHitsContext0.hasFieldNames());
      assertFalse(topHitsContext0.version());
      assertFalse(topHitsContext0.hasPartialFields());
      assertFalse(topHitsContext0.sourceRequested());
      assertEquals(3, topHitsContext0.size());
      assertFalse(topHitsContext0.trackScores());
      assertFalse(topHitsContext0.hasFieldDataFields());
      assertFalse(topHitsContext0.hasFetchSourceContext());
      assertFalse(topHitsContext0.hasScriptFields());
      assertEquals(0, topHitsContext0.docIdsToLoadSize());
      assertEquals(0, topHitsContext0.docIdsToLoadFrom());
      assertFalse(topHitsContext0.explain());
      assertEquals(0, topHitsContext0.from());
      
      // Undeclared exception!
      try { 
        topHitsContext0.scriptService();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.search.aggregations.metrics.tophits.TopHitsContext", e);
      }
  }

  @Test(timeout = 11000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byte byte0 = (byte) (-65);
      byteArray0[0] = byte0;
      byte byte1 = (byte)0;
      byteArray0[1] = byte1;
      byte byte2 = (byte) (-3);
      byteArray0[2] = byte2;
      byte byte3 = (byte)103;
      byteArray0[3] = byte3;
      byte byte4 = (byte)1;
      byteArray0[4] = byte4;
      int int0 = (-137);
      int int1 = 0;
      // Undeclared exception!
      try { 
        BSONByteBuffer.wrap(byteArray0, int0, int1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.ByteBuffer", e);
      }
  }

  @Test(timeout = 11000)
  public void test2()  throws Throwable  {
      ArrayList<ServerAddress> arrayList0 = new ArrayList<ServerAddress>();
      assertNotNull(arrayList0);
      assertTrue(arrayList0.isEmpty());
      assertEquals(0, arrayList0.size());
      
      MongoDBRiverDefinition mongoDBRiverDefinition0 = null;
      LinkedTransferQueue<MongoDBRiver.QueueEntry> linkedTransferQueue0 = new LinkedTransferQueue<MongoDBRiver.QueueEntry>();
      assertNotNull(linkedTransferQueue0);
      
      Status status0 = Status.UNKNOWN;
      ServerAddress serverAddress0 = null;
      boolean boolean0 = arrayList0.add(serverAddress0);
      assertTrue(boolean0);
      assertFalse(arrayList0.isEmpty());
      assertEquals(1, arrayList0.size());
      
      SharedContext sharedContext0 = new SharedContext(linkedTransferQueue0, status0);
      assertNotNull(sharedContext0);
      assertEquals(Status.UNKNOWN, sharedContext0.getStatus());
      
      Client client0 = null;
      Status status1 = Status.START_FAILED;
      sharedContext0.setStatus(status1);
      assertNotSame(status0, status1);
      assertNotSame(status1, status0);
      assertFalse(status0.equals((Object)status1));
      assertFalse(status1.equals((Object)status0));
      assertEquals(Status.START_FAILED, sharedContext0.getStatus());
      
      Slurper slurper0 = null;
      try {
        slurper0 = new Slurper(arrayList0, mongoDBRiverDefinition0, sharedContext0, client0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.river.mongodb.Slurper", e);
      }
  }

  @Test(timeout = 11000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = null;
      int int0 = 0;
      LazyBSONCallback lazyBSONCallback0 = new LazyBSONCallback();
      assertNotNull(lazyBSONCallback0);
      
      LazyDBList lazyDBList0 = null;
      try {
        lazyDBList0 = new LazyDBList(byteArray0, int0, lazyBSONCallback0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.bson.LazyBSONObject", e);
      }
  }

  @Test(timeout = 11000)
  public void test4()  throws Throwable  {
      ServerAddress serverAddress0 = new ServerAddress();
      assertNotNull(serverAddress0);
      assertEquals("127.0.0.1", serverAddress0.getHost());
      assertEquals(27017, serverAddress0.getPort());
      assertEquals("127.0.0.1", serverAddress0.defaultHost());
      assertEquals(27017, serverAddress0.defaultPort());
      
      ImmutableList<ServerAddress> immutableList0 = ImmutableList.of(serverAddress0, serverAddress0, serverAddress0, serverAddress0, serverAddress0);
      assertNotNull(immutableList0);
      assertTrue(immutableList0.contains(serverAddress0));
      assertEquals("127.0.0.1", serverAddress0.getHost());
      assertEquals(27017, serverAddress0.getPort());
      assertEquals("127.0.0.1", serverAddress0.defaultHost());
      assertEquals(27017, serverAddress0.defaultPort());
      assertEquals(5, immutableList0.size());
      
      String string0 = "";
      String string1 = "v\"ww+k!W";
      RiverSettings riverSettings0 = null;
      SearchContext searchContext0 = SearchContext.current();
      assertNull(searchContext0);
      
      TopHitsContext topHitsContext0 = new TopHitsContext(searchContext0);
      assertNotNull(topHitsContext0);
      assertFalse(topHitsContext0.hasFieldNames());
      assertFalse(topHitsContext0.version());
      assertFalse(topHitsContext0.explain());
      assertFalse(topHitsContext0.sourceRequested());
      assertEquals(3, topHitsContext0.size());
      assertEquals(0, topHitsContext0.docIdsToLoadFrom());
      assertFalse(topHitsContext0.hasFetchSourceContext());
      assertFalse(topHitsContext0.hasScriptFields());
      assertEquals(0, topHitsContext0.from());
      assertFalse(topHitsContext0.hasFieldDataFields());
      assertEquals(0, topHitsContext0.docIdsToLoadSize());
      assertFalse(topHitsContext0.trackScores());
      assertFalse(topHitsContext0.hasPartialFields());
      
      // Undeclared exception!
      try { 
        topHitsContext0.scriptService();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.search.aggregations.metrics.tophits.TopHitsContext", e);
      }
  }
}
