/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Nov 04 20:32:05 GMT 2021
 */

package org.webbitserver.netty;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class WebSocketClient$HandshakeChannelHandler_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    /*No java.lang.System property to set*/
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(WebSocketClient$HandshakeChannelHandler_ESTest_scaffolding.class.getClassLoader() ,
      "org.webbitserver.handler.exceptions.SilentExceptionHandler",
      "org.jboss.netty.channel.local.LocalChannel",
      "org.jboss.netty.channel.ChildChannelStateEvent",
      "org.jboss.netty.channel.DefaultChildChannelStateEvent",
      "org.jboss.netty.logging.JdkLoggerFactory",
      "org.jboss.netty.channel.DefaultServerChannelConfig",
      "org.jboss.netty.handler.codec.http.HttpMethod",
      "org.jboss.netty.channel.socket.nio.NioAcceptedSocketChannel",
      "org.jboss.netty.channel.CompleteChannelFuture",
      "org.webbitserver.netty.NettyWebSocketConnection",
      "org.jboss.netty.handler.codec.http.DefaultHttpMessage",
      "org.jboss.netty.channel.ChannelPipeline",
      "org.jboss.netty.channel.ChannelFutureListener",
      "org.jboss.netty.buffer.DynamicChannelBuffer",
      "org.jboss.netty.channel.socket.oio.OioClientSocketChannel",
      "org.jboss.netty.util.internal.AtomicFieldUpdaterUtil",
      "org.jboss.netty.logging.InternalLoggerFactory$1",
      "org.jboss.netty.channel.LifeCycleAwareChannelHandler",
      "org.jboss.netty.channel.ChannelHandlerLifeCycleException",
      "org.webbitserver.netty.WebSocketConnectionHandler",
      "org.jboss.netty.channel.UpstreamMessageEvent",
      "org.jboss.netty.util.internal.DeadLockProofWorker",
      "org.jboss.netty.channel.socket.oio.OioDatagramPipelineSink",
      "org.jboss.netty.channel.ChannelException",
      "org.jboss.netty.channel.SimpleChannelUpstreamHandler$1",
      "org.jboss.netty.channel.SucceededChannelFuture",
      "org.jboss.netty.channel.SimpleChannelUpstreamHandler",
      "org.jboss.netty.buffer.ByteBufferBackedChannelBuffer",
      "org.webbitserver.WebSocketHandler",
      "org.jboss.netty.channel.ChannelConfig",
      "org.jboss.netty.util.internal.ConversionUtil",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool$SendBuffer",
      "org.jboss.netty.logging.AbstractInternalLogger",
      "org.jboss.netty.buffer.ReadOnlyChannelBuffer",
      "org.jboss.netty.handler.codec.http.HttpVersion",
      "org.jboss.netty.channel.ChannelEvent",
      "org.jboss.netty.util.DebugUtil",
      "org.jboss.netty.util.internal.StackTraceSimplifier",
      "org.jboss.netty.buffer.LittleEndianHeapChannelBuffer",
      "org.jboss.netty.channel.DownstreamMessageEvent",
      "org.webbitserver.WebSocketConnection",
      "org.jboss.netty.channel.SimpleChannelHandler",
      "org.jboss.netty.channel.local.LocalServerChannel",
      "org.jboss.netty.channel.socket.http.HttpTunnelingClientSocketChannel",
      "org.jboss.netty.buffer.ChannelBuffers",
      "org.jboss.netty.channel.socket.ServerSocketChannelFactory",
      "org.jboss.netty.channel.DefaultWriteCompletionEvent",
      "org.webbitserver.WebbitException",
      "org.jboss.netty.handler.ssl.SslHandler$ClosingChannelFutureListener",
      "org.jboss.netty.channel.socket.DatagramChannel",
      "org.jboss.netty.channel.ServerChannel",
      "org.jboss.netty.channel.ChannelUpstreamHandler",
      "org.jboss.netty.util.internal.ConcurrentHashMap$HashEntry",
      "org.jboss.netty.channel.ChannelHandler",
      "org.jboss.netty.util.internal.ConcurrentHashMap",
      "org.jboss.netty.channel.socket.DatagramChannelFactory",
      "org.jboss.netty.handler.codec.http.HttpMessage",
      "org.jboss.netty.handler.codec.http.HttpHeaders",
      "org.jboss.netty.channel.socket.nio.NioWorker",
      "org.jboss.netty.channel.StaticChannelPipeline",
      "org.jboss.netty.channel.local.DefaultLocalServerChannelFactory",
      "org.jboss.netty.channel.SimpleChannelDownstreamHandler",
      "org.jboss.netty.handler.codec.embedder.AbstractCodecEmbedder$EmbeddedChannelSink",
      "org.jboss.netty.channel.Channel",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool$Preallocation",
      "org.jboss.netty.channel.local.LocalClientChannelSink",
      "org.jboss.netty.handler.codec.http.HttpResponseStatus",
      "org.jboss.netty.channel.AbstractChannel",
      "org.jboss.netty.channel.UpstreamChannelStateEvent",
      "org.jboss.netty.handler.timeout.WriteTimeoutHandler$TimeoutCanceller",
      "org.jboss.netty.logging.JdkLogger",
      "org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler$1",
      "org.jboss.netty.channel.socket.nio.NioClientSocketChannel",
      "org.jboss.netty.channel.WriteCompletionEvent",
      "org.jboss.netty.channel.FailedChannelFuture",
      "org.jboss.netty.channel.AbstractChannelSink",
      "org.webbitserver.netty.NettyHttpRequest",
      "org.jboss.netty.buffer.HeapChannelBuffer",
      "org.jboss.netty.buffer.SlicedChannelBuffer",
      "org.webbitserver.netty.ConnectionHelper",
      "org.jboss.netty.bootstrap.ClientBootstrap",
      "org.jboss.netty.buffer.TruncatedChannelBuffer",
      "org.jboss.netty.channel.socket.nio.NioSocketChannel",
      "org.jboss.netty.util.CharsetUtil",
      "org.jboss.netty.util.CharsetUtil$1",
      "org.jboss.netty.util.CharsetUtil$2",
      "org.webbitserver.netty.CatchingRunnable",
      "org.jboss.netty.channel.local.DefaultLocalServerChannel",
      "org.jboss.netty.channel.socket.nio.NioClientSocketPipelineSink",
      "org.jboss.netty.channel.ChannelFutureProgressListener",
      "org.jboss.netty.buffer.ChannelBufferFactory",
      "org.jboss.netty.channel.local.LocalServerChannelFactory",
      "org.jboss.netty.buffer.ChannelBuffer",
      "org.webbitserver.netty.WebSocketClient$1",
      "org.jboss.netty.channel.socket.ServerSocketChannel",
      "org.jboss.netty.buffer.AbstractChannelBuffer",
      "org.jboss.netty.handler.codec.http.HttpRequest",
      "org.jboss.netty.buffer.DuplicatedChannelBuffer",
      "org.jboss.netty.channel.socket.nio.NioClientSocketChannelFactory",
      "org.jboss.netty.handler.codec.http.DefaultHttpResponse",
      "org.jboss.netty.buffer.BigEndianHeapChannelBuffer",
      "org.jboss.netty.channel.socket.ClientSocketChannelFactory",
      "org.webbitserver.netty.AbstractHttpConnection",
      "org.jboss.netty.util.internal.ConcurrentHashMap$Segment",
      "org.jboss.netty.channel.ChannelState",
      "org.jboss.netty.logging.InternalLoggerFactory",
      "org.jboss.netty.channel.local.LocalAddress",
      "org.jboss.netty.channel.Channels",
      "org.webbitserver.netty.WebSocketConnectionHandler$1",
      "org.jboss.netty.handler.codec.embedder.EmbeddedChannel",
      "org.jboss.netty.channel.ExceptionEvent",
      "org.webbitserver.helpers.Base64",
      "org.jboss.netty.channel.socket.nio.NioServerSocketPipelineSink",
      "org.jboss.netty.util.internal.SystemPropertyUtil",
      "org.jboss.netty.channel.socket.nio.NioDatagramPipelineSink",
      "org.webbitserver.handler.exceptions.PrintStackTraceExceptionHandler",
      "org.jboss.netty.channel.StaticChannelPipeline$StaticChannelHandlerContext",
      "org.jboss.netty.channel.socket.http.HttpTunnelingClientSocketPipelineSink",
      "org.jboss.netty.channel.DefaultChannelPipeline",
      "org.jboss.netty.util.internal.LinkedTransferQueue$Node",
      "org.jboss.netty.channel.AbstractChannel$ChannelCloseFuture",
      "org.jboss.netty.handler.codec.http.HttpHeaders$Entry",
      "org.jboss.netty.channel.local.DefaultLocalChannel$1",
      "org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext",
      "org.jboss.netty.channel.ChannelPipelineFactory",
      "org.jboss.netty.util.internal.ThreadLocalBoolean",
      "org.jboss.netty.channel.DefaultExceptionEvent",
      "org.jboss.netty.channel.socket.oio.OioDatagramChannel",
      "org.jboss.netty.buffer.AbstractChannelBufferFactory",
      "org.jboss.netty.handler.codec.http.HttpCodecUtil",
      "org.jboss.netty.util.internal.LinkedTransferQueue",
      "org.jboss.netty.channel.socket.nio.NioServerSocketChannel",
      "org.jboss.netty.channel.socket.SocketChannel",
      "org.jboss.netty.logging.InternalLogger",
      "org.jboss.netty.channel.local.DefaultLocalClientChannelFactory",
      "org.jboss.netty.util.ExternalResourceReleasable",
      "org.jboss.netty.buffer.CompositeChannelBuffer",
      "org.jboss.netty.channel.UpstreamChannelStateEvent$1",
      "org.jboss.netty.channel.socket.nio.SocketReceiveBufferPool",
      "org.jboss.netty.channel.socket.oio.OioClientSocketPipelineSink",
      "org.jboss.netty.channel.socket.nio.NioProviderMetadata",
      "org.jboss.netty.channel.socket.oio.OioSocketChannel",
      "org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler",
      "org.webbitserver.handler.logging.LoggingWebSocketHandler",
      "org.jboss.netty.buffer.HeapChannelBufferFactory",
      "org.jboss.netty.bootstrap.Bootstrap",
      "org.jboss.netty.buffer.ChannelBufferIndexFinder",
      "org.jboss.netty.channel.ChannelHandlerContext",
      "org.jboss.netty.channel.DefaultChannelPipeline$DiscardingChannelSink",
      "org.jboss.netty.channel.socket.oio.OioServerSocketPipelineSink",
      "org.jboss.netty.buffer.WrappedChannelBuffer",
      "org.webbitserver.HttpRequest",
      "org.jboss.netty.channel.ChannelFuture",
      "org.jboss.netty.channel.socket.nio.NioDatagramChannel",
      "org.jboss.netty.channel.Channels$1",
      "org.jboss.netty.handler.codec.http.DefaultHttpRequest",
      "org.jboss.netty.channel.socket.nio.NioClientSocketPipelineSink$Boss",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool",
      "org.jboss.netty.channel.AbstractServerChannel",
      "org.jboss.netty.channel.local.LocalServerChannelSink",
      "org.jboss.netty.channel.socket.oio.OioServerSocketChannel",
      "org.jboss.netty.buffer.DirectChannelBufferFactory",
      "org.jboss.netty.util.internal.AtomicFieldUpdaterUtil$Node",
      "org.webbitserver.netty.WebSocketClient",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool$EmptySendBuffer",
      "org.jboss.netty.channel.ChannelSink",
      "org.jboss.netty.channel.local.DefaultLocalChannel",
      "org.jboss.netty.channel.ServerChannelFactory",
      "org.jboss.netty.channel.ChannelPipelineException",
      "org.jboss.netty.channel.ChannelDownstreamHandler",
      "org.jboss.netty.channel.DefaultChannelConfig",
      "org.jboss.netty.channel.MessageEvent",
      "org.jboss.netty.channel.DownstreamChannelStateEvent",
      "org.jboss.netty.channel.ChannelStateEvent",
      "org.webbitserver.DataHolder",
      "org.jboss.netty.channel.local.LocalClientChannelFactory",
      "org.jboss.netty.handler.codec.http.HttpResponse",
      "org.jboss.netty.channel.socket.nio.SelectorUtil",
      "org.jboss.netty.channel.socket.oio.OioAcceptedSocketChannel",
      "org.jboss.netty.channel.DefaultChannelFuture",
      "org.webbitserver.HttpConnection",
      "org.jboss.netty.channel.ChannelFactory"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(WebSocketClient$HandshakeChannelHandler_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jboss.netty.logging.JdkLoggerFactory",
      "org.jboss.netty.util.DebugUtil",
      "org.jboss.netty.util.internal.SystemPropertyUtil",
      "org.jboss.netty.util.internal.StackTraceSimplifier",
      "org.jboss.netty.logging.InternalLoggerFactory",
      "org.jboss.netty.logging.AbstractInternalLogger",
      "org.jboss.netty.logging.JdkLogger",
      "org.jboss.netty.logging.InternalLoggerFactory$1",
      "org.jboss.netty.channel.SimpleChannelUpstreamHandler",
      "org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler",
      "org.webbitserver.netty.CatchingRunnable",
      "org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler$1",
      "org.webbitserver.netty.WebSocketClient",
      "org.webbitserver.helpers.Base64",
      "org.jboss.netty.channel.DefaultChannelPipeline$DiscardingChannelSink",
      "org.jboss.netty.channel.DefaultChannelPipeline",
      "org.jboss.netty.channel.UpstreamChannelStateEvent",
      "org.jboss.netty.handler.codec.http.DefaultHttpMessage",
      "org.jboss.netty.handler.codec.http.DefaultHttpRequest",
      "org.jboss.netty.handler.codec.http.HttpVersion",
      "org.jboss.netty.handler.codec.http.HttpMethod",
      "org.jboss.netty.handler.codec.http.HttpHeaders",
      "org.jboss.netty.handler.codec.http.HttpHeaders$Entry",
      "org.jboss.netty.buffer.AbstractChannelBuffer",
      "org.jboss.netty.buffer.HeapChannelBuffer",
      "org.jboss.netty.buffer.BigEndianHeapChannelBuffer",
      "org.jboss.netty.buffer.ChannelBuffers",
      "org.jboss.netty.util.CharsetUtil$1",
      "org.jboss.netty.util.CharsetUtil$2",
      "org.jboss.netty.util.CharsetUtil",
      "org.jboss.netty.handler.codec.http.HttpCodecUtil",
      "org.webbitserver.WebbitException",
      "org.jboss.netty.channel.DefaultWriteCompletionEvent",
      "org.webbitserver.handler.exceptions.PrintStackTraceExceptionHandler",
      "org.webbitserver.handler.exceptions.SilentExceptionHandler",
      "org.jboss.netty.channel.CompleteChannelFuture",
      "org.jboss.netty.channel.SucceededChannelFuture",
      "org.jboss.netty.channel.UpstreamMessageEvent",
      "org.jboss.netty.channel.StaticChannelPipeline",
      "org.jboss.netty.util.internal.ConversionUtil",
      "org.jboss.netty.channel.StaticChannelPipeline$StaticChannelHandlerContext",
      "org.jboss.netty.bootstrap.Bootstrap",
      "org.jboss.netty.bootstrap.ClientBootstrap",
      "org.jboss.netty.channel.socket.nio.NioClientSocketChannelFactory",
      "org.jboss.netty.channel.socket.nio.SelectorUtil",
      "org.jboss.netty.channel.AbstractChannelSink",
      "org.jboss.netty.channel.socket.nio.NioClientSocketPipelineSink",
      "org.jboss.netty.channel.socket.nio.NioClientSocketPipelineSink$Boss",
      "org.jboss.netty.util.internal.AtomicFieldUpdaterUtil$Node",
      "org.jboss.netty.util.internal.AtomicFieldUpdaterUtil",
      "org.jboss.netty.util.internal.LinkedTransferQueue",
      "org.jboss.netty.channel.socket.nio.NioProviderMetadata",
      "org.jboss.netty.channel.socket.nio.NioWorker",
      "org.jboss.netty.channel.socket.nio.SocketReceiveBufferPool",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool$EmptySendBuffer",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool$Preallocation",
      "org.jboss.netty.channel.Channels",
      "org.jboss.netty.channel.Channels$1",
      "org.webbitserver.netty.WebSocketClient$1",
      "org.jboss.netty.channel.DefaultChannelFuture",
      "org.jboss.netty.util.internal.DeadLockProofWorker",
      "org.jboss.netty.channel.FailedChannelFuture",
      "org.jboss.netty.handler.codec.http.HttpResponseStatus",
      "org.jboss.netty.handler.codec.http.DefaultHttpResponse",
      "org.jboss.netty.channel.local.DefaultLocalServerChannelFactory",
      "org.jboss.netty.channel.local.LocalServerChannelSink",
      "org.jboss.netty.util.internal.ConcurrentHashMap",
      "org.jboss.netty.util.internal.ConcurrentHashMap$Segment",
      "org.jboss.netty.util.internal.ConcurrentHashMap$HashEntry",
      "org.jboss.netty.channel.AbstractChannel",
      "org.jboss.netty.channel.AbstractServerChannel",
      "org.jboss.netty.channel.local.DefaultLocalServerChannel",
      "org.jboss.netty.channel.AbstractChannel$ChannelCloseFuture",
      "org.jboss.netty.channel.DefaultServerChannelConfig",
      "org.jboss.netty.buffer.AbstractChannelBufferFactory",
      "org.jboss.netty.buffer.HeapChannelBufferFactory",
      "org.jboss.netty.channel.SimpleChannelUpstreamHandler$1",
      "org.jboss.netty.channel.DefaultExceptionEvent",
      "org.jboss.netty.channel.DownstreamMessageEvent",
      "org.jboss.netty.channel.local.DefaultLocalClientChannelFactory",
      "org.jboss.netty.channel.local.LocalClientChannelSink",
      "org.jboss.netty.channel.local.DefaultLocalChannel",
      "org.jboss.netty.util.internal.ThreadLocalBoolean",
      "org.jboss.netty.channel.DefaultChannelConfig",
      "org.jboss.netty.channel.local.DefaultLocalChannel$1",
      "org.jboss.netty.channel.UpstreamChannelStateEvent$1",
      "org.jboss.netty.channel.DefaultChildChannelStateEvent",
      "org.webbitserver.netty.NettyHttpRequest",
      "org.webbitserver.netty.AbstractHttpConnection",
      "org.webbitserver.netty.NettyWebSocketConnection",
      "org.webbitserver.netty.WebSocketConnectionHandler",
      "org.webbitserver.netty.ConnectionHelper",
      "org.webbitserver.netty.WebSocketConnectionHandler$1",
      "org.jboss.netty.channel.SimpleChannelDownstreamHandler",
      "org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext",
      "org.jboss.netty.channel.SimpleChannelHandler"
    );
  }
}
