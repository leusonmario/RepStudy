/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 08 18:18:47 GMT 2021
 */

package org.elasticsearch.rest.action.cat;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.InetAddress;
import org.elasticsearch.cache.recycler.PageCacheRecycler;
import org.elasticsearch.client.Client;
import org.elasticsearch.cluster.metadata.IndexMetaData;
import org.elasticsearch.cluster.metadata.MappingMetaData;
import org.elasticsearch.cluster.metadata.MetaData;
import org.elasticsearch.common.Table;
import org.elasticsearch.common.bytes.BytesReference;
import org.elasticsearch.common.component.Lifecycle;
import org.elasticsearch.common.io.stream.StreamInput;
import org.elasticsearch.common.logging.ESLogger;
import org.elasticsearch.common.network.NetworkService;
import org.elasticsearch.common.settings.ClusterSettings;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.util.BigArrays;
import org.elasticsearch.http.netty.NettyHttpChannel;
import org.elasticsearch.http.netty.NettyHttpRequest;
import org.elasticsearch.http.netty.NettyHttpServerTransport;
import org.elasticsearch.http.netty.pipelining.OrderedUpstreamMessageEvent;
import org.elasticsearch.index.fielddata.IndexNumericFieldData;
import org.elasticsearch.indices.breaker.HierarchyCircuitBreakerService;
import org.elasticsearch.rest.RestController;
import org.elasticsearch.rest.RestFilter;
import org.elasticsearch.rest.RestRequest;
import org.elasticsearch.rest.action.cat.RestShardsAction;
import org.elasticsearch.script.SearchScript;
import org.elasticsearch.search.aggregations.support.ValuesSource;
import org.elasticsearch.threadpool.ThreadPool;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.evosuite.runtime.mock.java.net.MockInetSocketAddress;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.DefaultChannelPipeline;
import org.jboss.netty.channel.local.DefaultLocalServerChannelFactory;
import org.jboss.netty.channel.local.LocalServerChannel;
import org.jboss.netty.handler.codec.http.DefaultHttpRequest;
import org.jboss.netty.handler.codec.http.HttpMethod;
import org.jboss.netty.handler.codec.http.HttpVersion;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RestShardsAction_ESTest extends RestShardsAction_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test0()  throws Throwable  {
      MetaData metaData0 = MetaData.EMPTY_META_DATA;
      assertEquals(0, metaData0.getTotalNumberOfShards());
      assertEquals(0L, metaData0.version());
      assertEquals(0, metaData0.getNumberOfShards());
      assertEquals("_na_", metaData0.clusterUUID());
      assertNotNull(metaData0);
      
      Settings settings0 = metaData0.settings();
      assertEquals(0, metaData0.getTotalNumberOfShards());
      assertEquals(0L, metaData0.version());
      assertEquals(0, metaData0.getNumberOfShards());
      assertEquals("_na_", metaData0.clusterUUID());
      assertNotNull(settings0);
      
      RestController restController0 = new RestController(settings0);
      assertEquals(0, metaData0.getTotalNumberOfShards());
      assertEquals(0L, metaData0.version());
      assertEquals(0, metaData0.getNumberOfShards());
      assertEquals("_na_", metaData0.clusterUUID());
      assertEquals(Lifecycle.State.INITIALIZED, restController0.lifecycleState());
      assertNotNull(restController0);
      
      Client client0 = null;
      RestShardsAction restShardsAction0 = new RestShardsAction(settings0, restController0, client0);
      assertEquals(0, metaData0.getTotalNumberOfShards());
      assertEquals(0L, metaData0.version());
      assertEquals(0, metaData0.getNumberOfShards());
      assertEquals("_na_", metaData0.clusterUUID());
      assertEquals(Lifecycle.State.INITIALIZED, restController0.lifecycleState());
      assertNotNull(restShardsAction0);
      
      NetworkService networkService0 = new NetworkService(settings0);
      assertEquals(0, metaData0.getTotalNumberOfShards());
      assertEquals(0L, metaData0.version());
      assertEquals(0, metaData0.getNumberOfShards());
      assertEquals("_na_", metaData0.clusterUUID());
      assertNotNull(networkService0);
      
      BigArrays bigArrays0 = BigArrays.NON_RECYCLING_INSTANCE;
      assertEquals(16384, BigArrays.PAGE_SIZE_IN_BYTES);
      assertEquals(4096, BigArrays.INT_PAGE_SIZE);
      assertEquals(16384, BigArrays.BYTE_PAGE_SIZE);
      assertEquals(2048, BigArrays.LONG_PAGE_SIZE);
      assertEquals(2048, BigArrays.OBJECT_PAGE_SIZE);
      assertNotNull(bigArrays0);
      
      ThreadPool threadPool0 = new ThreadPool(settings0);
      assertEquals(0, metaData0.getTotalNumberOfShards());
      assertEquals(0L, metaData0.version());
      assertEquals(0, metaData0.getNumberOfShards());
      assertEquals("_na_", metaData0.clusterUUID());
      assertNotNull(threadPool0);
      
      NettyHttpServerTransport nettyHttpServerTransport0 = new NettyHttpServerTransport(settings0, networkService0, bigArrays0, threadPool0);
      assertEquals(0, metaData0.getTotalNumberOfShards());
      assertEquals(0L, metaData0.version());
      assertEquals(0, metaData0.getNumberOfShards());
      assertEquals("_na_", metaData0.clusterUUID());
      assertEquals(Lifecycle.State.INITIALIZED, nettyHttpServerTransport0.lifecycleState());
      assertEquals(16384, BigArrays.PAGE_SIZE_IN_BYTES);
      assertEquals(4096, BigArrays.INT_PAGE_SIZE);
      assertEquals(16384, BigArrays.BYTE_PAGE_SIZE);
      assertEquals(2048, BigArrays.LONG_PAGE_SIZE);
      assertEquals(2048, BigArrays.OBJECT_PAGE_SIZE);
      assertNotNull(nettyHttpServerTransport0);
      
      boolean boolean0 = true;
      HttpVersion httpVersion0 = new HttpVersion(metaData0.CONTEXT_MODE_GATEWAY, bigArrays0.OBJECT_PAGE_SIZE, bigArrays0.PAGE_SIZE_IN_BYTES, boolean0);
      assertEquals(0, metaData0.getTotalNumberOfShards());
      assertEquals(0L, metaData0.version());
      assertEquals(0, metaData0.getNumberOfShards());
      assertEquals("_na_", metaData0.clusterUUID());
      assertEquals(2048, httpVersion0.getMajorVersion());
      assertTrue(httpVersion0.isKeepAliveDefault());
      assertEquals("GATEWAY", httpVersion0.getProtocolName());
      assertEquals(16384, httpVersion0.getMinorVersion());
      assertEquals("GATEWAY/2048.16384", httpVersion0.toString());
      assertEquals("GATEWAY/2048.16384", httpVersion0.getText());
      assertEquals(16384, BigArrays.PAGE_SIZE_IN_BYTES);
      assertEquals(4096, BigArrays.INT_PAGE_SIZE);
      assertEquals(16384, BigArrays.BYTE_PAGE_SIZE);
      assertEquals(2048, BigArrays.LONG_PAGE_SIZE);
      assertEquals(2048, BigArrays.OBJECT_PAGE_SIZE);
      assertNotNull(httpVersion0);
      
      HttpMethod httpMethod0 = HttpMethod.HEAD;
      assertEquals("HEAD", httpMethod0.toString());
      assertEquals("HEAD", httpMethod0.getName());
      assertNotNull(httpMethod0);
      
      DefaultHttpRequest defaultHttpRequest0 = new DefaultHttpRequest(httpVersion0, httpMethod0, metaData0.CONTEXT_MODE_SNAPSHOT);
      assertEquals(0, metaData0.getTotalNumberOfShards());
      assertEquals(0L, metaData0.version());
      assertEquals(0, metaData0.getNumberOfShards());
      assertEquals("_na_", metaData0.clusterUUID());
      assertEquals(2048, httpVersion0.getMajorVersion());
      assertTrue(httpVersion0.isKeepAliveDefault());
      assertEquals("GATEWAY", httpVersion0.getProtocolName());
      assertEquals(16384, httpVersion0.getMinorVersion());
      assertEquals("GATEWAY/2048.16384", httpVersion0.toString());
      assertEquals("GATEWAY/2048.16384", httpVersion0.getText());
      assertEquals("HEAD", httpMethod0.toString());
      assertEquals("HEAD", httpMethod0.getName());
      assertEquals("SNAPSHOT", defaultHttpRequest0.getUri());
      assertEquals(16384, BigArrays.PAGE_SIZE_IN_BYTES);
      assertEquals(4096, BigArrays.INT_PAGE_SIZE);
      assertEquals(16384, BigArrays.BYTE_PAGE_SIZE);
      assertEquals(2048, BigArrays.LONG_PAGE_SIZE);
      assertEquals(2048, BigArrays.OBJECT_PAGE_SIZE);
      assertNotNull(defaultHttpRequest0);
      
      Channel channel0 = null;
      NettyHttpRequest nettyHttpRequest0 = new NettyHttpRequest(defaultHttpRequest0, channel0);
      assertEquals(0, metaData0.getTotalNumberOfShards());
      assertEquals(0L, metaData0.version());
      assertEquals(0, metaData0.getNumberOfShards());
      assertEquals("_na_", metaData0.clusterUUID());
      assertEquals(2048, httpVersion0.getMajorVersion());
      assertTrue(httpVersion0.isKeepAliveDefault());
      assertEquals("GATEWAY", httpVersion0.getProtocolName());
      assertEquals(16384, httpVersion0.getMinorVersion());
      assertEquals("GATEWAY/2048.16384", httpVersion0.toString());
      assertEquals("GATEWAY/2048.16384", httpVersion0.getText());
      assertEquals("HEAD", httpMethod0.toString());
      assertEquals("HEAD", httpMethod0.getName());
      assertEquals("SNAPSHOT", defaultHttpRequest0.getUri());
      assertFalse(nettyHttpRequest0.hasContent());
      assertEquals(RestRequest.Method.HEAD, nettyHttpRequest0.method());
      assertEquals("SNAPSHOT", nettyHttpRequest0.rawPath());
      assertEquals("SNAPSHOT", nettyHttpRequest0.uri());
      assertEquals(16384, BigArrays.PAGE_SIZE_IN_BYTES);
      assertEquals(4096, BigArrays.INT_PAGE_SIZE);
      assertEquals(16384, BigArrays.BYTE_PAGE_SIZE);
      assertEquals(2048, BigArrays.LONG_PAGE_SIZE);
      assertEquals(2048, BigArrays.OBJECT_PAGE_SIZE);
      assertNotNull(nettyHttpRequest0);
      
      NettyHttpChannel nettyHttpChannel0 = new NettyHttpChannel(nettyHttpServerTransport0, nettyHttpRequest0, boolean0);
      assertEquals(0, metaData0.getTotalNumberOfShards());
      assertEquals(0L, metaData0.version());
      assertEquals(0, metaData0.getNumberOfShards());
      assertEquals("_na_", metaData0.clusterUUID());
      assertEquals(Lifecycle.State.INITIALIZED, nettyHttpServerTransport0.lifecycleState());
      assertEquals(2048, httpVersion0.getMajorVersion());
      assertTrue(httpVersion0.isKeepAliveDefault());
      assertEquals("GATEWAY", httpVersion0.getProtocolName());
      assertEquals(16384, httpVersion0.getMinorVersion());
      assertEquals("GATEWAY/2048.16384", httpVersion0.toString());
      assertEquals("GATEWAY/2048.16384", httpVersion0.getText());
      assertEquals("HEAD", httpMethod0.toString());
      assertEquals("HEAD", httpMethod0.getName());
      assertEquals("SNAPSHOT", defaultHttpRequest0.getUri());
      assertFalse(nettyHttpRequest0.hasContent());
      assertEquals(RestRequest.Method.HEAD, nettyHttpRequest0.method());
      assertEquals("SNAPSHOT", nettyHttpRequest0.rawPath());
      assertEquals("SNAPSHOT", nettyHttpRequest0.uri());
      assertTrue(nettyHttpChannel0.detailedErrorsEnabled());
      assertEquals(16384, BigArrays.PAGE_SIZE_IN_BYTES);
      assertEquals(4096, BigArrays.INT_PAGE_SIZE);
      assertEquals(16384, BigArrays.BYTE_PAGE_SIZE);
      assertEquals(2048, BigArrays.LONG_PAGE_SIZE);
      assertEquals(2048, BigArrays.OBJECT_PAGE_SIZE);
      assertNotNull(nettyHttpChannel0);
      
      Table table0 = restShardsAction0.getTableWithHeader(nettyHttpRequest0);
      assertEquals(0, metaData0.getTotalNumberOfShards());
      assertEquals(0L, metaData0.version());
      assertEquals(0, metaData0.getNumberOfShards());
      assertEquals("_na_", metaData0.clusterUUID());
      assertEquals(Lifecycle.State.INITIALIZED, restController0.lifecycleState());
      assertEquals(2048, httpVersion0.getMajorVersion());
      assertTrue(httpVersion0.isKeepAliveDefault());
      assertEquals("GATEWAY", httpVersion0.getProtocolName());
      assertEquals(16384, httpVersion0.getMinorVersion());
      assertEquals("GATEWAY/2048.16384", httpVersion0.toString());
      assertEquals("GATEWAY/2048.16384", httpVersion0.getText());
      assertEquals("HEAD", httpMethod0.toString());
      assertEquals("HEAD", httpMethod0.getName());
      assertEquals("SNAPSHOT", defaultHttpRequest0.getUri());
      assertFalse(nettyHttpRequest0.hasContent());
      assertEquals(RestRequest.Method.HEAD, nettyHttpRequest0.method());
      assertEquals("SNAPSHOT", nettyHttpRequest0.rawPath());
      assertEquals("SNAPSHOT", nettyHttpRequest0.uri());
      assertEquals(16384, BigArrays.PAGE_SIZE_IN_BYTES);
      assertEquals(4096, BigArrays.INT_PAGE_SIZE);
      assertEquals(16384, BigArrays.BYTE_PAGE_SIZE);
      assertEquals(2048, BigArrays.LONG_PAGE_SIZE);
      assertEquals(2048, BigArrays.OBJECT_PAGE_SIZE);
      assertNotNull(table0);
      
      StringBuilder stringBuilder0 = new StringBuilder(bigArrays0.OBJECT_PAGE_SIZE);
      assertEquals("", stringBuilder0.toString());
      assertEquals(16384, BigArrays.PAGE_SIZE_IN_BYTES);
      assertEquals(4096, BigArrays.INT_PAGE_SIZE);
      assertEquals(16384, BigArrays.BYTE_PAGE_SIZE);
      assertEquals(2048, BigArrays.LONG_PAGE_SIZE);
      assertEquals(2048, BigArrays.OBJECT_PAGE_SIZE);
      assertNotNull(stringBuilder0);
      
      restShardsAction0.documentation(stringBuilder0);
      assertEquals(0, metaData0.getTotalNumberOfShards());
      assertEquals(0L, metaData0.version());
      assertEquals(0, metaData0.getNumberOfShards());
      assertEquals("_na_", metaData0.clusterUUID());
      assertEquals("/_cat/shards\n/_cat/shards/{index}\n", stringBuilder0.toString());
      assertEquals(Lifecycle.State.INITIALIZED, restController0.lifecycleState());
      assertEquals(16384, BigArrays.PAGE_SIZE_IN_BYTES);
      assertEquals(4096, BigArrays.INT_PAGE_SIZE);
      assertEquals(16384, BigArrays.BYTE_PAGE_SIZE);
      assertEquals(2048, BigArrays.LONG_PAGE_SIZE);
      assertEquals(2048, BigArrays.OBJECT_PAGE_SIZE);
      
      // Undeclared exception!
      try { 
        restShardsAction0.doRequest(nettyHttpRequest0, nettyHttpChannel0, client0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.rest.action.cat.RestShardsAction", e);
      }
  }

  @Test(timeout = 11000)
  public void test1()  throws Throwable  {
      Settings settings0 = Settings.Builder.EMPTY_SETTINGS;
      assertNotNull(settings0);
      
      RestController restController0 = new RestController(settings0);
      assertEquals(Lifecycle.State.INITIALIZED, restController0.lifecycleState());
      assertNotNull(restController0);
      
      Client client0 = null;
      RestShardsAction restShardsAction0 = new RestShardsAction(settings0, restController0, client0);
      assertEquals(Lifecycle.State.INITIALIZED, restController0.lifecycleState());
      assertNotNull(restShardsAction0);
  }

  @Test(timeout = 11000)
  public void test2()  throws Throwable  {
      IndexMetaData indexMetaData0 = IndexMetaData.PROTO;
      assertEquals(IndexMetaData.State.OPEN, indexMetaData0.getState());
      assertEquals(0, indexMetaData0.getNumberOfReplicas());
      assertEquals("_na_", indexMetaData0.getIndexUUID());
      assertEquals(1, indexMetaData0.getNumberOfShards());
      assertEquals(1L, indexMetaData0.getVersion());
      assertEquals(1, indexMetaData0.getTotalNumberOfShards());
      assertNotNull(indexMetaData0);
      
      Settings settings0 = indexMetaData0.getSettings();
      assertEquals(IndexMetaData.State.OPEN, indexMetaData0.getState());
      assertEquals(0, indexMetaData0.getNumberOfReplicas());
      assertEquals("_na_", indexMetaData0.getIndexUUID());
      assertEquals(1, indexMetaData0.getNumberOfShards());
      assertEquals(1L, indexMetaData0.getVersion());
      assertEquals(1, indexMetaData0.getTotalNumberOfShards());
      assertNotNull(settings0);
      
      RestController restController0 = null;
      String string0 = null;
      MappingMetaData mappingMetaData0 = indexMetaData0.mappingOrDefault(string0);
      assertEquals(IndexMetaData.State.OPEN, indexMetaData0.getState());
      assertEquals(0, indexMetaData0.getNumberOfReplicas());
      assertEquals("_na_", indexMetaData0.getIndexUUID());
      assertEquals(1, indexMetaData0.getNumberOfShards());
      assertEquals(1L, indexMetaData0.getVersion());
      assertEquals(1, indexMetaData0.getTotalNumberOfShards());
      assertNull(mappingMetaData0);
      
      Client client0 = null;
      RestShardsAction restShardsAction0 = null;
      try {
        restShardsAction0 = new RestShardsAction(settings0, restController0, client0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.rest.action.cat.RestShardsAction", e);
      }
  }

  @Test(timeout = 11000)
  public void test3()  throws Throwable  {
      ESLogger eSLogger0 = null;
      MetaData metaData0 = MetaData.PROTO;
      assertEquals(0, metaData0.getTotalNumberOfShards());
      assertEquals(0, metaData0.getNumberOfShards());
      assertEquals(0L, metaData0.version());
      assertEquals("_na_", metaData0.clusterUUID());
      assertNotNull(metaData0);
      
      MetaData metaData1 = MetaData.addDefaultUnitsIfNeeded(eSLogger0, metaData0);
      assertEquals(0, metaData0.getTotalNumberOfShards());
      assertEquals(0, metaData0.getNumberOfShards());
      assertEquals(0L, metaData0.version());
      assertEquals("_na_", metaData0.clusterUUID());
      assertEquals("_na_", metaData1.clusterUUID());
      assertEquals(0, metaData1.getTotalNumberOfShards());
      assertEquals(0L, metaData1.version());
      assertEquals(0, metaData1.getNumberOfShards());
      assertNotNull(metaData1);
      assertSame(metaData0, metaData1);
      assertSame(metaData1, metaData0);
      
      Settings settings0 = metaData1.settings();
      assertEquals(0, metaData0.getTotalNumberOfShards());
      assertEquals(0, metaData0.getNumberOfShards());
      assertEquals(0L, metaData0.version());
      assertEquals("_na_", metaData0.clusterUUID());
      assertEquals("_na_", metaData1.clusterUUID());
      assertEquals(0, metaData1.getTotalNumberOfShards());
      assertEquals(0L, metaData1.version());
      assertEquals(0, metaData1.getNumberOfShards());
      assertNotNull(settings0);
      assertSame(metaData0, metaData1);
      assertSame(metaData1, metaData0);
      
      RestController restController0 = new RestController(settings0);
      assertEquals(0, metaData0.getTotalNumberOfShards());
      assertEquals(0, metaData0.getNumberOfShards());
      assertEquals(0L, metaData0.version());
      assertEquals("_na_", metaData0.clusterUUID());
      assertEquals("_na_", metaData1.clusterUUID());
      assertEquals(0, metaData1.getTotalNumberOfShards());
      assertEquals(0L, metaData1.version());
      assertEquals(0, metaData1.getNumberOfShards());
      assertEquals(Lifecycle.State.INITIALIZED, restController0.lifecycleState());
      assertNotNull(restController0);
      
      Client client0 = null;
      RestShardsAction restShardsAction0 = new RestShardsAction(settings0, restController0, client0);
      assertEquals(0, metaData0.getTotalNumberOfShards());
      assertEquals(0, metaData0.getNumberOfShards());
      assertEquals(0L, metaData0.version());
      assertEquals("_na_", metaData0.clusterUUID());
      assertEquals("_na_", metaData1.clusterUUID());
      assertEquals(0, metaData1.getTotalNumberOfShards());
      assertEquals(0L, metaData1.version());
      assertEquals(0, metaData1.getNumberOfShards());
      assertEquals(Lifecycle.State.INITIALIZED, restController0.lifecycleState());
      assertNotNull(restShardsAction0);
      
      int int0 = 2959;
      StringBuilder stringBuilder0 = new StringBuilder(int0);
      assertEquals("", stringBuilder0.toString());
      assertNotNull(stringBuilder0);
      
      int int1 = 0;
      char char0 = '/';
      StringBuilder stringBuilder1 = stringBuilder0.insert(int1, char0);
      assertEquals("/", stringBuilder0.toString());
      assertEquals("/", stringBuilder1.toString());
      assertNotNull(stringBuilder1);
      assertSame(stringBuilder0, stringBuilder1);
      assertSame(stringBuilder1, stringBuilder0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      
      int int2 = 0;
      int int3 = 0;
      StringBuilder stringBuilder2 = stringBuilder1.insert(int2, int3);
      assertEquals("0/", stringBuilder0.toString());
      assertEquals("0/", stringBuilder1.toString());
      assertEquals("0/", stringBuilder2.toString());
      assertNotNull(stringBuilder2);
      assertSame(stringBuilder0, stringBuilder1);
      assertSame(stringBuilder0, stringBuilder2);
      assertSame(stringBuilder1, stringBuilder0);
      assertSame(stringBuilder1, stringBuilder2);
      assertSame(stringBuilder2, stringBuilder1);
      assertSame(stringBuilder2, stringBuilder0);
      assertFalse(int0 == int1);
      assertFalse(int0 == int3);
      assertFalse(int0 == int2);
      assertFalse(int1 == int0);
      assertFalse(int2 == int0);
      assertFalse(int3 == int0);
      
      restShardsAction0.documentation(stringBuilder2);
      assertEquals(0, metaData0.getTotalNumberOfShards());
      assertEquals(0, metaData0.getNumberOfShards());
      assertEquals(0L, metaData0.version());
      assertEquals("_na_", metaData0.clusterUUID());
      assertEquals("_na_", metaData1.clusterUUID());
      assertEquals(0, metaData1.getTotalNumberOfShards());
      assertEquals(0L, metaData1.version());
      assertEquals(0, metaData1.getNumberOfShards());
      assertEquals(Lifecycle.State.INITIALIZED, restController0.lifecycleState());
      assertEquals("0//_cat/shards\n/_cat/shards/{index}\n", stringBuilder0.toString());
      assertEquals("0//_cat/shards\n/_cat/shards/{index}\n", stringBuilder1.toString());
      assertEquals("0//_cat/shards\n/_cat/shards/{index}\n", stringBuilder2.toString());
      assertSame(metaData0, metaData1);
      assertSame(metaData1, metaData0);
      assertSame(stringBuilder0, stringBuilder1);
      assertSame(stringBuilder0, stringBuilder2);
      assertSame(stringBuilder1, stringBuilder0);
      assertSame(stringBuilder1, stringBuilder2);
      assertSame(stringBuilder2, stringBuilder1);
      assertSame(stringBuilder2, stringBuilder0);
      assertFalse(int0 == int1);
      assertFalse(int0 == int3);
      assertFalse(int0 == int2);
      assertFalse(int1 == int0);
      assertFalse(int2 == int0);
      assertFalse(int3 == int0);
  }

  @Test(timeout = 11000)
  public void test4()  throws Throwable  {
      Settings settings0 = Settings.EMPTY;
      assertNotNull(settings0);
      
      RestController restController0 = new RestController(settings0);
      assertEquals(Lifecycle.State.INITIALIZED, restController0.lifecycleState());
      assertNotNull(restController0);
      
      Client client0 = null;
      RestShardsAction restShardsAction0 = new RestShardsAction(settings0, restController0, client0);
      assertEquals(Lifecycle.State.INITIALIZED, restController0.lifecycleState());
      assertNotNull(restShardsAction0);
      
      HttpVersion httpVersion0 = HttpVersion.HTTP_1_1;
      assertEquals(1, httpVersion0.getMinorVersion());
      assertTrue(httpVersion0.isKeepAliveDefault());
      assertEquals("HTTP", httpVersion0.getProtocolName());
      assertEquals("HTTP/1.1", httpVersion0.toString());
      assertEquals("HTTP/1.1", httpVersion0.getText());
      assertEquals(1, httpVersion0.getMajorVersion());
      assertNotNull(httpVersion0);
      
      HttpMethod httpMethod0 = HttpMethod.CONNECT;
      assertEquals("CONNECT", httpMethod0.toString());
      assertEquals("CONNECT", httpMethod0.getName());
      assertNotNull(httpMethod0);
      
      String string0 = "";
      DefaultHttpRequest defaultHttpRequest0 = new DefaultHttpRequest(httpVersion0, httpMethod0, string0);
      assertEquals(1, httpVersion0.getMinorVersion());
      assertTrue(httpVersion0.isKeepAliveDefault());
      assertEquals("HTTP", httpVersion0.getProtocolName());
      assertEquals("HTTP/1.1", httpVersion0.toString());
      assertEquals("HTTP/1.1", httpVersion0.getText());
      assertEquals(1, httpVersion0.getMajorVersion());
      assertEquals("CONNECT", httpMethod0.toString());
      assertEquals("CONNECT", httpMethod0.getName());
      assertEquals("", defaultHttpRequest0.getUri());
      assertNotNull(defaultHttpRequest0);
      
      DefaultChannelPipeline defaultChannelPipeline0 = new DefaultChannelPipeline();
      assertFalse(defaultChannelPipeline0.isAttached());
      assertNotNull(defaultChannelPipeline0);
      
      Channel channel0 = defaultChannelPipeline0.getChannel();
      assertFalse(defaultChannelPipeline0.isAttached());
      assertNull(channel0);
      
      NettyHttpRequest nettyHttpRequest0 = new NettyHttpRequest(defaultHttpRequest0, channel0);
      assertEquals(1, httpVersion0.getMinorVersion());
      assertTrue(httpVersion0.isKeepAliveDefault());
      assertEquals("HTTP", httpVersion0.getProtocolName());
      assertEquals("HTTP/1.1", httpVersion0.toString());
      assertEquals("HTTP/1.1", httpVersion0.getText());
      assertEquals(1, httpVersion0.getMajorVersion());
      assertEquals("CONNECT", httpMethod0.toString());
      assertEquals("CONNECT", httpMethod0.getName());
      assertEquals("", defaultHttpRequest0.getUri());
      assertFalse(defaultChannelPipeline0.isAttached());
      assertEquals(RestRequest.Method.GET, nettyHttpRequest0.method());
      assertFalse(nettyHttpRequest0.hasContent());
      assertEquals("", nettyHttpRequest0.rawPath());
      assertEquals("", nettyHttpRequest0.uri());
      assertNotNull(nettyHttpRequest0);
      
      Table table0 = restShardsAction0.getTableWithHeader(nettyHttpRequest0);
      assertEquals(Lifecycle.State.INITIALIZED, restController0.lifecycleState());
      assertEquals(1, httpVersion0.getMinorVersion());
      assertTrue(httpVersion0.isKeepAliveDefault());
      assertEquals("HTTP", httpVersion0.getProtocolName());
      assertEquals("HTTP/1.1", httpVersion0.toString());
      assertEquals("HTTP/1.1", httpVersion0.getText());
      assertEquals(1, httpVersion0.getMajorVersion());
      assertEquals("CONNECT", httpMethod0.toString());
      assertEquals("CONNECT", httpMethod0.getName());
      assertEquals("", defaultHttpRequest0.getUri());
      assertFalse(defaultChannelPipeline0.isAttached());
      assertEquals(RestRequest.Method.GET, nettyHttpRequest0.method());
      assertFalse(nettyHttpRequest0.hasContent());
      assertEquals("", nettyHttpRequest0.rawPath());
      assertEquals("", nettyHttpRequest0.uri());
      assertNotNull(table0);
  }

  @Test(timeout = 11000)
  public void test5()  throws Throwable  {
      Settings settings0 = Settings.EMPTY;
      assertNotNull(settings0);
      
      RestController restController0 = new RestController(settings0);
      assertEquals(Lifecycle.State.INITIALIZED, restController0.lifecycleState());
      assertNotNull(restController0);
      
      Client client0 = null;
      RestShardsAction restShardsAction0 = new RestShardsAction(settings0, restController0, client0);
      assertEquals(Lifecycle.State.INITIALIZED, restController0.lifecycleState());
      assertNotNull(restShardsAction0);
      
      StringBuilder stringBuilder0 = null;
      RestFilter restFilter0 = mock(RestFilter.class, new ViolatedAssumptionAnswer());
      restController0.registerFilter(restFilter0);
      assertEquals(Lifecycle.State.INITIALIZED, restController0.lifecycleState());
      
      // Undeclared exception!
      try { 
        restShardsAction0.documentation(stringBuilder0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.rest.action.cat.RestShardsAction", e);
      }
  }

  @Test(timeout = 11000)
  public void test6()  throws Throwable  {
      MetaData metaData0 = MetaData.EMPTY_META_DATA;
      assertEquals("_na_", metaData0.clusterUUID());
      assertEquals(0, metaData0.getNumberOfShards());
      assertEquals(0L, metaData0.version());
      assertEquals(0, metaData0.getTotalNumberOfShards());
      assertNotNull(metaData0);
      
      Settings settings0 = metaData0.persistentSettings();
      assertEquals("_na_", metaData0.clusterUUID());
      assertEquals(0, metaData0.getNumberOfShards());
      assertEquals(0L, metaData0.version());
      assertEquals(0, metaData0.getTotalNumberOfShards());
      assertNotNull(settings0);
      
      RestController restController0 = new RestController(settings0);
      assertEquals("_na_", metaData0.clusterUUID());
      assertEquals(0, metaData0.getNumberOfShards());
      assertEquals(0L, metaData0.version());
      assertEquals(0, metaData0.getTotalNumberOfShards());
      assertEquals(Lifecycle.State.INITIALIZED, restController0.lifecycleState());
      assertNotNull(restController0);
      
      Client client0 = null;
      RestShardsAction restShardsAction0 = new RestShardsAction(settings0, restController0, client0);
      assertEquals("_na_", metaData0.clusterUUID());
      assertEquals(0, metaData0.getNumberOfShards());
      assertEquals(0L, metaData0.version());
      assertEquals(0, metaData0.getTotalNumberOfShards());
      assertEquals(Lifecycle.State.INITIALIZED, restController0.lifecycleState());
      assertNotNull(restShardsAction0);
      
      RestRequest restRequest0 = null;
      Table table0 = restShardsAction0.getTableWithHeader(restRequest0);
      assertEquals("_na_", metaData0.clusterUUID());
      assertEquals(0, metaData0.getNumberOfShards());
      assertEquals(0L, metaData0.version());
      assertEquals(0, metaData0.getTotalNumberOfShards());
      assertEquals(Lifecycle.State.INITIALIZED, restController0.lifecycleState());
      assertNotNull(table0);
      
      // Undeclared exception!
      restShardsAction0.getTableWithHeader(restRequest0);
  }

  @Test(timeout = 11000)
  public void test7()  throws Throwable  {
      long long0 = (-1L);
      System.setCurrentTimeMillis(long0);
      Settings settings0 = Settings.EMPTY;
      assertNotNull(settings0);
      
      RestController restController0 = new RestController(settings0);
      assertEquals(Lifecycle.State.INITIALIZED, restController0.lifecycleState());
      assertNotNull(restController0);
      
      Client client0 = null;
      RestShardsAction restShardsAction0 = new RestShardsAction(settings0, restController0, client0);
      assertEquals(Lifecycle.State.INITIALIZED, restController0.lifecycleState());
      assertNotNull(restShardsAction0);
      
      HttpVersion httpVersion0 = HttpVersion.HTTP_1_0;
      assertEquals(0, httpVersion0.getMinorVersion());
      assertEquals("HTTP/1.0", httpVersion0.getText());
      assertEquals(1, httpVersion0.getMajorVersion());
      assertEquals("HTTP", httpVersion0.getProtocolName());
      assertEquals("HTTP/1.0", httpVersion0.toString());
      assertFalse(httpVersion0.isKeepAliveDefault());
      assertNotNull(httpVersion0);
      
      HttpMethod httpMethod0 = HttpMethod.TRACE;
      assertEquals("TRACE", httpMethod0.toString());
      assertEquals("TRACE", httpMethod0.getName());
      assertNotNull(httpMethod0);
      
      String string0 = "";
      DefaultHttpRequest defaultHttpRequest0 = new DefaultHttpRequest(httpVersion0, httpMethod0, string0);
      assertEquals(0, httpVersion0.getMinorVersion());
      assertEquals("HTTP/1.0", httpVersion0.getText());
      assertEquals(1, httpVersion0.getMajorVersion());
      assertEquals("HTTP", httpVersion0.getProtocolName());
      assertEquals("HTTP/1.0", httpVersion0.toString());
      assertFalse(httpVersion0.isKeepAliveDefault());
      assertEquals("TRACE", httpMethod0.toString());
      assertEquals("TRACE", httpMethod0.getName());
      assertEquals("", defaultHttpRequest0.getUri());
      assertNotNull(defaultHttpRequest0);
      
      DefaultLocalServerChannelFactory defaultLocalServerChannelFactory0 = new DefaultLocalServerChannelFactory();
      assertNotNull(defaultLocalServerChannelFactory0);
      
      DefaultChannelPipeline defaultChannelPipeline0 = new DefaultChannelPipeline();
      assertFalse(defaultChannelPipeline0.isAttached());
      assertNotNull(defaultChannelPipeline0);
      
      LocalServerChannel localServerChannel0 = defaultLocalServerChannelFactory0.newChannel(defaultChannelPipeline0);
      assertTrue(defaultChannelPipeline0.isAttached());
      assertTrue(localServerChannel0.isReadable());
      assertEquals(0, (int)localServerChannel0.getId());
      assertNotNull(localServerChannel0);
      
      NettyHttpRequest nettyHttpRequest0 = new NettyHttpRequest(defaultHttpRequest0, localServerChannel0);
      assertEquals(0, httpVersion0.getMinorVersion());
      assertEquals("HTTP/1.0", httpVersion0.getText());
      assertEquals(1, httpVersion0.getMajorVersion());
      assertEquals("HTTP", httpVersion0.getProtocolName());
      assertEquals("HTTP/1.0", httpVersion0.toString());
      assertFalse(httpVersion0.isKeepAliveDefault());
      assertEquals("TRACE", httpMethod0.toString());
      assertEquals("TRACE", httpMethod0.getName());
      assertEquals("", defaultHttpRequest0.getUri());
      assertTrue(defaultChannelPipeline0.isAttached());
      assertTrue(localServerChannel0.isReadable());
      assertEquals(0, (int)localServerChannel0.getId());
      assertEquals("", nettyHttpRequest0.uri());
      assertFalse(nettyHttpRequest0.hasContent());
      assertEquals(RestRequest.Method.GET, nettyHttpRequest0.method());
      assertEquals("", nettyHttpRequest0.rawPath());
      assertNotNull(nettyHttpRequest0);
      
      NettyHttpServerTransport nettyHttpServerTransport0 = null;
      boolean boolean0 = false;
      NettyHttpChannel nettyHttpChannel0 = new NettyHttpChannel(nettyHttpServerTransport0, nettyHttpRequest0, boolean0);
      assertFalse(nettyHttpChannel0.detailedErrorsEnabled());
      assertEquals(0, httpVersion0.getMinorVersion());
      assertEquals("HTTP/1.0", httpVersion0.getText());
      assertEquals(1, httpVersion0.getMajorVersion());
      assertEquals("HTTP", httpVersion0.getProtocolName());
      assertEquals("HTTP/1.0", httpVersion0.toString());
      assertFalse(httpVersion0.isKeepAliveDefault());
      assertEquals("TRACE", httpMethod0.toString());
      assertEquals("TRACE", httpMethod0.getName());
      assertEquals("", defaultHttpRequest0.getUri());
      assertTrue(defaultChannelPipeline0.isAttached());
      assertTrue(localServerChannel0.isReadable());
      assertEquals(0, (int)localServerChannel0.getId());
      assertEquals("", nettyHttpRequest0.uri());
      assertFalse(nettyHttpRequest0.hasContent());
      assertEquals(RestRequest.Method.GET, nettyHttpRequest0.method());
      assertEquals("", nettyHttpRequest0.rawPath());
      assertNotNull(nettyHttpChannel0);
      
      // Undeclared exception!
      try { 
        restShardsAction0.doRequest(nettyHttpRequest0, nettyHttpChannel0, client0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.elasticsearch.rest.action.cat.RestShardsAction", e);
      }
  }
}
