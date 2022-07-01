import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test00001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00001");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = null;
        org.elasticsearch.index.shard.IndexShard indexShard1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult2 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest0, indexShard1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "", deleteRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = null;
        org.elasticsearch.index.shard.IndexShard indexShard1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete2 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest0, indexShard1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        org.elasticsearch.common.unit.TimeValue timeValue0 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        java.lang.Class<?> wildcardClass1 = timeValue0.getClass();
        org.junit.Assert.assertNotNull(timeValue0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput3 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest2.writeTo(streamOutput3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.VersionType versionType3 = deleteRequest0.versionType();
        java.lang.Class<?> wildcardClass4 = deleteRequest0.getClass();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException1 = deleteRequest0.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.routing("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.timeout("");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(actionRequestValidationException1);
        org.junit.Assert.assertNotNull(deleteRequest3);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException1 = deleteRequest0.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.routing("hi!");
        org.elasticsearch.common.io.stream.StreamInput streamInput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.readFrom(streamInput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(actionRequestValidationException1);
        org.junit.Assert.assertNotNull(deleteRequest3);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.index.shard.IndexShard indexShard1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete2 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest0, indexShard1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException1 = deleteRequest0.validate();
        java.lang.Class<?> wildcardClass2 = deleteRequest0.getClass();
        org.junit.Assert.assertNotNull(actionRequestValidationException1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        long long3 = deleteRequest0.seqNo();
        org.elasticsearch.index.shard.IndexShard indexShard4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult5 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest0, indexShard4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.timeout("");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.transport.TransportService transportService1 = null;
        org.elasticsearch.cluster.service.ClusterService clusterService2 = null;
        org.elasticsearch.indices.IndicesService indicesService3 = null;
        org.elasticsearch.threadpool.ThreadPool threadPool4 = null;
        org.elasticsearch.cluster.action.shard.ShardStateAction shardStateAction5 = null;
        org.elasticsearch.action.admin.indices.create.TransportCreateIndexAction transportCreateIndexAction6 = null;
        org.elasticsearch.action.support.ActionFilters actionFilters7 = null;
        org.elasticsearch.cluster.metadata.IndexNameExpressionResolver indexNameExpressionResolver8 = null;
        org.elasticsearch.action.support.AutoCreateIndex autoCreateIndex9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction transportDeleteAction10 = new org.elasticsearch.action.delete.TransportDeleteAction(settings0, transportService1, clusterService2, indicesService3, threadPool4, shardStateAction5, transportCreateIndexAction6, actionFilters7, indexNameExpressionResolver8, autoCreateIndex9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        boolean boolean4 = deleteRequest3.refresh();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.timeout("");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId3 = deleteRequest2.shardId();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.consistencyLevel(writeConsistencyLevel4);
        java.lang.String str6 = deleteRequest5.routing();
        org.elasticsearch.index.VersionType versionType7 = deleteRequest5.versionType();
        org.elasticsearch.index.shard.IndexShard indexShard8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult9 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest5, indexShard8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(shardId3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(versionType7);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.index.IndexSettings indexSettings1 = null;
        org.elasticsearch.index.shard.ShardPath shardPath2 = null;
        org.elasticsearch.index.store.Store store3 = null;
        org.elasticsearch.index.cache.IndexCache indexCache4 = null;
        org.elasticsearch.index.mapper.MapperService mapperService5 = null;
        org.elasticsearch.index.similarity.SimilarityService similarityService6 = null;
        org.elasticsearch.index.fielddata.IndexFieldDataService indexFieldDataService7 = null;
        org.elasticsearch.index.engine.EngineFactory engineFactory8 = null;
        org.elasticsearch.index.shard.IndexEventListener indexEventListener9 = null;
        org.elasticsearch.index.shard.IndexSearcherWrapper indexSearcherWrapper10 = null;
        org.elasticsearch.threadpool.ThreadPool threadPool11 = null;
        org.elasticsearch.common.util.BigArrays bigArrays12 = null;
        org.elasticsearch.index.engine.Engine.Warmer warmer13 = null;
        java.lang.Runnable runnable14 = null;
        org.elasticsearch.index.shard.SearchOperationListener[] searchOperationListenerArray15 = new org.elasticsearch.index.shard.SearchOperationListener[] {};
        java.util.ArrayList<org.elasticsearch.index.shard.SearchOperationListener> searchOperationListenerList16 = new java.util.ArrayList<org.elasticsearch.index.shard.SearchOperationListener>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.elasticsearch.index.shard.SearchOperationListener>) searchOperationListenerList16, searchOperationListenerArray15);
        org.elasticsearch.index.shard.IndexingOperationListener[] indexingOperationListenerArray18 = new org.elasticsearch.index.shard.IndexingOperationListener[] {};
        java.util.ArrayList<org.elasticsearch.index.shard.IndexingOperationListener> indexingOperationListenerList19 = new java.util.ArrayList<org.elasticsearch.index.shard.IndexingOperationListener>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.elasticsearch.index.shard.IndexingOperationListener>) indexingOperationListenerList19, indexingOperationListenerArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.shard.IndexShard indexShard21 = new org.elasticsearch.index.shard.IndexShard(shardRouting0, indexSettings1, shardPath2, store3, indexCache4, mapperService5, similarityService6, indexFieldDataService7, engineFactory8, indexEventListener9, indexSearcherWrapper10, threadPool11, bigArrays12, warmer13, runnable14, (java.util.List<org.elasticsearch.index.shard.SearchOperationListener>) searchOperationListenerList16, (java.util.List<org.elasticsearch.index.shard.IndexingOperationListener>) indexingOperationListenerList19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchOperationListenerArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(indexingOperationListenerArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        org.elasticsearch.action.support.replication.ReplicationTask replicationTask0 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.setPhase(replicationTask0, "delete {[null][null][null]}");
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.writeTo(streamOutput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId3 = deleteRequest2.shardId();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.consistencyLevel(writeConsistencyLevel4);
        java.lang.String str6 = deleteRequest5.routing();
        org.elasticsearch.index.VersionType versionType7 = deleteRequest5.versionType();
        org.elasticsearch.common.io.stream.StreamInput streamInput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest5.readFrom(streamInput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(shardId3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(versionType7);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        boolean boolean4 = deleteRequest3.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.type("");
        org.elasticsearch.index.shard.IndexShard indexShard7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult8 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest6, indexShard7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(deleteRequest6);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        boolean boolean3 = deleteRequest0.getShouldPersistResult();
        org.elasticsearch.index.shard.IndexShard indexShard4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult5 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest0, indexShard4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId3 = deleteRequest2.shardId();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest2.writeTo(streamOutput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(shardId3);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        java.lang.Class<?> wildcardClass2 = indicesOptions1.getClass();
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.refresh(true);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException7 = deleteRequest6.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue10 = deleteRequest9.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest5.timeout(timeValue10);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest5.timeout("");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(actionRequestValidationException7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(timeValue10);
        org.junit.Assert.assertNotNull(deleteRequest11);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException1 = deleteRequest0.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.routing("hi!");
        org.elasticsearch.index.shard.IndexShard indexShard4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete5 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest0, indexShard4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(actionRequestValidationException1);
        org.junit.Assert.assertNotNull(deleteRequest3);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        org.elasticsearch.action.support.replication.ReplicationTask replicationTask0 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.setPhase(replicationTask0, "hi!");
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.refresh(true);
        java.lang.String[] strArray6 = deleteRequest3.indices();
        java.lang.Class<?> wildcardClass7 = deleteRequest3.getClass();
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel3 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.consistencyLevel(writeConsistencyLevel3);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.timeout("delete {[null][null][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[null][null][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId3 = deleteRequest2.shardId();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.consistencyLevel(writeConsistencyLevel4);
        org.elasticsearch.index.VersionType versionType6 = deleteRequest2.versionType();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest2.timeout("hi!");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [hi!] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(shardId3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(versionType6);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.index.IndexSettings indexSettings1 = null;
        org.elasticsearch.index.shard.ShardPath shardPath2 = null;
        org.elasticsearch.index.store.Store store3 = null;
        org.elasticsearch.index.cache.IndexCache indexCache4 = null;
        org.elasticsearch.index.mapper.MapperService mapperService5 = null;
        org.elasticsearch.index.similarity.SimilarityService similarityService6 = null;
        org.elasticsearch.index.fielddata.IndexFieldDataService indexFieldDataService7 = null;
        org.elasticsearch.index.engine.EngineFactory engineFactory8 = null;
        org.elasticsearch.index.shard.IndexEventListener indexEventListener9 = null;
        org.elasticsearch.index.shard.IndexSearcherWrapper indexSearcherWrapper10 = null;
        org.elasticsearch.threadpool.ThreadPool threadPool11 = null;
        org.elasticsearch.common.util.BigArrays bigArrays12 = null;
        org.elasticsearch.index.engine.Engine.Warmer warmer13 = null;
        java.lang.Runnable runnable14 = null;
        org.elasticsearch.index.shard.SearchOperationListener[] searchOperationListenerArray15 = new org.elasticsearch.index.shard.SearchOperationListener[] {};
        java.util.ArrayList<org.elasticsearch.index.shard.SearchOperationListener> searchOperationListenerList16 = new java.util.ArrayList<org.elasticsearch.index.shard.SearchOperationListener>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.elasticsearch.index.shard.SearchOperationListener>) searchOperationListenerList16, searchOperationListenerArray15);
        java.util.List<org.elasticsearch.index.shard.IndexingOperationListener> indexingOperationListenerList18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.shard.IndexShard indexShard19 = new org.elasticsearch.index.shard.IndexShard(shardRouting0, indexSettings1, shardPath2, store3, indexCache4, mapperService5, similarityService6, indexFieldDataService7, engineFactory8, indexEventListener9, indexSearcherWrapper10, threadPool11, bigArrays12, warmer13, runnable14, (java.util.List<org.elasticsearch.index.shard.SearchOperationListener>) searchOperationListenerList16, indexingOperationListenerList18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchOperationListenerArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException1 = deleteRequest0.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest3.timeout();
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.setParentTask("", (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 0 length nodeIds are reserved for EMPTY_TASK_ID and are otherwise invalid.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(actionRequestValidationException1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(timeValue4);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.seqNo((long) 10);
        java.lang.Class<?> wildcardClass3 = deleteRequest0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.setParentTask("", (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 0 length nodeIds are reserved for EMPTY_TASK_ID and are otherwise invalid.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue6 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.timeout(timeValue6);
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = null;
        deleteRequest5.remoteAddress(transportAddress8);
        java.lang.String str10 = deleteRequest5.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "", deleteRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.refresh(false);
        org.elasticsearch.index.VersionType versionType7 = deleteRequest4.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.versionType(versionType7);
        deleteRequest8.seqNo((long) (byte) -1);
        org.elasticsearch.common.io.stream.StreamInput streamInput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest8.readFrom(streamInput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(versionType7);
        org.junit.Assert.assertNotNull(deleteRequest8);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.timeout("hi!");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [hi!] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.VersionType versionType3 = deleteRequest0.versionType();
        java.lang.String str4 = deleteRequest0.type();
        java.lang.String str5 = deleteRequest0.index();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest3.remoteAddress(transportAddress6);
        java.lang.String str8 = deleteRequest3.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.index("delete {[null][null][null]}");
        java.lang.String str13 = deleteRequest10.type();
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest3.remoteAddress(transportAddress6);
        java.lang.String str8 = deleteRequest3.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.id("");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.timeout("");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = deleteRequest2.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.refresh(false);
        org.elasticsearch.index.VersionType versionType9 = deleteRequest6.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest5.versionType(versionType9);
        deleteRequest10.seqNo((long) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "", deleteRequest10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(versionType9);
        org.junit.Assert.assertNotNull(deleteRequest10);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.VersionType versionType3 = deleteRequest0.versionType();
        java.lang.String str4 = deleteRequest0.type();
        java.lang.String str5 = deleteRequest0.getDescription();
        boolean boolean6 = deleteRequest0.getShouldPersistResult();
        org.elasticsearch.index.shard.IndexShard indexShard7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult8 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest0, indexShard7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "delete {[null][null][null]}" + "'", str5, "delete {[null][null][null]}");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest3.remoteAddress(transportAddress6);
        java.lang.String str8 = deleteRequest3.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.parent("hi!");
        org.elasticsearch.index.VersionType versionType11 = deleteRequest3.versionType();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest3.timeout("");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(versionType11);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId3 = deleteRequest2.shardId();
        deleteRequest2.primaryTerm((long) (byte) 10);
        org.elasticsearch.index.shard.IndexShard indexShard6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult7 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest2, indexShard6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(shardId3);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.refresh(true);
        deleteRequest5.primaryTerm((long) (byte) 100);
        org.elasticsearch.index.shard.IndexShard indexShard8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult9 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest5, indexShard8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.refresh(true);
        deleteRequest3.primaryTerm((long) 10);
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = deleteRequest3.remoteAddress();
        deleteRequest3.seqNo((-3L));
        org.elasticsearch.index.shard.IndexShard indexShard11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult12 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest3, indexShard11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(transportAddress8);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput2 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.writeTo(streamOutput2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions1);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException5 = deleteRequest4.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest4.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue8 = deleteRequest7.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest0.timeout(timeValue8);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.refresh(false);
        org.elasticsearch.tasks.TaskId taskId13 = deleteRequest12.getParentTask();
        deleteRequest0.setParentTask(taskId13);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest0.id("delete {[null][null][null]}");
        org.elasticsearch.common.io.stream.StreamOutput streamOutput17 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest16.writeTo(streamOutput17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(actionRequestValidationException5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(taskId13);
        org.junit.Assert.assertNotNull(deleteRequest16);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        java.lang.String str4 = deleteRequest0.toString();
        org.elasticsearch.index.shard.IndexShard indexShard5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult6 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest0, indexShard5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[null][null][null]}" + "'", str4, "delete {[null][null][null]}");
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.refresh(false);
        org.elasticsearch.index.VersionType versionType7 = deleteRequest4.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.versionType(versionType7);
        java.lang.Class<?> wildcardClass9 = deleteRequest8.getClass();
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(versionType7);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest3.remoteAddress(transportAddress6);
        java.lang.String str8 = deleteRequest3.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.index("delete {[null][null][null]}");
        org.elasticsearch.common.io.stream.StreamInput streamInput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest12.readFrom(streamInput13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        java.lang.String str4 = deleteRequest0.toString();
        org.elasticsearch.common.unit.TimeValue timeValue5 = deleteRequest0.timeout();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.timeout("delete {[][null][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[][null][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[null][null][null]}" + "'", str4, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(timeValue5);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel3 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.consistencyLevel(writeConsistencyLevel3);
        deleteRequest4.seqNo((long) (byte) 0);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest4.routing("delete {[null][null][null]}");
        org.elasticsearch.common.io.stream.StreamInput streamInput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest8.readFrom(streamInput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest8);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException1 = deleteRequest0.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest3.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest7.setParentTask("hi!", 10L);
        java.lang.String[] strArray11 = deleteRequest7.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest12.setParentTask("hi!", 10L);
        java.lang.String[] strArray16 = deleteRequest12.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel17 = deleteRequest12.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest7.consistencyLevel(writeConsistencyLevel17);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest6.consistencyLevel(writeConsistencyLevel17);
        java.lang.Class<?> wildcardClass20 = deleteRequest19.getClass();
        org.junit.Assert.assertNotNull(actionRequestValidationException1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel17 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel17.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.VersionType versionType3 = deleteRequest0.versionType();
        java.lang.String str4 = deleteRequest0.type();
        java.lang.String str5 = deleteRequest0.getDescription();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.routing("hi!");
        java.lang.Class<?> wildcardClass8 = deleteRequest0.getClass();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "delete {[null][null][null]}" + "'", str5, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException1 = deleteRequest0.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.routing("hi!");
        org.elasticsearch.index.shard.ShardId shardId4 = deleteRequest3.shardId();
        org.elasticsearch.index.shard.IndexShard indexShard5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult6 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest3, indexShard5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(actionRequestValidationException1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNull(shardId4);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest3.remoteAddress(transportAddress6);
        java.lang.String str8 = deleteRequest3.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.index("delete {[null][null][null]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest12.timeout("delete {[][][hi!]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[][][hi!]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        java.lang.String[] strArray4 = deleteRequest0.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = deleteRequest0.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.routing("hi!");
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.setParentTask("", 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 0 length nodeIds are reserved for EMPTY_TASK_ID and are otherwise invalid.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel5 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel5.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest7);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException1 = deleteRequest0.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest3.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.routing("");
        org.elasticsearch.index.shard.IndexShard indexShard7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult8 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest6, indexShard7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(actionRequestValidationException1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest6);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.type("hi!");
        java.lang.Class<?> wildcardClass5 = deleteRequest2.getClass();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        boolean boolean3 = deleteRequest0.getShouldPersistResult();
        org.elasticsearch.tasks.TaskId taskId4 = null;
        deleteRequest0.setParentTask(taskId4);
        org.elasticsearch.index.shard.IndexShard indexShard6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult7 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest0, indexShard6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.refresh(true);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "hi!", deleteRequest7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.routing("");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest0.timeout("hi!");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [hi!] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        boolean boolean4 = deleteRequest3.refresh();
        deleteRequest3.seqNo((long) '#');
        org.elasticsearch.common.io.stream.StreamInput streamInput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.readFrom(streamInput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException1 = deleteRequest0.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException3 = deleteRequest2.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue6 = deleteRequest5.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.timeout(timeValue6);
        java.lang.String[] strArray8 = deleteRequest0.indices();
        org.junit.Assert.assertNotNull(actionRequestValidationException1);
        org.junit.Assert.assertNotNull(actionRequestValidationException3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest3.remoteAddress(transportAddress6);
        java.lang.String str8 = deleteRequest3.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.parent("hi!");
        java.lang.String str11 = deleteRequest3.getDescription();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.writeTo(streamOutput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[][][hi!]}" + "'", str11, "delete {[][][hi!]}");
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId5 = deleteRequest4.shardId();
        long long6 = deleteRequest4.seqNo();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "", deleteRequest4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNull(shardId5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId5 = deleteRequest4.shardId();
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest4.remoteAddress(transportAddress6);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest8.setParentTask("hi!", 10L);
        java.lang.String str12 = deleteRequest8.toString();
        org.elasticsearch.common.unit.TimeValue timeValue13 = deleteRequest8.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest4.timeout(timeValue13);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[null][null][null]}", deleteRequest14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNull(shardId5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "delete {[null][null][null]}" + "'", str12, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(timeValue13);
        org.junit.Assert.assertNotNull(deleteRequest14);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        java.lang.String str4 = deleteRequest0.toString();
        long long5 = deleteRequest0.version();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue10 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.timeout(timeValue10);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest0.timeout(timeValue10);
        java.lang.Class<?> wildcardClass13 = deleteRequest0.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[null][null][null]}" + "'", str4, "delete {[null][null][null]}");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-3L) + "'", long5 == (-3L));
        org.junit.Assert.assertNotNull(timeValue10);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest3.remoteAddress(transportAddress6);
        java.lang.String str8 = deleteRequest3.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.parent("hi!");
        java.lang.Class<?> wildcardClass11 = deleteRequest3.getClass();
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        java.lang.String[] strArray4 = deleteRequest0.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = deleteRequest0.consistencyLevel();
        org.elasticsearch.index.shard.ShardId shardId6 = deleteRequest0.shardId();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest7.setParentTask("hi!", 10L);
        java.lang.String str11 = deleteRequest7.toString();
        long long12 = deleteRequest7.version();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue17 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest16.timeout(timeValue17);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest7.timeout(timeValue17);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest0.timeout(timeValue17);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput21 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest20.writeTo(streamOutput21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel5 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel5.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNull(shardId6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[null][null][null]}" + "'", str11, "delete {[null][null][null]}");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-3L) + "'", long12 == (-3L));
        org.junit.Assert.assertNotNull(timeValue17);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(deleteRequest20);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        java.lang.Class<?> wildcardClass6 = deleteRequest3.getClass();
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.VersionType versionType3 = deleteRequest0.versionType();
        java.lang.String str4 = deleteRequest0.type();
        java.lang.String str5 = deleteRequest0.getDescription();
        boolean boolean6 = deleteRequest0.getShouldPersistResult();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.writeTo(streamOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "delete {[null][null][null]}" + "'", str5, "delete {[null][null][null]}");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.tasks.TaskId taskId9 = null;
        org.elasticsearch.tasks.Task task10 = deleteRequest5.createTask((long) ' ', "delete {[null][null][null]}", "delete {[null][null][null]}", taskId9);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest5.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest14.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest16.refresh(true);
        org.elasticsearch.tasks.TaskId taskId19 = deleteRequest16.getParentTask();
        deleteRequest5.setParentTask(taskId19);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "", deleteRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(taskId19);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest3.remoteAddress(transportAddress6);
        java.lang.String str8 = deleteRequest3.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest3.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions14 = deleteRequest13.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest13.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest17.refresh(false);
        org.elasticsearch.index.VersionType versionType20 = deleteRequest17.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest16.versionType(versionType20);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest12.versionType(versionType20);
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest22.setParentTask("", (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 0 length nodeIds are reserved for EMPTY_TASK_ID and are otherwise invalid.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(indicesOptions14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(versionType20);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(deleteRequest22);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        java.lang.String str2 = deleteRequest0.id();
        long long3 = deleteRequest0.primaryTerm();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.writeTo(streamOutput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.refresh(true);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException7 = deleteRequest6.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue10 = deleteRequest9.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest5.timeout(timeValue10);
        org.elasticsearch.action.support.IndicesOptions indicesOptions12 = deleteRequest5.indicesOptions();
        org.elasticsearch.common.unit.TimeValue timeValue13 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest5.timeout(timeValue13);
        org.elasticsearch.common.io.stream.StreamInput streamInput15 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest14.readFrom(streamInput15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(actionRequestValidationException7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(timeValue10);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(indicesOptions12);
        org.junit.Assert.assertNotNull(deleteRequest14);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = null;
        deleteRequest0.remoteAddress(transportAddress4);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.writeTo(streamOutput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId3 = deleteRequest2.shardId();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.consistencyLevel(writeConsistencyLevel4);
        long long6 = deleteRequest5.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest7.setParentTask("hi!", 10L);
        java.lang.String[] strArray11 = deleteRequest7.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest12.setParentTask("hi!", 10L);
        java.lang.String[] strArray16 = deleteRequest12.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel17 = deleteRequest12.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest7.consistencyLevel(writeConsistencyLevel17);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest5.consistencyLevel(writeConsistencyLevel17);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest19.timeout("delete {[][null][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[][null][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(shardId3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel17 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel17.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(deleteRequest19);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException1 = deleteRequest0.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest3.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest7.setParentTask("hi!", 10L);
        java.lang.String[] strArray11 = deleteRequest7.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest12.setParentTask("hi!", 10L);
        java.lang.String[] strArray16 = deleteRequest12.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel17 = deleteRequest12.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest7.consistencyLevel(writeConsistencyLevel17);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest6.consistencyLevel(writeConsistencyLevel17);
        org.elasticsearch.index.shard.ShardId shardId20 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest6.setShardId(shardId20);
        boolean boolean22 = deleteRequest21.getShouldPersistResult();
        org.elasticsearch.common.unit.TimeValue timeValue23 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest21.timeout(timeValue23);
        org.elasticsearch.common.transport.TransportAddress transportAddress25 = deleteRequest21.remoteAddress();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest21.timeout("");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(actionRequestValidationException1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel17 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel17.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(timeValue23);
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNull(transportAddress25);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue7 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.timeout(timeValue7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest2.timeout(timeValue7);
        org.elasticsearch.index.shard.ShardId shardId10 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.setShardId(shardId10);
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest9.setParentTask("", (-3L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 0 length nodeIds are reserved for EMPTY_TASK_ID and are otherwise invalid.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(timeValue7);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel3 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.consistencyLevel(writeConsistencyLevel3);
        org.elasticsearch.index.shard.IndexShard indexShard5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete6 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest2, indexShard5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException5 = deleteRequest4.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest4.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue8 = deleteRequest7.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest0.timeout(timeValue8);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.refresh(false);
        org.elasticsearch.tasks.TaskId taskId13 = deleteRequest12.getParentTask();
        deleteRequest0.setParentTask(taskId13);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest0.id("delete {[null][null][null]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest16.timeout("delete {[null][null][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[null][null][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(actionRequestValidationException5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(taskId13);
        org.junit.Assert.assertNotNull(deleteRequest16);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest2.setParentTask("hi!", 10L);
        java.lang.String str6 = deleteRequest2.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.refresh(false);
        org.elasticsearch.tasks.TaskId taskId13 = deleteRequest12.getParentTask();
        org.elasticsearch.tasks.Task task14 = deleteRequest2.createTask((long) (-1), "", "hi!", taskId13);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[null][null][null]}", deleteRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "delete {[null][null][null]}" + "'", str6, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(taskId13);
        org.junit.Assert.assertNotNull(task14);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.refresh(true);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException7 = deleteRequest6.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue10 = deleteRequest9.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest5.timeout(timeValue10);
        org.elasticsearch.action.support.IndicesOptions indicesOptions12 = deleteRequest5.indicesOptions();
        org.elasticsearch.common.unit.TimeValue timeValue13 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest5.timeout(timeValue13);
        java.lang.String str15 = deleteRequest5.routing();
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(actionRequestValidationException7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(timeValue10);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(indicesOptions12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId3 = deleteRequest2.shardId();
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = null;
        deleteRequest2.remoteAddress(transportAddress4);
        org.elasticsearch.common.io.stream.StreamInput streamInput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest2.readFrom(streamInput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(shardId3);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.VersionType versionType3 = deleteRequest0.versionType();
        java.lang.String str4 = deleteRequest0.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest0.index("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions8 = deleteRequest7.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest7.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.refresh(false);
        org.elasticsearch.index.VersionType versionType14 = deleteRequest11.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest10.versionType(versionType14);
        deleteRequest15.seqNo((long) (byte) -1);
        org.elasticsearch.tasks.TaskId taskId18 = deleteRequest15.getParentTask();
        deleteRequest6.setParentTask(taskId18);
        org.elasticsearch.common.io.stream.StreamInput streamInput20 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest6.readFrom(streamInput20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(indicesOptions8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(versionType14);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(taskId18);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "", "delete {[null][null][null]}");
        java.lang.Class<?> wildcardClass4 = deleteRequest3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest3.remoteAddress(transportAddress6);
        java.lang.String str8 = deleteRequest3.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.parent("hi!");
        org.elasticsearch.common.io.stream.StreamOutput streamOutput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.writeTo(streamOutput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = deleteRequest2.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.parent("");
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest2.remoteAddress(transportAddress6);
        org.elasticsearch.action.support.IndicesOptions indicesOptions8 = deleteRequest2.indicesOptions();
        long long9 = deleteRequest2.primaryTerm();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[][null][null]}", deleteRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(indicesOptions8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest3.remoteAddress(transportAddress6);
        java.lang.String str8 = deleteRequest3.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.index("delete {[null][null][null]}");
        java.lang.String str13 = deleteRequest12.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest12.routing("");
        org.elasticsearch.index.shard.IndexShard indexShard16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete17 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest15, indexShard16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(deleteRequest15);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest3.remoteAddress(transportAddress6);
        java.lang.String str8 = deleteRequest3.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.index("delete {[null][null][null]}");
        org.elasticsearch.common.io.stream.StreamInput streamInput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest10.readFrom(streamInput13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        boolean boolean3 = deleteRequest0.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue8 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.timeout(timeValue8);
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = null;
        deleteRequest7.remoteAddress(transportAddress10);
        java.lang.String str12 = deleteRequest7.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest7.parent("hi!");
        org.elasticsearch.index.VersionType versionType15 = deleteRequest7.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest0.versionType(versionType15);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException17 = deleteRequest0.validate();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest0.timeout("hi!");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [hi!] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(versionType15);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(actionRequestValidationException17);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.refresh(false);
        org.elasticsearch.index.VersionType versionType7 = deleteRequest4.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.versionType(versionType7);
        deleteRequest8.seqNo((long) (byte) -1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest8.version(10L);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest8.writeTo(streamOutput13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(versionType7);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest12);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest0.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest0.version((long) ' ');
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = deleteRequest0.consistencyLevel();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.writeTo(streamOutput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel7 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel7.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[null][null][null]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "", deleteRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = deleteRequest3.remoteAddress();
        java.lang.String str7 = deleteRequest3.index();
        java.lang.String str8 = deleteRequest3.type();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.timeout("delete {[null][null][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[null][null][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(transportAddress6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = deleteRequest0.remoteAddress();
        java.lang.String str5 = deleteRequest0.routing();
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNull(transportAddress4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.VersionType versionType3 = deleteRequest0.versionType();
        java.lang.String str4 = deleteRequest0.type();
        java.lang.String str5 = deleteRequest0.getDescription();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.refresh(false);
        long long10 = deleteRequest7.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest7.refresh(false);
        java.lang.Class<?> wildcardClass13 = deleteRequest7.getClass();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "delete {[null][null][null]}" + "'", str5, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.elasticsearch.action.support.replication.ReplicationTask replicationTask0 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.setPhase(replicationTask0, "delete {[][null][null]}");
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        java.lang.String[] strArray4 = deleteRequest0.indices();
        java.lang.String[] strArray5 = deleteRequest0.indices();
        org.elasticsearch.tasks.TaskId taskId6 = deleteRequest0.getParentTask();
        org.elasticsearch.index.shard.IndexShard indexShard7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete8 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest0, indexShard7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(taskId6);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        java.lang.String str2 = deleteRequest0.id();
        long long3 = deleteRequest0.primaryTerm();
        java.lang.String str4 = deleteRequest0.routing();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest0.timeout("delete {[null][null][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[null][null][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str3 = deleteRequest2.getDescription();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.index("hi!");
        java.lang.String str6 = deleteRequest2.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "", deleteRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "delete {[null][null][null]}" + "'", str3, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest3.remoteAddress(transportAddress6);
        java.lang.String str8 = deleteRequest3.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest3.version((long) (byte) 1);
        org.elasticsearch.common.io.stream.StreamInput streamInput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest12.readFrom(streamInput13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        java.lang.String[] strArray4 = deleteRequest0.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = deleteRequest0.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.routing("hi!");
        org.elasticsearch.common.io.stream.StreamInput streamInput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest7.readFrom(streamInput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel5 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel5.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest7);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException4 = deleteRequest0.validate();
        java.lang.String str5 = deleteRequest0.parent();
        org.junit.Assert.assertNotNull(actionRequestValidationException4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        java.lang.String str2 = deleteRequest0.id();
        long long3 = deleteRequest0.primaryTerm();
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.setShardId(shardId4);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.tasks.TaskId taskId13 = null;
        org.elasticsearch.tasks.Task task14 = deleteRequest9.createTask((long) ' ', "delete {[null][null][null]}", "delete {[null][null][null]}", taskId13);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest9.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest18.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest20.refresh(true);
        org.elasticsearch.tasks.TaskId taskId23 = deleteRequest20.getParentTask();
        deleteRequest9.setParentTask(taskId23);
        deleteRequest5.setParentTask(taskId23);
        org.elasticsearch.index.shard.IndexShard indexShard26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult27 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest5, indexShard26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(task14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertNotNull(taskId23);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.refresh(false);
        org.elasticsearch.index.VersionType versionType7 = deleteRequest4.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.versionType(versionType7);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.writeTo(streamOutput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(versionType7);
        org.junit.Assert.assertNotNull(deleteRequest8);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.refresh(false);
        boolean boolean5 = deleteRequest2.getShouldPersistResult();
        org.elasticsearch.tasks.TaskId taskId6 = null;
        deleteRequest2.setParentTask(taskId6);
        java.lang.String str8 = deleteRequest2.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[null][null][]}", deleteRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        boolean boolean4 = deleteRequest3.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest7.setParentTask("hi!", 10L);
        java.lang.String[] strArray11 = deleteRequest7.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel12 = deleteRequest7.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest6.consistencyLevel(writeConsistencyLevel12);
        java.lang.Class<?> wildcardClass14 = deleteRequest6.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel12 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel12.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.elasticsearch.action.support.replication.ReplicationTask replicationTask0 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.setPhase(replicationTask0, "delete {[null][null][]}");
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        java.lang.String[] strArray4 = deleteRequest0.indices();
        java.lang.String[] strArray5 = deleteRequest0.indices();
        org.elasticsearch.index.VersionType versionType6 = deleteRequest0.versionType();
        org.elasticsearch.common.io.stream.StreamInput streamInput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.readFrom(streamInput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(versionType6);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = deleteRequest0.consistencyLevel();
        deleteRequest0.primaryTerm((long) (short) -1);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.writeTo(streamOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel4 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel4.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        java.lang.String str2 = deleteRequest0.id();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.timeout("delete {[][][hi!]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[][][hi!]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest0.timeout();
        java.lang.Class<?> wildcardClass5 = timeValue4.getClass();
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException5 = deleteRequest4.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest4.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue8 = deleteRequest7.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest0.timeout(timeValue8);
        org.elasticsearch.index.shard.IndexShard indexShard10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult11 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest9, indexShard10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(actionRequestValidationException5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(deleteRequest9);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.elasticsearch.action.support.replication.ReplicationTask replicationTask0 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.setPhase(replicationTask0, "delete {[][][hi!]}");
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        java.lang.String str4 = deleteRequest3.toString();
        java.lang.String str5 = deleteRequest3.type();
        java.lang.String str6 = deleteRequest3.parent();
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[null][null][null]}" + "'", str4, "delete {[null][null][null]}");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.refresh(true);
        java.lang.String[] strArray6 = deleteRequest3.indices();
        java.lang.String str7 = deleteRequest3.toString();
        org.elasticsearch.index.shard.ShardId shardId8 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.setShardId(shardId8);
        org.elasticsearch.index.shard.IndexShard indexShard10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult11 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest9, indexShard10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "delete {[][null][null]}" + "'", str7, "delete {[][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest9);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.refresh(true);
        java.lang.String[] strArray6 = deleteRequest3.indices();
        java.lang.String str7 = deleteRequest3.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest12.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest14.refresh(true);
        org.elasticsearch.tasks.TaskId taskId17 = deleteRequest14.getParentTask();
        org.elasticsearch.tasks.Task task18 = deleteRequest3.createTask(100L, "delete {[null][null][null]}", "delete {[null][null][null]}", taskId17);
        java.lang.String str19 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest20.refresh(false);
        org.elasticsearch.index.VersionType versionType23 = deleteRequest20.versionType();
        java.lang.String str24 = deleteRequest20.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest20.index("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue27 = deleteRequest26.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest3.timeout(timeValue27);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest28.timeout("delete {[null][null][]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[null][null][]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "delete {[][null][null]}" + "'", str7, "delete {[][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(taskId17);
        org.junit.Assert.assertNotNull(task18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertNotNull(versionType23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNotNull(timeValue27);
        org.junit.Assert.assertNotNull(deleteRequest28);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = deleteRequest3.remoteAddress();
        org.elasticsearch.index.shard.IndexShard indexShard7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete8 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest3, indexShard7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(transportAddress6);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.VersionType versionType3 = deleteRequest0.versionType();
        java.lang.String[] strArray4 = deleteRequest0.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest0.version((long) (short) 0);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest0.routing("hi!");
        java.lang.Class<?> wildcardClass9 = deleteRequest0.getClass();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        java.lang.String str2 = deleteRequest0.id();
        long long3 = deleteRequest0.primaryTerm();
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.setShardId(shardId4);
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.setShardId(shardId6);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest5.writeTo(streamOutput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.index("");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.timeout("hi!");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [hi!] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask((long) ' ', "delete {[null][null][null]}", "delete {[null][null][null]}", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest3.index("delete {[null][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest12.id("");
        org.elasticsearch.index.shard.IndexShard indexShard15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete16 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest14, indexShard15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest14);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException7 = deleteRequest6.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException9 = deleteRequest8.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest8.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue12 = deleteRequest11.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest6.timeout(timeValue12);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest6.index("hi!");
        org.elasticsearch.common.transport.TransportAddress transportAddress16 = null;
        deleteRequest6.remoteAddress(transportAddress16);
        org.elasticsearch.index.shard.ShardId shardId18 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest6.setShardId(shardId18);
        org.elasticsearch.tasks.TaskId taskId20 = deleteRequest19.getParentTask();
        deleteRequest5.setParentTask(taskId20);
        org.elasticsearch.index.shard.IndexShard indexShard22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete23 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest5, indexShard22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(actionRequestValidationException7);
        org.junit.Assert.assertNotNull(actionRequestValidationException9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(timeValue12);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(taskId20);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        boolean boolean4 = deleteRequest3.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue7 = deleteRequest6.timeout();
        long long8 = deleteRequest6.primaryTerm();
        deleteRequest6.setParentTask("delete {[null][null][]}", (-3L));
        org.elasticsearch.common.io.stream.StreamInput streamInput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest6.readFrom(streamInput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(timeValue7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = deleteRequest3.remoteAddress();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.timeout("delete {[null][null][]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[null][null][]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(transportAddress6);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException1 = deleteRequest0.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.refresh(false);
        org.elasticsearch.index.shard.IndexShard indexShard6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete7 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest3, indexShard6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(actionRequestValidationException1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest3.remoteAddress(transportAddress6);
        java.lang.String str8 = deleteRequest3.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.id("");
        java.lang.String str11 = deleteRequest3.index();
        java.lang.Class<?> wildcardClass12 = deleteRequest3.getClass();
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.refresh(false);
        org.elasticsearch.index.VersionType versionType7 = deleteRequest4.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.versionType(versionType7);
        deleteRequest8.seqNo((long) (byte) -1);
        org.elasticsearch.tasks.TaskId taskId11 = deleteRequest8.getParentTask();
        java.lang.Class<?> wildcardClass12 = taskId11.getClass();
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(versionType7);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(taskId11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.refresh(false);
        boolean boolean5 = deleteRequest2.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue10 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.timeout(timeValue10);
        org.elasticsearch.common.transport.TransportAddress transportAddress12 = null;
        deleteRequest9.remoteAddress(transportAddress12);
        java.lang.String str14 = deleteRequest9.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest9.parent("hi!");
        org.elasticsearch.index.VersionType versionType17 = deleteRequest9.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest2.versionType(versionType17);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException19 = deleteRequest2.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure21 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "hi!", (java.lang.Throwable) actionRequestValidationException19, "delete {[null][null][null]}");
        java.lang.Throwable throwable22 = shardFailure21.cause;
        java.lang.String str23 = shardFailure21.indexUUID;
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(timeValue10);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(versionType17);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(actionRequestValidationException19);
        org.junit.Assert.assertNotNull(throwable22);
        org.junit.Assert.assertEquals(throwable22.getLocalizedMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable22.getMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable22.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "delete {[null][null][null]}" + "'", str23, "delete {[null][null][null]}");
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        java.lang.String[] strArray4 = deleteRequest0.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest5.setParentTask("hi!", 10L);
        java.lang.String[] strArray9 = deleteRequest5.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = deleteRequest5.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest0.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel12 = deleteRequest0.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions14 = deleteRequest13.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest13.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest17.refresh(false);
        org.elasticsearch.index.VersionType versionType20 = deleteRequest17.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest16.versionType(versionType20);
        deleteRequest21.seqNo((long) (byte) -1);
        org.elasticsearch.tasks.TaskId taskId24 = deleteRequest21.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest29.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest31.refresh(true);
        org.elasticsearch.tasks.TaskId taskId34 = deleteRequest31.getParentTask();
        org.elasticsearch.tasks.Task task35 = deleteRequest21.createTask((long) (short) 10, "", "hi!", taskId34);
        deleteRequest0.setParentTask(taskId34);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest38 = deleteRequest0.refresh(true);
        org.elasticsearch.index.shard.IndexShard indexShard39 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult40 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest0, indexShard39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel12 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel12.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(indicesOptions14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(versionType20);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(taskId24);
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertNotNull(taskId34);
        org.junit.Assert.assertNotNull(task35);
        org.junit.Assert.assertNotNull(deleteRequest38);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.elasticsearch.action.support.replication.ReplicationTask replicationTask0 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.setPhase(replicationTask0, "delete {[null][][null]}");
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.refresh(false);
        org.elasticsearch.index.VersionType versionType7 = deleteRequest4.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.versionType(versionType7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.refresh(true);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.type("hi!");
        org.elasticsearch.index.shard.IndexShard indexShard13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult14 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest10, indexShard13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(versionType7);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest3.remoteAddress(transportAddress6);
        java.lang.String str8 = deleteRequest3.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.id("");
        long long11 = deleteRequest3.seqNo();
        java.lang.String str12 = deleteRequest3.routing();
        java.lang.Class<?> wildcardClass13 = deleteRequest3.getClass();
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest0.createTask((long) (short) 100, "", "", taskId7);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest0.timeout("delete {[null][null][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[null][null][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        boolean boolean3 = deleteRequest0.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue8 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.timeout(timeValue8);
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = null;
        deleteRequest7.remoteAddress(transportAddress10);
        java.lang.String str12 = deleteRequest7.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest7.parent("hi!");
        org.elasticsearch.index.VersionType versionType15 = deleteRequest7.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest0.versionType(versionType15);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException17 = deleteRequest0.validate();
        org.elasticsearch.index.shard.IndexShard indexShard18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult19 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest0, indexShard18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(versionType15);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(actionRequestValidationException17);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        java.lang.String[] strArray4 = deleteRequest0.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = deleteRequest0.consistencyLevel();
        org.elasticsearch.index.shard.ShardId shardId6 = deleteRequest0.shardId();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest7.setParentTask("hi!", 10L);
        java.lang.String str11 = deleteRequest7.toString();
        long long12 = deleteRequest7.version();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue17 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest16.timeout(timeValue17);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest7.timeout(timeValue17);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest0.timeout(timeValue17);
        long long21 = deleteRequest20.primaryTerm();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel5 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel5.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNull(shardId6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[null][null][null]}" + "'", str11, "delete {[null][null][null]}");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-3L) + "'", long12 == (-3L));
        org.junit.Assert.assertNotNull(timeValue17);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException1 = deleteRequest0.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException3 = deleteRequest2.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue6 = deleteRequest5.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.timeout(timeValue6);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest0.index("hi!");
        org.elasticsearch.common.io.stream.StreamOutput streamOutput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.writeTo(streamOutput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(actionRequestValidationException1);
        org.junit.Assert.assertNotNull(actionRequestValidationException3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.refresh(false);
        org.elasticsearch.index.VersionType versionType7 = deleteRequest4.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.versionType(versionType7);
        org.elasticsearch.common.transport.TransportAddress transportAddress9 = null;
        deleteRequest8.remoteAddress(transportAddress9);
        org.elasticsearch.index.VersionType versionType11 = deleteRequest8.versionType();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest8.writeTo(streamOutput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(versionType7);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(versionType11);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.refresh(true);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException7 = deleteRequest6.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue10 = deleteRequest9.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest5.timeout(timeValue10);
        org.elasticsearch.action.support.IndicesOptions indicesOptions12 = deleteRequest5.indicesOptions();
        org.elasticsearch.common.unit.TimeValue timeValue13 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest5.timeout(timeValue13);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest5.index("delete {[][null][null]}");
        java.lang.Class<?> wildcardClass17 = deleteRequest16.getClass();
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(actionRequestValidationException7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(timeValue10);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(indicesOptions12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.VersionType versionType3 = deleteRequest0.versionType();
        long long4 = deleteRequest0.primaryTerm();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.writeTo(streamOutput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.refresh(false);
        org.elasticsearch.index.VersionType versionType7 = deleteRequest4.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.versionType(versionType7);
        org.elasticsearch.common.transport.TransportAddress transportAddress9 = null;
        deleteRequest8.remoteAddress(transportAddress9);
        org.elasticsearch.index.VersionType versionType11 = deleteRequest8.versionType();
        org.elasticsearch.common.io.stream.StreamInput streamInput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest8.readFrom(streamInput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(versionType7);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(versionType11);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = deleteRequest2.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.parent("");
        java.lang.String str6 = deleteRequest5.toString();
        java.lang.String str7 = deleteRequest5.routing();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "", deleteRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "delete {[null][null][null]}" + "'", str6, "delete {[null][null][null]}");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "hi!", deleteRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException1 = deleteRequest0.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId9 = deleteRequest8.shardId();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest8.consistencyLevel(writeConsistencyLevel10);
        java.lang.String str12 = deleteRequest11.routing();
        org.elasticsearch.index.VersionType versionType13 = deleteRequest11.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest3.versionType(versionType13);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest3.parent("delete {[][null][null]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress17 = null;
        deleteRequest16.remoteAddress(transportAddress17);
        org.elasticsearch.index.shard.IndexShard indexShard19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult20 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest16, indexShard19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(actionRequestValidationException1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNull(shardId9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(versionType13);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest16);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel3 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.consistencyLevel(writeConsistencyLevel3);
        deleteRequest4.seqNo((long) (byte) 0);
        java.lang.String str7 = deleteRequest4.routing();
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = deleteRequest4.remoteAddress();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(transportAddress8);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.VersionType versionType3 = deleteRequest0.versionType();
        java.lang.String[] strArray4 = deleteRequest0.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest0.version((long) (short) 0);
        deleteRequest0.setParentTask("hi!", (long) (short) 100);
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(deleteRequest6);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.index("");
        java.lang.String str7 = deleteRequest6.type();
        org.elasticsearch.index.shard.IndexShard indexShard8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult9 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest6, indexShard8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.parent("");
        org.elasticsearch.common.unit.TimeValue timeValue6 = deleteRequest5.timeout();
        org.elasticsearch.common.io.stream.StreamInput streamInput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest5.readFrom(streamInput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(timeValue6);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = deleteRequest2.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.refresh(false);
        org.elasticsearch.index.VersionType versionType9 = deleteRequest6.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest5.versionType(versionType9);
        long long11 = deleteRequest5.version();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "hi!", deleteRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(versionType9);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-3L) + "'", long11 == (-3L));
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        boolean boolean3 = deleteRequest0.getShouldPersistResult();
        org.elasticsearch.action.support.IndicesOptions indicesOptions4 = deleteRequest0.indicesOptions();
        long long5 = deleteRequest0.seqNo();
        java.lang.String str6 = deleteRequest0.parent();
        java.lang.String[] strArray7 = deleteRequest0.indices();
        java.lang.Class<?> wildcardClass8 = strArray7.getClass();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(indicesOptions4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.index("");
        boolean boolean8 = deleteRequest7.refresh();
        org.elasticsearch.index.shard.ShardId shardId9 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest7.setShardId(shardId9);
        org.elasticsearch.index.shard.IndexShard indexShard11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete12 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest10, indexShard11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(deleteRequest10);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.type("hi!");
        org.elasticsearch.tasks.TaskId taskId5 = deleteRequest4.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest4.parent("delete {[null][null][null]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.timeout("delete {[delete {[][][hi!]}][][delete {[][null][null]}]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[delete {[][][hi!]}][][delete {[][null][null]}]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(taskId5);
        org.junit.Assert.assertNotNull(deleteRequest7);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException1 = deleteRequest0.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException3 = deleteRequest2.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue6 = deleteRequest5.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.timeout(timeValue6);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest0.index("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest0.refresh(false);
        org.elasticsearch.common.io.stream.StreamInput streamInput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest11.readFrom(streamInput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(actionRequestValidationException1);
        org.junit.Assert.assertNotNull(actionRequestValidationException3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.refresh(true);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException7 = deleteRequest6.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue10 = deleteRequest9.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest5.timeout(timeValue10);
        org.elasticsearch.action.support.IndicesOptions indicesOptions12 = deleteRequest5.indicesOptions();
        org.elasticsearch.common.unit.TimeValue timeValue13 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest5.timeout(timeValue13);
        java.lang.Class<?> wildcardClass15 = deleteRequest14.getClass();
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(actionRequestValidationException7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(timeValue10);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(indicesOptions12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = deleteRequest2.indicesOptions();
        java.lang.String str4 = deleteRequest2.id();
        long long5 = deleteRequest2.primaryTerm();
        java.lang.String str6 = deleteRequest2.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest2.id("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[null][null][null]}", deleteRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(deleteRequest8);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.parent("");
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest0.remoteAddress(transportAddress6);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest0.refresh(true);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.refresh(false);
        boolean boolean13 = deleteRequest10.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue18 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest17.timeout(timeValue18);
        org.elasticsearch.common.transport.TransportAddress transportAddress20 = null;
        deleteRequest17.remoteAddress(transportAddress20);
        java.lang.String str22 = deleteRequest17.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest17.parent("hi!");
        org.elasticsearch.index.VersionType versionType25 = deleteRequest17.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest10.versionType(versionType25);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest10.id("");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel29 = deleteRequest28.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest9.consistencyLevel(writeConsistencyLevel29);
        java.lang.String str31 = deleteRequest9.toString();
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(timeValue18);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNotNull(versionType25);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel29 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel29.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "delete {[null][null][null]}" + "'", str31, "delete {[null][null][null]}");
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        java.lang.String str2 = deleteRequest0.id();
        long long3 = deleteRequest0.primaryTerm();
        java.lang.String str4 = deleteRequest0.routing();
        java.lang.String str5 = deleteRequest0.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException10 = deleteRequest9.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException12 = deleteRequest11.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest11.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue15 = deleteRequest14.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest9.timeout(timeValue15);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.tasks.TaskId taskId27 = null;
        org.elasticsearch.tasks.Task task28 = deleteRequest23.createTask((long) ' ', "delete {[null][null][null]}", "delete {[null][null][null]}", taskId27);
        org.elasticsearch.tasks.TaskId taskId29 = deleteRequest23.getParentTask();
        org.elasticsearch.tasks.Task task30 = deleteRequest16.createTask((long) 1, "delete {[][null][null]}", "delete {[delete {[][null][null]}][hi!][null]}", taskId29);
        org.elasticsearch.tasks.Task task31 = deleteRequest0.createTask((long) ' ', "delete {[null][null][null]}", "", taskId29);
        org.elasticsearch.common.transport.TransportAddress transportAddress32 = null;
        deleteRequest0.remoteAddress(transportAddress32);
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "delete {[null][null][null]}" + "'", str5, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(actionRequestValidationException10);
        org.junit.Assert.assertNotNull(actionRequestValidationException12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(timeValue15);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(task28);
        org.junit.Assert.assertNotNull(taskId29);
        org.junit.Assert.assertNotNull(task30);
        org.junit.Assert.assertNotNull(task31);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException1 = deleteRequest0.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException3 = deleteRequest2.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue6 = deleteRequest5.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.timeout(timeValue6);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId11 = deleteRequest10.shardId();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel12 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest10.consistencyLevel(writeConsistencyLevel12);
        org.elasticsearch.action.support.IndicesOptions indicesOptions14 = deleteRequest10.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException16 = deleteRequest15.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest15.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue19 = deleteRequest18.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest18.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest22.setParentTask("hi!", 10L);
        java.lang.String[] strArray26 = deleteRequest22.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest27.setParentTask("hi!", 10L);
        java.lang.String[] strArray31 = deleteRequest27.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel32 = deleteRequest27.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest22.consistencyLevel(writeConsistencyLevel32);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = deleteRequest21.consistencyLevel(writeConsistencyLevel32);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = deleteRequest10.consistencyLevel(writeConsistencyLevel32);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest36 = deleteRequest0.consistencyLevel(writeConsistencyLevel32);
        org.elasticsearch.index.shard.IndexShard indexShard37 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete38 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest36, indexShard37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(actionRequestValidationException1);
        org.junit.Assert.assertNotNull(actionRequestValidationException3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNull(shardId11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(indicesOptions14);
        org.junit.Assert.assertNotNull(actionRequestValidationException16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(timeValue19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel32 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel32.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertNotNull(deleteRequest34);
        org.junit.Assert.assertNotNull(deleteRequest35);
        org.junit.Assert.assertNotNull(deleteRequest36);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException1 = deleteRequest0.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId9 = deleteRequest8.shardId();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest8.consistencyLevel(writeConsistencyLevel10);
        java.lang.String str12 = deleteRequest11.routing();
        org.elasticsearch.index.VersionType versionType13 = deleteRequest11.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest3.versionType(versionType13);
        long long15 = deleteRequest3.seqNo();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput16 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.writeTo(streamOutput16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(actionRequestValidationException1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNull(shardId9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(versionType13);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException1 = deleteRequest0.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId9 = deleteRequest8.shardId();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest8.consistencyLevel(writeConsistencyLevel10);
        java.lang.String str12 = deleteRequest11.routing();
        org.elasticsearch.index.VersionType versionType13 = deleteRequest11.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest3.versionType(versionType13);
        org.elasticsearch.index.shard.ShardId shardId15 = deleteRequest14.shardId();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest14.timeout("");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(actionRequestValidationException1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNull(shardId9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(versionType13);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNull(shardId15);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.refresh(false);
        org.elasticsearch.index.VersionType versionType7 = deleteRequest4.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.versionType(versionType7);
        deleteRequest8.seqNo((long) (byte) -1);
        org.elasticsearch.index.shard.IndexShard indexShard11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete12 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest8, indexShard11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(versionType7);
        org.junit.Assert.assertNotNull(deleteRequest8);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        java.lang.String[] strArray4 = deleteRequest0.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = deleteRequest0.consistencyLevel();
        org.elasticsearch.index.shard.ShardId shardId6 = deleteRequest0.shardId();
        long long7 = deleteRequest0.seqNo();
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = deleteRequest0.remoteAddress();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel5 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel5.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNull(shardId6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(transportAddress8);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId3 = deleteRequest2.shardId();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.consistencyLevel(writeConsistencyLevel4);
        deleteRequest2.setParentTask("delete {[null][null][null]}", (long) 10);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest2.type("delete {[][null][null]}");
        org.elasticsearch.index.shard.IndexShard indexShard11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete12 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest10, indexShard11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(shardId3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest10);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        java.lang.String[] strArray4 = deleteRequest0.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = deleteRequest0.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.routing("hi!");
        java.lang.String str8 = deleteRequest0.index();
        org.elasticsearch.common.io.stream.StreamInput streamInput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.readFrom(streamInput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel5 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel5.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.elasticsearch.action.support.replication.ReplicationTask replicationTask0 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.setPhase(replicationTask0, "");
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.refresh(false);
        boolean boolean5 = deleteRequest2.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue10 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.timeout(timeValue10);
        org.elasticsearch.common.transport.TransportAddress transportAddress12 = null;
        deleteRequest9.remoteAddress(transportAddress12);
        java.lang.String str14 = deleteRequest9.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest9.parent("hi!");
        org.elasticsearch.index.VersionType versionType17 = deleteRequest9.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest2.versionType(versionType17);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest2.parent("delete {[null][null][null]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[][][hi!]}", deleteRequest20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(timeValue10);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(versionType17);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(deleteRequest20);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        boolean boolean3 = deleteRequest0.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue8 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.timeout(timeValue8);
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = null;
        deleteRequest7.remoteAddress(transportAddress10);
        java.lang.String str12 = deleteRequest7.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest7.parent("hi!");
        org.elasticsearch.index.VersionType versionType15 = deleteRequest7.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest0.versionType(versionType15);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest0.parent("delete {[null][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest18.parent("delete {[null][null][null]}");
        org.elasticsearch.common.io.stream.StreamOutput streamOutput21 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest20.writeTo(streamOutput21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(versionType15);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(deleteRequest20);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.timeout("delete {[null][][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[null][][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.tasks.TaskId taskId3 = deleteRequest2.getParentTask();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest2.writeTo(streamOutput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(taskId3);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        java.lang.String str2 = deleteRequest0.id();
        java.lang.String str3 = deleteRequest0.id();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.writeTo(streamOutput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException3 = deleteRequest2.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue6 = deleteRequest5.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest5.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest9.setParentTask("hi!", 10L);
        java.lang.String[] strArray13 = deleteRequest9.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest14.setParentTask("hi!", 10L);
        java.lang.String[] strArray18 = deleteRequest14.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel19 = deleteRequest14.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest9.consistencyLevel(writeConsistencyLevel19);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest8.consistencyLevel(writeConsistencyLevel19);
        long long22 = deleteRequest8.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions24 = deleteRequest23.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest23.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest23.parent("");
        org.elasticsearch.common.unit.TimeValue timeValue29 = deleteRequest28.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest8.timeout(timeValue29);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[delete {[][null][null]}][hi!][null]}", deleteRequest30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(actionRequestValidationException3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel19 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel19.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(indicesOptions24);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertNotNull(timeValue29);
        org.junit.Assert.assertNotNull(deleteRequest30);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask((long) ' ', "delete {[null][null][null]}", "delete {[null][null][null]}", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.type("");
        org.elasticsearch.index.shard.ShardId shardId11 = deleteRequest10.shardId();
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNull(shardId11);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest3.remoteAddress(transportAddress6);
        java.lang.String str8 = deleteRequest3.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.id("");
        java.lang.String str11 = deleteRequest10.routing();
        java.lang.String str12 = deleteRequest10.parent();
        java.lang.String str13 = deleteRequest10.toString();
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "delete {[][][]}" + "'", str13, "delete {[][][]}");
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask((long) ' ', "delete {[null][null][null]}", "delete {[null][null][null]}", taskId7);
        java.lang.String str9 = deleteRequest3.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest3.timeout("delete {[null][null][hi!]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[null][null][hi!]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.refresh(false);
        org.elasticsearch.index.VersionType versionType7 = deleteRequest4.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.versionType(versionType7);
        deleteRequest8.seqNo((long) (byte) -1);
        org.elasticsearch.tasks.TaskId taskId11 = deleteRequest8.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest16.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest18.refresh(true);
        org.elasticsearch.tasks.TaskId taskId21 = deleteRequest18.getParentTask();
        org.elasticsearch.tasks.Task task22 = deleteRequest8.createTask((long) (short) 10, "", "hi!", taskId21);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest23.setParentTask("hi!", 10L);
        org.elasticsearch.common.unit.TimeValue timeValue27 = deleteRequest23.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest8.timeout(timeValue27);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput29 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest28.writeTo(streamOutput29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(versionType7);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(taskId11);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(taskId21);
        org.junit.Assert.assertNotNull(task22);
        org.junit.Assert.assertNotNull(timeValue27);
        org.junit.Assert.assertNotNull(deleteRequest28);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.refresh(false);
        org.elasticsearch.index.VersionType versionType7 = deleteRequest4.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.versionType(versionType7);
        boolean boolean9 = deleteRequest3.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest3.version((long) 0);
        org.elasticsearch.index.shard.IndexShard indexShard12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult13 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest3, indexShard12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(versionType7);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(deleteRequest11);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.type("hi!");
        org.elasticsearch.index.shard.IndexShard indexShard5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult6 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest4, indexShard5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        java.lang.String[] strArray4 = deleteRequest0.indices();
        java.lang.String[] strArray5 = deleteRequest0.indices();
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = deleteRequest0.remoteAddress();
        boolean boolean7 = deleteRequest0.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest0.id("");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNull(transportAddress6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(deleteRequest9);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.getDescription();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.index("hi!");
        org.elasticsearch.common.io.stream.StreamOutput streamOutput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.writeTo(streamOutput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "delete {[null][null][null]}" + "'", str1, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest3);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.elasticsearch.action.support.replication.ReplicationTask replicationTask0 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.setPhase(replicationTask0, "delete {[][][]}");
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        org.elasticsearch.action.support.replication.ReplicationTask replicationTask0 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.setPhase(replicationTask0, "delete {[null][hi!][null]}");
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][][hi!]}");
        org.elasticsearch.common.io.stream.StreamInput streamInput2 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest1.readFrom(streamInput2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = deleteRequest3.remoteAddress();
        boolean boolean7 = deleteRequest3.getShouldPersistResult();
        java.lang.String str8 = deleteRequest3.id();
        org.elasticsearch.index.shard.ShardId shardId9 = deleteRequest3.shardId();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.writeTo(streamOutput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(transportAddress6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(shardId9);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        java.lang.String str2 = deleteRequest0.id();
        deleteRequest0.seqNo(0L);
        org.elasticsearch.index.shard.IndexShard indexShard5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult6 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest0, indexShard5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        long long3 = deleteRequest0.seqNo();
        java.lang.String str4 = deleteRequest0.toString();
        java.lang.String str5 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest0.type("hi!");
        org.elasticsearch.index.shard.IndexShard indexShard10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete11 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest9, indexShard10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[null][null][null]}" + "'", str4, "delete {[null][null][null]}");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        boolean boolean4 = deleteRequest3.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue7 = deleteRequest6.timeout();
        long long8 = deleteRequest6.primaryTerm();
        deleteRequest6.setParentTask("delete {[null][null][]}", (-3L));
        org.elasticsearch.index.VersionType versionType12 = deleteRequest6.versionType();
        java.lang.String str13 = deleteRequest6.type();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(timeValue7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(versionType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        boolean boolean6 = deleteRequest5.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest5.type("");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[delete {[][null][null]}][hi!][null]}", deleteRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(deleteRequest8);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException1 = deleteRequest0.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException3 = deleteRequest2.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue6 = deleteRequest5.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.timeout(timeValue6);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId11 = deleteRequest10.shardId();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel12 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest10.consistencyLevel(writeConsistencyLevel12);
        org.elasticsearch.action.support.IndicesOptions indicesOptions14 = deleteRequest10.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException16 = deleteRequest15.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest15.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue19 = deleteRequest18.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest18.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest22.setParentTask("hi!", 10L);
        java.lang.String[] strArray26 = deleteRequest22.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest27.setParentTask("hi!", 10L);
        java.lang.String[] strArray31 = deleteRequest27.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel32 = deleteRequest27.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest22.consistencyLevel(writeConsistencyLevel32);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = deleteRequest21.consistencyLevel(writeConsistencyLevel32);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = deleteRequest10.consistencyLevel(writeConsistencyLevel32);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest36 = deleteRequest0.consistencyLevel(writeConsistencyLevel32);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput37 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest36.writeTo(streamOutput37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(actionRequestValidationException1);
        org.junit.Assert.assertNotNull(actionRequestValidationException3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNull(shardId11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(indicesOptions14);
        org.junit.Assert.assertNotNull(actionRequestValidationException16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(timeValue19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel32 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel32.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertNotNull(deleteRequest34);
        org.junit.Assert.assertNotNull(deleteRequest35);
        org.junit.Assert.assertNotNull(deleteRequest36);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        java.lang.String str4 = deleteRequest3.toString();
        deleteRequest3.primaryTerm((long) 100);
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[null][null][null]}" + "'", str4, "delete {[null][null][null]}");
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][][hi!]}", "", "delete {[][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest3.timeout();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = deleteRequest3.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        boolean boolean10 = deleteRequest9.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest9.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue13 = deleteRequest12.timeout();
        long long14 = deleteRequest12.primaryTerm();
        deleteRequest12.setParentTask("delete {[null][null][]}", (-3L));
        org.elasticsearch.index.VersionType versionType18 = deleteRequest12.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest3.versionType(versionType18);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest20.refresh(false);
        boolean boolean23 = deleteRequest20.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue28 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest27.timeout(timeValue28);
        org.elasticsearch.common.transport.TransportAddress transportAddress30 = null;
        deleteRequest27.remoteAddress(transportAddress30);
        java.lang.String str32 = deleteRequest27.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = deleteRequest27.parent("hi!");
        org.elasticsearch.index.VersionType versionType35 = deleteRequest27.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest36 = deleteRequest20.versionType(versionType35);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest37 = deleteRequest19.versionType(versionType35);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput38 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest19.writeTo(streamOutput38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel5 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel5.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(timeValue13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(versionType18);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(timeValue28);
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(deleteRequest34);
        org.junit.Assert.assertNotNull(versionType35);
        org.junit.Assert.assertNotNull(deleteRequest36);
        org.junit.Assert.assertNotNull(deleteRequest37);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "", "delete {[null][null][]}");
        java.lang.String str4 = deleteRequest3.parent();
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][][]}", "delete {[delete {[null][null][null]}][][]}", "delete {[null][null][]}");
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = deleteRequest0.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest0.type("delete {[delete {[][null][null]}][hi!][null]}");
        java.lang.String[] strArray7 = deleteRequest0.indices();
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNull(transportAddress4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.getDescription();
        org.elasticsearch.index.shard.ShardId shardId2 = deleteRequest0.shardId();
        boolean boolean3 = deleteRequest0.refresh();
        long long4 = deleteRequest0.primaryTerm();
        java.lang.String str5 = deleteRequest0.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.timeout("delete {[][][hi!]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[][][hi!]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "delete {[null][null][null]}" + "'", str1, "delete {[null][null][null]}");
        org.junit.Assert.assertNull(shardId2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "delete {[null][null][null]}" + "'", str5, "delete {[null][null][null]}");
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId3 = deleteRequest2.shardId();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.consistencyLevel(writeConsistencyLevel4);
        long long6 = deleteRequest5.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest7.setParentTask("hi!", 10L);
        java.lang.String[] strArray11 = deleteRequest7.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest12.setParentTask("hi!", 10L);
        java.lang.String[] strArray16 = deleteRequest12.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel17 = deleteRequest12.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest7.consistencyLevel(writeConsistencyLevel17);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest5.consistencyLevel(writeConsistencyLevel17);
        org.elasticsearch.index.shard.ShardId shardId20 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest19.setShardId(shardId20);
        java.lang.Class<?> wildcardClass22 = deleteRequest21.getClass();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(shardId3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel17 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel17.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue7 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.timeout(timeValue7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest2.timeout(timeValue7);
        java.lang.String str10 = deleteRequest9.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest9.parent("");
        boolean boolean13 = deleteRequest9.getShouldPersistResult();
        boolean boolean14 = deleteRequest9.getShouldPersistResult();
        org.elasticsearch.index.shard.IndexShard indexShard15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult16 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest9, indexShard15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(timeValue7);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.common.io.stream.StreamInput streamInput3 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest2.readFrom(streamInput3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest0.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest0.version((long) ' ');
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = deleteRequest0.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest0.routing("delete {[][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest0.id("delete {[][null][null]}");
        org.elasticsearch.common.io.stream.StreamOutput streamOutput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest11.writeTo(streamOutput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel7 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel7.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue7 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.timeout(timeValue7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest2.timeout(timeValue7);
        java.lang.String str10 = deleteRequest9.type();
        org.elasticsearch.common.transport.TransportAddress transportAddress11 = null;
        deleteRequest9.remoteAddress(transportAddress11);
        boolean boolean13 = deleteRequest9.getShouldPersistResult();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest9.timeout("");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(timeValue7);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest2.setParentTask("hi!", 10L);
        java.lang.String str6 = deleteRequest2.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.refresh(false);
        org.elasticsearch.tasks.TaskId taskId13 = deleteRequest12.getParentTask();
        org.elasticsearch.tasks.Task task14 = deleteRequest2.createTask((long) (-1), "", "hi!", taskId13);
        org.elasticsearch.index.shard.ShardId shardId15 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest2.setShardId(shardId15);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest2.version((long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[null][null][null]}", deleteRequest18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "delete {[null][null][null]}" + "'", str6, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(taskId13);
        org.junit.Assert.assertNotNull(task14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(deleteRequest18);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException1 = deleteRequest0.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException3 = deleteRequest2.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue6 = deleteRequest5.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.timeout(timeValue6);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest0.index("hi!");
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = null;
        deleteRequest0.remoteAddress(transportAddress10);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest0.timeout("delete {[delete {[][][hi!]}][][delete {[][null][null]}]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[delete {[][][hi!]}][][delete {[][null][null]}]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(actionRequestValidationException1);
        org.junit.Assert.assertNotNull(actionRequestValidationException3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        boolean boolean4 = deleteRequest3.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest7.setParentTask("hi!", 10L);
        java.lang.String[] strArray11 = deleteRequest7.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel12 = deleteRequest7.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest6.consistencyLevel(writeConsistencyLevel12);
        java.lang.String str14 = deleteRequest13.toString();
        org.elasticsearch.common.io.stream.StreamInput streamInput15 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest13.readFrom(streamInput15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel12 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel12.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "delete {[][][hi!]}" + "'", str14, "delete {[][][hi!]}");
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.getDescription();
        org.elasticsearch.index.shard.ShardId shardId2 = deleteRequest0.shardId();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.timeout("delete {[null][null][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[null][null][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "delete {[null][null][null]}" + "'", str1, "delete {[null][null][null]}");
        org.junit.Assert.assertNull(shardId2);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue7 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.timeout(timeValue7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest2.timeout(timeValue7);
        java.lang.String str10 = deleteRequest9.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest9.parent("");
        boolean boolean13 = deleteRequest9.getShouldPersistResult();
        java.lang.String str14 = deleteRequest9.parent();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(timeValue7);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.getDescription();
        org.elasticsearch.index.shard.ShardId shardId2 = deleteRequest0.shardId();
        boolean boolean3 = deleteRequest0.refresh();
        deleteRequest0.primaryTerm((long) ' ');
        java.lang.String str6 = deleteRequest0.toString();
        org.elasticsearch.common.io.stream.StreamInput streamInput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.readFrom(streamInput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "delete {[null][null][null]}" + "'", str1, "delete {[null][null][null]}");
        org.junit.Assert.assertNull(shardId2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "delete {[null][null][null]}" + "'", str6, "delete {[null][null][null]}");
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][][]}", "delete {[delete {[null][null][null]}][][]}", "delete {[][][]}");
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        java.lang.String str2 = deleteRequest0.id();
        java.lang.String str3 = deleteRequest0.id();
        org.elasticsearch.common.io.stream.StreamInput streamInput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.readFrom(streamInput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest3.remoteAddress(transportAddress6);
        java.lang.String str8 = deleteRequest3.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest3.version((long) (byte) 1);
        deleteRequest12.seqNo((long) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest12.timeout("delete {[null][null][hi!]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[null][null][hi!]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest3.remoteAddress(transportAddress6);
        java.lang.String str8 = deleteRequest3.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.parent("hi!");
        java.lang.String str11 = deleteRequest3.getDescription();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException13 = deleteRequest12.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest12.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest15.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        boolean boolean22 = deleteRequest21.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest21.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue25 = deleteRequest24.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest17.timeout(timeValue25);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest3.timeout(timeValue25);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest27.type("delete {[null][null][hi!]}");
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest29.setParentTask("", 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 0 length nodeIds are reserved for EMPTY_TASK_ID and are otherwise invalid.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[][][hi!]}" + "'", str11, "delete {[][][hi!]}");
        org.junit.Assert.assertNotNull(actionRequestValidationException13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNotNull(timeValue25);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertNotNull(deleteRequest29);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId3 = deleteRequest2.shardId();
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = null;
        deleteRequest2.remoteAddress(transportAddress4);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest2.timeout("delete {[][][hi!]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[][][hi!]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(shardId3);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        deleteRequest3.primaryTerm(1L);
        java.lang.String str8 = deleteRequest3.parent();
        org.elasticsearch.index.shard.IndexShard indexShard9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete10 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest3, indexShard9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.VersionType versionType3 = deleteRequest0.versionType();
        java.lang.String str4 = deleteRequest0.type();
        java.lang.String str5 = deleteRequest0.getDescription();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.refresh(false);
        long long10 = deleteRequest7.primaryTerm();
        org.elasticsearch.index.shard.ShardId shardId11 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest7.setShardId(shardId11);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions17 = deleteRequest16.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest16.parent("");
        org.elasticsearch.common.transport.TransportAddress transportAddress20 = null;
        deleteRequest16.remoteAddress(transportAddress20);
        org.elasticsearch.tasks.TaskId taskId22 = deleteRequest16.getParentTask();
        org.elasticsearch.tasks.Task task23 = deleteRequest12.createTask(0L, "", "delete {[null][null][]}", taskId22);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest12.version((-1L));
        org.elasticsearch.common.io.stream.StreamOutput streamOutput26 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest25.writeTo(streamOutput26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "delete {[null][null][null]}" + "'", str5, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(indicesOptions17);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(taskId22);
        org.junit.Assert.assertNotNull(task23);
        org.junit.Assert.assertNotNull(deleteRequest25);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.parent("");
        java.lang.Class<?> wildcardClass8 = deleteRequest0.getClass();
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.VersionType versionType3 = deleteRequest0.versionType();
        java.lang.String str4 = deleteRequest0.type();
        java.lang.String str5 = deleteRequest0.getDescription();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.index("");
        org.elasticsearch.common.io.stream.StreamOutput streamOutput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest7.writeTo(streamOutput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "delete {[null][null][null]}" + "'", str5, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest7);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        java.lang.String[] strArray4 = deleteRequest0.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest5.setParentTask("hi!", 10L);
        java.lang.String[] strArray9 = deleteRequest5.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = deleteRequest5.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest0.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.refresh(true);
        org.elasticsearch.index.shard.ShardId shardId16 = deleteRequest13.shardId();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest17.setParentTask("hi!", 10L);
        org.elasticsearch.common.unit.TimeValue timeValue21 = deleteRequest17.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest17.version((long) ' ');
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel24 = deleteRequest17.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest13.consistencyLevel(writeConsistencyLevel24);
        boolean boolean26 = deleteRequest25.refresh();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNull(shardId16);
        org.junit.Assert.assertNotNull(timeValue21);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel24 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel24.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.refresh(false);
        org.elasticsearch.index.VersionType versionType7 = deleteRequest4.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.versionType(versionType7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.refresh(true);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.type("hi!");
        long long13 = deleteRequest12.version();
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(versionType7);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-3L) + "'", long13 == (-3L));
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel3 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.consistencyLevel(writeConsistencyLevel3);
        deleteRequest4.seqNo((long) (byte) 0);
        org.elasticsearch.index.shard.IndexShard indexShard7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult8 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest4, indexShard7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.elasticsearch.action.support.replication.ReplicationTask replicationTask0 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.setPhase(replicationTask0, "delete {[delete {[null][null][null]}][][]}");
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException5 = deleteRequest4.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest4.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue8 = deleteRequest7.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest0.timeout(timeValue8);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.refresh(false);
        org.elasticsearch.tasks.TaskId taskId13 = deleteRequest12.getParentTask();
        deleteRequest0.setParentTask(taskId13);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel15 = deleteRequest0.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions17 = deleteRequest16.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest16.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest20.refresh(false);
        org.elasticsearch.index.VersionType versionType23 = deleteRequest20.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest19.versionType(versionType23);
        java.lang.String str25 = deleteRequest24.type();
        org.elasticsearch.index.VersionType versionType26 = deleteRequest24.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest0.versionType(versionType26);
        java.lang.String str28 = deleteRequest27.routing();
        org.elasticsearch.common.transport.TransportAddress transportAddress29 = deleteRequest27.remoteAddress();
        java.lang.Class<?> wildcardClass30 = deleteRequest27.getClass();
        org.junit.Assert.assertNotNull(actionRequestValidationException5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(taskId13);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel15 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel15.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(indicesOptions17);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertNotNull(versionType23);
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(versionType26);
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(transportAddress29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue9 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.timeout(timeValue9);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest4.timeout(timeValue9);
        java.lang.String str12 = deleteRequest11.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest11.parent("");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[null][null][]}", deleteRequest11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(timeValue9);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(deleteRequest14);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "delete {[][null][null]}", "");
        org.elasticsearch.common.io.stream.StreamOutput streamOutput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.writeTo(streamOutput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        long long3 = deleteRequest0.seqNo();
        java.lang.String str4 = deleteRequest0.toString();
        java.lang.String str5 = deleteRequest0.routing();
        org.elasticsearch.index.VersionType versionType6 = deleteRequest0.versionType();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.writeTo(streamOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[null][null][null]}" + "'", str4, "delete {[null][null][null]}");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(versionType6);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest1.id("delete {[null][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest1.index("hi!");
        java.lang.Class<?> wildcardClass8 = deleteRequest1.getClass();
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException3 = deleteRequest2.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue6 = deleteRequest5.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest5.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest9.setParentTask("hi!", 10L);
        java.lang.String[] strArray13 = deleteRequest9.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest14.setParentTask("hi!", 10L);
        java.lang.String[] strArray18 = deleteRequest14.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel19 = deleteRequest14.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest9.consistencyLevel(writeConsistencyLevel19);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest8.consistencyLevel(writeConsistencyLevel19);
        boolean boolean22 = deleteRequest21.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException24 = deleteRequest23.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest23.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue27 = deleteRequest26.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest26.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest30.setParentTask("hi!", 10L);
        java.lang.String[] strArray34 = deleteRequest30.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest35.setParentTask("hi!", 10L);
        java.lang.String[] strArray39 = deleteRequest35.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel40 = deleteRequest35.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest41 = deleteRequest30.consistencyLevel(writeConsistencyLevel40);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest42 = deleteRequest29.consistencyLevel(writeConsistencyLevel40);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest43 = deleteRequest21.consistencyLevel(writeConsistencyLevel40);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[delete {[][null][null]}][hi!][null]}", deleteRequest21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(actionRequestValidationException3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel19 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel19.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(actionRequestValidationException24);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNotNull(timeValue27);
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel40 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel40.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest41);
        org.junit.Assert.assertNotNull(deleteRequest42);
        org.junit.Assert.assertNotNull(deleteRequest43);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.refresh(true);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException7 = deleteRequest6.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue10 = deleteRequest9.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest5.timeout(timeValue10);
        org.elasticsearch.action.support.IndicesOptions indicesOptions12 = deleteRequest5.indicesOptions();
        org.elasticsearch.common.unit.TimeValue timeValue13 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest5.timeout(timeValue13);
        org.elasticsearch.index.shard.IndexShard indexShard15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult16 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest14, indexShard15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(actionRequestValidationException7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(timeValue10);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(indicesOptions12);
        org.junit.Assert.assertNotNull(deleteRequest14);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = null;
        deleteRequest0.remoteAddress(transportAddress4);
        org.elasticsearch.tasks.TaskId taskId6 = deleteRequest0.getParentTask();
        deleteRequest0.primaryTerm((long) (byte) 1);
        org.elasticsearch.common.io.stream.StreamInput streamInput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.readFrom(streamInput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(taskId6);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId3 = deleteRequest2.shardId();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.consistencyLevel(writeConsistencyLevel4);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.timeout("delete {[null][null][]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[null][null][]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(shardId3);
        org.junit.Assert.assertNotNull(deleteRequest5);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "", "delete {[][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("delete {[null][null][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.type("");
        org.elasticsearch.tasks.TaskId taskId8 = null;
        deleteRequest5.setParentTask(taskId8);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "", "delete {[][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.id("delete {[null][null][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.type("");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[delete {[][][hi!]}][][delete {[][null][null]}]}", deleteRequest9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue7 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.timeout(timeValue7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest2.timeout(timeValue7);
        java.lang.String str10 = deleteRequest9.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest9.parent("");
        org.elasticsearch.index.shard.IndexShard indexShard13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete14 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest12, indexShard13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(timeValue7);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(deleteRequest12);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        java.lang.String str2 = deleteRequest0.id();
        long long3 = deleteRequest0.primaryTerm();
        java.lang.String str4 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.routing("delete {[][][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest9.setParentTask("hi!", 10L);
        java.lang.String[] strArray13 = deleteRequest9.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel14 = deleteRequest9.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest9.type("hi!");
        org.elasticsearch.common.transport.TransportAddress transportAddress17 = null;
        deleteRequest9.remoteAddress(transportAddress17);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        boolean boolean23 = deleteRequest22.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest22.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest26.setParentTask("hi!", 10L);
        java.lang.String[] strArray30 = deleteRequest26.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel31 = deleteRequest26.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest25.consistencyLevel(writeConsistencyLevel31);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest9.consistencyLevel(writeConsistencyLevel31);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest37 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue38 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest39 = deleteRequest37.timeout(timeValue38);
        org.elasticsearch.common.transport.TransportAddress transportAddress40 = null;
        deleteRequest37.remoteAddress(transportAddress40);
        java.lang.String str42 = deleteRequest37.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest44 = deleteRequest37.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest46 = deleteRequest37.version((long) (byte) 1);
        org.elasticsearch.common.unit.TimeValue timeValue47 = deleteRequest37.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest48 = deleteRequest9.timeout(timeValue47);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest49 = deleteRequest6.timeout(timeValue47);
        org.elasticsearch.index.shard.ShardId shardId50 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest51 = deleteRequest49.setShardId(shardId50);
        org.elasticsearch.common.io.stream.StreamInput streamInput52 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest51.readFrom(streamInput52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel14 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel14.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel31 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel31.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertNotNull(timeValue38);
        org.junit.Assert.assertNotNull(deleteRequest39);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(deleteRequest44);
        org.junit.Assert.assertNotNull(deleteRequest46);
        org.junit.Assert.assertNotNull(timeValue47);
        org.junit.Assert.assertNotNull(deleteRequest48);
        org.junit.Assert.assertNotNull(deleteRequest49);
        org.junit.Assert.assertNotNull(deleteRequest51);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        boolean boolean4 = deleteRequest3.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest7.setParentTask("hi!", 10L);
        java.lang.String[] strArray11 = deleteRequest7.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel12 = deleteRequest7.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest6.consistencyLevel(writeConsistencyLevel12);
        org.elasticsearch.common.unit.TimeValue timeValue14 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.timeout(timeValue14);
        org.elasticsearch.index.shard.IndexShard indexShard16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult17 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest15, indexShard16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel12 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel12.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(timeValue14);
        org.junit.Assert.assertNotNull(deleteRequest15);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        deleteRequest0.primaryTerm(10L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.refresh(true);
        org.elasticsearch.tasks.TaskId taskId13 = deleteRequest10.getParentTask();
        org.elasticsearch.tasks.Task task14 = deleteRequest0.createTask((long) (byte) 1, "", "delete {[null][null][null]}", taskId13);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest15.setParentTask("hi!", 10L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException20 = deleteRequest19.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest19.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue23 = deleteRequest22.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest15.timeout(timeValue23);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest25.setParentTask("hi!", 10L);
        java.lang.String[] strArray29 = deleteRequest25.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel30 = deleteRequest25.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest25.type("hi!");
        org.elasticsearch.index.VersionType versionType33 = deleteRequest32.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = deleteRequest15.versionType(versionType33);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = deleteRequest0.versionType(versionType33);
        java.lang.String str36 = deleteRequest0.toString();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput37 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.writeTo(streamOutput37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(taskId13);
        org.junit.Assert.assertNotNull(task14);
        org.junit.Assert.assertNotNull(actionRequestValidationException20);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertNotNull(timeValue23);
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel30 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel30.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertNotNull(versionType33);
        org.junit.Assert.assertNotNull(deleteRequest34);
        org.junit.Assert.assertNotNull(deleteRequest35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "delete {[null][null][null]}" + "'", str36, "delete {[null][null][null]}");
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = deleteRequest0.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest0.type("delete {[delete {[][null][null]}][hi!][null]}");
        org.elasticsearch.index.shard.IndexShard indexShard7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult8 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest0, indexShard7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNull(transportAddress4);
        org.junit.Assert.assertNotNull(deleteRequest6);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId5 = deleteRequest4.shardId();
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest4.remoteAddress(transportAddress6);
        java.lang.String str8 = deleteRequest4.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest4.parent("");
        java.lang.String str11 = deleteRequest4.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "hi!", deleteRequest4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNull(shardId5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.routing("");
        org.elasticsearch.common.io.stream.StreamOutput streamOutput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest4.writeTo(streamOutput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.type("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue5 = deleteRequest2.timeout();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest2.timeout("delete {[null][null][]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[null][null][]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(timeValue5);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue7 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.timeout(timeValue7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest2.timeout(timeValue7);
        java.lang.String str10 = deleteRequest9.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest9.parent("");
        org.elasticsearch.common.io.stream.StreamOutput streamOutput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest9.writeTo(streamOutput13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(timeValue7);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(deleteRequest12);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest3.remoteAddress(transportAddress6);
        java.lang.String str8 = deleteRequest3.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest3.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest16.setParentTask("hi!", 10L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException21 = deleteRequest20.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest20.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue24 = deleteRequest23.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest16.timeout(timeValue24);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest26.refresh(false);
        org.elasticsearch.tasks.TaskId taskId29 = deleteRequest28.getParentTask();
        deleteRequest16.setParentTask(taskId29);
        org.elasticsearch.tasks.Task task31 = deleteRequest12.createTask(0L, "delete {[][null][null]}", "", taskId29);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest12.parent("delete {[delete {[null][null][null]}][][]}");
        java.lang.String str34 = deleteRequest33.toString();
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(actionRequestValidationException21);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(timeValue24);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertNotNull(taskId29);
        org.junit.Assert.assertNotNull(task31);
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "delete {[][][]}" + "'", str34, "delete {[][][]}");
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.type("hi!");
        org.elasticsearch.tasks.TaskId taskId7 = deleteRequest6.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.parent("delete {[null][null][null]}");
        org.elasticsearch.index.shard.ShardId shardId10 = deleteRequest9.shardId();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[null][hi!][null]}", deleteRequest9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(taskId7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNull(shardId10);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][hi!][null]}");
        java.lang.String str2 = deleteRequest1.parent();
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}", "delete {[null][null][null]}", "");
        org.elasticsearch.action.support.IndicesOptions indicesOptions6 = deleteRequest5.indicesOptions();
        org.elasticsearch.index.shard.ShardId shardId7 = deleteRequest5.shardId();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[delete {[][][hi!]}][][delete {[][null][null]}]}", deleteRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions6);
        org.junit.Assert.assertNull(shardId7);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        long long3 = deleteRequest0.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.parent("");
        org.elasticsearch.common.io.stream.StreamInput streamInput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest5.readFrom(streamInput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest5);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        deleteRequest0.primaryTerm(10L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.refresh(true);
        org.elasticsearch.tasks.TaskId taskId13 = deleteRequest10.getParentTask();
        org.elasticsearch.tasks.Task task14 = deleteRequest0.createTask((long) (byte) 1, "", "delete {[null][null][null]}", taskId13);
        java.lang.String str15 = deleteRequest0.routing();
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(taskId13);
        org.junit.Assert.assertNotNull(task14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][][hi!]}", "", "delete {[][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.routing("delete {[][null][null]}");
        org.elasticsearch.index.VersionType versionType6 = deleteRequest5.versionType();
        org.elasticsearch.index.shard.IndexShard indexShard7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult8 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest5, indexShard7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(versionType6);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.tasks.TaskId taskId3 = deleteRequest2.getParentTask();
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = deleteRequest2.remoteAddress();
        java.lang.String str5 = deleteRequest2.type();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest2.writeTo(streamOutput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(taskId3);
        org.junit.Assert.assertNull(transportAddress4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        java.lang.String[] strArray4 = deleteRequest0.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest5.setParentTask("hi!", 10L);
        java.lang.String[] strArray9 = deleteRequest5.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = deleteRequest5.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest0.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel12 = deleteRequest0.consistencyLevel();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException13 = deleteRequest0.validate();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest0.timeout("delete {[null][null][hi!]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[null][null][hi!]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel12 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel12.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(actionRequestValidationException13);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        java.lang.String[] strArray4 = deleteRequest0.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest5.setParentTask("hi!", 10L);
        java.lang.String[] strArray9 = deleteRequest5.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = deleteRequest5.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest0.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.index("hi!");
        deleteRequest15.seqNo((long) (short) 1);
        java.lang.String str18 = deleteRequest15.parent();
        org.elasticsearch.common.io.stream.StreamInput streamInput19 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest15.readFrom(streamInput19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.routing("hi!");
        deleteRequest1.setParentTask("hi!", (long) (short) -1);
        deleteRequest1.setParentTask("hi!", (long) 'a');
        deleteRequest1.setParentTask("delete {[][][hi!]}", (long) (byte) 0);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException17 = deleteRequest16.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException19 = deleteRequest18.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest18.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue22 = deleteRequest21.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest16.timeout(timeValue22);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest16.index("hi!");
        org.elasticsearch.common.transport.TransportAddress transportAddress26 = null;
        deleteRequest16.remoteAddress(transportAddress26);
        org.elasticsearch.index.shard.ShardId shardId28 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest16.setShardId(shardId28);
        org.elasticsearch.tasks.TaskId taskId30 = deleteRequest16.getParentTask();
        org.elasticsearch.tasks.Task task31 = deleteRequest1.createTask((long) '#', "", "", taskId30);
        java.lang.Class<?> wildcardClass32 = task31.getClass();
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(actionRequestValidationException17);
        org.junit.Assert.assertNotNull(actionRequestValidationException19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(timeValue22);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertNotNull(taskId30);
        org.junit.Assert.assertNotNull(task31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.VersionType versionType3 = deleteRequest0.versionType();
        java.lang.String[] strArray4 = deleteRequest0.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest0.version((long) (short) 0);
        java.lang.String str7 = deleteRequest0.id();
        deleteRequest0.primaryTerm((long) (byte) -1);
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.routing("hi!");
        deleteRequest1.setParentTask("hi!", (long) (short) -1);
        deleteRequest1.setParentTask("hi!", (long) 'a');
        deleteRequest1.setParentTask("delete {[][][hi!]}", (long) (byte) 0);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException17 = deleteRequest16.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException19 = deleteRequest18.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest18.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue22 = deleteRequest21.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest16.timeout(timeValue22);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest16.index("hi!");
        org.elasticsearch.common.transport.TransportAddress transportAddress26 = null;
        deleteRequest16.remoteAddress(transportAddress26);
        org.elasticsearch.index.shard.ShardId shardId28 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest16.setShardId(shardId28);
        org.elasticsearch.tasks.TaskId taskId30 = deleteRequest16.getParentTask();
        org.elasticsearch.tasks.Task task31 = deleteRequest1.createTask((long) '#', "", "", taskId30);
        java.lang.Class<?> wildcardClass32 = deleteRequest1.getClass();
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(actionRequestValidationException17);
        org.junit.Assert.assertNotNull(actionRequestValidationException19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(timeValue22);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertNotNull(taskId30);
        org.junit.Assert.assertNotNull(task31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        java.lang.String[] strArray4 = deleteRequest0.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = deleteRequest0.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.type("hi!");
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = null;
        deleteRequest0.remoteAddress(transportAddress8);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        boolean boolean14 = deleteRequest13.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest13.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest17.setParentTask("hi!", 10L);
        java.lang.String[] strArray21 = deleteRequest17.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel22 = deleteRequest17.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest16.consistencyLevel(writeConsistencyLevel22);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest0.consistencyLevel(writeConsistencyLevel22);
        boolean boolean25 = deleteRequest24.refresh();
        org.elasticsearch.index.shard.IndexShard indexShard26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult27 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest24, indexShard26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel5 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel5.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel22 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel22.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        java.lang.String str4 = deleteRequest3.toString();
        java.lang.String str5 = deleteRequest3.type();
        java.lang.Class<?> wildcardClass6 = deleteRequest3.getClass();
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[null][null][null]}" + "'", str4, "delete {[null][null][null]}");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = deleteRequest3.remoteAddress();
        boolean boolean7 = deleteRequest3.getShouldPersistResult();
        java.lang.String str8 = deleteRequest3.id();
        org.elasticsearch.index.shard.ShardId shardId9 = deleteRequest3.shardId();
        org.elasticsearch.common.unit.TimeValue timeValue10 = deleteRequest3.timeout();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = deleteRequest3.consistencyLevel();
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(transportAddress6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(shardId9);
        org.junit.Assert.assertNotNull(timeValue10);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel11 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel11.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest3.remoteAddress(transportAddress6);
        java.lang.String str8 = deleteRequest3.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest3.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest12.type("");
        java.lang.Class<?> wildcardClass15 = deleteRequest12.getClass();
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        java.lang.String str4 = deleteRequest3.toString();
        long long5 = deleteRequest3.primaryTerm();
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[null][null][null]}" + "'", str4, "delete {[null][null][null]}");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][hi!][]}");
        org.elasticsearch.common.io.stream.StreamInput streamInput2 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest1.readFrom(streamInput2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId3 = deleteRequest2.shardId();
        deleteRequest2.setParentTask("delete {[][null][null]}", 0L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest2.routing("delete {[delete {[][null][null]}][hi!][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.index("");
        org.elasticsearch.index.shard.IndexShard indexShard11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete12 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest8, indexShard11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(shardId3);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException1 = deleteRequest0.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId9 = deleteRequest8.shardId();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest8.consistencyLevel(writeConsistencyLevel10);
        java.lang.String str12 = deleteRequest11.routing();
        org.elasticsearch.index.VersionType versionType13 = deleteRequest11.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest3.versionType(versionType13);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel15 = deleteRequest14.consistencyLevel();
        java.lang.String str16 = deleteRequest14.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest14.routing("delete {[][null][null]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress19 = deleteRequest14.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        boolean boolean24 = deleteRequest23.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest23.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue27 = deleteRequest26.timeout();
        long long28 = deleteRequest26.primaryTerm();
        deleteRequest26.setParentTask("delete {[null][null][]}", (-3L));
        org.elasticsearch.index.VersionType versionType32 = deleteRequest26.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest14.versionType(versionType32);
        org.elasticsearch.common.io.stream.StreamInput streamInput34 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest33.readFrom(streamInput34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(actionRequestValidationException1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNull(shardId9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(versionType13);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel15 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel15.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNull(transportAddress19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNotNull(timeValue27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(versionType32);
        org.junit.Assert.assertNotNull(deleteRequest33);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        java.lang.String str4 = deleteRequest0.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.refresh(false);
        org.elasticsearch.tasks.TaskId taskId11 = deleteRequest10.getParentTask();
        org.elasticsearch.tasks.Task task12 = deleteRequest0.createTask((long) (-1), "", "hi!", taskId11);
        org.elasticsearch.index.shard.ShardId shardId13 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest0.setShardId(shardId13);
        org.elasticsearch.common.transport.TransportAddress transportAddress15 = deleteRequest14.remoteAddress();
        deleteRequest14.setParentTask("delete {[null][null][]}", (long) 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[null][null][null]}" + "'", str4, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(taskId11);
        org.junit.Assert.assertNotNull(task12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNull(transportAddress15);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        java.lang.String[] strArray4 = deleteRequest0.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = deleteRequest0.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.routing("hi!");
        org.elasticsearch.common.io.stream.StreamOutput streamOutput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.writeTo(streamOutput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel5 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel5.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest7);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        java.lang.String[] strArray4 = deleteRequest0.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = deleteRequest0.consistencyLevel();
        org.elasticsearch.index.shard.ShardId shardId6 = deleteRequest0.shardId();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest7.setParentTask("hi!", 10L);
        java.lang.String str11 = deleteRequest7.toString();
        long long12 = deleteRequest7.version();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue17 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest16.timeout(timeValue17);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest7.timeout(timeValue17);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest0.timeout(timeValue17);
        org.elasticsearch.index.shard.ShardId shardId21 = deleteRequest20.shardId();
        deleteRequest20.seqNo(1L);
        long long24 = deleteRequest20.primaryTerm();
        org.elasticsearch.index.shard.IndexShard indexShard25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete26 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest20, indexShard25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel5 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel5.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNull(shardId6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[null][null][null]}" + "'", str11, "delete {[null][null][null]}");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-3L) + "'", long12 == (-3L));
        org.junit.Assert.assertNotNull(timeValue17);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNull(shardId21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException1 = deleteRequest0.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId9 = deleteRequest8.shardId();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest8.consistencyLevel(writeConsistencyLevel10);
        java.lang.String str12 = deleteRequest11.routing();
        org.elasticsearch.index.VersionType versionType13 = deleteRequest11.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest3.versionType(versionType13);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel15 = deleteRequest14.consistencyLevel();
        java.lang.String str16 = deleteRequest14.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest14.routing("delete {[][null][null]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress19 = deleteRequest14.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        boolean boolean24 = deleteRequest23.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest23.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue27 = deleteRequest26.timeout();
        long long28 = deleteRequest26.primaryTerm();
        deleteRequest26.setParentTask("delete {[null][null][]}", (-3L));
        org.elasticsearch.index.VersionType versionType32 = deleteRequest26.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest14.versionType(versionType32);
        org.elasticsearch.action.support.IndicesOptions indicesOptions34 = deleteRequest14.indicesOptions();
        org.junit.Assert.assertNotNull(actionRequestValidationException1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNull(shardId9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(versionType13);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel15 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel15.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNull(transportAddress19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNotNull(timeValue27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(versionType32);
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertNotNull(indicesOptions34);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][][]}");
        org.elasticsearch.index.shard.IndexShard indexShard2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult3 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest1, indexShard2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        java.lang.String str2 = deleteRequest0.id();
        long long3 = deleteRequest0.primaryTerm();
        java.lang.String str4 = deleteRequest0.routing();
        java.lang.String str5 = deleteRequest0.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException10 = deleteRequest9.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException12 = deleteRequest11.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest11.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue15 = deleteRequest14.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest9.timeout(timeValue15);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.tasks.TaskId taskId27 = null;
        org.elasticsearch.tasks.Task task28 = deleteRequest23.createTask((long) ' ', "delete {[null][null][null]}", "delete {[null][null][null]}", taskId27);
        org.elasticsearch.tasks.TaskId taskId29 = deleteRequest23.getParentTask();
        org.elasticsearch.tasks.Task task30 = deleteRequest16.createTask((long) 1, "delete {[][null][null]}", "delete {[delete {[][null][null]}][hi!][null]}", taskId29);
        org.elasticsearch.tasks.Task task31 = deleteRequest0.createTask((long) ' ', "delete {[null][null][null]}", "", taskId29);
        java.lang.Class<?> wildcardClass32 = taskId29.getClass();
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "delete {[null][null][null]}" + "'", str5, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(actionRequestValidationException10);
        org.junit.Assert.assertNotNull(actionRequestValidationException12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(timeValue15);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(task28);
        org.junit.Assert.assertNotNull(taskId29);
        org.junit.Assert.assertNotNull(task30);
        org.junit.Assert.assertNotNull(task31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.VersionType versionType3 = deleteRequest0.versionType();
        java.lang.String str4 = deleteRequest0.type();
        java.lang.String str5 = deleteRequest0.getDescription();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.refresh(false);
        long long10 = deleteRequest7.primaryTerm();
        org.elasticsearch.index.shard.ShardId shardId11 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest7.setShardId(shardId11);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions17 = deleteRequest16.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest16.parent("");
        org.elasticsearch.common.transport.TransportAddress transportAddress20 = null;
        deleteRequest16.remoteAddress(transportAddress20);
        org.elasticsearch.tasks.TaskId taskId22 = deleteRequest16.getParentTask();
        org.elasticsearch.tasks.Task task23 = deleteRequest12.createTask(0L, "", "delete {[null][null][]}", taskId22);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest12.version((-1L));
        java.lang.String str26 = deleteRequest25.id();
        boolean boolean27 = deleteRequest25.getShouldPersistResult();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "delete {[null][null][null]}" + "'", str5, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(indicesOptions17);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(taskId22);
        org.junit.Assert.assertNotNull(task23);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        java.lang.String str2 = deleteRequest0.id();
        org.elasticsearch.index.shard.ShardId shardId3 = deleteRequest0.shardId();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.routing("delete {[][null][null]}");
        org.elasticsearch.index.shard.IndexShard indexShard6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult7 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest0, indexShard6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(shardId3);
        org.junit.Assert.assertNotNull(deleteRequest5);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        java.lang.String[] strArray4 = deleteRequest0.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = deleteRequest0.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.routing("hi!");
        org.elasticsearch.index.shard.ShardId shardId8 = deleteRequest0.shardId();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel9 = deleteRequest0.consistencyLevel();
        org.elasticsearch.common.io.stream.StreamInput streamInput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.readFrom(streamInput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel5 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel5.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNull(shardId8);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel9 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel9.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.refresh(true);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.index("delete {[null][null][null]}");
        java.lang.String str10 = deleteRequest7.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest7.routing("delete {[delete {[][null][null]}][hi!][null]}");
        org.elasticsearch.index.shard.ShardId shardId13 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest12.setShardId(shardId13);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[delete {[][][]}][null][null]}", deleteRequest12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest14);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException1 = deleteRequest0.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException3 = deleteRequest2.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue6 = deleteRequest5.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.timeout(timeValue6);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest0.index("hi!");
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = null;
        deleteRequest0.remoteAddress(transportAddress10);
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest0.setShardId(shardId12);
        org.elasticsearch.tasks.TaskId taskId14 = deleteRequest0.getParentTask();
        org.elasticsearch.index.shard.IndexShard indexShard15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult16 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest0, indexShard15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(actionRequestValidationException1);
        org.junit.Assert.assertNotNull(actionRequestValidationException3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(taskId14);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException1 = deleteRequest0.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest3.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest7.setParentTask("hi!", 10L);
        java.lang.String[] strArray11 = deleteRequest7.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest12.setParentTask("hi!", 10L);
        java.lang.String[] strArray16 = deleteRequest12.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel17 = deleteRequest12.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest7.consistencyLevel(writeConsistencyLevel17);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest6.consistencyLevel(writeConsistencyLevel17);
        org.elasticsearch.index.shard.ShardId shardId20 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest6.setShardId(shardId20);
        boolean boolean22 = deleteRequest21.getShouldPersistResult();
        org.elasticsearch.common.unit.TimeValue timeValue23 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest21.timeout(timeValue23);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest24.id("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue27 = deleteRequest24.timeout();
        java.lang.Class<?> wildcardClass28 = timeValue27.getClass();
        org.junit.Assert.assertNotNull(actionRequestValidationException1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel17 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel17.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(timeValue23);
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNotNull(timeValue27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId3 = deleteRequest2.shardId();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.consistencyLevel(writeConsistencyLevel4);
        org.elasticsearch.action.support.IndicesOptions indicesOptions6 = deleteRequest2.indicesOptions();
        org.elasticsearch.index.shard.IndexShard indexShard7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult8 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest2, indexShard7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(shardId3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(indicesOptions6);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException9 = deleteRequest8.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure11 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "", (java.lang.Throwable) actionRequestValidationException9, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure13 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[][null][null]}", (java.lang.Throwable) actionRequestValidationException9, "");
        java.lang.Throwable throwable14 = shardFailure13.cause;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure16 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[null][null][hi!]}", throwable14, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure18 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "", throwable14, "");
        org.junit.Assert.assertNotNull(actionRequestValidationException9);
        org.junit.Assert.assertNotNull(throwable14);
        org.junit.Assert.assertEquals(throwable14.getLocalizedMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable14.getMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable14.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest3.remoteAddress(transportAddress6);
        java.lang.String str8 = deleteRequest3.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.parent("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId14 = deleteRequest13.shardId();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel15 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest13.consistencyLevel(writeConsistencyLevel15);
        long long17 = deleteRequest16.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest18.setParentTask("hi!", 10L);
        java.lang.String[] strArray22 = deleteRequest18.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest23.setParentTask("hi!", 10L);
        java.lang.String[] strArray27 = deleteRequest23.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel28 = deleteRequest23.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest18.consistencyLevel(writeConsistencyLevel28);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest16.consistencyLevel(writeConsistencyLevel28);
        org.elasticsearch.index.shard.ShardId shardId31 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest30.setShardId(shardId31);
        org.elasticsearch.tasks.TaskId taskId33 = deleteRequest30.getParentTask();
        deleteRequest10.setParentTask(taskId33);
        java.lang.Class<?> wildcardClass35 = deleteRequest10.getClass();
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNull(shardId14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel28 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel28.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertNotNull(taskId33);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        long long3 = deleteRequest0.seqNo();
        java.lang.String str4 = deleteRequest0.toString();
        org.elasticsearch.common.transport.TransportAddress transportAddress5 = deleteRequest0.remoteAddress();
        java.lang.String str6 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest7.setParentTask("hi!", 10L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException12 = deleteRequest11.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest11.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue15 = deleteRequest14.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest7.timeout(timeValue15);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest17.refresh(false);
        org.elasticsearch.tasks.TaskId taskId20 = deleteRequest19.getParentTask();
        deleteRequest7.setParentTask(taskId20);
        deleteRequest0.setParentTask(taskId20);
        long long23 = deleteRequest0.seqNo();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[null][null][null]}" + "'", str4, "delete {[null][null][null]}");
        org.junit.Assert.assertNull(transportAddress5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(actionRequestValidationException12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(timeValue15);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(taskId20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue7 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.timeout(timeValue7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest2.timeout(timeValue7);
        org.elasticsearch.index.shard.ShardId shardId10 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.setShardId(shardId10);
        org.elasticsearch.tasks.TaskId taskId12 = deleteRequest9.getParentTask();
        java.lang.Class<?> wildcardClass13 = taskId12.getClass();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(timeValue7);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(taskId12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        java.lang.String[] strArray4 = deleteRequest0.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = deleteRequest0.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.type("hi!");
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = null;
        deleteRequest0.remoteAddress(transportAddress8);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        boolean boolean14 = deleteRequest13.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest13.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest17.setParentTask("hi!", 10L);
        java.lang.String[] strArray21 = deleteRequest17.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel22 = deleteRequest17.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest16.consistencyLevel(writeConsistencyLevel22);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest0.consistencyLevel(writeConsistencyLevel22);
        org.elasticsearch.index.VersionType versionType25 = deleteRequest24.versionType();
        java.lang.String str26 = deleteRequest24.toString();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel5 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel5.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel22 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel22.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNotNull(versionType25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "delete {[null][hi!][null]}" + "'", str26, "delete {[null][hi!][null]}");
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest2.setParentTask("hi!", 10L);
        java.lang.String[] strArray6 = deleteRequest2.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = deleteRequest2.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest2.routing("hi!");
        org.elasticsearch.index.shard.ShardId shardId10 = deleteRequest2.shardId();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException11 = deleteRequest2.validate();
        org.elasticsearch.action.support.IndicesOptions indicesOptions12 = deleteRequest2.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException13 = deleteRequest2.validate();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[null][][null]}", deleteRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel7 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel7.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNull(shardId10);
        org.junit.Assert.assertNotNull(actionRequestValidationException11);
        org.junit.Assert.assertNotNull(indicesOptions12);
        org.junit.Assert.assertNotNull(actionRequestValidationException13);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.refresh(false);
        org.elasticsearch.index.VersionType versionType7 = deleteRequest4.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.versionType(versionType7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.refresh(true);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.type("hi!");
        org.elasticsearch.common.transport.TransportAddress transportAddress13 = null;
        deleteRequest10.remoteAddress(transportAddress13);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest15.setParentTask("hi!", 10L);
        java.lang.String[] strArray19 = deleteRequest15.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel20 = deleteRequest15.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest10.consistencyLevel(writeConsistencyLevel20);
        java.lang.String str22 = deleteRequest21.index();
        boolean boolean23 = deleteRequest21.refresh();
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(versionType7);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel20 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel20.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        java.lang.String[] strArray4 = deleteRequest0.indices();
        org.elasticsearch.common.transport.TransportAddress transportAddress5 = null;
        deleteRequest0.remoteAddress(transportAddress5);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId10 = deleteRequest9.shardId();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest9.consistencyLevel(writeConsistencyLevel11);
        java.lang.String str13 = deleteRequest12.routing();
        org.elasticsearch.index.VersionType versionType14 = deleteRequest12.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest0.versionType(versionType14);
        java.lang.Class<?> wildcardClass16 = deleteRequest0.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNull(shardId10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(versionType14);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest1.id("delete {[null][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.id("");
        org.elasticsearch.index.shard.IndexShard indexShard8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult9 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest5, indexShard8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId3 = deleteRequest2.shardId();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.timeout("delete {[][null][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[][null][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(shardId3);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException3 = deleteRequest2.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException5 = deleteRequest4.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest4.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue8 = deleteRequest7.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest2.timeout(timeValue8);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest2.index("hi!");
        org.elasticsearch.common.transport.TransportAddress transportAddress12 = null;
        deleteRequest2.remoteAddress(transportAddress12);
        org.elasticsearch.index.shard.ShardId shardId14 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest2.setShardId(shardId14);
        org.elasticsearch.tasks.TaskId taskId16 = deleteRequest2.getParentTask();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "", deleteRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(actionRequestValidationException3);
        org.junit.Assert.assertNotNull(actionRequestValidationException5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(taskId16);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        java.lang.String str2 = deleteRequest0.id();
        long long3 = deleteRequest0.primaryTerm();
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.setShardId(shardId4);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.tasks.TaskId taskId13 = null;
        org.elasticsearch.tasks.Task task14 = deleteRequest9.createTask((long) ' ', "delete {[null][null][null]}", "delete {[null][null][null]}", taskId13);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest9.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest18.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest20.refresh(true);
        org.elasticsearch.tasks.TaskId taskId23 = deleteRequest20.getParentTask();
        deleteRequest9.setParentTask(taskId23);
        deleteRequest5.setParentTask(taskId23);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel26 = deleteRequest5.consistencyLevel();
        org.elasticsearch.index.shard.IndexShard indexShard27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete28 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest5, indexShard27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(task14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertNotNull(taskId23);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel26 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel26.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.VersionType versionType3 = deleteRequest0.versionType();
        java.lang.String[] strArray4 = deleteRequest0.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest0.version((long) (short) 0);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException7 = deleteRequest6.validate();
        org.elasticsearch.common.io.stream.StreamInput streamInput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest6.readFrom(streamInput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(actionRequestValidationException7);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        boolean boolean3 = deleteRequest0.getShouldPersistResult();
        org.elasticsearch.tasks.TaskId taskId4 = null;
        deleteRequest0.setParentTask(taskId4);
        deleteRequest0.seqNo((long) 100);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest0.index("delete {[null][null][]}");
        boolean boolean10 = deleteRequest0.refresh();
        java.lang.String str11 = deleteRequest0.index();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[null][null][]}" + "'", str11, "delete {[null][null][]}");
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.elasticsearch.action.support.replication.ReplicationTask replicationTask0 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.setPhase(replicationTask0, "delete {[null][null][hi!]}");
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "", "delete {[null][null][null]}");
        org.elasticsearch.common.io.stream.StreamOutput streamOutput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.writeTo(streamOutput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.parent("");
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest0.remoteAddress(transportAddress6);
        deleteRequest0.primaryTerm(0L);
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest2.setParentTask("hi!", 10L);
        java.lang.String[] strArray6 = deleteRequest2.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest7.setParentTask("hi!", 10L);
        java.lang.String[] strArray11 = deleteRequest7.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel12 = deleteRequest7.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest2.consistencyLevel(writeConsistencyLevel12);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel14 = deleteRequest2.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions16 = deleteRequest15.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest15.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest19.refresh(false);
        org.elasticsearch.index.VersionType versionType22 = deleteRequest19.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest18.versionType(versionType22);
        deleteRequest23.seqNo((long) (byte) -1);
        org.elasticsearch.tasks.TaskId taskId26 = deleteRequest23.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest31.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = deleteRequest33.refresh(true);
        org.elasticsearch.tasks.TaskId taskId36 = deleteRequest33.getParentTask();
        org.elasticsearch.tasks.Task task37 = deleteRequest23.createTask((long) (short) 10, "", "hi!", taskId36);
        deleteRequest2.setParentTask(taskId36);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[null][null][delete {[null][null][null]}]}", deleteRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel12 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel12.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel14 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel14.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(indicesOptions16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(versionType22);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(taskId26);
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertNotNull(deleteRequest35);
        org.junit.Assert.assertNotNull(taskId36);
        org.junit.Assert.assertNotNull(task37);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest3.remoteAddress(transportAddress6);
        java.lang.String str8 = deleteRequest3.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest3.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest16.setParentTask("hi!", 10L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException21 = deleteRequest20.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest20.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue24 = deleteRequest23.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest16.timeout(timeValue24);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest26.refresh(false);
        org.elasticsearch.tasks.TaskId taskId29 = deleteRequest28.getParentTask();
        deleteRequest16.setParentTask(taskId29);
        org.elasticsearch.tasks.Task task31 = deleteRequest12.createTask(0L, "delete {[][null][null]}", "", taskId29);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest12.parent("delete {[delete {[null][null][null]}][][]}");
        java.lang.String str34 = deleteRequest33.parent();
        org.elasticsearch.common.io.stream.StreamInput streamInput35 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest33.readFrom(streamInput35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(actionRequestValidationException21);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(timeValue24);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertNotNull(taskId29);
        org.junit.Assert.assertNotNull(task31);
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "delete {[delete {[null][null][null]}][][]}" + "'", str34, "delete {[delete {[null][null][null]}][][]}");
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException5 = deleteRequest4.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest4.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue8 = deleteRequest7.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest0.timeout(timeValue8);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest10.setParentTask("hi!", 10L);
        java.lang.String[] strArray14 = deleteRequest10.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel15 = deleteRequest10.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest10.type("hi!");
        org.elasticsearch.index.VersionType versionType18 = deleteRequest17.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest0.versionType(versionType18);
        java.lang.String str20 = deleteRequest0.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest0.version((long) 'a');
        java.lang.String str23 = deleteRequest0.toString();
        org.junit.Assert.assertNotNull(actionRequestValidationException5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel15 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel15.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(versionType18);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "delete {[null][null][null]}" + "'", str23, "delete {[null][null][null]}");
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        java.lang.String[] strArray4 = deleteRequest0.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = deleteRequest0.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.type("hi!");
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = null;
        deleteRequest0.remoteAddress(transportAddress8);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        boolean boolean14 = deleteRequest13.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest13.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest17.setParentTask("hi!", 10L);
        java.lang.String[] strArray21 = deleteRequest17.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel22 = deleteRequest17.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest16.consistencyLevel(writeConsistencyLevel22);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest0.consistencyLevel(writeConsistencyLevel22);
        boolean boolean25 = deleteRequest24.refresh();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput26 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest24.writeTo(streamOutput26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel5 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel5.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel22 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel22.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.VersionType versionType3 = deleteRequest0.versionType();
        java.lang.String[] strArray4 = deleteRequest0.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest0.version((long) (short) 0);
        org.elasticsearch.common.io.stream.StreamInput streamInput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest6.readFrom(streamInput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(deleteRequest6);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "", "delete {[][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("delete {[null][null][]}");
        long long6 = deleteRequest5.seqNo();
        org.elasticsearch.index.shard.IndexShard indexShard7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult8 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest5, indexShard7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue7 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.timeout(timeValue7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest2.timeout(timeValue7);
        org.elasticsearch.index.shard.ShardId shardId10 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.setShardId(shardId10);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.id("delete {[null][null][hi!]}");
        org.elasticsearch.index.shard.IndexShard indexShard14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult15 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest13, indexShard14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(timeValue7);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.elasticsearch.action.support.replication.ReplicationTask replicationTask0 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.setPhase(replicationTask0, "delete {[null][hi!][]}");
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.VersionType versionType3 = deleteRequest0.versionType();
        java.lang.String str4 = deleteRequest0.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest0.index("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions8 = deleteRequest7.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest7.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.refresh(false);
        org.elasticsearch.index.VersionType versionType14 = deleteRequest11.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest10.versionType(versionType14);
        deleteRequest15.seqNo((long) (byte) -1);
        org.elasticsearch.tasks.TaskId taskId18 = deleteRequest15.getParentTask();
        deleteRequest6.setParentTask(taskId18);
        deleteRequest6.setParentTask("hi!", (long) (-1));
        org.elasticsearch.common.transport.TransportAddress transportAddress23 = null;
        deleteRequest6.remoteAddress(transportAddress23);
        org.elasticsearch.action.support.IndicesOptions indicesOptions25 = deleteRequest6.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest29.refresh(false);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel32 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest31.consistencyLevel(writeConsistencyLevel32);
        deleteRequest33.seqNo((long) (byte) 0);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest37 = deleteRequest33.routing("delete {[null][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest41 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions42 = deleteRequest41.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest44 = deleteRequest41.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest45 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest47 = deleteRequest45.refresh(false);
        org.elasticsearch.index.VersionType versionType48 = deleteRequest45.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest49 = deleteRequest44.versionType(versionType48);
        deleteRequest49.seqNo((long) (byte) -1);
        org.elasticsearch.tasks.TaskId taskId52 = deleteRequest49.getParentTask();
        org.elasticsearch.tasks.Task task53 = deleteRequest33.createTask((long) (byte) 10, "delete {[null][null][null]}", "delete {[][][hi!]}", taskId52);
        org.elasticsearch.tasks.Task task54 = deleteRequest6.createTask((long) (short) 0, "delete {[][][hi!]}", "", taskId52);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest56 = deleteRequest6.version(10L);
        java.lang.String str57 = deleteRequest56.index();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(indicesOptions8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(versionType14);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(taskId18);
        org.junit.Assert.assertNotNull(indicesOptions25);
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertNotNull(deleteRequest37);
        org.junit.Assert.assertNotNull(indicesOptions42);
        org.junit.Assert.assertNotNull(deleteRequest44);
        org.junit.Assert.assertNotNull(deleteRequest47);
        org.junit.Assert.assertNotNull(versionType48);
        org.junit.Assert.assertNotNull(deleteRequest49);
        org.junit.Assert.assertNotNull(taskId52);
        org.junit.Assert.assertNotNull(task53);
        org.junit.Assert.assertNotNull(task54);
        org.junit.Assert.assertNotNull(deleteRequest56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        java.lang.String str2 = deleteRequest0.id();
        long long3 = deleteRequest0.primaryTerm();
        java.lang.String str4 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.routing("delete {[][][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest9.setParentTask("hi!", 10L);
        java.lang.String[] strArray13 = deleteRequest9.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel14 = deleteRequest9.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest9.type("hi!");
        org.elasticsearch.common.transport.TransportAddress transportAddress17 = null;
        deleteRequest9.remoteAddress(transportAddress17);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        boolean boolean23 = deleteRequest22.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest22.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest26.setParentTask("hi!", 10L);
        java.lang.String[] strArray30 = deleteRequest26.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel31 = deleteRequest26.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest25.consistencyLevel(writeConsistencyLevel31);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest9.consistencyLevel(writeConsistencyLevel31);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest37 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue38 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest39 = deleteRequest37.timeout(timeValue38);
        org.elasticsearch.common.transport.TransportAddress transportAddress40 = null;
        deleteRequest37.remoteAddress(transportAddress40);
        java.lang.String str42 = deleteRequest37.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest44 = deleteRequest37.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest46 = deleteRequest37.version((long) (byte) 1);
        org.elasticsearch.common.unit.TimeValue timeValue47 = deleteRequest37.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest48 = deleteRequest9.timeout(timeValue47);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest49 = deleteRequest6.timeout(timeValue47);
        boolean boolean50 = deleteRequest6.refresh();
        long long51 = deleteRequest6.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest53 = deleteRequest6.parent("delete {[delete {[][][hi!]}][][delete {[][null][null]}]}");
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel14 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel14.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel31 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel31.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertNotNull(timeValue38);
        org.junit.Assert.assertNotNull(deleteRequest39);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(deleteRequest44);
        org.junit.Assert.assertNotNull(deleteRequest46);
        org.junit.Assert.assertNotNull(timeValue47);
        org.junit.Assert.assertNotNull(deleteRequest48);
        org.junit.Assert.assertNotNull(deleteRequest49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest53);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.VersionType versionType3 = deleteRequest0.versionType();
        java.lang.String str4 = deleteRequest0.type();
        java.lang.String str5 = deleteRequest0.getDescription();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.refresh(false);
        long long10 = deleteRequest7.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest7.version((long) (short) 0);
        org.elasticsearch.index.shard.ShardId shardId13 = deleteRequest12.shardId();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "delete {[null][null][null]}" + "'", str5, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNull(shardId13);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        java.lang.String[] strArray6 = deleteRequest5.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest5.index("delete {[][null][null]}");
        long long9 = deleteRequest8.primaryTerm();
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest8.setParentTask("", 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 0 length nodeIds are reserved for EMPTY_TASK_ID and are otherwise invalid.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.refresh(true);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.index("delete {[null][null][null]}");
        org.elasticsearch.index.VersionType versionType8 = deleteRequest5.versionType();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel9 = deleteRequest5.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue17 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest16.timeout(timeValue17);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException20 = deleteRequest19.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException22 = deleteRequest21.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest21.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue25 = deleteRequest24.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest19.timeout(timeValue25);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest19.index("hi!");
        org.elasticsearch.common.transport.TransportAddress transportAddress29 = null;
        deleteRequest19.remoteAddress(transportAddress29);
        org.elasticsearch.index.shard.ShardId shardId31 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest19.setShardId(shardId31);
        org.elasticsearch.tasks.TaskId taskId33 = deleteRequest32.getParentTask();
        deleteRequest18.setParentTask(taskId33);
        org.elasticsearch.tasks.Task task35 = deleteRequest5.createTask((long) (short) 1, "delete {[null][null][hi!]}", "delete {[][null][null]}", taskId33);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest37 = deleteRequest5.timeout("delete {[][][hi!]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[][][hi!]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(versionType8);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel9 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel9.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(timeValue17);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(actionRequestValidationException20);
        org.junit.Assert.assertNotNull(actionRequestValidationException22);
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNotNull(timeValue25);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertNotNull(taskId33);
        org.junit.Assert.assertNotNull(task35);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.refresh(false);
        org.elasticsearch.index.VersionType versionType7 = deleteRequest4.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.versionType(versionType7);
        deleteRequest8.seqNo((long) (byte) -1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest8.version(10L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest8.refresh(true);
        org.elasticsearch.tasks.TaskId taskId15 = deleteRequest14.getParentTask();
        java.lang.String str16 = deleteRequest14.type();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput17 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest14.writeTo(streamOutput17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(versionType7);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(taskId15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        deleteRequest0.primaryTerm(10L);
        java.lang.String str4 = deleteRequest0.type();
        org.elasticsearch.index.shard.IndexShard indexShard5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult6 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest0, indexShard5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.VersionType versionType3 = deleteRequest0.versionType();
        java.lang.String[] strArray4 = deleteRequest0.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest0.version((long) (short) 0);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException7 = deleteRequest6.validate();
        org.elasticsearch.index.VersionType versionType8 = deleteRequest6.versionType();
        org.elasticsearch.index.VersionType versionType9 = deleteRequest6.versionType();
        java.lang.String str10 = deleteRequest6.id();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(actionRequestValidationException7);
        org.junit.Assert.assertNotNull(versionType8);
        org.junit.Assert.assertNotNull(versionType9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][]}", "delete {[null][][null]}", "delete {[][][]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = deleteRequest3.remoteAddress();
        org.junit.Assert.assertNull(transportAddress4);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.routing("");
        boolean boolean5 = deleteRequest4.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest4.parent("delete {[delete {[][null][null]}][hi!][null]}");
        java.lang.String str8 = deleteRequest4.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest4.parent("delete {[][][]}");
        deleteRequest4.seqNo((long) (short) 0);
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException3 = deleteRequest2.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId11 = deleteRequest10.shardId();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel12 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest10.consistencyLevel(writeConsistencyLevel12);
        java.lang.String str14 = deleteRequest13.routing();
        org.elasticsearch.index.VersionType versionType15 = deleteRequest13.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest5.versionType(versionType15);
        java.lang.String str17 = deleteRequest16.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[null][null][delete {[null][null][null]}]}", deleteRequest16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(actionRequestValidationException3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNull(shardId11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(versionType15);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "delete {[null][null][null]}" + "'", str17, "delete {[null][null][null]}");
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][]}", "", "delete {[][][hi!]}");
        org.elasticsearch.index.shard.IndexShard indexShard4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult5 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest3, indexShard4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = deleteRequest0.consistencyLevel();
        deleteRequest0.primaryTerm((long) (short) -1);
        java.lang.String str7 = deleteRequest0.routing();
        org.elasticsearch.index.shard.IndexShard indexShard8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult9 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest0, indexShard8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel4 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel4.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][][hi!]}", "", "delete {[][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue6 = deleteRequest5.timeout();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = deleteRequest5.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        boolean boolean12 = deleteRequest11.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest11.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue15 = deleteRequest14.timeout();
        long long16 = deleteRequest14.primaryTerm();
        deleteRequest14.setParentTask("delete {[null][null][]}", (-3L));
        org.elasticsearch.index.VersionType versionType20 = deleteRequest14.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest5.versionType(versionType20);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest22.refresh(false);
        boolean boolean25 = deleteRequest22.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue30 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest29.timeout(timeValue30);
        org.elasticsearch.common.transport.TransportAddress transportAddress32 = null;
        deleteRequest29.remoteAddress(transportAddress32);
        java.lang.String str34 = deleteRequest29.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest36 = deleteRequest29.parent("hi!");
        org.elasticsearch.index.VersionType versionType37 = deleteRequest29.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest38 = deleteRequest22.versionType(versionType37);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest39 = deleteRequest21.versionType(versionType37);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[null][null][]}", deleteRequest21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel7 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel7.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(timeValue15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(versionType20);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(timeValue30);
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(deleteRequest36);
        org.junit.Assert.assertNotNull(versionType37);
        org.junit.Assert.assertNotNull(deleteRequest38);
        org.junit.Assert.assertNotNull(deleteRequest39);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest3.remoteAddress(transportAddress6);
        java.lang.String str8 = deleteRequest3.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest3.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest12.type("");
        org.elasticsearch.common.io.stream.StreamInput streamInput15 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest12.readFrom(streamInput15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest14);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest3.remoteAddress(transportAddress6);
        java.lang.String str8 = deleteRequest3.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.index("delete {[null][null][null]}");
        java.lang.String str13 = deleteRequest12.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest12.routing("");
        org.elasticsearch.common.unit.TimeValue timeValue16 = deleteRequest15.timeout();
        org.elasticsearch.index.shard.ShardId shardId17 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest15.setShardId(shardId17);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest15.id("delete {[delete {[null][null][null]}][][]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress21 = deleteRequest20.remoteAddress();
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(timeValue16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNull(transportAddress21);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException1 = deleteRequest0.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException3 = deleteRequest2.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue6 = deleteRequest5.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.timeout(timeValue6);
        java.lang.String str8 = deleteRequest0.parent();
        org.elasticsearch.index.shard.IndexShard indexShard9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult10 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest0, indexShard9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(actionRequestValidationException1);
        org.junit.Assert.assertNotNull(actionRequestValidationException3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest1.id("delete {[delete {[][][hi!]}][][delete {[][null][null]}]}");
        org.elasticsearch.index.VersionType versionType6 = deleteRequest5.versionType();
        org.elasticsearch.index.shard.IndexShard indexShard7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult8 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest5, indexShard7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(versionType6);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest2.setParentTask("hi!", 10L);
        java.lang.String[] strArray6 = deleteRequest2.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = deleteRequest2.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest2.routing("hi!");
        boolean boolean10 = deleteRequest9.getShouldPersistResult();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[delete {[][null][null]}][hi!][null]}", deleteRequest9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel7 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel7.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest2.setParentTask("hi!", 10L);
        java.lang.String[] strArray6 = deleteRequest2.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest7.setParentTask("hi!", 10L);
        java.lang.String[] strArray11 = deleteRequest7.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel12 = deleteRequest7.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest2.consistencyLevel(writeConsistencyLevel12);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel14 = deleteRequest2.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions16 = deleteRequest15.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest15.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest19.refresh(false);
        org.elasticsearch.index.VersionType versionType22 = deleteRequest19.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest18.versionType(versionType22);
        deleteRequest23.seqNo((long) (byte) -1);
        org.elasticsearch.tasks.TaskId taskId26 = deleteRequest23.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest31.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = deleteRequest33.refresh(true);
        org.elasticsearch.tasks.TaskId taskId36 = deleteRequest33.getParentTask();
        org.elasticsearch.tasks.Task task37 = deleteRequest23.createTask((long) (short) 10, "", "hi!", taskId36);
        deleteRequest2.setParentTask(taskId36);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest40 = deleteRequest2.type("delete {[][][]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[null][][null]}", deleteRequest40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel12 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel12.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel14 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel14.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(indicesOptions16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(versionType22);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(taskId26);
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertNotNull(deleteRequest35);
        org.junit.Assert.assertNotNull(taskId36);
        org.junit.Assert.assertNotNull(task37);
        org.junit.Assert.assertNotNull(deleteRequest40);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.getDescription();
        org.elasticsearch.index.shard.ShardId shardId2 = deleteRequest0.shardId();
        boolean boolean3 = deleteRequest0.refresh();
        deleteRequest0.primaryTerm((long) ' ');
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.id("delete {[delete {[][][hi!]}][][delete {[][null][null]}]}");
        org.elasticsearch.index.shard.IndexShard indexShard8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult9 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest7, indexShard8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "delete {[null][null][null]}" + "'", str1, "delete {[null][null][null]}");
        org.junit.Assert.assertNull(shardId2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(deleteRequest7);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        long long3 = deleteRequest2.primaryTerm();
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = null;
        deleteRequest2.remoteAddress(transportAddress4);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "hi!", deleteRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest3.remoteAddress(transportAddress6);
        java.lang.String str8 = deleteRequest3.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.index("delete {[null][null][null]}");
        java.lang.String str13 = deleteRequest12.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest12.routing("");
        org.elasticsearch.common.unit.TimeValue timeValue16 = deleteRequest15.timeout();
        org.elasticsearch.index.shard.ShardId shardId17 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest15.setShardId(shardId17);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest15.id("delete {[delete {[null][null][null]}][][]}");
        org.elasticsearch.index.shard.IndexShard indexShard21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete22 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest20, indexShard21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(timeValue16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(deleteRequest20);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = null;
        deleteRequest0.remoteAddress(transportAddress4);
        org.elasticsearch.tasks.TaskId taskId6 = deleteRequest0.getParentTask();
        java.lang.String str7 = deleteRequest0.id();
        long long8 = deleteRequest0.seqNo();
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(taskId6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId3 = deleteRequest2.shardId();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.consistencyLevel(writeConsistencyLevel4);
        org.elasticsearch.index.VersionType versionType6 = deleteRequest2.versionType();
        org.elasticsearch.index.VersionType versionType7 = deleteRequest2.versionType();
        java.lang.String str8 = deleteRequest2.parent();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(shardId3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(versionType6);
        org.junit.Assert.assertNotNull(versionType7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.refresh(false);
        org.elasticsearch.index.VersionType versionType7 = deleteRequest4.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.versionType(versionType7);
        boolean boolean9 = deleteRequest3.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest3.version((long) 0);
        java.lang.String str12 = deleteRequest11.id();
        boolean boolean13 = deleteRequest11.getShouldPersistResult();
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(versionType7);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException1 = deleteRequest0.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest3.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest7.setParentTask("hi!", 10L);
        java.lang.String[] strArray11 = deleteRequest7.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest12.setParentTask("hi!", 10L);
        java.lang.String[] strArray16 = deleteRequest12.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel17 = deleteRequest12.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest7.consistencyLevel(writeConsistencyLevel17);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest6.consistencyLevel(writeConsistencyLevel17);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest19.index("delete {[null][hi!][]}");
        org.elasticsearch.index.shard.IndexShard indexShard22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete23 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest21, indexShard22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(actionRequestValidationException1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel17 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel17.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(deleteRequest21);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue7 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.timeout(timeValue7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest2.timeout(timeValue7);
        java.lang.String str10 = deleteRequest9.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest9.id("delete {[null][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions14 = deleteRequest13.indicesOptions();
        java.lang.String str15 = deleteRequest13.id();
        long long16 = deleteRequest13.primaryTerm();
        java.lang.String str17 = deleteRequest13.routing();
        java.lang.String str18 = deleteRequest13.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException23 = deleteRequest22.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException25 = deleteRequest24.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest24.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue28 = deleteRequest27.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest22.timeout(timeValue28);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest36 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.tasks.TaskId taskId40 = null;
        org.elasticsearch.tasks.Task task41 = deleteRequest36.createTask((long) ' ', "delete {[null][null][null]}", "delete {[null][null][null]}", taskId40);
        org.elasticsearch.tasks.TaskId taskId42 = deleteRequest36.getParentTask();
        org.elasticsearch.tasks.Task task43 = deleteRequest29.createTask((long) 1, "delete {[][null][null]}", "delete {[delete {[][null][null]}][hi!][null]}", taskId42);
        org.elasticsearch.tasks.Task task44 = deleteRequest13.createTask((long) ' ', "delete {[null][null][null]}", "", taskId42);
        deleteRequest12.setParentTask(taskId42);
        java.lang.Class<?> wildcardClass46 = deleteRequest12.getClass();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(timeValue7);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(indicesOptions14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "delete {[null][null][null]}" + "'", str18, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(actionRequestValidationException23);
        org.junit.Assert.assertNotNull(actionRequestValidationException25);
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertNotNull(timeValue28);
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertNotNull(task41);
        org.junit.Assert.assertNotNull(taskId42);
        org.junit.Assert.assertNotNull(task43);
        org.junit.Assert.assertNotNull(task44);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException3 = deleteRequest2.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure5 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "", (java.lang.Throwable) actionRequestValidationException3, "hi!");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = shardFailure5.routing;
        java.lang.String str7 = shardFailure5.reason;
        java.lang.Throwable throwable8 = shardFailure5.cause;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting9 = shardFailure5.routing;
        java.lang.Throwable throwable10 = shardFailure5.cause;
        org.junit.Assert.assertNotNull(actionRequestValidationException3);
        org.junit.Assert.assertNull(shardRouting6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(throwable8);
        org.junit.Assert.assertEquals(throwable8.getLocalizedMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable8.getMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable8.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertNull(shardRouting9);
        org.junit.Assert.assertNotNull(throwable10);
        org.junit.Assert.assertEquals(throwable10.getLocalizedMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable10.getMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable10.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][][null]}", "delete {[null][null][]}", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[delete {[][null][null]}][hi!][null]}", deleteRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}", "delete {[null][null][null]}", "");
        org.elasticsearch.action.support.IndicesOptions indicesOptions6 = deleteRequest5.indicesOptions();
        org.elasticsearch.index.shard.ShardId shardId7 = deleteRequest5.shardId();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[delete {[null][null][null]}][][]}", deleteRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions6);
        org.junit.Assert.assertNull(shardId7);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        long long3 = deleteRequest0.seqNo();
        org.elasticsearch.common.io.stream.StreamInput streamInput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.readFrom(streamInput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        boolean boolean3 = deleteRequest0.getShouldPersistResult();
        org.elasticsearch.tasks.TaskId taskId4 = null;
        deleteRequest0.setParentTask(taskId4);
        java.lang.String str6 = deleteRequest0.parent();
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest0.setShardId(shardId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest8.routing("delete {[null][hi!][null]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest8.timeout("delete {[null][][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[null][][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.routing("");
        boolean boolean5 = deleteRequest4.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest4.parent("delete {[delete {[][null][null]}][hi!][null]}");
        java.lang.String str8 = deleteRequest4.routing();
        org.elasticsearch.index.shard.IndexShard indexShard9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult10 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest4, indexShard9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest0.timeout();
        java.lang.String str5 = deleteRequest0.type();
        org.elasticsearch.common.io.stream.StreamInput streamInput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.readFrom(streamInput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][][]}", "delete {[delete {[][][hi!]}][][delete {[][null][null]}]}", "delete {[delete {[][null][null]}][hi!][null]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[null][hi!][null]}", deleteRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue6 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.timeout(timeValue6);
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = null;
        deleteRequest5.remoteAddress(transportAddress8);
        java.lang.String str10 = deleteRequest5.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest5.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest12.index("delete {[null][null][null]}");
        java.lang.String str15 = deleteRequest14.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest14.routing("");
        org.elasticsearch.common.unit.TimeValue timeValue18 = deleteRequest17.timeout();
        org.elasticsearch.action.support.IndicesOptions indicesOptions19 = deleteRequest17.indicesOptions();
        long long20 = deleteRequest17.seqNo();
        boolean boolean21 = deleteRequest17.refresh();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[null][hi!][null]}", deleteRequest17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(timeValue18);
        org.junit.Assert.assertNotNull(indicesOptions19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        boolean boolean3 = deleteRequest0.getShouldPersistResult();
        org.elasticsearch.tasks.TaskId taskId4 = null;
        deleteRequest0.setParentTask(taskId4);
        java.lang.String str6 = deleteRequest0.parent();
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest0.setShardId(shardId7);
        org.elasticsearch.index.shard.IndexShard indexShard9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult10 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest0, indexShard9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(deleteRequest8);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue7 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.timeout(timeValue7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest2.timeout(timeValue7);
        java.lang.String str10 = deleteRequest9.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest9.routing("");
        java.lang.Class<?> wildcardClass13 = deleteRequest12.getClass();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(timeValue7);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        long long3 = deleteRequest0.seqNo();
        java.lang.String str4 = deleteRequest0.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest0.parent("");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.timeout("");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[null][null][null]}" + "'", str4, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest6);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.refresh(true);
        java.lang.String str6 = deleteRequest3.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions8 = deleteRequest7.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest7.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.refresh(false);
        org.elasticsearch.index.VersionType versionType14 = deleteRequest11.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest10.versionType(versionType14);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest10.refresh(true);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest17.type("hi!");
        org.elasticsearch.common.transport.TransportAddress transportAddress20 = null;
        deleteRequest17.remoteAddress(transportAddress20);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest22.setParentTask("hi!", 10L);
        java.lang.String[] strArray26 = deleteRequest22.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel27 = deleteRequest22.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest17.consistencyLevel(writeConsistencyLevel27);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest3.consistencyLevel(writeConsistencyLevel27);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[delete {[][][]}][null][null]}", deleteRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(indicesOptions8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(versionType14);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel27 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel27.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertNotNull(deleteRequest29);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException1 = deleteRequest0.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException3 = deleteRequest2.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue6 = deleteRequest5.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.timeout(timeValue6);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest0.index("hi!");
        java.lang.String[] strArray10 = deleteRequest0.indices();
        java.lang.String str11 = deleteRequest0.parent();
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest0.setShardId(shardId12);
        org.elasticsearch.index.shard.IndexShard indexShard14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult15 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest0, indexShard14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(actionRequestValidationException1);
        org.junit.Assert.assertNotNull(actionRequestValidationException3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(deleteRequest13);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "delete {[][null][null]}", "delete {[null][hi!][]}");
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException1 = deleteRequest0.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.routing("hi!");
        org.elasticsearch.index.shard.ShardId shardId4 = deleteRequest3.shardId();
        java.lang.String str5 = deleteRequest3.routing();
        org.junit.Assert.assertNotNull(actionRequestValidationException1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNull(shardId4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}", "delete {[null][null][null]}", "delete {[][null][null]}");
        org.elasticsearch.common.io.stream.StreamOutput streamOutput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.writeTo(streamOutput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest2.setParentTask("hi!", 10L);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException6 = deleteRequest2.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure8 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[][null][null]}", (java.lang.Throwable) actionRequestValidationException6, "delete {[null][null][null]}");
        java.lang.Throwable throwable9 = shardFailure8.cause;
        java.lang.String str10 = shardFailure8.reason;
        org.junit.Assert.assertNotNull(actionRequestValidationException6);
        org.junit.Assert.assertNotNull(throwable9);
        org.junit.Assert.assertEquals(throwable9.getLocalizedMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable9.getMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable9.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "delete {[][null][null]}" + "'", str10, "delete {[][null][null]}");
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest3.remoteAddress(transportAddress6);
        java.lang.String str8 = deleteRequest3.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.index("delete {[null][null][null]}");
        java.lang.String str13 = deleteRequest12.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest12.routing("");
        org.elasticsearch.common.unit.TimeValue timeValue16 = deleteRequest15.timeout();
        org.elasticsearch.index.shard.ShardId shardId17 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest15.setShardId(shardId17);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest15.id("delete {[delete {[null][null][null]}][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest20.parent("delete {[delete {[][][hi!]}][][delete {[][null][null]}]}");
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(timeValue16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(deleteRequest22);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest0.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest0.version((long) ' ');
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = deleteRequest0.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest0.routing("delete {[][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest0.id("delete {[][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest0.id("delete {[delete {[null][null][null]}][][]}");
        deleteRequest0.setParentTask("delete {[delete {[][null][null]}][hi!][null]}", 10L);
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel7 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel7.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException3 = deleteRequest2.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException5 = deleteRequest4.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest4.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue8 = deleteRequest7.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest2.timeout(timeValue8);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest2.index("hi!");
        org.elasticsearch.common.transport.TransportAddress transportAddress12 = null;
        deleteRequest2.remoteAddress(transportAddress12);
        org.elasticsearch.index.shard.ShardId shardId14 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest2.setShardId(shardId14);
        org.elasticsearch.tasks.TaskId taskId16 = deleteRequest2.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest2.routing("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[null][null][null]}", deleteRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(actionRequestValidationException3);
        org.junit.Assert.assertNotNull(actionRequestValidationException5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(taskId16);
        org.junit.Assert.assertNotNull(deleteRequest18);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest3.timeout();
        java.lang.String str5 = deleteRequest3.type();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.writeTo(streamOutput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException5 = deleteRequest4.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure7 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "", (java.lang.Throwable) actionRequestValidationException5, "hi!");
        java.lang.Throwable throwable8 = shardFailure7.cause;
        java.lang.Throwable throwable9 = shardFailure7.cause;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure11 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "", throwable9, "hi!");
        java.lang.String str12 = shardFailure11.indexUUID;
        java.lang.String str13 = shardFailure11.indexUUID;
        java.lang.String str14 = shardFailure11.reason;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting15 = shardFailure11.routing;
        org.junit.Assert.assertNotNull(actionRequestValidationException5);
        org.junit.Assert.assertNotNull(throwable8);
        org.junit.Assert.assertEquals(throwable8.getLocalizedMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable8.getMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable8.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertNotNull(throwable9);
        org.junit.Assert.assertEquals(throwable9.getLocalizedMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable9.getMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable9.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(shardRouting15);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException5 = deleteRequest4.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest4.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue8 = deleteRequest7.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest0.timeout(timeValue8);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.refresh(false);
        org.elasticsearch.tasks.TaskId taskId13 = deleteRequest12.getParentTask();
        deleteRequest0.setParentTask(taskId13);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest0.id("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue17 = deleteRequest0.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest0.type("delete {[null][null][null]}");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException20 = deleteRequest19.validate();
        java.lang.Class<?> wildcardClass21 = actionRequestValidationException20.getClass();
        org.junit.Assert.assertNotNull(actionRequestValidationException5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(taskId13);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(timeValue17);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(actionRequestValidationException20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        long long3 = deleteRequest0.seqNo();
        java.lang.String str4 = deleteRequest0.toString();
        java.lang.String str5 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest0.type("hi!");
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = deleteRequest0.remoteAddress();
        java.lang.String str11 = deleteRequest0.getDescription();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[null][null][null]}" + "'", str4, "delete {[null][null][null]}");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNull(transportAddress10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[null][hi!][]}" + "'", str11, "delete {[null][hi!][]}");
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.refresh(true);
        deleteRequest5.primaryTerm((long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest5.timeout("delete {[][][]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[][][]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest2.setParentTask("hi!", 10L);
        java.lang.String[] strArray6 = deleteRequest2.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest7.setParentTask("hi!", 10L);
        java.lang.String[] strArray11 = deleteRequest7.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel12 = deleteRequest7.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest2.consistencyLevel(writeConsistencyLevel12);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel14 = deleteRequest2.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions16 = deleteRequest15.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest15.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest19.refresh(false);
        org.elasticsearch.index.VersionType versionType22 = deleteRequest19.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest18.versionType(versionType22);
        deleteRequest23.seqNo((long) (byte) -1);
        org.elasticsearch.tasks.TaskId taskId26 = deleteRequest23.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest31.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = deleteRequest33.refresh(true);
        org.elasticsearch.tasks.TaskId taskId36 = deleteRequest33.getParentTask();
        org.elasticsearch.tasks.Task task37 = deleteRequest23.createTask((long) (short) 10, "", "hi!", taskId36);
        deleteRequest2.setParentTask(taskId36);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest40 = deleteRequest2.type("delete {[null][hi!][null]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[delete {[null][null][null]}][][]}", deleteRequest40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel12 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel12.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel14 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel14.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(indicesOptions16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(versionType22);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(taskId26);
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertNotNull(deleteRequest35);
        org.junit.Assert.assertNotNull(taskId36);
        org.junit.Assert.assertNotNull(task37);
        org.junit.Assert.assertNotNull(deleteRequest40);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException1 = deleteRequest0.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException3 = deleteRequest2.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue6 = deleteRequest5.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.timeout(timeValue6);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel8 = deleteRequest0.consistencyLevel();
        org.elasticsearch.common.transport.TransportAddress transportAddress9 = deleteRequest0.remoteAddress();
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = null;
        deleteRequest0.remoteAddress(transportAddress10);
        org.junit.Assert.assertNotNull(actionRequestValidationException1);
        org.junit.Assert.assertNotNull(actionRequestValidationException3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel8 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel8.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNull(transportAddress9);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.VersionType versionType3 = deleteRequest0.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId7 = deleteRequest6.shardId();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel8 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.consistencyLevel(writeConsistencyLevel8);
        org.elasticsearch.index.VersionType versionType10 = deleteRequest6.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest0.versionType(versionType10);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        boolean boolean16 = deleteRequest15.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest15.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue19 = deleteRequest18.timeout();
        long long20 = deleteRequest18.primaryTerm();
        deleteRequest18.setParentTask("delete {[null][null][]}", (-3L));
        org.elasticsearch.index.VersionType versionType24 = deleteRequest18.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest11.versionType(versionType24);
        org.elasticsearch.common.transport.TransportAddress transportAddress26 = null;
        deleteRequest11.remoteAddress(transportAddress26);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        boolean boolean32 = deleteRequest31.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = deleteRequest31.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue35 = deleteRequest34.timeout();
        long long36 = deleteRequest34.primaryTerm();
        deleteRequest34.setParentTask("delete {[null][null][]}", (-3L));
        org.elasticsearch.index.VersionType versionType40 = deleteRequest34.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest41 = deleteRequest11.versionType(versionType40);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest42 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException43 = deleteRequest42.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest44 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException45 = deleteRequest44.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest47 = deleteRequest44.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue48 = deleteRequest47.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest49 = deleteRequest42.timeout(timeValue48);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest51 = deleteRequest42.index("hi!");
        org.elasticsearch.common.transport.TransportAddress transportAddress52 = null;
        deleteRequest42.remoteAddress(transportAddress52);
        org.elasticsearch.index.shard.ShardId shardId54 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest55 = deleteRequest42.setShardId(shardId54);
        org.elasticsearch.tasks.TaskId taskId56 = deleteRequest55.getParentTask();
        deleteRequest41.setParentTask(taskId56);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest61 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][][hi!]}", "", "delete {[][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue62 = deleteRequest61.timeout();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel63 = deleteRequest61.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest64 = deleteRequest41.consistencyLevel(writeConsistencyLevel63);
        org.elasticsearch.index.shard.IndexShard indexShard65 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete66 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest64, indexShard65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNull(shardId7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(versionType10);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(timeValue19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(versionType24);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(deleteRequest34);
        org.junit.Assert.assertNotNull(timeValue35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(versionType40);
        org.junit.Assert.assertNotNull(deleteRequest41);
        org.junit.Assert.assertNotNull(actionRequestValidationException43);
        org.junit.Assert.assertNotNull(actionRequestValidationException45);
        org.junit.Assert.assertNotNull(deleteRequest47);
        org.junit.Assert.assertNotNull(timeValue48);
        org.junit.Assert.assertNotNull(deleteRequest49);
        org.junit.Assert.assertNotNull(deleteRequest51);
        org.junit.Assert.assertNotNull(deleteRequest55);
        org.junit.Assert.assertNotNull(taskId56);
        org.junit.Assert.assertNotNull(timeValue62);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel63 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel63.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest64);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId3 = deleteRequest2.shardId();
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = null;
        deleteRequest2.remoteAddress(transportAddress4);
        java.lang.String str6 = deleteRequest2.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest2.parent("");
        java.lang.String str9 = deleteRequest2.parent();
        org.elasticsearch.common.io.stream.StreamInput streamInput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest2.readFrom(streamInput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(shardId3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        boolean boolean3 = deleteRequest0.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue8 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.timeout(timeValue8);
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = null;
        deleteRequest7.remoteAddress(transportAddress10);
        java.lang.String str12 = deleteRequest7.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest7.parent("hi!");
        org.elasticsearch.index.VersionType versionType15 = deleteRequest7.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest0.versionType(versionType15);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest0.parent("delete {[null][null][null]}");
        org.elasticsearch.index.shard.IndexShard indexShard19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult20 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest0, indexShard19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(versionType15);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(deleteRequest18);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue7 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.timeout(timeValue7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest2.timeout(timeValue7);
        org.elasticsearch.index.shard.ShardId shardId10 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.setShardId(shardId10);
        deleteRequest9.seqNo(1L);
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(timeValue7);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput3 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.writeTo(streamOutput3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId3 = deleteRequest2.shardId();
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = null;
        deleteRequest2.remoteAddress(transportAddress4);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest6.setParentTask("hi!", 10L);
        java.lang.String str10 = deleteRequest6.toString();
        org.elasticsearch.common.unit.TimeValue timeValue11 = deleteRequest6.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest2.timeout(timeValue11);
        long long13 = deleteRequest12.version();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(shardId3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "delete {[null][null][null]}" + "'", str10, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(timeValue11);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-3L) + "'", long13 == (-3L));
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.VersionType versionType3 = deleteRequest0.versionType();
        java.lang.String str4 = deleteRequest0.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest0.refresh(true);
        long long7 = deleteRequest0.version();
        org.elasticsearch.index.shard.IndexShard indexShard8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult9 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest0, indexShard8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-3L) + "'", long7 == (-3L));
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}", "delete {[null][null][null]}", "");
        long long4 = deleteRequest3.seqNo();
        long long5 = deleteRequest3.version();
        java.lang.String str6 = deleteRequest3.id();
        org.elasticsearch.common.io.stream.StreamInput streamInput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.readFrom(streamInput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-3L) + "'", long5 == (-3L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        boolean boolean3 = deleteRequest0.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue8 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.timeout(timeValue8);
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = null;
        deleteRequest7.remoteAddress(transportAddress10);
        java.lang.String str12 = deleteRequest7.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest7.parent("hi!");
        org.elasticsearch.index.VersionType versionType15 = deleteRequest7.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest0.versionType(versionType15);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest0.parent("delete {[null][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest18.parent("delete {[null][null][null]}");
        java.lang.String str21 = deleteRequest20.id();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput22 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest20.writeTo(streamOutput22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(versionType15);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.refresh(false);
        org.elasticsearch.index.VersionType versionType7 = deleteRequest4.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.versionType(versionType7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.refresh(true);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.refresh(false);
        org.elasticsearch.index.VersionType versionType14 = deleteRequest11.versionType();
        java.lang.String str15 = deleteRequest11.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest11.index("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions19 = deleteRequest18.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest18.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest22.refresh(false);
        org.elasticsearch.index.VersionType versionType25 = deleteRequest22.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest21.versionType(versionType25);
        deleteRequest26.seqNo((long) (byte) -1);
        org.elasticsearch.tasks.TaskId taskId29 = deleteRequest26.getParentTask();
        deleteRequest17.setParentTask(taskId29);
        deleteRequest17.setParentTask("hi!", (long) (-1));
        org.elasticsearch.common.transport.TransportAddress transportAddress34 = null;
        deleteRequest17.remoteAddress(transportAddress34);
        java.lang.String[] strArray36 = deleteRequest17.indices();
        org.elasticsearch.common.unit.TimeValue timeValue37 = deleteRequest17.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest38 = deleteRequest3.timeout(timeValue37);
        java.lang.Class<?> wildcardClass39 = deleteRequest38.getClass();
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(versionType7);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(versionType14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(indicesOptions19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNotNull(versionType25);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNotNull(taskId29);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(timeValue37);
        org.junit.Assert.assertNotNull(deleteRequest38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        java.lang.String str4 = deleteRequest0.toString();
        long long5 = deleteRequest0.version();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue10 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.timeout(timeValue10);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest0.timeout(timeValue10);
        org.elasticsearch.index.shard.IndexShard indexShard13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult14 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest0, indexShard13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[null][null][null]}" + "'", str4, "delete {[null][null][null]}");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-3L) + "'", long5 == (-3L));
        org.junit.Assert.assertNotNull(timeValue10);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest12);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        java.lang.String[] strArray4 = deleteRequest0.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = deleteRequest0.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.type("hi!");
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = null;
        deleteRequest0.remoteAddress(transportAddress8);
        org.elasticsearch.index.shard.ShardId shardId10 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest0.setShardId(shardId10);
        java.lang.String str12 = deleteRequest11.parent();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel5 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel5.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException3 = deleteRequest2.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure5 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "", (java.lang.Throwable) actionRequestValidationException3, "hi!");
        java.lang.Throwable throwable6 = shardFailure5.cause;
        java.lang.Throwable throwable7 = shardFailure5.cause;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = shardFailure5.routing;
        java.lang.String str9 = shardFailure5.indexUUID;
        java.lang.Throwable throwable10 = shardFailure5.cause;
        java.lang.String str11 = shardFailure5.indexUUID;
        java.lang.String str12 = shardFailure5.reason;
        org.junit.Assert.assertNotNull(actionRequestValidationException3);
        org.junit.Assert.assertNotNull(throwable6);
        org.junit.Assert.assertEquals(throwable6.getLocalizedMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable6.getMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable6.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertNotNull(throwable7);
        org.junit.Assert.assertEquals(throwable7.getLocalizedMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable7.getMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable7.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertNull(shardRouting8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(throwable10);
        org.junit.Assert.assertEquals(throwable10.getLocalizedMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable10.getMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable10.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        long long3 = deleteRequest0.seqNo();
        java.lang.String str4 = deleteRequest0.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest0.parent("");
        long long7 = deleteRequest0.version();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[null][null][null]}" + "'", str4, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-3L) + "'", long7 == (-3L));
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId3 = deleteRequest2.shardId();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.consistencyLevel(writeConsistencyLevel4);
        deleteRequest2.setParentTask("delete {[null][null][null]}", (long) 10);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest2.type("delete {[][null][null]}");
        org.elasticsearch.tasks.TaskId taskId11 = deleteRequest2.getParentTask();
        org.elasticsearch.index.shard.IndexShard indexShard12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete13 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest2, indexShard12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(shardId3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(taskId11);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest3.remoteAddress(transportAddress6);
        java.lang.String str8 = deleteRequest3.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.index("delete {[null][null][null]}");
        java.lang.String str13 = deleteRequest12.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest12.routing("");
        org.elasticsearch.common.unit.TimeValue timeValue16 = deleteRequest15.timeout();
        org.elasticsearch.index.shard.ShardId shardId17 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest15.setShardId(shardId17);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest15.id("delete {[delete {[null][null][null]}][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest15.id("delete {[delete {[null][null][null]}][][]}");
        long long23 = deleteRequest15.version();
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(timeValue16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-3L) + "'", long23 == (-3L));
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.parent("");
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = deleteRequest7.remoteAddress();
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNull(transportAddress8);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.refresh(true);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException7 = deleteRequest6.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue10 = deleteRequest9.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest5.timeout(timeValue10);
        org.elasticsearch.action.support.IndicesOptions indicesOptions12 = deleteRequest5.indicesOptions();
        org.elasticsearch.common.unit.TimeValue timeValue13 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest5.timeout(timeValue13);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest5.index("delete {[][null][null]}");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException17 = deleteRequest5.validate();
        java.lang.String str18 = deleteRequest5.toString();
        org.elasticsearch.index.shard.IndexShard indexShard19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete20 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest5, indexShard19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(actionRequestValidationException7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(timeValue10);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(indicesOptions12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(actionRequestValidationException17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "delete {[delete {[][null][null]}][null][null]}" + "'", str18, "delete {[delete {[][null][null]}][null][null]}");
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest3.remoteAddress(transportAddress6);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.id("delete {[][][hi!]}");
        org.elasticsearch.action.support.IndicesOptions indicesOptions10 = deleteRequest3.indicesOptions();
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(indicesOptions10);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.refresh(true);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.id("delete {[null][null][null]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.timeout("delete {[hi!][null][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[hi!][null][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest3.remoteAddress(transportAddress6);
        java.lang.String str8 = deleteRequest3.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.index("delete {[null][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException14 = deleteRequest13.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest13.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue17 = deleteRequest16.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest16.routing("");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel20 = deleteRequest16.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest10.consistencyLevel(writeConsistencyLevel20);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput22 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest21.writeTo(streamOutput22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(actionRequestValidationException14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(timeValue17);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel20 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel20.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest21);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        java.lang.String[] strArray4 = deleteRequest0.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = deleteRequest0.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.type("hi!");
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = null;
        deleteRequest0.remoteAddress(transportAddress8);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        boolean boolean14 = deleteRequest13.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest13.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest17.setParentTask("hi!", 10L);
        java.lang.String[] strArray21 = deleteRequest17.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel22 = deleteRequest17.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest16.consistencyLevel(writeConsistencyLevel22);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest0.consistencyLevel(writeConsistencyLevel22);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest24.index("delete {[null][null][delete {[null][null][null]}]}");
        org.elasticsearch.index.shard.IndexShard indexShard27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult28 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest26, indexShard27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel5 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel5.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel22 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel22.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNotNull(deleteRequest26);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId3 = deleteRequest2.shardId();
        deleteRequest2.setParentTask("delete {[][null][null]}", 0L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest2.routing("delete {[delete {[][null][null]}][hi!][null]}");
        java.lang.String str9 = deleteRequest8.id();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(shardId3);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest3.remoteAddress(transportAddress6);
        java.lang.String str8 = deleteRequest3.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest3.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions14 = deleteRequest13.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest13.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest17.refresh(false);
        org.elasticsearch.index.VersionType versionType20 = deleteRequest17.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest16.versionType(versionType20);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest12.versionType(versionType20);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest22.timeout("hi!");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [hi!] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(indicesOptions14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(versionType20);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(deleteRequest22);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.type("");
        java.lang.String str7 = deleteRequest6.type();
        java.lang.String[] strArray8 = deleteRequest6.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest6.id("delete {[delete {[][][hi!]}][][delete {[][null][null]}]}");
        org.elasticsearch.index.shard.IndexShard indexShard11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete12 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest10, indexShard11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(deleteRequest10);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.index("");
        java.lang.Class<?> wildcardClass7 = deleteRequest6.getClass();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        java.lang.String[] strArray4 = deleteRequest0.indices();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException5 = deleteRequest0.validate();
        org.elasticsearch.index.VersionType versionType6 = deleteRequest0.versionType();
        org.elasticsearch.common.transport.TransportAddress transportAddress7 = deleteRequest0.remoteAddress();
        long long8 = deleteRequest0.primaryTerm();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(actionRequestValidationException5);
        org.junit.Assert.assertNotNull(versionType6);
        org.junit.Assert.assertNull(transportAddress7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        java.lang.String str4 = deleteRequest3.toString();
        java.lang.String str5 = deleteRequest3.routing();
        java.lang.String str6 = deleteRequest3.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.index("delete {[delete {[null][null][null]}][][]}");
        org.elasticsearch.index.shard.IndexShard indexShard9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult10 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest8, indexShard9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[null][null][null]}" + "'", str4, "delete {[null][null][null]}");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(deleteRequest8);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.VersionType versionType3 = deleteRequest0.versionType();
        java.lang.String str4 = deleteRequest0.type();
        java.lang.String str5 = deleteRequest0.getDescription();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.refresh(false);
        long long10 = deleteRequest7.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest7.refresh(false);
        org.elasticsearch.common.transport.TransportAddress transportAddress13 = deleteRequest7.remoteAddress();
        org.elasticsearch.tasks.TaskId taskId14 = deleteRequest7.getParentTask();
        java.lang.String[] strArray15 = deleteRequest7.indices();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "delete {[null][null][null]}" + "'", str5, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNull(transportAddress13);
        org.junit.Assert.assertNotNull(taskId14);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.refresh(false);
        org.elasticsearch.index.VersionType versionType7 = deleteRequest4.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.versionType(versionType7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.refresh(true);
        long long11 = deleteRequest10.version();
        org.elasticsearch.common.io.stream.StreamInput streamInput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest10.readFrom(streamInput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(versionType7);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-3L) + "'", long11 == (-3L));
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.refresh(false);
        org.elasticsearch.index.VersionType versionType7 = deleteRequest4.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.versionType(versionType7);
        boolean boolean9 = deleteRequest3.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest3.version((long) 0);
        java.lang.String str12 = deleteRequest11.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions14 = deleteRequest13.indicesOptions();
        deleteRequest13.primaryTerm(10L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest21.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest23.refresh(true);
        org.elasticsearch.tasks.TaskId taskId26 = deleteRequest23.getParentTask();
        org.elasticsearch.tasks.Task task27 = deleteRequest13.createTask((long) (byte) 1, "", "delete {[null][null][null]}", taskId26);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest28.setParentTask("hi!", 10L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException33 = deleteRequest32.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = deleteRequest32.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue36 = deleteRequest35.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest37 = deleteRequest28.timeout(timeValue36);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest38 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest38.setParentTask("hi!", 10L);
        java.lang.String[] strArray42 = deleteRequest38.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel43 = deleteRequest38.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest45 = deleteRequest38.type("hi!");
        org.elasticsearch.index.VersionType versionType46 = deleteRequest45.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest47 = deleteRequest28.versionType(versionType46);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest48 = deleteRequest13.versionType(versionType46);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest49 = deleteRequest11.versionType(versionType46);
        org.elasticsearch.common.io.stream.StreamInput streamInput50 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest11.readFrom(streamInput50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(versionType7);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(indicesOptions14);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(taskId26);
        org.junit.Assert.assertNotNull(task27);
        org.junit.Assert.assertNotNull(actionRequestValidationException33);
        org.junit.Assert.assertNotNull(deleteRequest35);
        org.junit.Assert.assertNotNull(timeValue36);
        org.junit.Assert.assertNotNull(deleteRequest37);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel43 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel43.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest45);
        org.junit.Assert.assertNotNull(versionType46);
        org.junit.Assert.assertNotNull(deleteRequest47);
        org.junit.Assert.assertNotNull(deleteRequest48);
        org.junit.Assert.assertNotNull(deleteRequest49);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException5 = deleteRequest4.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure7 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "", (java.lang.Throwable) actionRequestValidationException5, "hi!");
        java.lang.Throwable throwable8 = shardFailure7.cause;
        java.lang.Throwable throwable9 = shardFailure7.cause;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting10 = shardFailure7.routing;
        java.lang.String str11 = shardFailure7.indexUUID;
        java.lang.Throwable throwable12 = shardFailure7.cause;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure14 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[][null][null]}", throwable12, "delete {[][][]}");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting15 = shardFailure14.routing;
        org.junit.Assert.assertNotNull(actionRequestValidationException5);
        org.junit.Assert.assertNotNull(throwable8);
        org.junit.Assert.assertEquals(throwable8.getLocalizedMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable8.getMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable8.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertNotNull(throwable9);
        org.junit.Assert.assertEquals(throwable9.getLocalizedMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable9.getMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable9.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertNull(shardRouting10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(throwable12);
        org.junit.Assert.assertEquals(throwable12.getLocalizedMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable12.getMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable12.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertNull(shardRouting15);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        boolean boolean6 = deleteRequest5.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest5.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest9.setParentTask("hi!", 10L);
        java.lang.String[] strArray13 = deleteRequest9.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel14 = deleteRequest9.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest8.consistencyLevel(writeConsistencyLevel14);
        org.elasticsearch.common.unit.TimeValue timeValue16 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest15.timeout(timeValue16);
        java.lang.String str18 = deleteRequest17.routing();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "hi!", deleteRequest17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel14 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel14.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(timeValue16);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        boolean boolean3 = deleteRequest0.getShouldPersistResult();
        org.elasticsearch.tasks.TaskId taskId4 = null;
        deleteRequest0.setParentTask(taskId4);
        java.lang.String str6 = deleteRequest0.parent();
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest0.setShardId(shardId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.routing("hi!");
        long long11 = deleteRequest8.primaryTerm();
        deleteRequest8.primaryTerm(1L);
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.refresh(true);
        java.lang.String[] strArray6 = deleteRequest3.indices();
        java.lang.String str7 = deleteRequest3.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest12.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest14.refresh(true);
        org.elasticsearch.tasks.TaskId taskId17 = deleteRequest14.getParentTask();
        org.elasticsearch.tasks.Task task18 = deleteRequest3.createTask(100L, "delete {[null][null][null]}", "delete {[null][null][null]}", taskId17);
        org.elasticsearch.index.shard.IndexShard indexShard19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete20 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest3, indexShard19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "delete {[][null][null]}" + "'", str7, "delete {[][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(taskId17);
        org.junit.Assert.assertNotNull(task18);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        java.lang.String str2 = deleteRequest0.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest3.setParentTask("hi!", 10L);
        java.lang.String[] strArray7 = deleteRequest3.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel8 = deleteRequest3.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest0.consistencyLevel(writeConsistencyLevel8);
        deleteRequest0.seqNo(0L);
        org.elasticsearch.common.transport.TransportAddress transportAddress12 = null;
        deleteRequest0.remoteAddress(transportAddress12);
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel8 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel8.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest9);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.refresh(false);
        org.elasticsearch.index.VersionType versionType7 = deleteRequest4.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.versionType(versionType7);
        java.lang.String str9 = deleteRequest8.type();
        java.lang.String str10 = deleteRequest8.type();
        org.elasticsearch.common.io.stream.StreamInput streamInput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest8.readFrom(streamInput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(versionType7);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "", "delete {[][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.id("delete {[null][null][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.type("");
        org.elasticsearch.index.VersionType versionType10 = deleteRequest7.versionType();
        org.elasticsearch.tasks.TaskId taskId11 = deleteRequest7.getParentTask();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[null][null][delete {[null][null][null]}]}", deleteRequest7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(versionType10);
        org.junit.Assert.assertNotNull(taskId11);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.refresh(true);
        java.lang.String[] strArray6 = deleteRequest3.indices();
        java.lang.String str7 = deleteRequest3.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest12.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest14.refresh(true);
        org.elasticsearch.tasks.TaskId taskId17 = deleteRequest14.getParentTask();
        org.elasticsearch.tasks.Task task18 = deleteRequest3.createTask(100L, "delete {[null][null][null]}", "delete {[null][null][null]}", taskId17);
        java.lang.String str19 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest20.refresh(false);
        org.elasticsearch.index.VersionType versionType23 = deleteRequest20.versionType();
        java.lang.String str24 = deleteRequest20.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest20.index("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue27 = deleteRequest26.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest3.timeout(timeValue27);
        long long29 = deleteRequest3.primaryTerm();
        java.lang.String str30 = deleteRequest3.getDescription();
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "delete {[][null][null]}" + "'", str7, "delete {[][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(taskId17);
        org.junit.Assert.assertNotNull(task18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertNotNull(versionType23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNotNull(timeValue27);
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "delete {[][null][null]}" + "'", str30, "delete {[][null][null]}");
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.VersionType versionType3 = deleteRequest0.versionType();
        java.lang.String str4 = deleteRequest0.type();
        java.lang.String str5 = deleteRequest0.getDescription();
        org.elasticsearch.index.shard.IndexShard indexShard6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult7 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest0, indexShard6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "delete {[null][null][null]}" + "'", str5, "delete {[null][null][null]}");
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.refresh(false);
        org.elasticsearch.index.VersionType versionType7 = deleteRequest4.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.versionType(versionType7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.refresh(true);
        long long11 = deleteRequest3.seqNo();
        org.elasticsearch.common.transport.TransportAddress transportAddress12 = deleteRequest3.remoteAddress();
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(versionType7);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(transportAddress12);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "delete {[null][hi!][null]}", "hi!");
        long long4 = deleteRequest3.seqNo();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.VersionType versionType3 = deleteRequest0.versionType();
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest0.timeout();
        org.elasticsearch.index.shard.IndexShard indexShard5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete6 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest0, indexShard5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNotNull(timeValue4);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        boolean boolean3 = deleteRequest0.getShouldPersistResult();
        org.elasticsearch.tasks.TaskId taskId4 = null;
        deleteRequest0.setParentTask(taskId4);
        long long6 = deleteRequest0.primaryTerm();
        boolean boolean7 = deleteRequest0.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue12 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.timeout(timeValue12);
        org.elasticsearch.common.transport.TransportAddress transportAddress14 = null;
        deleteRequest11.remoteAddress(transportAddress14);
        java.lang.String str16 = deleteRequest11.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest11.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest11.version((long) (byte) 1);
        org.elasticsearch.common.unit.TimeValue timeValue21 = deleteRequest11.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest0.timeout(timeValue21);
        org.elasticsearch.common.io.stream.StreamInput streamInput23 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.readFrom(streamInput23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(timeValue12);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(timeValue21);
        org.junit.Assert.assertNotNull(deleteRequest22);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.routing("");
        boolean boolean5 = deleteRequest4.refresh();
        org.elasticsearch.common.io.stream.StreamInput streamInput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest4.readFrom(streamInput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException1 = deleteRequest0.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId9 = deleteRequest8.shardId();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest8.consistencyLevel(writeConsistencyLevel10);
        java.lang.String str12 = deleteRequest11.routing();
        org.elasticsearch.index.VersionType versionType13 = deleteRequest11.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest3.versionType(versionType13);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel15 = deleteRequest14.consistencyLevel();
        java.lang.String str16 = deleteRequest14.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest14.routing("delete {[][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest19.setParentTask("hi!", 10L);
        java.lang.String[] strArray23 = deleteRequest19.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel24 = deleteRequest19.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest18.consistencyLevel(writeConsistencyLevel24);
        long long26 = deleteRequest18.version();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput27 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest18.writeTo(streamOutput27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(actionRequestValidationException1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNull(shardId9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(versionType13);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel15 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel15.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel24 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel24.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-3L) + "'", long26 == (-3L));
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue7 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.timeout(timeValue7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest2.timeout(timeValue7);
        java.lang.String str10 = deleteRequest9.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest9.parent("");
        java.lang.Class<?> wildcardClass13 = deleteRequest9.getClass();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(timeValue7);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        boolean boolean4 = deleteRequest3.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue7 = deleteRequest6.timeout();
        java.lang.Class<?> wildcardClass8 = timeValue7.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(timeValue7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        java.lang.String str2 = deleteRequest0.id();
        long long3 = deleteRequest0.primaryTerm();
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.setShardId(shardId4);
        java.lang.String[] strArray6 = deleteRequest5.indices();
        deleteRequest5.primaryTerm((long) (short) 1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue13 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest12.timeout(timeValue13);
        org.elasticsearch.common.transport.TransportAddress transportAddress15 = deleteRequest12.remoteAddress();
        boolean boolean16 = deleteRequest12.getShouldPersistResult();
        java.lang.String str17 = deleteRequest12.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest12.type("delete {[null][null][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue24 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest23.timeout(timeValue24);
        org.elasticsearch.common.transport.TransportAddress transportAddress26 = null;
        deleteRequest23.remoteAddress(transportAddress26);
        java.lang.String str28 = deleteRequest23.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest23.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest30.index("delete {[null][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException34 = deleteRequest33.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest36 = deleteRequest33.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue37 = deleteRequest36.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest39 = deleteRequest36.routing("");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel40 = deleteRequest36.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest41 = deleteRequest30.consistencyLevel(writeConsistencyLevel40);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest42 = deleteRequest12.consistencyLevel(writeConsistencyLevel40);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest43 = deleteRequest5.consistencyLevel(writeConsistencyLevel40);
        java.lang.Class<?> wildcardClass44 = writeConsistencyLevel40.getClass();
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(timeValue13);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNull(transportAddress15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(timeValue24);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertNotNull(actionRequestValidationException34);
        org.junit.Assert.assertNotNull(deleteRequest36);
        org.junit.Assert.assertNotNull(timeValue37);
        org.junit.Assert.assertNotNull(deleteRequest39);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel40 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel40.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest41);
        org.junit.Assert.assertNotNull(deleteRequest42);
        org.junit.Assert.assertNotNull(deleteRequest43);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.id("delete {[delete {[][][hi!]}][][delete {[][null][null]}]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[null][null][delete {[null][null][null]}]}", deleteRequest7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = deleteRequest0.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest0.routing("delete {[null][][null]}");
        deleteRequest6.seqNo((long) (byte) 0);
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel4 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel4.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest6);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        java.lang.String[] strArray4 = deleteRequest0.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = deleteRequest0.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.type("hi!");
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = null;
        deleteRequest0.remoteAddress(transportAddress8);
        org.elasticsearch.index.shard.ShardId shardId10 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest0.setShardId(shardId10);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest0.timeout("delete {[delete {[null][null][null]}][null][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[delete {[null][null][null]}][null][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel5 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel5.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest11);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        boolean boolean4 = deleteRequest3.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue7 = deleteRequest6.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.refresh(true);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest6.version((long) (byte) 0);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest6.id("delete {[null][hi!][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest6.version((long) 1);
        java.lang.Class<?> wildcardClass16 = deleteRequest15.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(timeValue7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest3.remoteAddress(transportAddress6);
        java.lang.String str8 = deleteRequest3.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.index("delete {[null][null][null]}");
        java.lang.String str13 = deleteRequest10.toString();
        deleteRequest10.setParentTask("delete {[delete {[null][null][null]}][][]}", (long) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest10.timeout("delete {[null][null][delete {[null][null][null]}]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[null][null][delete {[null][null][null]}]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "delete {[delete {[null][null][null]}][][]}" + "'", str13, "delete {[delete {[null][null][null]}][][]}");
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest3.remoteAddress(transportAddress6);
        java.lang.String str8 = deleteRequest3.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.id("");
        java.lang.String str11 = deleteRequest10.routing();
        java.lang.String str12 = deleteRequest10.parent();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest10.writeTo(streamOutput13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[null][null][null]}");
        org.elasticsearch.index.shard.IndexShard indexShard4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult5 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest3, indexShard4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId3 = deleteRequest2.shardId();
        deleteRequest2.setParentTask("delete {[][null][null]}", 0L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest2.routing("delete {[delete {[][null][null]}][hi!][null]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress9 = null;
        deleteRequest8.remoteAddress(transportAddress9);
        deleteRequest8.primaryTerm(1L);
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(shardId3);
        org.junit.Assert.assertNotNull(deleteRequest8);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        java.lang.String[] strArray4 = deleteRequest0.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest5.setParentTask("hi!", 10L);
        java.lang.String[] strArray9 = deleteRequest5.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = deleteRequest5.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest0.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel12 = deleteRequest0.consistencyLevel();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException13 = deleteRequest0.validate();
        org.elasticsearch.index.shard.IndexShard indexShard14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult15 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest0, indexShard14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel12 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel12.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(actionRequestValidationException13);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.elasticsearch.action.support.replication.ReplicationTask replicationTask0 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.setPhase(replicationTask0, "delete {[hi!][null][hi!]}");
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.routing("hi!");
        deleteRequest1.setParentTask("hi!", (long) (short) -1);
        long long7 = deleteRequest1.seqNo();
        org.elasticsearch.index.shard.IndexShard indexShard8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult9 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest1, indexShard8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        java.lang.String[] strArray4 = deleteRequest0.indices();
        java.lang.String[] strArray5 = deleteRequest0.indices();
        org.elasticsearch.index.VersionType versionType6 = deleteRequest0.versionType();
        java.lang.String str7 = deleteRequest0.type();
        deleteRequest0.seqNo((long) (byte) -1);
        org.elasticsearch.index.shard.IndexShard indexShard10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete11 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest0, indexShard10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(versionType6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.index("");
        long long7 = deleteRequest4.primaryTerm();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException8 = deleteRequest4.validate();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest4.writeTo(streamOutput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(actionRequestValidationException8);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        deleteRequest2.setParentTask("hi!", (long) (byte) 100);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException7 = deleteRequest6.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue10 = deleteRequest9.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest9.routing("");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel13 = deleteRequest9.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest2.consistencyLevel(writeConsistencyLevel13);
        long long15 = deleteRequest14.seqNo();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(actionRequestValidationException7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(timeValue10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel13 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel13.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.VersionType versionType3 = deleteRequest0.versionType();
        java.lang.String str4 = deleteRequest0.type();
        java.lang.String str5 = deleteRequest0.getDescription();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.refresh(false);
        long long10 = deleteRequest7.primaryTerm();
        java.lang.String[] strArray11 = deleteRequest7.indices();
        java.lang.Class<?> wildcardClass12 = strArray11.getClass();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "delete {[null][null][null]}" + "'", str5, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest0.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest0.version((long) ' ');
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = deleteRequest0.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest0.routing("delete {[][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest0.id("delete {[][null][null]}");
        java.lang.String str12 = deleteRequest0.toString();
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel7 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel7.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "delete {[null][null][delete {[][null][null]}]}" + "'", str12, "delete {[null][null][delete {[][null][null]}]}");
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.refresh(false);
        org.elasticsearch.index.VersionType versionType7 = deleteRequest4.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.versionType(versionType7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.refresh(true);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.type("hi!");
        org.elasticsearch.common.transport.TransportAddress transportAddress13 = null;
        deleteRequest10.remoteAddress(transportAddress13);
        java.lang.String str15 = deleteRequest10.getDescription();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput16 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest10.writeTo(streamOutput16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(versionType7);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "delete {[null][hi!][null]}" + "'", str15, "delete {[null][hi!][null]}");
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "", "delete {[][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.parent("delete {[null][null][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException7 = deleteRequest6.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue10 = deleteRequest9.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest9.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions14 = deleteRequest13.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest13.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest17.refresh(false);
        org.elasticsearch.index.VersionType versionType20 = deleteRequest17.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest16.versionType(versionType20);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest16.refresh(true);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest23.type("hi!");
        org.elasticsearch.common.transport.TransportAddress transportAddress26 = null;
        deleteRequest23.remoteAddress(transportAddress26);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest28.setParentTask("hi!", 10L);
        java.lang.String[] strArray32 = deleteRequest28.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel33 = deleteRequest28.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = deleteRequest23.consistencyLevel(writeConsistencyLevel33);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = deleteRequest9.consistencyLevel(writeConsistencyLevel33);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest36 = deleteRequest3.consistencyLevel(writeConsistencyLevel33);
        org.elasticsearch.index.VersionType versionType37 = deleteRequest36.versionType();
        deleteRequest36.setParentTask("delete {[delete {[][][]}][null][null]}", 1L);
        java.lang.String str41 = deleteRequest36.getDescription();
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(actionRequestValidationException7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(timeValue10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(indicesOptions14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(versionType20);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel33 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel33.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest34);
        org.junit.Assert.assertNotNull(deleteRequest35);
        org.junit.Assert.assertNotNull(deleteRequest36);
        org.junit.Assert.assertNotNull(versionType37);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "delete {[hi!][][delete {[][null][null]}]}" + "'", str41, "delete {[hi!][][delete {[][null][null]}]}");
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask((long) ' ', "delete {[null][null][null]}", "delete {[null][null][null]}", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.id("hi!");
        org.elasticsearch.index.VersionType versionType11 = deleteRequest10.versionType();
        org.elasticsearch.common.transport.TransportAddress transportAddress12 = null;
        deleteRequest10.remoteAddress(transportAddress12);
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(versionType11);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[null][null][null]}][][]}", "hi!", "delete {[][][hi!]}");
        long long4 = deleteRequest3.seqNo();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        long long3 = deleteRequest0.seqNo();
        java.lang.String str4 = deleteRequest0.toString();
        org.elasticsearch.common.transport.TransportAddress transportAddress5 = deleteRequest0.remoteAddress();
        java.lang.String str6 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest7.setParentTask("hi!", 10L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException12 = deleteRequest11.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest11.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue15 = deleteRequest14.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest7.timeout(timeValue15);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest17.refresh(false);
        org.elasticsearch.tasks.TaskId taskId20 = deleteRequest19.getParentTask();
        deleteRequest7.setParentTask(taskId20);
        deleteRequest0.setParentTask(taskId20);
        org.elasticsearch.common.io.stream.StreamInput streamInput23 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.readFrom(streamInput23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[null][null][null]}" + "'", str4, "delete {[null][null][null]}");
        org.junit.Assert.assertNull(transportAddress5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(actionRequestValidationException12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(timeValue15);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(taskId20);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.refresh(true);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.index("delete {[null][null][null]}");
        boolean boolean8 = deleteRequest5.refresh();
        java.lang.String str9 = deleteRequest5.index();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException10 = deleteRequest5.validate();
        java.lang.Class<?> wildcardClass11 = actionRequestValidationException10.getClass();
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "delete {[null][null][null]}" + "'", str9, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(actionRequestValidationException10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.refresh(false);
        org.elasticsearch.index.VersionType versionType7 = deleteRequest4.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.versionType(versionType7);
        boolean boolean9 = deleteRequest3.refresh();
        java.lang.String str10 = deleteRequest3.parent();
        org.elasticsearch.common.io.stream.StreamInput streamInput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.readFrom(streamInput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(versionType7);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        boolean boolean3 = deleteRequest0.getShouldPersistResult();
        org.elasticsearch.tasks.TaskId taskId4 = null;
        deleteRequest0.setParentTask(taskId4);
        java.lang.String str6 = deleteRequest0.parent();
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest0.setShardId(shardId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest9.setParentTask("hi!", 10L);
        java.lang.String str13 = deleteRequest9.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest17.refresh(false);
        org.elasticsearch.tasks.TaskId taskId20 = deleteRequest19.getParentTask();
        org.elasticsearch.tasks.Task task21 = deleteRequest9.createTask((long) (-1), "", "hi!", taskId20);
        org.elasticsearch.tasks.TaskId taskId22 = deleteRequest9.getParentTask();
        deleteRequest8.setParentTask(taskId22);
        deleteRequest8.setParentTask("delete {[null][null][delete {[][null][null]}]}", (long) '#');
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "delete {[null][null][null]}" + "'", str13, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(taskId20);
        org.junit.Assert.assertNotNull(task21);
        org.junit.Assert.assertNotNull(taskId22);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.refresh(false);
        org.elasticsearch.index.VersionType versionType7 = deleteRequest4.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.versionType(versionType7);
        long long9 = deleteRequest3.version();
        long long10 = deleteRequest3.seqNo();
        java.lang.String str11 = deleteRequest3.routing();
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(versionType7);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-3L) + "'", long9 == (-3L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.elasticsearch.action.support.replication.ReplicationTask replicationTask0 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.setPhase(replicationTask0, "delete {[delete {[null][null][null]}][null][null]}");
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        deleteRequest1.seqNo(1L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest1.id("delete {[null][][null]}");
        org.elasticsearch.index.shard.IndexShard indexShard6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult7 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest5, indexShard6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest3.remoteAddress(transportAddress6);
        java.lang.String str8 = deleteRequest3.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.id("");
        long long11 = deleteRequest3.version();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest3.id("delete {[delete {[][null][null]}][hi!][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions15 = deleteRequest14.indicesOptions();
        java.lang.String str16 = deleteRequest14.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest17.setParentTask("hi!", 10L);
        java.lang.String[] strArray21 = deleteRequest17.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel22 = deleteRequest17.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest14.consistencyLevel(writeConsistencyLevel22);
        org.elasticsearch.index.shard.ShardId shardId24 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest23.setShardId(shardId24);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel26 = deleteRequest23.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest3.consistencyLevel(writeConsistencyLevel26);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException28 = deleteRequest27.validate();
        org.elasticsearch.index.shard.ShardId shardId29 = deleteRequest27.shardId();
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-3L) + "'", long11 == (-3L));
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(indicesOptions15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel22 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel22.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel26 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel26.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertNull(actionRequestValidationException28);
        org.junit.Assert.assertNull(shardId29);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        java.lang.String str4 = deleteRequest0.toString();
        org.elasticsearch.common.unit.TimeValue timeValue5 = deleteRequest0.timeout();
        java.lang.String str6 = deleteRequest0.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.refresh(false);
        org.elasticsearch.index.VersionType versionType10 = deleteRequest7.versionType();
        java.lang.String str11 = deleteRequest7.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest7.index("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions15 = deleteRequest14.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest14.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest18.refresh(false);
        org.elasticsearch.index.VersionType versionType21 = deleteRequest18.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest17.versionType(versionType21);
        deleteRequest22.seqNo((long) (byte) -1);
        org.elasticsearch.tasks.TaskId taskId25 = deleteRequest22.getParentTask();
        deleteRequest13.setParentTask(taskId25);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest13.routing("delete {[][][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest29.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest31.type("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue34 = deleteRequest31.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = deleteRequest28.timeout(timeValue34);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest36 = deleteRequest0.timeout(timeValue34);
        java.lang.Class<?> wildcardClass37 = timeValue34.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[null][null][null]}" + "'", str4, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(timeValue5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(versionType10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(indicesOptions15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(versionType21);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertNotNull(taskId25);
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertNotNull(timeValue34);
        org.junit.Assert.assertNotNull(deleteRequest35);
        org.junit.Assert.assertNotNull(deleteRequest36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.type("hi!");
        org.elasticsearch.tasks.TaskId taskId5 = deleteRequest4.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest4.parent("delete {[null][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.routing("");
        java.lang.String str10 = deleteRequest9.id();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(taskId5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        java.lang.String str2 = deleteRequest0.id();
        long long3 = deleteRequest0.primaryTerm();
        java.lang.String str4 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.routing("delete {[][][hi!]}");
        org.elasticsearch.common.io.stream.StreamOutput streamOutput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest6.writeTo(streamOutput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest8);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException3 = deleteRequest2.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure5 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "", (java.lang.Throwable) actionRequestValidationException3, "hi!");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = shardFailure5.routing;
        java.lang.String str7 = shardFailure5.reason;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = shardFailure5.routing;
        org.junit.Assert.assertNotNull(actionRequestValidationException3);
        org.junit.Assert.assertNull(shardRouting6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(shardRouting8);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[null][hi!][null]}", "");
        deleteRequest3.seqNo((long) 0);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = deleteRequest3.remoteAddress();
        boolean boolean7 = deleteRequest3.getShouldPersistResult();
        java.lang.String str8 = deleteRequest3.id();
        org.elasticsearch.common.transport.TransportAddress transportAddress9 = deleteRequest3.remoteAddress();
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(transportAddress6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(transportAddress9);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.VersionType versionType3 = deleteRequest0.versionType();
        java.lang.String str4 = deleteRequest0.type();
        java.lang.String str5 = deleteRequest0.getDescription();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.refresh(false);
        long long10 = deleteRequest7.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest7.version((long) (short) 0);
        java.lang.String str13 = deleteRequest7.index();
        java.lang.String str14 = deleteRequest7.type();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "delete {[null][null][null]}" + "'", str5, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        deleteRequest2.setParentTask("hi!", (long) (byte) 100);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest2.parent("delete {[null][hi!][null]}");
        org.elasticsearch.index.shard.ShardId shardId8 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest2.setShardId(shardId8);
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest0.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest0.version((long) ' ');
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = deleteRequest0.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest0.routing("delete {[][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest0.id("delete {[][null][null]}");
        java.lang.String str12 = deleteRequest0.routing();
        long long13 = deleteRequest0.seqNo();
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel7 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel7.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "delete {[][null][null]}" + "'", str12, "delete {[][null][null]}");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.refresh(false);
        org.elasticsearch.index.VersionType versionType7 = deleteRequest4.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.versionType(versionType7);
        java.lang.String str9 = deleteRequest8.type();
        java.lang.String str10 = deleteRequest8.type();
        org.elasticsearch.index.shard.ShardId shardId11 = deleteRequest8.shardId();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest8.writeTo(streamOutput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(versionType7);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(shardId11);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue6 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.timeout(timeValue6);
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = null;
        deleteRequest5.remoteAddress(transportAddress8);
        java.lang.String str10 = deleteRequest5.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest5.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest5.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest18.setParentTask("hi!", 10L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException23 = deleteRequest22.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest22.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue26 = deleteRequest25.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest18.timeout(timeValue26);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest28.refresh(false);
        org.elasticsearch.tasks.TaskId taskId31 = deleteRequest30.getParentTask();
        deleteRequest18.setParentTask(taskId31);
        org.elasticsearch.tasks.Task task33 = deleteRequest14.createTask(0L, "delete {[][null][null]}", "", taskId31);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = deleteRequest14.parent("delete {[delete {[null][null][null]}][][]}");
        java.lang.String str36 = deleteRequest35.parent();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException37 = deleteRequest35.validate();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "hi!", deleteRequest35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(actionRequestValidationException23);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(timeValue26);
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertNotNull(taskId31);
        org.junit.Assert.assertNotNull(task33);
        org.junit.Assert.assertNotNull(deleteRequest35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "delete {[delete {[null][null][null]}][][]}" + "'", str36, "delete {[delete {[null][null][null]}][][]}");
        org.junit.Assert.assertNull(actionRequestValidationException37);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        long long3 = deleteRequest0.seqNo();
        java.lang.String str4 = deleteRequest0.toString();
        java.lang.String str5 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.refresh(false);
        boolean boolean11 = deleteRequest8.getShouldPersistResult();
        org.elasticsearch.tasks.TaskId taskId12 = null;
        deleteRequest8.setParentTask(taskId12);
        java.lang.String str14 = deleteRequest8.parent();
        org.elasticsearch.index.shard.ShardId shardId15 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest8.setShardId(shardId15);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest16.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue19 = deleteRequest16.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest7.timeout(timeValue19);
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[null][null][null]}" + "'", str4, "delete {[null][null][null]}");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(timeValue19);
        org.junit.Assert.assertNotNull(deleteRequest20);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest1.id("delete {[null][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.refresh(false);
        java.lang.String[] strArray8 = deleteRequest5.indices();
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.parent("");
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest0.remoteAddress(transportAddress6);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest0.refresh(true);
        long long10 = deleteRequest9.version();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest9.version((long) 10);
        org.elasticsearch.index.shard.IndexShard indexShard13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult14 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest12, indexShard13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-3L) + "'", long10 == (-3L));
        org.junit.Assert.assertNotNull(deleteRequest12);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}", "delete {[null][null][null]}", "");
        long long4 = deleteRequest3.seqNo();
        org.elasticsearch.index.shard.IndexShard indexShard5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult6 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest3, indexShard5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel3 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.consistencyLevel(writeConsistencyLevel3);
        java.lang.Class<?> wildcardClass5 = deleteRequest2.getClass();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        boolean boolean4 = deleteRequest3.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue7 = deleteRequest6.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.refresh(true);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest6.version((long) (byte) 0);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest6.id("delete {[null][hi!][null]}");
        deleteRequest13.seqNo((-1L));
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest13.timeout("delete {[delete {[null][null][null]}][null][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[delete {[null][null][null]}][null][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(timeValue7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest2.setParentTask("hi!", 10L);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException6 = deleteRequest2.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure8 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[][null][null]}", (java.lang.Throwable) actionRequestValidationException6, "delete {[null][null][null]}");
        java.lang.Throwable throwable9 = shardFailure8.cause;
        java.lang.Class<?> wildcardClass10 = throwable9.getClass();
        org.junit.Assert.assertNotNull(actionRequestValidationException6);
        org.junit.Assert.assertNotNull(throwable9);
        org.junit.Assert.assertEquals(throwable9.getLocalizedMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable9.getMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable9.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException1 = deleteRequest0.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId9 = deleteRequest8.shardId();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest8.consistencyLevel(writeConsistencyLevel10);
        java.lang.String str12 = deleteRequest11.routing();
        org.elasticsearch.index.VersionType versionType13 = deleteRequest11.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest3.versionType(versionType13);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel15 = deleteRequest14.consistencyLevel();
        java.lang.String str16 = deleteRequest14.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest14.routing("delete {[][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest19.setParentTask("hi!", 10L);
        java.lang.String[] strArray23 = deleteRequest19.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel24 = deleteRequest19.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest18.consistencyLevel(writeConsistencyLevel24);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException26 = deleteRequest18.validate();
        java.lang.String str27 = deleteRequest18.getDescription();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput28 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest18.writeTo(streamOutput28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(actionRequestValidationException1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNull(shardId9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(versionType13);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel15 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel15.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel24 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel24.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(actionRequestValidationException26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "delete {[null][null][null]}" + "'", str27, "delete {[null][null][null]}");
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        boolean boolean6 = deleteRequest5.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest5.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue9 = deleteRequest8.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest8.refresh(true);
        org.elasticsearch.tasks.TaskId taskId12 = deleteRequest8.getParentTask();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[null][][null]}", deleteRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(timeValue9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(taskId12);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue7 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.timeout(timeValue7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest2.timeout(timeValue7);
        java.lang.String str10 = deleteRequest9.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest9.id("delete {[null][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions14 = deleteRequest13.indicesOptions();
        java.lang.String str15 = deleteRequest13.id();
        long long16 = deleteRequest13.primaryTerm();
        java.lang.String str17 = deleteRequest13.routing();
        java.lang.String str18 = deleteRequest13.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException23 = deleteRequest22.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException25 = deleteRequest24.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest24.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue28 = deleteRequest27.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest22.timeout(timeValue28);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest36 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.tasks.TaskId taskId40 = null;
        org.elasticsearch.tasks.Task task41 = deleteRequest36.createTask((long) ' ', "delete {[null][null][null]}", "delete {[null][null][null]}", taskId40);
        org.elasticsearch.tasks.TaskId taskId42 = deleteRequest36.getParentTask();
        org.elasticsearch.tasks.Task task43 = deleteRequest29.createTask((long) 1, "delete {[][null][null]}", "delete {[delete {[][null][null]}][hi!][null]}", taskId42);
        org.elasticsearch.tasks.Task task44 = deleteRequest13.createTask((long) ' ', "delete {[null][null][null]}", "", taskId42);
        deleteRequest12.setParentTask(taskId42);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException46 = deleteRequest12.validate();
        long long47 = deleteRequest12.seqNo();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(timeValue7);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(indicesOptions14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "delete {[null][null][null]}" + "'", str18, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(actionRequestValidationException23);
        org.junit.Assert.assertNotNull(actionRequestValidationException25);
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertNotNull(timeValue28);
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertNotNull(task41);
        org.junit.Assert.assertNotNull(taskId42);
        org.junit.Assert.assertNotNull(task43);
        org.junit.Assert.assertNotNull(task44);
        org.junit.Assert.assertNotNull(actionRequestValidationException46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.refresh(true);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException7 = deleteRequest6.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue10 = deleteRequest9.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest5.timeout(timeValue10);
        org.elasticsearch.action.support.IndicesOptions indicesOptions12 = deleteRequest5.indicesOptions();
        org.elasticsearch.common.unit.TimeValue timeValue13 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest5.timeout(timeValue13);
        org.elasticsearch.index.shard.IndexShard indexShard15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult16 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest5, indexShard15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(actionRequestValidationException7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(timeValue10);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(indicesOptions12);
        org.junit.Assert.assertNotNull(deleteRequest14);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException3 = deleteRequest2.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException5 = deleteRequest4.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest4.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue8 = deleteRequest7.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest2.timeout(timeValue8);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId13 = deleteRequest12.shardId();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel14 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest12.consistencyLevel(writeConsistencyLevel14);
        org.elasticsearch.action.support.IndicesOptions indicesOptions16 = deleteRequest12.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException18 = deleteRequest17.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest17.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue21 = deleteRequest20.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest20.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest24.setParentTask("hi!", 10L);
        java.lang.String[] strArray28 = deleteRequest24.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest29.setParentTask("hi!", 10L);
        java.lang.String[] strArray33 = deleteRequest29.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel34 = deleteRequest29.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = deleteRequest24.consistencyLevel(writeConsistencyLevel34);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest36 = deleteRequest23.consistencyLevel(writeConsistencyLevel34);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest37 = deleteRequest12.consistencyLevel(writeConsistencyLevel34);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest38 = deleteRequest2.consistencyLevel(writeConsistencyLevel34);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[delete {[][][hi!]}][][delete {[][null][null]}]}", deleteRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(actionRequestValidationException3);
        org.junit.Assert.assertNotNull(actionRequestValidationException5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNull(shardId13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(indicesOptions16);
        org.junit.Assert.assertNotNull(actionRequestValidationException18);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(timeValue21);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel34 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel34.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest35);
        org.junit.Assert.assertNotNull(deleteRequest36);
        org.junit.Assert.assertNotNull(deleteRequest37);
        org.junit.Assert.assertNotNull(deleteRequest38);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest2.setParentTask("hi!", 10L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest2.id("delete {[null][null][null]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[delete {[delete {[][null][null]}][hi!][null]}][null][null]}", deleteRequest7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest7);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        java.lang.String[] strArray4 = deleteRequest0.indices();
        java.lang.String[] strArray5 = deleteRequest0.indices();
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = deleteRequest0.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest0.id("delete {[][null][null]}");
        java.lang.String str9 = deleteRequest8.getDescription();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNull(transportAddress6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "delete {[null][null][delete {[][null][null]}]}" + "'", str9, "delete {[null][null][delete {[][null][null]}]}");
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][delete {[null][null][null]}]}");
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.refresh(false);
        org.elasticsearch.index.VersionType versionType7 = deleteRequest4.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.versionType(versionType7);
        boolean boolean9 = deleteRequest3.refresh();
        java.lang.String str10 = deleteRequest3.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest3.timeout("delete {[][null][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[][null][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(versionType7);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest3.remoteAddress(transportAddress6);
        java.lang.String str8 = deleteRequest3.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.id("");
        long long11 = deleteRequest3.version();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest3.id("delete {[delete {[][null][null]}][hi!][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions15 = deleteRequest14.indicesOptions();
        java.lang.String str16 = deleteRequest14.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest17.setParentTask("hi!", 10L);
        java.lang.String[] strArray21 = deleteRequest17.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel22 = deleteRequest17.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest14.consistencyLevel(writeConsistencyLevel22);
        org.elasticsearch.index.shard.ShardId shardId24 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest23.setShardId(shardId24);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel26 = deleteRequest23.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest3.consistencyLevel(writeConsistencyLevel26);
        org.elasticsearch.common.io.stream.StreamInput streamInput28 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.readFrom(streamInput28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-3L) + "'", long11 == (-3L));
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(indicesOptions15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel22 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel22.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel26 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel26.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest27);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = deleteRequest3.remoteAddress();
        boolean boolean7 = deleteRequest3.getShouldPersistResult();
        java.lang.String str8 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.type("delete {[null][null][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue15 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest14.timeout(timeValue15);
        org.elasticsearch.common.transport.TransportAddress transportAddress17 = null;
        deleteRequest14.remoteAddress(transportAddress17);
        java.lang.String str19 = deleteRequest14.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest14.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest21.index("delete {[null][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException25 = deleteRequest24.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest24.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue28 = deleteRequest27.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest27.routing("");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel31 = deleteRequest27.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest21.consistencyLevel(writeConsistencyLevel31);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest3.consistencyLevel(writeConsistencyLevel31);
        deleteRequest3.primaryTerm((-1L));
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(transportAddress6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(timeValue15);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(actionRequestValidationException25);
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertNotNull(timeValue28);
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel31 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel31.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertNotNull(deleteRequest33);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        boolean boolean3 = deleteRequest0.getShouldPersistResult();
        org.elasticsearch.tasks.TaskId taskId4 = null;
        deleteRequest0.setParentTask(taskId4);
        deleteRequest0.seqNo((long) 100);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}", "delete {[null][null][null]}", "");
        org.elasticsearch.action.support.IndicesOptions indicesOptions12 = deleteRequest11.indicesOptions();
        org.elasticsearch.index.shard.ShardId shardId13 = deleteRequest11.shardId();
        org.elasticsearch.index.VersionType versionType14 = deleteRequest11.versionType();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel15 = deleteRequest11.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest0.consistencyLevel(writeConsistencyLevel15);
        org.elasticsearch.common.transport.TransportAddress transportAddress17 = deleteRequest0.remoteAddress();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(indicesOptions12);
        org.junit.Assert.assertNull(shardId13);
        org.junit.Assert.assertNotNull(versionType14);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel15 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel15.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNull(transportAddress17);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = deleteRequest0.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest0.type("delete {[delete {[][null][null]}][hi!][null]}");
        org.elasticsearch.tasks.TaskId taskId7 = deleteRequest6.getParentTask();
        org.elasticsearch.index.shard.IndexShard indexShard8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete9 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest6, indexShard8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNull(transportAddress4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(taskId7);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException5 = deleteRequest4.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest4.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue8 = deleteRequest7.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest0.timeout(timeValue8);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.refresh(false);
        org.elasticsearch.tasks.TaskId taskId13 = deleteRequest12.getParentTask();
        deleteRequest0.setParentTask(taskId13);
        java.lang.String str15 = deleteRequest0.routing();
        org.elasticsearch.index.shard.IndexShard indexShard16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult17 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest0, indexShard16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(actionRequestValidationException5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(taskId13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest2.setParentTask("hi!", 10L);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException6 = deleteRequest2.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure8 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[][null][null]}", (java.lang.Throwable) actionRequestValidationException6, "delete {[null][null][null]}");
        java.lang.String str9 = shardFailure8.indexUUID;
        java.lang.String str10 = shardFailure8.indexUUID;
        org.junit.Assert.assertNotNull(actionRequestValidationException6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "delete {[null][null][null]}" + "'", str9, "delete {[null][null][null]}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "delete {[null][null][null]}" + "'", str10, "delete {[null][null][null]}");
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        java.lang.String[] strArray4 = deleteRequest0.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = deleteRequest0.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.type("hi!");
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = null;
        deleteRequest0.remoteAddress(transportAddress8);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        boolean boolean14 = deleteRequest13.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest13.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest17.setParentTask("hi!", 10L);
        java.lang.String[] strArray21 = deleteRequest17.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel22 = deleteRequest17.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest16.consistencyLevel(writeConsistencyLevel22);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest0.consistencyLevel(writeConsistencyLevel22);
        org.elasticsearch.index.shard.ShardId shardId25 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest0.setShardId(shardId25);
        long long27 = deleteRequest0.primaryTerm();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel5 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel5.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel22 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel22.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException1 = deleteRequest0.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException3 = deleteRequest2.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue6 = deleteRequest5.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.timeout(timeValue6);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest0.index("hi!");
        java.lang.String[] strArray10 = deleteRequest0.indices();
        java.lang.String str11 = deleteRequest0.parent();
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest0.setShardId(shardId12);
        org.elasticsearch.common.io.stream.StreamInput streamInput14 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest13.readFrom(streamInput14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(actionRequestValidationException1);
        org.junit.Assert.assertNotNull(actionRequestValidationException3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(deleteRequest13);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException1 = deleteRequest0.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest3.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest7.setParentTask("hi!", 10L);
        java.lang.String[] strArray11 = deleteRequest7.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest12.setParentTask("hi!", 10L);
        java.lang.String[] strArray16 = deleteRequest12.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel17 = deleteRequest12.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest7.consistencyLevel(writeConsistencyLevel17);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest6.consistencyLevel(writeConsistencyLevel17);
        boolean boolean20 = deleteRequest19.getShouldPersistResult();
        java.lang.String str21 = deleteRequest19.getDescription();
        deleteRequest19.primaryTerm((-3L));
        org.elasticsearch.common.unit.TimeValue timeValue24 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest19.timeout(timeValue24);
        java.lang.String str26 = deleteRequest25.id();
        org.elasticsearch.index.shard.ShardId shardId27 = deleteRequest25.shardId();
        org.junit.Assert.assertNotNull(actionRequestValidationException1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel17 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel17.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "delete {[null][null][null]}" + "'", str21, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(timeValue24);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(shardId27);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.refresh(false);
        boolean boolean5 = deleteRequest2.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue10 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.timeout(timeValue10);
        org.elasticsearch.common.transport.TransportAddress transportAddress12 = null;
        deleteRequest9.remoteAddress(transportAddress12);
        java.lang.String str14 = deleteRequest9.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest9.parent("hi!");
        org.elasticsearch.index.VersionType versionType17 = deleteRequest9.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest2.versionType(versionType17);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException19 = deleteRequest2.validate();
        deleteRequest2.seqNo((long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[null][][null]}", deleteRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(timeValue10);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(versionType17);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(actionRequestValidationException19);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest3.remoteAddress(transportAddress6);
        java.lang.String str8 = deleteRequest3.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.id("");
        java.lang.String str11 = deleteRequest10.routing();
        java.lang.String str12 = deleteRequest10.parent();
        org.elasticsearch.index.VersionType versionType13 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest10.versionType(versionType13);
        java.lang.String str15 = deleteRequest10.routing();
        java.lang.String str16 = deleteRequest10.id();
        org.elasticsearch.common.io.stream.StreamInput streamInput17 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest10.readFrom(streamInput17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest0.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest0.version((long) ' ');
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = deleteRequest0.consistencyLevel();
        long long8 = deleteRequest0.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest0.type("hi!");
        java.lang.String str11 = deleteRequest10.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest10.id("delete {[delete {[null][null][null]}][null][null]}");
        org.elasticsearch.index.shard.IndexShard indexShard14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult15 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest13, indexShard14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel7 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel7.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(deleteRequest13);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        long long3 = deleteRequest0.seqNo();
        java.lang.String str4 = deleteRequest0.toString();
        org.elasticsearch.tasks.TaskId taskId5 = deleteRequest0.getParentTask();
        java.lang.String str6 = deleteRequest0.type();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[null][null][null]}" + "'", str4, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(taskId5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        java.lang.String str4 = deleteRequest3.type();
        org.elasticsearch.common.io.stream.StreamInput streamInput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.readFrom(streamInput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.getDescription();
        org.elasticsearch.index.shard.ShardId shardId2 = deleteRequest0.shardId();
        boolean boolean3 = deleteRequest0.refresh();
        deleteRequest0.primaryTerm((long) ' ');
        java.lang.String str6 = deleteRequest0.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException8 = deleteRequest7.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest7.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId16 = deleteRequest15.shardId();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel17 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest15.consistencyLevel(writeConsistencyLevel17);
        java.lang.String str19 = deleteRequest18.routing();
        org.elasticsearch.index.VersionType versionType20 = deleteRequest18.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest10.versionType(versionType20);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel22 = deleteRequest21.consistencyLevel();
        java.lang.String str23 = deleteRequest21.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest21.routing("delete {[][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest26.setParentTask("hi!", 10L);
        java.lang.String[] strArray30 = deleteRequest26.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel31 = deleteRequest26.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest25.consistencyLevel(writeConsistencyLevel31);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest0.consistencyLevel(writeConsistencyLevel31);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = deleteRequest33.parent("delete {[delete {[][][]}][null][null]}");
        deleteRequest35.seqNo((long) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "delete {[null][null][null]}" + "'", str1, "delete {[null][null][null]}");
        org.junit.Assert.assertNull(shardId2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "delete {[null][null][null]}" + "'", str6, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(actionRequestValidationException8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNull(shardId16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(versionType20);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel22 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel22.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel31 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel31.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertNotNull(deleteRequest35);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        long long3 = deleteRequest0.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.parent("");
        deleteRequest0.seqNo((long) (short) 10);
        org.elasticsearch.index.shard.IndexShard indexShard8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete9 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest0, indexShard8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest5);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId3 = deleteRequest2.shardId();
        long long4 = deleteRequest2.seqNo();
        long long5 = deleteRequest2.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.refresh(false);
        long long12 = deleteRequest9.seqNo();
        java.lang.String str13 = deleteRequest9.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest9.parent("");
        org.elasticsearch.tasks.TaskId taskId16 = deleteRequest9.getParentTask();
        org.elasticsearch.tasks.Task task17 = deleteRequest2.createTask((long) (short) 0, "delete {[][null][null]}", "", taskId16);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest2.timeout("delete {[null][null][delete {[][null][null]}]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[null][null][delete {[][null][null]}]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(shardId3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "delete {[null][null][null]}" + "'", str13, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(taskId16);
        org.junit.Assert.assertNotNull(task17);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue7 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.timeout(timeValue7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest2.timeout(timeValue7);
        org.elasticsearch.index.shard.ShardId shardId10 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.setShardId(shardId10);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.id("delete {[null][null][hi!]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest11.timeout("hi!");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [hi!] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(timeValue7);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        java.lang.String str2 = deleteRequest0.id();
        long long3 = deleteRequest0.primaryTerm();
        java.lang.String str4 = deleteRequest0.routing();
        java.lang.String str5 = deleteRequest0.toString();
        org.elasticsearch.common.unit.TimeValue timeValue6 = deleteRequest0.timeout();
        long long7 = deleteRequest0.primaryTerm();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest0.timeout("delete {[null][null][hi!]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[null][null][hi!]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "delete {[null][null][null]}" + "'", str5, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = deleteRequest3.remoteAddress();
        boolean boolean7 = deleteRequest3.getShouldPersistResult();
        java.lang.String str8 = deleteRequest3.id();
        org.elasticsearch.index.shard.ShardId shardId9 = deleteRequest3.shardId();
        org.elasticsearch.index.shard.ShardId shardId10 = deleteRequest3.shardId();
        org.elasticsearch.action.support.IndicesOptions indicesOptions11 = deleteRequest3.indicesOptions();
        java.lang.String str12 = deleteRequest3.parent();
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(transportAddress6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(shardId9);
        org.junit.Assert.assertNull(shardId10);
        org.junit.Assert.assertNotNull(indicesOptions11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest0.setParentTask("hi!", 10L);
        java.lang.String[] strArray4 = deleteRequest0.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = deleteRequest0.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.routing("hi!");
        org.elasticsearch.index.shard.ShardId shardId8 = deleteRequest0.shardId();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException9 = deleteRequest0.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest0.refresh(false);
        org.elasticsearch.common.io.stream.StreamInput streamInput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest11.readFrom(streamInput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel5 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel5.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNull(shardId8);
        org.junit.Assert.assertNotNull(actionRequestValidationException9);
        org.junit.Assert.assertNotNull(deleteRequest11);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue7 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.timeout(timeValue7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest2.timeout(timeValue7);
        java.lang.String str10 = deleteRequest9.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest9.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.refresh(false);
        deleteRequest15.setParentTask("hi!", (long) (byte) 100);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException20 = deleteRequest19.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest19.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue23 = deleteRequest22.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest22.routing("");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel26 = deleteRequest22.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest15.consistencyLevel(writeConsistencyLevel26);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest12.consistencyLevel(writeConsistencyLevel26);
        java.lang.String str29 = deleteRequest12.type();
        java.lang.Class<?> wildcardClass30 = deleteRequest12.getClass();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(timeValue7);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(actionRequestValidationException20);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertNotNull(timeValue23);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel26 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel26.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.refresh(true);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException7 = deleteRequest6.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue10 = deleteRequest9.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest5.timeout(timeValue10);
        org.elasticsearch.action.support.IndicesOptions indicesOptions12 = deleteRequest5.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue20 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest19.timeout(timeValue20);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest15.timeout(timeValue20);
        java.lang.String str23 = deleteRequest22.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest22.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest26.refresh(false);
        deleteRequest28.setParentTask("hi!", (long) (byte) 100);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException33 = deleteRequest32.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = deleteRequest32.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue36 = deleteRequest35.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest38 = deleteRequest35.routing("");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel39 = deleteRequest35.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest40 = deleteRequest28.consistencyLevel(writeConsistencyLevel39);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest41 = deleteRequest25.consistencyLevel(writeConsistencyLevel39);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest42 = deleteRequest5.consistencyLevel(writeConsistencyLevel39);
        org.elasticsearch.index.shard.ShardId shardId43 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest44 = deleteRequest42.setShardId(shardId43);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(actionRequestValidationException7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(timeValue10);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(indicesOptions12);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(timeValue20);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertNotNull(actionRequestValidationException33);
        org.junit.Assert.assertNotNull(deleteRequest35);
        org.junit.Assert.assertNotNull(timeValue36);
        org.junit.Assert.assertNotNull(deleteRequest38);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel39 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel39.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest40);
        org.junit.Assert.assertNotNull(deleteRequest41);
        org.junit.Assert.assertNotNull(deleteRequest42);
        org.junit.Assert.assertNotNull(deleteRequest44);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue6 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.timeout(timeValue6);
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = null;
        deleteRequest5.remoteAddress(transportAddress8);
        java.lang.String str10 = deleteRequest5.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest5.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest12.index("delete {[null][null][null]}");
        java.lang.String str15 = deleteRequest14.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest14.routing("");
        org.elasticsearch.common.unit.TimeValue timeValue18 = deleteRequest17.timeout();
        org.elasticsearch.action.support.IndicesOptions indicesOptions19 = deleteRequest17.indicesOptions();
        long long20 = deleteRequest17.seqNo();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[null][][null]}", deleteRequest17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(timeValue18);
        org.junit.Assert.assertNotNull(indicesOptions19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.elasticsearch.action.support.replication.ReplicationTask replicationTask0 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.setPhase(replicationTask0, "delete {[null][null][delete {[null][null][null]}]}");
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.type("");
        java.lang.String str7 = deleteRequest6.type();
        java.lang.String[] strArray8 = deleteRequest6.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest6.id("delete {[delete {[][][hi!]}][][delete {[][null][null]}]}");
        org.elasticsearch.common.io.stream.StreamOutput streamOutput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest10.writeTo(streamOutput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(deleteRequest10);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue6 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.timeout(timeValue6);
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest5.getParentTask();
        org.elasticsearch.index.shard.ShardId shardId9 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest5.setShardId(shardId9);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[null][hi!][]}", deleteRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNotNull(deleteRequest10);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.refresh(true);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException7 = deleteRequest6.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue10 = deleteRequest9.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest5.timeout(timeValue10);
        org.elasticsearch.action.support.IndicesOptions indicesOptions12 = deleteRequest5.indicesOptions();
        org.elasticsearch.common.unit.TimeValue timeValue13 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest5.timeout(timeValue13);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest5.timeout("");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(actionRequestValidationException7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(timeValue10);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(indicesOptions12);
        org.junit.Assert.assertNotNull(deleteRequest14);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[null][null][]}", "delete {[][null][null]}");
        org.elasticsearch.index.VersionType versionType4 = deleteRequest3.versionType();
        java.lang.String str5 = deleteRequest3.parent();
        org.junit.Assert.assertNotNull(versionType4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask((long) ' ', "delete {[null][null][null]}", "delete {[null][null][null]}", taskId7);
        java.lang.String str9 = deleteRequest3.toString();
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "delete {[][][hi!]}" + "'", str9, "delete {[][][hi!]}");
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.index("");
        java.lang.String[] strArray8 = deleteRequest7.indices();
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][]}");
        boolean boolean2 = deleteRequest1.refresh();
        java.lang.String[] strArray3 = deleteRequest1.indices();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.refresh(false);
        org.elasticsearch.index.shard.ShardId shardId3 = deleteRequest2.shardId();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.consistencyLevel(writeConsistencyLevel4);
        long long6 = deleteRequest2.primaryTerm();
        org.elasticsearch.index.VersionType versionType7 = deleteRequest2.versionType();
        org.elasticsearch.index.shard.ShardId shardId8 = deleteRequest2.shardId();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(shardId3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(versionType7);
        org.junit.Assert.assertNull(shardId8);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        java.lang.String str4 = deleteRequest3.toString();
        java.lang.String str5 = deleteRequest3.routing();
        java.lang.String str6 = deleteRequest3.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.index("delete {[delete {[null][null][null]}][][]}");
        org.elasticsearch.tasks.TaskId taskId9 = deleteRequest8.getParentTask();
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[null][null][null]}" + "'", str4, "delete {[null][null][null]}");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(taskId9);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue6 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.timeout(timeValue6);
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = deleteRequest5.remoteAddress();
        boolean boolean9 = deleteRequest5.getShouldPersistResult();
        java.lang.String str10 = deleteRequest5.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest5.type("delete {[null][null][]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[][][]}", deleteRequest12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNull(transportAddress8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(deleteRequest12);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.refresh(false);
        long long5 = deleteRequest2.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest2.parent("");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException8 = deleteRequest2.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure10 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[null][][null]}", (java.lang.Throwable) actionRequestValidationException8, "");
        java.lang.Throwable throwable11 = shardFailure10.cause;
        java.lang.Class<?> wildcardClass12 = throwable11.getClass();
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(actionRequestValidationException8);
        org.junit.Assert.assertNotNull(throwable11);
        org.junit.Assert.assertEquals(throwable11.getLocalizedMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable11.getMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable11.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.refresh(true);
        deleteRequest3.primaryTerm((long) 10);
        org.elasticsearch.index.shard.ShardId shardId8 = deleteRequest3.shardId();
        org.elasticsearch.index.shard.IndexShard indexShard9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult10 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest3, indexShard9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(shardId8);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.routing("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest1.timeout("delete {[][][hi!]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[][][hi!]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest3);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.refresh(false);
        org.elasticsearch.index.VersionType versionType7 = deleteRequest4.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.versionType(versionType7);
        deleteRequest8.seqNo((long) (byte) -1);
        org.elasticsearch.tasks.TaskId taskId11 = deleteRequest8.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest16.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest18.refresh(true);
        org.elasticsearch.tasks.TaskId taskId21 = deleteRequest18.getParentTask();
        org.elasticsearch.tasks.Task task22 = deleteRequest8.createTask((long) (short) 10, "", "hi!", taskId21);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest23.setParentTask("hi!", 10L);
        org.elasticsearch.common.unit.TimeValue timeValue27 = deleteRequest23.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest8.timeout(timeValue27);
        org.elasticsearch.common.unit.TimeValue timeValue29 = deleteRequest8.timeout();
        org.elasticsearch.common.io.stream.StreamInput streamInput30 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest8.readFrom(streamInput30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(versionType7);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(taskId11);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(taskId21);
        org.junit.Assert.assertNotNull(task22);
        org.junit.Assert.assertNotNull(timeValue27);
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertNotNull(timeValue29);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions1 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("");
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = null;
        deleteRequest0.remoteAddress(transportAddress4);
        org.elasticsearch.action.support.IndicesOptions indicesOptions6 = deleteRequest0.indicesOptions();
        long long7 = deleteRequest0.version();
        long long8 = deleteRequest0.primaryTerm();
        org.junit.Assert.assertNotNull(indicesOptions1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(indicesOptions6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-3L) + "'", long7 == (-3L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException1 = deleteRequest0.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.routing("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest3.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest7.setParentTask("hi!", 10L);
        java.lang.String[] strArray11 = deleteRequest7.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest();
        deleteRequest12.setParentTask("hi!", 10L);
        java.lang.String[] strArray16 = deleteRequest12.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel17 = deleteRequest12.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest7.consistencyLevel(writeConsistencyLevel17);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest6.consistencyLevel(writeConsistencyLevel17);
        long long20 = deleteRequest6.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.support.IndicesOptions indicesOptions22 = deleteRequest21.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest21.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest21.parent("");
        org.elasticsearch.common.unit.TimeValue timeValue27 = deleteRequest26.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest6.timeout(timeValue27);
        java.lang.Class<?> wildcardClass29 = deleteRequest28.getClass();
        org.junit.Assert.assertNotNull(actionRequestValidationException1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel17 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel17.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(indicesOptions22);
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNotNull(timeValue27);
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }
}

