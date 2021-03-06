/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 02 09:20:55 GMT 2021
 */

package org.elasticsearch.river.mongodb;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.ServerAddress;
import com.mongodb.gridfs.GridFSDBFile;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.time.Month;
import java.util.TreeSet;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.stream.Stream;
import org.bson.LazyBSONCallback;
import org.bson.LazyBSONList;
import org.bson.io.BSONByteBuffer;
import org.elasticsearch.action.ActionListener;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.indexedscripts.put.PutIndexedScriptRequest;
import org.elasticsearch.action.indexedscripts.put.PutIndexedScriptResponse;
import org.elasticsearch.action.search.MultiSearchRequest;
import org.elasticsearch.action.search.MultiSearchResponse;
import org.elasticsearch.action.support.PlainActionFuture;
import org.elasticsearch.action.support.PlainListenableActionFuture;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.bytes.BytesArray;
import org.elasticsearch.common.collect.ImmutableBiMap;
import org.elasticsearch.common.collect.ImmutableList;
import org.elasticsearch.common.collect.UnmodifiableListIterator;
import org.elasticsearch.common.io.stream.BytesStreamInput;
import org.elasticsearch.common.settings.ImmutableSettings;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.env.Environment;
import org.elasticsearch.index.VersionType;
import org.elasticsearch.node.settings.NodeSettingsService;
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
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.evosuite.runtime.mock.java.net.MockInetSocketAddress;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Slurper_ESTest extends Slurper_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test0()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      assertFalse(inetAddress0.isMulticastAddress());
      assertFalse(inetAddress0.isMCGlobal());
      assertEquals("192.168.1.42", inetAddress0.getHostAddress());
      assertFalse(inetAddress0.isMCSiteLocal());
      assertTrue(inetAddress0.isSiteLocalAddress());
      assertFalse(inetAddress0.isLinkLocalAddress());
      assertEquals("/192.168.1.42", inetAddress0.toString());
      assertFalse(inetAddress0.isMCOrgLocal());
      assertFalse(inetAddress0.isMCNodeLocal());
      assertFalse(inetAddress0.isLoopbackAddress());
      assertFalse(inetAddress0.isAnyLocalAddress());
      assertFalse(inetAddress0.isMCLinkLocal());
      assertNotNull(inetAddress0);
      
      int int0 = 285;
      ServerAddress serverAddress0 = new ServerAddress(inetAddress0, int0);
      assertFalse(inetAddress0.isMulticastAddress());
      assertFalse(inetAddress0.isMCGlobal());
      assertEquals("192.168.1.42", inetAddress0.getHostAddress());
      assertFalse(inetAddress0.isMCSiteLocal());
      assertTrue(inetAddress0.isSiteLocalAddress());
      assertFalse(inetAddress0.isLinkLocalAddress());
      assertFalse(inetAddress0.isMCOrgLocal());
      assertFalse(inetAddress0.isMCNodeLocal());
      assertFalse(inetAddress0.isLoopbackAddress());
      assertEquals("192.168.1.42/192.168.1.42", inetAddress0.toString());
      assertFalse(inetAddress0.isAnyLocalAddress());
      assertFalse(inetAddress0.isMCLinkLocal());
      assertEquals(285, serverAddress0.getPort());
      assertEquals(27017, serverAddress0.defaultPort());
      assertEquals("127.0.0.1", serverAddress0.defaultHost());
      assertEquals("192.168.1.42", serverAddress0.getHost());
      assertNotNull(serverAddress0);
      
      MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress(int0);
      assertNotNull(mockInetSocketAddress0);
      
      ServerAddress serverAddress1 = new ServerAddress(mockInetSocketAddress0);
      assertTrue(serverAddress1.equals((Object)serverAddress0));
      assertEquals("192.168.1.42/192.168.1.42:285", mockInetSocketAddress0.toString());
      assertEquals(285, mockInetSocketAddress0.getPort());
      assertEquals("192.168.1.42", mockInetSocketAddress0.getHostString());
      assertFalse(mockInetSocketAddress0.isUnresolved());
      assertEquals("192.168.1.42", serverAddress1.getHost());
      assertEquals(285, serverAddress1.getPort());
      assertEquals(27017, serverAddress1.defaultPort());
      assertEquals("127.0.0.1", serverAddress1.defaultHost());
      assertNotNull(serverAddress1);
      
      ImmutableList<ServerAddress> immutableList0 = ImmutableList.of(serverAddress0, serverAddress0, serverAddress0, serverAddress0, serverAddress0, serverAddress0, serverAddress1, serverAddress1, serverAddress0);
      assertNotSame(serverAddress0, serverAddress1);
      assertNotSame(serverAddress1, serverAddress0);
      assertTrue(immutableList0.contains(serverAddress0));
      assertTrue(serverAddress0.equals((Object)serverAddress1));
      assertTrue(serverAddress1.equals((Object)serverAddress0));
      assertFalse(inetAddress0.isMulticastAddress());
      assertFalse(inetAddress0.isMCGlobal());
      assertEquals("192.168.1.42", inetAddress0.getHostAddress());
      assertFalse(inetAddress0.isMCSiteLocal());
      assertTrue(inetAddress0.isSiteLocalAddress());
      assertFalse(inetAddress0.isLinkLocalAddress());
      assertFalse(inetAddress0.isMCOrgLocal());
      assertFalse(inetAddress0.isMCNodeLocal());
      assertFalse(inetAddress0.isLoopbackAddress());
      assertEquals("192.168.1.42/192.168.1.42", inetAddress0.toString());
      assertFalse(inetAddress0.isAnyLocalAddress());
      assertFalse(inetAddress0.isMCLinkLocal());
      assertEquals(285, serverAddress0.getPort());
      assertEquals(27017, serverAddress0.defaultPort());
      assertEquals("127.0.0.1", serverAddress0.defaultHost());
      assertEquals("192.168.1.42", serverAddress0.getHost());
      assertEquals("192.168.1.42/192.168.1.42:285", mockInetSocketAddress0.toString());
      assertEquals(285, mockInetSocketAddress0.getPort());
      assertEquals("192.168.1.42", mockInetSocketAddress0.getHostString());
      assertFalse(mockInetSocketAddress0.isUnresolved());
      assertEquals("192.168.1.42", serverAddress1.getHost());
      assertEquals(285, serverAddress1.getPort());
      assertEquals(27017, serverAddress1.defaultPort());
      assertEquals("127.0.0.1", serverAddress1.defaultHost());
      assertEquals(9, immutableList0.size());
      assertNotNull(immutableList0);
      
      String string0 = ")2>U+<l[`|";
      ImmutableSettings immutableSettings0 = (ImmutableSettings)ImmutableSettings.EMPTY;
      assertNotNull(immutableSettings0);
      
      BasicDBObject basicDBObject0 = new BasicDBObject(int0);
      assertEquals(0, basicDBObject0.size());
      assertTrue(basicDBObject0.isEmpty());
      assertFalse(basicDBObject0.isPartialObject());
      assertNotNull(basicDBObject0);
      
      GridFSDBFile gridFSDBFile0 = new GridFSDBFile();
      assertEquals(0, gridFSDBFile0.numChunks());
      assertNull(gridFSDBFile0.getFilename());
      assertNull(gridFSDBFile0.getContentType());
      assertNull(gridFSDBFile0.getMD5());
      assertEquals(0L, gridFSDBFile0.getChunkSize());
      assertFalse(gridFSDBFile0.isPartialObject());
      assertEquals(0L, gridFSDBFile0.getLength());
      assertNotNull(gridFSDBFile0);
      
      int int1 = 0;
      UnmodifiableListIterator<ServerAddress> unmodifiableListIterator0 = immutableList0.listIterator(int1);
      assertNotSame(serverAddress0, serverAddress1);
      assertNotSame(serverAddress1, serverAddress0);
      assertTrue(immutableList0.contains(serverAddress0));
      assertFalse(int0 == int1);
      assertTrue(serverAddress0.equals((Object)serverAddress1));
      assertTrue(serverAddress1.equals((Object)serverAddress0));
      assertFalse(int1 == int0);
      assertFalse(inetAddress0.isMulticastAddress());
      assertFalse(inetAddress0.isMCGlobal());
      assertEquals("192.168.1.42", inetAddress0.getHostAddress());
      assertFalse(inetAddress0.isMCSiteLocal());
      assertTrue(inetAddress0.isSiteLocalAddress());
      assertFalse(inetAddress0.isLinkLocalAddress());
      assertFalse(inetAddress0.isMCOrgLocal());
      assertFalse(inetAddress0.isMCNodeLocal());
      assertFalse(inetAddress0.isLoopbackAddress());
      assertEquals("192.168.1.42/192.168.1.42", inetAddress0.toString());
      assertFalse(inetAddress0.isAnyLocalAddress());
      assertFalse(inetAddress0.isMCLinkLocal());
      assertEquals(285, serverAddress0.getPort());
      assertEquals(27017, serverAddress0.defaultPort());
      assertEquals("127.0.0.1", serverAddress0.defaultHost());
      assertEquals("192.168.1.42", serverAddress0.getHost());
      assertEquals("192.168.1.42/192.168.1.42:285", mockInetSocketAddress0.toString());
      assertEquals(285, mockInetSocketAddress0.getPort());
      assertEquals("192.168.1.42", mockInetSocketAddress0.getHostString());
      assertFalse(mockInetSocketAddress0.isUnresolved());
      assertEquals("192.168.1.42", serverAddress1.getHost());
      assertEquals(285, serverAddress1.getPort());
      assertEquals(27017, serverAddress1.defaultPort());
      assertEquals("127.0.0.1", serverAddress1.defaultHost());
      assertEquals(9, immutableList0.size());
      assertNotNull(unmodifiableListIterator0);
      
      BasicDBObject basicDBObject1 = basicDBObject0.append(string0, gridFSDBFile0);
      assertSame(basicDBObject0, basicDBObject1);
      assertSame(basicDBObject1, basicDBObject0);
      assertFalse(int0 == int1);
      assertEquals(1, basicDBObject0.size());
      assertFalse(basicDBObject0.isPartialObject());
      assertFalse(basicDBObject0.isEmpty());
      assertEquals(0, gridFSDBFile0.numChunks());
      assertNull(gridFSDBFile0.getFilename());
      assertNull(gridFSDBFile0.getContentType());
      assertNull(gridFSDBFile0.getMD5());
      assertEquals(0L, gridFSDBFile0.getChunkSize());
      assertFalse(gridFSDBFile0.isPartialObject());
      assertEquals(0L, gridFSDBFile0.getLength());
      assertFalse(basicDBObject1.isEmpty());
      assertEquals(1, basicDBObject1.size());
      assertFalse(basicDBObject1.isPartialObject());
      assertNotNull(basicDBObject1);
      
      RiverSettings riverSettings0 = new RiverSettings(immutableSettings0, basicDBObject1);
      assertFalse(int0 == int1);
      assertEquals(1, basicDBObject0.size());
      assertFalse(basicDBObject0.isPartialObject());
      assertFalse(basicDBObject0.isEmpty());
      assertEquals(0, gridFSDBFile0.numChunks());
      assertNull(gridFSDBFile0.getFilename());
      assertNull(gridFSDBFile0.getContentType());
      assertNull(gridFSDBFile0.getMD5());
      assertEquals(0L, gridFSDBFile0.getChunkSize());
      assertFalse(gridFSDBFile0.isPartialObject());
      assertEquals(0L, gridFSDBFile0.getLength());
      assertFalse(basicDBObject1.isEmpty());
      assertEquals(1, basicDBObject1.size());
      assertFalse(basicDBObject1.isPartialObject());
      assertNotNull(riverSettings0);
      
      SearchContext searchContext0 = SearchContext.current();
      assertNull(searchContext0);
      
      TopHitsContext topHitsContext0 = new TopHitsContext(searchContext0);
      assertEquals(0, topHitsContext0.docIdsToLoadSize());
      assertFalse(topHitsContext0.hasScriptFields());
      assertFalse(topHitsContext0.hasFetchSourceContext());
      assertEquals(3, topHitsContext0.size());
      assertEquals(0, topHitsContext0.from());
      assertFalse(topHitsContext0.explain());
      assertFalse(topHitsContext0.sourceRequested());
      assertFalse(topHitsContext0.version());
      assertFalse(topHitsContext0.hasFieldNames());
      assertEquals(0, topHitsContext0.docIdsToLoadFrom());
      assertFalse(topHitsContext0.hasPartialFields());
      assertFalse(topHitsContext0.trackScores());
      assertFalse(topHitsContext0.hasFieldDataFields());
      assertNotNull(topHitsContext0);
      
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
      byte[] byteArray0 = null;
      LazyBSONCallback lazyBSONCallback0 = new LazyBSONCallback();
      assertNotNull(lazyBSONCallback0);
      
      LazyBSONList lazyBSONList0 = null;
      try {
        lazyBSONList0 = new LazyBSONList(byteArray0, lazyBSONCallback0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.ByteBuffer", e);
      }
  }

  @Test(timeout = 11000)
  public void test2()  throws Throwable  {
      ImmutableList<ServerAddress> immutableList0 = ImmutableList.of();
      assertEquals(0, immutableList0.size());
      assertNotNull(immutableList0);
      
      MongoDBRiverDefinition mongoDBRiverDefinition0 = null;
      LinkedBlockingDeque<MongoDBRiver.QueueEntry> linkedBlockingDeque0 = new LinkedBlockingDeque<MongoDBRiver.QueueEntry>();
      assertNotNull(linkedBlockingDeque0);
      
      Status status0 = Status.STOPPED;
      SharedContext sharedContext0 = new SharedContext(linkedBlockingDeque0, status0);
      assertEquals(Status.STOPPED, sharedContext0.getStatus());
      assertNotNull(sharedContext0);
      
      Client client0 = null;
      sharedContext0.setStream(linkedBlockingDeque0);
      assertEquals(Status.STOPPED, sharedContext0.getStatus());
      
      Slurper slurper0 = null;
      try {
        slurper0 = new Slurper(immutableList0, mongoDBRiverDefinition0, sharedContext0, client0);
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
      String string0 = "";
      ServerAddress serverAddress0 = new ServerAddress(string0);
      assertEquals("127.0.0.1", serverAddress0.getHost());
      assertEquals(27017, serverAddress0.defaultPort());
      assertEquals(27017, serverAddress0.getPort());
      assertEquals("127.0.0.1", serverAddress0.defaultHost());
      assertNotNull(serverAddress0);
      
      ImmutableList<ServerAddress> immutableList0 = ImmutableList.of(serverAddress0, serverAddress0, serverAddress0, serverAddress0, serverAddress0, serverAddress0, serverAddress0, serverAddress0);
      assertTrue(immutableList0.contains(serverAddress0));
      assertEquals("127.0.0.1", serverAddress0.getHost());
      assertEquals(27017, serverAddress0.defaultPort());
      assertEquals(27017, serverAddress0.getPort());
      assertEquals("127.0.0.1", serverAddress0.defaultHost());
      assertEquals(8, immutableList0.size());
      assertNotNull(immutableList0);
      
      Settings settings0 = NodeSettingsService.getGlobalSettings();
      assertNotNull(settings0);
      
      String string1 = "7t..|QFYT(UhWD.m.{";
      ImmutableBiMap<String, Object> immutableBiMap0 = ImmutableBiMap.of(string0, (Object) string0, string1, (Object) string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertEquals(2, immutableBiMap0.size());
      assertNotNull(immutableBiMap0);
      
      RiverSettings riverSettings0 = new RiverSettings(settings0, immutableBiMap0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertEquals(2, immutableBiMap0.size());
      assertNotNull(riverSettings0);
      
      SearchContext searchContext0 = SearchContext.current();
      assertNull(searchContext0);
      
      TopHitsContext topHitsContext0 = new TopHitsContext(searchContext0);
      assertFalse(topHitsContext0.hasScriptFields());
      assertEquals(3, topHitsContext0.size());
      assertEquals(0, topHitsContext0.docIdsToLoadSize());
      assertFalse(topHitsContext0.sourceRequested());
      assertFalse(topHitsContext0.hasFetchSourceContext());
      assertEquals(0, topHitsContext0.from());
      assertEquals(0, topHitsContext0.docIdsToLoadFrom());
      assertFalse(topHitsContext0.hasFieldNames());
      assertFalse(topHitsContext0.version());
      assertFalse(topHitsContext0.explain());
      assertFalse(topHitsContext0.hasFieldDataFields());
      assertFalse(topHitsContext0.hasPartialFields());
      assertFalse(topHitsContext0.trackScores());
      assertNotNull(topHitsContext0);
      
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
  public void test4()  throws Throwable  {
      ServerAddress[] serverAddressArray0 = new ServerAddress[5];
      String string0 = "z+WI[]%#}){\\`*r";
      int int0 = 523;
      InetSocketAddress inetSocketAddress0 = MockInetSocketAddress.createUnresolved(string0, int0);
      assertEquals("z+WI[]%#}){\\`*r", inetSocketAddress0.getHostString());
      assertTrue(inetSocketAddress0.isUnresolved());
      assertEquals(523, inetSocketAddress0.getPort());
      assertEquals("z+WI[]%#}){\\`*r:523", inetSocketAddress0.toString());
      assertNotNull(inetSocketAddress0);
      
      ServerAddress serverAddress0 = new ServerAddress(inetSocketAddress0);
      assertEquals("z+WI[]%#}){\\`*r", inetSocketAddress0.getHostString());
      assertTrue(inetSocketAddress0.isUnresolved());
      assertEquals(523, inetSocketAddress0.getPort());
      assertEquals("z+WI[]%#}){\\`*r:523", inetSocketAddress0.toString());
      assertEquals(523, serverAddress0.getPort());
      assertEquals("z+WI[]%#}){\\`*r", serverAddress0.getHost());
      assertEquals("127.0.0.1", serverAddress0.defaultHost());
      assertEquals(27017, serverAddress0.defaultPort());
      assertNotNull(serverAddress0);
      
      serverAddressArray0[0] = serverAddress0;
      ServerAddress serverAddress1 = new ServerAddress();
      assertFalse(serverAddress1.equals((Object)serverAddress0));
      assertEquals(27017, serverAddress1.getPort());
      assertEquals("127.0.0.1", serverAddress1.defaultHost());
      assertEquals("127.0.0.1", serverAddress1.getHost());
      assertEquals(27017, serverAddress1.defaultPort());
      assertNotNull(serverAddress1);
      
      serverAddressArray0[1] = serverAddress1;
      String string1 = "";
      byte[] byteArray0 = null;
      try { 
        MockInetAddress.getByAddress(string1, byteArray0);
        fail("Expecting exception: UnknownHostException");
      
      } catch(UnknownHostException e) {
         //
         // Not IPv4: null
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockInetAddress", e);
      }
  }

  @Test(timeout = 11000)
  public void test5()  throws Throwable  {
      String string0 = "_id";
      InetAddress inetAddress0 = MockInetAddress.getByName(string0);
      assertFalse(inetAddress0.isMCNodeLocal());
      assertFalse(inetAddress0.isLoopbackAddress());
      assertFalse(inetAddress0.isMCSiteLocal());
      assertFalse(inetAddress0.isMCGlobal());
      assertFalse(inetAddress0.isSiteLocalAddress());
      assertFalse(inetAddress0.isMCLinkLocal());
      assertFalse(inetAddress0.isLinkLocalAddress());
      assertFalse(inetAddress0.isMCOrgLocal());
      assertFalse(inetAddress0.isAnyLocalAddress());
      assertEquals("200.42.42.0", inetAddress0.getHostAddress());
      assertEquals("_id/200.42.42.0", inetAddress0.toString());
      assertFalse(inetAddress0.isMulticastAddress());
      assertNotNull(inetAddress0);
      
      int int0 = (-5032);
      ServerAddress serverAddress0 = null;
      try {
        serverAddress0 = new ServerAddress(inetAddress0, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // port out of range:-5032
         //
         verifyException("java.net.InetSocketAddress", e);
      }
  }

  @Test(timeout = 11000)
  public void test6()  throws Throwable  {
      String string0 = "";
      int int0 = 0;
      ServerAddress serverAddress0 = new ServerAddress(string0, int0);
      assertEquals(0, serverAddress0.getPort());
      assertEquals("127.0.0.1", serverAddress0.defaultHost());
      assertEquals(27017, serverAddress0.defaultPort());
      assertEquals("127.0.0.1", serverAddress0.getHost());
      assertNotNull(serverAddress0);
      
      ImmutableList<ServerAddress> immutableList0 = ImmutableList.of(serverAddress0, serverAddress0, serverAddress0, serverAddress0);
      assertTrue(immutableList0.contains(serverAddress0));
      assertEquals(0, serverAddress0.getPort());
      assertEquals("127.0.0.1", serverAddress0.defaultHost());
      assertEquals(27017, serverAddress0.defaultPort());
      assertEquals("127.0.0.1", serverAddress0.getHost());
      assertEquals(4, immutableList0.size());
      assertNotNull(immutableList0);
      
      String string1 = "";
      String string2 = "rollback: infos=";
      ImmutableSettings immutableSettings0 = (ImmutableSettings)ImmutableSettings.Builder.EMPTY_SETTINGS;
      assertNotNull(immutableSettings0);
      
      String string3 = null;
      Month month0 = Month.APRIL;
      assertEquals(Month.APRIL, month0);
      
      // Undeclared exception!
      try { 
        ImmutableBiMap.of(string3, (Object) month0, string3, (Object) serverAddress0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // null key in entry: null=APRIL
         //
         verifyException("org.elasticsearch.common.collect.CollectPreconditions", e);
      }
  }

  @Test(timeout = 11000)
  public void test7()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byte byte0 = (byte)0;
      byteArray0[0] = byte0;
      byte byte1 = (byte)58;
      byteArray0[1] = byte1;
      byte byte2 = (byte)65;
      byteArray0[2] = byte2;
      byte byte3 = (byte)24;
      byteArray0[3] = byte3;
      byte byte4 = (byte)44;
      byteArray0[4] = byte4;
      byte byte5 = (byte) (-38);
      byteArray0[5] = byte5;
      byte byte6 = (byte)0;
      byteArray0[6] = byte6;
      BSONByteBuffer bSONByteBuffer0 = BSONByteBuffer.wrap(byteArray0);
      assertEquals("java.nio.HeapByteBuffer[pos=0 lim=7 cap=7]", bSONByteBuffer0.toString());
      assertNotNull(bSONByteBuffer0);
      assertEquals(7, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)0, (byte)58, (byte)65, (byte)24, (byte)44, (byte) (-38), (byte)0}, byteArray0);
      
      int int0 = 0;
      LazyBSONCallback lazyBSONCallback0 = new LazyBSONCallback();
      assertNotNull(lazyBSONCallback0);
      
      LazyBSONList lazyBSONList0 = new LazyBSONList(bSONByteBuffer0, int0, lazyBSONCallback0);
      assertEquals("java.nio.HeapByteBuffer[pos=0 lim=7 cap=7]", bSONByteBuffer0.toString());
      assertNotNull(lazyBSONList0);
      assertEquals(7, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)0, (byte)58, (byte)65, (byte)24, (byte)44, (byte) (-38), (byte)0}, byteArray0);
      
      MongoDBRiverDefinition mongoDBRiverDefinition0 = null;
      Stream stream0 = lazyBSONList0.stream();
      assertEquals("java.nio.HeapByteBuffer[pos=0 lim=7 cap=7]", bSONByteBuffer0.toString());
      assertNotNull(stream0);
      assertEquals(7, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)0, (byte)58, (byte)65, (byte)24, (byte)44, (byte) (-38), (byte)0}, byteArray0);
      
      LinkedBlockingDeque<MongoDBRiver.QueueEntry> linkedBlockingDeque0 = new LinkedBlockingDeque<MongoDBRiver.QueueEntry>();
      assertNotNull(linkedBlockingDeque0);
      
      Status status0 = Status.STOPPED;
      SharedContext sharedContext0 = new SharedContext(linkedBlockingDeque0, status0);
      assertEquals(Status.STOPPED, sharedContext0.getStatus());
      assertNotNull(sharedContext0);
      
      Client client0 = null;
      Slurper slurper0 = null;
      try {
        slurper0 = new Slurper(lazyBSONList0, mongoDBRiverDefinition0, sharedContext0, client0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.river.mongodb.Slurper", e);
      }
  }
}
