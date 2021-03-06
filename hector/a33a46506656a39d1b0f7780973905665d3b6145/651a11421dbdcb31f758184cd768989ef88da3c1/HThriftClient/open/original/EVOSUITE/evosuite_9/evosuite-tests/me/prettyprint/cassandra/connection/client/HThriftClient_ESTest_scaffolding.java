/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Nov 07 04:18:53 GMT 2021
 */

package me.prettyprint.cassandra.connection.client;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class HThriftClient_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 10000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "me.prettyprint.cassandra.connection.client.HThriftClient"; 
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
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
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
    java.lang.System.setProperty("user.dir", "/home/CIN/lmps2/semanticConflicts/SMAT/output-test-dest/hector/a33a46506656a39d1b0f7780973905665d3b6145/evosuite_9"); 
    java.lang.System.setProperty("user.home", "/home/CIN/lmps2"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "lmps2"); 
    java.lang.System.setProperty("user.timezone", "America/Recife"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(HThriftClient_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.cassandra.thrift.CqlPreparedResult",
      "org.apache.commons.lang.StringUtils",
      "org.apache.thrift.meta_data.ListMetaData",
      "org.apache.cassandra.thrift.Cassandra$system_drop_keyspace_result",
      "org.apache.cassandra.thrift.AuthenticationRequest$_Fields",
      "org.apache.cassandra.thrift.Cassandra$system_add_keyspace_result",
      "org.apache.cassandra.thrift.AuthenticationException",
      "org.apache.cassandra.thrift.Cassandra$multiget_slice_result",
      "org.apache.cassandra.thrift.Cassandra$get_count_result",
      "org.apache.thrift.transport.TFastFramedTransport",
      "org.apache.cassandra.thrift.Cassandra$describe_snitch_args$_Fields",
      "org.apache.cassandra.thrift.Cassandra$describe_partitioner_args",
      "org.apache.thrift.protocol.TBinaryProtocol",
      "org.apache.cassandra.thrift.Column",
      "org.apache.thrift.transport.THttpClient",
      "org.apache.cassandra.thrift.Cassandra$insert_result",
      "org.apache.cassandra.thrift.ColumnParent",
      "org.apache.cassandra.thrift.Compression",
      "org.apache.cassandra.thrift.Cassandra$batch_mutate_args",
      "org.apache.cassandra.thrift.Cassandra$get_range_slices_args",
      "org.apache.http.HttpMessage",
      "org.apache.cassandra.thrift.Cassandra$describe_snitch_args",
      "org.apache.thrift.meta_data.EnumMetaData",
      "org.apache.thrift.protocol.TCompactProtocol",
      "org.apache.thrift.TBase",
      "org.apache.cassandra.thrift.Cassandra$execute_prepared_cql_query_args",
      "org.apache.cassandra.thrift.Cassandra$Processor",
      "me.prettyprint.cassandra.service.CassandraHost",
      "org.apache.thrift.TServiceClient",
      "org.apache.cassandra.thrift.Cassandra$describe_keyspaces_args",
      "org.apache.cassandra.thrift.Cassandra$multiget_count_args",
      "org.apache.cassandra.thrift.CounterColumn",
      "org.apache.cassandra.thrift.ColumnOrSuperColumn",
      "org.apache.thrift.transport.TSaslTransport",
      "org.apache.cassandra.thrift.Cassandra$system_drop_column_family_result",
      "org.apache.thrift.transport.TSeekableFile",
      "org.apache.cassandra.thrift.Cassandra$describe_cluster_name_result",
      "org.apache.http.HttpRequest",
      "org.apache.cassandra.thrift.Cassandra$describe_splits_args",
      "org.apache.cassandra.thrift.Cassandra$remove_counter_result",
      "org.apache.cassandra.thrift.Cassandra$describe_partitioner_result",
      "org.apache.cassandra.thrift.Cassandra$system_add_column_family_result",
      "me.prettyprint.hector.api.exceptions.HInvalidRequestException",
      "org.apache.thrift.transport.TSaslServerTransport$TSaslServerDefinition",
      "org.apache.cassandra.thrift.Cassandra$get_count_args",
      "org.apache.cassandra.thrift.Cassandra$describe_schema_versions_result",
      "org.apache.cassandra.thrift.Cassandra$set_cql_version_result",
      "org.apache.cassandra.thrift.Cassandra$describe_keyspace_args$_Fields",
      "org.apache.cassandra.thrift.Cassandra$describe_schema_versions_args",
      "org.apache.cassandra.thrift.Cassandra$set_keyspace_args",
      "org.apache.thrift.transport.TSaslTransport$SaslResponse",
      "org.apache.thrift.TProcessor",
      "org.apache.thrift.transport.TFileTransport",
      "org.apache.cassandra.thrift.Cassandra$describe_splits_result",
      "org.apache.cassandra.thrift.Cassandra$insert_args",
      "org.apache.cassandra.thrift.Cassandra$set_keyspace_result",
      "org.apache.cassandra.thrift.Cassandra$truncate_args",
      "me.prettyprint.cassandra.service.SystemProperties",
      "org.apache.cassandra.thrift.Cassandra$describe_version_result",
      "org.apache.thrift.transport.TSaslServerTransport$1",
      "org.apache.cassandra.thrift.Cassandra$set_keyspace_result$_Fields",
      "org.apache.cassandra.thrift.Cassandra$describe_keyspace_result",
      "org.apache.cassandra.thrift.AuthenticationRequest",
      "org.apache.cassandra.thrift.NotFoundException",
      "org.apache.thrift.transport.TMemoryInputTransport",
      "me.prettyprint.hector.api.exceptions.HectorException",
      "org.apache.cassandra.thrift.ColumnDef$_Fields",
      "org.apache.cassandra.thrift.TimedOutException",
      "org.apache.cassandra.thrift.Cassandra$get_slice_args",
      "org.apache.thrift.transport.TSaslServerTransport",
      "org.apache.http.client.HttpClient",
      "org.apache.cassandra.thrift.Cassandra$remove_args",
      "org.apache.cassandra.thrift.Cassandra$add_args",
      "org.apache.thrift.transport.TSocket",
      "org.apache.thrift.transport.TMemoryBuffer",
      "org.apache.thrift.meta_data.FieldValueMetaData",
      "org.apache.cassandra.thrift.Cassandra$prepare_cql_query_result",
      "org.apache.thrift.async.TAsyncClient",
      "org.apache.thrift.TException",
      "org.apache.cassandra.thrift.Cassandra$1",
      "org.apache.cassandra.thrift.Cassandra$prepare_cql_query_args",
      "org.apache.cassandra.thrift.Cassandra$get_result",
      "org.apache.cassandra.thrift.Cassandra$describe_cluster_name_args",
      "org.apache.thrift.transport.TFileTransport$truncableBufferedInputStream",
      "org.apache.thrift.transport.TNonblockingTransport",
      "org.apache.cassandra.thrift.Cassandra$system_update_keyspace_args",
      "org.apache.cassandra.thrift.Cassandra$get_indexed_slices_result",
      "org.apache.cassandra.thrift.CfDef$_Fields",
      "org.apache.cassandra.thrift.KsDef$_Fields",
      "org.apache.cassandra.thrift.Cassandra$multiget_count_result",
      "org.apache.cassandra.thrift.Cassandra$Client",
      "org.apache.cassandra.thrift.Cassandra$multiget_slice_args",
      "org.apache.cassandra.thrift.Cassandra$get_range_slices_result",
      "org.apache.thrift.transport.TTransportException",
      "org.apache.thrift.protocol.TSet",
      "org.apache.thrift.meta_data.StructMetaData",
      "org.apache.thrift.transport.TFramedTransport",
      "org.apache.cassandra.thrift.InvalidRequestException",
      "org.apache.cassandra.thrift.Cassandra$system_update_column_family_args",
      "org.apache.http.Header",
      "org.apache.cassandra.thrift.Cassandra$describe_version_args",
      "org.apache.thrift.protocol.TList",
      "org.apache.cassandra.thrift.Cassandra$describe_snitch_result",
      "org.apache.commons.lang.exception.NestableDelegate",
      "org.apache.cassandra.thrift.Cassandra$system_add_keyspace_args",
      "org.apache.thrift.transport.TTransport",
      "org.apache.cassandra.thrift.ColumnDef",
      "org.apache.cassandra.thrift.Cassandra$AsyncClient",
      "org.apache.commons.lang.NotImplementedException",
      "org.apache.thrift.protocol.TField",
      "org.apache.cassandra.thrift.IndexClause",
      "org.apache.thrift.transport.TIOStreamTransport",
      "org.apache.thrift.protocol.TProtocolException",
      "org.apache.cassandra.thrift.Cassandra$system_drop_column_family_args",
      "me.prettyprint.cassandra.connection.client.HThriftClient",
      "org.apache.thrift.meta_data.MapMetaData",
      "org.apache.cassandra.thrift.Cassandra",
      "org.apache.thrift.transport.TStandardFile",
      "org.apache.thrift.TByteArrayOutputStream",
      "org.apache.cassandra.thrift.AuthorizationException",
      "org.apache.http.HttpEntity",
      "org.apache.cassandra.thrift.KeyRange",
      "org.apache.cassandra.thrift.Cassandra$system_drop_keyspace_args",
      "org.apache.cassandra.thrift.Cassandra$get_paged_slice_args",
      "org.apache.cassandra.thrift.Cassandra$truncate_result",
      "org.apache.cassandra.thrift.Cassandra$remove_counter_args",
      "org.apache.cassandra.thrift.Cassandra$get_slice_result",
      "org.apache.cassandra.thrift.KsDef",
      "org.apache.http.entity.BasicHttpEntity",
      "org.apache.cassandra.thrift.Cassandra$AsyncIface",
      "org.apache.thrift.TFieldIdEnum",
      "org.apache.http.entity.BufferedHttpEntity",
      "org.apache.thrift.protocol.TMap",
      "org.apache.cassandra.thrift.Cassandra$get_args",
      "org.apache.cassandra.thrift.Cassandra$describe_ring_result",
      "org.apache.cassandra.thrift.Cassandra$get_indexed_slices_args",
      "org.apache.cassandra.thrift.Cassandra$login_result",
      "org.apache.cassandra.thrift.Cassandra$execute_cql_query_args",
      "org.apache.cassandra.thrift.ConsistencyLevel",
      "org.apache.cassandra.thrift.ColumnPath",
      "org.apache.thrift.transport.AutoExpandingBufferReadTransport",
      "org.apache.cassandra.thrift.Cassandra$set_keyspace_args$_Fields",
      "org.apache.cassandra.thrift.Cassandra$system_update_keyspace_result",
      "me.prettyprint.cassandra.connection.client.HClient",
      "org.apache.cassandra.thrift.Cassandra$Iface",
      "org.apache.cassandra.thrift.Cassandra$system_update_column_family_result",
      "org.apache.cassandra.thrift.Cassandra$execute_prepared_cql_query_result",
      "org.apache.cassandra.thrift.Cassandra$add_result",
      "org.apache.cassandra.thrift.Cassandra$login_args",
      "me.prettyprint.hector.api.exceptions.HectorTransportException",
      "org.apache.cassandra.thrift.CqlResult",
      "org.apache.thrift.TBaseProcessor",
      "org.apache.thrift.TApplicationException",
      "org.apache.thrift.protocol.TStruct",
      "org.apache.thrift.meta_data.FieldMetaData",
      "org.apache.thrift.transport.AutoExpandingBuffer",
      "org.apache.cassandra.thrift.Cassandra$set_cql_version_args",
      "org.apache.cassandra.thrift.UnavailableException",
      "org.apache.cassandra.thrift.SlicePredicate",
      "org.apache.http.entity.AbstractHttpEntity",
      "org.apache.cassandra.thrift.Cassandra$execute_cql_query_result",
      "org.apache.thrift.transport.TNonblockingSocket",
      "org.apache.cassandra.thrift.CfDef",
      "org.apache.thrift.TEnum",
      "org.apache.thrift.transport.AutoExpandingBufferWriteTransport",
      "org.apache.cassandra.thrift.Cassandra$describe_keyspaces_result",
      "org.apache.http.entity.HttpEntityWrapper",
      "org.apache.cassandra.thrift.SchemaDisagreementException",
      "org.apache.commons.lang.exception.Nestable",
      "org.apache.thrift.protocol.TMessage",
      "org.apache.cassandra.thrift.Cassandra$batch_mutate_result",
      "org.apache.thrift.protocol.TProtocol",
      "org.apache.cassandra.thrift.Cassandra$get_paged_slice_result",
      "org.apache.cassandra.thrift.Cassandra$system_add_column_family_args",
      "org.apache.cassandra.thrift.Cassandra$describe_keyspace_args",
      "org.apache.cassandra.thrift.IndexType",
      "org.apache.cassandra.thrift.Cassandra$describe_ring_args",
      "org.apache.cassandra.thrift.Cassandra$remove_result"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("javax.security.auth.callback.CallbackHandler", false, HThriftClient_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(HThriftClient_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "me.prettyprint.cassandra.connection.client.HThriftClient",
      "me.prettyprint.cassandra.service.SystemProperties",
      "me.prettyprint.cassandra.service.CassandraHost",
      "org.apache.thrift.transport.TTransport",
      "org.apache.thrift.transport.TIOStreamTransport",
      "org.apache.thrift.transport.TSocket",
      "org.apache.thrift.transport.TFramedTransport",
      "org.apache.thrift.TByteArrayOutputStream",
      "org.apache.thrift.transport.TMemoryInputTransport",
      "org.apache.thrift.TException",
      "org.apache.thrift.transport.TTransportException",
      "me.prettyprint.hector.api.exceptions.HectorException",
      "me.prettyprint.hector.api.exceptions.HectorTransportException",
      "org.apache.thrift.transport.TMemoryBuffer",
      "org.apache.thrift.protocol.TProtocol",
      "org.apache.thrift.protocol.TStruct",
      "org.apache.thrift.protocol.TBinaryProtocol",
      "org.apache.thrift.TServiceClient",
      "org.apache.cassandra.thrift.Cassandra$Client",
      "org.apache.cassandra.thrift.Cassandra$describe_snitch_args$_Fields",
      "org.apache.thrift.meta_data.FieldMetaData",
      "org.apache.cassandra.thrift.Cassandra$describe_snitch_args",
      "org.apache.thrift.protocol.TMessage",
      "org.apache.thrift.transport.TFastFramedTransport",
      "org.apache.thrift.transport.AutoExpandingBufferWriteTransport",
      "org.apache.thrift.transport.AutoExpandingBuffer",
      "org.apache.thrift.transport.AutoExpandingBufferReadTransport",
      "org.apache.thrift.protocol.TField",
      "org.apache.thrift.protocol.TCompactProtocol",
      "org.apache.thrift.ShortStack",
      "org.apache.thrift.meta_data.FieldValueMetaData",
      "org.apache.thrift.meta_data.MapMetaData",
      "org.apache.thrift.meta_data.ListMetaData",
      "org.apache.thrift.meta_data.StructMetaData",
      "org.apache.cassandra.thrift.KsDef",
      "org.apache.thrift.transport.TFileTransport",
      "org.apache.thrift.transport.TFileTransport$tailPolicy",
      "org.apache.thrift.transport.TStandardFile",
      "org.apache.cassandra.thrift.CfDef",
      "org.apache.thrift.transport.TNonblockingTransport",
      "org.apache.thrift.transport.TNonblockingSocket",
      "org.apache.commons.lang.StringUtils",
      "org.apache.cassandra.thrift.Cassandra$set_keyspace_args$_Fields",
      "org.apache.cassandra.thrift.Cassandra$set_keyspace_args",
      "org.apache.cassandra.thrift.AuthenticationRequest",
      "org.apache.thrift.meta_data.EnumMetaData",
      "org.apache.cassandra.thrift.ColumnDef",
      "org.apache.thrift.protocol.TProtocolException",
      "org.apache.thrift.transport.TSaslTransport",
      "org.apache.thrift.transport.TSaslClientTransport",
      "org.apache.thrift.transport.TSaslTransport$SaslParticipant",
      "org.apache.thrift.transport.THttpClient",
      "org.apache.http.params.AbstractHttpParams",
      "org.apache.http.params.BasicHttpParams",
      "org.apache.http.params.DefaultedHttpParams",
      "org.apache.http.impl.client.AbstractHttpClient",
      "org.apache.http.impl.client.DefaultHttpClient",
      "org.apache.commons.logging.impl.Jdk14Logger",
      "org.apache.thrift.protocol.TSet",
      "org.apache.thrift.protocol.TList",
      "org.apache.thrift.protocol.TMap",
      "org.apache.thrift.protocol.TSimpleJSONProtocol",
      "org.apache.thrift.protocol.TSimpleJSONProtocol$Context",
      "org.apache.cassandra.thrift.Cassandra$describe_keyspace_result$_Fields",
      "org.apache.cassandra.thrift.Cassandra$describe_keyspace_result",
      "org.apache.thrift.TApplicationException",
      "org.apache.http.conn.scheme.SchemeRegistry",
      "org.apache.http.impl.conn.SingleClientConnManager",
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
      "org.apache.http.entity.AbstractHttpEntity",
      "org.apache.http.entity.ByteArrayEntity",
      "org.apache.thrift.transport.TSaslServerTransport",
      "org.apache.thrift.transport.TSaslServerTransport$TSaslServerDefinition",
      "org.apache.commons.lang.NotImplementedException",
      "org.apache.commons.lang.exception.NestableDelegate",
      "org.apache.cassandra.thrift.SlicePredicate$_Fields",
      "org.apache.cassandra.thrift.SlicePredicate",
      "org.apache.cassandra.thrift.ColumnParent$_Fields",
      "org.apache.cassandra.thrift.ColumnParent",
      "org.apache.cassandra.thrift.AuthenticationRequest$1",
      "org.apache.cassandra.thrift.Cassandra$describe_keyspace_args$_Fields",
      "org.apache.cassandra.thrift.Cassandra$describe_keyspace_args",
      "org.apache.cassandra.thrift.Column$_Fields",
      "org.apache.cassandra.thrift.Column",
      "org.apache.cassandra.thrift.Cassandra$insert_args$_Fields",
      "org.apache.cassandra.thrift.Cassandra$insert_args",
      "org.apache.cassandra.thrift.Cassandra$set_keyspace_result$_Fields",
      "org.apache.cassandra.thrift.Cassandra$set_keyspace_result",
      "org.apache.cassandra.thrift.ColumnDef$1",
      "org.apache.http.entity.FileEntity",
      "org.apache.http.message.BasicHeader",
      "org.apache.http.entity.HttpEntityWrapper",
      "org.apache.http.conn.BasicManagedEntity",
      "org.apache.thrift.TBaseHelper$NestedStructureComparator",
      "org.apache.thrift.TBaseHelper",
      "org.apache.http.protocol.BasicHttpProcessor",
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
      "org.apache.http.conn.scheme.PlainSocketFactory",
      "org.apache.http.entity.SerializableEntity",
      "org.apache.http.entity.BufferedHttpEntity",
      "org.apache.http.ProtocolVersion",
      "org.apache.thrift.protocol.TJSONProtocol",
      "org.apache.thrift.protocol.TJSONProtocol$JSONBaseContext",
      "org.apache.thrift.protocol.TJSONProtocol$LookaheadReader",
      "org.apache.cassandra.thrift.Cassandra$multiget_slice_args$_Fields",
      "org.apache.cassandra.thrift.Cassandra$multiget_slice_args",
      "org.apache.http.entity.BasicHttpEntity",
      "org.apache.http.impl.client.AbstractAuthenticationHandler",
      "org.apache.http.impl.client.DefaultTargetAuthenticationHandler",
      "org.apache.http.entity.StringEntity",
      "org.apache.http.conn.routing.HttpRoute",
      "org.apache.http.entity.EntityTemplate",
      "org.apache.http.impl.client.DefaultConnectionKeepAliveStrategy",
      "org.apache.http.message.AbstractHttpMessage",
      "org.apache.http.client.methods.HttpRequestBase",
      "org.apache.http.client.methods.HttpEntityEnclosingRequestBase",
      "org.apache.http.client.methods.HttpPost",
      "org.apache.http.message.HeaderGroup",
      "org.apache.cassandra.thrift.KsDef$1",
      "org.apache.cassandra.thrift.Cassandra$describe_schema_versions_args$_Fields",
      "org.apache.cassandra.thrift.Cassandra$describe_schema_versions_args",
      "org.apache.thrift.protocol.TProtocolUtil",
      "org.apache.cassandra.thrift.Cassandra$system_add_keyspace_args$_Fields",
      "org.apache.cassandra.thrift.Cassandra$system_add_keyspace_args",
      "org.apache.cassandra.thrift.Cassandra$describe_cluster_name_args$_Fields",
      "org.apache.cassandra.thrift.Cassandra$describe_cluster_name_args",
      "org.apache.cassandra.thrift.Cassandra$describe_cluster_name_result$_Fields",
      "org.apache.cassandra.thrift.Cassandra$describe_cluster_name_result",
      "org.apache.http.client.methods.HttpDelete",
      "org.apache.http.params.HttpProtocolParams",
      "org.apache.http.HttpVersion",
      "org.apache.http.message.BasicRequestLine",
      "org.apache.http.message.BasicHttpRequest",
      "org.apache.http.message.BasicHttpEntityEnclosingRequest",
      "org.apache.http.params.HttpConnectionParams",
      "org.apache.cassandra.thrift.Cassandra$describe_version_result$_Fields",
      "org.apache.cassandra.thrift.Cassandra$describe_version_result",
      "org.apache.http.message.BasicHttpResponse",
      "org.apache.http.message.BasicStatusLine",
      "org.apache.cassandra.thrift.CfDef$1",
      "org.apache.cassandra.thrift.KeyRange$_Fields",
      "org.apache.cassandra.thrift.KeyRange",
      "org.apache.cassandra.thrift.Cassandra$get_paged_slice_args$_Fields",
      "org.apache.cassandra.thrift.Cassandra$get_paged_slice_args",
      "org.apache.thrift.protocol.TJSONProtocol$JSONPairContext",
      "org.apache.thrift.protocol.TJSONProtocol$JSONListContext",
      "org.apache.cassandra.thrift.ColumnDef$_Fields",
      "org.apache.cassandra.thrift.AuthenticationRequest$_Fields",
      "org.apache.cassandra.thrift.KsDef$_Fields",
      "org.apache.cassandra.thrift.CfDef$_Fields"
    );
  }
}
