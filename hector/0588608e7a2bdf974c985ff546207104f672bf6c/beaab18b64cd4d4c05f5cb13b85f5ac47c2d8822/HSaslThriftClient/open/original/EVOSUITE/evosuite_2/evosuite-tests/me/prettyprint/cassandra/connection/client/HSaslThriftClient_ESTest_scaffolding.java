/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Nov 07 01:11:06 GMT 2021
 */

package me.prettyprint.cassandra.connection.client;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

@EvoSuiteClassExclude
public class HSaslThriftClient_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  protected static ExecutorService executor; 

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 10000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "me.prettyprint.cassandra.connection.client.HSaslThriftClient"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    executor = Executors.newCachedThreadPool(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    executor.shutdownNow(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
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
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.dir", "/home/CIN/lmps2/semanticConflicts/SMAT/output-test-dest/hector/0588608e7a2bdf974c985ff546207104f672bf6c/evosuite_2"); 
    java.lang.System.setProperty("user.home", "/home/CIN/lmps2"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "lmps2"); 
    java.lang.System.setProperty("user.timezone", "America/Recife"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(HSaslThriftClient_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.cassandra.thrift.Cassandra$Client",
      "org.apache.thrift.transport.TFileTransport",
      "me.prettyprint.cassandra.service.SystemProperties",
      "org.apache.thrift.transport.TTransportException",
      "org.apache.thrift.transport.TFramedTransport",
      "org.apache.cassandra.thrift.InvalidRequestException",
      "org.apache.thrift.protocol.TBinaryProtocol",
      "me.prettyprint.hector.api.exceptions.HectorException",
      "me.prettyprint.cassandra.connection.client.HClient",
      "org.apache.cassandra.thrift.Cassandra$Iface",
      "org.apache.thrift.transport.TTransport",
      "org.apache.commons.lang.NotImplementedException",
      "me.prettyprint.hector.api.exceptions.HectorTransportException",
      "org.apache.thrift.transport.TIOStreamTransport",
      "org.apache.thrift.transport.TSocket",
      "org.apache.thrift.TBase",
      "org.apache.thrift.transport.TMemoryBuffer",
      "org.apache.thrift.transport.TSSLTransportFactory$TSSLTransportParameters",
      "me.prettyprint.cassandra.connection.client.HSaslThriftClient$KerberosUserConfiguration",
      "me.prettyprint.cassandra.connection.client.HThriftClient",
      "org.apache.thrift.transport.AutoExpandingBuffer",
      "me.prettyprint.cassandra.service.CassandraHost",
      "org.apache.thrift.TServiceClient",
      "org.apache.thrift.transport.TStandardFile",
      "me.prettyprint.cassandra.connection.client.HSaslThriftClient$2",
      "org.apache.thrift.TByteArrayOutputStream",
      "org.apache.thrift.transport.TSaslTransport",
      "org.apache.thrift.transport.TSSLTransportFactory",
      "org.apache.thrift.TException",
      "org.apache.thrift.transport.AutoExpandingBufferWriteTransport",
      "org.apache.thrift.transport.TSaslClientTransport",
      "org.apache.thrift.transport.TSeekableFile",
      "org.apache.thrift.transport.TFileTransport$truncableBufferedInputStream",
      "org.apache.commons.lang.exception.Nestable",
      "me.prettyprint.hector.api.exceptions.HInvalidRequestException",
      "org.apache.thrift.protocol.TProtocol",
      "me.prettyprint.cassandra.connection.client.HSaslThriftClient"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(HSaslThriftClient_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "me.prettyprint.cassandra.connection.client.HThriftClient",
      "me.prettyprint.cassandra.connection.client.HSaslThriftClient$2",
      "me.prettyprint.cassandra.connection.client.HSaslThriftClient",
      "me.prettyprint.cassandra.connection.client.HSaslThriftClient$KerberosUserConfiguration",
      "me.prettyprint.cassandra.connection.client.HSaslThriftClient$1",
      "org.apache.thrift.transport.TTransport",
      "org.apache.thrift.transport.AutoExpandingBufferWriteTransport",
      "org.apache.thrift.transport.AutoExpandingBuffer",
      "org.apache.thrift.transport.TSSLTransportFactory$TSSLTransportParameters",
      "me.prettyprint.cassandra.service.SystemProperties",
      "org.apache.thrift.transport.THttpClient",
      "org.apache.thrift.TException",
      "org.apache.thrift.transport.TTransportException",
      "org.apache.thrift.transport.AutoExpandingBufferReadTransport",
      "me.prettyprint.cassandra.service.CassandraHost",
      "org.apache.thrift.transport.TFileTransport",
      "org.apache.thrift.transport.TFileTransport$tailPolicy",
      "org.apache.thrift.transport.TStandardFile",
      "org.apache.thrift.transport.TSSLTransportFactory",
      "me.prettyprint.hector.api.exceptions.HectorException",
      "me.prettyprint.hector.api.exceptions.HectorTransportException",
      "org.apache.thrift.transport.TIOStreamTransport",
      "org.apache.thrift.transport.TNonblockingTransport",
      "org.apache.thrift.transport.TNonblockingSocket",
      "org.apache.thrift.transport.TFastFramedTransport",
      "org.apache.thrift.transport.TMemoryInputTransport",
      "org.apache.thrift.transport.TSocket",
      "org.apache.thrift.transport.TFramedTransport",
      "org.apache.thrift.TByteArrayOutputStream",
      "org.apache.thrift.protocol.TStruct",
      "org.apache.thrift.protocol.TField",
      "org.apache.cassandra.thrift.ColumnDef$_Fields",
      "org.apache.thrift.meta_data.FieldMetaData",
      "org.apache.thrift.meta_data.FieldValueMetaData",
      "org.apache.thrift.meta_data.EnumMetaData",
      "org.apache.thrift.meta_data.MapMetaData",
      "org.apache.cassandra.thrift.ColumnDef",
      "org.apache.http.params.AbstractHttpParams",
      "org.apache.http.params.BasicHttpParams",
      "org.apache.http.params.DefaultedHttpParams",
      "org.apache.http.conn.scheme.SchemeRegistry",
      "org.apache.http.impl.conn.SingleClientConnManager",
      "org.apache.commons.logging.impl.Jdk14Logger",
      "org.apache.http.impl.conn.DefaultClientConnectionOperator",
      "org.apache.http.impl.conn.AbstractPoolEntry",
      "org.apache.http.impl.conn.SingleClientConnManager$PoolEntry",
      "org.apache.http.impl.AbstractHttpClientConnection",
      "org.apache.http.impl.SocketHttpClientConnection",
      "org.apache.http.impl.conn.DefaultClientConnection",
      "org.apache.http.impl.entity.EntitySerializer",
      "org.apache.http.impl.entity.StrictContentLengthStrategy",
      "org.apache.http.impl.entity.EntityDeserializer",
      "org.apache.http.impl.entity.LaxContentLengthStrategy",
      "org.apache.http.impl.client.AbstractHttpClient",
      "org.apache.http.impl.client.DefaultHttpClient",
      "org.apache.thrift.transport.TSaslTransport",
      "org.apache.thrift.transport.TSaslClientTransport",
      "org.apache.thrift.transport.TSaslTransport$SaslParticipant",
      "org.apache.cassandra.thrift.CfDef$_Fields",
      "org.apache.thrift.meta_data.ListMetaData",
      "org.apache.thrift.meta_data.StructMetaData",
      "org.apache.cassandra.thrift.CfDef",
      "org.apache.cassandra.thrift.AuthenticationRequest",
      "org.apache.http.conn.scheme.PlainSocketFactory",
      "org.apache.http.impl.client.DefaultRedirectHandler",
      "org.apache.http.ProtocolVersion",
      "org.apache.http.message.AbstractHttpMessage",
      "org.apache.http.message.BasicHttpResponse",
      "org.apache.http.message.BasicStatusLine",
      "org.apache.thrift.transport.TMemoryBuffer",
      "org.apache.cassandra.thrift.KsDef$_Fields",
      "org.apache.cassandra.thrift.KsDef",
      "org.apache.cassandra.thrift.AuthenticationRequest$1",
      "org.apache.thrift.transport.TSaslServerTransport",
      "org.apache.thrift.transport.TSaslServerTransport$TSaslServerDefinition",
      "org.apache.http.conn.EofSensorInputStream",
      "org.apache.commons.lang.NotImplementedException",
      "org.apache.commons.lang.exception.NestableDelegate",
      "org.apache.http.entity.AbstractHttpEntity",
      "org.apache.http.entity.ByteArrayEntity",
      "org.apache.thrift.protocol.TProtocol",
      "org.apache.thrift.protocol.TJSONProtocol",
      "org.apache.thrift.protocol.TJSONProtocol$JSONBaseContext",
      "org.apache.thrift.protocol.TJSONProtocol$LookaheadReader",
      "org.apache.thrift.TServiceClient",
      "org.apache.cassandra.thrift.Cassandra$Client",
      "org.apache.cassandra.thrift.Cassandra$describe_keyspace_args$_Fields",
      "org.apache.cassandra.thrift.Cassandra$describe_keyspace_args",
      "org.apache.thrift.protocol.TMessage",
      "org.apache.thrift.TBaseHelper$NestedStructureComparator",
      "org.apache.thrift.TBaseHelper",
      "org.apache.thrift.protocol.TSet",
      "org.apache.thrift.protocol.TList",
      "org.apache.thrift.protocol.TMap",
      "org.apache.thrift.protocol.TSimpleJSONProtocol",
      "org.apache.thrift.protocol.TSimpleJSONProtocol$Context",
      "org.apache.cassandra.thrift.Cassandra$get_indexed_slices_result$_Fields",
      "org.apache.cassandra.thrift.Cassandra$get_indexed_slices_result",
      "org.apache.thrift.TApplicationException",
      "org.apache.thrift.protocol.TBinaryProtocol",
      "org.apache.http.protocol.HttpRequestExecutor",
      "org.apache.http.entity.EntityTemplate",
      "org.apache.http.impl.conn.DefaultHttpRoutePlanner",
      "org.apache.http.entity.SerializableEntity",
      "org.apache.thrift.protocol.TCompactProtocol",
      "org.apache.thrift.ShortStack",
      "org.apache.cassandra.thrift.Cassandra$set_cql_version_result$_Fields",
      "org.apache.cassandra.thrift.Cassandra$set_cql_version_result",
      "org.apache.http.entity.FileEntity",
      "org.apache.http.message.BasicHeader",
      "org.apache.http.entity.HttpEntityWrapper",
      "org.apache.http.entity.BufferedHttpEntity",
      "org.apache.http.HttpHost",
      "org.apache.http.conn.routing.HttpRoute",
      "org.apache.http.util.CharArrayBuffer",
      "org.apache.http.impl.conn.SingleClientConnManager$1",
      "org.apache.http.entity.BasicHttpEntity",
      "org.apache.http.util.EntityUtils",
      "org.apache.http.params.HttpConnectionParams",
      "org.apache.cassandra.thrift.Cassandra$describe_keyspace_result$_Fields",
      "org.apache.cassandra.thrift.Cassandra$describe_keyspace_result",
      "org.apache.thrift.protocol.TProtocolUtil",
      "org.apache.thrift.protocol.TProtocolException",
      "org.apache.cassandra.thrift.Cassandra$set_cql_version_args$_Fields",
      "org.apache.cassandra.thrift.Cassandra$set_cql_version_args",
      "org.apache.thrift.protocol.TSimpleJSONProtocol$ListContext",
      "org.apache.thrift.protocol.TSimpleJSONProtocol$StructContext",
      "org.apache.http.entity.StringEntity",
      "org.apache.http.impl.client.DefaultHttpRequestRetryHandler",
      "org.apache.thrift.transport.TFileTransport$truncableBufferedInputStream",
      "org.apache.thrift.transport.TFileTransport$chunkState",
      "org.apache.thrift.transport.TFileTransport$Event",
      "org.apache.http.cookie.CookieSpecRegistry",
      "org.apache.http.conn.BasicManagedEntity",
      "org.apache.http.protocol.BasicHttpProcessor",
      "org.apache.cassandra.thrift.Cassandra$truncate_args$_Fields",
      "org.apache.cassandra.thrift.Cassandra$truncate_args",
      "org.apache.http.protocol.ResponseServer",
      "org.apache.http.client.methods.HttpRequestBase",
      "org.apache.http.client.methods.HttpHead",
      "org.apache.http.message.HeaderGroup",
      "org.apache.http.protocol.BasicHttpContext",
      "org.apache.http.conn.scheme.Scheme",
      "org.apache.http.conn.ssl.AbstractVerifier",
      "org.apache.http.conn.ssl.AllowAllHostnameVerifier",
      "org.apache.http.conn.ssl.BrowserCompatHostnameVerifier",
      "org.apache.http.conn.ssl.StrictHostnameVerifier",
      "org.apache.http.conn.ssl.SSLSocketFactory",
      "org.apache.http.HttpVersion",
      "org.apache.http.params.HttpProtocolParams",
      "org.apache.http.util.VersionInfo",
      "org.apache.http.auth.AuthSchemeRegistry",
      "org.apache.http.impl.auth.BasicSchemeFactory",
      "org.apache.http.impl.auth.DigestSchemeFactory",
      "org.apache.http.impl.cookie.BestMatchSpecFactory",
      "org.apache.http.impl.cookie.BrowserCompatSpecFactory",
      "org.apache.http.impl.cookie.NetscapeDraftSpecFactory",
      "org.apache.http.impl.cookie.RFC2109SpecFactory",
      "org.apache.http.impl.cookie.RFC2965SpecFactory",
      "org.apache.http.impl.client.BasicCookieStore",
      "org.apache.http.cookie.CookieIdentityComparator",
      "org.apache.http.impl.client.BasicCredentialsProvider",
      "org.apache.http.impl.DefaultConnectionReuseStrategy",
      "org.apache.http.impl.client.DefaultConnectionKeepAliveStrategy",
      "org.apache.http.client.protocol.RequestDefaultHeaders",
      "org.apache.http.protocol.RequestContent",
      "org.apache.http.protocol.RequestTargetHost",
      "org.apache.http.client.protocol.RequestClientConnControl",
      "org.apache.http.protocol.RequestUserAgent",
      "org.apache.http.protocol.RequestExpectContinue",
      "org.apache.http.client.protocol.RequestAddCookies",
      "org.apache.http.client.protocol.ResponseProcessCookies",
      "org.apache.http.client.protocol.RequestTargetAuthentication",
      "org.apache.http.client.protocol.RequestProxyAuthentication",
      "org.apache.http.impl.client.AbstractAuthenticationHandler",
      "org.apache.http.impl.client.DefaultTargetAuthenticationHandler",
      "org.apache.http.impl.client.DefaultProxyAuthenticationHandler",
      "org.apache.http.impl.client.DefaultUserTokenHandler",
      "org.apache.http.impl.client.ClientParamsStack",
      "org.apache.http.impl.client.DefaultRequestDirector",
      "org.apache.http.auth.AuthState",
      "org.apache.http.impl.client.RequestWrapper",
      "org.apache.http.protocol.HttpDateGenerator",
      "org.apache.http.protocol.ResponseDate",
      "org.apache.cassandra.thrift.ColumnDef$1",
      "org.apache.commons.lang.StringUtils",
      "org.apache.cassandra.thrift.Cassandra$set_keyspace_args$_Fields",
      "org.apache.cassandra.thrift.Cassandra$set_keyspace_args",
      "org.apache.cassandra.thrift.Cassandra$set_keyspace_result$_Fields",
      "org.apache.cassandra.thrift.Cassandra$set_keyspace_result",
      "org.apache.http.protocol.DefaultedHttpContext",
      "org.apache.http.protocol.SyncBasicHttpContext",
      "org.apache.http.protocol.ResponseContent",
      "org.apache.http.client.methods.HttpGet",
      "org.apache.http.client.methods.HttpDelete",
      "org.apache.http.protocol.ResponseConnControl",
      "org.apache.http.entity.InputStreamEntity",
      "org.apache.http.util.ByteArrayBuffer",
      "org.apache.cassandra.thrift.SlicePredicate$_Fields",
      "org.apache.cassandra.thrift.SlicePredicate",
      "org.apache.cassandra.thrift.ColumnParent$_Fields",
      "org.apache.cassandra.thrift.ColumnParent",
      "org.apache.cassandra.thrift.Cassandra$execute_prepared_cql_query_args$_Fields",
      "org.apache.cassandra.thrift.Cassandra$execute_prepared_cql_query_args",
      "org.apache.cassandra.thrift.Cassandra$multiget_count_args$_Fields",
      "org.apache.cassandra.thrift.Cassandra$multiget_count_args",
      "org.apache.http.client.methods.HttpTrace",
      "org.apache.cassandra.thrift.Column$_Fields",
      "org.apache.http.impl.conn.AbstractClientConnAdapter",
      "org.apache.http.impl.conn.AbstractPooledConnAdapter",
      "org.apache.http.impl.conn.SingleClientConnManager$ConnAdapter",
      "org.apache.cassandra.thrift.IndexExpression$_Fields",
      "org.apache.http.message.BasicHttpRequest",
      "org.apache.http.message.BasicHttpEntityEnclosingRequest",
      "org.apache.http.message.BasicRequestLine",
      "org.apache.http.impl.client.EntityEnclosingRequestWrapper",
      "org.apache.http.HttpException",
      "org.apache.http.ProtocolException",
      "org.apache.http.util.ExceptionUtils",
      "org.apache.http.client.ClientProtocolException"
    );
  }
}
