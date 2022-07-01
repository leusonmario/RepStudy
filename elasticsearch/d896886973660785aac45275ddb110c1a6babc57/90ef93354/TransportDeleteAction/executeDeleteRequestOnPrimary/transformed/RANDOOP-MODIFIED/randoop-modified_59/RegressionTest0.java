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
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
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
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "hi!", throwable2, "hi!");
        java.lang.Class<?> wildcardClass5 = shardFailure4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState> indexShardStateSet0 = org.elasticsearch.index.shard.IndexShard.writeAllowedStatesForPrimary;
        org.junit.Assert.assertNotNull(indexShardStateSet0);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        java.lang.Class<?> wildcardClass2 = deleteRequest1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        long long3 = deleteRequest2.version();
        org.elasticsearch.index.shard.IndexShard indexShard4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult5 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest2, indexShard4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3L) + "'", long3 == (-3L));
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        org.elasticsearch.action.support.replication.ReplicationTask replicationTask0 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.setPhase(replicationTask0, "delete {[null][null][null]}");
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        org.elasticsearch.action.support.replication.ReplicationTask replicationTask0 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.setPhase(replicationTask0, "hi!");
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.common.unit.TimeValue timeValue8 = deleteRequest5.timeout();
        java.lang.Class<?> wildcardClass9 = deleteRequest5.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        java.lang.String str2 = deleteRequest0.routing();
        org.elasticsearch.index.VersionType versionType3 = deleteRequest0.versionType();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.timeout("");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(versionType3);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
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
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "hi!", throwable2, "hi!");
        java.lang.Throwable throwable5 = shardFailure4.cause;
        java.lang.Throwable throwable6 = shardFailure4.cause;
        org.junit.Assert.assertNull(throwable5);
        org.junit.Assert.assertNull(throwable6);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue6 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.timeout(timeValue6);
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest7.getParentTask();
        java.lang.String str9 = deleteRequest7.index();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
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
        java.util.List<org.elasticsearch.index.shard.SearchOperationListener> searchOperationListenerList15 = null;
        org.elasticsearch.index.shard.IndexingOperationListener[] indexingOperationListenerArray16 = new org.elasticsearch.index.shard.IndexingOperationListener[] {};
        java.util.ArrayList<org.elasticsearch.index.shard.IndexingOperationListener> indexingOperationListenerList17 = new java.util.ArrayList<org.elasticsearch.index.shard.IndexingOperationListener>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.elasticsearch.index.shard.IndexingOperationListener>) indexingOperationListenerList17, indexingOperationListenerArray16);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.shard.IndexShard indexShard19 = new org.elasticsearch.index.shard.IndexShard(shardRouting0, indexSettings1, shardPath2, store3, indexCache4, mapperService5, similarityService6, indexFieldDataService7, engineFactory8, indexEventListener9, indexSearcherWrapper10, threadPool11, bigArrays12, warmer13, runnable14, searchOperationListenerList15, (java.util.List<org.elasticsearch.index.shard.IndexingOperationListener>) indexingOperationListenerList17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexingOperationListenerArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.refresh(false);
        org.elasticsearch.common.io.stream.StreamInput streamInput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest7.readFrom(streamInput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "", throwable2, "hi!");
        java.lang.Throwable throwable5 = shardFailure4.cause;
        org.junit.Assert.assertNull(throwable5);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.id("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest2.timeout("");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
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
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        java.lang.String str6 = deleteRequest5.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest5.index("delete {[null][null][hi!]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.timeout("hi!");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [hi!] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(deleteRequest8);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.support.IndicesOptions indicesOptions2 = deleteRequest0.indicesOptions();
        boolean boolean3 = deleteRequest0.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.index("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue6 = deleteRequest5.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str8 = deleteRequest7.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest7.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest12.routing("");
        org.elasticsearch.index.VersionType versionType15 = deleteRequest12.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest5.versionType(versionType15);
        org.elasticsearch.index.shard.IndexShard indexShard17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult18 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest16, indexShard17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(indicesOptions2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(versionType15);
        org.junit.Assert.assertNotNull(deleteRequest16);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel3 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.consistencyLevel(writeConsistencyLevel3);
        org.elasticsearch.action.support.IndicesOptions indicesOptions5 = deleteRequest2.indicesOptions();
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest2.setShardId(shardId6);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str9 = deleteRequest8.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest8.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.id("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue14 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.timeout(timeValue14);
        org.elasticsearch.index.VersionType versionType16 = deleteRequest13.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest7.versionType(versionType16);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[null][null][null]}", deleteRequest17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(indicesOptions5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(timeValue14);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(versionType16);
        org.junit.Assert.assertNotNull(deleteRequest17);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str3 = deleteRequest2.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest5.refresh(false);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException10 = deleteRequest9.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure12 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "hi!", (java.lang.Throwable) actionRequestValidationException10, "hi!");
        java.lang.String str13 = shardFailure12.indexUUID;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(actionRequestValidationException10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str7 = deleteRequest6.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest9.refresh(false);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException14 = deleteRequest13.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure16 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "hi!", (java.lang.Throwable) actionRequestValidationException14, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure18 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "hi!", (java.lang.Throwable) actionRequestValidationException14, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure20 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[null][null][null]}", (java.lang.Throwable) actionRequestValidationException14, "delete {[null][null][hi!]}");
        java.lang.String str21 = shardFailure20.indexUUID;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(actionRequestValidationException14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "delete {[null][null][hi!]}" + "'", str21, "delete {[null][null][hi!]}");
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str3 = deleteRequest2.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.routing("");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[null][null][hi!]}", deleteRequest9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "delete {[null][null][null]}", "delete {[null][null][hi!]}");
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
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.common.unit.TimeValue timeValue8 = deleteRequest7.timeout();
        org.elasticsearch.common.unit.TimeValue timeValue9 = deleteRequest7.timeout();
        org.elasticsearch.common.io.stream.StreamInput streamInput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest7.readFrom(streamInput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(timeValue9);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}", "", "hi!");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException4 = deleteRequest3.validate();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.writeTo(streamOutput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(actionRequestValidationException4);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        deleteRequest1.seqNo((long) 10);
        java.lang.String str4 = deleteRequest1.routing();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest1.timeout("hi!");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [hi!] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.setShardId(shardId6);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.timeout("delete {[hi!][null][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[hi!][null][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        long long6 = deleteRequest3.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.routing("delete {[null][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.routing("hi!");
        org.elasticsearch.common.io.stream.StreamInput streamInput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.readFrom(streamInput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        java.lang.String str6 = deleteRequest5.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest5.index("delete {[null][null][hi!]}");
        org.elasticsearch.common.io.stream.StreamInput streamInput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest8.readFrom(streamInput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(deleteRequest8);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue6 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.timeout(timeValue6);
        java.lang.String str8 = deleteRequest7.getDescription();
        org.elasticsearch.common.io.stream.StreamInput streamInput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest7.readFrom(streamInput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "delete {[null][null][hi!]}" + "'", str8, "delete {[null][null][hi!]}");
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.parent("");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest0.timeout("");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.setShardId(shardId6);
        org.elasticsearch.common.unit.TimeValue timeValue8 = deleteRequest3.timeout();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.writeTo(streamOutput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(timeValue8);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest7.getParentTask();
        java.lang.String[] strArray9 = deleteRequest7.indices();
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = deleteRequest7.remoteAddress();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest7.consistencyLevel(writeConsistencyLevel11);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest7.routing("hi!");
        org.elasticsearch.common.io.stream.StreamOutput streamOutput15 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest7.writeTo(streamOutput15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(transportAddress10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest14);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str3 = deleteRequest2.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.routing("");
        boolean boolean10 = deleteRequest9.getShouldPersistResult();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "", deleteRequest9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        org.elasticsearch.action.support.replication.ReplicationTask replicationTask0 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.setPhase(replicationTask0, "delete {[null][null][hi!]}");
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.timeout("delete {[hi!][null][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[hi!][null][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}", "delete {[null][null][null]}", "hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.parent("delete {[null][null][null]}");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel8 = deleteRequest5.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest5.id("");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "", deleteRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel8 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel8.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest10);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[null][null][null]}", "delete {[null][null][null]}");
        long long4 = deleteRequest3.seqNo();
        java.lang.Class<?> wildcardClass5 = deleteRequest3.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        org.elasticsearch.action.support.replication.ReplicationTask replicationTask0 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.setPhase(replicationTask0, "delete {[hi!][null][null]}");
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str9 = deleteRequest8.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest8.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.routing("");
        org.elasticsearch.tasks.TaskId taskId16 = deleteRequest15.getParentTask();
        deleteRequest7.setParentTask(taskId16);
        org.elasticsearch.index.shard.ShardId shardId18 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest7.setShardId(shardId18);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest7.parent("delete {[null][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest7.index("hi!");
        org.elasticsearch.index.shard.IndexShard indexShard24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete25 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest7, indexShard24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(taskId16);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(deleteRequest23);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str3 = deleteRequest2.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.id("hi!");
        org.elasticsearch.index.shard.ShardId shardId8 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest5.setShardId(shardId8);
        org.elasticsearch.common.unit.TimeValue timeValue10 = deleteRequest5.timeout();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "", deleteRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(timeValue10);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str3 = deleteRequest2.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.id("hi!");
        long long8 = deleteRequest5.seqNo();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[null][null][hi!]}", deleteRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][null][null]}", "delete {[null][null][hi!]}", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout("delete {[null][null][hi!]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[null][null][hi!]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str5 = deleteRequest4.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest4.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest7.refresh(false);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException12 = deleteRequest11.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure14 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "hi!", (java.lang.Throwable) actionRequestValidationException12, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure16 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "hi!", (java.lang.Throwable) actionRequestValidationException12, "");
        java.lang.Class<?> wildcardClass17 = actionRequestValidationException12.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(actionRequestValidationException12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.support.IndicesOptions indicesOptions2 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.id("delete {[null][null][null]}");
        boolean boolean7 = deleteRequest4.getShouldPersistResult();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(indicesOptions2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        org.elasticsearch.action.support.replication.ReplicationTask replicationTask0 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.setPhase(replicationTask0, "");
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][null][null]}");
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str9 = deleteRequest8.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest8.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.routing("");
        org.elasticsearch.tasks.TaskId taskId16 = deleteRequest15.getParentTask();
        deleteRequest7.setParentTask(taskId16);
        org.elasticsearch.index.shard.ShardId shardId18 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest7.setShardId(shardId18);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest7.parent("delete {[null][null][null]}");
        java.lang.String str22 = deleteRequest7.parent();
        org.elasticsearch.index.shard.IndexShard indexShard23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete24 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest7, indexShard23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(taskId16);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "delete {[null][null][null]}" + "'", str22, "delete {[null][null][null]}");
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = deleteRequest0.indicesOptions();
        org.elasticsearch.index.VersionType versionType4 = deleteRequest0.versionType();
        org.elasticsearch.common.io.stream.StreamInput streamInput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.readFrom(streamInput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(indicesOptions3);
        org.junit.Assert.assertNotNull(versionType4);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "", throwable2, "hi!");
        java.lang.Class<?> wildcardClass5 = shardFailure4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest7.getParentTask();
        java.lang.String[] strArray9 = deleteRequest7.indices();
        org.elasticsearch.index.VersionType versionType10 = deleteRequest7.versionType();
        java.lang.String str11 = deleteRequest7.parent();
        org.elasticsearch.index.shard.IndexShard indexShard12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete13 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest7, indexShard12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(versionType10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = deleteRequest0.indicesOptions();
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.setShardId(shardId4);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str7 = deleteRequest6.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.id("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue12 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.timeout(timeValue12);
        org.elasticsearch.index.VersionType versionType14 = deleteRequest11.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest5.versionType(versionType14);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel17 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest16.consistencyLevel(writeConsistencyLevel17);
        org.elasticsearch.action.support.IndicesOptions indicesOptions19 = deleteRequest16.indicesOptions();
        org.elasticsearch.index.VersionType versionType20 = deleteRequest16.versionType();
        java.lang.String[] strArray21 = deleteRequest16.indices();
        java.lang.String[] strArray22 = deleteRequest16.indices();
        org.elasticsearch.common.unit.TimeValue timeValue23 = deleteRequest16.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest15.timeout(timeValue23);
        org.elasticsearch.index.shard.IndexShard indexShard25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult26 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest15, indexShard25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(indicesOptions3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(timeValue12);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(versionType14);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(indicesOptions19);
        org.junit.Assert.assertNotNull(versionType20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(timeValue23);
        org.junit.Assert.assertNotNull(deleteRequest24);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        java.lang.String str3 = deleteRequest0.index();
        long long4 = deleteRequest0.seqNo();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.writeTo(streamOutput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = deleteRequest0.indicesOptions();
        java.lang.Class<?> wildcardClass4 = indicesOptions3.getClass();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(indicesOptions3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        java.lang.String str2 = deleteRequest0.routing();
        org.elasticsearch.index.VersionType versionType3 = deleteRequest0.versionType();
        java.lang.String str4 = deleteRequest0.toString();
        org.elasticsearch.index.shard.IndexShard indexShard5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult6 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest0, indexShard5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[null][null][null]}" + "'", str4, "delete {[null][null][null]}");
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
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
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        java.lang.String str6 = deleteRequest3.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.routing("");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.timeout("delete {[null][null][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[null][null][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(deleteRequest8);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.support.IndicesOptions indicesOptions2 = deleteRequest0.indicesOptions();
        boolean boolean3 = deleteRequest0.refresh();
        java.lang.Class<?> wildcardClass4 = deleteRequest0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(indicesOptions2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.support.IndicesOptions indicesOptions2 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str9 = deleteRequest8.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest8.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.routing("");
        org.elasticsearch.tasks.TaskId taskId16 = deleteRequest15.getParentTask();
        org.elasticsearch.tasks.Task task17 = deleteRequest4.createTask((long) 'a', "delete {[null][null][null]}", "hi!", taskId16);
        long long18 = deleteRequest4.primaryTerm();
        org.elasticsearch.index.shard.IndexShard indexShard19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete20 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest4, indexShard19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(indicesOptions2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(taskId16);
        org.junit.Assert.assertNotNull(task17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        long long4 = deleteRequest3.primaryTerm();
        boolean boolean5 = deleteRequest3.refresh();
        java.lang.String str6 = deleteRequest3.type();
        long long7 = deleteRequest3.version();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-3L) + "'", long7 == (-3L));
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "delete {[null][null][null]}", "delete {[null][null][hi!]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout("");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str7 = deleteRequest6.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest9.refresh(false);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException14 = deleteRequest13.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure16 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "hi!", (java.lang.Throwable) actionRequestValidationException14, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure18 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "hi!", (java.lang.Throwable) actionRequestValidationException14, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure20 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[null][null][null]}", (java.lang.Throwable) actionRequestValidationException14, "hi!");
        java.lang.String str21 = shardFailure20.reason;
        java.lang.String str22 = shardFailure20.indexUUID;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(actionRequestValidationException14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "delete {[null][null][null]}" + "'", str21, "delete {[null][null][null]}");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel3 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.consistencyLevel(writeConsistencyLevel3);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.type("delete {[null][null][null]}");
        deleteRequest8.setParentTask("hi!", (long) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "", deleteRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest8);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.index.shard.ShardId shardId2 = deleteRequest0.shardId();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.version((long) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest0.timeout("");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(shardId2);
        org.junit.Assert.assertNotNull(deleteRequest4);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.refresh(false);
        deleteRequest7.primaryTerm((long) 100);
        org.elasticsearch.index.shard.IndexShard indexShard10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete11 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest7, indexShard10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[null][null][null]}", "delete {[null][null][null]}");
        long long4 = deleteRequest3.seqNo();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.writeTo(streamOutput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str7 = deleteRequest6.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest9.refresh(false);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException14 = deleteRequest13.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure16 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "hi!", (java.lang.Throwable) actionRequestValidationException14, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure18 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[null][null][hi!]}", (java.lang.Throwable) actionRequestValidationException14, "delete {[null][null][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure20 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[hi!][null][null]}", (java.lang.Throwable) actionRequestValidationException14, "hi!");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting21 = shardFailure20.routing;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(actionRequestValidationException14);
        org.junit.Assert.assertNull(shardRouting21);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel3 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.consistencyLevel(writeConsistencyLevel3);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.type("delete {[null][null][null]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}", deleteRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest8);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        java.lang.String str8 = deleteRequest5.routing();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[null][null][]}", throwable2, "delete {[delete {[null][null][null]}][delete {[][null][null]}][hi!]}");
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "", "hi!");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException4 = deleteRequest3.validate();
        org.elasticsearch.index.shard.IndexShard indexShard5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult6 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest3, indexShard5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(actionRequestValidationException4);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        java.lang.String str2 = deleteRequest1.index();
        org.elasticsearch.index.shard.ShardId shardId3 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest1.setShardId(shardId3);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest1.writeTo(streamOutput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(deleteRequest4);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest7.getParentTask();
        java.lang.String[] strArray9 = deleteRequest7.indices();
        org.elasticsearch.common.io.stream.StreamInput streamInput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest7.readFrom(streamInput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        java.lang.String str2 = deleteRequest1.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str4 = deleteRequest3.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.routing("");
        org.elasticsearch.tasks.TaskId taskId11 = deleteRequest10.getParentTask();
        java.lang.String[] strArray12 = deleteRequest10.indices();
        org.elasticsearch.tasks.TaskId taskId13 = deleteRequest10.getParentTask();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel14 = deleteRequest10.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest1.consistencyLevel(writeConsistencyLevel14);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest15.routing("hi!");
        org.elasticsearch.common.io.stream.StreamOutput streamOutput18 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest17.writeTo(streamOutput18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(taskId11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(taskId13);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel14 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel14.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest17);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = deleteRequest0.indicesOptions();
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.setShardId(shardId4);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str7 = deleteRequest6.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.id("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue12 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.timeout(timeValue12);
        org.elasticsearch.index.VersionType versionType14 = deleteRequest11.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest5.versionType(versionType14);
        deleteRequest15.seqNo((long) (short) 1);
        deleteRequest15.seqNo((long) 0);
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(indicesOptions3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(timeValue12);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(versionType14);
        org.junit.Assert.assertNotNull(deleteRequest15);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][null][null]}", "hi!", "delete {[null][null][]}");
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.index.shard.ShardId shardId2 = deleteRequest0.shardId();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput3 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.writeTo(streamOutput3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(shardId2);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str9 = deleteRequest8.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest8.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.routing("");
        org.elasticsearch.tasks.TaskId taskId16 = deleteRequest15.getParentTask();
        deleteRequest7.setParentTask(taskId16);
        org.elasticsearch.index.shard.ShardId shardId18 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest7.setShardId(shardId18);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest19.timeout("delete {[delete {[null][null][null]}][null][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[delete {[null][null][null]}][null][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(taskId16);
        org.junit.Assert.assertNotNull(deleteRequest19);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.index.shard.ShardId shardId2 = deleteRequest0.shardId();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.version((long) (short) -1);
        org.elasticsearch.action.support.IndicesOptions indicesOptions5 = deleteRequest4.indicesOptions();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(shardId2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(indicesOptions5);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str3 = deleteRequest2.routing();
        org.elasticsearch.action.support.IndicesOptions indicesOptions4 = deleteRequest2.indicesOptions();
        boolean boolean5 = deleteRequest2.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest2.index("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[null][null][]}", deleteRequest7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(indicesOptions4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(deleteRequest7);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str7 = deleteRequest6.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest9.refresh(false);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException14 = deleteRequest13.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure16 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "hi!", (java.lang.Throwable) actionRequestValidationException14, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure18 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[null][null][hi!]}", (java.lang.Throwable) actionRequestValidationException14, "delete {[null][null][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure20 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[hi!][null][null]}", (java.lang.Throwable) actionRequestValidationException14, "");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting21 = shardFailure20.routing;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(actionRequestValidationException14);
        org.junit.Assert.assertNull(shardRouting21);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        long long3 = deleteRequest2.version();
        org.elasticsearch.common.io.stream.StreamInput streamInput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest2.readFrom(streamInput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3L) + "'", long3 == (-3L));
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.refresh(false);
        deleteRequest3.setParentTask("hi!", 0L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest3.refresh(true);
        org.elasticsearch.common.io.stream.StreamInput streamInput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.readFrom(streamInput13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest12);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest7.getParentTask();
        java.lang.String[] strArray9 = deleteRequest7.indices();
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = deleteRequest7.remoteAddress();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest7.consistencyLevel(writeConsistencyLevel11);
        deleteRequest12.setParentTask("delete {[delete {[null][null][null]}][delete {[][null][null]}][hi!]}", (long) (short) 10);
        java.lang.Class<?> wildcardClass16 = deleteRequest12.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(transportAddress10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        deleteRequest3.primaryTerm((long) (short) 10);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str10 = deleteRequest9.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest9.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest12.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest14.routing("");
        org.elasticsearch.tasks.TaskId taskId17 = deleteRequest14.getParentTask();
        org.elasticsearch.tasks.Task task18 = deleteRequest3.createTask((long) (-1), "", "hi!", taskId17);
        java.lang.Class<?> wildcardClass19 = deleteRequest3.getClass();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(taskId17);
        org.junit.Assert.assertNotNull(task18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "delete {[null][null][null]}", "delete {[null][null][hi!]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout("hi!");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [hi!] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str7 = deleteRequest6.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest9.refresh(false);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException14 = deleteRequest13.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure16 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "hi!", (java.lang.Throwable) actionRequestValidationException14, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure18 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "", (java.lang.Throwable) actionRequestValidationException14, "delete {[null][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure20 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "", (java.lang.Throwable) actionRequestValidationException14, "");
        java.lang.String str21 = shardFailure20.indexUUID;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(actionRequestValidationException14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "", "hi!");
        deleteRequest3.primaryTerm((-3L));
        org.elasticsearch.index.shard.IndexShard indexShard6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult7 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest3, indexShard6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str3 = deleteRequest2.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str11 = deleteRequest10.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest10.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest15.routing("");
        org.elasticsearch.tasks.TaskId taskId18 = deleteRequest17.getParentTask();
        deleteRequest9.setParentTask(taskId18);
        org.elasticsearch.index.shard.ShardId shardId20 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest9.setShardId(shardId20);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest9.parent("delete {[null][null][null]}");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException24 = deleteRequest23.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure26 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[null][null][hi!]}", (java.lang.Throwable) actionRequestValidationException24, "hi!");
        java.lang.Class<?> wildcardClass27 = actionRequestValidationException24.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(taskId18);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(actionRequestValidationException24);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest7.getParentTask();
        java.lang.String[] strArray9 = deleteRequest7.indices();
        org.elasticsearch.index.VersionType versionType10 = deleteRequest7.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest7.index("");
        org.elasticsearch.common.io.stream.StreamOutput streamOutput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest12.writeTo(streamOutput13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(versionType10);
        org.junit.Assert.assertNotNull(deleteRequest12);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[null][null][null]}");
        java.lang.String str4 = deleteRequest3.parent();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.writeTo(streamOutput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        long long3 = deleteRequest2.version();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.consistencyLevel(writeConsistencyLevel4);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest2.writeTo(streamOutput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3L) + "'", long3 == (-3L));
        org.junit.Assert.assertNotNull(deleteRequest5);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        java.lang.String str6 = deleteRequest5.type();
        deleteRequest5.primaryTerm((long) (byte) 0);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest5.parent("delete {[hi!][null][null]}");
        org.elasticsearch.index.shard.IndexShard indexShard11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult12 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest10, indexShard11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(deleteRequest10);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest7.getParentTask();
        java.lang.String[] strArray9 = deleteRequest7.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest7.version((long) 10);
        java.lang.String[] strArray12 = deleteRequest7.indices();
        org.elasticsearch.index.shard.ShardId shardId13 = deleteRequest7.shardId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNull(shardId13);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str3 = deleteRequest2.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.routing("");
        org.elasticsearch.tasks.TaskId taskId10 = deleteRequest9.getParentTask();
        java.lang.String[] strArray11 = deleteRequest9.indices();
        org.elasticsearch.common.transport.TransportAddress transportAddress12 = deleteRequest9.remoteAddress();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel13 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest9.consistencyLevel(writeConsistencyLevel13);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest14.version((long) (short) 10);
        java.lang.String str17 = deleteRequest16.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest16.id("delete {[null][null][hi!]}");
        java.lang.String[] strArray20 = deleteRequest19.indices();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[null][null][]}", deleteRequest19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(taskId10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNull(transportAddress12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.refresh(false);
        deleteRequest7.primaryTerm((long) 100);
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = deleteRequest7.remoteAddress();
        boolean boolean11 = deleteRequest7.getShouldPersistResult();
        java.lang.String str12 = deleteRequest7.toString();
        org.elasticsearch.index.shard.IndexShard indexShard13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete14 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest7, indexShard13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNull(transportAddress10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "delete {[null][null][hi!]}" + "'", str12, "delete {[null][null][hi!]}");
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.type("delete {[null][null][null]}");
        deleteRequest6.setParentTask("hi!", (long) 'a');
        java.lang.String str10 = deleteRequest6.parent();
        org.elasticsearch.common.io.stream.StreamInput streamInput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest6.readFrom(streamInput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str11 = deleteRequest10.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest10.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest13.refresh(false);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException18 = deleteRequest17.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure20 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "hi!", (java.lang.Throwable) actionRequestValidationException18, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure22 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "hi!", (java.lang.Throwable) actionRequestValidationException18, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure24 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[null][null][null]}", (java.lang.Throwable) actionRequestValidationException18, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure26 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[null][null][hi!]}", (java.lang.Throwable) actionRequestValidationException18, "delete {[null][null][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure28 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "", (java.lang.Throwable) actionRequestValidationException18, "delete {[][null][null]}");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(actionRequestValidationException18);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        java.lang.String str6 = deleteRequest3.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.routing("");
        org.elasticsearch.common.io.stream.StreamInput streamInput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest10.readFrom(streamInput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = deleteRequest0.indicesOptions();
        org.elasticsearch.index.VersionType versionType4 = deleteRequest0.versionType();
        java.lang.String[] strArray5 = deleteRequest0.indices();
        java.lang.String[] strArray6 = deleteRequest0.indices();
        long long7 = deleteRequest0.primaryTerm();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException8 = deleteRequest0.validate();
        java.lang.Class<?> wildcardClass9 = deleteRequest0.getClass();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(indicesOptions3);
        org.junit.Assert.assertNotNull(versionType4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(actionRequestValidationException8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest7.getParentTask();
        org.elasticsearch.common.transport.TransportAddress transportAddress9 = deleteRequest7.remoteAddress();
        java.lang.String str10 = deleteRequest7.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest7.refresh(true);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest12.writeTo(streamOutput13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNull(transportAddress9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(deleteRequest12);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.elasticsearch.action.support.replication.ReplicationTask replicationTask0 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.setPhase(replicationTask0, "delete {[delete {[null][null][null]}][delete {[][null][null]}][hi!]}");
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.id("hi!");
        long long5 = deleteRequest4.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest4.version((long) ' ');
        java.lang.String str8 = deleteRequest4.routing();
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
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        java.lang.String str6 = deleteRequest5.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "delete {[null][null][hi!]}" + "'", str6, "delete {[null][null][hi!]}");
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("");
        java.lang.String str4 = deleteRequest3.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str6 = deleteRequest5.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest5.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.routing("");
        org.elasticsearch.tasks.TaskId taskId13 = deleteRequest12.getParentTask();
        java.lang.String[] strArray14 = deleteRequest12.indices();
        org.elasticsearch.tasks.TaskId taskId15 = deleteRequest12.getParentTask();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel16 = deleteRequest12.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest3.consistencyLevel(writeConsistencyLevel16);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str19 = deleteRequest18.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest18.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest21.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest23.routing("");
        org.elasticsearch.tasks.TaskId taskId26 = deleteRequest25.getParentTask();
        java.lang.String[] strArray27 = deleteRequest25.indices();
        org.elasticsearch.tasks.TaskId taskId28 = deleteRequest25.getParentTask();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel29 = deleteRequest25.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest3.consistencyLevel(writeConsistencyLevel29);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[null][null][null]}", deleteRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(taskId13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(taskId15);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel16 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel16.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(taskId26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(taskId28);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel29 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel29.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest30);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel3 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.consistencyLevel(writeConsistencyLevel3);
        org.elasticsearch.action.support.IndicesOptions indicesOptions5 = deleteRequest2.indicesOptions();
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest2.setShardId(shardId6);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str9 = deleteRequest8.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest8.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.id("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue14 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.timeout(timeValue14);
        org.elasticsearch.index.VersionType versionType16 = deleteRequest13.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest7.versionType(versionType16);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str19 = deleteRequest18.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest18.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest18.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str25 = deleteRequest24.routing();
        org.elasticsearch.action.support.IndicesOptions indicesOptions26 = deleteRequest24.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest24.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str33 = deleteRequest32.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = deleteRequest32.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest37 = deleteRequest35.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest39 = deleteRequest37.routing("");
        org.elasticsearch.tasks.TaskId taskId40 = deleteRequest39.getParentTask();
        org.elasticsearch.tasks.Task task41 = deleteRequest28.createTask((long) 'a', "delete {[null][null][null]}", "hi!", taskId40);
        deleteRequest18.setParentTask(taskId40);
        deleteRequest7.setParentTask(taskId40);
        org.elasticsearch.index.VersionType versionType44 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest45 = deleteRequest7.versionType(versionType44);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "", deleteRequest45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(indicesOptions5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(timeValue14);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(versionType16);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(indicesOptions26);
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(deleteRequest35);
        org.junit.Assert.assertNotNull(deleteRequest37);
        org.junit.Assert.assertNotNull(deleteRequest39);
        org.junit.Assert.assertNotNull(taskId40);
        org.junit.Assert.assertNotNull(task41);
        org.junit.Assert.assertNotNull(deleteRequest45);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest7.getParentTask();
        java.lang.String[] strArray9 = deleteRequest7.indices();
        org.elasticsearch.index.VersionType versionType10 = deleteRequest7.versionType();
        org.elasticsearch.common.io.stream.StreamInput streamInput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest7.readFrom(streamInput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(versionType10);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.parent("");
        java.lang.String str5 = deleteRequest4.type();
        org.elasticsearch.index.shard.IndexShard indexShard6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete7 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest4, indexShard6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        boolean boolean6 = deleteRequest5.refresh();
        org.elasticsearch.index.shard.IndexShard indexShard7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete8 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest5, indexShard7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "hi!", throwable2, "");
        java.lang.Throwable throwable5 = shardFailure4.cause;
        org.junit.Assert.assertNull(throwable5);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        java.lang.String str3 = deleteRequest0.index();
        long long4 = deleteRequest0.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest0.routing("delete {[null][null][null]}");
        org.elasticsearch.common.io.stream.StreamOutput streamOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest6.writeTo(streamOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest6);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.type("delete {[null][null][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.parent("delete {[null][null][null]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest0.timeout("delete {[null][null][]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[null][null][]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.routing("delete {[null][null][null]}");
        org.elasticsearch.common.io.stream.StreamInput streamInput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.readFrom(streamInput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(indicesOptions3);
        org.junit.Assert.assertNotNull(deleteRequest5);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
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
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest7.getParentTask();
        java.lang.String[] strArray9 = deleteRequest7.indices();
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = deleteRequest7.remoteAddress();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest7.consistencyLevel(writeConsistencyLevel11);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest12.version((long) (short) 10);
        java.lang.Class<?> wildcardClass15 = deleteRequest12.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(transportAddress10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.type("delete {[null][null][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.type("delete {[delete {[null][null][null]}][delete {[][null][null]}][hi!]}");
        java.lang.Class<?> wildcardClass5 = deleteRequest0.getClass();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.id("hi!");
        java.lang.String str5 = deleteRequest4.type();
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
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str7 = deleteRequest6.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str15 = deleteRequest14.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest14.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest17.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest19.routing("");
        org.elasticsearch.tasks.TaskId taskId22 = deleteRequest21.getParentTask();
        deleteRequest13.setParentTask(taskId22);
        org.elasticsearch.index.shard.ShardId shardId24 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest13.setShardId(shardId24);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest13.parent("delete {[null][null][null]}");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException28 = deleteRequest27.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure30 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[null][null][hi!]}", (java.lang.Throwable) actionRequestValidationException28, "delete {[hi!][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure32 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "", (java.lang.Throwable) actionRequestValidationException28, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure34 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[null][null][null]}", (java.lang.Throwable) actionRequestValidationException28, "delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}");
        java.lang.String str35 = shardFailure34.indexUUID;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(taskId22);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertNotNull(actionRequestValidationException28);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}" + "'", str35, "delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}");
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.support.IndicesOptions indicesOptions2 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.id("");
        long long5 = deleteRequest4.version();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str7 = deleteRequest6.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest9.refresh(false);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException14 = deleteRequest13.validate();
        org.elasticsearch.tasks.TaskId taskId15 = deleteRequest13.getParentTask();
        deleteRequest4.setParentTask(taskId15);
        org.elasticsearch.common.io.stream.StreamInput streamInput17 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest4.readFrom(streamInput17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(indicesOptions2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-3L) + "'", long5 == (-3L));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(actionRequestValidationException14);
        org.junit.Assert.assertNotNull(taskId15);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[null][null][hi!]}", throwable2, "delete {[null][null][hi!]}");
        java.lang.Throwable throwable5 = shardFailure4.cause;
        java.lang.Throwable throwable6 = shardFailure4.cause;
        org.junit.Assert.assertNull(throwable5);
        org.junit.Assert.assertNull(throwable6);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.support.IndicesOptions indicesOptions2 = deleteRequest0.indicesOptions();
        boolean boolean3 = deleteRequest0.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.index("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue6 = deleteRequest5.timeout();
        java.lang.Class<?> wildcardClass7 = deleteRequest5.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(indicesOptions2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.elasticsearch.action.support.replication.ReplicationTask replicationTask0 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.setPhase(replicationTask0, "delete {[delete {[null][null][null]}][null][null]}");
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest7.getParentTask();
        java.lang.String[] strArray9 = deleteRequest7.indices();
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = deleteRequest7.remoteAddress();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest7.consistencyLevel(writeConsistencyLevel11);
        org.elasticsearch.common.io.stream.StreamInput streamInput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest7.readFrom(streamInput13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(transportAddress10);
        org.junit.Assert.assertNotNull(deleteRequest12);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel3 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.consistencyLevel(writeConsistencyLevel3);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.id("hi!");
        long long7 = deleteRequest6.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.version((long) ' ');
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = deleteRequest6.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = deleteRequest6.consistencyLevel();
        long long12 = deleteRequest6.seqNo();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[delete {[null][null][null]}][null][null]}", deleteRequest6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNull(writeConsistencyLevel10);
        org.junit.Assert.assertNull(writeConsistencyLevel11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest0.parent("hi!");
        org.elasticsearch.common.transport.TransportAddress transportAddress7 = deleteRequest0.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest("");
        java.lang.String str10 = deleteRequest9.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str12 = deleteRequest11.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest11.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest14.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest16.routing("");
        org.elasticsearch.tasks.TaskId taskId19 = deleteRequest18.getParentTask();
        java.lang.String[] strArray20 = deleteRequest18.indices();
        org.elasticsearch.tasks.TaskId taskId21 = deleteRequest18.getParentTask();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel22 = deleteRequest18.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest9.consistencyLevel(writeConsistencyLevel22);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest0.consistencyLevel(writeConsistencyLevel22);
        org.elasticsearch.index.shard.IndexShard indexShard25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult26 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest0, indexShard25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNull(transportAddress7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(taskId19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(taskId21);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel22 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel22.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(deleteRequest24);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        java.lang.String str6 = deleteRequest3.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.routing("");
        org.elasticsearch.index.shard.IndexShard indexShard11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult12 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest10, indexShard11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.index.VersionType versionType8 = deleteRequest5.versionType();
        boolean boolean9 = deleteRequest5.refresh();
        java.lang.String str10 = deleteRequest5.getDescription();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(versionType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "delete {[null][null][hi!]}" + "'", str10, "delete {[null][null][hi!]}");
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str3 = deleteRequest2.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.id("hi!");
        long long8 = deleteRequest5.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest5.routing("delete {[null][null][null]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[null][null][hi!]}", deleteRequest10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest10);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest7.getParentTask();
        java.lang.String[] strArray9 = deleteRequest7.indices();
        org.elasticsearch.tasks.TaskId taskId10 = deleteRequest7.getParentTask();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = deleteRequest7.consistencyLevel();
        boolean boolean12 = deleteRequest7.getShouldPersistResult();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(taskId10);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel11 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel11.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.refresh(false);
        org.elasticsearch.index.shard.IndexShard indexShard8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete9 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest3, indexShard8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.id("hi!");
        java.lang.String str5 = deleteRequest4.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest4.parent("delete {[][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.refresh(true);
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = deleteRequest7.remoteAddress();
        org.elasticsearch.common.io.stream.StreamInput streamInput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest7.readFrom(streamInput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNull(transportAddress10);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        java.lang.String str2 = deleteRequest0.routing();
        org.elasticsearch.index.VersionType versionType3 = deleteRequest0.versionType();
        java.lang.String str4 = deleteRequest0.index();
        org.elasticsearch.index.shard.IndexShard indexShard5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete6 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest0, indexShard5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        java.lang.String str2 = deleteRequest1.index();
        org.elasticsearch.index.shard.ShardId shardId3 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest1.setShardId(shardId3);
        org.elasticsearch.index.VersionType versionType5 = deleteRequest4.versionType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(versionType5);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest0.parent("hi!");
        org.elasticsearch.common.transport.TransportAddress transportAddress7 = deleteRequest0.remoteAddress();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.writeTo(streamOutput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNull(transportAddress7);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str3 = deleteRequest2.routing();
        org.elasticsearch.action.support.IndicesOptions indicesOptions4 = deleteRequest2.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][hi!]}");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = deleteRequest6.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest2.consistencyLevel(writeConsistencyLevel7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest2.version((long) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "", deleteRequest10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(indicesOptions4);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel7 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel7.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.common.unit.TimeValue timeValue8 = deleteRequest7.timeout();
        long long9 = deleteRequest7.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str11 = deleteRequest10.routing();
        org.elasticsearch.action.support.IndicesOptions indicesOptions12 = deleteRequest10.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][hi!]}");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel15 = deleteRequest14.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest10.consistencyLevel(writeConsistencyLevel15);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest7.consistencyLevel(writeConsistencyLevel15);
        org.elasticsearch.common.io.stream.StreamInput streamInput18 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest17.readFrom(streamInput18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(indicesOptions12);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel15 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel15.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(deleteRequest17);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][null][null]}", "delete {[null][null][hi!]}", "delete {[delete {[null][null][null]}][delete {[][null][null]}][hi!]}");
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        long long3 = deleteRequest2.version();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.consistencyLevel(writeConsistencyLevel4);
        long long6 = deleteRequest5.seqNo();
        org.elasticsearch.index.shard.IndexShard indexShard7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult8 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest5, indexShard7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3L) + "'", long3 == (-3L));
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][null][null]}", "delete {[null][null][]}", "");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "", deleteRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str3 = deleteRequest2.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.routing("");
        org.elasticsearch.tasks.TaskId taskId10 = deleteRequest9.getParentTask();
        java.lang.String[] strArray11 = deleteRequest9.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel16 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest15.consistencyLevel(writeConsistencyLevel16);
        org.elasticsearch.action.support.IndicesOptions indicesOptions18 = deleteRequest15.indicesOptions();
        org.elasticsearch.index.shard.ShardId shardId19 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest15.setShardId(shardId19);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str25 = deleteRequest24.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest24.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest27.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest29.routing("");
        org.elasticsearch.tasks.TaskId taskId32 = deleteRequest31.getParentTask();
        org.elasticsearch.tasks.Task task33 = deleteRequest15.createTask(100L, "delete {[null][null][null]}", "delete {[null][null][null]}", taskId32);
        org.elasticsearch.tasks.Task task34 = deleteRequest9.createTask((long) (short) 10, "delete {[hi!][null][null]}", "delete {[][null][null]}", taskId32);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "", deleteRequest9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(taskId10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(indicesOptions18);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertNotNull(taskId32);
        org.junit.Assert.assertNotNull(task33);
        org.junit.Assert.assertNotNull(task34);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.refresh(false);
        long long8 = deleteRequest7.primaryTerm();
        org.elasticsearch.index.shard.ShardId shardId9 = deleteRequest7.shardId();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest7.id("hi!");
        long long12 = deleteRequest7.seqNo();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(shardId9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest7.getParentTask();
        java.lang.String[] strArray9 = deleteRequest7.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest7.version((long) 10);
        org.elasticsearch.common.transport.TransportAddress transportAddress12 = null;
        deleteRequest11.remoteAddress(transportAddress12);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest11.parent("hi!");
        java.lang.String str16 = deleteRequest15.parent();
        org.elasticsearch.common.unit.TimeValue timeValue17 = deleteRequest15.timeout();
        org.elasticsearch.common.io.stream.StreamInput streamInput18 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest15.readFrom(streamInput18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(timeValue17);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}", "delete {[null][null][null]}", "hi!");
        java.lang.String str4 = deleteRequest3.id();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.timeout("delete {[][null][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[][null][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest7.getParentTask();
        java.lang.String[] strArray9 = deleteRequest7.indices();
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = deleteRequest7.remoteAddress();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest7.consistencyLevel(writeConsistencyLevel11);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest12.version((long) (short) 10);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest14.version((long) 10);
        org.elasticsearch.index.shard.IndexShard indexShard17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult18 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest16, indexShard17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(transportAddress10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest16);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str9 = deleteRequest8.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest8.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.routing("");
        org.elasticsearch.tasks.TaskId taskId16 = deleteRequest15.getParentTask();
        deleteRequest7.setParentTask(taskId16);
        java.lang.String str18 = deleteRequest7.toString();
        org.elasticsearch.common.io.stream.StreamInput streamInput19 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest7.readFrom(streamInput19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(taskId16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "delete {[null][null][hi!]}" + "'", str18, "delete {[null][null][hi!]}");
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        deleteRequest5.seqNo((long) (short) 100);
        org.elasticsearch.index.shard.ShardId shardId8 = deleteRequest5.shardId();
        org.elasticsearch.common.transport.TransportAddress transportAddress9 = null;
        deleteRequest5.remoteAddress(transportAddress9);
        long long11 = deleteRequest5.primaryTerm();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(shardId8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting10 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str13 = deleteRequest12.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest12.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest15.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest15.refresh(false);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException20 = deleteRequest19.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure22 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting10, "hi!", (java.lang.Throwable) actionRequestValidationException20, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure24 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "hi!", (java.lang.Throwable) actionRequestValidationException20, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure26 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "delete {[null][null][null]}", (java.lang.Throwable) actionRequestValidationException20, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure28 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[null][null][null]}", (java.lang.Throwable) actionRequestValidationException20, "hi!");
        java.lang.Throwable throwable29 = shardFailure28.cause;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure31 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "", throwable29, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure33 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[][null][null]}", throwable29, "delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting34 = shardFailure33.routing;
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(actionRequestValidationException20);
        org.junit.Assert.assertNotNull(throwable29);
        org.junit.Assert.assertEquals(throwable29.getLocalizedMessage(), "Validation Failed: 1: index is missing;2: type is missing;");
        org.junit.Assert.assertEquals(throwable29.getMessage(), "Validation Failed: 1: index is missing;2: type is missing;");
        org.junit.Assert.assertEquals(throwable29.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;2: type is missing;");
        org.junit.Assert.assertNull(shardRouting34);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str5 = deleteRequest4.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest4.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest7.refresh(false);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException12 = deleteRequest11.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure14 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "hi!", (java.lang.Throwable) actionRequestValidationException12, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure16 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "", (java.lang.Throwable) actionRequestValidationException12, "delete {[null][null][null]}");
        java.lang.String str17 = shardFailure16.reason;
        java.lang.String str18 = shardFailure16.reason;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(actionRequestValidationException12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        java.lang.String str2 = deleteRequest1.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest1.parent("delete {[hi!][null][null]}");
        org.elasticsearch.index.shard.ShardId shardId5 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.setShardId(shardId5);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str8 = deleteRequest7.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest7.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest12.routing("");
        org.elasticsearch.tasks.TaskId taskId15 = deleteRequest12.getParentTask();
        deleteRequest6.setParentTask(taskId15);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(taskId15);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str5 = deleteRequest4.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest4.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest7.refresh(false);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException12 = deleteRequest11.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure14 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "hi!", (java.lang.Throwable) actionRequestValidationException12, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure16 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[null][null][hi!]}", (java.lang.Throwable) actionRequestValidationException12, "delete {[null][null][hi!]}");
        java.lang.Class<?> wildcardClass17 = shardFailure16.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(actionRequestValidationException12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.id("delete {[delete {[null][null][null]}][delete {[][null][null]}][hi!]}");
        org.elasticsearch.common.io.stream.StreamInput streamInput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest7.readFrom(streamInput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][null][null]}", "delete {[null][null][hi!]}", "");
        deleteRequest3.setParentTask("hi!", 100L);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        long long6 = deleteRequest3.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.routing("delete {[null][null][null]}");
        org.elasticsearch.index.shard.ShardId shardId9 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setShardId(shardId9);
        java.lang.String str11 = deleteRequest10.id();
        org.elasticsearch.index.shard.IndexShard indexShard12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult13 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest10, indexShard12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.parent("");
        org.elasticsearch.index.shard.ShardId shardId5 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.setShardId(shardId5);
        long long7 = deleteRequest6.seqNo();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.support.IndicesOptions indicesOptions2 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.id("delete {[null][null][null]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress7 = deleteRequest6.remoteAddress();
        java.lang.String str8 = deleteRequest6.index();
        boolean boolean9 = deleteRequest6.refresh();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(indicesOptions2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNull(transportAddress7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest0.parent("hi!");
        java.lang.String str7 = deleteRequest0.toString();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.writeTo(streamOutput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "delete {[null][null][null]}" + "'", str7, "delete {[null][null][null]}");
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.index.shard.ShardId shardId2 = deleteRequest0.shardId();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.version((long) (short) -1);
        org.elasticsearch.common.transport.TransportAddress transportAddress5 = null;
        deleteRequest4.remoteAddress(transportAddress5);
        org.elasticsearch.index.VersionType versionType7 = deleteRequest4.versionType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(shardId2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(versionType7);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.setShardId(shardId4);
        org.elasticsearch.index.shard.IndexShard indexShard6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete7 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest5, indexShard6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest7.getParentTask();
        java.lang.String[] strArray9 = deleteRequest7.indices();
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = deleteRequest7.remoteAddress();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest7.consistencyLevel(writeConsistencyLevel11);
        org.elasticsearch.index.shard.IndexShard indexShard13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete14 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest12, indexShard13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(transportAddress10);
        org.junit.Assert.assertNotNull(deleteRequest12);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        java.lang.String str2 = deleteRequest0.routing();
        java.lang.Class<?> wildcardClass3 = deleteRequest0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.refresh(false);
        long long8 = deleteRequest7.primaryTerm();
        org.elasticsearch.index.shard.ShardId shardId9 = deleteRequest7.shardId();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest7.id("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue12 = deleteRequest11.timeout();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest11.writeTo(streamOutput13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(shardId9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(timeValue12);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.elasticsearch.action.support.replication.ReplicationTask replicationTask0 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.setPhase(replicationTask0, "delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}");
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.type("delete {[null][null][null]}");
        deleteRequest6.setParentTask("hi!", (long) 'a');
        org.elasticsearch.index.shard.IndexShard indexShard10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult11 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest6, indexShard10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        java.lang.String str6 = deleteRequest5.type();
        deleteRequest5.primaryTerm((long) (byte) 0);
        java.lang.String str9 = deleteRequest5.index();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str3 = deleteRequest2.routing();
        java.lang.String str4 = deleteRequest2.routing();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "", deleteRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}", "delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}");
        deleteRequest3.setParentTask("delete {[null][delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}][delete {[][null][null]}]}", (long) (short) 100);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
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
        java.util.List<org.elasticsearch.index.shard.SearchOperationListener> searchOperationListenerList15 = null;
        java.util.List<org.elasticsearch.index.shard.IndexingOperationListener> indexingOperationListenerList16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.shard.IndexShard indexShard17 = new org.elasticsearch.index.shard.IndexShard(shardRouting0, indexSettings1, shardPath2, store3, indexCache4, mapperService5, similarityService6, indexFieldDataService7, engineFactory8, indexEventListener9, indexSearcherWrapper10, threadPool11, bigArrays12, warmer13, runnable14, searchOperationListenerList15, indexingOperationListenerList16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.type("delete {[null][null][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.type("delete {[delete {[null][null][null]}][delete {[][null][null]}][hi!]}");
        org.elasticsearch.index.shard.IndexShard indexShard5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult6 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest0, indexShard5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        deleteRequest3.primaryTerm((long) (short) 10);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.routing("delete {[delete {[null][null][null]}][delete {[][null][null]}][hi!]}");
        java.lang.String str8 = deleteRequest3.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.version((-1L));
        java.lang.String str11 = deleteRequest3.type();
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "delete {[delete {[null][null][null]}][delete {[][null][null]}][hi!]}" + "'", str8, "delete {[delete {[null][null][null]}][delete {[][null][null]}][hi!]}");
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str11 = deleteRequest10.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest10.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest13.refresh(false);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException18 = deleteRequest17.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure20 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "hi!", (java.lang.Throwable) actionRequestValidationException18, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure22 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "hi!", (java.lang.Throwable) actionRequestValidationException18, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure24 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[null][null][null]}", (java.lang.Throwable) actionRequestValidationException18, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure26 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "hi!", (java.lang.Throwable) actionRequestValidationException18, "delete {[null][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure28 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "", (java.lang.Throwable) actionRequestValidationException18, "");
        java.lang.Throwable throwable29 = shardFailure28.cause;
        java.lang.String str30 = shardFailure28.indexUUID;
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(actionRequestValidationException18);
        org.junit.Assert.assertNotNull(throwable29);
        org.junit.Assert.assertEquals(throwable29.getLocalizedMessage(), "Validation Failed: 1: index is missing;2: type is missing;");
        org.junit.Assert.assertEquals(throwable29.getMessage(), "Validation Failed: 1: index is missing;2: type is missing;");
        org.junit.Assert.assertEquals(throwable29.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;2: type is missing;");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest7.getParentTask();
        java.lang.String[] strArray9 = deleteRequest7.indices();
        boolean boolean10 = deleteRequest7.refresh();
        org.elasticsearch.index.shard.IndexShard indexShard11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete12 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest7, indexShard11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str3 = deleteRequest2.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str11 = deleteRequest10.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest10.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest15.routing("");
        org.elasticsearch.tasks.TaskId taskId18 = deleteRequest17.getParentTask();
        deleteRequest9.setParentTask(taskId18);
        org.elasticsearch.index.shard.ShardId shardId20 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest9.setShardId(shardId20);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest9.parent("delete {[null][null][null]}");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException24 = deleteRequest23.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure26 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[null][null][hi!]}", (java.lang.Throwable) actionRequestValidationException24, "hi!");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting27 = shardFailure26.routing;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(taskId18);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(actionRequestValidationException24);
        org.junit.Assert.assertNull(shardRouting27);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str7 = deleteRequest6.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest9.refresh(false);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException14 = deleteRequest13.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure16 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "hi!", (java.lang.Throwable) actionRequestValidationException14, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure18 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "hi!", (java.lang.Throwable) actionRequestValidationException14, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure20 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[null][null][null]}", (java.lang.Throwable) actionRequestValidationException14, "hi!");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting21 = shardFailure20.routing;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(actionRequestValidationException14);
        org.junit.Assert.assertNull(shardRouting21);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.type("delete {[null][null][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.type("delete {[delete {[null][null][null]}][delete {[][null][null]}][hi!]}");
        deleteRequest4.setParentTask("delete {[hi!][null][null]}", (long) (short) 1);
        java.lang.Class<?> wildcardClass8 = deleteRequest4.getClass();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][hi!]}", "delete {[null][null][hi!]}", "");
        org.elasticsearch.index.shard.IndexShard indexShard4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete5 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest3, indexShard4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str9 = deleteRequest8.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest8.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.routing("");
        org.elasticsearch.tasks.TaskId taskId16 = deleteRequest15.getParentTask();
        deleteRequest7.setParentTask(taskId16);
        org.elasticsearch.index.shard.ShardId shardId18 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest7.setShardId(shardId18);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest7.parent("delete {[null][null][null]}");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException22 = deleteRequest21.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str24 = deleteRequest23.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest23.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest26.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest26.refresh(false);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException31 = deleteRequest30.validate();
        org.elasticsearch.tasks.TaskId taskId32 = deleteRequest30.getParentTask();
        deleteRequest21.setParentTask(taskId32);
        java.lang.String str34 = deleteRequest21.index();
        java.lang.Class<?> wildcardClass35 = deleteRequest21.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(taskId16);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(actionRequestValidationException22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertNotNull(actionRequestValidationException31);
        org.junit.Assert.assertNotNull(taskId32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}", "", "hi!");
        boolean boolean4 = deleteRequest3.getShouldPersistResult();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.timeout("delete {[null][null][hi!]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[null][null][hi!]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}", "delete {[null][delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}][delete {[][null][null]}]}", "");
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest7.getParentTask();
        java.lang.String[] strArray9 = deleteRequest7.indices();
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = deleteRequest7.remoteAddress();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest7.consistencyLevel(writeConsistencyLevel11);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest7.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str19 = deleteRequest18.routing();
        java.lang.String str20 = deleteRequest18.routing();
        org.elasticsearch.index.VersionType versionType21 = deleteRequest18.versionType();
        java.lang.String str22 = deleteRequest18.toString();
        org.elasticsearch.tasks.TaskId taskId23 = deleteRequest18.getParentTask();
        org.elasticsearch.tasks.Task task24 = deleteRequest14.createTask((long) '4', "delete {[][null][null]}", "delete {[null][delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}][delete {[][null][null]}]}", taskId23);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput25 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest14.writeTo(streamOutput25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(transportAddress10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(versionType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "delete {[null][null][null]}" + "'", str22, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(taskId23);
        org.junit.Assert.assertNotNull(task24);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.index.shard.ShardId shardId4 = deleteRequest3.shardId();
        org.elasticsearch.index.shard.IndexShard indexShard5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult6 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest3, indexShard5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNull(shardId4);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}", "delete {[null][null][null]}", "delete {[null][null][null]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout("delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest7.getParentTask();
        java.lang.String[] strArray9 = deleteRequest7.indices();
        org.elasticsearch.index.VersionType versionType10 = deleteRequest7.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest7.index("");
        org.elasticsearch.common.io.stream.StreamInput streamInput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest7.readFrom(streamInput13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(versionType10);
        org.junit.Assert.assertNotNull(deleteRequest12);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.setShardId(shardId6);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.refresh(true);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str11 = deleteRequest10.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest10.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest15.routing("");
        org.elasticsearch.tasks.TaskId taskId18 = deleteRequest17.getParentTask();
        java.lang.String[] strArray19 = deleteRequest17.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest17.version((long) 10);
        org.elasticsearch.common.transport.TransportAddress transportAddress22 = null;
        deleteRequest21.remoteAddress(transportAddress22);
        org.elasticsearch.common.unit.TimeValue timeValue24 = deleteRequest21.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest9.timeout(timeValue24);
        java.lang.Class<?> wildcardClass26 = timeValue24.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(taskId18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(timeValue24);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}", "delete {[null][null][null]}", "hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.parent("delete {[null][null][null]}");
        org.elasticsearch.common.io.stream.StreamOutput streamOutput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.writeTo(streamOutput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = deleteRequest0.indicesOptions();
        org.elasticsearch.index.VersionType versionType4 = deleteRequest0.versionType();
        java.lang.String[] strArray5 = deleteRequest0.indices();
        java.lang.String[] strArray6 = deleteRequest0.indices();
        long long7 = deleteRequest0.primaryTerm();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException8 = deleteRequest0.validate();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.writeTo(streamOutput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(indicesOptions3);
        org.junit.Assert.assertNotNull(versionType4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(actionRequestValidationException8);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str3 = deleteRequest2.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.id("hi!");
        long long8 = deleteRequest5.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest5.routing("delete {[null][null][null]}");
        org.elasticsearch.index.shard.ShardId shardId11 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest5.setShardId(shardId11);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest12.routing("delete {[][null][null]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress15 = null;
        deleteRequest12.remoteAddress(transportAddress15);
        org.elasticsearch.common.transport.TransportAddress transportAddress17 = deleteRequest12.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str19 = deleteRequest18.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest18.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest21.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest23.routing("");
        org.elasticsearch.tasks.TaskId taskId26 = deleteRequest25.getParentTask();
        java.lang.String[] strArray27 = deleteRequest25.indices();
        org.elasticsearch.common.transport.TransportAddress transportAddress28 = deleteRequest25.remoteAddress();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel29 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest25.consistencyLevel(writeConsistencyLevel29);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest30.version((long) (short) 10);
        java.lang.String str33 = deleteRequest32.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = deleteRequest32.id("delete {[null][null][hi!]}");
        org.elasticsearch.index.VersionType versionType36 = deleteRequest32.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest37 = deleteRequest12.versionType(versionType36);
        long long38 = deleteRequest37.primaryTerm();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "", deleteRequest37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNull(transportAddress17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(taskId26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNull(transportAddress28);
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(deleteRequest35);
        org.junit.Assert.assertNotNull(versionType36);
        org.junit.Assert.assertNotNull(deleteRequest37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel3 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.consistencyLevel(writeConsistencyLevel3);
        long long5 = deleteRequest4.version();
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest4.remoteAddress(transportAddress6);
        deleteRequest4.primaryTerm((long) (byte) 10);
        java.lang.String str10 = deleteRequest4.toString();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException11 = deleteRequest4.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure13 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[null][null][hi!]}", (java.lang.Throwable) actionRequestValidationException11, "delete {[null][null][]}");
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-3L) + "'", long5 == (-3L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "delete {[null][null][null]}" + "'", str10, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(actionRequestValidationException11);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[null][null][null]}][null][null]}", "delete {[delete {[null][null][null]}][delete {[][null][null]}][hi!]}", "delete {[delete {[null][null][null]}][null][null]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout("");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.setShardId(shardId6);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.refresh(true);
        java.lang.Class<?> wildcardClass10 = deleteRequest7.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.elasticsearch.action.support.replication.ReplicationTask replicationTask0 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.setPhase(replicationTask0, "delete {[null][delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}][delete {[][null][null]}]}");
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting10 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str13 = deleteRequest12.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest12.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest15.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest15.refresh(false);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException20 = deleteRequest19.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure22 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting10, "hi!", (java.lang.Throwable) actionRequestValidationException20, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure24 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "hi!", (java.lang.Throwable) actionRequestValidationException20, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure26 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "delete {[null][null][null]}", (java.lang.Throwable) actionRequestValidationException20, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure28 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "hi!", (java.lang.Throwable) actionRequestValidationException20, "delete {[null][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure30 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "", (java.lang.Throwable) actionRequestValidationException20, "");
        java.lang.Throwable throwable31 = shardFailure30.cause;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure33 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "", throwable31, "hi!");
        java.lang.Class<?> wildcardClass34 = shardFailure33.getClass();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(actionRequestValidationException20);
        org.junit.Assert.assertNotNull(throwable31);
        org.junit.Assert.assertEquals(throwable31.getLocalizedMessage(), "Validation Failed: 1: index is missing;2: type is missing;");
        org.junit.Assert.assertEquals(throwable31.getMessage(), "Validation Failed: 1: index is missing;2: type is missing;");
        org.junit.Assert.assertEquals(throwable31.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;2: type is missing;");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        java.lang.String str3 = deleteRequest0.index();
        long long4 = deleteRequest0.seqNo();
        org.elasticsearch.tasks.TaskId taskId5 = deleteRequest0.getParentTask();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.writeTo(streamOutput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(taskId5);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}", "delete {[null][null][null]}", "hi!");
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.setShardId(shardId4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest3.remoteAddress(transportAddress6);
        org.junit.Assert.assertNotNull(deleteRequest5);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest7.getParentTask();
        java.lang.String[] strArray9 = deleteRequest7.indices();
        boolean boolean10 = deleteRequest7.refresh();
        java.lang.String str11 = deleteRequest7.index();
        java.lang.String str12 = deleteRequest7.type();
        org.elasticsearch.index.shard.ShardId shardId13 = deleteRequest7.shardId();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str15 = deleteRequest14.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest14.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest17.id("hi!");
        long long20 = deleteRequest17.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest17.routing("delete {[null][null][null]}");
        org.elasticsearch.index.shard.ShardId shardId23 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest17.setShardId(shardId23);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest24.routing("delete {[][null][null]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress27 = null;
        deleteRequest24.remoteAddress(transportAddress27);
        org.elasticsearch.common.transport.TransportAddress transportAddress29 = deleteRequest24.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str31 = deleteRequest30.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest30.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = deleteRequest33.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest37 = deleteRequest35.routing("");
        org.elasticsearch.tasks.TaskId taskId38 = deleteRequest37.getParentTask();
        java.lang.String[] strArray39 = deleteRequest37.indices();
        org.elasticsearch.common.transport.TransportAddress transportAddress40 = deleteRequest37.remoteAddress();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel41 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest42 = deleteRequest37.consistencyLevel(writeConsistencyLevel41);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest44 = deleteRequest42.version((long) (short) 10);
        java.lang.String str45 = deleteRequest44.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest47 = deleteRequest44.id("delete {[null][null][hi!]}");
        org.elasticsearch.index.VersionType versionType48 = deleteRequest44.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest49 = deleteRequest24.versionType(versionType48);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest50 = deleteRequest7.versionType(versionType48);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(shardId13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNull(transportAddress29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertNotNull(deleteRequest35);
        org.junit.Assert.assertNotNull(deleteRequest37);
        org.junit.Assert.assertNotNull(taskId38);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNull(transportAddress40);
        org.junit.Assert.assertNotNull(deleteRequest42);
        org.junit.Assert.assertNotNull(deleteRequest44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(deleteRequest47);
        org.junit.Assert.assertNotNull(versionType48);
        org.junit.Assert.assertNotNull(deleteRequest49);
        org.junit.Assert.assertNotNull(deleteRequest50);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest7.getParentTask();
        java.lang.String[] strArray9 = deleteRequest7.indices();
        org.elasticsearch.index.VersionType versionType10 = deleteRequest7.versionType();
        java.lang.Class<?> wildcardClass11 = versionType10.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(versionType10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        long long6 = deleteRequest5.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest5.type("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest5.id("delete {[][null][null]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest5.timeout("hi!");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [hi!] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str11 = deleteRequest10.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest10.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest13.refresh(false);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException18 = deleteRequest17.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure20 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "hi!", (java.lang.Throwable) actionRequestValidationException18, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure22 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "", (java.lang.Throwable) actionRequestValidationException18, "delete {[null][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure24 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "", (java.lang.Throwable) actionRequestValidationException18, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure26 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}", (java.lang.Throwable) actionRequestValidationException18, "delete {[delete {[null][null][null]}][delete {[][null][null]}][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure28 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[delete {[null][null][hi!]}][null][hi!]}", (java.lang.Throwable) actionRequestValidationException18, "hi!");
        java.lang.String str29 = shardFailure28.indexUUID;
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(actionRequestValidationException18);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.setShardId(shardId6);
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = null;
        deleteRequest3.remoteAddress(transportAddress8);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest3.index("delete {[null][null][]}");
        long long12 = deleteRequest3.seqNo();
        org.elasticsearch.common.io.stream.StreamInput streamInput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.readFrom(streamInput13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        long long4 = deleteRequest3.primaryTerm();
        deleteRequest3.primaryTerm(0L);
        org.elasticsearch.common.io.stream.StreamInput streamInput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.readFrom(streamInput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str7 = deleteRequest6.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest9.refresh(false);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException14 = deleteRequest13.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure16 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[null][null][null]}", (java.lang.Throwable) actionRequestValidationException14, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure18 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[][null][null]}", (java.lang.Throwable) actionRequestValidationException14, "delete {[null][null][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure20 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[null][delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}][delete {[][null][null]}]}", (java.lang.Throwable) actionRequestValidationException14, "hi!");
        java.lang.Class<?> wildcardClass21 = shardFailure20.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(actionRequestValidationException14);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        java.lang.String str4 = deleteRequest3.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.parent("delete {[hi!][null][null]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[null][delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}][delete {[][null][null]}]}", deleteRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(deleteRequest6);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.elasticsearch.action.support.replication.ReplicationTask replicationTask0 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.setPhase(replicationTask0, "delete {[hi!][][delete {[null][null][null]}]}");
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.refresh(false);
        deleteRequest7.primaryTerm((long) 100);
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = deleteRequest7.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest7.index("delete {[null][null][hi!]}");
        org.elasticsearch.common.io.stream.StreamOutput streamOutput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest12.writeTo(streamOutput13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNull(transportAddress10);
        org.junit.Assert.assertNotNull(deleteRequest12);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.common.transport.TransportAddress transportAddress2 = deleteRequest0.remoteAddress();
        org.elasticsearch.common.transport.TransportAddress transportAddress3 = deleteRequest0.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.type("delete {[null][null][null]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.timeout("delete {[null][null][]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[null][null][]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(transportAddress2);
        org.junit.Assert.assertNull(transportAddress3);
        org.junit.Assert.assertNotNull(deleteRequest5);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting10 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str13 = deleteRequest12.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest12.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest15.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest15.refresh(false);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException20 = deleteRequest19.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure22 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting10, "hi!", (java.lang.Throwable) actionRequestValidationException20, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure24 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "hi!", (java.lang.Throwable) actionRequestValidationException20, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure26 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "delete {[null][null][null]}", (java.lang.Throwable) actionRequestValidationException20, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure28 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "hi!", (java.lang.Throwable) actionRequestValidationException20, "delete {[null][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure30 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "", (java.lang.Throwable) actionRequestValidationException20, "");
        java.lang.Throwable throwable31 = shardFailure30.cause;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure33 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "", throwable31, "hi!");
        java.lang.Throwable throwable34 = shardFailure33.cause;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting35 = shardFailure33.routing;
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(actionRequestValidationException20);
        org.junit.Assert.assertNotNull(throwable31);
        org.junit.Assert.assertEquals(throwable31.getLocalizedMessage(), "Validation Failed: 1: index is missing;2: type is missing;");
        org.junit.Assert.assertEquals(throwable31.getMessage(), "Validation Failed: 1: index is missing;2: type is missing;");
        org.junit.Assert.assertEquals(throwable31.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;2: type is missing;");
        org.junit.Assert.assertNotNull(throwable34);
        org.junit.Assert.assertEquals(throwable34.getLocalizedMessage(), "Validation Failed: 1: index is missing;2: type is missing;");
        org.junit.Assert.assertEquals(throwable34.getMessage(), "Validation Failed: 1: index is missing;2: type is missing;");
        org.junit.Assert.assertEquals(throwable34.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;2: type is missing;");
        org.junit.Assert.assertNull(shardRouting35);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.index.shard.ShardId shardId2 = deleteRequest0.shardId();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.version((long) (short) -1);
        java.lang.String str5 = deleteRequest4.type();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(shardId2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.type("delete {[null][null][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest2.type("delete {[delete {[null][null][null]}][delete {[][null][null]}][hi!]}");
        java.lang.String str7 = deleteRequest6.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[delete {[null][null][null]}][delete {[hi!][null][null]}][hi!]}", deleteRequest6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        java.lang.Class<?> wildcardClass2 = deleteRequest1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting10 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting12 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str15 = deleteRequest14.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest14.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest17.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest17.refresh(false);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException22 = deleteRequest21.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure24 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting12, "hi!", (java.lang.Throwable) actionRequestValidationException22, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure26 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting10, "hi!", (java.lang.Throwable) actionRequestValidationException22, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure28 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "delete {[null][null][null]}", (java.lang.Throwable) actionRequestValidationException22, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure30 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "delete {[delete {[null][null][null]}][delete {[][null][null]}][hi!]}", (java.lang.Throwable) actionRequestValidationException22, "delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure32 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[][null][null]}", (java.lang.Throwable) actionRequestValidationException22, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure34 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "", (java.lang.Throwable) actionRequestValidationException22, "delete {[delete {[null][null][null]}][delete {[][null][null]}][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure36 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}", (java.lang.Throwable) actionRequestValidationException22, "delete {[hi!][][delete {[null][null][null]}]}");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(actionRequestValidationException22);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[null][null][null]}][delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}][hi!]}", "", "");
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = deleteRequest0.indicesOptions();
        org.elasticsearch.index.VersionType versionType4 = deleteRequest0.versionType();
        java.lang.String[] strArray5 = deleteRequest0.indices();
        java.lang.String[] strArray6 = deleteRequest0.indices();
        org.elasticsearch.common.unit.TimeValue timeValue7 = deleteRequest0.timeout();
        long long8 = deleteRequest0.primaryTerm();
        java.lang.String str9 = deleteRequest0.getDescription();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest0.parent("delete {[null][null][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("");
        java.lang.String str14 = deleteRequest13.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str16 = deleteRequest15.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest15.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest18.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest20.routing("");
        org.elasticsearch.tasks.TaskId taskId23 = deleteRequest22.getParentTask();
        java.lang.String[] strArray24 = deleteRequest22.indices();
        org.elasticsearch.tasks.TaskId taskId25 = deleteRequest22.getParentTask();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel26 = deleteRequest22.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest13.consistencyLevel(writeConsistencyLevel26);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str29 = deleteRequest28.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest28.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest31.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = deleteRequest33.routing("");
        org.elasticsearch.tasks.TaskId taskId36 = deleteRequest35.getParentTask();
        java.lang.String[] strArray37 = deleteRequest35.indices();
        org.elasticsearch.tasks.TaskId taskId38 = deleteRequest35.getParentTask();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel39 = deleteRequest35.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest40 = deleteRequest13.consistencyLevel(writeConsistencyLevel39);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest41 = deleteRequest0.consistencyLevel(writeConsistencyLevel39);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput42 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest41.writeTo(streamOutput42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(indicesOptions3);
        org.junit.Assert.assertNotNull(versionType4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(timeValue7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "delete {[null][null][null]}" + "'", str9, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertNotNull(taskId23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(taskId25);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel26 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel26.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertNotNull(deleteRequest35);
        org.junit.Assert.assertNotNull(taskId36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(taskId38);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel39 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel39.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest40);
        org.junit.Assert.assertNotNull(deleteRequest41);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        java.lang.String str6 = deleteRequest5.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest5.index("delete {[null][null][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest5.version(1L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.parent("delete {[hi!][null][null]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest10.timeout("delete {[delete {[null][null][null]}][delete {[hi!][null][null]}][hi!]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[delete {[null][null][null]}][delete {[hi!][null][null]}][hi!]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting10 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting12 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting14 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str17 = deleteRequest16.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest16.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest19.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest19.refresh(false);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException24 = deleteRequest23.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure26 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting14, "hi!", (java.lang.Throwable) actionRequestValidationException24, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure28 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting12, "hi!", (java.lang.Throwable) actionRequestValidationException24, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure30 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting10, "delete {[null][null][null]}", (java.lang.Throwable) actionRequestValidationException24, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure32 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "delete {[null][null][null]}", (java.lang.Throwable) actionRequestValidationException24, "hi!");
        java.lang.Throwable throwable33 = shardFailure32.cause;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure35 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "delete {[null][null][hi!]}", throwable33, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure37 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "hi!", throwable33, "delete {[][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure39 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[delete {[null][null][null]}][null][null]}", throwable33, "delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure41 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}", throwable33, "delete {[delete {[null][null][null]}][delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}][hi!]}");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(actionRequestValidationException24);
        org.junit.Assert.assertNotNull(throwable33);
        org.junit.Assert.assertEquals(throwable33.getLocalizedMessage(), "Validation Failed: 1: index is missing;2: type is missing;");
        org.junit.Assert.assertEquals(throwable33.getMessage(), "Validation Failed: 1: index is missing;2: type is missing;");
        org.junit.Assert.assertEquals(throwable33.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;2: type is missing;");
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = deleteRequest0.indicesOptions();
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.setShardId(shardId4);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str7 = deleteRequest6.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.id("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue12 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.timeout(timeValue12);
        org.elasticsearch.index.VersionType versionType14 = deleteRequest11.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest5.versionType(versionType14);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel17 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest16.consistencyLevel(writeConsistencyLevel17);
        org.elasticsearch.action.support.IndicesOptions indicesOptions19 = deleteRequest16.indicesOptions();
        org.elasticsearch.index.VersionType versionType20 = deleteRequest16.versionType();
        java.lang.String[] strArray21 = deleteRequest16.indices();
        java.lang.String[] strArray22 = deleteRequest16.indices();
        org.elasticsearch.common.unit.TimeValue timeValue23 = deleteRequest16.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest15.timeout(timeValue23);
        java.lang.String str25 = deleteRequest15.routing();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(indicesOptions3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(timeValue12);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(versionType14);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(indicesOptions19);
        org.junit.Assert.assertNotNull(versionType20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(timeValue23);
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[null][null][null]}][delete {[hi!][null][null]}][hi!]}", "delete {[delete {[null][null][null]}][delete {[][null][null]}][hi!]}", "delete {[null][null][null]}");
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str7 = deleteRequest6.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str15 = deleteRequest14.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest14.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest17.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest19.routing("");
        org.elasticsearch.tasks.TaskId taskId22 = deleteRequest21.getParentTask();
        deleteRequest13.setParentTask(taskId22);
        org.elasticsearch.index.shard.ShardId shardId24 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest13.setShardId(shardId24);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest13.parent("delete {[null][null][null]}");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException28 = deleteRequest27.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure30 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[null][null][hi!]}", (java.lang.Throwable) actionRequestValidationException28, "delete {[hi!][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure32 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "", (java.lang.Throwable) actionRequestValidationException28, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure34 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[null][null][hi!]}", (java.lang.Throwable) actionRequestValidationException28, "delete {[delete {[null][null][null]}][delete {[][null][null]}][hi!]}");
        java.lang.String str35 = shardFailure34.reason;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(taskId22);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertNotNull(actionRequestValidationException28);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "delete {[null][null][hi!]}" + "'", str35, "delete {[null][null][hi!]}");
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}", "delete {[hi!][null][null]}", "");
        deleteRequest3.setParentTask("delete {[null][null][hi!]}", (long) (byte) 1);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        long long3 = deleteRequest2.version();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.consistencyLevel(writeConsistencyLevel4);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest2.index("delete {[null][null][null]}");
        boolean boolean8 = deleteRequest2.refresh();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3L) + "'", long3 == (-3L));
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.support.IndicesOptions indicesOptions2 = deleteRequest0.indicesOptions();
        boolean boolean3 = deleteRequest0.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.index("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue6 = deleteRequest5.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str8 = deleteRequest7.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest7.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest12.routing("");
        org.elasticsearch.index.VersionType versionType15 = deleteRequest12.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest5.versionType(versionType15);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest5.id("");
        deleteRequest18.setParentTask("delete {[null][null][hi!]}", (long) (short) 100);
        org.elasticsearch.index.shard.IndexShard indexShard22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult23 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest18, indexShard22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(indicesOptions2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(versionType15);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(deleteRequest18);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.support.IndicesOptions indicesOptions2 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.id("delete {[null][null][null]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress7 = deleteRequest6.remoteAddress();
        java.lang.String str8 = deleteRequest6.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str10 = deleteRequest9.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest9.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest12.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest12.refresh(false);
        long long17 = deleteRequest16.primaryTerm();
        org.elasticsearch.index.shard.ShardId shardId18 = deleteRequest16.shardId();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest16.id("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue21 = deleteRequest20.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest6.timeout(timeValue21);
        java.lang.Class<?> wildcardClass23 = deleteRequest6.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(indicesOptions2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNull(transportAddress7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNull(shardId18);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(timeValue21);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[null][null][null]}", "delete {[null][null][null]}");
        long long4 = deleteRequest3.seqNo();
        org.elasticsearch.common.transport.TransportAddress transportAddress5 = deleteRequest3.remoteAddress();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(transportAddress5);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = deleteRequest1.consistencyLevel();
        java.lang.Class<?> wildcardClass3 = writeConsistencyLevel2.getClass();
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel2 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel2.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        deleteRequest3.primaryTerm((long) (short) 10);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str10 = deleteRequest9.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest9.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest12.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest14.routing("");
        org.elasticsearch.tasks.TaskId taskId17 = deleteRequest14.getParentTask();
        org.elasticsearch.tasks.Task task18 = deleteRequest3.createTask((long) (-1), "", "hi!", taskId17);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest3.refresh(false);
        java.lang.String str21 = deleteRequest20.index();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(taskId17);
        org.junit.Assert.assertNotNull(task18);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[null][null][hi!]}", throwable2, "delete {[null][null][hi!]}");
        java.lang.Throwable throwable5 = shardFailure4.cause;
        java.lang.String str6 = shardFailure4.indexUUID;
        org.junit.Assert.assertNull(throwable5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "delete {[null][null][hi!]}" + "'", str6, "delete {[null][null][hi!]}");
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        long long3 = deleteRequest2.version();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.version((long) (short) 0);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest5.writeTo(streamOutput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3L) + "'", long3 == (-3L));
        org.junit.Assert.assertNotNull(deleteRequest5);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest7.getParentTask();
        java.lang.String[] strArray9 = deleteRequest7.indices();
        boolean boolean10 = deleteRequest7.refresh();
        java.lang.String str11 = deleteRequest7.index();
        java.lang.String str12 = deleteRequest7.type();
        org.elasticsearch.index.shard.ShardId shardId13 = deleteRequest7.shardId();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput14 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest7.writeTo(streamOutput14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(shardId13);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel3 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.consistencyLevel(writeConsistencyLevel3);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.id("hi!");
        long long7 = deleteRequest6.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.version((long) ' ');
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = deleteRequest6.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = deleteRequest6.consistencyLevel();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "", deleteRequest6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNull(writeConsistencyLevel10);
        org.junit.Assert.assertNull(writeConsistencyLevel11);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str9 = deleteRequest8.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest8.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest11.refresh(false);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException16 = deleteRequest15.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure18 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "delete {[null][null][null]}", (java.lang.Throwable) actionRequestValidationException16, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure20 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[][null][null]}", (java.lang.Throwable) actionRequestValidationException16, "delete {[null][null][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure22 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[null][delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}][delete {[][null][null]}]}", (java.lang.Throwable) actionRequestValidationException16, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure24 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[][hi!][]}", (java.lang.Throwable) actionRequestValidationException16, "");
        java.lang.Throwable throwable25 = shardFailure24.cause;
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(actionRequestValidationException16);
        org.junit.Assert.assertNotNull(throwable25);
        org.junit.Assert.assertEquals(throwable25.getLocalizedMessage(), "Validation Failed: 1: index is missing;2: type is missing;");
        org.junit.Assert.assertEquals(throwable25.getMessage(), "Validation Failed: 1: index is missing;2: type is missing;");
        org.junit.Assert.assertEquals(throwable25.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;2: type is missing;");
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.type("delete {[null][null][null]}");
        deleteRequest6.setParentTask("hi!", (long) 'a');
        org.elasticsearch.index.shard.IndexShard indexShard10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete11 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest6, indexShard10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.support.IndicesOptions indicesOptions2 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][hi!]}");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = deleteRequest4.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest0.consistencyLevel(writeConsistencyLevel5);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest0.version((long) '4');
        deleteRequest8.seqNo(100L);
        java.lang.String str11 = deleteRequest8.index();
        org.elasticsearch.index.shard.IndexShard indexShard12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete13 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest8, indexShard12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(indicesOptions2);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel5 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel5.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}", "delete {[null][null][hi!]}", "delete {[null][null][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.routing("delete {[null][null][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.version((long) (byte) 0);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.writeTo(streamOutput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.routing("delete {[null][null][null]}");
        java.lang.Class<?> wildcardClass6 = deleteRequest5.getClass();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(indicesOptions3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str3 = deleteRequest2.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest5.refresh(false);
        deleteRequest9.primaryTerm((long) 100);
        org.elasticsearch.common.transport.TransportAddress transportAddress12 = deleteRequest9.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest9.index("delete {[null][null][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str16 = deleteRequest15.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest15.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest18.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest20.routing("");
        org.elasticsearch.common.unit.TimeValue timeValue23 = deleteRequest22.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest14.timeout(timeValue23);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "", deleteRequest24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNull(transportAddress12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertNotNull(timeValue23);
        org.junit.Assert.assertNotNull(deleteRequest24);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest7.getParentTask();
        org.elasticsearch.common.transport.TransportAddress transportAddress9 = deleteRequest7.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest7.parent("hi!");
        org.elasticsearch.index.shard.IndexShard indexShard12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete13 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest11, indexShard12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNull(transportAddress9);
        org.junit.Assert.assertNotNull(deleteRequest11);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        java.lang.String str2 = deleteRequest0.toString();
        org.elasticsearch.common.transport.TransportAddress transportAddress3 = null;
        deleteRequest0.remoteAddress(transportAddress3);
        java.lang.String[] strArray5 = deleteRequest0.indices();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "delete {[null][null][null]}" + "'", str2, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.index.VersionType versionType8 = deleteRequest5.versionType();
        boolean boolean9 = deleteRequest5.refresh();
        org.elasticsearch.common.io.stream.StreamInput streamInput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest5.readFrom(streamInput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(versionType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][hi!]}", "delete {[null][null][hi!]}", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("");
        long long6 = deleteRequest5.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest5.refresh(true);
        java.lang.String str9 = deleteRequest5.toString();
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "delete {[delete {[null][null][hi!]}][delete {[null][null][hi!]}][]}" + "'", str9, "delete {[delete {[null][null][hi!]}][delete {[null][null][hi!]}][]}");
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting10 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting12 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting14 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str17 = deleteRequest16.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest16.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest19.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest19.refresh(false);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException24 = deleteRequest23.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure26 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting14, "hi!", (java.lang.Throwable) actionRequestValidationException24, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure28 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting12, "hi!", (java.lang.Throwable) actionRequestValidationException24, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure30 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting10, "delete {[null][null][null]}", (java.lang.Throwable) actionRequestValidationException24, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure32 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "hi!", (java.lang.Throwable) actionRequestValidationException24, "delete {[null][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure34 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "", (java.lang.Throwable) actionRequestValidationException24, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure36 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[delete {[null][null][null]}][delete {[][null][null]}][hi!]}", (java.lang.Throwable) actionRequestValidationException24, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure38 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[][hi!][]}", (java.lang.Throwable) actionRequestValidationException24, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure40 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[null][null][hi!]}", (java.lang.Throwable) actionRequestValidationException24, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(actionRequestValidationException24);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.common.transport.TransportAddress transportAddress2 = deleteRequest0.remoteAddress();
        org.elasticsearch.common.transport.TransportAddress transportAddress3 = deleteRequest0.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.type("delete {[null][null][null]}");
        org.elasticsearch.index.shard.IndexShard indexShard6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult7 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest5, indexShard6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(transportAddress2);
        org.junit.Assert.assertNull(transportAddress3);
        org.junit.Assert.assertNotNull(deleteRequest5);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        long long3 = deleteRequest2.version();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.consistencyLevel(writeConsistencyLevel4);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest2.index("delete {[null][null][null]}");
        java.lang.String str8 = deleteRequest2.toString();
        org.elasticsearch.common.transport.TransportAddress transportAddress9 = deleteRequest2.remoteAddress();
        java.lang.String str10 = deleteRequest2.type();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3L) + "'", long3 == (-3L));
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "delete {[delete {[null][null][null]}][null][null]}" + "'", str8, "delete {[delete {[null][null][null]}][null][null]}");
        org.junit.Assert.assertNull(transportAddress9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str3 = deleteRequest2.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.id("hi!");
        org.elasticsearch.index.shard.ShardId shardId8 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest5.setShardId(shardId8);
        org.elasticsearch.common.unit.TimeValue timeValue10 = deleteRequest5.timeout();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException11 = deleteRequest5.validate();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[delete {[null][null][null]}][null][null]}", deleteRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(timeValue10);
        org.junit.Assert.assertNotNull(actionRequestValidationException11);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.setShardId(shardId4);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest5.writeTo(streamOutput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting10 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting12 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str15 = deleteRequest14.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest14.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest17.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest17.refresh(false);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException22 = deleteRequest21.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure24 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting12, "hi!", (java.lang.Throwable) actionRequestValidationException22, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure26 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting10, "hi!", (java.lang.Throwable) actionRequestValidationException22, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure28 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "delete {[null][null][null]}", (java.lang.Throwable) actionRequestValidationException22, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure30 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "delete {[null][null][null]}", (java.lang.Throwable) actionRequestValidationException22, "hi!");
        java.lang.Throwable throwable31 = shardFailure30.cause;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure33 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[null][null][hi!]}", throwable31, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure35 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "hi!", throwable31, "delete {[][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure37 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[delete {[null][null][null]}][null][null]}", throwable31, "delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}");
        java.lang.String str38 = shardFailure37.reason;
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(actionRequestValidationException22);
        org.junit.Assert.assertNotNull(throwable31);
        org.junit.Assert.assertEquals(throwable31.getLocalizedMessage(), "Validation Failed: 1: index is missing;2: type is missing;");
        org.junit.Assert.assertEquals(throwable31.getMessage(), "Validation Failed: 1: index is missing;2: type is missing;");
        org.junit.Assert.assertEquals(throwable31.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;2: type is missing;");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "delete {[delete {[null][null][null]}][null][null]}" + "'", str38, "delete {[delete {[null][null][null]}][null][null]}");
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest7.getParentTask();
        java.lang.String[] strArray9 = deleteRequest7.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest7.version((long) 10);
        org.elasticsearch.common.transport.TransportAddress transportAddress12 = deleteRequest11.remoteAddress();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest11.timeout("delete {[][null][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[][null][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNull(transportAddress12);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = deleteRequest0.indicesOptions();
        org.elasticsearch.index.VersionType versionType4 = deleteRequest0.versionType();
        java.lang.String[] strArray5 = deleteRequest0.indices();
        java.lang.String[] strArray6 = deleteRequest0.indices();
        org.elasticsearch.common.unit.TimeValue timeValue7 = deleteRequest0.timeout();
        org.elasticsearch.index.shard.IndexShard indexShard8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult9 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest0, indexShard8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(indicesOptions3);
        org.junit.Assert.assertNotNull(versionType4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(timeValue7);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        java.lang.String str6 = deleteRequest3.index();
        java.lang.String str7 = deleteRequest3.parent();
        org.elasticsearch.action.support.IndicesOptions indicesOptions8 = deleteRequest3.indicesOptions();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(indicesOptions8);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest7.getParentTask();
        org.elasticsearch.common.transport.TransportAddress transportAddress9 = deleteRequest7.remoteAddress();
        java.lang.String str10 = deleteRequest7.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest7.refresh(true);
        org.elasticsearch.common.io.stream.StreamInput streamInput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest7.readFrom(streamInput13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNull(transportAddress9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(deleteRequest12);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.parent("");
        deleteRequest0.seqNo((long) (short) -1);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.refresh(false);
        deleteRequest3.setParentTask("hi!", 0L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest3.index("hi!");
        boolean boolean13 = deleteRequest12.refresh();
        org.elasticsearch.index.shard.IndexShard indexShard14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete15 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest12, indexShard14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "", "hi!");
        deleteRequest3.primaryTerm((-3L));
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str7 = deleteRequest6.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest9.refresh(false);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException14 = deleteRequest13.validate();
        org.elasticsearch.tasks.TaskId taskId15 = deleteRequest13.getParentTask();
        deleteRequest3.setParentTask(taskId15);
        deleteRequest3.seqNo((long) (short) 10);
        org.elasticsearch.common.io.stream.StreamInput streamInput19 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.readFrom(streamInput19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(actionRequestValidationException14);
        org.junit.Assert.assertNotNull(taskId15);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.support.IndicesOptions indicesOptions2 = deleteRequest0.indicesOptions();
        org.elasticsearch.common.unit.TimeValue timeValue3 = deleteRequest0.timeout();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(indicesOptions2);
        org.junit.Assert.assertNotNull(timeValue3);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.id("hi!");
        long long5 = deleteRequest4.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest4.version((long) ' ');
        org.elasticsearch.common.unit.TimeValue timeValue8 = deleteRequest7.timeout();
        java.lang.String str9 = deleteRequest7.parent();
        org.elasticsearch.index.shard.IndexShard indexShard10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult11 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest7, indexShard10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = deleteRequest0.indicesOptions();
        org.elasticsearch.index.VersionType versionType4 = deleteRequest0.versionType();
        java.lang.String[] strArray5 = deleteRequest0.indices();
        java.lang.String[] strArray6 = deleteRequest0.indices();
        org.elasticsearch.common.unit.TimeValue timeValue7 = deleteRequest0.timeout();
        long long8 = deleteRequest0.primaryTerm();
        java.lang.String str9 = deleteRequest0.getDescription();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest0.parent("delete {[null][null][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("");
        java.lang.String str14 = deleteRequest13.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str16 = deleteRequest15.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest15.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest18.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest20.routing("");
        org.elasticsearch.tasks.TaskId taskId23 = deleteRequest22.getParentTask();
        java.lang.String[] strArray24 = deleteRequest22.indices();
        org.elasticsearch.tasks.TaskId taskId25 = deleteRequest22.getParentTask();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel26 = deleteRequest22.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest13.consistencyLevel(writeConsistencyLevel26);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str29 = deleteRequest28.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest28.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest31.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = deleteRequest33.routing("");
        org.elasticsearch.tasks.TaskId taskId36 = deleteRequest35.getParentTask();
        java.lang.String[] strArray37 = deleteRequest35.indices();
        org.elasticsearch.tasks.TaskId taskId38 = deleteRequest35.getParentTask();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel39 = deleteRequest35.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest40 = deleteRequest13.consistencyLevel(writeConsistencyLevel39);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest41 = deleteRequest0.consistencyLevel(writeConsistencyLevel39);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest43 = deleteRequest41.timeout("hi!");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [hi!] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(indicesOptions3);
        org.junit.Assert.assertNotNull(versionType4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(timeValue7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "delete {[null][null][null]}" + "'", str9, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertNotNull(taskId23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(taskId25);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel26 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel26.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertNotNull(deleteRequest35);
        org.junit.Assert.assertNotNull(taskId36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(taskId38);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel39 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel39.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest40);
        org.junit.Assert.assertNotNull(deleteRequest41);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.elasticsearch.action.support.replication.ReplicationTask replicationTask0 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.setPhase(replicationTask0, "delete {[null][null][delete {[null][null][null]}]}");
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}", "delete {[null][null][null]}", "hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.parent("delete {[null][null][null]}");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = deleteRequest3.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.id("delete {[hi!][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest3.refresh(false);
        org.elasticsearch.index.shard.IndexShard indexShard13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult14 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest12, indexShard13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel6 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel6.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[null][null][null]}");
        java.lang.String str4 = deleteRequest3.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.version((long) (byte) 1);
        org.elasticsearch.common.unit.TimeValue timeValue7 = deleteRequest6.timeout();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(timeValue7);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting10 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting12 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting14 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str17 = deleteRequest16.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest16.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest19.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest19.refresh(false);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException24 = deleteRequest23.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure26 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting14, "hi!", (java.lang.Throwable) actionRequestValidationException24, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure28 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting12, "hi!", (java.lang.Throwable) actionRequestValidationException24, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure30 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting10, "delete {[null][null][null]}", (java.lang.Throwable) actionRequestValidationException24, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure32 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "hi!", (java.lang.Throwable) actionRequestValidationException24, "delete {[null][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure34 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "hi!", (java.lang.Throwable) actionRequestValidationException24, "delete {[][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure36 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[hi!][null][null]}", (java.lang.Throwable) actionRequestValidationException24, "delete {[null][null][hi!]}");
        java.lang.Throwable throwable37 = shardFailure36.cause;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure39 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[null][null][]}", throwable37, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure41 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[delete {[null][null][null]}][delete {[][null][null]}][hi!]}", throwable37, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(actionRequestValidationException24);
        org.junit.Assert.assertNotNull(throwable37);
        org.junit.Assert.assertEquals(throwable37.getLocalizedMessage(), "Validation Failed: 1: index is missing;2: type is missing;");
        org.junit.Assert.assertEquals(throwable37.getMessage(), "Validation Failed: 1: index is missing;2: type is missing;");
        org.junit.Assert.assertEquals(throwable37.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;2: type is missing;");
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}", "delete {[null][null][null]}", "hi!");
        java.lang.String str4 = deleteRequest3.id();
        boolean boolean5 = deleteRequest3.refresh();
        java.lang.String str6 = deleteRequest3.getDescription();
        org.elasticsearch.index.VersionType versionType7 = deleteRequest3.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.refresh(false);
        java.lang.String str10 = deleteRequest3.getDescription();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}" + "'", str6, "delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}");
        org.junit.Assert.assertNotNull(versionType7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}" + "'", str10, "delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}");
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}", "delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}", "delete {[delete {[null][null][null]}][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.consistencyLevel(writeConsistencyLevel5);
        org.elasticsearch.action.support.IndicesOptions indicesOptions7 = deleteRequest4.indicesOptions();
        org.elasticsearch.index.shard.ShardId shardId8 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest4.setShardId(shardId8);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str11 = deleteRequest10.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest10.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.id("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue16 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest15.timeout(timeValue16);
        org.elasticsearch.index.VersionType versionType18 = deleteRequest15.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest9.versionType(versionType18);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest3.versionType(versionType18);
        java.lang.Class<?> wildcardClass21 = deleteRequest3.getClass();
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(indicesOptions7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(timeValue16);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(versionType18);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str9 = deleteRequest8.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest8.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest11.refresh(false);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException16 = deleteRequest15.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure18 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "hi!", (java.lang.Throwable) actionRequestValidationException16, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure20 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[null][null][hi!]}", (java.lang.Throwable) actionRequestValidationException16, "delete {[null][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure22 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[null][null][null]}", (java.lang.Throwable) actionRequestValidationException16, "delete {[null][null][]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure24 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "", (java.lang.Throwable) actionRequestValidationException16, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(actionRequestValidationException16);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "", throwable2, "delete {[null][null][]}");
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.index.shard.ShardId shardId2 = deleteRequest0.shardId();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.version((long) (short) -1);
        org.elasticsearch.common.transport.TransportAddress transportAddress5 = null;
        deleteRequest4.remoteAddress(transportAddress5);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest4.index("hi!");
        org.elasticsearch.common.io.stream.StreamInput streamInput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest8.readFrom(streamInput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(shardId2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest8);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        java.lang.String str2 = deleteRequest1.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str4 = deleteRequest3.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.routing("");
        org.elasticsearch.tasks.TaskId taskId11 = deleteRequest10.getParentTask();
        java.lang.String[] strArray12 = deleteRequest10.indices();
        org.elasticsearch.tasks.TaskId taskId13 = deleteRequest10.getParentTask();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel14 = deleteRequest10.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest1.consistencyLevel(writeConsistencyLevel14);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest15.routing("hi!");
        java.lang.String str18 = deleteRequest15.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel20 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest19.consistencyLevel(writeConsistencyLevel20);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest21.id("hi!");
        long long24 = deleteRequest23.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest23.version((long) ' ');
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][hi!]}");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel29 = deleteRequest28.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest26.consistencyLevel(writeConsistencyLevel29);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest15.consistencyLevel(writeConsistencyLevel29);
        java.lang.String str32 = deleteRequest31.getDescription();
        java.lang.Class<?> wildcardClass33 = deleteRequest31.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(taskId11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(taskId13);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel14 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel14.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "delete {[][null][null]}" + "'", str18, "delete {[][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel29 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel29.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "delete {[][null][null]}" + "'", str32, "delete {[][null][null]}");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.refresh(false);
        deleteRequest7.primaryTerm((long) 100);
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = deleteRequest7.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest7.index("delete {[null][null][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str14 = deleteRequest13.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest13.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest16.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest18.routing("");
        org.elasticsearch.common.unit.TimeValue timeValue21 = deleteRequest20.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest12.timeout(timeValue21);
        java.lang.String[] strArray23 = deleteRequest22.indices();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNull(transportAddress10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(timeValue21);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[delete {[null][null][hi!]}][delete {[null][null][hi!]}][]}", throwable2, "delete {[null][delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}][delete {[][null][null]}]}");
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        long long6 = deleteRequest3.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.routing("delete {[null][null][null]}");
        org.elasticsearch.index.shard.ShardId shardId9 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setShardId(shardId9);
        java.lang.String str11 = deleteRequest10.id();
        java.lang.String str12 = deleteRequest10.parent();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        long long6 = deleteRequest5.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest5.type("");
        java.lang.String str9 = deleteRequest8.index();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.support.IndicesOptions indicesOptions2 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][hi!]}");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = deleteRequest4.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest0.consistencyLevel(writeConsistencyLevel5);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest0.version((long) '4');
        java.lang.String[] strArray9 = deleteRequest0.indices();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest0.timeout("");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(indicesOptions2);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel5 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel5.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        long long6 = deleteRequest5.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest5.type("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest5.id("delete {[][null][null]}");
        org.elasticsearch.common.io.stream.StreamOutput streamOutput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest5.writeTo(streamOutput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "", "delete {[null][null][null]}");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException4 = deleteRequest3.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.refresh(true);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.parent("");
        org.junit.Assert.assertNull(actionRequestValidationException4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest8);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}", "delete {[delete {[null][null][null]}][null][null]}", "");
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str11 = deleteRequest10.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest10.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest13.refresh(false);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException18 = deleteRequest17.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure20 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "hi!", (java.lang.Throwable) actionRequestValidationException18, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure22 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "hi!", (java.lang.Throwable) actionRequestValidationException18, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure24 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[null][null][null]}", (java.lang.Throwable) actionRequestValidationException18, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure26 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[delete {[null][null][null]}][null][null]}", (java.lang.Throwable) actionRequestValidationException18, "");
        java.lang.Throwable throwable27 = shardFailure26.cause;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure29 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[][null][null]}", throwable27, "delete {[null][null][delete {[null][null][null]}]}");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(actionRequestValidationException18);
        org.junit.Assert.assertNotNull(throwable27);
        org.junit.Assert.assertEquals(throwable27.getLocalizedMessage(), "Validation Failed: 1: index is missing;2: type is missing;");
        org.junit.Assert.assertEquals(throwable27.getMessage(), "Validation Failed: 1: index is missing;2: type is missing;");
        org.junit.Assert.assertEquals(throwable27.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;2: type is missing;");
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}", "hi!");
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
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str3 = deleteRequest2.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.routing("");
        org.elasticsearch.tasks.TaskId taskId10 = deleteRequest9.getParentTask();
        java.lang.String[] strArray11 = deleteRequest9.indices();
        org.elasticsearch.index.VersionType versionType12 = deleteRequest9.versionType();
        java.lang.String[] strArray13 = deleteRequest9.indices();
        org.elasticsearch.index.VersionType versionType14 = deleteRequest9.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest1.versionType(versionType14);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput16 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest15.writeTo(streamOutput16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(taskId10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(versionType12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(versionType14);
        org.junit.Assert.assertNotNull(deleteRequest15);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        java.lang.String str2 = deleteRequest1.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str4 = deleteRequest3.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.routing("");
        org.elasticsearch.tasks.TaskId taskId11 = deleteRequest10.getParentTask();
        java.lang.String[] strArray12 = deleteRequest10.indices();
        org.elasticsearch.tasks.TaskId taskId13 = deleteRequest10.getParentTask();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel14 = deleteRequest10.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest1.consistencyLevel(writeConsistencyLevel14);
        org.elasticsearch.common.transport.TransportAddress transportAddress16 = null;
        deleteRequest1.remoteAddress(transportAddress16);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(taskId11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(taskId13);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel14 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel14.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest15);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str7 = deleteRequest6.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest9.refresh(false);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException14 = deleteRequest13.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure16 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[null][null][null]}", (java.lang.Throwable) actionRequestValidationException14, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure18 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "hi!", (java.lang.Throwable) actionRequestValidationException14, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure20 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[null][null][]}", (java.lang.Throwable) actionRequestValidationException14, "delete {[null][null][hi!]}");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(actionRequestValidationException14);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.type("delete {[null][null][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.parent("delete {[null][null][null]}");
        deleteRequest4.primaryTerm((long) (short) -1);
        org.elasticsearch.index.shard.IndexShard indexShard7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete8 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest4, indexShard7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting10 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str13 = deleteRequest12.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest12.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest15.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest15.refresh(false);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException20 = deleteRequest19.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure22 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting10, "hi!", (java.lang.Throwable) actionRequestValidationException20, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure24 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "delete {[null][null][hi!]}", (java.lang.Throwable) actionRequestValidationException20, "delete {[null][null][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure26 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "delete {[hi!][null][null]}", (java.lang.Throwable) actionRequestValidationException20, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure28 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[hi!][null][null]}", (java.lang.Throwable) actionRequestValidationException20, "delete {[null][delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}][delete {[][null][null]}]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure30 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[delete {[null][null][hi!]}][null][hi!]}", (java.lang.Throwable) actionRequestValidationException20, "delete {[hi!][][delete {[null][null][null]}]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure32 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[][null][null]}", (java.lang.Throwable) actionRequestValidationException20, "delete {[delete {[null][null][null]}][delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}][hi!]}");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(actionRequestValidationException20);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.elasticsearch.action.support.replication.ReplicationTask replicationTask0 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.setPhase(replicationTask0, "delete {[delete {[null][null][hi!]}][delete {[null][null][hi!]}][]}");
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.parent("");
        org.elasticsearch.index.shard.ShardId shardId5 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.setShardId(shardId5);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest4.timeout("delete {[delete {[null][null][null]}][delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}][hi!]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[delete {[null][null][null]}][delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}][hi!]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str3 = deleteRequest2.routing();
        org.elasticsearch.action.support.IndicesOptions indicesOptions4 = deleteRequest2.indicesOptions();
        boolean boolean5 = deleteRequest2.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest2.index("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue8 = deleteRequest7.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str10 = deleteRequest9.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest9.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest12.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest14.routing("");
        org.elasticsearch.index.VersionType versionType17 = deleteRequest14.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest7.versionType(versionType17);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest18.id("delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[null][null][]}", deleteRequest20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(indicesOptions4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(versionType17);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(deleteRequest20);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        java.lang.String str2 = deleteRequest1.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str4 = deleteRequest3.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.routing("");
        org.elasticsearch.tasks.TaskId taskId11 = deleteRequest10.getParentTask();
        java.lang.String[] strArray12 = deleteRequest10.indices();
        org.elasticsearch.tasks.TaskId taskId13 = deleteRequest10.getParentTask();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel14 = deleteRequest10.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest1.consistencyLevel(writeConsistencyLevel14);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest15.routing("hi!");
        java.lang.String str18 = deleteRequest15.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel20 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest19.consistencyLevel(writeConsistencyLevel20);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest21.id("hi!");
        long long24 = deleteRequest23.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest23.version((long) ' ');
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][hi!]}");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel29 = deleteRequest28.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest26.consistencyLevel(writeConsistencyLevel29);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest15.consistencyLevel(writeConsistencyLevel29);
        java.lang.String str32 = deleteRequest15.id();
        java.lang.String str33 = deleteRequest15.type();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(taskId11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(taskId13);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel14 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel14.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "delete {[][null][null]}" + "'", str18, "delete {[][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel29 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel29.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][]}");
        deleteRequest1.primaryTerm((long) (short) 10);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest7.getParentTask();
        java.lang.String[] strArray9 = deleteRequest7.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest7.version((long) 10);
        org.elasticsearch.common.transport.TransportAddress transportAddress12 = deleteRequest11.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest11.version((long) (short) 0);
        org.elasticsearch.common.unit.TimeValue timeValue15 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest11.timeout(timeValue15);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException17 = deleteRequest11.validate();
        java.lang.String str18 = deleteRequest11.getDescription();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNull(transportAddress12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(actionRequestValidationException17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "delete {[null][null][hi!]}" + "'", str18, "delete {[null][null][hi!]}");
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.refresh(false);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException8 = deleteRequest7.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest7.index("delete {[null][null][]}");
        boolean boolean11 = deleteRequest7.getShouldPersistResult();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(actionRequestValidationException8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str7 = deleteRequest6.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest9.refresh(false);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException14 = deleteRequest13.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure16 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "hi!", (java.lang.Throwable) actionRequestValidationException14, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure18 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "hi!", (java.lang.Throwable) actionRequestValidationException14, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure20 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[][null][null]}", (java.lang.Throwable) actionRequestValidationException14, "delete {[hi!][null][null]}");
        java.lang.Class<?> wildcardClass21 = shardFailure20.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(actionRequestValidationException14);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.support.IndicesOptions indicesOptions2 = deleteRequest0.indicesOptions();
        boolean boolean3 = deleteRequest0.getShouldPersistResult();
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.setShardId(shardId4);
        org.elasticsearch.tasks.TaskId taskId6 = null;
        deleteRequest0.setParentTask(taskId6);
        org.elasticsearch.common.io.stream.StreamInput streamInput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.readFrom(streamInput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(indicesOptions2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(deleteRequest5);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.refresh(false);
        deleteRequest3.setParentTask("hi!", 0L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest3.index("hi!");
        long long13 = deleteRequest12.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest12.type("delete {[delete {[null][null][null]}][delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest15.parent("delete {[null][null][null]}");
        org.elasticsearch.index.shard.IndexShard indexShard18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult19 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest17, indexShard18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest17);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest7.getParentTask();
        java.lang.String[] strArray9 = deleteRequest7.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest7.version((long) 10);
        org.elasticsearch.common.transport.TransportAddress transportAddress12 = deleteRequest11.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest11.version((long) (short) 0);
        org.elasticsearch.common.unit.TimeValue timeValue15 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest11.timeout(timeValue15);
        java.lang.String str17 = deleteRequest16.type();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNull(transportAddress12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        long long6 = deleteRequest3.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.routing("delete {[null][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.routing("hi!");
        long long11 = deleteRequest10.version();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-3L) + "'", long11 == (-3L));
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel3 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.consistencyLevel(writeConsistencyLevel3);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.id("hi!");
        java.lang.String str7 = deleteRequest6.type();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "", deleteRequest6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str11 = deleteRequest10.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest10.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest13.refresh(false);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException18 = deleteRequest17.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure20 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "hi!", (java.lang.Throwable) actionRequestValidationException18, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure22 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "hi!", (java.lang.Throwable) actionRequestValidationException18, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure24 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[null][null][null]}", (java.lang.Throwable) actionRequestValidationException18, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure26 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[delete {[null][null][null]}][null][null]}", (java.lang.Throwable) actionRequestValidationException18, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure28 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[null][null][hi!]}", (java.lang.Throwable) actionRequestValidationException18, "delete {[][null][null]}");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(actionRequestValidationException18);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "", "hi!");
        org.elasticsearch.index.shard.ShardId shardId4 = deleteRequest3.shardId();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.type("delete {[hi!][][delete {[null][null][null]}]}");
        deleteRequest3.seqNo(1L);
        org.junit.Assert.assertNull(shardId4);
        org.junit.Assert.assertNotNull(deleteRequest6);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.index.shard.ShardId shardId2 = deleteRequest0.shardId();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.version((long) (short) -1);
        org.elasticsearch.common.transport.TransportAddress transportAddress5 = null;
        deleteRequest4.remoteAddress(transportAddress5);
        long long7 = deleteRequest4.seqNo();
        long long8 = deleteRequest4.primaryTerm();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(shardId2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][]}", "delete {[delete {[null][null][hi!]}][delete {[null][null][hi!]}][]}", "delete {[][hi!][]}");
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][][delete {[null][null][null]}]}", "delete {[delete {[null][null][null]}][delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}][hi!]}", "delete {[][hi!][]}");
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
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        boolean boolean4 = deleteRequest0.getShouldPersistResult();
        long long5 = deleteRequest0.version();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.writeTo(streamOutput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-3L) + "'", long5 == (-3L));
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}", "delete {[null][null][null]}", "hi!");
        java.lang.String str4 = deleteRequest3.id();
        boolean boolean5 = deleteRequest3.refresh();
        org.elasticsearch.index.shard.IndexShard indexShard6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult7 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest3, indexShard6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.type("delete {[null][null][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.type("delete {[delete {[null][null][null]}][delete {[][null][null]}][hi!]}");
        java.lang.String str5 = deleteRequest4.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest4.index("delete {[hi!][][delete {[null][null][null]}]}");
        java.lang.String str8 = deleteRequest4.routing();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = deleteRequest0.indicesOptions();
        org.elasticsearch.index.VersionType versionType4 = deleteRequest0.versionType();
        java.lang.String[] strArray5 = deleteRequest0.indices();
        java.lang.String[] strArray6 = deleteRequest0.indices();
        org.elasticsearch.common.unit.TimeValue timeValue7 = deleteRequest0.timeout();
        long long8 = deleteRequest0.primaryTerm();
        java.lang.String str9 = deleteRequest0.getDescription();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str11 = deleteRequest10.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest10.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest15.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str19 = deleteRequest18.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest18.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest21.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest23.routing("");
        org.elasticsearch.tasks.TaskId taskId26 = deleteRequest25.getParentTask();
        deleteRequest17.setParentTask(taskId26);
        deleteRequest0.setParentTask(taskId26);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput29 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.writeTo(streamOutput29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(indicesOptions3);
        org.junit.Assert.assertNotNull(versionType4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(timeValue7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "delete {[null][null][null]}" + "'", str9, "delete {[null][null][null]}");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(taskId26);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.id("hi!");
        long long5 = deleteRequest4.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest4.version((long) ' ');
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][hi!]}");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = deleteRequest9.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest7.consistencyLevel(writeConsistencyLevel10);
        long long12 = deleteRequest7.seqNo();
        long long13 = deleteRequest7.primaryTerm();
        org.elasticsearch.action.support.IndicesOptions indicesOptions14 = deleteRequest7.indicesOptions();
        java.lang.Class<?> wildcardClass15 = indicesOptions14.getClass();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(indicesOptions14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.common.unit.TimeValue timeValue8 = deleteRequest5.timeout();
        long long9 = deleteRequest5.primaryTerm();
        org.elasticsearch.index.shard.IndexShard indexShard10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete11 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest5, indexShard10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.id("hi!");
        long long5 = deleteRequest4.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest4.version((long) ' ');
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][hi!]}");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = deleteRequest9.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest7.consistencyLevel(writeConsistencyLevel10);
        long long12 = deleteRequest7.seqNo();
        long long13 = deleteRequest7.primaryTerm();
        org.elasticsearch.action.support.IndicesOptions indicesOptions14 = deleteRequest7.indicesOptions();
        org.elasticsearch.index.shard.IndexShard indexShard15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete16 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest7, indexShard15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(indicesOptions14);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.id("hi!");
        java.lang.String str5 = deleteRequest4.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest4.parent("delete {[][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.refresh(true);
        org.elasticsearch.index.shard.IndexShard indexShard10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete11 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest9, indexShard10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str9 = deleteRequest8.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest8.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.routing("");
        org.elasticsearch.tasks.TaskId taskId16 = deleteRequest15.getParentTask();
        deleteRequest7.setParentTask(taskId16);
        org.elasticsearch.index.shard.ShardId shardId18 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest7.setShardId(shardId18);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest7.parent("delete {[null][null][null]}");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException22 = deleteRequest21.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str24 = deleteRequest23.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest23.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest26.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest26.refresh(false);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException31 = deleteRequest30.validate();
        org.elasticsearch.tasks.TaskId taskId32 = deleteRequest30.getParentTask();
        deleteRequest21.setParentTask(taskId32);
        org.elasticsearch.index.shard.ShardId shardId34 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = deleteRequest21.setShardId(shardId34);
        org.elasticsearch.index.shard.ShardId shardId36 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest37 = deleteRequest21.setShardId(shardId36);
        java.lang.String[] strArray38 = deleteRequest37.indices();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(taskId16);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(actionRequestValidationException22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertNotNull(actionRequestValidationException31);
        org.junit.Assert.assertNotNull(taskId32);
        org.junit.Assert.assertNotNull(deleteRequest35);
        org.junit.Assert.assertNotNull(deleteRequest37);
        org.junit.Assert.assertNotNull(strArray38);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = deleteRequest0.indicesOptions();
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.setShardId(shardId4);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str7 = deleteRequest6.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.id("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue12 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.timeout(timeValue12);
        org.elasticsearch.index.VersionType versionType14 = deleteRequest11.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest5.versionType(versionType14);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str17 = deleteRequest16.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest16.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest16.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str23 = deleteRequest22.routing();
        org.elasticsearch.action.support.IndicesOptions indicesOptions24 = deleteRequest22.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest22.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str31 = deleteRequest30.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest30.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = deleteRequest33.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest37 = deleteRequest35.routing("");
        org.elasticsearch.tasks.TaskId taskId38 = deleteRequest37.getParentTask();
        org.elasticsearch.tasks.Task task39 = deleteRequest26.createTask((long) 'a', "delete {[null][null][null]}", "hi!", taskId38);
        deleteRequest16.setParentTask(taskId38);
        deleteRequest5.setParentTask(taskId38);
        org.elasticsearch.index.VersionType versionType42 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest43 = deleteRequest5.versionType(versionType42);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest45 = deleteRequest43.id("hi!");
        long long46 = deleteRequest45.seqNo();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(indicesOptions3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(timeValue12);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(versionType14);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(indicesOptions24);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertNotNull(deleteRequest35);
        org.junit.Assert.assertNotNull(deleteRequest37);
        org.junit.Assert.assertNotNull(taskId38);
        org.junit.Assert.assertNotNull(task39);
        org.junit.Assert.assertNotNull(deleteRequest43);
        org.junit.Assert.assertNotNull(deleteRequest45);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = deleteRequest0.indicesOptions();
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.setShardId(shardId4);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str7 = deleteRequest6.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.id("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue12 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.timeout(timeValue12);
        org.elasticsearch.index.VersionType versionType14 = deleteRequest11.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest5.versionType(versionType14);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel17 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest16.consistencyLevel(writeConsistencyLevel17);
        org.elasticsearch.action.support.IndicesOptions indicesOptions19 = deleteRequest16.indicesOptions();
        org.elasticsearch.index.VersionType versionType20 = deleteRequest16.versionType();
        java.lang.String[] strArray21 = deleteRequest16.indices();
        java.lang.String[] strArray22 = deleteRequest16.indices();
        org.elasticsearch.common.unit.TimeValue timeValue23 = deleteRequest16.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest15.timeout(timeValue23);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest24.version((long) 0);
        long long27 = deleteRequest24.version();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(indicesOptions3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(timeValue12);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(versionType14);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(indicesOptions19);
        org.junit.Assert.assertNotNull(versionType20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(timeValue23);
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        deleteRequest3.primaryTerm((long) (short) 10);
        java.lang.String[] strArray6 = deleteRequest3.indices();
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.index.shard.ShardId shardId2 = deleteRequest0.shardId();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.version((long) (short) -1);
        deleteRequest0.setParentTask("delete {[null][null][null]}", (long) (byte) 1);
        org.elasticsearch.index.shard.ShardId shardId8 = deleteRequest0.shardId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(shardId2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNull(shardId8);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.support.IndicesOptions indicesOptions2 = deleteRequest0.indicesOptions();
        boolean boolean3 = deleteRequest0.refresh();
        boolean boolean4 = deleteRequest0.refresh();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = deleteRequest0.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.refresh(true);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.timeout("delete {[null][null][]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[null][null][]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(indicesOptions2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel5 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel5.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest7);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.index.shard.ShardId shardId4 = deleteRequest3.shardId();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}", "delete {[null][null][null]}", "hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.parent("delete {[null][null][null]}");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = deleteRequest8.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest3.consistencyLevel(writeConsistencyLevel11);
        org.elasticsearch.tasks.TaskId taskId13 = deleteRequest3.getParentTask();
        org.elasticsearch.tasks.TaskId taskId14 = deleteRequest3.getParentTask();
        org.elasticsearch.index.shard.IndexShard indexShard15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult16 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest3, indexShard15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNull(shardId4);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel11 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel11.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(taskId13);
        org.junit.Assert.assertNotNull(taskId14);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[null][null][null]}][null][null]}", "", "delete {[delete {[null][null][null]}][null][null]}");
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest7.getParentTask();
        java.lang.String[] strArray9 = deleteRequest7.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel14 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.consistencyLevel(writeConsistencyLevel14);
        org.elasticsearch.action.support.IndicesOptions indicesOptions16 = deleteRequest13.indicesOptions();
        org.elasticsearch.index.shard.ShardId shardId17 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest13.setShardId(shardId17);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str23 = deleteRequest22.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest22.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest25.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest27.routing("");
        org.elasticsearch.tasks.TaskId taskId30 = deleteRequest29.getParentTask();
        org.elasticsearch.tasks.Task task31 = deleteRequest13.createTask(100L, "delete {[null][null][null]}", "delete {[null][null][null]}", taskId30);
        org.elasticsearch.tasks.Task task32 = deleteRequest7.createTask((long) (short) 10, "delete {[hi!][null][null]}", "delete {[][null][null]}", taskId30);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = deleteRequest7.id("delete {[][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest36 = deleteRequest7.index("delete {[delete {[null][null][null]}][delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest38 = deleteRequest7.id("delete {[delete {[null][null][null]}][delete {[][null][null]}][hi!]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest40 = deleteRequest38.timeout("delete {[null][null][]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[null][null][]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(indicesOptions16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertNotNull(taskId30);
        org.junit.Assert.assertNotNull(task31);
        org.junit.Assert.assertNotNull(task32);
        org.junit.Assert.assertNotNull(deleteRequest34);
        org.junit.Assert.assertNotNull(deleteRequest36);
        org.junit.Assert.assertNotNull(deleteRequest38);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.support.IndicesOptions indicesOptions2 = deleteRequest0.indicesOptions();
        boolean boolean3 = deleteRequest0.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.index("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue6 = deleteRequest5.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str8 = deleteRequest7.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest7.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest12.routing("");
        org.elasticsearch.index.VersionType versionType15 = deleteRequest12.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest5.versionType(versionType15);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest5.id("");
        java.lang.String str19 = deleteRequest18.type();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput20 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest18.writeTo(streamOutput20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(indicesOptions2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(versionType15);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.refresh(false);
        deleteRequest7.primaryTerm((long) 100);
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = deleteRequest7.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest7.index("delete {[null][null][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest12.version((long) (short) 0);
        boolean boolean15 = deleteRequest12.getShouldPersistResult();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNull(transportAddress10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest7.getParentTask();
        java.lang.String[] strArray9 = deleteRequest7.indices();
        org.elasticsearch.index.VersionType versionType10 = deleteRequest7.versionType();
        org.elasticsearch.index.shard.IndexShard indexShard11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete12 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest7, indexShard11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(versionType10);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.support.IndicesOptions indicesOptions2 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str9 = deleteRequest8.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest8.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.routing("");
        org.elasticsearch.tasks.TaskId taskId16 = deleteRequest15.getParentTask();
        org.elasticsearch.tasks.Task task17 = deleteRequest4.createTask((long) 'a', "delete {[null][null][null]}", "hi!", taskId16);
        long long18 = deleteRequest4.primaryTerm();
        deleteRequest4.primaryTerm(10L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        org.elasticsearch.common.transport.TransportAddress transportAddress25 = deleteRequest24.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel27 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest26.consistencyLevel(writeConsistencyLevel27);
        java.lang.String str29 = deleteRequest26.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel31 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest30.consistencyLevel(writeConsistencyLevel31);
        org.elasticsearch.action.support.IndicesOptions indicesOptions33 = deleteRequest30.indicesOptions();
        org.elasticsearch.index.shard.ShardId shardId34 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = deleteRequest30.setShardId(shardId34);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest36 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str37 = deleteRequest36.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest39 = deleteRequest36.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest41 = deleteRequest39.id("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue42 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest43 = deleteRequest41.timeout(timeValue42);
        org.elasticsearch.index.VersionType versionType44 = deleteRequest41.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest45 = deleteRequest35.versionType(versionType44);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest46 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel47 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest48 = deleteRequest46.consistencyLevel(writeConsistencyLevel47);
        org.elasticsearch.action.support.IndicesOptions indicesOptions49 = deleteRequest46.indicesOptions();
        org.elasticsearch.index.VersionType versionType50 = deleteRequest46.versionType();
        java.lang.String[] strArray51 = deleteRequest46.indices();
        java.lang.String[] strArray52 = deleteRequest46.indices();
        org.elasticsearch.common.unit.TimeValue timeValue53 = deleteRequest46.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest54 = deleteRequest45.timeout(timeValue53);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest55 = deleteRequest26.timeout(timeValue53);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest56 = deleteRequest24.timeout(timeValue53);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest57 = deleteRequest4.timeout(timeValue53);
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest4.setParentTask("", (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 0 length nodeIds are reserved for EMPTY_TASK_ID and are otherwise invalid.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(indicesOptions2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(taskId16);
        org.junit.Assert.assertNotNull(task17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNull(transportAddress25);
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertNotNull(indicesOptions33);
        org.junit.Assert.assertNotNull(deleteRequest35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(deleteRequest39);
        org.junit.Assert.assertNotNull(deleteRequest41);
        org.junit.Assert.assertNotNull(timeValue42);
        org.junit.Assert.assertNotNull(deleteRequest43);
        org.junit.Assert.assertNotNull(versionType44);
        org.junit.Assert.assertNotNull(deleteRequest45);
        org.junit.Assert.assertNotNull(deleteRequest48);
        org.junit.Assert.assertNotNull(indicesOptions49);
        org.junit.Assert.assertNotNull(versionType50);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(timeValue53);
        org.junit.Assert.assertNotNull(deleteRequest54);
        org.junit.Assert.assertNotNull(deleteRequest55);
        org.junit.Assert.assertNotNull(deleteRequest56);
        org.junit.Assert.assertNotNull(deleteRequest57);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str9 = deleteRequest8.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest8.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest11.refresh(false);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException16 = deleteRequest15.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure18 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "hi!", (java.lang.Throwable) actionRequestValidationException16, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure20 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "hi!", (java.lang.Throwable) actionRequestValidationException16, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure22 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[null][null][null]}", (java.lang.Throwable) actionRequestValidationException16, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure24 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[delete {[null][null][null]}][null][null]}", (java.lang.Throwable) actionRequestValidationException16, "");
        java.lang.Throwable throwable25 = shardFailure24.cause;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting26 = shardFailure24.routing;
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(actionRequestValidationException16);
        org.junit.Assert.assertNotNull(throwable25);
        org.junit.Assert.assertEquals(throwable25.getLocalizedMessage(), "Validation Failed: 1: index is missing;2: type is missing;");
        org.junit.Assert.assertEquals(throwable25.getMessage(), "Validation Failed: 1: index is missing;2: type is missing;");
        org.junit.Assert.assertEquals(throwable25.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;2: type is missing;");
        org.junit.Assert.assertNull(shardRouting26);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.support.IndicesOptions indicesOptions2 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.id("");
        long long5 = deleteRequest4.version();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str7 = deleteRequest6.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest9.refresh(false);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException14 = deleteRequest13.validate();
        org.elasticsearch.tasks.TaskId taskId15 = deleteRequest13.getParentTask();
        deleteRequest4.setParentTask(taskId15);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput17 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest4.writeTo(streamOutput17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(indicesOptions2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-3L) + "'", long5 == (-3L));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(actionRequestValidationException14);
        org.junit.Assert.assertNotNull(taskId15);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.setShardId(shardId6);
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = null;
        deleteRequest3.remoteAddress(transportAddress8);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest3.index("delete {[null][null][]}");
        long long12 = deleteRequest3.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest3.parent("delete {[null][null][hi!]}");
        long long15 = deleteRequest3.version();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-3L) + "'", long15 == (-3L));
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}", "delete {[null][null][null]}", "hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.parent("delete {[null][null][null]}");
        deleteRequest5.setParentTask("delete {[null][null][]}", (long) (-1));
        org.elasticsearch.common.io.stream.StreamInput streamInput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest5.readFrom(streamInput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[null][null][delete {[null][null][null]}]}", throwable2, "delete {[delete {[null][null][null]}][delete {[hi!][null][null]}][hi!]}");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting5 = shardFailure4.routing;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = shardFailure4.routing;
        org.junit.Assert.assertNull(shardRouting5);
        org.junit.Assert.assertNull(shardRouting6);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest7.getParentTask();
        java.lang.String[] strArray9 = deleteRequest7.indices();
        boolean boolean10 = deleteRequest7.refresh();
        java.lang.String str11 = deleteRequest7.routing();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException12 = deleteRequest7.validate();
        long long13 = deleteRequest7.primaryTerm();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest7.timeout("");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(actionRequestValidationException12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[null][null][null]}", throwable2, "");
        java.lang.String str5 = shardFailure4.indexUUID;
        java.lang.String str6 = shardFailure4.indexUUID;
        java.lang.String str7 = shardFailure4.reason;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "delete {[null][null][null]}" + "'", str7, "delete {[null][null][null]}");
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting10 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting12 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str15 = deleteRequest14.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest14.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest17.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest17.refresh(false);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException22 = deleteRequest21.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure24 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting12, "hi!", (java.lang.Throwable) actionRequestValidationException22, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure26 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting10, "hi!", (java.lang.Throwable) actionRequestValidationException22, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure28 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "delete {[null][null][null]}", (java.lang.Throwable) actionRequestValidationException22, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure30 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "hi!", (java.lang.Throwable) actionRequestValidationException22, "delete {[null][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure32 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "", (java.lang.Throwable) actionRequestValidationException22, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure34 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[delete {[null][null][null]}][delete {[][null][null]}][hi!]}", (java.lang.Throwable) actionRequestValidationException22, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure36 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[null][null][null]}", (java.lang.Throwable) actionRequestValidationException22, "delete {[delete {[null][null][null]}][delete {[][null][null]}][hi!]}");
        java.lang.String str37 = shardFailure36.indexUUID;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting38 = shardFailure36.routing;
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(actionRequestValidationException22);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "delete {[delete {[null][null][null]}][delete {[][null][null]}][hi!]}" + "'", str37, "delete {[delete {[null][null][null]}][delete {[][null][null]}][hi!]}");
        org.junit.Assert.assertNull(shardRouting38);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.refresh(false);
        deleteRequest3.setParentTask("hi!", 0L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest3.index("hi!");
        long long13 = deleteRequest12.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest12.type("delete {[delete {[null][null][null]}][delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest12.type("delete {[hi!][][delete {[null][null][null]}]}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest17);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("");
        long long4 = deleteRequest3.seqNo();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException5 = deleteRequest3.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure7 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[delete {[null][null][null]}][delete {[][null][null]}][hi!]}", (java.lang.Throwable) actionRequestValidationException5, "delete {[null][null][null]}");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(actionRequestValidationException5);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest7.getParentTask();
        java.lang.String[] strArray9 = deleteRequest7.indices();
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = deleteRequest7.remoteAddress();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest7.consistencyLevel(writeConsistencyLevel11);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest12.version((long) (short) 10);
        java.lang.String str15 = deleteRequest12.getDescription();
        org.elasticsearch.common.transport.TransportAddress transportAddress16 = null;
        deleteRequest12.remoteAddress(transportAddress16);
        java.lang.String str18 = deleteRequest12.parent();
        org.elasticsearch.action.support.IndicesOptions indicesOptions19 = deleteRequest12.indicesOptions();
        org.elasticsearch.index.shard.ShardId shardId20 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest12.setShardId(shardId20);
        org.elasticsearch.common.io.stream.StreamInput streamInput22 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest12.readFrom(streamInput22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(transportAddress10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "delete {[null][null][hi!]}" + "'", str15, "delete {[null][null][hi!]}");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(indicesOptions19);
        org.junit.Assert.assertNotNull(deleteRequest21);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.parent("");
        java.lang.String str6 = deleteRequest5.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest5.refresh(false);
        deleteRequest8.primaryTerm((long) (byte) 10);
        java.lang.String str11 = deleteRequest8.routing();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "delete {[null][null][hi!]}" + "'", str6, "delete {[null][null][hi!]}");
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        java.lang.String str6 = deleteRequest5.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest5.index("delete {[null][null][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest5.refresh(false);
        org.elasticsearch.index.shard.IndexShard indexShard11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete12 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest5, indexShard11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.parent("");
        java.lang.String str6 = deleteRequest5.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest5.refresh(false);
        deleteRequest8.primaryTerm((long) (byte) 10);
        long long11 = deleteRequest8.version();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "delete {[null][null][hi!]}" + "'", str6, "delete {[null][null][hi!]}");
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-3L) + "'", long11 == (-3L));
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[null][null][null]}][delete {[][null][null]}][hi!]}", "delete {[][null][null]}", "");
        org.elasticsearch.common.io.stream.StreamInput streamInput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.readFrom(streamInput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}", "delete {[][null][null]}", "delete {[][null][null]}");
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.index.VersionType versionType8 = deleteRequest5.versionType();
        org.elasticsearch.index.shard.ShardId shardId9 = deleteRequest5.shardId();
        org.elasticsearch.index.shard.IndexShard indexShard10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult11 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest5, indexShard10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(versionType8);
        org.junit.Assert.assertNull(shardId9);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}", "delete {[][null][null]}");
        org.elasticsearch.index.shard.ShardId shardId4 = deleteRequest3.shardId();
        org.junit.Assert.assertNull(shardId4);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "delete {[null][null][null]}", "hi!");
        java.lang.String str4 = deleteRequest3.id();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[null][null][hi!]}][null][hi!]}", "delete {[delete {[null][null][hi!]}][null][hi!]}", "delete {[delete {[null][null][null]}][delete {[][null][null]}][hi!]}");
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][]}", "delete {[delete {[null][null][hi!]}][delete {[null][null][hi!]}][]}", "delete {[null][null][null]}");
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
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str7 = deleteRequest6.routing();
        org.elasticsearch.action.support.IndicesOptions indicesOptions8 = deleteRequest6.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest6.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str15 = deleteRequest14.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest14.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest17.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest19.routing("");
        org.elasticsearch.tasks.TaskId taskId22 = deleteRequest21.getParentTask();
        org.elasticsearch.tasks.Task task23 = deleteRequest10.createTask((long) 'a', "delete {[null][null][null]}", "hi!", taskId22);
        deleteRequest0.setParentTask(taskId22);
        boolean boolean25 = deleteRequest0.refresh();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest0.timeout("delete {[hi!][][delete {[null][null][null]}]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[hi!][][delete {[null][null][null]}]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(indicesOptions8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(taskId22);
        org.junit.Assert.assertNotNull(task23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        long long6 = deleteRequest5.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest5.type("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest5.id("delete {[][null][null]}");
        org.elasticsearch.index.VersionType versionType11 = deleteRequest10.versionType();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest10.writeTo(streamOutput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(versionType11);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.refresh(false);
        deleteRequest3.setParentTask("hi!", 0L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest3.index("hi!");
        long long13 = deleteRequest12.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest12.type("delete {[delete {[null][null][null]}][delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}][hi!]}");
        org.elasticsearch.index.shard.IndexShard indexShard16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult17 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest12, indexShard16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest15);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        long long6 = deleteRequest5.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest5.type("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest5.id("delete {[][null][null]}");
        org.elasticsearch.index.VersionType versionType11 = deleteRequest10.versionType();
        org.elasticsearch.index.shard.IndexShard indexShard12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult13 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest10, indexShard12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(versionType11);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("");
        long long6 = deleteRequest5.seqNo();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException7 = deleteRequest5.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure9 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "", (java.lang.Throwable) actionRequestValidationException7, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure11 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[hi!][null][null]}", (java.lang.Throwable) actionRequestValidationException7, "delete {[null][null][]}");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(actionRequestValidationException7);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest7.getParentTask();
        java.lang.String[] strArray9 = deleteRequest7.indices();
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = deleteRequest7.remoteAddress();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest7.consistencyLevel(writeConsistencyLevel11);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest12.version((long) (short) 10);
        java.lang.String str15 = deleteRequest12.getDescription();
        org.elasticsearch.common.transport.TransportAddress transportAddress16 = null;
        deleteRequest12.remoteAddress(transportAddress16);
        java.lang.String str18 = deleteRequest12.parent();
        org.elasticsearch.action.support.IndicesOptions indicesOptions19 = deleteRequest12.indicesOptions();
        boolean boolean20 = deleteRequest12.getShouldPersistResult();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(transportAddress10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "delete {[null][null][hi!]}" + "'", str15, "delete {[null][null][hi!]}");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(indicesOptions19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest7.getParentTask();
        org.elasticsearch.common.transport.TransportAddress transportAddress9 = deleteRequest7.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}", "delete {[null][null][null]}", "hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.parent("delete {[null][null][null]}");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel16 = deleteRequest13.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest7.consistencyLevel(writeConsistencyLevel16);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = new org.elasticsearch.action.delete.DeleteRequest("");
        java.lang.String str20 = deleteRequest19.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str22 = deleteRequest21.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest21.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest24.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest26.routing("");
        org.elasticsearch.tasks.TaskId taskId29 = deleteRequest28.getParentTask();
        java.lang.String[] strArray30 = deleteRequest28.indices();
        org.elasticsearch.tasks.TaskId taskId31 = deleteRequest28.getParentTask();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel32 = deleteRequest28.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest19.consistencyLevel(writeConsistencyLevel32);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = deleteRequest33.routing("hi!");
        java.lang.String str36 = deleteRequest33.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest37 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel38 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest39 = deleteRequest37.consistencyLevel(writeConsistencyLevel38);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest41 = deleteRequest39.id("hi!");
        long long42 = deleteRequest41.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest44 = deleteRequest41.version((long) ' ');
        org.elasticsearch.action.delete.DeleteRequest deleteRequest46 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][hi!]}");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel47 = deleteRequest46.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest48 = deleteRequest44.consistencyLevel(writeConsistencyLevel47);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest49 = deleteRequest33.consistencyLevel(writeConsistencyLevel47);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest50 = deleteRequest17.consistencyLevel(writeConsistencyLevel47);
        long long51 = deleteRequest50.seqNo();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNull(transportAddress9);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel16 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel16.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertNotNull(taskId29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(taskId31);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel32 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel32.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertNotNull(deleteRequest35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "delete {[][null][null]}" + "'", str36, "delete {[][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest39);
        org.junit.Assert.assertNotNull(deleteRequest41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest44);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel47 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel47.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest48);
        org.junit.Assert.assertNotNull(deleteRequest49);
        org.junit.Assert.assertNotNull(deleteRequest50);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest7.getParentTask();
        java.lang.String[] strArray9 = deleteRequest7.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel14 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.consistencyLevel(writeConsistencyLevel14);
        org.elasticsearch.action.support.IndicesOptions indicesOptions16 = deleteRequest13.indicesOptions();
        org.elasticsearch.index.shard.ShardId shardId17 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest13.setShardId(shardId17);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str23 = deleteRequest22.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest22.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest25.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest27.routing("");
        org.elasticsearch.tasks.TaskId taskId30 = deleteRequest29.getParentTask();
        org.elasticsearch.tasks.Task task31 = deleteRequest13.createTask(100L, "delete {[null][null][null]}", "delete {[null][null][null]}", taskId30);
        org.elasticsearch.tasks.Task task32 = deleteRequest7.createTask((long) (short) 10, "delete {[hi!][null][null]}", "delete {[][null][null]}", taskId30);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = deleteRequest7.id("delete {[][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest36 = deleteRequest7.index("delete {[delete {[null][null][null]}][delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}][hi!]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress37 = null;
        deleteRequest7.remoteAddress(transportAddress37);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(indicesOptions16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertNotNull(taskId30);
        org.junit.Assert.assertNotNull(task31);
        org.junit.Assert.assertNotNull(task32);
        org.junit.Assert.assertNotNull(deleteRequest34);
        org.junit.Assert.assertNotNull(deleteRequest36);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        java.lang.String str3 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.consistencyLevel(writeConsistencyLevel5);
        org.elasticsearch.action.support.IndicesOptions indicesOptions7 = deleteRequest4.indicesOptions();
        org.elasticsearch.index.shard.ShardId shardId8 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest4.setShardId(shardId8);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str11 = deleteRequest10.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest10.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.id("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue16 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest15.timeout(timeValue16);
        org.elasticsearch.index.VersionType versionType18 = deleteRequest15.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest9.versionType(versionType18);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel21 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest20.consistencyLevel(writeConsistencyLevel21);
        org.elasticsearch.action.support.IndicesOptions indicesOptions23 = deleteRequest20.indicesOptions();
        org.elasticsearch.index.VersionType versionType24 = deleteRequest20.versionType();
        java.lang.String[] strArray25 = deleteRequest20.indices();
        java.lang.String[] strArray26 = deleteRequest20.indices();
        org.elasticsearch.common.unit.TimeValue timeValue27 = deleteRequest20.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest19.timeout(timeValue27);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest0.timeout(timeValue27);
        java.lang.String str30 = deleteRequest29.getDescription();
        java.lang.String str31 = deleteRequest29.parent();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(indicesOptions7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(timeValue16);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(versionType18);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertNotNull(indicesOptions23);
        org.junit.Assert.assertNotNull(versionType24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(timeValue27);
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "delete {[null][null][null]}" + "'", str30, "delete {[null][null][null]}");
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.id("delete {[null][null][]}");
        boolean boolean7 = deleteRequest6.refresh();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.support.IndicesOptions indicesOptions2 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.id("");
        long long5 = deleteRequest4.version();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str7 = deleteRequest6.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest9.refresh(false);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException14 = deleteRequest13.validate();
        org.elasticsearch.tasks.TaskId taskId15 = deleteRequest13.getParentTask();
        deleteRequest4.setParentTask(taskId15);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest4.version((long) (byte) -1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str23 = deleteRequest22.routing();
        org.elasticsearch.action.support.IndicesOptions indicesOptions24 = deleteRequest22.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest22.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str31 = deleteRequest30.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest30.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = deleteRequest33.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest37 = deleteRequest35.routing("");
        org.elasticsearch.tasks.TaskId taskId38 = deleteRequest37.getParentTask();
        org.elasticsearch.tasks.Task task39 = deleteRequest26.createTask((long) 'a', "delete {[null][null][null]}", "hi!", taskId38);
        org.elasticsearch.tasks.Task task40 = deleteRequest18.createTask((long) 1, "delete {[null][null][null]}", "delete {[null][null][hi!]}", taskId38);
        java.lang.String[] strArray41 = deleteRequest18.indices();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(indicesOptions2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-3L) + "'", long5 == (-3L));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(actionRequestValidationException14);
        org.junit.Assert.assertNotNull(taskId15);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(indicesOptions24);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertNotNull(deleteRequest35);
        org.junit.Assert.assertNotNull(deleteRequest37);
        org.junit.Assert.assertNotNull(taskId38);
        org.junit.Assert.assertNotNull(task39);
        org.junit.Assert.assertNotNull(task40);
        org.junit.Assert.assertNotNull(strArray41);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.support.IndicesOptions indicesOptions2 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.id("");
        org.elasticsearch.common.transport.TransportAddress transportAddress5 = null;
        deleteRequest0.remoteAddress(transportAddress5);
        org.elasticsearch.common.io.stream.StreamInput streamInput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.readFrom(streamInput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(indicesOptions2);
        org.junit.Assert.assertNotNull(deleteRequest4);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        long long3 = deleteRequest2.version();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.consistencyLevel(writeConsistencyLevel4);
        java.lang.String[] strArray6 = deleteRequest2.indices();
        java.lang.String str7 = deleteRequest2.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest2.id("delete {[hi!][null][null]}");
        org.elasticsearch.index.shard.IndexShard indexShard10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete11 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest2, indexShard10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3L) + "'", long3 == (-3L));
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(deleteRequest9);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][][delete {[null][null][null]}]}", "delete {[][null][null]}", "delete {[null][delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}][delete {[][null][null]}]}");
        long long4 = deleteRequest3.seqNo();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        java.lang.String str6 = deleteRequest3.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.refresh(false);
        deleteRequest12.seqNo(100L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.common.transport.TransportAddress transportAddress2 = deleteRequest0.remoteAddress();
        org.elasticsearch.common.transport.TransportAddress transportAddress3 = deleteRequest0.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.type("delete {[null][null][null]}");
        java.lang.String str6 = deleteRequest5.routing();
        deleteRequest5.primaryTerm((long) '4');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(transportAddress2);
        org.junit.Assert.assertNull(transportAddress3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str3 = deleteRequest2.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.routing("");
        org.elasticsearch.tasks.TaskId taskId10 = deleteRequest9.getParentTask();
        java.lang.String[] strArray11 = deleteRequest9.indices();
        org.elasticsearch.index.VersionType versionType12 = deleteRequest9.versionType();
        java.lang.String[] strArray13 = deleteRequest9.indices();
        org.elasticsearch.index.VersionType versionType14 = deleteRequest9.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest1.versionType(versionType14);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException16 = deleteRequest1.validate();
        org.elasticsearch.index.VersionType versionType17 = deleteRequest1.versionType();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput18 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest1.writeTo(streamOutput18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(taskId10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(versionType12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(versionType14);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(actionRequestValidationException16);
        org.junit.Assert.assertNotNull(versionType17);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.elasticsearch.action.support.replication.ReplicationTask replicationTask0 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.setPhase(replicationTask0, "delete {[delete {[null][null][null]}][delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}][hi!]}");
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}", "delete {[hi!][null][null]}", "");
        org.elasticsearch.index.shard.IndexShard indexShard4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete5 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest3, indexShard4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "", "delete {[delete {[null][null][hi!]}][null][hi!]}");
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.id("hi!");
        long long5 = deleteRequest4.primaryTerm();
        long long6 = deleteRequest4.seqNo();
        java.lang.String str7 = deleteRequest4.index();
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
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting10 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting12 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str15 = deleteRequest14.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest14.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest17.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest17.refresh(false);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException22 = deleteRequest21.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure24 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting12, "hi!", (java.lang.Throwable) actionRequestValidationException22, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure26 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting10, "hi!", (java.lang.Throwable) actionRequestValidationException22, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure28 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "delete {[null][null][null]}", (java.lang.Throwable) actionRequestValidationException22, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure30 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "delete {[null][null][null]}", (java.lang.Throwable) actionRequestValidationException22, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure32 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[][null][null]}", (java.lang.Throwable) actionRequestValidationException22, "delete {[delete {[null][null][null]}][delete {[][null][null]}][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure34 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}", (java.lang.Throwable) actionRequestValidationException22, "delete {[delete {[null][null][null]}][delete {[][null][null]}][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure36 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[delete {[null][null][null]}][null][null]}", (java.lang.Throwable) actionRequestValidationException22, "delete {[delete {[null][null][null]}][delete {[][null][null]}][hi!]}");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting37 = shardFailure36.routing;
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(actionRequestValidationException22);
        org.junit.Assert.assertNull(shardRouting37);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.elasticsearch.action.support.replication.ReplicationTask replicationTask0 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.setPhase(replicationTask0, "delete {[delete {[null][null][null]}][delete {[hi!][null][null]}][hi!]}");
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str11 = deleteRequest10.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest10.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest13.refresh(false);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException18 = deleteRequest17.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure20 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "hi!", (java.lang.Throwable) actionRequestValidationException18, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure22 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "delete {[null][null][hi!]}", (java.lang.Throwable) actionRequestValidationException18, "delete {[null][null][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure24 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[hi!][null][null]}", (java.lang.Throwable) actionRequestValidationException18, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure26 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[hi!][null][null]}", (java.lang.Throwable) actionRequestValidationException18, "delete {[null][delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}][delete {[][null][null]}]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure28 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}", (java.lang.Throwable) actionRequestValidationException18, "delete {[delete {[null][null][hi!]}][null][hi!]}");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(actionRequestValidationException18);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = deleteRequest0.indicesOptions();
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.setShardId(shardId4);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str7 = deleteRequest6.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.id("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue12 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.timeout(timeValue12);
        org.elasticsearch.index.VersionType versionType14 = deleteRequest11.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest5.versionType(versionType14);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest15.id("delete {[][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest15.type("delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}");
        java.lang.String str20 = deleteRequest19.toString();
        java.lang.String str21 = deleteRequest19.routing();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(indicesOptions3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(timeValue12);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(versionType14);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "delete {[null][delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}][delete {[][null][null]}]}" + "'", str20, "delete {[null][delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}][delete {[][null][null]}]}");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest0.parent("hi!");
        org.elasticsearch.common.transport.TransportAddress transportAddress7 = deleteRequest0.remoteAddress();
        java.lang.String str8 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest0.id("delete {[][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest0.routing("delete {[][hi!][]}");
        org.elasticsearch.common.io.stream.StreamInput streamInput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.readFrom(streamInput13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNull(transportAddress7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        long long4 = deleteRequest3.primaryTerm();
        long long5 = deleteRequest3.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue6 = deleteRequest3.timeout();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(timeValue6);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str9 = deleteRequest8.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest8.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.routing("");
        org.elasticsearch.tasks.TaskId taskId16 = deleteRequest15.getParentTask();
        deleteRequest7.setParentTask(taskId16);
        org.elasticsearch.index.shard.ShardId shardId18 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest7.setShardId(shardId18);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest7.parent("delete {[null][null][null]}");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException22 = deleteRequest21.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str24 = deleteRequest23.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest23.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest26.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest26.refresh(false);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException31 = deleteRequest30.validate();
        org.elasticsearch.tasks.TaskId taskId32 = deleteRequest30.getParentTask();
        deleteRequest21.setParentTask(taskId32);
        org.elasticsearch.index.shard.ShardId shardId34 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = deleteRequest21.setShardId(shardId34);
        deleteRequest21.primaryTerm((long) (short) -1);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(taskId16);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(actionRequestValidationException22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertNotNull(actionRequestValidationException31);
        org.junit.Assert.assertNotNull(taskId32);
        org.junit.Assert.assertNotNull(deleteRequest35);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][hi!]}", "delete {[null][null][hi!]}", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str5 = deleteRequest4.routing();
        org.elasticsearch.action.support.IndicesOptions indicesOptions6 = deleteRequest4.indicesOptions();
        boolean boolean7 = deleteRequest4.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest4.index("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue10 = deleteRequest9.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest3.timeout(timeValue10);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest3.timeout("hi!");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [hi!] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(indicesOptions6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(timeValue10);
        org.junit.Assert.assertNotNull(deleteRequest11);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.elasticsearch.action.support.replication.ReplicationTask replicationTask0 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.setPhase(replicationTask0, "delete {[delete {[null][null][hi!]}][null][hi!]}");
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        long long6 = deleteRequest3.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.routing("delete {[null][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.routing("hi!");
        java.lang.String str11 = deleteRequest3.parent();
        deleteRequest3.seqNo((long) (short) 1);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}", "", "hi!");
        boolean boolean4 = deleteRequest3.getShouldPersistResult();
        org.elasticsearch.common.io.stream.StreamInput streamInput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.readFrom(streamInput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str9 = deleteRequest8.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest8.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest11.refresh(false);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException16 = deleteRequest15.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure18 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "hi!", (java.lang.Throwable) actionRequestValidationException16, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure20 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[null][null][hi!]}", (java.lang.Throwable) actionRequestValidationException16, "delete {[null][null][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure22 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[delete {[null][null][hi!]}][null][hi!]}", (java.lang.Throwable) actionRequestValidationException16, "delete {[null][delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}][delete {[][null][null]}]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure24 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[hi!][][delete {[null][null][null]}]}", (java.lang.Throwable) actionRequestValidationException16, "delete {[delete {[null][null][hi!]}][null][hi!]}");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting25 = shardFailure24.routing;
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(actionRequestValidationException16);
        org.junit.Assert.assertNull(shardRouting25);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.common.unit.TimeValue timeValue8 = deleteRequest7.timeout();
        long long9 = deleteRequest7.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str11 = deleteRequest10.routing();
        org.elasticsearch.action.support.IndicesOptions indicesOptions12 = deleteRequest10.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][hi!]}");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel15 = deleteRequest14.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest10.consistencyLevel(writeConsistencyLevel15);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest7.consistencyLevel(writeConsistencyLevel15);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str22 = deleteRequest21.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest21.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest24.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest26.routing("");
        org.elasticsearch.tasks.TaskId taskId29 = deleteRequest28.getParentTask();
        java.lang.String[] strArray30 = deleteRequest28.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel35 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest36 = deleteRequest34.consistencyLevel(writeConsistencyLevel35);
        org.elasticsearch.action.support.IndicesOptions indicesOptions37 = deleteRequest34.indicesOptions();
        org.elasticsearch.index.shard.ShardId shardId38 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest39 = deleteRequest34.setShardId(shardId38);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest43 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str44 = deleteRequest43.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest46 = deleteRequest43.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest48 = deleteRequest46.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest50 = deleteRequest48.routing("");
        org.elasticsearch.tasks.TaskId taskId51 = deleteRequest50.getParentTask();
        org.elasticsearch.tasks.Task task52 = deleteRequest34.createTask(100L, "delete {[null][null][null]}", "delete {[null][null][null]}", taskId51);
        org.elasticsearch.tasks.Task task53 = deleteRequest28.createTask((long) (short) 10, "delete {[hi!][null][null]}", "delete {[][null][null]}", taskId51);
        org.elasticsearch.tasks.Task task54 = deleteRequest17.createTask((long) 10, "delete {[null][null][null]}", "", taskId51);
        org.elasticsearch.index.shard.IndexShard indexShard55 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult56 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest17, indexShard55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(indicesOptions12);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel15 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel15.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertNotNull(taskId29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(deleteRequest36);
        org.junit.Assert.assertNotNull(indicesOptions37);
        org.junit.Assert.assertNotNull(deleteRequest39);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(deleteRequest46);
        org.junit.Assert.assertNotNull(deleteRequest48);
        org.junit.Assert.assertNotNull(deleteRequest50);
        org.junit.Assert.assertNotNull(taskId51);
        org.junit.Assert.assertNotNull(task52);
        org.junit.Assert.assertNotNull(task53);
        org.junit.Assert.assertNotNull(task54);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.index.shard.ShardId shardId4 = deleteRequest3.shardId();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}", "delete {[null][null][null]}", "hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.parent("delete {[null][null][null]}");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = deleteRequest8.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest3.consistencyLevel(writeConsistencyLevel11);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest12.timeout("delete {[delete {[null][null][null]}][null][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[delete {[null][null][null]}][null][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNull(shardId4);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel11 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel11.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest12);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.setShardId(shardId6);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.refresh(true);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str11 = deleteRequest10.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest10.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest15.routing("");
        org.elasticsearch.tasks.TaskId taskId18 = deleteRequest17.getParentTask();
        java.lang.String[] strArray19 = deleteRequest17.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest17.version((long) 10);
        org.elasticsearch.common.transport.TransportAddress transportAddress22 = null;
        deleteRequest21.remoteAddress(transportAddress22);
        org.elasticsearch.common.unit.TimeValue timeValue24 = deleteRequest21.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest9.timeout(timeValue24);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest25.routing("delete {[hi!][null][null]}");
        org.elasticsearch.index.shard.IndexShard indexShard28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult29 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest25, indexShard28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(taskId18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(timeValue24);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(deleteRequest27);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.id("hi!");
        long long5 = deleteRequest4.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest4.timeout(timeValue6);
        org.elasticsearch.index.shard.IndexShard indexShard8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult9 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest4, indexShard8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest7);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.refresh(false);
        long long8 = deleteRequest7.primaryTerm();
        org.elasticsearch.index.shard.ShardId shardId9 = deleteRequest7.shardId();
        java.lang.String str10 = deleteRequest7.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str12 = deleteRequest11.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest11.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest14.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest16.routing("");
        org.elasticsearch.tasks.TaskId taskId19 = deleteRequest18.getParentTask();
        java.lang.String[] strArray20 = deleteRequest18.indices();
        org.elasticsearch.common.transport.TransportAddress transportAddress21 = deleteRequest18.remoteAddress();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel22 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest18.consistencyLevel(writeConsistencyLevel22);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest23.version((long) (short) 10);
        org.elasticsearch.common.unit.TimeValue timeValue26 = deleteRequest25.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest7.timeout(timeValue26);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest7.version(1L);
        deleteRequest7.primaryTerm((long) (short) 100);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(shardId9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(taskId19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNull(transportAddress21);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(timeValue26);
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertNotNull(deleteRequest29);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[null][null][null]}][delete {[hi!][null][null]}][hi!]}", "delete {[null][delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}][delete {[][null][null]}]}", "delete {[][null][null]}");
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        long long4 = deleteRequest3.primaryTerm();
        java.lang.String str5 = deleteRequest3.type();
        org.elasticsearch.index.shard.IndexShard indexShard6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult7 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest3, indexShard6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.id("hi!");
        java.lang.String str5 = deleteRequest4.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest4.parent("delete {[][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.refresh(true);
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = deleteRequest7.remoteAddress();
        java.lang.String str11 = deleteRequest7.id();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNull(transportAddress10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][delete {[null][null][null]}]}", "delete {[hi!][delete {[null][null][null]}][delete {[null][null][null]}]}", "delete {[hi!][][delete {[null][null][null]}]}");
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        boolean boolean4 = deleteRequest0.getShouldPersistResult();
        long long5 = deleteRequest0.version();
        java.lang.String str6 = deleteRequest0.toString();
        java.lang.String str7 = deleteRequest0.id();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-3L) + "'", long5 == (-3L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "delete {[null][null][hi!]}" + "'", str6, "delete {[null][null][hi!]}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest2.id("delete {[null][null][null]}");
        org.elasticsearch.common.io.stream.StreamOutput streamOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest2.writeTo(streamOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[null][null][null]}][delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}][hi!]}");
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
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}", "delete {[null][null][null]}", "hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.parent("delete {[null][null][null]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.timeout("delete {[null][delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}][delete {[][null][null]}]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[null][delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}][delete {[][null][null]}]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.common.unit.TimeValue timeValue8 = deleteRequest5.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.id("hi!");
        long long14 = deleteRequest13.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest13.version((long) ' ');
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][hi!]}");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel19 = deleteRequest18.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest16.consistencyLevel(writeConsistencyLevel19);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest5.consistencyLevel(writeConsistencyLevel19);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest21.id("delete {[null][null][null]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress24 = null;
        deleteRequest21.remoteAddress(transportAddress24);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel19 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel19.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(deleteRequest23);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.elasticsearch.action.support.replication.ReplicationTask replicationTask0 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.setPhase(replicationTask0, "delete {[hi!][delete {[null][null][null]}][delete {[null][null][null]}]}");
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str3 = deleteRequest2.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.id("hi!");
        java.lang.String str8 = deleteRequest5.index();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel9 = deleteRequest5.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str11 = deleteRequest10.routing();
        org.elasticsearch.action.support.IndicesOptions indicesOptions12 = deleteRequest10.indicesOptions();
        boolean boolean13 = deleteRequest10.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest10.index("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue16 = deleteRequest15.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str18 = deleteRequest17.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest17.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest20.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest22.routing("");
        org.elasticsearch.index.VersionType versionType25 = deleteRequest22.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest15.versionType(versionType25);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest5.versionType(versionType25);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[hi!][delete {[null][null][null]}][delete {[null][null][null]}]}", deleteRequest27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel9 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel9.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(indicesOptions12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(timeValue16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNotNull(versionType25);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNotNull(deleteRequest27);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        java.lang.String str2 = deleteRequest1.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str4 = deleteRequest3.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.routing("");
        org.elasticsearch.tasks.TaskId taskId11 = deleteRequest10.getParentTask();
        java.lang.String[] strArray12 = deleteRequest10.indices();
        org.elasticsearch.tasks.TaskId taskId13 = deleteRequest10.getParentTask();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel14 = deleteRequest10.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest1.consistencyLevel(writeConsistencyLevel14);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest15.routing("hi!");
        java.lang.String str18 = deleteRequest15.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel20 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest19.consistencyLevel(writeConsistencyLevel20);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest21.id("hi!");
        long long24 = deleteRequest23.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest23.version((long) ' ');
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][hi!]}");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel29 = deleteRequest28.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest26.consistencyLevel(writeConsistencyLevel29);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest15.consistencyLevel(writeConsistencyLevel29);
        java.lang.String str32 = deleteRequest15.id();
        java.lang.String str33 = deleteRequest15.id();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(taskId11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(taskId13);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel14 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel14.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "delete {[][null][null]}" + "'", str18, "delete {[][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel29 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel29.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "delete {[hi!][null][null]}", "delete {[null][null][null]}");
        deleteRequest3.seqNo((long) 10);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.writeTo(streamOutput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        long long3 = deleteRequest2.version();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.consistencyLevel(writeConsistencyLevel4);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest2.index("delete {[null][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.id("delete {[delete {[null][null][null]}][delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}][hi!]}");
        java.lang.String str10 = deleteRequest7.id();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3L) + "'", long3 == (-3L));
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "delete {[delete {[null][null][null]}][delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}][hi!]}" + "'", str10, "delete {[delete {[null][null][null]}][delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}][hi!]}");
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str7 = deleteRequest6.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest9.refresh(false);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException14 = deleteRequest13.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure16 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "hi!", (java.lang.Throwable) actionRequestValidationException14, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure18 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[null][null][hi!]}", (java.lang.Throwable) actionRequestValidationException14, "delete {[null][null][hi!]}");
        java.lang.Throwable throwable19 = shardFailure18.cause;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure21 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[delete {[null][null][hi!]}][null][hi!]}", throwable19, "delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(actionRequestValidationException14);
        org.junit.Assert.assertNotNull(throwable19);
        org.junit.Assert.assertEquals(throwable19.getLocalizedMessage(), "Validation Failed: 1: index is missing;2: type is missing;");
        org.junit.Assert.assertEquals(throwable19.getMessage(), "Validation Failed: 1: index is missing;2: type is missing;");
        org.junit.Assert.assertEquals(throwable19.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;2: type is missing;");
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str3 = deleteRequest2.routing();
        org.elasticsearch.action.support.IndicesOptions indicesOptions4 = deleteRequest2.indicesOptions();
        boolean boolean5 = deleteRequest2.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest2.index("hi!");
        long long8 = deleteRequest7.primaryTerm();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[hi!][delete {[delete {[null][null][null]}][delete {[][null][null]}][hi!]}][delete {[null][null][null]}]}", deleteRequest7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(indicesOptions4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.refresh(false);
        java.lang.String str8 = deleteRequest7.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest7.id("delete {[][null][null]}");
        org.elasticsearch.common.io.stream.StreamOutput streamOutput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest7.writeTo(streamOutput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "delete {[null][null][hi!]}" + "'", str8, "delete {[null][null][hi!]}");
        org.junit.Assert.assertNotNull(deleteRequest10);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest7.getParentTask();
        java.lang.String[] strArray9 = deleteRequest7.indices();
        org.elasticsearch.index.VersionType versionType10 = deleteRequest7.versionType();
        java.lang.String[] strArray11 = deleteRequest7.indices();
        org.elasticsearch.index.VersionType versionType12 = deleteRequest7.versionType();
        org.elasticsearch.common.io.stream.StreamInput streamInput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest7.readFrom(streamInput13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(versionType10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(versionType12);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.support.IndicesOptions indicesOptions2 = deleteRequest0.indicesOptions();
        boolean boolean3 = deleteRequest0.refresh();
        java.lang.String str4 = deleteRequest0.toString();
        org.elasticsearch.index.shard.IndexShard indexShard5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete6 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest0, indexShard5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(indicesOptions2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[null][null][null]}" + "'", str4, "delete {[null][null][null]}");
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[null][null][null]}][delete {[][null][null]}][hi!]}", "", "hi!");
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
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.index.shard.ShardId shardId2 = deleteRequest0.shardId();
        org.elasticsearch.index.VersionType versionType3 = deleteRequest0.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.version((-1L));
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.version(0L);
        org.elasticsearch.index.shard.ShardId shardId8 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.setShardId(shardId8);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("");
        java.lang.String str14 = deleteRequest13.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str16 = deleteRequest15.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest15.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest18.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest20.routing("");
        org.elasticsearch.tasks.TaskId taskId23 = deleteRequest22.getParentTask();
        java.lang.String[] strArray24 = deleteRequest22.indices();
        org.elasticsearch.tasks.TaskId taskId25 = deleteRequest22.getParentTask();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel26 = deleteRequest22.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest13.consistencyLevel(writeConsistencyLevel26);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest27.routing("hi!");
        java.lang.String str30 = deleteRequest27.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel32 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest31.consistencyLevel(writeConsistencyLevel32);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = deleteRequest33.id("hi!");
        long long36 = deleteRequest35.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest38 = deleteRequest35.version((long) ' ');
        org.elasticsearch.action.delete.DeleteRequest deleteRequest40 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][hi!]}");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel41 = deleteRequest40.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest42 = deleteRequest38.consistencyLevel(writeConsistencyLevel41);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest43 = deleteRequest27.consistencyLevel(writeConsistencyLevel41);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest44 = deleteRequest11.consistencyLevel(writeConsistencyLevel41);
        org.elasticsearch.index.shard.ShardId shardId45 = deleteRequest11.shardId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(shardId2);
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertNotNull(taskId23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(taskId25);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel26 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel26.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "delete {[][null][null]}" + "'", str30, "delete {[][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertNotNull(deleteRequest35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest38);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel41 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel41.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest42);
        org.junit.Assert.assertNotNull(deleteRequest43);
        org.junit.Assert.assertNotNull(deleteRequest44);
        org.junit.Assert.assertNull(shardId45);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = deleteRequest0.indicesOptions();
        org.elasticsearch.index.VersionType versionType4 = deleteRequest0.versionType();
        java.lang.String[] strArray5 = deleteRequest0.indices();
        java.lang.String[] strArray6 = deleteRequest0.indices();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException7 = deleteRequest0.validate();
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = deleteRequest0.remoteAddress();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = transportAddress8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(indicesOptions3);
        org.junit.Assert.assertNotNull(versionType4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(actionRequestValidationException7);
        org.junit.Assert.assertNull(transportAddress8);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting10 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str13 = deleteRequest12.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest12.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest15.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest15.refresh(false);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException20 = deleteRequest19.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure22 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting10, "hi!", (java.lang.Throwable) actionRequestValidationException20, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure24 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "", (java.lang.Throwable) actionRequestValidationException20, "delete {[null][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure26 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "", (java.lang.Throwable) actionRequestValidationException20, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure28 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[null][null][hi!]}", (java.lang.Throwable) actionRequestValidationException20, "delete {[null][null][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure30 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "hi!", (java.lang.Throwable) actionRequestValidationException20, "delete {[null][delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}][delete {[][null][null]}]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure32 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[null][delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}][delete {[][null][null]}]}", (java.lang.Throwable) actionRequestValidationException20, "delete {[delete {[null][null][null]}][null][null]}");
        java.lang.String str33 = shardFailure32.reason;
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(actionRequestValidationException20);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "delete {[null][delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}][delete {[][null][null]}]}" + "'", str33, "delete {[null][delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}][delete {[][null][null]}]}");
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        long long6 = deleteRequest3.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.routing("delete {[null][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.routing("hi!");
        java.lang.String str11 = deleteRequest10.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest10.version((long) '#');
        java.lang.String str14 = deleteRequest13.getDescription();
        long long15 = deleteRequest13.primaryTerm();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "delete {[null][null][hi!]}" + "'", str14, "delete {[null][null][hi!]}");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel3 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.consistencyLevel(writeConsistencyLevel3);
        long long5 = deleteRequest4.version();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest4.consistencyLevel(writeConsistencyLevel6);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest4.index("delete {[null][null][null]}");
        java.lang.String str10 = deleteRequest4.toString();
        org.elasticsearch.common.transport.TransportAddress transportAddress11 = deleteRequest4.remoteAddress();
        java.lang.String[] strArray12 = deleteRequest4.indices();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[hi!][null][null]}", deleteRequest4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-3L) + "'", long5 == (-3L));
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "delete {[delete {[null][null][null]}][null][null]}" + "'", str10, "delete {[delete {[null][null][null]}][null][null]}");
        org.junit.Assert.assertNull(transportAddress11);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        java.lang.String str2 = deleteRequest1.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str4 = deleteRequest3.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.routing("");
        org.elasticsearch.tasks.TaskId taskId11 = deleteRequest10.getParentTask();
        java.lang.String[] strArray12 = deleteRequest10.indices();
        org.elasticsearch.tasks.TaskId taskId13 = deleteRequest10.getParentTask();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel14 = deleteRequest10.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest1.consistencyLevel(writeConsistencyLevel14);
        long long16 = deleteRequest1.seqNo();
        org.elasticsearch.index.shard.IndexShard indexShard17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult18 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest1, indexShard17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(taskId11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(taskId13);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel14 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel14.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "");
        deleteRequest3.primaryTerm((long) (short) 10);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.routing("delete {[delete {[null][null][null]}][delete {[][null][null]}][hi!]}");
        java.lang.String str8 = deleteRequest3.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.id("delete {[null][delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}][delete {[][null][null]}]}");
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "delete {[delete {[null][null][null]}][delete {[][null][null]}][hi!]}" + "'", str8, "delete {[delete {[null][null][null]}][delete {[][null][null]}][hi!]}");
        org.junit.Assert.assertNotNull(deleteRequest10);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        long long6 = deleteRequest3.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.routing("delete {[null][null][null]}");
        org.elasticsearch.index.shard.ShardId shardId9 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setShardId(shardId9);
        long long11 = deleteRequest3.version();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-3L) + "'", long11 == (-3L));
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest0.parent("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str8 = deleteRequest7.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest7.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest12.routing("");
        org.elasticsearch.common.unit.TimeValue timeValue15 = deleteRequest12.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel17 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest16.consistencyLevel(writeConsistencyLevel17);
        org.elasticsearch.action.support.IndicesOptions indicesOptions19 = deleteRequest16.indicesOptions();
        org.elasticsearch.index.VersionType versionType20 = deleteRequest16.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest12.versionType(versionType20);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest6.versionType(versionType20);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest22.timeout("");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(timeValue15);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(indicesOptions19);
        org.junit.Assert.assertNotNull(versionType20);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(deleteRequest22);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        java.lang.String str6 = deleteRequest3.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.timeout("delete {[hi!][delete {[null][null][null]}][delete {[null][null][null]}]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[hi!][delete {[null][null][null]}][delete {[null][null][null]}]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "delete {[null][null][hi!]}" + "'", str6, "delete {[null][null][hi!]}");
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str3 = deleteRequest2.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.id("hi!");
        long long8 = deleteRequest5.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest5.routing("delete {[null][null][null]}");
        long long11 = deleteRequest10.primaryTerm();
        deleteRequest10.primaryTerm(0L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str15 = deleteRequest14.routing();
        org.elasticsearch.index.shard.ShardId shardId16 = deleteRequest14.shardId();
        org.elasticsearch.index.VersionType versionType17 = deleteRequest14.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest10.versionType(versionType17);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[hi!][][delete {[null][null][null]}]}", deleteRequest18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(shardId16);
        org.junit.Assert.assertNotNull(versionType17);
        org.junit.Assert.assertNotNull(deleteRequest18);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        java.lang.String str2 = deleteRequest1.index();
        org.elasticsearch.index.shard.ShardId shardId3 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest1.setShardId(shardId3);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = deleteRequest6.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest4.consistencyLevel(writeConsistencyLevel7);
        org.elasticsearch.index.shard.IndexShard indexShard9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete10 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest4, indexShard9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel7 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel7.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest8);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[null][null][null]}", throwable2, "delete {[null][null][hi!]}");
        java.lang.String str5 = shardFailure4.reason;
        java.lang.Throwable throwable6 = shardFailure4.cause;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "delete {[null][null][null]}" + "'", str5, "delete {[null][null][null]}");
        org.junit.Assert.assertNull(throwable6);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[null][null][null]}", throwable2, "delete {[hi!][][delete {[null][null][null]}]}");
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][null][null]}", "delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}", "delete {[hi!][null][null]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout("delete {[hi!][delete {[delete {[null][null][null]}][delete {[][null][null]}][hi!]}][delete {[null][null][null]}]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[hi!][delete {[delete {[null][null][null]}][delete {[][null][null]}][hi!]}][delete {[null][null][null]}]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        long long6 = deleteRequest5.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest5.type("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest5.id("delete {[][null][null]}");
        org.elasticsearch.index.VersionType versionType11 = deleteRequest10.versionType();
        deleteRequest10.primaryTerm((long) (short) 0);
        long long14 = deleteRequest10.version();
        java.lang.String str15 = deleteRequest10.routing();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(versionType11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-3L) + "'", long14 == (-3L));
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        java.lang.String str6 = deleteRequest3.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.routing("");
        boolean boolean9 = deleteRequest8.getShouldPersistResult();
        java.lang.String str10 = deleteRequest8.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "delete {[null][null][hi!]}" + "'", str10, "delete {[null][null][hi!]}");
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}][delete {[][null][null]}]}", "delete {[null][delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}][delete {[][null][null]}]}", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][hi!]}");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = deleteRequest5.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.consistencyLevel(writeConsistencyLevel6);
        java.lang.Class<?> wildcardClass8 = deleteRequest7.getClass();
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel6 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel6.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        long long4 = deleteRequest3.primaryTerm();
        boolean boolean5 = deleteRequest3.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.type("delete {[null][null][]}");
        org.elasticsearch.index.shard.ShardId shardId8 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.setShardId(shardId8);
        java.lang.String str10 = deleteRequest7.getDescription();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "delete {[null][delete {[null][null][]}][hi!]}" + "'", str10, "delete {[null][delete {[null][null][]}][hi!]}");
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.refresh(false);
        deleteRequest7.primaryTerm((long) 100);
        java.lang.String str10 = deleteRequest7.id();
        boolean boolean11 = deleteRequest7.getShouldPersistResult();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        java.lang.String str3 = deleteRequest0.index();
        long long4 = deleteRequest0.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest0.routing("delete {[null][null][null]}");
        java.lang.String str7 = deleteRequest6.getDescription();
        java.lang.Class<?> wildcardClass8 = deleteRequest6.getClass();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "delete {[null][null][null]}" + "'", str7, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str3 = deleteRequest2.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str11 = deleteRequest10.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest10.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest15.routing("");
        org.elasticsearch.tasks.TaskId taskId18 = deleteRequest17.getParentTask();
        deleteRequest9.setParentTask(taskId18);
        org.elasticsearch.index.shard.ShardId shardId20 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest9.setShardId(shardId20);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest9.parent("delete {[null][null][null]}");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException24 = deleteRequest23.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str26 = deleteRequest25.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest25.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest28.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest28.refresh(false);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException33 = deleteRequest32.validate();
        org.elasticsearch.tasks.TaskId taskId34 = deleteRequest32.getParentTask();
        deleteRequest23.setParentTask(taskId34);
        org.elasticsearch.index.shard.ShardId shardId36 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest37 = deleteRequest23.setShardId(shardId36);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[null][delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}][delete {[][null][null]}]}", deleteRequest37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(taskId18);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(actionRequestValidationException24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertNotNull(actionRequestValidationException33);
        org.junit.Assert.assertNotNull(taskId34);
        org.junit.Assert.assertNotNull(deleteRequest37);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.setShardId(shardId6);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.refresh(true);
        long long10 = deleteRequest7.primaryTerm();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest7.timeout("delete {[null][delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}][delete {[][null][null]}]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[null][delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}][delete {[][null][null]}]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str3 = deleteRequest2.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str11 = deleteRequest10.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest10.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest15.routing("");
        org.elasticsearch.tasks.TaskId taskId18 = deleteRequest17.getParentTask();
        deleteRequest9.setParentTask(taskId18);
        org.elasticsearch.index.shard.ShardId shardId20 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest9.setShardId(shardId20);
        org.elasticsearch.index.VersionType versionType22 = deleteRequest21.versionType();
        long long23 = deleteRequest21.version();
        deleteRequest21.seqNo((long) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[hi!][delete {[null][null][null]}][delete {[null][null][null]}]}", deleteRequest21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(taskId18);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(versionType22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-3L) + "'", long23 == (-3L));
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}][delete {[][null][null]}]}", "delete {[null][delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}][delete {[][null][null]}]}", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][hi!]}");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel8 = deleteRequest7.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest5.consistencyLevel(writeConsistencyLevel8);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "", deleteRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel8 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel8.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest9);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.id("hi!");
        long long5 = deleteRequest4.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest4.version((long) ' ');
        java.lang.String str8 = deleteRequest7.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest7.timeout("delete {[null][delete {[null][null][]}][hi!]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[null][delete {[null][null][]}][hi!]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str7 = deleteRequest6.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest9.refresh(false);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException14 = deleteRequest13.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure16 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[null][null][null]}", (java.lang.Throwable) actionRequestValidationException14, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure18 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[][null][null]}", (java.lang.Throwable) actionRequestValidationException14, "delete {[null][null][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure20 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[hi!][delete {[delete {[null][null][null]}][delete {[][null][null]}][hi!]}][delete {[null][null][null]}]}", (java.lang.Throwable) actionRequestValidationException14, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(actionRequestValidationException14);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        java.lang.String str6 = deleteRequest5.type();
        org.elasticsearch.common.io.stream.StreamInput streamInput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest5.readFrom(streamInput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][hi!]}", "delete {[null][null][hi!]}", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("");
        deleteRequest3.seqNo((long) 100);
        org.junit.Assert.assertNotNull(deleteRequest5);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.type("delete {[null][null][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.parent("delete {[null][null][null]}");
        org.elasticsearch.common.io.stream.StreamInput streamInput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.readFrom(streamInput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str3 = deleteRequest2.routing();
        org.elasticsearch.action.support.IndicesOptions indicesOptions4 = deleteRequest2.indicesOptions();
        boolean boolean5 = deleteRequest2.getShouldPersistResult();
        java.lang.String str6 = deleteRequest2.id();
        org.elasticsearch.common.transport.TransportAddress transportAddress7 = null;
        deleteRequest2.remoteAddress(transportAddress7);
        long long9 = deleteRequest2.version();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[delete {[null][null][null]}][delete {[hi!][null][null]}][hi!]}", deleteRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(indicesOptions4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-3L) + "'", long9 == (-3L));
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("");
        java.lang.String str4 = deleteRequest3.routing();
        boolean boolean5 = deleteRequest3.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[null][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str17 = deleteRequest16.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest16.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest19.id("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue22 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest21.timeout(timeValue22);
        org.elasticsearch.tasks.TaskId taskId24 = deleteRequest23.getParentTask();
        org.elasticsearch.tasks.Task task25 = deleteRequest12.createTask(0L, "delete {[hi!][null][null]}", "hi!", taskId24);
        org.elasticsearch.tasks.Task task26 = deleteRequest3.createTask((long) '4', "delete {[null][null][null]}", "", taskId24);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[][hi!][]}", deleteRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(timeValue22);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(taskId24);
        org.junit.Assert.assertNotNull(task25);
        org.junit.Assert.assertNotNull(task26);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.setShardId(shardId6);
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = null;
        deleteRequest3.remoteAddress(transportAddress8);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest3.index("delete {[null][null][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest3.id("delete {[delete {[null][null][null]}][delete {[hi!][null][null]}][hi!]}");
        org.elasticsearch.index.shard.IndexShard indexShard14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete15 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest3, indexShard14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str9 = deleteRequest8.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest8.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.routing("");
        org.elasticsearch.tasks.TaskId taskId16 = deleteRequest15.getParentTask();
        deleteRequest7.setParentTask(taskId16);
        org.elasticsearch.index.shard.ShardId shardId18 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest7.setShardId(shardId18);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest7.parent("delete {[null][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest7.index("hi!");
        deleteRequest23.primaryTerm(32L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(taskId16);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(deleteRequest23);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("delete {[delete {[null][null][null]}][delete {[hi!][null][null]}][hi!]}");
        java.lang.String str6 = deleteRequest5.type();
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.type("delete {[null][null][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.parent("delete {[null][null][null]}");
        deleteRequest4.primaryTerm((long) (short) -1);
        deleteRequest4.setParentTask("hi!", (long) ' ');
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str11 = deleteRequest10.routing();
        org.elasticsearch.action.support.IndicesOptions indicesOptions12 = deleteRequest10.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][hi!]}");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel15 = deleteRequest14.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest10.consistencyLevel(writeConsistencyLevel15);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest4.consistencyLevel(writeConsistencyLevel15);
        java.lang.Class<?> wildcardClass18 = writeConsistencyLevel15.getClass();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(indicesOptions12);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel15 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel15.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting10 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str13 = deleteRequest12.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest12.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest15.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest15.refresh(false);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException20 = deleteRequest19.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure22 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting10, "delete {[null][null][null]}", (java.lang.Throwable) actionRequestValidationException20, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure24 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "delete {[][null][null]}", (java.lang.Throwable) actionRequestValidationException20, "delete {[null][null][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure26 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}", (java.lang.Throwable) actionRequestValidationException20, "delete {[null][null][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure28 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "hi!", (java.lang.Throwable) actionRequestValidationException20, "delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure30 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[null][null][]}", (java.lang.Throwable) actionRequestValidationException20, "delete {[hi!][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure32 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "", (java.lang.Throwable) actionRequestValidationException20, "delete {[hi!][null][null]}");
        java.lang.String str33 = shardFailure32.indexUUID;
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(actionRequestValidationException20);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "delete {[hi!][null][null]}" + "'", str33, "delete {[hi!][null][null]}");
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest7.getParentTask();
        java.lang.String[] strArray9 = deleteRequest7.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest7.version((long) 10);
        org.elasticsearch.common.transport.TransportAddress transportAddress12 = null;
        deleteRequest11.remoteAddress(transportAddress12);
        java.lang.String str14 = deleteRequest11.id();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest7.getParentTask();
        java.lang.String[] strArray9 = deleteRequest7.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest7.version((long) 10);
        org.elasticsearch.common.transport.TransportAddress transportAddress12 = deleteRequest11.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest11.version((long) (short) 0);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest14.index("delete {[delete {[null][null][hi!]}][null][hi!]}");
        java.lang.Class<?> wildcardClass17 = deleteRequest16.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNull(transportAddress12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.refresh(false);
        deleteRequest7.primaryTerm((long) 100);
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = deleteRequest7.remoteAddress();
        boolean boolean11 = deleteRequest7.getShouldPersistResult();
        java.lang.String str12 = deleteRequest7.toString();
        org.elasticsearch.index.shard.ShardId shardId13 = deleteRequest7.shardId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNull(transportAddress10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "delete {[null][null][hi!]}" + "'", str12, "delete {[null][null][hi!]}");
        org.junit.Assert.assertNull(shardId13);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        java.lang.String str6 = deleteRequest5.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest5.index("delete {[null][null][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest5.version(1L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.refresh(false);
        java.lang.String str13 = deleteRequest12.getDescription();
        boolean boolean14 = deleteRequest12.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str18 = deleteRequest17.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest17.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest20.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest22.routing("");
        org.elasticsearch.tasks.TaskId taskId25 = deleteRequest24.getParentTask();
        java.lang.String[] strArray26 = deleteRequest24.indices();
        org.elasticsearch.index.VersionType versionType27 = deleteRequest24.versionType();
        java.lang.String[] strArray28 = deleteRequest24.indices();
        org.elasticsearch.index.VersionType versionType29 = deleteRequest24.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest16.versionType(versionType29);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest12.versionType(versionType29);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str33 = deleteRequest32.routing();
        org.elasticsearch.action.support.IndicesOptions indicesOptions34 = deleteRequest32.indicesOptions();
        boolean boolean35 = deleteRequest32.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest37 = deleteRequest32.index("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue38 = deleteRequest37.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest39 = deleteRequest12.timeout(timeValue38);
        java.lang.Class<?> wildcardClass40 = deleteRequest39.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "delete {[delete {[null][null][hi!]}][null][hi!]}" + "'", str13, "delete {[delete {[null][null][hi!]}][null][hi!]}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNotNull(taskId25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(versionType27);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(versionType29);
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(indicesOptions34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(deleteRequest37);
        org.junit.Assert.assertNotNull(timeValue38);
        org.junit.Assert.assertNotNull(deleteRequest39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.type("delete {[null][null][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.parent("delete {[null][null][null]}");
        deleteRequest4.primaryTerm((long) (short) -1);
        deleteRequest4.setParentTask("hi!", (long) ' ');
        org.elasticsearch.common.unit.TimeValue timeValue10 = deleteRequest4.timeout();
        org.elasticsearch.common.unit.TimeValue timeValue11 = deleteRequest4.timeout();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(timeValue10);
        org.junit.Assert.assertNotNull(timeValue11);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[null][null][hi!]}", throwable2, "delete {[delete {[null][null][null]}][delete {[hi!][null][null]}][hi!]}");
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str11 = deleteRequest10.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest10.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest13.refresh(false);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException18 = deleteRequest17.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure20 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "hi!", (java.lang.Throwable) actionRequestValidationException18, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure22 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "hi!", (java.lang.Throwable) actionRequestValidationException18, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure24 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[null][null][null]}", (java.lang.Throwable) actionRequestValidationException18, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure26 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[null][null][null]}", (java.lang.Throwable) actionRequestValidationException18, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure28 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[][null][null]}", (java.lang.Throwable) actionRequestValidationException18, "delete {[delete {[null][null][null]}][delete {[][null][null]}][hi!]}");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting29 = shardFailure28.routing;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting30 = shardFailure28.routing;
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(actionRequestValidationException18);
        org.junit.Assert.assertNull(shardRouting29);
        org.junit.Assert.assertNull(shardRouting30);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str5 = deleteRequest4.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest4.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.routing("");
        org.elasticsearch.tasks.TaskId taskId12 = deleteRequest11.getParentTask();
        java.lang.String[] strArray13 = deleteRequest11.indices();
        org.elasticsearch.common.transport.TransportAddress transportAddress14 = deleteRequest11.remoteAddress();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel15 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest11.consistencyLevel(writeConsistencyLevel15);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest16.version((long) (short) 10);
        java.lang.String str19 = deleteRequest18.id();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException20 = deleteRequest18.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure22 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "", (java.lang.Throwable) actionRequestValidationException20, "delete {[null][null][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure24 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[delete {[null][null][hi!]}][delete {[null][null][hi!]}][]}", (java.lang.Throwable) actionRequestValidationException20, "");
        java.lang.String str25 = shardFailure24.reason;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(taskId12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(transportAddress14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(actionRequestValidationException20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "delete {[delete {[null][null][hi!]}][delete {[null][null][hi!]}][]}" + "'", str25, "delete {[delete {[null][null][hi!]}][delete {[null][null][hi!]}][]}");
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest0.parent("hi!");
        org.elasticsearch.common.transport.TransportAddress transportAddress7 = deleteRequest0.remoteAddress();
        java.lang.String str8 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest0.id("delete {[][null][null]}");
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
        org.junit.Assert.assertNull(transportAddress7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest7.getParentTask();
        org.elasticsearch.common.transport.TransportAddress transportAddress9 = deleteRequest7.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest7.parent("hi!");
        java.lang.String[] strArray12 = deleteRequest11.indices();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNull(transportAddress9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[delete {[null][null][null]}][null][null]}", deleteRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[null][null][null]}][delete {[hi!][null][null]}][hi!]}", "delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}", "delete {[null][delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}][delete {[][null][null]}]}");
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = deleteRequest0.indicesOptions();
        org.elasticsearch.index.VersionType versionType4 = deleteRequest0.versionType();
        java.lang.String[] strArray5 = deleteRequest0.indices();
        java.lang.String[] strArray6 = deleteRequest0.indices();
        org.elasticsearch.common.unit.TimeValue timeValue7 = deleteRequest0.timeout();
        long long8 = deleteRequest0.primaryTerm();
        java.lang.String str9 = deleteRequest0.getDescription();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str11 = deleteRequest10.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest10.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest15.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str19 = deleteRequest18.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest18.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest21.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest23.routing("");
        org.elasticsearch.tasks.TaskId taskId26 = deleteRequest25.getParentTask();
        deleteRequest17.setParentTask(taskId26);
        deleteRequest0.setParentTask(taskId26);
        java.lang.String str29 = deleteRequest0.type();
        org.elasticsearch.common.io.stream.StreamInput streamInput30 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.readFrom(streamInput30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(indicesOptions3);
        org.junit.Assert.assertNotNull(versionType4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(timeValue7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "delete {[null][null][null]}" + "'", str9, "delete {[null][null][null]}");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(taskId26);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest7.getParentTask();
        java.lang.String[] strArray9 = deleteRequest7.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest7.version((long) 10);
        org.elasticsearch.common.transport.TransportAddress transportAddress12 = deleteRequest11.remoteAddress();
        java.lang.String str13 = deleteRequest11.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNull(transportAddress12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "delete {[null][null][hi!]}" + "'", str13, "delete {[null][null][hi!]}");
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest7.getParentTask();
        java.lang.String[] strArray9 = deleteRequest7.indices();
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = deleteRequest7.remoteAddress();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest7.consistencyLevel(writeConsistencyLevel11);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest12.version((long) (short) 10);
        java.lang.String str15 = deleteRequest14.id();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException16 = deleteRequest14.validate();
        deleteRequest14.setParentTask("delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}", 32L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(transportAddress10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(actionRequestValidationException16);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        long long3 = deleteRequest2.version();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.consistencyLevel(writeConsistencyLevel4);
        java.lang.String[] strArray6 = deleteRequest2.indices();
        java.lang.String str7 = deleteRequest2.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest2.id("delete {[hi!][null][null]}");
        deleteRequest2.primaryTerm(0L);
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3L) + "'", long3 == (-3L));
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(deleteRequest9);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        long long4 = deleteRequest3.primaryTerm();
        boolean boolean5 = deleteRequest3.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.type("delete {[null][null][]}");
        long long8 = deleteRequest3.primaryTerm();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest7.getParentTask();
        java.lang.String[] strArray9 = deleteRequest7.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest7.version((long) 10);
        org.elasticsearch.common.transport.TransportAddress transportAddress12 = deleteRequest11.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest11.version((long) (short) 0);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest14.index("delete {[null][delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}][delete {[][null][null]}]}");
        boolean boolean17 = deleteRequest16.refresh();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNull(transportAddress12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.support.IndicesOptions indicesOptions2 = deleteRequest0.indicesOptions();
        deleteRequest0.seqNo(1L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(indicesOptions2);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = deleteRequest1.consistencyLevel();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput3 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest1.writeTo(streamOutput3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel2 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel2.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][hi!]}", "delete {[null][null][hi!]}", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("");
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest3.remoteAddress(transportAddress6);
        org.junit.Assert.assertNotNull(deleteRequest5);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][delete {[null][null][null]}][delete {[null][null][null]}]}", "delete {[hi!][][delete {[null][null][null]}]}", "delete {[null][null][]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout("delete {[delete {[null][null][null]}][delete {[][null][null]}][hi!]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[delete {[null][null][null]}][delete {[][null][null]}][hi!]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "delete {[hi!][null][null]}", "delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}");
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("");
        java.lang.String str4 = deleteRequest3.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str6 = deleteRequest5.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest5.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.routing("");
        org.elasticsearch.tasks.TaskId taskId13 = deleteRequest12.getParentTask();
        java.lang.String[] strArray14 = deleteRequest12.indices();
        org.elasticsearch.tasks.TaskId taskId15 = deleteRequest12.getParentTask();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel16 = deleteRequest12.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest3.consistencyLevel(writeConsistencyLevel16);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest17.routing("hi!");
        java.lang.String str20 = deleteRequest17.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel22 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest21.consistencyLevel(writeConsistencyLevel22);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest23.id("hi!");
        long long26 = deleteRequest25.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest25.version((long) ' ');
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][hi!]}");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel31 = deleteRequest30.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest28.consistencyLevel(writeConsistencyLevel31);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest17.consistencyLevel(writeConsistencyLevel31);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = deleteRequest17.version(0L);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[hi!][null][null]}", deleteRequest35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(taskId13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(taskId15);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel16 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel16.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "delete {[][null][null]}" + "'", str20, "delete {[][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel31 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel31.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertNotNull(deleteRequest35);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}", "hi!");
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.setShardId(shardId4);
        org.elasticsearch.tasks.TaskId taskId6 = deleteRequest3.getParentTask();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.writeTo(streamOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(taskId6);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str9 = deleteRequest8.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest8.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest11.refresh(false);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException16 = deleteRequest15.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure18 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "hi!", (java.lang.Throwable) actionRequestValidationException16, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure20 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "hi!", (java.lang.Throwable) actionRequestValidationException16, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure22 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[][null][null]}", (java.lang.Throwable) actionRequestValidationException16, "delete {[delete {[null][null][null]}][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure24 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[null][null][]}", (java.lang.Throwable) actionRequestValidationException16, "delete {[delete {[null][null][null]}][delete {[][null][null]}][hi!]}");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(actionRequestValidationException16);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str3 = deleteRequest2.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.id("hi!");
        long long8 = deleteRequest7.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest7.type("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest7.id("delete {[][null][null]}");
        org.elasticsearch.index.shard.ShardId shardId13 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest12.setShardId(shardId13);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[][hi!][]}", deleteRequest12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest14);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "", "hi!");
        deleteRequest3.primaryTerm((-3L));
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str7 = deleteRequest6.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest9.refresh(false);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException14 = deleteRequest13.validate();
        org.elasticsearch.tasks.TaskId taskId15 = deleteRequest13.getParentTask();
        deleteRequest3.setParentTask(taskId15);
        java.lang.Class<?> wildcardClass17 = taskId15.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(actionRequestValidationException14);
        org.junit.Assert.assertNotNull(taskId15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str3 = deleteRequest2.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.routing("");
        java.lang.String[] strArray10 = deleteRequest7.indices();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = deleteRequest7.consistencyLevel();
        boolean boolean12 = deleteRequest7.refresh();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[null][delete {[null][null][]}][hi!]}", deleteRequest7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel11 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel11.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting10 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting12 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str15 = deleteRequest14.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest14.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest17.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest17.refresh(false);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException22 = deleteRequest21.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure24 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting12, "hi!", (java.lang.Throwable) actionRequestValidationException22, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure26 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting10, "hi!", (java.lang.Throwable) actionRequestValidationException22, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure28 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "delete {[null][null][null]}", (java.lang.Throwable) actionRequestValidationException22, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure30 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "delete {[null][null][null]}", (java.lang.Throwable) actionRequestValidationException22, "hi!");
        java.lang.Throwable throwable31 = shardFailure30.cause;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure33 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[null][null][hi!]}", throwable31, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure35 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "hi!", throwable31, "delete {[][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure37 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[delete {[null][null][null]}][null][null]}", throwable31, "delete {[delete {[null][null][null]}][delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}][hi!]}");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(actionRequestValidationException22);
        org.junit.Assert.assertNotNull(throwable31);
        org.junit.Assert.assertEquals(throwable31.getLocalizedMessage(), "Validation Failed: 1: index is missing;2: type is missing;");
        org.junit.Assert.assertEquals(throwable31.getMessage(), "Validation Failed: 1: index is missing;2: type is missing;");
        org.junit.Assert.assertEquals(throwable31.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;2: type is missing;");
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        java.lang.String str3 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.consistencyLevel(writeConsistencyLevel5);
        org.elasticsearch.action.support.IndicesOptions indicesOptions7 = deleteRequest4.indicesOptions();
        org.elasticsearch.index.shard.ShardId shardId8 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest4.setShardId(shardId8);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str11 = deleteRequest10.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest10.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.id("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue16 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest15.timeout(timeValue16);
        org.elasticsearch.index.VersionType versionType18 = deleteRequest15.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest9.versionType(versionType18);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel21 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest20.consistencyLevel(writeConsistencyLevel21);
        org.elasticsearch.action.support.IndicesOptions indicesOptions23 = deleteRequest20.indicesOptions();
        org.elasticsearch.index.VersionType versionType24 = deleteRequest20.versionType();
        java.lang.String[] strArray25 = deleteRequest20.indices();
        java.lang.String[] strArray26 = deleteRequest20.indices();
        org.elasticsearch.common.unit.TimeValue timeValue27 = deleteRequest20.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest19.timeout(timeValue27);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest0.timeout(timeValue27);
        deleteRequest0.primaryTerm((long) 1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str36 = deleteRequest35.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest38 = deleteRequest35.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest40 = deleteRequest38.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest42 = deleteRequest40.routing("");
        org.elasticsearch.common.unit.TimeValue timeValue43 = deleteRequest42.timeout();
        long long44 = deleteRequest42.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest45 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str46 = deleteRequest45.routing();
        org.elasticsearch.action.support.IndicesOptions indicesOptions47 = deleteRequest45.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest49 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][hi!]}");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel50 = deleteRequest49.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest51 = deleteRequest45.consistencyLevel(writeConsistencyLevel50);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest52 = deleteRequest42.consistencyLevel(writeConsistencyLevel50);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest56 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str57 = deleteRequest56.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest59 = deleteRequest56.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest61 = deleteRequest59.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest63 = deleteRequest61.routing("");
        org.elasticsearch.tasks.TaskId taskId64 = deleteRequest63.getParentTask();
        java.lang.String[] strArray65 = deleteRequest63.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest69 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel70 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest71 = deleteRequest69.consistencyLevel(writeConsistencyLevel70);
        org.elasticsearch.action.support.IndicesOptions indicesOptions72 = deleteRequest69.indicesOptions();
        org.elasticsearch.index.shard.ShardId shardId73 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest74 = deleteRequest69.setShardId(shardId73);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest78 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str79 = deleteRequest78.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest81 = deleteRequest78.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest83 = deleteRequest81.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest85 = deleteRequest83.routing("");
        org.elasticsearch.tasks.TaskId taskId86 = deleteRequest85.getParentTask();
        org.elasticsearch.tasks.Task task87 = deleteRequest69.createTask(100L, "delete {[null][null][null]}", "delete {[null][null][null]}", taskId86);
        org.elasticsearch.tasks.Task task88 = deleteRequest63.createTask((long) (short) 10, "delete {[hi!][null][null]}", "delete {[][null][null]}", taskId86);
        org.elasticsearch.tasks.Task task89 = deleteRequest52.createTask((long) 10, "delete {[null][null][null]}", "", taskId86);
        org.elasticsearch.tasks.Task task90 = deleteRequest0.createTask(0L, "delete {[null][null][]}", "delete {[hi!][][delete {[null][null][null]}]}", taskId86);
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(indicesOptions7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(timeValue16);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(versionType18);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertNotNull(indicesOptions23);
        org.junit.Assert.assertNotNull(versionType24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(timeValue27);
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(deleteRequest38);
        org.junit.Assert.assertNotNull(deleteRequest40);
        org.junit.Assert.assertNotNull(deleteRequest42);
        org.junit.Assert.assertNotNull(timeValue43);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(indicesOptions47);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel50 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel50.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest51);
        org.junit.Assert.assertNotNull(deleteRequest52);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(deleteRequest59);
        org.junit.Assert.assertNotNull(deleteRequest61);
        org.junit.Assert.assertNotNull(deleteRequest63);
        org.junit.Assert.assertNotNull(taskId64);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(deleteRequest71);
        org.junit.Assert.assertNotNull(indicesOptions72);
        org.junit.Assert.assertNotNull(deleteRequest74);
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertNotNull(deleteRequest81);
        org.junit.Assert.assertNotNull(deleteRequest83);
        org.junit.Assert.assertNotNull(deleteRequest85);
        org.junit.Assert.assertNotNull(taskId86);
        org.junit.Assert.assertNotNull(task87);
        org.junit.Assert.assertNotNull(task88);
        org.junit.Assert.assertNotNull(task89);
        org.junit.Assert.assertNotNull(task90);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}", "delete {[hi!][][delete {[null][null][null]}]}", "delete {[delete {[null][null][hi!]}][delete {[null][null][hi!]}][]}");
        org.elasticsearch.index.shard.IndexShard indexShard4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete5 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest3, indexShard4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.type("delete {[null][null][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest2.type("delete {[delete {[null][null][null]}][delete {[][null][null]}][hi!]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[hi!][null][null]}", deleteRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest7.getParentTask();
        java.lang.String[] strArray9 = deleteRequest7.indices();
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = deleteRequest7.remoteAddress();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest7.consistencyLevel(writeConsistencyLevel11);
        java.lang.String[] strArray13 = deleteRequest12.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str15 = deleteRequest14.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest14.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest17.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest19.routing("");
        org.elasticsearch.tasks.TaskId taskId22 = deleteRequest21.getParentTask();
        java.lang.String[] strArray23 = deleteRequest21.indices();
        org.elasticsearch.common.transport.TransportAddress transportAddress24 = deleteRequest21.remoteAddress();
        org.elasticsearch.index.shard.ShardId shardId25 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest21.setShardId(shardId25);
        org.elasticsearch.index.VersionType versionType27 = deleteRequest21.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest12.versionType(versionType27);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput29 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest28.writeTo(streamOutput29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(transportAddress10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(taskId22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNull(transportAddress24);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNotNull(versionType27);
        org.junit.Assert.assertNotNull(deleteRequest28);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = deleteRequest0.indicesOptions();
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.setShardId(shardId4);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        deleteRequest7.setParentTask("delete {[hi!][null][null]}", (-3L));
        boolean boolean11 = deleteRequest7.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str16 = deleteRequest15.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest15.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest18.id("hi!");
        java.lang.String str21 = deleteRequest18.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str23 = deleteRequest22.routing();
        org.elasticsearch.action.support.IndicesOptions indicesOptions24 = deleteRequest22.indicesOptions();
        boolean boolean25 = deleteRequest22.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str30 = deleteRequest29.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest29.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = deleteRequest32.id("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue35 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest36 = deleteRequest34.timeout(timeValue35);
        org.elasticsearch.tasks.TaskId taskId37 = deleteRequest36.getParentTask();
        org.elasticsearch.tasks.Task task38 = deleteRequest22.createTask((long) (short) 0, "delete {[null][null][null]}", "", taskId37);
        deleteRequest18.setParentTask(taskId37);
        org.elasticsearch.tasks.Task task40 = deleteRequest7.createTask((-1L), "delete {[null][null][null]}", "delete {[delete {[null][null][null]}][null][null]}", taskId37);
        deleteRequest0.setParentTask(taskId37);
        java.lang.Class<?> wildcardClass42 = taskId37.getClass();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(indicesOptions3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(indicesOptions24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertNotNull(deleteRequest34);
        org.junit.Assert.assertNotNull(timeValue35);
        org.junit.Assert.assertNotNull(deleteRequest36);
        org.junit.Assert.assertNotNull(taskId37);
        org.junit.Assert.assertNotNull(task38);
        org.junit.Assert.assertNotNull(task40);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.common.unit.TimeValue timeValue8 = deleteRequest5.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.consistencyLevel(writeConsistencyLevel10);
        org.elasticsearch.action.support.IndicesOptions indicesOptions12 = deleteRequest9.indicesOptions();
        org.elasticsearch.index.VersionType versionType13 = deleteRequest9.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest5.versionType(versionType13);
        org.elasticsearch.index.shard.IndexShard indexShard15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete16 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest5, indexShard15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(indicesOptions12);
        org.junit.Assert.assertNotNull(versionType13);
        org.junit.Assert.assertNotNull(deleteRequest14);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        org.elasticsearch.action.support.IndicesOptions indicesOptions3 = deleteRequest0.indicesOptions();
        deleteRequest0.setParentTask("delete {[null][delete {[null][null][]}][hi!]}", (long) (-1));
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(indicesOptions3);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][null][null]}", "delete {[null][null][delete {[null][null][null]}]}", "delete {[hi!][][delete {[null][null][null]}]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[delete {[null][null][null]}][delete {[hi!][null][null]}][hi!]}", deleteRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}", "delete {[null][null][null]}", "hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.parent("delete {[null][null][null]}");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = deleteRequest3.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.id("delete {[hi!][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.index("delete {[delete {[null][null][null]}][delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][hi!]}", "delete {[null][null][hi!]}", "");
        org.elasticsearch.index.VersionType versionType17 = deleteRequest16.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest10.versionType(versionType17);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest10.timeout("delete {[hi!][null][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[hi!][null][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel6 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel6.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(versionType17);
        org.junit.Assert.assertNotNull(deleteRequest18);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.support.IndicesOptions indicesOptions2 = deleteRequest0.indicesOptions();
        boolean boolean3 = deleteRequest0.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str8 = deleteRequest7.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest7.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.id("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue13 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest12.timeout(timeValue13);
        org.elasticsearch.tasks.TaskId taskId15 = deleteRequest14.getParentTask();
        org.elasticsearch.tasks.Task task16 = deleteRequest0.createTask((long) (short) 0, "delete {[null][null][null]}", "", taskId15);
        boolean boolean17 = deleteRequest0.getShouldPersistResult();
        org.elasticsearch.index.shard.ShardId shardId18 = deleteRequest0.shardId();
        java.lang.String str19 = deleteRequest0.id();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest0.timeout("");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(indicesOptions2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(timeValue13);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(taskId15);
        org.junit.Assert.assertNotNull(task16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(shardId18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "", throwable2, "");
        java.lang.String str5 = shardFailure4.reason;
        java.lang.Throwable throwable6 = shardFailure4.cause;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(throwable6);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.support.IndicesOptions indicesOptions2 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.id("");
        long long5 = deleteRequest4.version();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str7 = deleteRequest6.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest9.refresh(false);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException14 = deleteRequest13.validate();
        org.elasticsearch.tasks.TaskId taskId15 = deleteRequest13.getParentTask();
        deleteRequest4.setParentTask(taskId15);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest4.version((long) (byte) -1);
        deleteRequest4.seqNo((long) 1);
        boolean boolean21 = deleteRequest4.refresh();
        java.lang.String str22 = deleteRequest4.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(indicesOptions2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-3L) + "'", long5 == (-3L));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(actionRequestValidationException14);
        org.junit.Assert.assertNotNull(taskId15);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "delete {[null][null][]}" + "'", str22, "delete {[null][null][]}");
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "delete {[null][delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}][delete {[][null][null]}]}", "delete {[delete {[null][null][null]}][null][null]}");
        java.lang.String str4 = deleteRequest3.parent();
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        long long6 = deleteRequest3.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.routing("delete {[null][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.routing("hi!");
        java.lang.String str11 = deleteRequest3.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel13 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest12.consistencyLevel(writeConsistencyLevel13);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest12.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest12.parent("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str20 = deleteRequest19.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest19.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest22.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest24.routing("");
        org.elasticsearch.common.unit.TimeValue timeValue27 = deleteRequest24.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel29 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest28.consistencyLevel(writeConsistencyLevel29);
        org.elasticsearch.action.support.IndicesOptions indicesOptions31 = deleteRequest28.indicesOptions();
        org.elasticsearch.index.VersionType versionType32 = deleteRequest28.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest24.versionType(versionType32);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = deleteRequest18.versionType(versionType32);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = deleteRequest3.versionType(versionType32);
        java.lang.Class<?> wildcardClass36 = deleteRequest35.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNotNull(timeValue27);
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertNotNull(indicesOptions31);
        org.junit.Assert.assertNotNull(versionType32);
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertNotNull(deleteRequest34);
        org.junit.Assert.assertNotNull(deleteRequest35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        java.lang.String str2 = deleteRequest1.toString();
        org.elasticsearch.common.unit.TimeValue timeValue3 = deleteRequest1.timeout();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest1.writeTo(streamOutput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "delete {[hi!][null][null]}" + "'", str2, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(timeValue3);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.elasticsearch.action.support.replication.ReplicationTask replicationTask0 = null;
        org.elasticsearch.action.support.replication.TransportReplicationAction.setPhase(replicationTask0, "delete {[null][delete {[null][null][]}][hi!]}");
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}", "delete {[null][null][null]}", "delete {[null][null][null]}");
        long long4 = deleteRequest3.seqNo();
        long long5 = deleteRequest3.version();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.writeTo(streamOutput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-3L) + "'", long5 == (-3L));
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}", "delete {[][null][null]}", "hi!");
        java.lang.String str4 = deleteRequest3.toString();
        java.lang.String str5 = deleteRequest3.routing();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[delete {[null][null][null]}][delete {[][null][null]}][hi!]}" + "'", str4, "delete {[delete {[null][null][null]}][delete {[][null][null]}][hi!]}");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.common.transport.TransportAddress transportAddress2 = deleteRequest0.remoteAddress();
        org.elasticsearch.common.transport.TransportAddress transportAddress3 = deleteRequest0.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.type("delete {[null][null][null]}");
        java.lang.String str6 = deleteRequest5.routing();
        java.lang.String str7 = deleteRequest5.type();
        org.elasticsearch.index.shard.ShardId shardId8 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest5.setShardId(shardId8);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest5.timeout("hi!");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [hi!] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(transportAddress2);
        org.junit.Assert.assertNull(transportAddress3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "delete {[null][null][null]}" + "'", str7, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest9);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}", "delete {[null][null][null]}", "delete {[delete {[null][null][null]}][delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}][hi!]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = deleteRequest3.remoteAddress();
        org.junit.Assert.assertNull(transportAddress4);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str3 = deleteRequest2.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.id("hi!");
        org.elasticsearch.index.shard.ShardId shardId8 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest5.setShardId(shardId8);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.refresh(true);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[hi!][delete {[delete {[null][null][null]}][delete {[][null][null]}][hi!]}][delete {[null][null][null]}]}", deleteRequest11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        java.lang.String str6 = deleteRequest5.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest5.index("delete {[null][null][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest5.version(1L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.parent("delete {[hi!][null][null]}");
        org.elasticsearch.index.shard.IndexShard indexShard13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportReplicationAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult14 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest12, indexShard13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.index.VersionType versionType8 = deleteRequest5.versionType();
        boolean boolean9 = deleteRequest5.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str11 = deleteRequest10.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest10.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.id("hi!");
        java.lang.String str16 = deleteRequest13.index();
        org.elasticsearch.common.unit.TimeValue timeValue17 = deleteRequest13.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest5.timeout(timeValue17);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest18.timeout("delete {[delete {[null][null][null]}][null][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[delete {[null][null][null]}][null][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(versionType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(timeValue17);
        org.junit.Assert.assertNotNull(deleteRequest18);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        long long4 = deleteRequest3.primaryTerm();
        boolean boolean5 = deleteRequest3.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.type("delete {[null][null][]}");
        org.elasticsearch.index.shard.ShardId shardId8 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.setShardId(shardId8);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.timeout("");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest7.getParentTask();
        java.lang.String[] strArray9 = deleteRequest7.indices();
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = deleteRequest7.remoteAddress();
        org.elasticsearch.index.shard.ShardId shardId11 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest7.setShardId(shardId11);
        org.elasticsearch.index.VersionType versionType13 = deleteRequest7.versionType();
        java.lang.String str14 = deleteRequest7.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest7.id("hi!");
        java.lang.String str17 = deleteRequest7.id();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(transportAddress10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(versionType13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        long long3 = deleteRequest2.version();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.version((long) (short) 0);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.consistencyLevel(writeConsistencyLevel7);
        java.lang.String str9 = deleteRequest6.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.consistencyLevel(writeConsistencyLevel11);
        org.elasticsearch.action.support.IndicesOptions indicesOptions13 = deleteRequest10.indicesOptions();
        org.elasticsearch.index.shard.ShardId shardId14 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest10.setShardId(shardId14);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str17 = deleteRequest16.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest16.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest19.id("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue22 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest21.timeout(timeValue22);
        org.elasticsearch.index.VersionType versionType24 = deleteRequest21.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest15.versionType(versionType24);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel27 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest26.consistencyLevel(writeConsistencyLevel27);
        org.elasticsearch.action.support.IndicesOptions indicesOptions29 = deleteRequest26.indicesOptions();
        org.elasticsearch.index.VersionType versionType30 = deleteRequest26.versionType();
        java.lang.String[] strArray31 = deleteRequest26.indices();
        java.lang.String[] strArray32 = deleteRequest26.indices();
        org.elasticsearch.common.unit.TimeValue timeValue33 = deleteRequest26.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = deleteRequest25.timeout(timeValue33);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = deleteRequest6.timeout(timeValue33);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest36 = deleteRequest5.timeout(timeValue33);
        deleteRequest5.primaryTerm((-1L));
        org.elasticsearch.common.io.stream.StreamOutput streamOutput39 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest5.writeTo(streamOutput39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3L) + "'", long3 == (-3L));
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(indicesOptions13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(timeValue22);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(versionType24);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertNotNull(indicesOptions29);
        org.junit.Assert.assertNotNull(versionType30);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(timeValue33);
        org.junit.Assert.assertNotNull(deleteRequest34);
        org.junit.Assert.assertNotNull(deleteRequest35);
        org.junit.Assert.assertNotNull(deleteRequest36);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str9 = deleteRequest8.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest8.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest11.refresh(false);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException16 = deleteRequest15.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure18 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "delete {[null][null][null]}", (java.lang.Throwable) actionRequestValidationException16, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure20 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[][null][null]}", (java.lang.Throwable) actionRequestValidationException16, "delete {[null][null][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure22 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}", (java.lang.Throwable) actionRequestValidationException16, "delete {[null][null][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure24 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[null][delete {[null][null][]}][hi!]}", (java.lang.Throwable) actionRequestValidationException16, "delete {[null][delete {[null][null][]}][hi!]}");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(actionRequestValidationException16);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}", "delete {[null][null][null]}", "hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.parent("delete {[null][null][null]}");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel8 = deleteRequest5.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest5.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest5.id("delete {[hi!][null][null]}");
        deleteRequest12.primaryTerm((long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[hi!][][delete {[null][null][null]}]}", deleteRequest12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel8 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel8.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}", "delete {[delete {[null][null][null]}][delete {[null][null][null]}][hi!]}");
        boolean boolean4 = deleteRequest3.getShouldPersistResult();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.writeTo(streamOutput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][hi!]}", "delete {[null][null][null]}", "delete {[hi!][null][null]}");
        java.lang.String str4 = deleteRequest3.id();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[hi!][null][null]}" + "'", str4, "delete {[hi!][null][null]}");
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str3 = deleteRequest2.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str11 = deleteRequest10.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest10.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest15.routing("");
        org.elasticsearch.tasks.TaskId taskId18 = deleteRequest17.getParentTask();
        deleteRequest9.setParentTask(taskId18);
        org.elasticsearch.index.shard.ShardId shardId20 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest9.setShardId(shardId20);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest9.parent("delete {[null][null][null]}");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException24 = deleteRequest23.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str26 = deleteRequest25.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest25.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest28.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest28.refresh(false);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException33 = deleteRequest32.validate();
        org.elasticsearch.tasks.TaskId taskId34 = deleteRequest32.getParentTask();
        deleteRequest23.setParentTask(taskId34);
        org.elasticsearch.index.shard.ShardId shardId36 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest37 = deleteRequest23.setShardId(shardId36);
        java.lang.String str38 = deleteRequest23.routing();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "hi!", deleteRequest23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(taskId18);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(actionRequestValidationException24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertNotNull(actionRequestValidationException33);
        org.junit.Assert.assertNotNull(taskId34);
        org.junit.Assert.assertNotNull(deleteRequest37);
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.consistencyLevel(writeConsistencyLevel1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.id("hi!");
        long long5 = deleteRequest4.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest4.version((long) ' ');
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][hi!]}");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = deleteRequest9.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest7.consistencyLevel(writeConsistencyLevel10);
        long long12 = deleteRequest7.seqNo();
        long long13 = deleteRequest7.primaryTerm();
        org.elasticsearch.action.support.IndicesOptions indicesOptions14 = deleteRequest7.indicesOptions();
        java.lang.String str15 = deleteRequest7.getDescription();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(indicesOptions14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "delete {[null][null][hi!]}" + "'", str15, "delete {[null][null][hi!]}");
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.routing("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str9 = deleteRequest8.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest8.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.routing("");
        org.elasticsearch.tasks.TaskId taskId16 = deleteRequest15.getParentTask();
        deleteRequest7.setParentTask(taskId16);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest7.refresh(false);
        org.elasticsearch.common.unit.TimeValue timeValue20 = deleteRequest7.timeout();
        deleteRequest7.seqNo((long) (short) 1);
        org.elasticsearch.index.shard.IndexShard indexShard23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete24 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest7, indexShard23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(taskId16);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(timeValue20);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.routing();
        org.elasticsearch.action.support.IndicesOptions indicesOptions2 = deleteRequest0.indicesOptions();
        boolean boolean3 = deleteRequest0.refresh();
        boolean boolean4 = deleteRequest0.refresh();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = deleteRequest0.consistencyLevel();
        org.elasticsearch.common.io.stream.StreamInput streamInput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.readFrom(streamInput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(indicesOptions2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel5 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel5.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
    }
}

