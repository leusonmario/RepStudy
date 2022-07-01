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
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.setParentTask("", (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 0 length nodeIds are reserved for EMPTY_TASK_ID and are otherwise invalid.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "", throwable2, "");
        java.lang.Class<?> wildcardClass5 = shardFailure4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
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
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
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
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[hi!][null][null]}", throwable2, "");
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][hi!][hi!]}", "", "delete {[][hi!][hi!]}");
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
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState> indexShardStateSet0 = org.elasticsearch.index.shard.IndexShard.writeAllowedStatesForPrimary;
        org.junit.Assert.assertNotNull(indexShardStateSet0);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[][hi!][hi!]}", throwable2, "delete {[][hi!][hi!]}");
        java.lang.String str5 = shardFailure4.indexUUID;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "delete {[][hi!][hi!]}" + "'", str5, "delete {[][hi!][hi!]}");
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType2 = deleteRequest1.versionType();
        org.elasticsearch.common.io.stream.StreamInput streamInput3 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest1.readFrom(streamInput3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType2);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[hi!][null][null]}", throwable2, "hi!");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting5 = shardFailure4.routing;
        org.junit.Assert.assertNull(shardRouting5);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "hi!", throwable2, "delete {[][hi!][hi!]}");
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        long long2 = deleteRequest1.version();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest1.timeout("hi!");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [hi!] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3L) + "'", long2 == (-3L));
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId11 = deleteRequest10.getParentTask();
        org.elasticsearch.tasks.Task task12 = deleteRequest3.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId11);
        java.lang.String str13 = deleteRequest3.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType16 = deleteRequest15.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest3.versionType(versionType16);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException18 = deleteRequest17.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure20 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "", (java.lang.Throwable) actionRequestValidationException18, "");
        java.lang.Class<?> wildcardClass21 = actionRequestValidationException18.getClass();
        org.junit.Assert.assertNotNull(taskId11);
        org.junit.Assert.assertNotNull(task12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "delete {[hi!][null][null]}" + "'", str13, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType16);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(actionRequestValidationException18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        long long1 = deleteRequest0.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("delete {[][hi!][hi!]}");
        deleteRequest3.seqNo((long) 100);
        org.elasticsearch.index.shard.IndexShard indexShard6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete7 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest3, indexShard6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest3);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][null][null]}", "delete {[hi!][null][null]}", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue8 = deleteRequest7.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.timeout(timeValue8);
        org.elasticsearch.common.io.stream.StreamInput streamInput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest9.readFrom(streamInput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(deleteRequest9);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.parent("delete {[hi!][null][null]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "hi!", deleteRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest4);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.index.VersionType versionType1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.versionType(versionType1);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel3 = deleteRequest2.consistencyLevel();
        org.elasticsearch.index.shard.IndexShard indexShard4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete5 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest2, indexShard4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel3 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel3.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        long long1 = deleteRequest0.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("delete {[][hi!][hi!]}");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = deleteRequest0.consistencyLevel();
        org.elasticsearch.common.io.stream.StreamInput streamInput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.readFrom(streamInput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel4 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel4.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        long long1 = deleteRequest0.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.consistencyLevel(writeConsistencyLevel2);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType6 = deleteRequest5.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId11 = deleteRequest10.getParentTask();
        deleteRequest5.setParentTask(taskId11);
        deleteRequest0.setParentTask(taskId11);
        org.elasticsearch.common.io.stream.StreamInput streamInput14 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.readFrom(streamInput14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(versionType6);
        org.junit.Assert.assertNotNull(taskId11);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "delete {[][hi!][hi!]}");
        boolean boolean4 = deleteRequest3.getShouldPersistResult();
        org.elasticsearch.tasks.TaskId taskId8 = null;
        org.elasticsearch.tasks.Task task9 = deleteRequest3.createTask((long) (byte) 1, "hi!", "delete {[][hi!][hi!]}", taskId8);
        java.lang.Class<?> wildcardClass10 = deleteRequest3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(task9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        java.lang.String str4 = deleteRequest3.getDescription();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.consistencyLevel(writeConsistencyLevel5);
        boolean boolean7 = deleteRequest6.getShouldPersistResult();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.timeout("delete {[][hi!][hi!]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[][hi!][hi!]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[][hi!][hi!]}" + "'", str4, "delete {[][hi!][hi!]}");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType3 = deleteRequest2.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.versionType(versionType3);
        long long5 = deleteRequest0.primaryTerm();
        org.elasticsearch.action.support.IndicesOptions indicesOptions6 = deleteRequest0.indicesOptions();
        org.elasticsearch.common.io.stream.StreamInput streamInput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.readFrom(streamInput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(indicesOptions6);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.index.VersionType versionType1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.versionType(versionType1);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.timeout("delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        deleteRequest3.seqNo((-1L));
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.version((long) (byte) 1);
        org.elasticsearch.common.unit.TimeValue timeValue10 = deleteRequest9.timeout();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest9.timeout("hi!");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [hi!] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(timeValue10);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        deleteRequest3.seqNo((-1L));
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.refresh(false);
        org.elasticsearch.index.shard.IndexShard indexShard8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete9 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest3, indexShard8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest7);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        deleteRequest3.seqNo((-1L));
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.version((long) (byte) 1);
        org.elasticsearch.common.unit.TimeValue timeValue10 = deleteRequest9.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest9.index("");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest12.timeout("delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(timeValue10);
        org.junit.Assert.assertNotNull(deleteRequest12);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "", throwable2, "hi!");
        java.lang.String str5 = shardFailure4.indexUUID;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.index.VersionType versionType1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.versionType(versionType1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.routing("delete {[hi!][null][null]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException5 = deleteRequest4.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId19 = deleteRequest18.getParentTask();
        org.elasticsearch.tasks.Task task20 = deleteRequest11.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId19);
        java.lang.String str21 = deleteRequest11.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType24 = deleteRequest23.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest11.versionType(versionType24);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException26 = deleteRequest25.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure28 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "", (java.lang.Throwable) actionRequestValidationException26, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure30 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "delete {[hi!][null][null]}", (java.lang.Throwable) actionRequestValidationException26, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure32 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "hi!", (java.lang.Throwable) actionRequestValidationException26, "delete {[hi!][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure34 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "hi!", (java.lang.Throwable) actionRequestValidationException26, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure36 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}", (java.lang.Throwable) actionRequestValidationException26, "delete {[hi!][null][null]}");
        java.lang.String str37 = shardFailure36.indexUUID;
        org.junit.Assert.assertNotNull(taskId19);
        org.junit.Assert.assertNotNull(task20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "delete {[hi!][null][null]}" + "'", str21, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType24);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(actionRequestValidationException26);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "delete {[hi!][null][null]}" + "'", str37, "delete {[hi!][null][null]}");
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId9 = deleteRequest8.getParentTask();
        org.elasticsearch.tasks.Task task10 = deleteRequest1.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId9);
        java.lang.String str11 = deleteRequest1.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType14 = deleteRequest13.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest1.versionType(versionType14);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest1.timeout("hi!");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [hi!] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(taskId9);
        org.junit.Assert.assertNotNull(task10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[hi!][null][null]}" + "'", str11, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType14);
        org.junit.Assert.assertNotNull(deleteRequest15);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest3.timeout();
        org.elasticsearch.index.shard.IndexShard indexShard5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete6 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest3, indexShard5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue4);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        java.lang.String str4 = deleteRequest3.getDescription();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.consistencyLevel(writeConsistencyLevel5);
        boolean boolean7 = deleteRequest6.getShouldPersistResult();
        org.elasticsearch.index.shard.IndexShard indexShard8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete9 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest6, indexShard8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[][hi!][hi!]}" + "'", str4, "delete {[][hi!][hi!]}");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId9 = deleteRequest8.getParentTask();
        org.elasticsearch.tasks.Task task10 = deleteRequest1.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId9);
        java.lang.String str11 = deleteRequest1.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType14 = deleteRequest13.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest1.versionType(versionType14);
        java.lang.String str16 = deleteRequest15.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest15.routing("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest18.timeout("hi!");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [hi!] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(taskId9);
        org.junit.Assert.assertNotNull(task10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[hi!][null][null]}" + "'", str11, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType14);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "delete {[hi!][null][null]}" + "'", str16, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest18);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.version((long) (byte) -1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.version(0L);
        org.elasticsearch.common.io.stream.StreamInput streamInput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest2.readFrom(streamInput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        java.lang.String str4 = deleteRequest3.routing();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[][hi!][hi!]}", deleteRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        long long3 = deleteRequest2.seqNo();
        boolean boolean4 = deleteRequest2.getShouldPersistResult();
        deleteRequest2.primaryTerm((long) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "hi!", deleteRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        long long2 = deleteRequest1.version();
        org.elasticsearch.index.shard.IndexShard indexShard3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete4 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest1, indexShard3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3L) + "'", long2 == (-3L));
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId9 = deleteRequest8.getParentTask();
        org.elasticsearch.tasks.Task task10 = deleteRequest1.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId9);
        java.lang.String str11 = deleteRequest1.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType14 = deleteRequest13.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest1.versionType(versionType14);
        java.lang.String str16 = deleteRequest15.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest15.routing("hi!");
        org.elasticsearch.common.io.stream.StreamInput streamInput19 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest15.readFrom(streamInput19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(taskId9);
        org.junit.Assert.assertNotNull(task10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[hi!][null][null]}" + "'", str11, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType14);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "delete {[hi!][null][null]}" + "'", str16, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest18);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[null][null][null]}", deleteRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][null][null]}", "delete {[hi!][null][null]}", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue8 = deleteRequest7.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.timeout(timeValue8);
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = null;
        deleteRequest3.remoteAddress(transportAddress10);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        deleteRequest13.primaryTerm(10L);
        java.lang.String str16 = deleteRequest13.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType19 = deleteRequest18.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest13.versionType(versionType19);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest3.versionType(versionType19);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest21.timeout("delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[hi!][delete {[][hi!][hi!]}][hi!]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "delete {[hi!][null][null]}" + "'", str16, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType19);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(deleteRequest21);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.parent("delete {[hi!][null][null]}");
        org.elasticsearch.common.io.stream.StreamInput streamInput3 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.readFrom(streamInput3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.version((long) (byte) -1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.version(0L);
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest2.setParentTask("", (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 0 length nodeIds are reserved for EMPTY_TASK_ID and are otherwise invalid.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.version((long) (byte) -1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId9 = deleteRequest8.getParentTask();
        deleteRequest2.setParentTask(taskId9);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}", deleteRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(taskId9);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][hi!][hi!]}", "delete {[][hi!][hi!]}", "");
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
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        deleteRequest3.seqNo((-1L));
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.version((long) (byte) 1);
        java.lang.Class<?> wildcardClass10 = deleteRequest3.getClass();
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "hi!", throwable2, "hi!");
        java.lang.String str5 = shardFailure4.reason;
        java.lang.String str6 = shardFailure4.indexUUID;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.setShardId(shardId4);
        org.elasticsearch.index.shard.IndexShard indexShard6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete7 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest5, indexShard6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
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
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType3 = deleteRequest2.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.versionType(versionType3);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.index("delete {[hi!][null][null]}");
        deleteRequest4.setParentTask("delete {[hi!][delete {[][hi!][hi!]}][hi!]}", (long) 'a');
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.parent("delete {[hi!][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.parent("");
        java.lang.Class<?> wildcardClass5 = deleteRequest4.getClass();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "delete {[][hi!][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.type("");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.timeout("hi!");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [hi!] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[][hi!][hi!]}", throwable2, "");
        java.lang.String str5 = shardFailure4.indexUUID;
        java.lang.String str6 = shardFailure4.reason;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "delete {[][hi!][hi!]}" + "'", str6, "delete {[][hi!][hi!]}");
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        long long1 = deleteRequest0.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.consistencyLevel(writeConsistencyLevel2);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        java.lang.String str6 = deleteRequest5.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest5.type("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.routing("delete {[][hi!][hi!]}");
        org.elasticsearch.tasks.TaskId taskId11 = deleteRequest8.getParentTask();
        deleteRequest3.setParentTask(taskId11);
        org.elasticsearch.common.unit.TimeValue timeValue13 = deleteRequest3.timeout();
        org.elasticsearch.index.shard.IndexShard indexShard14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete15 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest3, indexShard14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(taskId11);
        org.junit.Assert.assertNotNull(timeValue13);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        long long5 = deleteRequest4.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest4.parent("delete {[][hi!][hi!]}");
        deleteRequest7.seqNo((long) 100);
        org.elasticsearch.tasks.TaskId taskId10 = deleteRequest7.getParentTask();
        org.elasticsearch.common.unit.TimeValue timeValue11 = deleteRequest7.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest3.timeout(timeValue11);
        org.elasticsearch.index.shard.IndexShard indexShard13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete14 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest3, indexShard13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId10);
        org.junit.Assert.assertNotNull(timeValue11);
        org.junit.Assert.assertNotNull(deleteRequest12);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId17 = deleteRequest16.getParentTask();
        org.elasticsearch.tasks.Task task18 = deleteRequest9.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId17);
        java.lang.String str19 = deleteRequest9.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType22 = deleteRequest21.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest9.versionType(versionType22);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException24 = deleteRequest23.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure26 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "", (java.lang.Throwable) actionRequestValidationException24, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure28 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[hi!][null][null]}", (java.lang.Throwable) actionRequestValidationException24, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure30 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "hi!", (java.lang.Throwable) actionRequestValidationException24, "delete {[hi!][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure32 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[hi!][null][null]}", (java.lang.Throwable) actionRequestValidationException24, "delete {[][hi!][hi!]}");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting33 = shardFailure32.routing;
        org.junit.Assert.assertNotNull(taskId17);
        org.junit.Assert.assertNotNull(task18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "delete {[hi!][null][null]}" + "'", str19, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType22);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(actionRequestValidationException24);
        org.junit.Assert.assertNull(shardRouting33);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        deleteRequest3.seqNo((-1L));
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.refresh(false);
        org.elasticsearch.common.io.stream.StreamInput streamInput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.readFrom(streamInput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest7);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId9 = deleteRequest8.getParentTask();
        org.elasticsearch.tasks.Task task10 = deleteRequest1.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId9);
        java.lang.String str11 = deleteRequest1.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType14 = deleteRequest13.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest1.versionType(versionType14);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException16 = deleteRequest15.validate();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput17 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest15.writeTo(streamOutput17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(taskId9);
        org.junit.Assert.assertNotNull(task10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[hi!][null][null]}" + "'", str11, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType14);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(actionRequestValidationException16);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][null][null]}", "delete {[hi!][null][null]}", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue8 = deleteRequest7.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.timeout(timeValue8);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        java.lang.String str19 = deleteRequest18.getDescription();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel20 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest18.consistencyLevel(writeConsistencyLevel20);
        long long22 = deleteRequest18.version();
        org.elasticsearch.tasks.TaskId taskId23 = deleteRequest18.getParentTask();
        org.elasticsearch.tasks.Task task24 = deleteRequest11.createTask((long) (byte) 0, "", "", taskId23);
        org.elasticsearch.index.shard.ShardId shardId25 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest11.setShardId(shardId25);
        org.elasticsearch.index.shard.IndexShard indexShard27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete28 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest26, indexShard27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "delete {[][hi!][hi!]}" + "'", str19, "delete {[][hi!][hi!]}");
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-3L) + "'", long22 == (-3L));
        org.junit.Assert.assertNotNull(taskId23);
        org.junit.Assert.assertNotNull(task24);
        org.junit.Assert.assertNotNull(deleteRequest26);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}", throwable2, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}");
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.index.VersionType versionType1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.versionType(versionType1);
        deleteRequest0.primaryTerm((long) 1);
        org.elasticsearch.common.unit.TimeValue timeValue5 = deleteRequest0.timeout();
        java.lang.String str6 = deleteRequest0.id();
        org.elasticsearch.common.unit.TimeValue timeValue7 = deleteRequest0.timeout();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest0.timeout("delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[hi!][delete {[][hi!][hi!]}][hi!]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(timeValue5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(timeValue7);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        deleteRequest3.seqNo((-1L));
        java.lang.String str6 = deleteRequest3.toString();
        org.elasticsearch.index.shard.IndexShard indexShard7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete8 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest3, indexShard7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "delete {[hi!][delete {[][hi!][hi!]}][hi!]}" + "'", str6, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "delete {[][hi!][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType9 = deleteRequest8.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId14 = deleteRequest13.getParentTask();
        deleteRequest8.setParentTask(taskId14);
        org.elasticsearch.tasks.Task task16 = deleteRequest3.createTask(10L, "", "delete {[hi!][null][null]}", taskId14);
        org.elasticsearch.index.shard.IndexShard indexShard17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete18 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest3, indexShard17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType9);
        org.junit.Assert.assertNotNull(taskId14);
        org.junit.Assert.assertNotNull(task16);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        long long1 = deleteRequest0.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.consistencyLevel(writeConsistencyLevel2);
        java.lang.String str4 = deleteRequest0.routing();
        org.elasticsearch.index.shard.ShardId shardId5 = deleteRequest0.shardId();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.writeTo(streamOutput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(shardId5);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        long long4 = deleteRequest3.primaryTerm();
        java.lang.Class<?> wildcardClass5 = deleteRequest3.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "delete {[][hi!][hi!]}");
        boolean boolean4 = deleteRequest3.getShouldPersistResult();
        org.elasticsearch.index.shard.IndexShard indexShard5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete6 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest3, indexShard5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        java.lang.String str6 = deleteRequest5.getDescription();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest5.consistencyLevel(writeConsistencyLevel7);
        boolean boolean9 = deleteRequest8.getShouldPersistResult();
        java.lang.String str10 = deleteRequest8.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest();
        long long12 = deleteRequest11.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest11.parent("delete {[][hi!][hi!]}");
        deleteRequest14.seqNo((long) 100);
        org.elasticsearch.tasks.TaskId taskId17 = deleteRequest14.getParentTask();
        org.elasticsearch.common.unit.TimeValue timeValue18 = deleteRequest14.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest8.timeout(timeValue18);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}", deleteRequest19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "delete {[][hi!][hi!]}" + "'", str6, "delete {[][hi!][hi!]}");
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(taskId17);
        org.junit.Assert.assertNotNull(timeValue18);
        org.junit.Assert.assertNotNull(deleteRequest19);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        long long3 = deleteRequest2.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.parent("delete {[][hi!][hi!]}");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = deleteRequest2.consistencyLevel();
        deleteRequest2.primaryTerm(100L);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[hi!][null][null]}", deleteRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel6 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel6.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "delete {[][hi!][hi!]}");
        boolean boolean4 = deleteRequest3.getShouldPersistResult();
        org.elasticsearch.tasks.TaskId taskId8 = null;
        org.elasticsearch.tasks.Task task9 = deleteRequest3.createTask((long) (byte) 1, "hi!", "delete {[][hi!][hi!]}", taskId8);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.writeTo(streamOutput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(task9);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        long long5 = deleteRequest4.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest4.parent("delete {[][hi!][hi!]}");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException8 = deleteRequest7.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure10 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}", (java.lang.Throwable) actionRequestValidationException8, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure12 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[null][null][null]}", (java.lang.Throwable) actionRequestValidationException8, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}");
        java.lang.Class<?> wildcardClass13 = actionRequestValidationException8.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(actionRequestValidationException8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        long long1 = deleteRequest0.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("delete {[][hi!][hi!]}");
        deleteRequest3.seqNo((long) 100);
        org.elasticsearch.common.unit.TimeValue timeValue6 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.timeout(timeValue6);
        org.elasticsearch.common.unit.TimeValue timeValue8 = deleteRequest3.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.parent("delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        java.lang.String str11 = deleteRequest10.parent();
        org.elasticsearch.common.io.stream.StreamInput streamInput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest10.readFrom(streamInput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[hi!][delete {[][hi!][hi!]}][hi!]}" + "'", str11, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        deleteRequest1.primaryTerm(10L);
        boolean boolean4 = deleteRequest1.getShouldPersistResult();
        org.elasticsearch.common.io.stream.StreamInput streamInput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest1.readFrom(streamInput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        deleteRequest1.primaryTerm(10L);
        java.lang.String str4 = deleteRequest1.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType7 = deleteRequest6.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest1.versionType(versionType7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.parent("delete {[][hi!][hi!]}");
        org.elasticsearch.common.io.stream.StreamInput streamInput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest10.readFrom(streamInput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[hi!][null][null]}" + "'", str4, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType7);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId9 = deleteRequest8.getParentTask();
        org.elasticsearch.tasks.Task task10 = deleteRequest1.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId9);
        java.lang.String str11 = deleteRequest1.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType14 = deleteRequest13.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest1.versionType(versionType14);
        java.lang.String str16 = deleteRequest15.toString();
        boolean boolean17 = deleteRequest15.getShouldPersistResult();
        org.elasticsearch.index.shard.IndexShard indexShard18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete19 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest15, indexShard18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(taskId9);
        org.junit.Assert.assertNotNull(task10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[hi!][null][null]}" + "'", str11, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType14);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "delete {[hi!][null][null]}" + "'", str16, "delete {[hi!][null][null]}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][hi!][hi!]}", "delete {[][hi!][hi!]}", "");
        long long4 = deleteRequest3.primaryTerm();
        java.lang.Class<?> wildcardClass5 = deleteRequest3.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId15 = deleteRequest14.getParentTask();
        org.elasticsearch.tasks.Task task16 = deleteRequest7.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId15);
        java.lang.String str17 = deleteRequest7.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType20 = deleteRequest19.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest7.versionType(versionType20);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException22 = deleteRequest21.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure24 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "", (java.lang.Throwable) actionRequestValidationException22, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure26 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[hi!][null][null]}", (java.lang.Throwable) actionRequestValidationException22, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure28 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "hi!", (java.lang.Throwable) actionRequestValidationException22, "delete {[hi!][null][null]}");
        java.lang.Throwable throwable29 = shardFailure28.cause;
        java.lang.String str30 = shardFailure28.reason;
        org.junit.Assert.assertNotNull(taskId15);
        org.junit.Assert.assertNotNull(task16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "delete {[hi!][null][null]}" + "'", str17, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType20);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(actionRequestValidationException22);
        org.junit.Assert.assertNotNull(throwable29);
        org.junit.Assert.assertEquals(throwable29.getLocalizedMessage(), "Validation Failed: 1: type is missing;2: id is missing;");
        org.junit.Assert.assertEquals(throwable29.getMessage(), "Validation Failed: 1: type is missing;2: id is missing;");
        org.junit.Assert.assertEquals(throwable29.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: type is missing;2: id is missing;");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        long long5 = deleteRequest4.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest4.parent("delete {[][hi!][hi!]}");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException8 = deleteRequest7.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure10 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}", (java.lang.Throwable) actionRequestValidationException8, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure12 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[null][null][null]}", (java.lang.Throwable) actionRequestValidationException8, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}");
        java.lang.String str13 = shardFailure12.reason;
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(actionRequestValidationException8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "delete {[null][null][null]}" + "'", str13, "delete {[null][null][null]}");
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[][hi!][hi!]}", throwable2, "hi!");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting5 = shardFailure4.routing;
        org.junit.Assert.assertNull(shardRouting5);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId9 = deleteRequest8.getParentTask();
        org.elasticsearch.tasks.Task task10 = deleteRequest1.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId9);
        java.lang.String str11 = deleteRequest1.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType14 = deleteRequest13.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest1.versionType(versionType14);
        java.lang.String str16 = deleteRequest15.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest15.routing("hi!");
        java.lang.String str19 = deleteRequest18.index();
        long long20 = deleteRequest18.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        deleteRequest24.primaryTerm(10L);
        java.lang.String str27 = deleteRequest24.toString();
        java.lang.String str28 = deleteRequest24.getDescription();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel29 = deleteRequest24.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest22.consistencyLevel(writeConsistencyLevel29);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest18.consistencyLevel(writeConsistencyLevel29);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest40 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId41 = deleteRequest40.getParentTask();
        org.elasticsearch.tasks.Task task42 = deleteRequest33.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId41);
        java.lang.String str43 = deleteRequest33.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest45 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType46 = deleteRequest45.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest47 = deleteRequest33.versionType(versionType46);
        java.lang.String str48 = deleteRequest47.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest50 = deleteRequest47.routing("hi!");
        java.lang.String str51 = deleteRequest50.index();
        long long52 = deleteRequest50.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest54 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest56 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        deleteRequest56.primaryTerm(10L);
        java.lang.String str59 = deleteRequest56.toString();
        java.lang.String str60 = deleteRequest56.getDescription();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel61 = deleteRequest56.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest62 = deleteRequest54.consistencyLevel(writeConsistencyLevel61);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest63 = deleteRequest50.consistencyLevel(writeConsistencyLevel61);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest64 = deleteRequest18.consistencyLevel(writeConsistencyLevel61);
        java.lang.Class<?> wildcardClass65 = deleteRequest64.getClass();
        org.junit.Assert.assertNotNull(taskId9);
        org.junit.Assert.assertNotNull(task10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[hi!][null][null]}" + "'", str11, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType14);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "delete {[hi!][null][null]}" + "'", str16, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "delete {[hi!][null][null]}" + "'", str27, "delete {[hi!][null][null]}");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "delete {[hi!][null][null]}" + "'", str28, "delete {[hi!][null][null]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel29 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel29.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertNotNull(taskId41);
        org.junit.Assert.assertNotNull(task42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "delete {[hi!][null][null]}" + "'", str43, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType46);
        org.junit.Assert.assertNotNull(deleteRequest47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "delete {[hi!][null][null]}" + "'", str48, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "delete {[hi!][null][null]}" + "'", str59, "delete {[hi!][null][null]}");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "delete {[hi!][null][null]}" + "'", str60, "delete {[hi!][null][null]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel61 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel61.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest62);
        org.junit.Assert.assertNotNull(deleteRequest63);
        org.junit.Assert.assertNotNull(deleteRequest64);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.index.VersionType versionType1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.versionType(versionType1);
        deleteRequest0.primaryTerm((long) 1);
        org.elasticsearch.common.unit.TimeValue timeValue5 = deleteRequest0.timeout();
        java.lang.String str6 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest0.version(1L);
        org.elasticsearch.common.unit.TimeValue timeValue9 = deleteRequest8.timeout();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest8.timeout("hi!");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [hi!] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(timeValue5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(timeValue9);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId17 = deleteRequest16.getParentTask();
        org.elasticsearch.tasks.Task task18 = deleteRequest9.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId17);
        java.lang.String str19 = deleteRequest9.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType22 = deleteRequest21.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest9.versionType(versionType22);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException24 = deleteRequest23.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure26 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "", (java.lang.Throwable) actionRequestValidationException24, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure28 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[hi!][null][null]}", (java.lang.Throwable) actionRequestValidationException24, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure30 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "", (java.lang.Throwable) actionRequestValidationException24, "delete {[null][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure32 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[][hi!][hi!]}", (java.lang.Throwable) actionRequestValidationException24, "delete {[][hi!][hi!]}");
        org.junit.Assert.assertNotNull(taskId17);
        org.junit.Assert.assertNotNull(task18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "delete {[hi!][null][null]}" + "'", str19, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType22);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(actionRequestValidationException24);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        long long1 = deleteRequest0.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("delete {[][hi!][hi!]}");
        deleteRequest3.seqNo((long) 100);
        org.elasticsearch.common.unit.TimeValue timeValue6 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.timeout(timeValue6);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.writeTo(streamOutput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNotNull(deleteRequest7);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId17 = deleteRequest16.getParentTask();
        org.elasticsearch.tasks.Task task18 = deleteRequest9.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId17);
        java.lang.String str19 = deleteRequest9.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType22 = deleteRequest21.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest9.versionType(versionType22);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException24 = deleteRequest23.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure26 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "", (java.lang.Throwable) actionRequestValidationException24, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure28 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[hi!][null][null]}", (java.lang.Throwable) actionRequestValidationException24, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure30 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "hi!", (java.lang.Throwable) actionRequestValidationException24, "delete {[hi!][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure32 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[][hi!][hi!]}", (java.lang.Throwable) actionRequestValidationException24, "delete {[hi!][null][null]}");
        java.lang.String str33 = shardFailure32.reason;
        org.junit.Assert.assertNotNull(taskId17);
        org.junit.Assert.assertNotNull(task18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "delete {[hi!][null][null]}" + "'", str19, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType22);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(actionRequestValidationException24);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "delete {[][hi!][hi!]}" + "'", str33, "delete {[][hi!][hi!]}");
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        long long1 = deleteRequest0.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("delete {[][hi!][hi!]}");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = deleteRequest0.consistencyLevel();
        deleteRequest0.seqNo(0L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel4 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel4.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType2 = deleteRequest1.versionType();
        java.lang.Class<?> wildcardClass3 = versionType2.getClass();
        org.junit.Assert.assertNotNull(versionType2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        java.lang.String str4 = deleteRequest3.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.type("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.routing("delete {[][hi!][hi!]}");
        java.lang.String str9 = deleteRequest8.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}", deleteRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        java.lang.String str2 = deleteRequest1.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}", "hi!", "");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = deleteRequest6.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest1.consistencyLevel(writeConsistencyLevel7);
        org.elasticsearch.common.io.stream.StreamInput streamInput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest8.readFrom(streamInput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel7 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel7.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest8);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        deleteRequest3.seqNo((-1L));
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.version((long) (byte) 1);
        org.elasticsearch.common.unit.TimeValue timeValue10 = deleteRequest9.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest9.index("");
        java.lang.String str13 = deleteRequest12.parent();
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(timeValue10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        deleteRequest3.primaryTerm(10L);
        java.lang.String str6 = deleteRequest3.toString();
        java.lang.String str7 = deleteRequest3.getDescription();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel8 = deleteRequest3.consistencyLevel();
        boolean boolean9 = deleteRequest3.refresh();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[null][null][null]}", deleteRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "delete {[hi!][null][null]}" + "'", str6, "delete {[hi!][null][null]}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "delete {[hi!][null][null]}" + "'", str7, "delete {[hi!][null][null]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel8 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel8.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[hi!][null][null]}", throwable2, "delete {[][hi!][hi!]}");
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][hi!][hi!]}", "", "delete {[][hi!][hi!]}");
        java.lang.String str4 = deleteRequest3.id();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[][hi!][hi!]}" + "'", str4, "delete {[][hi!][hi!]}");
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "delete {[hi!][null][null]}", "delete {[hi!][null][null]}");
        deleteRequest3.primaryTerm((long) (short) -1);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        java.lang.String str4 = deleteRequest3.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}", "hi!", "");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel9 = deleteRequest8.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.consistencyLevel(writeConsistencyLevel9);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "", deleteRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel9 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel9.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest10);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId9 = deleteRequest8.getParentTask();
        org.elasticsearch.tasks.Task task10 = deleteRequest1.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId9);
        long long11 = deleteRequest1.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest();
        long long13 = deleteRequest12.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest12.parent("delete {[][hi!][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.index.VersionType versionType17 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest16.versionType(versionType17);
        deleteRequest16.primaryTerm((long) 1);
        org.elasticsearch.common.unit.TimeValue timeValue21 = deleteRequest16.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest12.timeout(timeValue21);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest1.timeout(timeValue21);
        org.elasticsearch.common.transport.TransportAddress transportAddress24 = deleteRequest1.remoteAddress();
        org.elasticsearch.common.io.stream.StreamInput streamInput25 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest1.readFrom(streamInput25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(taskId9);
        org.junit.Assert.assertNotNull(task10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(timeValue21);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNull(transportAddress24);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        long long3 = deleteRequest2.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.consistencyLevel(writeConsistencyLevel4);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        java.lang.String str8 = deleteRequest7.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest7.type("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.routing("delete {[][hi!][hi!]}");
        org.elasticsearch.tasks.TaskId taskId13 = deleteRequest10.getParentTask();
        deleteRequest5.setParentTask(taskId13);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}", deleteRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(taskId13);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        long long1 = deleteRequest0.seqNo();
        long long2 = deleteRequest0.seqNo();
        org.elasticsearch.index.shard.IndexShard indexShard3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete4 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest0, indexShard3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType3 = deleteRequest2.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.versionType(versionType3);
        long long5 = deleteRequest0.primaryTerm();
        org.elasticsearch.action.support.IndicesOptions indicesOptions6 = deleteRequest0.indicesOptions();
        long long7 = deleteRequest0.version();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest0.type("delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}");
        java.lang.String str10 = deleteRequest0.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest0.timeout("hi!");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [hi!] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(indicesOptions6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-3L) + "'", long7 == (-3L));
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId9 = deleteRequest8.getParentTask();
        org.elasticsearch.tasks.Task task10 = deleteRequest1.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId9);
        org.elasticsearch.index.shard.IndexShard indexShard11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete12 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest1, indexShard11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(taskId9);
        org.junit.Assert.assertNotNull(task10);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "hi!", throwable2, "delete {[null][null][null]}");
        java.lang.Throwable throwable5 = shardFailure4.cause;
        org.junit.Assert.assertNull(throwable5);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId11 = deleteRequest10.getParentTask();
        org.elasticsearch.tasks.Task task12 = deleteRequest3.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId11);
        java.lang.String str13 = deleteRequest3.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType16 = deleteRequest15.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest3.versionType(versionType16);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException18 = deleteRequest17.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure20 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[][hi!][hi!]}", (java.lang.Throwable) actionRequestValidationException18, "delete {[hi!][null][null]}");
        java.lang.String str21 = shardFailure20.indexUUID;
        org.junit.Assert.assertNotNull(taskId11);
        org.junit.Assert.assertNotNull(task12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "delete {[hi!][null][null]}" + "'", str13, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType16);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(actionRequestValidationException18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "delete {[hi!][null][null]}" + "'", str21, "delete {[hi!][null][null]}");
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.version((long) (byte) -1);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel3 = deleteRequest2.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.type("delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}");
        org.elasticsearch.common.io.stream.StreamOutput streamOutput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest5.writeTo(streamOutput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel3 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel3.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest5);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        deleteRequest3.primaryTerm(10L);
        java.lang.String str6 = deleteRequest3.toString();
        java.lang.String str7 = deleteRequest3.getDescription();
        org.elasticsearch.index.shard.ShardId shardId8 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.setShardId(shardId8);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}", deleteRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "delete {[hi!][null][null]}" + "'", str6, "delete {[hi!][null][null]}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "delete {[hi!][null][null]}" + "'", str7, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest9);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        deleteRequest3.seqNo((-1L));
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.version((long) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.timeout("delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][null][null]}", "delete {[hi!][null][null]}", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue8 = deleteRequest7.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.timeout(timeValue8);
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = null;
        deleteRequest3.remoteAddress(transportAddress10);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        deleteRequest13.primaryTerm(10L);
        java.lang.String str16 = deleteRequest13.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType19 = deleteRequest18.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest13.versionType(versionType19);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest3.versionType(versionType19);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest3.timeout("delete {[hi!][null][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[hi!][null][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "delete {[hi!][null][null]}" + "'", str16, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType19);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(deleteRequest21);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][hi!][hi!]}", "delete {[][hi!][hi!]}", "hi!");
        boolean boolean4 = deleteRequest3.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.routing("hi!");
        org.elasticsearch.common.io.stream.StreamOutput streamOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.writeTo(streamOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(deleteRequest6);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType2 = deleteRequest1.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId7 = deleteRequest6.getParentTask();
        deleteRequest1.setParentTask(taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest1.id("delete {[hi!][null][null]}");
        boolean boolean11 = deleteRequest1.getShouldPersistResult();
        org.junit.Assert.assertNotNull(versionType2);
        org.junit.Assert.assertNotNull(taskId7);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        deleteRequest1.primaryTerm(10L);
        java.lang.String str4 = deleteRequest1.toString();
        java.lang.String str5 = deleteRequest1.getDescription();
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest1.setShardId(shardId6);
        java.lang.Class<?> wildcardClass8 = deleteRequest1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[hi!][null][null]}" + "'", str4, "delete {[hi!][null][null]}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "delete {[hi!][null][null]}" + "'", str5, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][hi!][hi!]}", "delete {[][hi!][hi!]}", "hi!");
        boolean boolean6 = deleteRequest5.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest5.version(0L);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}", deleteRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(deleteRequest8);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId9 = deleteRequest8.getParentTask();
        org.elasticsearch.tasks.Task task10 = deleteRequest1.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId9);
        java.lang.String str11 = deleteRequest1.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType14 = deleteRequest13.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest1.versionType(versionType14);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId25 = deleteRequest24.getParentTask();
        org.elasticsearch.tasks.Task task26 = deleteRequest17.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId25);
        java.lang.String str27 = deleteRequest17.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType30 = deleteRequest29.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest17.versionType(versionType30);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest15.versionType(versionType30);
        java.lang.String str33 = deleteRequest32.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = deleteRequest32.id("delete {[hi!][null][null]}");
        deleteRequest32.seqNo((long) 0);
        org.junit.Assert.assertNotNull(taskId9);
        org.junit.Assert.assertNotNull(task10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[hi!][null][null]}" + "'", str11, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType14);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(taskId25);
        org.junit.Assert.assertNotNull(task26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "delete {[hi!][null][null]}" + "'", str27, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType30);
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(deleteRequest35);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.parent("delete {[hi!][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest8.parent("");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException13 = deleteRequest12.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure15 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}", (java.lang.Throwable) actionRequestValidationException13, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure17 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[hi!][null][null]}", (java.lang.Throwable) actionRequestValidationException13, "delete {[null][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure19 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}", (java.lang.Throwable) actionRequestValidationException13, "delete {[hi!][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure21 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[null][null][hi!]}", (java.lang.Throwable) actionRequestValidationException13, "hi!");
        java.lang.String str22 = shardFailure21.reason;
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(actionRequestValidationException13);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "delete {[null][null][hi!]}" + "'", str22, "delete {[null][null][hi!]}");
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][null][null]}", "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}", "delete {[][hi!][hi!]}");
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        deleteRequest1.primaryTerm(10L);
        java.lang.String str4 = deleteRequest1.toString();
        java.lang.String str5 = deleteRequest1.toString();
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest1.remoteAddress(transportAddress6);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[hi!][null][null]}" + "'", str4, "delete {[hi!][null][null]}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "delete {[hi!][null][null]}" + "'", str5, "delete {[hi!][null][null]}");
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", "delete {[hi!][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        deleteRequest7.primaryTerm(10L);
        java.lang.String str10 = deleteRequest7.toString();
        java.lang.String str11 = deleteRequest7.getDescription();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel12 = deleteRequest7.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest5.consistencyLevel(writeConsistencyLevel12);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest3.consistencyLevel(writeConsistencyLevel12);
        boolean boolean15 = deleteRequest3.refresh();
        java.lang.String str16 = deleteRequest3.routing();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "delete {[hi!][null][null]}" + "'", str10, "delete {[hi!][null][null]}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[hi!][null][null]}" + "'", str11, "delete {[hi!][null][null]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel12 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel12.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "delete {[][hi!][hi!]}");
        boolean boolean4 = deleteRequest3.getShouldPersistResult();
        org.elasticsearch.tasks.TaskId taskId8 = null;
        org.elasticsearch.tasks.Task task9 = deleteRequest3.createTask((long) (byte) 1, "hi!", "delete {[][hi!][hi!]}", taskId8);
        org.elasticsearch.action.support.IndicesOptions indicesOptions10 = deleteRequest3.indicesOptions();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(task9);
        org.junit.Assert.assertNotNull(indicesOptions10);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId13 = deleteRequest12.getParentTask();
        org.elasticsearch.tasks.Task task14 = deleteRequest5.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId13);
        java.lang.String str15 = deleteRequest5.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType18 = deleteRequest17.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest5.versionType(versionType18);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException20 = deleteRequest19.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure22 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}", (java.lang.Throwable) actionRequestValidationException20, "delete {[][hi!][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure24 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[][hi!][hi!]}", (java.lang.Throwable) actionRequestValidationException20, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting25 = shardFailure24.routing;
        org.junit.Assert.assertNotNull(taskId13);
        org.junit.Assert.assertNotNull(task14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "delete {[hi!][null][null]}" + "'", str15, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType18);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(actionRequestValidationException20);
        org.junit.Assert.assertNull(shardRouting25);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][delete {[][hi!][hi!]}][hi!]}", "delete {[][hi!][hi!]}", "delete {[null][null][null]}");
        java.lang.String str4 = deleteRequest3.routing();
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType2 = deleteRequest1.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId7 = deleteRequest6.getParentTask();
        deleteRequest1.setParentTask(taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest1.id("delete {[hi!][null][null]}");
        java.lang.Class<?> wildcardClass11 = deleteRequest10.getClass();
        org.junit.Assert.assertNotNull(versionType2);
        org.junit.Assert.assertNotNull(taskId7);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][null][null]}", "delete {[hi!][null][null]}", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue8 = deleteRequest7.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.timeout(timeValue8);
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = null;
        deleteRequest3.remoteAddress(transportAddress10);
        boolean boolean12 = deleteRequest3.refresh();
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][hi!][hi!]}", "delete {[][hi!][hi!]}", "");
        long long6 = deleteRequest5.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.parent("delete {[hi!][null][null]}");
        org.elasticsearch.index.VersionType versionType10 = deleteRequest7.versionType();
        org.elasticsearch.index.VersionType versionType11 = deleteRequest7.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest5.versionType(versionType11);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[null][null][hi!]}", deleteRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(versionType10);
        org.junit.Assert.assertNotNull(versionType11);
        org.junit.Assert.assertNotNull(deleteRequest12);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.index.VersionType versionType1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.versionType(versionType1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.routing("delete {[hi!][null][null]}");
        org.elasticsearch.index.shard.IndexShard indexShard5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete6 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest4, indexShard5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId9 = deleteRequest8.getParentTask();
        org.elasticsearch.tasks.Task task10 = deleteRequest1.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId9);
        java.lang.String str11 = deleteRequest1.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType14 = deleteRequest13.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest1.versionType(versionType14);
        java.lang.String str16 = deleteRequest15.toString();
        boolean boolean17 = deleteRequest15.getShouldPersistResult();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException18 = deleteRequest15.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest15.version((long) 100);
        java.lang.Class<?> wildcardClass21 = deleteRequest15.getClass();
        org.junit.Assert.assertNotNull(taskId9);
        org.junit.Assert.assertNotNull(task10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[hi!][null][null]}" + "'", str11, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType14);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "delete {[hi!][null][null]}" + "'", str16, "delete {[hi!][null][null]}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(actionRequestValidationException18);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting10 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting12 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId23 = deleteRequest22.getParentTask();
        org.elasticsearch.tasks.Task task24 = deleteRequest15.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId23);
        java.lang.String str25 = deleteRequest15.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType28 = deleteRequest27.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest15.versionType(versionType28);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException30 = deleteRequest29.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure32 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting12, "", (java.lang.Throwable) actionRequestValidationException30, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure34 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting10, "delete {[hi!][null][null]}", (java.lang.Throwable) actionRequestValidationException30, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure36 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "hi!", (java.lang.Throwable) actionRequestValidationException30, "delete {[hi!][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure38 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "hi!", (java.lang.Throwable) actionRequestValidationException30, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure40 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}", (java.lang.Throwable) actionRequestValidationException30, "delete {[hi!][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure42 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[hi!][null][null]}", (java.lang.Throwable) actionRequestValidationException30, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure44 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}", (java.lang.Throwable) actionRequestValidationException30, "delete {[][hi!][hi!]}");
        java.lang.String str45 = shardFailure44.indexUUID;
        org.junit.Assert.assertNotNull(taskId23);
        org.junit.Assert.assertNotNull(task24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "delete {[hi!][null][null]}" + "'", str25, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType28);
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertNotNull(actionRequestValidationException30);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "delete {[][hi!][hi!]}" + "'", str45, "delete {[][hi!][hi!]}");
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId17 = deleteRequest16.getParentTask();
        org.elasticsearch.tasks.Task task18 = deleteRequest9.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId17);
        java.lang.String str19 = deleteRequest9.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType22 = deleteRequest21.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest9.versionType(versionType22);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException24 = deleteRequest23.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure26 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "", (java.lang.Throwable) actionRequestValidationException24, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure28 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[hi!][null][null]}", (java.lang.Throwable) actionRequestValidationException24, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure30 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "hi!", (java.lang.Throwable) actionRequestValidationException24, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure32 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[hi!][null][null]}", (java.lang.Throwable) actionRequestValidationException24, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        java.lang.Throwable throwable33 = shardFailure32.cause;
        java.lang.String str34 = shardFailure32.indexUUID;
        org.junit.Assert.assertNotNull(taskId17);
        org.junit.Assert.assertNotNull(task18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "delete {[hi!][null][null]}" + "'", str19, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType22);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(actionRequestValidationException24);
        org.junit.Assert.assertNotNull(throwable33);
        org.junit.Assert.assertEquals(throwable33.getLocalizedMessage(), "Validation Failed: 1: type is missing;2: id is missing;");
        org.junit.Assert.assertEquals(throwable33.getMessage(), "Validation Failed: 1: type is missing;2: id is missing;");
        org.junit.Assert.assertEquals(throwable33.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: type is missing;2: id is missing;");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "delete {[hi!][delete {[][hi!][hi!]}][hi!]}" + "'", str34, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        long long1 = deleteRequest0.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.consistencyLevel(writeConsistencyLevel2);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.refresh(true);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest5.remoteAddress(transportAddress6);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId19 = deleteRequest18.getParentTask();
        org.elasticsearch.tasks.Task task20 = deleteRequest11.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId19);
        java.lang.String str21 = deleteRequest11.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType24 = deleteRequest23.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest11.versionType(versionType24);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException26 = deleteRequest25.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure28 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "", (java.lang.Throwable) actionRequestValidationException26, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure30 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "delete {[hi!][null][null]}", (java.lang.Throwable) actionRequestValidationException26, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure32 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "hi!", (java.lang.Throwable) actionRequestValidationException26, "delete {[hi!][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure34 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "hi!", (java.lang.Throwable) actionRequestValidationException26, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure36 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}", (java.lang.Throwable) actionRequestValidationException26, "delete {[hi!][null][null]}");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting37 = shardFailure36.routing;
        org.junit.Assert.assertNotNull(taskId19);
        org.junit.Assert.assertNotNull(task20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "delete {[hi!][null][null]}" + "'", str21, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType24);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(actionRequestValidationException26);
        org.junit.Assert.assertNull(shardRouting37);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][null][null]}", "hi!", "");
        long long4 = deleteRequest3.seqNo();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        long long3 = deleteRequest2.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.consistencyLevel(writeConsistencyLevel4);
        java.lang.String str6 = deleteRequest5.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[][hi!][hi!]}", deleteRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "delete {[null][null][null]}" + "'", str6, "delete {[null][null][null]}");
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        long long1 = deleteRequest0.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.consistencyLevel(writeConsistencyLevel2);
        java.lang.String str4 = deleteRequest0.routing();
        boolean boolean5 = deleteRequest0.getShouldPersistResult();
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest0.remoteAddress(transportAddress6);
        long long8 = deleteRequest0.version();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-3L) + "'", long8 == (-3L));
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType2 = deleteRequest1.versionType();
        java.lang.String str3 = deleteRequest1.id();
        java.lang.String str4 = deleteRequest1.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest1.timeout("delete {[hi!][null][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[hi!][null][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("", "", "delete {[hi!][null][null]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}", deleteRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        long long1 = deleteRequest0.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.consistencyLevel(writeConsistencyLevel2);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType6 = deleteRequest5.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId11 = deleteRequest10.getParentTask();
        deleteRequest5.setParentTask(taskId11);
        deleteRequest0.setParentTask(taskId11);
        org.elasticsearch.index.shard.ShardId shardId14 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest0.setShardId(shardId14);
        org.elasticsearch.index.shard.IndexShard indexShard16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete17 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest15, indexShard16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(versionType6);
        org.junit.Assert.assertNotNull(taskId11);
        org.junit.Assert.assertNotNull(deleteRequest15);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        long long1 = deleteRequest0.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.consistencyLevel(writeConsistencyLevel2);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType6 = deleteRequest5.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId11 = deleteRequest10.getParentTask();
        deleteRequest5.setParentTask(taskId11);
        deleteRequest0.setParentTask(taskId11);
        org.elasticsearch.index.shard.ShardId shardId14 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest0.setShardId(shardId14);
        long long16 = deleteRequest15.primaryTerm();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest15.timeout("hi!");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [hi!] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(versionType6);
        org.junit.Assert.assertNotNull(taskId11);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId11 = deleteRequest10.getParentTask();
        org.elasticsearch.tasks.Task task12 = deleteRequest3.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId11);
        java.lang.String str13 = deleteRequest3.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType16 = deleteRequest15.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest3.versionType(versionType16);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId27 = deleteRequest26.getParentTask();
        org.elasticsearch.tasks.Task task28 = deleteRequest19.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId27);
        java.lang.String str29 = deleteRequest19.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType32 = deleteRequest31.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest19.versionType(versionType32);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = deleteRequest17.versionType(versionType32);
        java.lang.String str35 = deleteRequest34.routing();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "", deleteRequest34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(taskId11);
        org.junit.Assert.assertNotNull(task12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "delete {[hi!][null][null]}" + "'", str13, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType16);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(taskId27);
        org.junit.Assert.assertNotNull(task28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "delete {[hi!][null][null]}" + "'", str29, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType32);
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertNotNull(deleteRequest34);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.version((long) (byte) -1);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel3 = deleteRequest2.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.type("delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = deleteRequest5.remoteAddress();
        org.elasticsearch.index.VersionType versionType7 = deleteRequest5.versionType();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel3 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel3.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(transportAddress6);
        org.junit.Assert.assertNotNull(versionType7);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        long long7 = deleteRequest6.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.parent("delete {[][hi!][hi!]}");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException10 = deleteRequest9.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure12 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}", (java.lang.Throwable) actionRequestValidationException10, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure14 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "hi!", (java.lang.Throwable) actionRequestValidationException10, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure16 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}", (java.lang.Throwable) actionRequestValidationException10, "");
        java.lang.String str17 = shardFailure16.indexUUID;
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(actionRequestValidationException10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", "delete {[hi!][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        deleteRequest7.primaryTerm(10L);
        java.lang.String str10 = deleteRequest7.toString();
        java.lang.String str11 = deleteRequest7.getDescription();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel12 = deleteRequest7.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest5.consistencyLevel(writeConsistencyLevel12);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest3.consistencyLevel(writeConsistencyLevel12);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        deleteRequest18.seqNo((-1L));
        java.lang.String str21 = deleteRequest18.toString();
        org.elasticsearch.index.shard.ShardId shardId22 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest18.setShardId(shardId22);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = new org.elasticsearch.action.delete.DeleteRequest();
        long long25 = deleteRequest24.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest24.parent("delete {[][hi!][hi!]}");
        deleteRequest27.seqNo((long) 100);
        org.elasticsearch.common.unit.TimeValue timeValue30 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest27.timeout(timeValue30);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest23.timeout(timeValue30);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest14.timeout(timeValue30);
        java.lang.String str34 = deleteRequest33.type();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "delete {[hi!][null][null]}" + "'", str10, "delete {[hi!][null][null]}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[hi!][null][null]}" + "'", str11, "delete {[hi!][null][null]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel12 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel12.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "delete {[hi!][delete {[][hi!][hi!]}][hi!]}" + "'", str21, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertNotNull(timeValue30);
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "delete {[][hi!][hi!]}" + "'", str34, "delete {[][hi!][hi!]}");
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "delete {[hi!][null][null]}");
        java.lang.Class<?> wildcardClass4 = deleteRequest3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType3 = deleteRequest2.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.versionType(versionType3);
        long long5 = deleteRequest0.primaryTerm();
        java.lang.String str6 = deleteRequest0.parent();
        java.lang.String str7 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest0.version(10L);
        java.lang.Class<?> wildcardClass10 = deleteRequest9.getClass();
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.parent("delete {[hi!][null][null]}");
        boolean boolean3 = deleteRequest2.refresh();
        deleteRequest2.primaryTerm((long) 100);
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        java.lang.String str2 = deleteRequest1.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.index.VersionType versionType4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.versionType(versionType4);
        deleteRequest3.primaryTerm((long) 1);
        org.elasticsearch.common.unit.TimeValue timeValue8 = deleteRequest3.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest1.timeout(timeValue8);
        org.elasticsearch.index.shard.ShardId shardId10 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest1.setShardId(shardId10);
        org.elasticsearch.common.io.stream.StreamInput streamInput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest11.readFrom(streamInput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId9 = deleteRequest8.getParentTask();
        org.elasticsearch.tasks.Task task10 = deleteRequest1.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId9);
        java.lang.String str11 = deleteRequest1.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType14 = deleteRequest13.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest1.versionType(versionType14);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId25 = deleteRequest24.getParentTask();
        org.elasticsearch.tasks.Task task26 = deleteRequest17.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId25);
        java.lang.String str27 = deleteRequest17.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType30 = deleteRequest29.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest17.versionType(versionType30);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest15.versionType(versionType30);
        deleteRequest32.primaryTerm((long) 100);
        deleteRequest32.setParentTask("hi!", (long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest39 = deleteRequest32.timeout("");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(taskId9);
        org.junit.Assert.assertNotNull(task10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[hi!][null][null]}" + "'", str11, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType14);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(taskId25);
        org.junit.Assert.assertNotNull(task26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "delete {[hi!][null][null]}" + "'", str27, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType30);
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertNotNull(deleteRequest32);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "delete {[][hi!][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType9 = deleteRequest8.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId14 = deleteRequest13.getParentTask();
        deleteRequest8.setParentTask(taskId14);
        org.elasticsearch.tasks.Task task16 = deleteRequest3.createTask(10L, "", "delete {[hi!][null][null]}", taskId14);
        java.lang.String str17 = deleteRequest3.parent();
        boolean boolean18 = deleteRequest3.refresh();
        boolean boolean19 = deleteRequest3.refresh();
        java.lang.String str20 = deleteRequest3.index();
        org.junit.Assert.assertNotNull(versionType9);
        org.junit.Assert.assertNotNull(taskId14);
        org.junit.Assert.assertNotNull(task16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][null][null]}", "delete {[hi!][null][null]}", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue8 = deleteRequest7.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.timeout(timeValue8);
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = null;
        deleteRequest3.remoteAddress(transportAddress10);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId21 = deleteRequest20.getParentTask();
        org.elasticsearch.tasks.Task task22 = deleteRequest13.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId21);
        java.lang.String str23 = deleteRequest13.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType26 = deleteRequest25.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest13.versionType(versionType26);
        java.lang.String str28 = deleteRequest27.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest27.routing("hi!");
        java.lang.String str31 = deleteRequest30.index();
        long long32 = deleteRequest30.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest36 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        deleteRequest36.primaryTerm(10L);
        java.lang.String str39 = deleteRequest36.toString();
        java.lang.String str40 = deleteRequest36.getDescription();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel41 = deleteRequest36.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest42 = deleteRequest34.consistencyLevel(writeConsistencyLevel41);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest43 = deleteRequest30.consistencyLevel(writeConsistencyLevel41);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest45 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest52 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId53 = deleteRequest52.getParentTask();
        org.elasticsearch.tasks.Task task54 = deleteRequest45.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId53);
        java.lang.String str55 = deleteRequest45.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest57 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType58 = deleteRequest57.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest59 = deleteRequest45.versionType(versionType58);
        java.lang.String str60 = deleteRequest59.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest62 = deleteRequest59.routing("hi!");
        java.lang.String str63 = deleteRequest62.index();
        long long64 = deleteRequest62.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest66 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest68 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        deleteRequest68.primaryTerm(10L);
        java.lang.String str71 = deleteRequest68.toString();
        java.lang.String str72 = deleteRequest68.getDescription();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel73 = deleteRequest68.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest74 = deleteRequest66.consistencyLevel(writeConsistencyLevel73);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest75 = deleteRequest62.consistencyLevel(writeConsistencyLevel73);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest76 = deleteRequest30.consistencyLevel(writeConsistencyLevel73);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest77 = deleteRequest3.consistencyLevel(writeConsistencyLevel73);
        deleteRequest77.setParentTask("delete {[null][null][null]}", (long) (byte) 10);
        java.lang.String[] strArray81 = deleteRequest77.indices();
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(taskId21);
        org.junit.Assert.assertNotNull(task22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "delete {[hi!][null][null]}" + "'", str23, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType26);
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "delete {[hi!][null][null]}" + "'", str28, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "delete {[hi!][null][null]}" + "'", str39, "delete {[hi!][null][null]}");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "delete {[hi!][null][null]}" + "'", str40, "delete {[hi!][null][null]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel41 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel41.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest42);
        org.junit.Assert.assertNotNull(deleteRequest43);
        org.junit.Assert.assertNotNull(taskId53);
        org.junit.Assert.assertNotNull(task54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "delete {[hi!][null][null]}" + "'", str55, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType58);
        org.junit.Assert.assertNotNull(deleteRequest59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "delete {[hi!][null][null]}" + "'", str60, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "delete {[hi!][null][null]}" + "'", str71, "delete {[hi!][null][null]}");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "delete {[hi!][null][null]}" + "'", str72, "delete {[hi!][null][null]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel73 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel73.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest74);
        org.junit.Assert.assertNotNull(deleteRequest75);
        org.junit.Assert.assertNotNull(deleteRequest76);
        org.junit.Assert.assertNotNull(deleteRequest77);
        org.junit.Assert.assertNotNull(strArray81);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.version((long) (byte) 10);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest();
        long long4 = deleteRequest3.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][delete {[][hi!][hi!]}][hi!]}", "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest();
        long long10 = deleteRequest9.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest9.consistencyLevel(writeConsistencyLevel11);
        org.elasticsearch.index.shard.ShardId shardId13 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest12.setShardId(shardId13);
        org.elasticsearch.tasks.TaskId taskId15 = deleteRequest14.getParentTask();
        deleteRequest8.setParentTask(taskId15);
        deleteRequest3.setParentTask(taskId15);
        deleteRequest2.setParentTask(taskId15);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput19 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest2.writeTo(streamOutput19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(taskId15);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        java.lang.String str2 = deleteRequest1.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.index.VersionType versionType4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.versionType(versionType4);
        deleteRequest3.primaryTerm((long) 1);
        org.elasticsearch.common.unit.TimeValue timeValue8 = deleteRequest3.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest1.timeout(timeValue8);
        org.elasticsearch.index.shard.ShardId shardId10 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest1.setShardId(shardId10);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.id("delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}");
        boolean boolean14 = deleteRequest13.getShouldPersistResult();
        java.lang.Class<?> wildcardClass15 = deleteRequest13.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "delete {[][hi!][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.type("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType11 = deleteRequest10.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId16 = deleteRequest15.getParentTask();
        deleteRequest10.setParentTask(taskId16);
        org.elasticsearch.tasks.Task task18 = deleteRequest3.createTask((long) (short) 0, "", "delete {[hi!][null][null]}", taskId16);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException19 = deleteRequest3.validate();
        org.elasticsearch.index.shard.IndexShard indexShard20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete21 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest3, indexShard20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(versionType11);
        org.junit.Assert.assertNotNull(taskId16);
        org.junit.Assert.assertNotNull(task18);
        org.junit.Assert.assertNull(actionRequestValidationException19);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][hi!]}");
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        long long1 = deleteRequest0.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.consistencyLevel(writeConsistencyLevel2);
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.setShardId(shardId4);
        org.elasticsearch.action.support.IndicesOptions indicesOptions6 = deleteRequest3.indicesOptions();
        boolean boolean7 = deleteRequest3.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        java.lang.String str12 = deleteRequest11.getDescription();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel13 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest11.consistencyLevel(writeConsistencyLevel13);
        boolean boolean15 = deleteRequest14.getShouldPersistResult();
        java.lang.String str16 = deleteRequest14.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = new org.elasticsearch.action.delete.DeleteRequest();
        long long18 = deleteRequest17.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest17.parent("delete {[][hi!][hi!]}");
        deleteRequest20.seqNo((long) 100);
        org.elasticsearch.tasks.TaskId taskId23 = deleteRequest20.getParentTask();
        org.elasticsearch.common.unit.TimeValue timeValue24 = deleteRequest20.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest14.timeout(timeValue24);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest3.timeout(timeValue24);
        java.lang.Class<?> wildcardClass27 = deleteRequest3.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(indicesOptions6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "delete {[][hi!][hi!]}" + "'", str12, "delete {[][hi!][hi!]}");
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(taskId23);
        org.junit.Assert.assertNotNull(timeValue24);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        deleteRequest3.seqNo((-1L));
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.version((long) (byte) 1);
        org.elasticsearch.common.unit.TimeValue timeValue10 = deleteRequest9.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest9.index("");
        java.lang.String str13 = deleteRequest9.index();
        org.elasticsearch.index.shard.ShardId shardId14 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest9.setShardId(shardId14);
        java.lang.Class<?> wildcardClass16 = deleteRequest9.getClass();
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(timeValue10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId19 = deleteRequest18.getParentTask();
        org.elasticsearch.tasks.Task task20 = deleteRequest11.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId19);
        java.lang.String str21 = deleteRequest11.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType24 = deleteRequest23.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest11.versionType(versionType24);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException26 = deleteRequest25.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure28 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}", (java.lang.Throwable) actionRequestValidationException26, "delete {[][hi!][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure30 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "delete {[][hi!][hi!]}", (java.lang.Throwable) actionRequestValidationException26, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure32 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}", (java.lang.Throwable) actionRequestValidationException26, "delete {[null][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure34 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[null][null][hi!]}", (java.lang.Throwable) actionRequestValidationException26, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure36 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}", (java.lang.Throwable) actionRequestValidationException26, "delete {[][][delete {[][hi!][hi!]}]}");
        org.junit.Assert.assertNotNull(taskId19);
        org.junit.Assert.assertNotNull(task20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "delete {[hi!][null][null]}" + "'", str21, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType24);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(actionRequestValidationException26);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        long long3 = deleteRequest2.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.consistencyLevel(writeConsistencyLevel4);
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.setShardId(shardId6);
        org.elasticsearch.action.support.IndicesOptions indicesOptions8 = deleteRequest5.indicesOptions();
        boolean boolean9 = deleteRequest5.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        java.lang.String str14 = deleteRequest13.getDescription();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel15 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest13.consistencyLevel(writeConsistencyLevel15);
        boolean boolean17 = deleteRequest16.getShouldPersistResult();
        java.lang.String str18 = deleteRequest16.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = new org.elasticsearch.action.delete.DeleteRequest();
        long long20 = deleteRequest19.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest19.parent("delete {[][hi!][hi!]}");
        deleteRequest22.seqNo((long) 100);
        org.elasticsearch.tasks.TaskId taskId25 = deleteRequest22.getParentTask();
        org.elasticsearch.common.unit.TimeValue timeValue26 = deleteRequest22.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest16.timeout(timeValue26);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest5.timeout(timeValue26);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[null][null][hi!]}", deleteRequest28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(indicesOptions8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "delete {[][hi!][hi!]}" + "'", str14, "delete {[][hi!][hi!]}");
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertNotNull(taskId25);
        org.junit.Assert.assertNotNull(timeValue26);
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertNotNull(deleteRequest28);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.parent("delete {[hi!][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest8.parent("");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException13 = deleteRequest12.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure15 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}", (java.lang.Throwable) actionRequestValidationException13, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure17 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[hi!][null][null]}", (java.lang.Throwable) actionRequestValidationException13, "delete {[null][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure19 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}", (java.lang.Throwable) actionRequestValidationException13, "delete {[hi!][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure21 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[null][null][hi!]}", (java.lang.Throwable) actionRequestValidationException13, "hi!");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting22 = shardFailure21.routing;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting23 = shardFailure21.routing;
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(actionRequestValidationException13);
        org.junit.Assert.assertNull(shardRouting22);
        org.junit.Assert.assertNull(shardRouting23);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        java.lang.String str2 = deleteRequest1.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest1.type("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest1.type("delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        java.lang.String str7 = deleteRequest6.id();
        org.elasticsearch.common.io.stream.StreamInput streamInput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest6.readFrom(streamInput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.version((long) (byte) -1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.id("hi!");
        java.lang.String[] strArray5 = deleteRequest4.indices();
        java.lang.String[] strArray6 = deleteRequest4.indices();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        long long3 = deleteRequest2.seqNo();
        java.lang.String str4 = deleteRequest2.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest2.id("delete {[null][null][null]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][][]}", deleteRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(deleteRequest6);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.version((long) (byte) -1);
        long long3 = deleteRequest0.version();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.version((long) (short) 10);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = deleteRequest5.remoteAddress();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest5.timeout("hi!");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [hi!] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(transportAddress6);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId9 = deleteRequest8.getParentTask();
        org.elasticsearch.tasks.Task task10 = deleteRequest1.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId9);
        java.lang.String str11 = deleteRequest1.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType14 = deleteRequest13.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest1.versionType(versionType14);
        java.lang.String str16 = deleteRequest15.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest15.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest15.parent("delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}");
        java.lang.String str21 = deleteRequest15.getDescription();
        java.lang.String str22 = deleteRequest15.index();
        org.junit.Assert.assertNotNull(taskId9);
        org.junit.Assert.assertNotNull(task10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[hi!][null][null]}" + "'", str11, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType14);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "delete {[hi!][null][null]}" + "'", str16, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "delete {[hi!][null][null]}" + "'", str21, "delete {[hi!][null][null]}");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][hi!][hi!]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress2 = null;
        deleteRequest1.remoteAddress(transportAddress2);
        java.lang.String str4 = deleteRequest1.index();
        deleteRequest1.seqNo((long) (short) 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[][hi!][hi!]}" + "'", str4, "delete {[][hi!][hi!]}");
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[][hi!][hi!]}", throwable2, "hi!");
        java.lang.String str5 = shardFailure4.reason;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "delete {[][hi!][hi!]}" + "'", str5, "delete {[][hi!][hi!]}");
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        java.lang.String str2 = deleteRequest1.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest1.type("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.routing("delete {[][hi!][hi!]}");
        java.lang.String str7 = deleteRequest6.parent();
        org.elasticsearch.index.shard.IndexShard indexShard8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete9 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest6, indexShard8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][hi!][hi!]}", "delete {[][hi!][hi!]}", "hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.routing("delete {[null][null][null]}");
        boolean boolean6 = deleteRequest5.refresh();
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        long long1 = deleteRequest0.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.consistencyLevel(writeConsistencyLevel2);
        java.lang.String str4 = deleteRequest0.routing();
        java.lang.Class<?> wildcardClass5 = deleteRequest0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType3 = deleteRequest2.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.versionType(versionType3);
        long long5 = deleteRequest0.primaryTerm();
        org.elasticsearch.action.support.IndicesOptions indicesOptions6 = deleteRequest0.indicesOptions();
        long long7 = deleteRequest0.version();
        java.lang.Class<?> wildcardClass8 = deleteRequest0.getClass();
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(indicesOptions6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-3L) + "'", long7 == (-3L));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.setShardId(shardId4);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType9 = deleteRequest8.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest6.versionType(versionType9);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.parent("delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        boolean boolean13 = deleteRequest10.refresh();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel14 = deleteRequest10.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest3.consistencyLevel(writeConsistencyLevel14);
        boolean boolean16 = deleteRequest15.refresh();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput17 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest15.writeTo(streamOutput17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(versionType9);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel14 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel14.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][][delete {[][hi!][hi!]}]}", "delete {[null][null][hi!]}", "delete {[delete {[hi!][delete {[][hi!][hi!]}][hi!]}][hi!][null]}");
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId11 = deleteRequest10.getParentTask();
        org.elasticsearch.tasks.Task task12 = deleteRequest3.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId11);
        java.lang.String str13 = deleteRequest3.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType16 = deleteRequest15.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest3.versionType(versionType16);
        java.lang.String str18 = deleteRequest17.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest17.routing("hi!");
        java.lang.String str21 = deleteRequest20.index();
        long long22 = deleteRequest20.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        deleteRequest26.primaryTerm(10L);
        java.lang.String str29 = deleteRequest26.toString();
        java.lang.String str30 = deleteRequest26.getDescription();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel31 = deleteRequest26.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest24.consistencyLevel(writeConsistencyLevel31);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest20.consistencyLevel(writeConsistencyLevel31);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest42 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId43 = deleteRequest42.getParentTask();
        org.elasticsearch.tasks.Task task44 = deleteRequest35.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId43);
        java.lang.String str45 = deleteRequest35.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest47 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType48 = deleteRequest47.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest49 = deleteRequest35.versionType(versionType48);
        java.lang.String str50 = deleteRequest49.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest52 = deleteRequest49.routing("hi!");
        java.lang.String str53 = deleteRequest52.index();
        long long54 = deleteRequest52.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest56 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest58 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        deleteRequest58.primaryTerm(10L);
        java.lang.String str61 = deleteRequest58.toString();
        java.lang.String str62 = deleteRequest58.getDescription();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel63 = deleteRequest58.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest64 = deleteRequest56.consistencyLevel(writeConsistencyLevel63);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest65 = deleteRequest52.consistencyLevel(writeConsistencyLevel63);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest66 = deleteRequest20.consistencyLevel(writeConsistencyLevel63);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest68 = deleteRequest66.type("delete {[null][null][null]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[delete {[hi!][delete {[][hi!][hi!]}][hi!]}][hi!][null]}", deleteRequest68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(taskId11);
        org.junit.Assert.assertNotNull(task12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "delete {[hi!][null][null]}" + "'", str13, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType16);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "delete {[hi!][null][null]}" + "'", str18, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "delete {[hi!][null][null]}" + "'", str29, "delete {[hi!][null][null]}");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "delete {[hi!][null][null]}" + "'", str30, "delete {[hi!][null][null]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel31 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel31.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertNotNull(taskId43);
        org.junit.Assert.assertNotNull(task44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "delete {[hi!][null][null]}" + "'", str45, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType48);
        org.junit.Assert.assertNotNull(deleteRequest49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "delete {[hi!][null][null]}" + "'", str50, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "delete {[hi!][null][null]}" + "'", str61, "delete {[hi!][null][null]}");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "delete {[hi!][null][null]}" + "'", str62, "delete {[hi!][null][null]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel63 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel63.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest64);
        org.junit.Assert.assertNotNull(deleteRequest65);
        org.junit.Assert.assertNotNull(deleteRequest66);
        org.junit.Assert.assertNotNull(deleteRequest68);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}", "", "");
        org.elasticsearch.action.support.IndicesOptions indicesOptions6 = deleteRequest5.indicesOptions();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[null][null][hi!]}", deleteRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions6);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        java.lang.String str2 = deleteRequest1.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest1.type("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.routing("delete {[][hi!][hi!]}");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = deleteRequest4.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        java.lang.String str15 = deleteRequest14.getDescription();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel16 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest14.consistencyLevel(writeConsistencyLevel16);
        long long18 = deleteRequest14.version();
        org.elasticsearch.tasks.TaskId taskId19 = deleteRequest14.getParentTask();
        org.elasticsearch.tasks.Task task20 = deleteRequest4.createTask(10L, "hi!", "", taskId19);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = new org.elasticsearch.action.delete.DeleteRequest("", "", "delete {[][hi!][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest27.type("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType35 = deleteRequest34.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest39 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId40 = deleteRequest39.getParentTask();
        deleteRequest34.setParentTask(taskId40);
        org.elasticsearch.tasks.Task task42 = deleteRequest27.createTask((long) (short) 0, "", "delete {[hi!][null][null]}", taskId40);
        org.elasticsearch.tasks.Task task43 = deleteRequest4.createTask((long) (short) 1, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}", "delete {[hi!][delete {[][hi!][hi!]}][hi!]}", taskId40);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest45 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest52 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId53 = deleteRequest52.getParentTask();
        org.elasticsearch.tasks.Task task54 = deleteRequest45.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId53);
        long long55 = deleteRequest45.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest56 = new org.elasticsearch.action.delete.DeleteRequest();
        long long57 = deleteRequest56.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest59 = deleteRequest56.parent("delete {[][hi!][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest60 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.index.VersionType versionType61 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest62 = deleteRequest60.versionType(versionType61);
        deleteRequest60.primaryTerm((long) 1);
        org.elasticsearch.common.unit.TimeValue timeValue65 = deleteRequest60.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest66 = deleteRequest56.timeout(timeValue65);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest67 = deleteRequest45.timeout(timeValue65);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest68 = deleteRequest4.timeout(timeValue65);
        org.elasticsearch.common.io.stream.StreamInput streamInput69 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest4.readFrom(streamInput69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel7 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel7.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "delete {[][hi!][hi!]}" + "'", str15, "delete {[][hi!][hi!]}");
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-3L) + "'", long18 == (-3L));
        org.junit.Assert.assertNotNull(taskId19);
        org.junit.Assert.assertNotNull(task20);
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertNotNull(versionType35);
        org.junit.Assert.assertNotNull(taskId40);
        org.junit.Assert.assertNotNull(task42);
        org.junit.Assert.assertNotNull(task43);
        org.junit.Assert.assertNotNull(taskId53);
        org.junit.Assert.assertNotNull(task54);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest59);
        org.junit.Assert.assertNotNull(deleteRequest62);
        org.junit.Assert.assertNotNull(timeValue65);
        org.junit.Assert.assertNotNull(deleteRequest66);
        org.junit.Assert.assertNotNull(deleteRequest67);
        org.junit.Assert.assertNotNull(deleteRequest68);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.index.VersionType versionType1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.versionType(versionType1);
        deleteRequest0.primaryTerm((long) 1);
        org.elasticsearch.common.unit.TimeValue timeValue5 = deleteRequest0.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        long long7 = deleteRequest6.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.parent("delete {[][hi!][hi!]}");
        deleteRequest9.seqNo((long) 100);
        org.elasticsearch.tasks.TaskId taskId12 = deleteRequest9.getParentTask();
        deleteRequest0.setParentTask(taskId12);
        org.elasticsearch.tasks.TaskId taskId14 = deleteRequest0.getParentTask();
        java.lang.Class<?> wildcardClass15 = taskId14.getClass();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(timeValue5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(taskId12);
        org.junit.Assert.assertNotNull(taskId14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.version((long) (byte) -1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.version(0L);
        deleteRequest4.setParentTask("delete {[][hi!][hi!]}", (long) '#');
        org.elasticsearch.common.io.stream.StreamInput streamInput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest4.readFrom(streamInput8);
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
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId9 = deleteRequest8.getParentTask();
        org.elasticsearch.tasks.Task task10 = deleteRequest1.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId9);
        long long11 = deleteRequest1.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest();
        long long13 = deleteRequest12.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest12.parent("delete {[][hi!][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.index.VersionType versionType17 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest16.versionType(versionType17);
        deleteRequest16.primaryTerm((long) 1);
        org.elasticsearch.common.unit.TimeValue timeValue21 = deleteRequest16.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest12.timeout(timeValue21);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest1.timeout(timeValue21);
        org.elasticsearch.common.transport.TransportAddress transportAddress24 = deleteRequest1.remoteAddress();
        org.elasticsearch.index.shard.IndexShard indexShard25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete26 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest1, indexShard25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(taskId9);
        org.junit.Assert.assertNotNull(task10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(timeValue21);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNull(transportAddress24);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "delete {[][hi!][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType9 = deleteRequest8.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId14 = deleteRequest13.getParentTask();
        deleteRequest8.setParentTask(taskId14);
        org.elasticsearch.tasks.Task task16 = deleteRequest3.createTask(10L, "", "delete {[hi!][null][null]}", taskId14);
        java.lang.Class<?> wildcardClass17 = deleteRequest3.getClass();
        org.junit.Assert.assertNotNull(versionType9);
        org.junit.Assert.assertNotNull(taskId14);
        org.junit.Assert.assertNotNull(task16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.parent("delete {[hi!][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest8.parent("");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException13 = deleteRequest12.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure15 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}", (java.lang.Throwable) actionRequestValidationException13, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure17 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "", (java.lang.Throwable) actionRequestValidationException13, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure19 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[hi!][null][null]}", (java.lang.Throwable) actionRequestValidationException13, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure21 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}", (java.lang.Throwable) actionRequestValidationException13, "hi!");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting22 = shardFailure21.routing;
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(actionRequestValidationException13);
        org.junit.Assert.assertNull(shardRouting22);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest3.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.refresh(false);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.writeTo(streamOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest6);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId13 = deleteRequest12.getParentTask();
        org.elasticsearch.tasks.Task task14 = deleteRequest5.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId13);
        java.lang.String str15 = deleteRequest5.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType18 = deleteRequest17.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest5.versionType(versionType18);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException20 = deleteRequest19.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure22 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "", (java.lang.Throwable) actionRequestValidationException20, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure24 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[hi!][null][null]}", (java.lang.Throwable) actionRequestValidationException20, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        java.lang.String str25 = shardFailure24.indexUUID;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting26 = shardFailure24.routing;
        org.junit.Assert.assertNotNull(taskId13);
        org.junit.Assert.assertNotNull(task14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "delete {[hi!][null][null]}" + "'", str15, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType18);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(actionRequestValidationException20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "delete {[hi!][delete {[][hi!][hi!]}][hi!]}" + "'", str25, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.junit.Assert.assertNull(shardRouting26);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.index("");
        org.elasticsearch.common.io.stream.StreamInput streamInput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest1.readFrom(streamInput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest3);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId15 = deleteRequest14.getParentTask();
        org.elasticsearch.tasks.Task task16 = deleteRequest7.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId15);
        java.lang.String str17 = deleteRequest7.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType20 = deleteRequest19.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest7.versionType(versionType20);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException22 = deleteRequest21.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure24 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}", (java.lang.Throwable) actionRequestValidationException22, "delete {[][hi!][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure26 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[][hi!][hi!]}", (java.lang.Throwable) actionRequestValidationException22, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure28 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}", (java.lang.Throwable) actionRequestValidationException22, "delete {[null][null][null]}");
        java.lang.String str29 = shardFailure28.indexUUID;
        org.junit.Assert.assertNotNull(taskId15);
        org.junit.Assert.assertNotNull(task16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "delete {[hi!][null][null]}" + "'", str17, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType20);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(actionRequestValidationException22);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "delete {[null][null][null]}" + "'", str29, "delete {[null][null][null]}");
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.index.VersionType versionType1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.versionType(versionType1);
        deleteRequest0.primaryTerm((long) 1);
        org.elasticsearch.common.unit.TimeValue timeValue5 = deleteRequest0.timeout();
        java.lang.String str6 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest0.index("delete {[][hi!][hi!]}");
        org.elasticsearch.index.shard.ShardId shardId9 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest0.setShardId(shardId9);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException11 = deleteRequest0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(timeValue5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        java.lang.String str2 = deleteRequest1.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.index.VersionType versionType4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.versionType(versionType4);
        deleteRequest3.primaryTerm((long) 1);
        org.elasticsearch.common.unit.TimeValue timeValue8 = deleteRequest3.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest1.timeout(timeValue8);
        org.elasticsearch.index.shard.ShardId shardId10 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest1.setShardId(shardId10);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.type("delete {[delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][][]}");
        org.elasticsearch.common.io.stream.StreamOutput streamOutput14 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest13.writeTo(streamOutput14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.version((long) (byte) -1);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel3 = deleteRequest2.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.index("delete {[][hi!][hi!]}");
        java.lang.Class<?> wildcardClass6 = deleteRequest2.getClass();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel3 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel3.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId9 = deleteRequest8.getParentTask();
        org.elasticsearch.tasks.Task task10 = deleteRequest1.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId9);
        java.lang.String str11 = deleteRequest1.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType14 = deleteRequest13.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest1.versionType(versionType14);
        java.lang.String str16 = deleteRequest15.toString();
        boolean boolean17 = deleteRequest15.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest15.routing("delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress20 = deleteRequest15.remoteAddress();
        boolean boolean21 = deleteRequest15.refresh();
        org.junit.Assert.assertNotNull(taskId9);
        org.junit.Assert.assertNotNull(task10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[hi!][null][null]}" + "'", str11, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType14);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "delete {[hi!][null][null]}" + "'", str16, "delete {[hi!][null][null]}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNull(transportAddress20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[delete {[hi!][delete {[][hi!][hi!]}][hi!]}][hi!][null]}", throwable2, "");
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][null][null]}", "delete {[][null][null]}", "delete {[delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][][]}");
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][hi!][hi!]}", "", "delete {[][hi!][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest7.getParentTask();
        deleteRequest3.setParentTask(taskId8);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        deleteRequest11.primaryTerm(10L);
        java.lang.String str14 = deleteRequest11.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType17 = deleteRequest16.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest11.versionType(versionType17);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest3.versionType(versionType17);
        java.lang.String str20 = deleteRequest19.index();
        org.elasticsearch.common.io.stream.StreamInput streamInput21 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest19.readFrom(streamInput21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "delete {[hi!][null][null]}" + "'", str14, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType17);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "delete {[][hi!][hi!]}" + "'", str20, "delete {[][hi!][hi!]}");
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        java.lang.String str2 = deleteRequest1.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest1.type("");
        org.elasticsearch.common.transport.TransportAddress transportAddress5 = deleteRequest1.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest1.refresh(true);
        java.lang.String str8 = deleteRequest1.index();
        java.lang.String str9 = deleteRequest1.parent();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNull(transportAddress5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        deleteRequest3.seqNo((-1L));
        java.lang.String str6 = deleteRequest3.toString();
        org.elasticsearch.action.support.IndicesOptions indicesOptions7 = deleteRequest3.indicesOptions();
        java.lang.String str8 = deleteRequest3.getDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "delete {[hi!][delete {[][hi!][hi!]}][hi!]}" + "'", str6, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.junit.Assert.assertNotNull(indicesOptions7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "delete {[hi!][delete {[][hi!][hi!]}][hi!]}" + "'", str8, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        java.lang.String str2 = deleteRequest1.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest1.type("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest1.type("delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest1.type("delete {[delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.index("delete {[][][delete {[][hi!][hi!]}]}");
        java.lang.Class<?> wildcardClass11 = deleteRequest8.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][hi!][hi!]}", "delete {[hi!][null][null]}", "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        java.lang.String str4 = deleteRequest3.type();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.writeTo(streamOutput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[hi!][null][null]}" + "'", str4, "delete {[hi!][null][null]}");
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][null][null]}", "delete {[hi!][null][null]}", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue10 = deleteRequest9.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest5.timeout(timeValue10);
        org.elasticsearch.common.transport.TransportAddress transportAddress12 = null;
        deleteRequest5.remoteAddress(transportAddress12);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest5.routing("");
        org.elasticsearch.index.shard.ShardId shardId16 = deleteRequest15.shardId();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[null][null][hi!]}", deleteRequest15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue10);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNull(shardId16);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        long long1 = deleteRequest0.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][delete {[][hi!][hi!]}][hi!]}", "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        long long7 = deleteRequest6.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel8 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.consistencyLevel(writeConsistencyLevel8);
        org.elasticsearch.index.shard.ShardId shardId10 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.setShardId(shardId10);
        org.elasticsearch.tasks.TaskId taskId12 = deleteRequest11.getParentTask();
        deleteRequest5.setParentTask(taskId12);
        deleteRequest0.setParentTask(taskId12);
        long long15 = deleteRequest0.primaryTerm();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(taskId12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId15 = deleteRequest14.getParentTask();
        org.elasticsearch.tasks.Task task16 = deleteRequest7.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId15);
        java.lang.String str17 = deleteRequest7.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType20 = deleteRequest19.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest7.versionType(versionType20);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException22 = deleteRequest21.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure24 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "", (java.lang.Throwable) actionRequestValidationException22, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure26 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "", (java.lang.Throwable) actionRequestValidationException22, "delete {[][hi!][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure28 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}", (java.lang.Throwable) actionRequestValidationException22, "delete {[hi!][null][null]}");
        java.lang.String str29 = shardFailure28.indexUUID;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting30 = shardFailure28.routing;
        java.lang.String str31 = shardFailure28.reason;
        java.lang.String str32 = shardFailure28.indexUUID;
        org.junit.Assert.assertNotNull(taskId15);
        org.junit.Assert.assertNotNull(task16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "delete {[hi!][null][null]}" + "'", str17, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType20);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(actionRequestValidationException22);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "delete {[hi!][null][null]}" + "'", str29, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNull(shardRouting30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}" + "'", str31, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "delete {[hi!][null][null]}" + "'", str32, "delete {[hi!][null][null]}");
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType3 = deleteRequest2.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.versionType(versionType3);
        long long5 = deleteRequest0.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue6 = deleteRequest0.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.parent("delete {[hi!][null][null]}");
        org.elasticsearch.index.VersionType versionType10 = deleteRequest7.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest0.versionType(versionType10);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest11.writeTo(streamOutput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(versionType10);
        org.junit.Assert.assertNotNull(deleteRequest11);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        deleteRequest1.primaryTerm(10L);
        java.lang.String str4 = deleteRequest1.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType7 = deleteRequest6.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest1.versionType(versionType7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.parent("delete {[][hi!][hi!]}");
        org.elasticsearch.common.io.stream.StreamOutput streamOutput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest10.writeTo(streamOutput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[hi!][null][null]}" + "'", str4, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType7);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        long long1 = deleteRequest0.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("delete {[][hi!][hi!]}");
        deleteRequest3.seqNo((long) 100);
        java.lang.String str6 = deleteRequest3.type();
        org.elasticsearch.index.shard.IndexShard indexShard7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete8 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest3, indexShard7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        long long1 = deleteRequest0.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.consistencyLevel(writeConsistencyLevel2);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType6 = deleteRequest5.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId11 = deleteRequest10.getParentTask();
        deleteRequest5.setParentTask(taskId11);
        deleteRequest0.setParentTask(taskId11);
        org.elasticsearch.index.shard.ShardId shardId14 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest0.setShardId(shardId14);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId25 = deleteRequest24.getParentTask();
        org.elasticsearch.tasks.Task task26 = deleteRequest17.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId25);
        java.lang.String str27 = deleteRequest17.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType30 = deleteRequest29.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest17.versionType(versionType30);
        java.lang.String str32 = deleteRequest31.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = deleteRequest31.routing("hi!");
        java.lang.String str35 = deleteRequest34.index();
        long long36 = deleteRequest34.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest38 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest40 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        deleteRequest40.primaryTerm(10L);
        java.lang.String str43 = deleteRequest40.toString();
        java.lang.String str44 = deleteRequest40.getDescription();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel45 = deleteRequest40.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest46 = deleteRequest38.consistencyLevel(writeConsistencyLevel45);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest47 = deleteRequest34.consistencyLevel(writeConsistencyLevel45);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest48 = deleteRequest0.consistencyLevel(writeConsistencyLevel45);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest50 = deleteRequest48.timeout("delete {[null][null][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[null][null][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(versionType6);
        org.junit.Assert.assertNotNull(taskId11);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(taskId25);
        org.junit.Assert.assertNotNull(task26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "delete {[hi!][null][null]}" + "'", str27, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType30);
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "delete {[hi!][null][null]}" + "'", str32, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "delete {[hi!][null][null]}" + "'", str43, "delete {[hi!][null][null]}");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "delete {[hi!][null][null]}" + "'", str44, "delete {[hi!][null][null]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel45 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel45.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest46);
        org.junit.Assert.assertNotNull(deleteRequest47);
        org.junit.Assert.assertNotNull(deleteRequest48);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][hi!][hi!]}");
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
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        deleteRequest3.seqNo((-1L));
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.version((long) (byte) 1);
        org.elasticsearch.common.unit.TimeValue timeValue10 = deleteRequest9.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest9.index("");
        java.lang.String str13 = deleteRequest9.index();
        org.elasticsearch.index.shard.ShardId shardId14 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest9.setShardId(shardId14);
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest9.setParentTask("", (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 0 length nodeIds are reserved for EMPTY_TASK_ID and are otherwise invalid.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(timeValue10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(deleteRequest15);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        deleteRequest3.seqNo((-1L));
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.version((long) (byte) 1);
        org.elasticsearch.common.unit.TimeValue timeValue10 = deleteRequest9.timeout();
        java.lang.String[] strArray11 = deleteRequest9.indices();
        boolean boolean12 = deleteRequest9.getShouldPersistResult();
        org.elasticsearch.common.io.stream.StreamInput streamInput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest9.readFrom(streamInput13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(timeValue10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        java.lang.String str4 = deleteRequest3.getDescription();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.consistencyLevel(writeConsistencyLevel5);
        deleteRequest3.primaryTerm((-1L));
        java.lang.String str9 = deleteRequest3.parent();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[][hi!][hi!]}" + "'", str4, "delete {[][hi!][hi!]}");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.parent("delete {[hi!][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest8.parent("");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException13 = deleteRequest12.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure15 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}", (java.lang.Throwable) actionRequestValidationException13, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure17 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[hi!][null][null]}", (java.lang.Throwable) actionRequestValidationException13, "delete {[null][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure19 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}", (java.lang.Throwable) actionRequestValidationException13, "delete {[hi!][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure21 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[][hi!][hi!]}", (java.lang.Throwable) actionRequestValidationException13, "");
        java.lang.String str22 = shardFailure21.indexUUID;
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(actionRequestValidationException13);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId9 = deleteRequest8.getParentTask();
        org.elasticsearch.tasks.Task task10 = deleteRequest1.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId9);
        java.lang.String str11 = deleteRequest1.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType14 = deleteRequest13.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest1.versionType(versionType14);
        java.lang.String str16 = deleteRequest15.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest15.routing("hi!");
        java.lang.String str19 = deleteRequest18.index();
        long long20 = deleteRequest18.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        deleteRequest24.primaryTerm(10L);
        java.lang.String str27 = deleteRequest24.toString();
        java.lang.String str28 = deleteRequest24.getDescription();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel29 = deleteRequest24.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest22.consistencyLevel(writeConsistencyLevel29);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest18.consistencyLevel(writeConsistencyLevel29);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest40 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId41 = deleteRequest40.getParentTask();
        org.elasticsearch.tasks.Task task42 = deleteRequest33.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId41);
        java.lang.String str43 = deleteRequest33.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest45 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType46 = deleteRequest45.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest47 = deleteRequest33.versionType(versionType46);
        java.lang.String str48 = deleteRequest47.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest50 = deleteRequest47.routing("hi!");
        java.lang.String str51 = deleteRequest50.index();
        long long52 = deleteRequest50.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest54 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest56 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        deleteRequest56.primaryTerm(10L);
        java.lang.String str59 = deleteRequest56.toString();
        java.lang.String str60 = deleteRequest56.getDescription();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel61 = deleteRequest56.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest62 = deleteRequest54.consistencyLevel(writeConsistencyLevel61);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest63 = deleteRequest50.consistencyLevel(writeConsistencyLevel61);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest64 = deleteRequest18.consistencyLevel(writeConsistencyLevel61);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput65 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest64.writeTo(streamOutput65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(taskId9);
        org.junit.Assert.assertNotNull(task10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[hi!][null][null]}" + "'", str11, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType14);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "delete {[hi!][null][null]}" + "'", str16, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "delete {[hi!][null][null]}" + "'", str27, "delete {[hi!][null][null]}");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "delete {[hi!][null][null]}" + "'", str28, "delete {[hi!][null][null]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel29 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel29.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertNotNull(taskId41);
        org.junit.Assert.assertNotNull(task42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "delete {[hi!][null][null]}" + "'", str43, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType46);
        org.junit.Assert.assertNotNull(deleteRequest47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "delete {[hi!][null][null]}" + "'", str48, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "delete {[hi!][null][null]}" + "'", str59, "delete {[hi!][null][null]}");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "delete {[hi!][null][null]}" + "'", str60, "delete {[hi!][null][null]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel61 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel61.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest62);
        org.junit.Assert.assertNotNull(deleteRequest63);
        org.junit.Assert.assertNotNull(deleteRequest64);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "", throwable2, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting5 = shardFailure4.routing;
        java.lang.String str6 = shardFailure4.indexUUID;
        org.junit.Assert.assertNull(shardRouting5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "delete {[hi!][delete {[][hi!][hi!]}][hi!]}" + "'", str6, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId9 = deleteRequest8.getParentTask();
        org.elasticsearch.tasks.Task task10 = deleteRequest1.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId9);
        long long11 = deleteRequest1.primaryTerm();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException12 = deleteRequest1.validate();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest1.timeout("");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(taskId9);
        org.junit.Assert.assertNotNull(task10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(actionRequestValidationException12);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        java.lang.String str4 = deleteRequest3.getDescription();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.consistencyLevel(writeConsistencyLevel5);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.timeout("delete {[delete {[hi!][null][null]}][null][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[delete {[hi!][null][null]}][null][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[][hi!][hi!]}" + "'", str4, "delete {[][hi!][hi!]}");
        org.junit.Assert.assertNotNull(deleteRequest6);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        deleteRequest3.seqNo((-1L));
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.version((long) (byte) 1);
        org.elasticsearch.common.unit.TimeValue timeValue10 = deleteRequest9.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest9.index("");
        java.lang.String str13 = deleteRequest9.index();
        org.elasticsearch.index.shard.IndexShard indexShard14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete15 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest9, indexShard14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(timeValue10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest3.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.index("");
        org.elasticsearch.common.io.stream.StreamOutput streamOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest6.writeTo(streamOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest6);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        long long1 = deleteRequest0.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.consistencyLevel(writeConsistencyLevel2);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        java.lang.String str6 = deleteRequest5.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest5.type("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.routing("delete {[][hi!][hi!]}");
        org.elasticsearch.tasks.TaskId taskId11 = deleteRequest8.getParentTask();
        deleteRequest3.setParentTask(taskId11);
        org.elasticsearch.index.shard.ShardId shardId13 = deleteRequest3.shardId();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest3.version((long) (byte) 0);
        deleteRequest3.seqNo((long) (byte) 10);
        org.elasticsearch.index.shard.ShardId shardId18 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest3.setShardId(shardId18);
        java.lang.String[] strArray20 = deleteRequest3.indices();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(taskId11);
        org.junit.Assert.assertNull(shardId13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", "hi!");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = deleteRequest5.consistencyLevel();
        org.elasticsearch.common.unit.TimeValue timeValue7 = deleteRequest5.timeout();
        org.elasticsearch.index.shard.ShardId shardId8 = deleteRequest5.shardId();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[delete {[hi!][null][null]}][null][null]}", deleteRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel6 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel6.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(timeValue7);
        org.junit.Assert.assertNull(shardId8);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", "hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.parent("delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.elasticsearch.common.io.stream.StreamOutput streamOutput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest7.writeTo(streamOutput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "delete {[hi!][null][null]}", "");
        java.lang.String str4 = deleteRequest3.id();
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
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.index.VersionType versionType1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.versionType(versionType1);
        deleteRequest0.primaryTerm((long) 1);
        org.elasticsearch.common.unit.TimeValue timeValue5 = deleteRequest0.timeout();
        java.lang.String str6 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest0.version(1L);
        org.elasticsearch.common.unit.TimeValue timeValue9 = deleteRequest8.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest8.refresh(true);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.timeout("delete {[delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][][]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][][]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(timeValue5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(timeValue9);
        org.junit.Assert.assertNotNull(deleteRequest11);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "delete {[][][delete {[][hi!][hi!]}]}", "delete {[null][null][hi!]}");
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId19 = deleteRequest18.getParentTask();
        org.elasticsearch.tasks.Task task20 = deleteRequest11.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId19);
        java.lang.String str21 = deleteRequest11.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType24 = deleteRequest23.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest11.versionType(versionType24);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException26 = deleteRequest25.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure28 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "", (java.lang.Throwable) actionRequestValidationException26, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure30 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "delete {[hi!][null][null]}", (java.lang.Throwable) actionRequestValidationException26, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure32 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "", (java.lang.Throwable) actionRequestValidationException26, "delete {[null][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure34 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[][hi!][hi!]}", (java.lang.Throwable) actionRequestValidationException26, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure36 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}", (java.lang.Throwable) actionRequestValidationException26, "delete {[delete {[null][null][hi!]}][hi!][hi!]}");
        org.junit.Assert.assertNotNull(taskId19);
        org.junit.Assert.assertNotNull(task20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "delete {[hi!][null][null]}" + "'", str21, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType24);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(actionRequestValidationException26);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][][]}", throwable2, "delete {[delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][null][null]}");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting5 = shardFailure4.routing;
        org.junit.Assert.assertNull(shardRouting5);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][null][null]}", throwable2, "delete {[delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][][]}");
        java.lang.String str5 = shardFailure4.indexUUID;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "delete {[delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][][]}" + "'", str5, "delete {[delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][][]}");
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        deleteRequest1.primaryTerm(10L);
        java.lang.String str4 = deleteRequest1.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType7 = deleteRequest6.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest1.versionType(versionType7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.parent("delete {[][hi!][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId20 = deleteRequest19.getParentTask();
        org.elasticsearch.tasks.Task task21 = deleteRequest12.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId20);
        java.lang.String str22 = deleteRequest12.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType25 = deleteRequest24.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest12.versionType(versionType25);
        java.lang.String str27 = deleteRequest26.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest26.routing("hi!");
        org.elasticsearch.index.VersionType versionType30 = deleteRequest26.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest10.versionType(versionType30);
        org.elasticsearch.common.io.stream.StreamInput streamInput32 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest10.readFrom(streamInput32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[hi!][null][null]}" + "'", str4, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType7);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(taskId20);
        org.junit.Assert.assertNotNull(task21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "delete {[hi!][null][null]}" + "'", str22, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType25);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "delete {[hi!][null][null]}" + "'", str27, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertNotNull(versionType30);
        org.junit.Assert.assertNotNull(deleteRequest31);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting10 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId21 = deleteRequest20.getParentTask();
        org.elasticsearch.tasks.Task task22 = deleteRequest13.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId21);
        java.lang.String str23 = deleteRequest13.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType26 = deleteRequest25.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest13.versionType(versionType26);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException28 = deleteRequest27.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure30 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting10, "", (java.lang.Throwable) actionRequestValidationException28, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure32 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "delete {[hi!][null][null]}", (java.lang.Throwable) actionRequestValidationException28, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure34 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "hi!", (java.lang.Throwable) actionRequestValidationException28, "delete {[hi!][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure36 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "", (java.lang.Throwable) actionRequestValidationException28, "delete {[hi!][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure38 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[][hi!][hi!]}", (java.lang.Throwable) actionRequestValidationException28, "delete {[][hi!][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure40 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}", (java.lang.Throwable) actionRequestValidationException28, "hi!");
        java.lang.String str41 = shardFailure40.indexUUID;
        org.junit.Assert.assertNotNull(taskId21);
        org.junit.Assert.assertNotNull(task22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "delete {[hi!][null][null]}" + "'", str23, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType26);
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertNotNull(actionRequestValidationException28);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        deleteRequest5.seqNo((-1L));
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest5.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest5.version((long) (byte) 1);
        org.elasticsearch.common.unit.TimeValue timeValue12 = deleteRequest11.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest11.index("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest14.version((long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[][][delete {[][hi!][hi!]}]}", deleteRequest16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(timeValue12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest16);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        java.lang.String str2 = deleteRequest1.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest1.type("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.routing("delete {[][hi!][hi!]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress7 = null;
        deleteRequest4.remoteAddress(transportAddress7);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest4.timeout("delete {[delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][null][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][null][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}", "hi!", "");
        java.lang.String str4 = deleteRequest3.routing();
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.parent("delete {[hi!][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest6.parent("");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException11 = deleteRequest10.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure13 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "", (java.lang.Throwable) actionRequestValidationException11, "delete {[hi!][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure15 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "", (java.lang.Throwable) actionRequestValidationException11, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure17 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "", (java.lang.Throwable) actionRequestValidationException11, "hi!");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting18 = shardFailure17.routing;
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(actionRequestValidationException11);
        org.junit.Assert.assertNull(shardRouting18);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        deleteRequest3.seqNo((-1L));
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.version((long) (byte) 1);
        deleteRequest9.seqNo((long) (-1));
        org.elasticsearch.common.io.stream.StreamOutput streamOutput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest9.writeTo(streamOutput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        deleteRequest5.seqNo((-1L));
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest5.refresh(false);
        deleteRequest5.seqNo((long) 100);
        java.lang.String str12 = deleteRequest5.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "hi!", deleteRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][null][null]}", "delete {[delete {[null][null][hi!]}][delete {[null][null][hi!]}][]}");
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId15 = deleteRequest14.getParentTask();
        org.elasticsearch.tasks.Task task16 = deleteRequest7.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId15);
        java.lang.String str17 = deleteRequest7.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType20 = deleteRequest19.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest7.versionType(versionType20);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException22 = deleteRequest21.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure24 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[][hi!][hi!]}", (java.lang.Throwable) actionRequestValidationException22, "delete {[hi!][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure26 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[hi!][null][null]}", (java.lang.Throwable) actionRequestValidationException22, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure28 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "", (java.lang.Throwable) actionRequestValidationException22, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        java.lang.String str29 = shardFailure28.indexUUID;
        org.junit.Assert.assertNotNull(taskId15);
        org.junit.Assert.assertNotNull(task16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "delete {[hi!][null][null]}" + "'", str17, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType20);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(actionRequestValidationException22);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "delete {[hi!][delete {[][hi!][hi!]}][hi!]}" + "'", str29, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        long long3 = deleteRequest2.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.consistencyLevel(writeConsistencyLevel4);
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.setShardId(shardId6);
        org.elasticsearch.index.VersionType versionType8 = deleteRequest5.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest5.version(0L);
        boolean boolean11 = deleteRequest5.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest5.index("delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "hi!", deleteRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(versionType8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(deleteRequest13);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.index.VersionType versionType1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.versionType(versionType1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.routing("delete {[hi!][null][null]}");
        deleteRequest2.primaryTerm((long) (-1));
        org.elasticsearch.common.io.stream.StreamInput streamInput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest2.readFrom(streamInput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest();
        long long9 = deleteRequest8.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest8.parent("delete {[][hi!][hi!]}");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException12 = deleteRequest11.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure14 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}", (java.lang.Throwable) actionRequestValidationException12, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure16 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[null][null][null]}", (java.lang.Throwable) actionRequestValidationException12, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure18 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[][hi!][hi!]}", (java.lang.Throwable) actionRequestValidationException12, "delete {[][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure20 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][][]}", (java.lang.Throwable) actionRequestValidationException12, "delete {[][hi!][hi!]}");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(actionRequestValidationException12);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        long long1 = deleteRequest0.seqNo();
        boolean boolean2 = deleteRequest0.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.parent("hi!");
        org.elasticsearch.common.unit.TimeValue timeValue5 = deleteRequest4.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.index.VersionType versionType7 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.versionType(versionType7);
        deleteRequest6.primaryTerm((long) 1);
        org.elasticsearch.common.unit.TimeValue timeValue11 = deleteRequest6.timeout();
        java.lang.String str12 = deleteRequest6.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest6.version(1L);
        org.elasticsearch.common.unit.TimeValue timeValue15 = deleteRequest14.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest4.timeout(timeValue15);
        org.elasticsearch.common.io.stream.StreamInput streamInput17 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest16.readFrom(streamInput17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(timeValue5);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(timeValue11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(timeValue15);
        org.junit.Assert.assertNotNull(deleteRequest16);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][hi!][hi!]}", "", "delete {[][hi!][hi!]}");
        org.elasticsearch.index.VersionType versionType4 = deleteRequest3.versionType();
        java.lang.String str5 = deleteRequest3.toString();
        org.junit.Assert.assertNotNull(versionType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "delete {[delete {[][hi!][hi!]}][][delete {[][hi!][hi!]}]}" + "'", str5, "delete {[delete {[][hi!][hi!]}][][delete {[][hi!][hi!]}]}");
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId19 = deleteRequest18.getParentTask();
        org.elasticsearch.tasks.Task task20 = deleteRequest11.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId19);
        java.lang.String str21 = deleteRequest11.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType24 = deleteRequest23.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest11.versionType(versionType24);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException26 = deleteRequest25.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure28 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "", (java.lang.Throwable) actionRequestValidationException26, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure30 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "delete {[hi!][null][null]}", (java.lang.Throwable) actionRequestValidationException26, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure32 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "hi!", (java.lang.Throwable) actionRequestValidationException26, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure34 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}", (java.lang.Throwable) actionRequestValidationException26, "delete {[hi!][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure36 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[delete {[hi!][delete {[][hi!][hi!]}][hi!]}][hi!][null]}", (java.lang.Throwable) actionRequestValidationException26, "delete {[][null][null]}");
        java.lang.String str37 = shardFailure36.indexUUID;
        org.junit.Assert.assertNotNull(taskId19);
        org.junit.Assert.assertNotNull(task20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "delete {[hi!][null][null]}" + "'", str21, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType24);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(actionRequestValidationException26);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "delete {[][null][null]}" + "'", str37, "delete {[][null][null]}");
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", "delete {[hi!][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        deleteRequest7.primaryTerm(10L);
        java.lang.String str10 = deleteRequest7.toString();
        java.lang.String str11 = deleteRequest7.getDescription();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel12 = deleteRequest7.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest5.consistencyLevel(writeConsistencyLevel12);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest3.consistencyLevel(writeConsistencyLevel12);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][hi!][hi!]}", "", "delete {[][hi!][hi!]}");
        org.elasticsearch.index.VersionType versionType19 = deleteRequest18.versionType();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel20 = deleteRequest18.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        java.lang.String str23 = deleteRequest22.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest22.type("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest25.routing("delete {[][hi!][hi!]}");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel28 = deleteRequest25.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest18.consistencyLevel(writeConsistencyLevel28);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest14.consistencyLevel(writeConsistencyLevel28);
        org.elasticsearch.common.transport.TransportAddress transportAddress31 = null;
        deleteRequest14.remoteAddress(transportAddress31);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "delete {[hi!][null][null]}" + "'", str10, "delete {[hi!][null][null]}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[hi!][null][null]}" + "'", str11, "delete {[hi!][null][null]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel12 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel12.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(versionType19);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel20 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel20.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel28 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel28.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertNotNull(deleteRequest30);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting10 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting12 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId23 = deleteRequest22.getParentTask();
        org.elasticsearch.tasks.Task task24 = deleteRequest15.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId23);
        java.lang.String str25 = deleteRequest15.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType28 = deleteRequest27.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest15.versionType(versionType28);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException30 = deleteRequest29.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure32 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting12, "", (java.lang.Throwable) actionRequestValidationException30, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure34 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting10, "delete {[hi!][null][null]}", (java.lang.Throwable) actionRequestValidationException30, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure36 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "hi!", (java.lang.Throwable) actionRequestValidationException30, "delete {[hi!][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure38 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "", (java.lang.Throwable) actionRequestValidationException30, "delete {[hi!][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure40 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "hi!", (java.lang.Throwable) actionRequestValidationException30, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure42 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "hi!", (java.lang.Throwable) actionRequestValidationException30, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure44 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "", (java.lang.Throwable) actionRequestValidationException30, "delete {[null][null][null]}");
        java.lang.String str45 = shardFailure44.reason;
        org.junit.Assert.assertNotNull(taskId23);
        org.junit.Assert.assertNotNull(task24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "delete {[hi!][null][null]}" + "'", str25, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType28);
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertNotNull(actionRequestValidationException30);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        long long1 = deleteRequest0.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("delete {[][hi!][hi!]}");
        deleteRequest3.seqNo((long) 100);
        org.elasticsearch.common.unit.TimeValue timeValue6 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.timeout(timeValue6);
        org.elasticsearch.common.unit.TimeValue timeValue8 = deleteRequest3.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.parent("delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.elasticsearch.index.shard.ShardId shardId11 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest3.setShardId(shardId11);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        deleteRequest14.primaryTerm(10L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = new org.elasticsearch.action.delete.DeleteRequest();
        long long18 = deleteRequest17.seqNo();
        boolean boolean19 = deleteRequest17.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest17.parent("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest17.id("hi!");
        boolean boolean24 = deleteRequest23.getShouldPersistResult();
        org.elasticsearch.index.VersionType versionType25 = deleteRequest23.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest14.versionType(versionType25);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest3.versionType(versionType25);
        org.elasticsearch.index.shard.IndexShard indexShard28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete29 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest27, indexShard28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(versionType25);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNotNull(deleteRequest27);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.parent("delete {[hi!][null][null]}");
        org.elasticsearch.index.VersionType versionType3 = deleteRequest0.versionType();
        org.elasticsearch.index.VersionType versionType4 = deleteRequest0.versionType();
        java.lang.String str5 = deleteRequest0.id();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = deleteRequest0.consistencyLevel();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNotNull(versionType4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel6 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel6.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId9 = deleteRequest8.getParentTask();
        org.elasticsearch.tasks.Task task10 = deleteRequest1.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId9);
        java.lang.String str11 = deleteRequest1.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType14 = deleteRequest13.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest1.versionType(versionType14);
        org.elasticsearch.common.transport.TransportAddress transportAddress16 = deleteRequest1.remoteAddress();
        boolean boolean17 = deleteRequest1.getShouldPersistResult();
        org.junit.Assert.assertNotNull(taskId9);
        org.junit.Assert.assertNotNull(task10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[hi!][null][null]}" + "'", str11, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType14);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNull(transportAddress16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId9 = deleteRequest8.getParentTask();
        org.elasticsearch.tasks.Task task10 = deleteRequest1.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId9);
        java.lang.String str11 = deleteRequest1.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType14 = deleteRequest13.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest1.versionType(versionType14);
        java.lang.String str16 = deleteRequest15.toString();
        boolean boolean17 = deleteRequest15.getShouldPersistResult();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException18 = deleteRequest15.validate();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel19 = deleteRequest15.consistencyLevel();
        org.junit.Assert.assertNotNull(taskId9);
        org.junit.Assert.assertNotNull(task10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[hi!][null][null]}" + "'", str11, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType14);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "delete {[hi!][null][null]}" + "'", str16, "delete {[hi!][null][null]}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(actionRequestValidationException18);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel19 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel19.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][hi!][hi!]}", "delete {[][hi!][hi!]}", "hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.routing("delete {[null][null][null]}");
        deleteRequest5.seqNo((long) (byte) 1);
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = null;
        deleteRequest5.remoteAddress(transportAddress8);
        org.junit.Assert.assertNotNull(deleteRequest5);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.index.VersionType versionType1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.versionType(versionType1);
        org.elasticsearch.index.VersionType versionType3 = deleteRequest0.versionType();
        org.elasticsearch.index.shard.IndexShard indexShard4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete5 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest0, indexShard4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(versionType3);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        long long1 = deleteRequest0.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.consistencyLevel(writeConsistencyLevel2);
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.setShardId(shardId4);
        org.elasticsearch.action.support.IndicesOptions indicesOptions6 = deleteRequest3.indicesOptions();
        boolean boolean7 = deleteRequest3.refresh();
        org.elasticsearch.index.shard.IndexShard indexShard8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete9 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest3, indexShard8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(indicesOptions6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        long long1 = deleteRequest0.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.consistencyLevel(writeConsistencyLevel2);
        java.lang.String str4 = deleteRequest0.routing();
        java.lang.String str5 = deleteRequest0.index();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = deleteRequest0.consistencyLevel();
        org.elasticsearch.common.transport.TransportAddress transportAddress7 = deleteRequest0.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest0.type("");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException10 = deleteRequest0.validate();
        java.lang.String str11 = deleteRequest0.getDescription();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(writeConsistencyLevel6);
        org.junit.Assert.assertNull(transportAddress7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(actionRequestValidationException10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[null][][null]}" + "'", str11, "delete {[null][][null]}");
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        long long1 = deleteRequest0.seqNo();
        java.lang.String str2 = deleteRequest0.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.id("delete {[null][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest0.parent("delete {[][][delete {[][hi!][hi!]}]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        deleteRequest10.seqNo((-1L));
        java.lang.String str13 = deleteRequest10.toString();
        org.elasticsearch.index.shard.ShardId shardId14 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest10.setShardId(shardId14);
        deleteRequest15.primaryTerm((-1L));
        org.elasticsearch.tasks.TaskId taskId18 = deleteRequest15.getParentTask();
        deleteRequest0.setParentTask(taskId18);
        org.elasticsearch.index.shard.IndexShard indexShard20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete21 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest0, indexShard20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "delete {[hi!][delete {[][hi!][hi!]}][hi!]}" + "'", str13, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(taskId18);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.index.VersionType versionType1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.versionType(versionType1);
        deleteRequest0.primaryTerm((long) 1);
        org.elasticsearch.common.unit.TimeValue timeValue5 = deleteRequest0.timeout();
        java.lang.String str6 = deleteRequest0.id();
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest0.setShardId(shardId7);
        org.elasticsearch.common.io.stream.StreamInput streamInput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest8.readFrom(streamInput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(timeValue5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(deleteRequest8);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType3 = deleteRequest2.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.versionType(versionType3);
        long long5 = deleteRequest0.primaryTerm();
        org.elasticsearch.action.support.IndicesOptions indicesOptions6 = deleteRequest0.indicesOptions();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.writeTo(streamOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(indicesOptions6);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[delete {[][hi!][hi!]}][][delete {[][hi!][hi!]}]}", throwable2, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.parent("delete {[hi!][null][null]}");
        org.elasticsearch.index.VersionType versionType3 = deleteRequest0.versionType();
        org.elasticsearch.index.VersionType versionType4 = deleteRequest0.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId14 = deleteRequest13.getParentTask();
        org.elasticsearch.tasks.Task task15 = deleteRequest6.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId14);
        java.lang.String str16 = deleteRequest6.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType19 = deleteRequest18.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest6.versionType(versionType19);
        java.lang.String str21 = deleteRequest20.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest20.routing("hi!");
        java.lang.String str24 = deleteRequest23.index();
        long long25 = deleteRequest23.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        deleteRequest29.primaryTerm(10L);
        java.lang.String str32 = deleteRequest29.toString();
        java.lang.String str33 = deleteRequest29.getDescription();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel34 = deleteRequest29.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = deleteRequest27.consistencyLevel(writeConsistencyLevel34);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest36 = deleteRequest23.consistencyLevel(writeConsistencyLevel34);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest37 = deleteRequest0.consistencyLevel(writeConsistencyLevel34);
        org.elasticsearch.index.shard.IndexShard indexShard38 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete39 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest37, indexShard38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNotNull(versionType4);
        org.junit.Assert.assertNotNull(taskId14);
        org.junit.Assert.assertNotNull(task15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "delete {[hi!][null][null]}" + "'", str16, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType19);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "delete {[hi!][null][null]}" + "'", str21, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "delete {[hi!][null][null]}" + "'", str32, "delete {[hi!][null][null]}");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "delete {[hi!][null][null]}" + "'", str33, "delete {[hi!][null][null]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel34 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel34.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest35);
        org.junit.Assert.assertNotNull(deleteRequest36);
        org.junit.Assert.assertNotNull(deleteRequest37);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        long long1 = deleteRequest0.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.consistencyLevel(writeConsistencyLevel2);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        java.lang.String str6 = deleteRequest5.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest5.type("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.routing("delete {[][hi!][hi!]}");
        org.elasticsearch.tasks.TaskId taskId11 = deleteRequest8.getParentTask();
        deleteRequest3.setParentTask(taskId11);
        org.elasticsearch.index.shard.ShardId shardId13 = deleteRequest3.shardId();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest3.version((long) (byte) 0);
        org.elasticsearch.common.transport.TransportAddress transportAddress16 = null;
        deleteRequest15.remoteAddress(transportAddress16);
        java.lang.String str18 = deleteRequest15.routing();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(taskId11);
        org.junit.Assert.assertNull(shardId13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][null][null]}", "delete {[hi!][null][null]}", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue8 = deleteRequest7.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.timeout(timeValue8);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.timeout("delete {[][null][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[][null][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(deleteRequest9);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][null][null]}", "delete {[hi!][null][null]}", "");
        deleteRequest3.seqNo((long) 100);
        java.lang.String str6 = deleteRequest3.type();
        org.elasticsearch.common.io.stream.StreamInput streamInput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.readFrom(streamInput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "delete {[hi!][null][null]}" + "'", str6, "delete {[hi!][null][null]}");
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        long long1 = deleteRequest0.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("delete {[][hi!][hi!]}");
        deleteRequest3.seqNo((long) 100);
        org.elasticsearch.common.unit.TimeValue timeValue6 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.timeout(timeValue6);
        org.elasticsearch.common.unit.TimeValue timeValue8 = deleteRequest3.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][hi!][hi!]}", "", "delete {[][hi!][hi!]}");
        org.elasticsearch.index.VersionType versionType13 = deleteRequest12.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest3.versionType(versionType13);
        long long15 = deleteRequest14.primaryTerm();
        org.elasticsearch.common.io.stream.StreamInput streamInput16 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest14.readFrom(streamInput16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(versionType13);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.index.VersionType versionType1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.versionType(versionType1);
        deleteRequest0.primaryTerm((long) 1);
        org.elasticsearch.common.unit.TimeValue timeValue5 = deleteRequest0.timeout();
        java.lang.String str6 = deleteRequest0.id();
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest0.setShardId(shardId7);
        deleteRequest8.primaryTerm((long) 10);
        java.lang.String str11 = deleteRequest8.index();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(timeValue5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.index.VersionType versionType1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.versionType(versionType1);
        deleteRequest0.primaryTerm((long) 1);
        org.elasticsearch.common.unit.TimeValue timeValue5 = deleteRequest0.timeout();
        java.lang.String str6 = deleteRequest0.index();
        org.elasticsearch.action.support.IndicesOptions indicesOptions7 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType11 = deleteRequest10.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest8.versionType(versionType11);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest0.versionType(versionType11);
        java.lang.String str14 = deleteRequest0.parent();
        deleteRequest0.seqNo((long) ' ');
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(timeValue5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(indicesOptions7);
        org.junit.Assert.assertNotNull(versionType11);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId9 = deleteRequest8.getParentTask();
        org.elasticsearch.tasks.Task task10 = deleteRequest1.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId9);
        java.lang.String str11 = deleteRequest1.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType14 = deleteRequest13.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest1.versionType(versionType14);
        java.lang.String str16 = deleteRequest15.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest15.routing("hi!");
        java.lang.String str19 = deleteRequest18.index();
        long long20 = deleteRequest18.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        deleteRequest24.primaryTerm(10L);
        java.lang.String str27 = deleteRequest24.toString();
        java.lang.String str28 = deleteRequest24.getDescription();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel29 = deleteRequest24.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest22.consistencyLevel(writeConsistencyLevel29);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest18.consistencyLevel(writeConsistencyLevel29);
        org.elasticsearch.common.io.stream.StreamInput streamInput32 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest18.readFrom(streamInput32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(taskId9);
        org.junit.Assert.assertNotNull(task10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[hi!][null][null]}" + "'", str11, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType14);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "delete {[hi!][null][null]}" + "'", str16, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "delete {[hi!][null][null]}" + "'", str27, "delete {[hi!][null][null]}");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "delete {[hi!][null][null]}" + "'", str28, "delete {[hi!][null][null]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel29 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel29.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertNotNull(deleteRequest31);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][null][null]}", "delete {[hi!][null][null]}", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue8 = deleteRequest7.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.timeout(timeValue8);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        java.lang.String str19 = deleteRequest18.getDescription();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel20 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest18.consistencyLevel(writeConsistencyLevel20);
        long long22 = deleteRequest18.version();
        org.elasticsearch.tasks.TaskId taskId23 = deleteRequest18.getParentTask();
        org.elasticsearch.tasks.Task task24 = deleteRequest11.createTask((long) (byte) 0, "", "", taskId23);
        org.elasticsearch.index.shard.ShardId shardId25 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest11.setShardId(shardId25);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = new org.elasticsearch.action.delete.DeleteRequest();
        long long28 = deleteRequest27.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel29 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest27.consistencyLevel(writeConsistencyLevel29);
        org.elasticsearch.index.shard.ShardId shardId31 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest30.setShardId(shardId31);
        org.elasticsearch.tasks.TaskId taskId33 = deleteRequest32.getParentTask();
        deleteRequest26.setParentTask(taskId33);
        deleteRequest26.primaryTerm((long) '#');
        java.lang.String str37 = deleteRequest26.getDescription();
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "delete {[][hi!][hi!]}" + "'", str19, "delete {[][hi!][hi!]}");
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-3L) + "'", long22 == (-3L));
        org.junit.Assert.assertNotNull(taskId23);
        org.junit.Assert.assertNotNull(task24);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertNotNull(taskId33);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][hi!]}" + "'", str37, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][hi!]}");
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
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
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.parent("delete {[hi!][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest8.parent("");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException13 = deleteRequest12.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure15 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}", (java.lang.Throwable) actionRequestValidationException13, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure17 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "", (java.lang.Throwable) actionRequestValidationException13, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure19 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[][][delete {[][hi!][hi!]}]}", (java.lang.Throwable) actionRequestValidationException13, "delete {[][][delete {[][hi!][hi!]}]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure21 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[null][null][null]}", (java.lang.Throwable) actionRequestValidationException13, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        java.lang.String str22 = shardFailure21.reason;
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(actionRequestValidationException13);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "delete {[null][null][null]}" + "'", str22, "delete {[null][null][null]}");
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][hi!][hi!]}", "delete {[hi!][null][null]}", "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        java.lang.String str4 = deleteRequest3.type();
        java.lang.Class<?> wildcardClass5 = deleteRequest3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[hi!][null][null]}" + "'", str4, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId9 = deleteRequest8.getParentTask();
        org.elasticsearch.tasks.Task task10 = deleteRequest1.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId9);
        java.lang.String str11 = deleteRequest1.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType14 = deleteRequest13.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest1.versionType(versionType14);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId25 = deleteRequest24.getParentTask();
        org.elasticsearch.tasks.Task task26 = deleteRequest17.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId25);
        java.lang.String str27 = deleteRequest17.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType30 = deleteRequest29.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest17.versionType(versionType30);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest15.versionType(versionType30);
        boolean boolean33 = deleteRequest15.getShouldPersistResult();
        java.lang.String str34 = deleteRequest15.type();
        org.junit.Assert.assertNotNull(taskId9);
        org.junit.Assert.assertNotNull(task10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[hi!][null][null]}" + "'", str11, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType14);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(taskId25);
        org.junit.Assert.assertNotNull(task26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "delete {[hi!][null][null]}" + "'", str27, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType30);
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][hi!][hi!]}", "", "delete {[][hi!][hi!]}");
        org.elasticsearch.tasks.TaskId taskId4 = deleteRequest3.getParentTask();
        org.elasticsearch.action.support.IndicesOptions indicesOptions5 = deleteRequest3.indicesOptions();
        org.elasticsearch.common.io.stream.StreamInput streamInput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.readFrom(streamInput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(taskId4);
        org.junit.Assert.assertNotNull(indicesOptions5);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        long long1 = deleteRequest0.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.consistencyLevel(writeConsistencyLevel2);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.version((long) (short) 0);
        java.lang.String str6 = deleteRequest0.index();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        long long1 = deleteRequest0.seqNo();
        boolean boolean2 = deleteRequest0.getShouldPersistResult();
        deleteRequest0.primaryTerm((long) (byte) 1);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = deleteRequest0.consistencyLevel();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel5 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel5.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType2 = deleteRequest1.versionType();
        org.elasticsearch.common.transport.TransportAddress transportAddress3 = null;
        deleteRequest1.remoteAddress(transportAddress3);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        java.lang.String str7 = deleteRequest6.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][null][null]}", "delete {[hi!][null][null]}", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue16 = deleteRequest15.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest11.timeout(timeValue16);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest6.timeout(timeValue16);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest1.timeout(timeValue16);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest19.timeout("delete {[delete {[][hi!][hi!]}][][delete {[][hi!][hi!]}]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[delete {[][hi!][hi!]}][][delete {[][hi!][hi!]}]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(timeValue16);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(deleteRequest19);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}", "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}", "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = null;
        deleteRequest3.remoteAddress(transportAddress4);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType3 = deleteRequest2.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.versionType(versionType3);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.parent("delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        boolean boolean7 = deleteRequest4.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.index("delete {[][hi!][hi!]}");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel12 = deleteRequest9.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest4.consistencyLevel(writeConsistencyLevel12);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.timeout("");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel12 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel12.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest13);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.index.VersionType versionType1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.versionType(versionType1);
        deleteRequest0.primaryTerm((long) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest0.timeout("hi!");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [hi!] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        long long3 = deleteRequest2.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.consistencyLevel(writeConsistencyLevel4);
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.setShardId(shardId6);
        org.elasticsearch.action.support.IndicesOptions indicesOptions8 = deleteRequest5.indicesOptions();
        boolean boolean9 = deleteRequest5.refresh();
        java.lang.String str10 = deleteRequest5.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest5.parent("delete {[][][delete {[][hi!][hi!]}]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[delete {[][hi!][hi!]}][][delete {[][hi!][hi!]}]}", deleteRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(indicesOptions8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(deleteRequest12);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId15 = deleteRequest14.getParentTask();
        org.elasticsearch.tasks.Task task16 = deleteRequest7.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId15);
        java.lang.String str17 = deleteRequest7.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType20 = deleteRequest19.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest7.versionType(versionType20);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException22 = deleteRequest21.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure24 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[][hi!][hi!]}", (java.lang.Throwable) actionRequestValidationException22, "delete {[hi!][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure26 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "hi!", (java.lang.Throwable) actionRequestValidationException22, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure28 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[][hi!][hi!]}", (java.lang.Throwable) actionRequestValidationException22, "delete {[null][null][hi!]}");
        java.lang.String str29 = shardFailure28.indexUUID;
        org.junit.Assert.assertNotNull(taskId15);
        org.junit.Assert.assertNotNull(task16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "delete {[hi!][null][null]}" + "'", str17, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType20);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(actionRequestValidationException22);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "delete {[null][null][hi!]}" + "'", str29, "delete {[null][null][hi!]}");
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType3 = deleteRequest2.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.versionType(versionType3);
        long long5 = deleteRequest0.primaryTerm();
        org.elasticsearch.action.support.IndicesOptions indicesOptions6 = deleteRequest0.indicesOptions();
        long long7 = deleteRequest0.version();
        boolean boolean8 = deleteRequest0.getShouldPersistResult();
        deleteRequest0.setParentTask("delete {[delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][null][null]}", 0L);
        org.elasticsearch.common.io.stream.StreamInput streamInput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.readFrom(streamInput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(indicesOptions6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-3L) + "'", long7 == (-3L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId11 = deleteRequest10.getParentTask();
        org.elasticsearch.tasks.Task task12 = deleteRequest3.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId11);
        long long13 = deleteRequest3.primaryTerm();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException14 = deleteRequest3.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure16 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[null][null][null]}", (java.lang.Throwable) actionRequestValidationException14, "");
        java.lang.String str17 = shardFailure16.reason;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting18 = shardFailure16.routing;
        org.junit.Assert.assertNotNull(taskId11);
        org.junit.Assert.assertNotNull(task12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(actionRequestValidationException14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "delete {[null][null][null]}" + "'", str17, "delete {[null][null][null]}");
        org.junit.Assert.assertNull(shardRouting18);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "delete {[][hi!][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType9 = deleteRequest8.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId14 = deleteRequest13.getParentTask();
        deleteRequest8.setParentTask(taskId14);
        org.elasticsearch.tasks.Task task16 = deleteRequest3.createTask(10L, "", "delete {[hi!][null][null]}", taskId14);
        java.lang.String str17 = deleteRequest3.parent();
        java.lang.Class<?> wildcardClass18 = deleteRequest3.getClass();
        org.junit.Assert.assertNotNull(versionType9);
        org.junit.Assert.assertNotNull(taskId14);
        org.junit.Assert.assertNotNull(task16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][hi!][hi!]}", "", "delete {[][hi!][hi!]}");
        org.elasticsearch.index.VersionType versionType4 = deleteRequest3.versionType();
        java.lang.String str5 = deleteRequest3.type();
        java.lang.String str6 = deleteRequest3.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.timeout("");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "delete {[delete {[][hi!][hi!]}][][delete {[][hi!][hi!]}]}" + "'", str6, "delete {[delete {[][hi!][hi!]}][][delete {[][hi!][hi!]}]}");
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        java.lang.String str2 = deleteRequest1.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest1.type("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest1.type("delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        java.lang.String str7 = deleteRequest6.id();
        long long8 = deleteRequest6.version();
        org.elasticsearch.tasks.TaskId taskId9 = deleteRequest6.getParentTask();
        java.lang.String str10 = deleteRequest6.type();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-3L) + "'", long8 == (-3L));
        org.junit.Assert.assertNotNull(taskId9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "delete {[hi!][delete {[][hi!][hi!]}][hi!]}" + "'", str10, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        deleteRequest3.seqNo((-1L));
        java.lang.String str6 = deleteRequest3.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        java.lang.String str9 = deleteRequest8.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.index.VersionType versionType11 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.versionType(versionType11);
        deleteRequest10.primaryTerm((long) 1);
        org.elasticsearch.common.unit.TimeValue timeValue15 = deleteRequest10.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest8.timeout(timeValue15);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest3.timeout(timeValue15);
        java.lang.Class<?> wildcardClass18 = deleteRequest17.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "delete {[hi!][delete {[][hi!][hi!]}][hi!]}" + "'", str6, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(timeValue15);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "delete {[hi!][null][null]}", "");
        java.lang.String str4 = deleteRequest3.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        java.lang.String str10 = deleteRequest9.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest9.type("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest12.routing("delete {[][hi!][hi!]}");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel15 = deleteRequest12.consistencyLevel();
        org.elasticsearch.tasks.TaskId taskId16 = deleteRequest12.getParentTask();
        org.elasticsearch.tasks.Task task17 = deleteRequest3.createTask((long) (-1), "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}", "hi!", taskId16);
        boolean boolean18 = deleteRequest3.refresh();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput19 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.writeTo(streamOutput19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[hi!][null][null]}" + "'", str4, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel15 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel15.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(taskId16);
        org.junit.Assert.assertNotNull(task17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType3 = deleteRequest2.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.versionType(versionType3);
        long long5 = deleteRequest0.primaryTerm();
        java.lang.String str6 = deleteRequest0.parent();
        java.lang.String str7 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest0.version(10L);
        org.elasticsearch.common.unit.TimeValue timeValue10 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest0.timeout(timeValue10);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest0.timeout("delete {[null][delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[null][delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(timeValue10);
        org.junit.Assert.assertNotNull(deleteRequest11);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId13 = deleteRequest12.getParentTask();
        org.elasticsearch.tasks.Task task14 = deleteRequest5.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId13);
        java.lang.String str15 = deleteRequest5.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType18 = deleteRequest17.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest5.versionType(versionType18);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException20 = deleteRequest19.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure22 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}", (java.lang.Throwable) actionRequestValidationException20, "delete {[][hi!][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure24 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[null][null][null]}", (java.lang.Throwable) actionRequestValidationException20, "delete {[][null][null]}");
        java.lang.String str25 = shardFailure24.indexUUID;
        org.junit.Assert.assertNotNull(taskId13);
        org.junit.Assert.assertNotNull(task14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "delete {[hi!][null][null]}" + "'", str15, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType18);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(actionRequestValidationException20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "delete {[][null][null]}" + "'", str25, "delete {[][null][null]}");
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][hi!][hi!]}", "delete {[][hi!][hi!]}", "hi!");
        boolean boolean6 = deleteRequest5.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest5.version(0L);
        org.elasticsearch.index.VersionType versionType9 = deleteRequest8.versionType();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[][][delete {[][hi!][hi!]}]}", deleteRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(versionType9);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.index.VersionType versionType1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.versionType(versionType1);
        deleteRequest0.primaryTerm((long) 1);
        org.elasticsearch.common.unit.TimeValue timeValue5 = deleteRequest0.timeout();
        java.lang.String str6 = deleteRequest0.id();
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest0.setShardId(shardId7);
        org.elasticsearch.index.shard.ShardId shardId9 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest0.setShardId(shardId9);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = deleteRequest0.consistencyLevel();
        java.lang.String str12 = deleteRequest0.parent();
        org.elasticsearch.index.shard.IndexShard indexShard13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete14 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest0, indexShard13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(timeValue5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel11 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel11.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType5 = deleteRequest4.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest2.versionType(versionType5);
        long long7 = deleteRequest2.primaryTerm();
        org.elasticsearch.action.support.IndicesOptions indicesOptions8 = deleteRequest2.indicesOptions();
        long long9 = deleteRequest2.version();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest2.type("delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException12 = deleteRequest2.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure14 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[null][null][null]}", (java.lang.Throwable) actionRequestValidationException12, "delete {[][][delete {[][hi!][hi!]}]}");
        java.lang.String str15 = shardFailure14.indexUUID;
        java.lang.String str16 = shardFailure14.indexUUID;
        org.junit.Assert.assertNotNull(versionType5);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(indicesOptions8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-3L) + "'", long9 == (-3L));
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(actionRequestValidationException12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "delete {[][][delete {[][hi!][hi!]}]}" + "'", str15, "delete {[][][delete {[][hi!][hi!]}]}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "delete {[][][delete {[][hi!][hi!]}]}" + "'", str16, "delete {[][][delete {[][hi!][hi!]}]}");
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        long long1 = deleteRequest0.seqNo();
        java.lang.String str2 = deleteRequest0.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.id("delete {[null][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest0.parent("delete {[][][delete {[][hi!][hi!]}]}");
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.setShardId(shardId7);
        org.elasticsearch.common.io.stream.StreamInput streamInput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest6.readFrom(streamInput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest8);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        long long7 = deleteRequest6.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.parent("delete {[][hi!][hi!]}");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException10 = deleteRequest9.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure12 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}", (java.lang.Throwable) actionRequestValidationException10, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure14 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "", (java.lang.Throwable) actionRequestValidationException10, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure16 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[null][][null]}", (java.lang.Throwable) actionRequestValidationException10, "delete {[][][delete {[][hi!][hi!]}]}");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(actionRequestValidationException10);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId19 = deleteRequest18.getParentTask();
        org.elasticsearch.tasks.Task task20 = deleteRequest11.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId19);
        java.lang.String str21 = deleteRequest11.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType24 = deleteRequest23.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest11.versionType(versionType24);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException26 = deleteRequest25.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure28 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "", (java.lang.Throwable) actionRequestValidationException26, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure30 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "delete {[hi!][null][null]}", (java.lang.Throwable) actionRequestValidationException26, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure32 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "hi!", (java.lang.Throwable) actionRequestValidationException26, "delete {[hi!][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure34 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "", (java.lang.Throwable) actionRequestValidationException26, "delete {[hi!][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure36 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[hi!][null][null]}", (java.lang.Throwable) actionRequestValidationException26, "");
        java.lang.Class<?> wildcardClass37 = actionRequestValidationException26.getClass();
        org.junit.Assert.assertNotNull(taskId19);
        org.junit.Assert.assertNotNull(task20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "delete {[hi!][null][null]}" + "'", str21, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType24);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(actionRequestValidationException26);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId9 = deleteRequest8.getParentTask();
        org.elasticsearch.tasks.Task task10 = deleteRequest1.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId9);
        java.lang.String str11 = deleteRequest1.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType14 = deleteRequest13.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest1.versionType(versionType14);
        java.lang.String str16 = deleteRequest15.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest15.routing("hi!");
        java.lang.String str19 = deleteRequest18.index();
        long long20 = deleteRequest18.primaryTerm();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput21 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest18.writeTo(streamOutput21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(taskId9);
        org.junit.Assert.assertNotNull(task10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[hi!][null][null]}" + "'", str11, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType14);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "delete {[hi!][null][null]}" + "'", str16, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][null][null]}", "delete {[hi!][null][null]}", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue8 = deleteRequest7.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.timeout(timeValue8);
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = null;
        deleteRequest3.remoteAddress(transportAddress10);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        deleteRequest13.primaryTerm(10L);
        java.lang.String str16 = deleteRequest13.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType19 = deleteRequest18.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest13.versionType(versionType19);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest3.versionType(versionType19);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest3.index("delete {[delete {[null][null][hi!]}][hi!][hi!]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest3.timeout("delete {[delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][][]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][][]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "delete {[hi!][null][null]}" + "'", str16, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType19);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(deleteRequest23);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId9 = deleteRequest8.getParentTask();
        org.elasticsearch.tasks.Task task10 = deleteRequest1.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId9);
        java.lang.String str11 = deleteRequest1.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType14 = deleteRequest13.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest1.versionType(versionType14);
        org.elasticsearch.common.transport.TransportAddress transportAddress16 = deleteRequest1.remoteAddress();
        deleteRequest1.seqNo((long) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest1.timeout("delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(taskId9);
        org.junit.Assert.assertNotNull(task10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[hi!][null][null]}" + "'", str11, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType14);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNull(transportAddress16);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][null][null]}", "delete {[hi!][null][null]}", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue8 = deleteRequest7.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.timeout(timeValue8);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        java.lang.String str19 = deleteRequest18.getDescription();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel20 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest18.consistencyLevel(writeConsistencyLevel20);
        long long22 = deleteRequest18.version();
        org.elasticsearch.tasks.TaskId taskId23 = deleteRequest18.getParentTask();
        org.elasticsearch.tasks.Task task24 = deleteRequest11.createTask((long) (byte) 0, "", "", taskId23);
        org.elasticsearch.index.shard.ShardId shardId25 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest11.setShardId(shardId25);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = new org.elasticsearch.action.delete.DeleteRequest();
        long long28 = deleteRequest27.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel29 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest27.consistencyLevel(writeConsistencyLevel29);
        org.elasticsearch.index.shard.ShardId shardId31 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest30.setShardId(shardId31);
        org.elasticsearch.tasks.TaskId taskId33 = deleteRequest32.getParentTask();
        deleteRequest26.setParentTask(taskId33);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest36 = deleteRequest26.timeout("delete {[delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][null][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][null][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "delete {[][hi!][hi!]}" + "'", str19, "delete {[][hi!][hi!]}");
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-3L) + "'", long22 == (-3L));
        org.junit.Assert.assertNotNull(taskId23);
        org.junit.Assert.assertNotNull(task24);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertNotNull(taskId33);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.index.VersionType versionType1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.versionType(versionType1);
        deleteRequest0.primaryTerm((long) 1);
        org.elasticsearch.common.unit.TimeValue timeValue5 = deleteRequest0.timeout();
        java.lang.String str6 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest0.index("delete {[][hi!][hi!]}");
        org.elasticsearch.index.shard.ShardId shardId9 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest0.setShardId(shardId9);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException11 = deleteRequest10.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(timeValue5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType4 = deleteRequest3.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId9 = deleteRequest8.getParentTask();
        deleteRequest3.setParentTask(taskId9);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest3.id("delete {[hi!][null][null]}");
        org.elasticsearch.index.shard.ShardId shardId13 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest12.setShardId(shardId13);
        long long15 = deleteRequest14.seqNo();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[null][][null]}", deleteRequest14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType4);
        org.junit.Assert.assertNotNull(taskId9);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        java.lang.String str2 = deleteRequest1.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest1.type("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.routing("delete {[][hi!][hi!]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.timeout("");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("", "delete {[hi!][delete {[][hi!][hi!]}][hi!]}", "hi!");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = deleteRequest5.consistencyLevel();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[][hi!][hi!]}", deleteRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel6 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel6.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        java.lang.String str2 = deleteRequest1.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}", "hi!", "");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = deleteRequest6.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest1.consistencyLevel(writeConsistencyLevel7);
        org.elasticsearch.common.transport.TransportAddress transportAddress9 = deleteRequest8.remoteAddress();
        java.lang.String str10 = deleteRequest8.toString();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel7 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel7.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNull(transportAddress9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "delete {[hi!][null][null]}" + "'", str10, "delete {[hi!][null][null]}");
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType3 = deleteRequest2.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.versionType(versionType3);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.index("delete {[hi!][null][null]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress7 = null;
        deleteRequest6.remoteAddress(transportAddress7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest6.index("delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.parent("delete {[hi!][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest12.version((long) '4');
        org.elasticsearch.common.io.stream.StreamInput streamInput15 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest12.readFrom(streamInput15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest14);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][null][null]}", "delete {[hi!][null][null]}", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue8 = deleteRequest7.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.timeout(timeValue8);
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = null;
        deleteRequest3.remoteAddress(transportAddress10);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId21 = deleteRequest20.getParentTask();
        org.elasticsearch.tasks.Task task22 = deleteRequest13.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId21);
        java.lang.String str23 = deleteRequest13.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType26 = deleteRequest25.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest13.versionType(versionType26);
        java.lang.String str28 = deleteRequest27.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest27.routing("hi!");
        java.lang.String str31 = deleteRequest30.index();
        long long32 = deleteRequest30.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest36 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        deleteRequest36.primaryTerm(10L);
        java.lang.String str39 = deleteRequest36.toString();
        java.lang.String str40 = deleteRequest36.getDescription();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel41 = deleteRequest36.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest42 = deleteRequest34.consistencyLevel(writeConsistencyLevel41);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest43 = deleteRequest30.consistencyLevel(writeConsistencyLevel41);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest45 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest52 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId53 = deleteRequest52.getParentTask();
        org.elasticsearch.tasks.Task task54 = deleteRequest45.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId53);
        java.lang.String str55 = deleteRequest45.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest57 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType58 = deleteRequest57.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest59 = deleteRequest45.versionType(versionType58);
        java.lang.String str60 = deleteRequest59.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest62 = deleteRequest59.routing("hi!");
        java.lang.String str63 = deleteRequest62.index();
        long long64 = deleteRequest62.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest66 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest68 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        deleteRequest68.primaryTerm(10L);
        java.lang.String str71 = deleteRequest68.toString();
        java.lang.String str72 = deleteRequest68.getDescription();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel73 = deleteRequest68.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest74 = deleteRequest66.consistencyLevel(writeConsistencyLevel73);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest75 = deleteRequest62.consistencyLevel(writeConsistencyLevel73);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest76 = deleteRequest30.consistencyLevel(writeConsistencyLevel73);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest77 = deleteRequest3.consistencyLevel(writeConsistencyLevel73);
        deleteRequest77.setParentTask("delete {[null][null][null]}", (long) (byte) 10);
        org.elasticsearch.common.transport.TransportAddress transportAddress81 = deleteRequest77.remoteAddress();
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(taskId21);
        org.junit.Assert.assertNotNull(task22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "delete {[hi!][null][null]}" + "'", str23, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType26);
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "delete {[hi!][null][null]}" + "'", str28, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "delete {[hi!][null][null]}" + "'", str39, "delete {[hi!][null][null]}");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "delete {[hi!][null][null]}" + "'", str40, "delete {[hi!][null][null]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel41 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel41.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest42);
        org.junit.Assert.assertNotNull(deleteRequest43);
        org.junit.Assert.assertNotNull(taskId53);
        org.junit.Assert.assertNotNull(task54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "delete {[hi!][null][null]}" + "'", str55, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType58);
        org.junit.Assert.assertNotNull(deleteRequest59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "delete {[hi!][null][null]}" + "'", str60, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "delete {[hi!][null][null]}" + "'", str71, "delete {[hi!][null][null]}");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "delete {[hi!][null][null]}" + "'", str72, "delete {[hi!][null][null]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel73 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel73.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest74);
        org.junit.Assert.assertNotNull(deleteRequest75);
        org.junit.Assert.assertNotNull(deleteRequest76);
        org.junit.Assert.assertNotNull(deleteRequest77);
        org.junit.Assert.assertNull(transportAddress81);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "delete {[null][null][null]}", "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = deleteRequest3.remoteAddress();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.writeTo(streamOutput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(transportAddress4);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId19 = deleteRequest18.getParentTask();
        org.elasticsearch.tasks.Task task20 = deleteRequest11.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId19);
        java.lang.String str21 = deleteRequest11.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType24 = deleteRequest23.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest11.versionType(versionType24);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException26 = deleteRequest25.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure28 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "", (java.lang.Throwable) actionRequestValidationException26, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure30 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "delete {[hi!][null][null]}", (java.lang.Throwable) actionRequestValidationException26, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure32 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[hi!][null][null]}", (java.lang.Throwable) actionRequestValidationException26, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure34 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}", (java.lang.Throwable) actionRequestValidationException26, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure36 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "", (java.lang.Throwable) actionRequestValidationException26, "delete {[null][null][hi!]}");
        java.lang.String str37 = shardFailure36.indexUUID;
        org.junit.Assert.assertNotNull(taskId19);
        org.junit.Assert.assertNotNull(task20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "delete {[hi!][null][null]}" + "'", str21, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType24);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(actionRequestValidationException26);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "delete {[null][null][hi!]}" + "'", str37, "delete {[null][null][hi!]}");
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        long long1 = deleteRequest0.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("delete {[][hi!][hi!]}");
        deleteRequest3.seqNo((long) 100);
        org.elasticsearch.common.unit.TimeValue timeValue6 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.timeout(timeValue6);
        org.elasticsearch.common.unit.TimeValue timeValue8 = deleteRequest3.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.parent("delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        java.lang.String str11 = deleteRequest3.toString();
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest3.setShardId(shardId12);
        long long14 = deleteRequest3.primaryTerm();
        java.lang.String str15 = deleteRequest3.routing();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[null][null][null]}" + "'", str11, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.parent("delete {[hi!][null][null]}");
        org.elasticsearch.index.VersionType versionType3 = deleteRequest0.versionType();
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = deleteRequest0.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest0.type("delete {[delete {[hi!][delete {[][hi!][hi!]}][hi!]}][hi!][null]}");
        deleteRequest6.primaryTerm((long) (short) 100);
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNull(transportAddress4);
        org.junit.Assert.assertNotNull(deleteRequest6);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        java.lang.String str4 = deleteRequest3.getDescription();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.consistencyLevel(writeConsistencyLevel5);
        boolean boolean7 = deleteRequest6.getShouldPersistResult();
        java.lang.String str8 = deleteRequest6.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest();
        long long10 = deleteRequest9.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest9.parent("delete {[][hi!][hi!]}");
        deleteRequest12.seqNo((long) 100);
        org.elasticsearch.tasks.TaskId taskId15 = deleteRequest12.getParentTask();
        org.elasticsearch.common.unit.TimeValue timeValue16 = deleteRequest12.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest6.timeout(timeValue16);
        java.lang.Class<?> wildcardClass18 = deleteRequest6.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[][hi!][hi!]}" + "'", str4, "delete {[][hi!][hi!]}");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(taskId15);
        org.junit.Assert.assertNotNull(timeValue16);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        deleteRequest1.primaryTerm(10L);
        java.lang.String str4 = deleteRequest1.toString();
        java.lang.String str5 = deleteRequest1.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest1.version((-3L));
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        deleteRequest11.seqNo((-1L));
        java.lang.String str14 = deleteRequest11.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        java.lang.String str17 = deleteRequest16.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.index.VersionType versionType19 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest18.versionType(versionType19);
        deleteRequest18.primaryTerm((long) 1);
        org.elasticsearch.common.unit.TimeValue timeValue23 = deleteRequest18.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest16.timeout(timeValue23);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest11.timeout(timeValue23);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest7.timeout(timeValue23);
        java.lang.String[] strArray27 = deleteRequest7.indices();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[hi!][null][null]}" + "'", str4, "delete {[hi!][null][null]}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "delete {[hi!][null][null]}" + "'", str5, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "delete {[hi!][delete {[][hi!][hi!]}][hi!]}" + "'", str14, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(timeValue23);
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNotNull(strArray27);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][][null]}");
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "hi!");
        boolean boolean4 = deleteRequest3.refresh();
        java.lang.String[] strArray5 = deleteRequest3.indices();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.timeout("delete {[delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][null][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][null][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest3.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.index("");
        org.elasticsearch.common.io.stream.StreamOutput streamOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.writeTo(streamOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest6);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.parent("delete {[hi!][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest6.parent("");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException11 = deleteRequest10.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure13 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}", (java.lang.Throwable) actionRequestValidationException11, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure15 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "", (java.lang.Throwable) actionRequestValidationException11, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure17 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}", (java.lang.Throwable) actionRequestValidationException11, "delete {[delete {[hi!][delete {[][hi!][hi!]}][hi!]}][hi!][null]}");
        java.lang.String str18 = shardFailure17.reason;
        java.lang.Throwable throwable19 = shardFailure17.cause;
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(actionRequestValidationException11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}" + "'", str18, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}");
        org.junit.Assert.assertNotNull(throwable19);
        org.junit.Assert.assertEquals(throwable19.getLocalizedMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable19.getMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable19.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting10 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId21 = deleteRequest20.getParentTask();
        org.elasticsearch.tasks.Task task22 = deleteRequest13.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId21);
        java.lang.String str23 = deleteRequest13.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType26 = deleteRequest25.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest13.versionType(versionType26);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException28 = deleteRequest27.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure30 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting10, "", (java.lang.Throwable) actionRequestValidationException28, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure32 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "delete {[hi!][null][null]}", (java.lang.Throwable) actionRequestValidationException28, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure34 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "", (java.lang.Throwable) actionRequestValidationException28, "delete {[null][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure36 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[][hi!][hi!]}", (java.lang.Throwable) actionRequestValidationException28, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure38 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[null][null][null]}", (java.lang.Throwable) actionRequestValidationException28, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure40 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[delete {[hi!][null][null]}][null][null]}", (java.lang.Throwable) actionRequestValidationException28, "delete {[][hi!][hi!]}");
        org.junit.Assert.assertNotNull(taskId21);
        org.junit.Assert.assertNotNull(task22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "delete {[hi!][null][null]}" + "'", str23, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType26);
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertNotNull(actionRequestValidationException28);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[hi!][null][null]}][null][null]}");
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType3 = deleteRequest2.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.versionType(versionType3);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.parent("delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        boolean boolean7 = deleteRequest4.refresh();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel8 = deleteRequest4.consistencyLevel();
        long long9 = deleteRequest4.seqNo();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest4.timeout("delete {[delete {[][hi!][hi!]}][null][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[delete {[][hi!][hi!]}][null][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel8 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel8.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        deleteRequest5.seqNo((-1L));
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[null][][null]}", deleteRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        long long1 = deleteRequest0.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("delete {[][hi!][hi!]}");
        java.lang.String str4 = deleteRequest3.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.refresh(false);
        long long7 = deleteRequest6.primaryTerm();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][hi!]}", throwable2, "delete {[delete {[null][null][hi!]}][delete {[null][null][hi!]}][]}");
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        java.lang.String str2 = deleteRequest1.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}", "hi!", "");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = deleteRequest6.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest1.consistencyLevel(writeConsistencyLevel7);
        org.elasticsearch.common.unit.TimeValue timeValue9 = deleteRequest8.timeout();
        java.lang.String str10 = deleteRequest8.parent();
        java.lang.String str11 = deleteRequest8.index();
        org.elasticsearch.common.unit.TimeValue timeValue12 = deleteRequest8.timeout();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest8.writeTo(streamOutput13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel7 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel7.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(timeValue9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(timeValue12);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        java.lang.String str4 = deleteRequest3.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.type("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.parent("delete {[hi!][null][null]}");
        org.elasticsearch.index.VersionType versionType10 = deleteRequest7.versionType();
        org.elasticsearch.index.VersionType versionType11 = deleteRequest7.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest3.versionType(versionType11);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[][][delete {[][hi!][hi!]}]}", deleteRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(versionType10);
        org.junit.Assert.assertNotNull(versionType11);
        org.junit.Assert.assertNotNull(deleteRequest12);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        boolean boolean4 = deleteRequest3.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.type("delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        boolean boolean7 = deleteRequest3.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.parent("hi!");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException10 = deleteRequest3.validate();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest3.timeout("delete {[null][delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[null][delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNull(actionRequestValidationException10);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        deleteRequest3.seqNo((-1L));
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.version((long) (byte) 1);
        org.elasticsearch.common.unit.TimeValue timeValue10 = deleteRequest9.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest9.index("");
        java.lang.String str13 = deleteRequest9.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest9.id("delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(timeValue10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(deleteRequest15);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        deleteRequest3.seqNo((-1L));
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.version((long) (byte) 1);
        org.elasticsearch.common.unit.TimeValue timeValue10 = deleteRequest9.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest9.index("");
        java.lang.Class<?> wildcardClass13 = deleteRequest9.getClass();
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(timeValue10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][hi!][hi!]}", "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][hi!]}", "delete {[delete {[][hi!][hi!]}][null][null]}");
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.parent("delete {[hi!][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest6.parent("");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException11 = deleteRequest10.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure13 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "", (java.lang.Throwable) actionRequestValidationException11, "delete {[hi!][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure15 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "hi!", (java.lang.Throwable) actionRequestValidationException11, "delete {[null][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure17 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[][][delete {[][hi!][hi!]}]}", (java.lang.Throwable) actionRequestValidationException11, "delete {[delete {[null][null][hi!]}][hi!][hi!]}");
        java.lang.String str18 = shardFailure17.indexUUID;
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(actionRequestValidationException11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "delete {[delete {[null][null][hi!]}][hi!][hi!]}" + "'", str18, "delete {[delete {[null][null][hi!]}][hi!][hi!]}");
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        deleteRequest1.primaryTerm(10L);
        java.lang.String str4 = deleteRequest1.toString();
        java.lang.String str5 = deleteRequest1.getDescription();
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest1.setShardId(shardId6);
        java.lang.String str8 = deleteRequest7.index();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[hi!][null][null]}" + "'", str4, "delete {[hi!][null][null]}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "delete {[hi!][null][null]}" + "'", str5, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][hi!][hi!]}", "delete {[][hi!][hi!]}", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.id("delete {[delete {[hi!][delete {[][hi!][hi!]}][hi!]}][hi!][null]}");
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.index.VersionType versionType1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.versionType(versionType1);
        deleteRequest0.primaryTerm((long) 1);
        org.elasticsearch.common.unit.TimeValue timeValue5 = deleteRequest0.timeout();
        java.lang.String str6 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest0.version(1L);
        long long9 = deleteRequest0.primaryTerm();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(timeValue5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        long long1 = deleteRequest0.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.consistencyLevel(writeConsistencyLevel2);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType6 = deleteRequest5.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId11 = deleteRequest10.getParentTask();
        deleteRequest5.setParentTask(taskId11);
        deleteRequest0.setParentTask(taskId11);
        org.elasticsearch.index.shard.ShardId shardId14 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest0.setShardId(shardId14);
        deleteRequest0.primaryTerm((long) (-1));
        org.elasticsearch.index.shard.IndexShard indexShard18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete19 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest0, indexShard18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(versionType6);
        org.junit.Assert.assertNotNull(taskId11);
        org.junit.Assert.assertNotNull(deleteRequest15);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        long long1 = deleteRequest0.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("delete {[][hi!][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.index.VersionType versionType5 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.versionType(versionType5);
        deleteRequest4.primaryTerm((long) 1);
        org.elasticsearch.common.unit.TimeValue timeValue9 = deleteRequest4.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest0.timeout(timeValue9);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.version((long) (short) 0);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        deleteRequest16.seqNo((-1L));
        java.lang.String str19 = deleteRequest16.toString();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel20 = deleteRequest16.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest10.consistencyLevel(writeConsistencyLevel20);
        java.lang.String str22 = deleteRequest21.id();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput23 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest21.writeTo(streamOutput23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(timeValue9);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "delete {[hi!][delete {[][hi!][hi!]}][hi!]}" + "'", str19, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel20 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel20.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "delete {[][hi!][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.type("");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException6 = deleteRequest3.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.refresh(false);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest8.writeTo(streamOutput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(actionRequestValidationException6);
        org.junit.Assert.assertNotNull(deleteRequest8);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.parent("delete {[hi!][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.parent("");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException5 = deleteRequest4.validate();
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
        org.junit.Assert.assertNotNull(actionRequestValidationException5);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting10 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting12 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting14 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting16 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId27 = deleteRequest26.getParentTask();
        org.elasticsearch.tasks.Task task28 = deleteRequest19.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId27);
        java.lang.String str29 = deleteRequest19.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType32 = deleteRequest31.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest19.versionType(versionType32);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException34 = deleteRequest33.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure36 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting16, "", (java.lang.Throwable) actionRequestValidationException34, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure38 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting14, "delete {[hi!][null][null]}", (java.lang.Throwable) actionRequestValidationException34, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure40 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting12, "hi!", (java.lang.Throwable) actionRequestValidationException34, "delete {[hi!][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure42 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting10, "", (java.lang.Throwable) actionRequestValidationException34, "delete {[hi!][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure44 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "delete {[hi!][null][null]}", (java.lang.Throwable) actionRequestValidationException34, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure46 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "delete {[null][null][null]}", (java.lang.Throwable) actionRequestValidationException34, "delete {[hi!][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure48 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}", (java.lang.Throwable) actionRequestValidationException34, "delete {[][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure50 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}", (java.lang.Throwable) actionRequestValidationException34, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure52 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[][][delete {[][hi!][hi!]}]}", (java.lang.Throwable) actionRequestValidationException34, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(taskId27);
        org.junit.Assert.assertNotNull(task28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "delete {[hi!][null][null]}" + "'", str29, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType32);
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertNotNull(actionRequestValidationException34);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        deleteRequest3.seqNo((-1L));
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.version((long) (byte) 1);
        org.elasticsearch.common.unit.TimeValue timeValue10 = deleteRequest9.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest9.index("");
        java.lang.String str13 = deleteRequest9.parent();
        java.lang.String str14 = deleteRequest9.routing();
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(timeValue10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        long long5 = deleteRequest4.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest4.parent("delete {[][hi!][hi!]}");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException8 = deleteRequest7.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure10 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}", (java.lang.Throwable) actionRequestValidationException8, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure12 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[delete {[][hi!][hi!]}][][delete {[][hi!][hi!]}]}", (java.lang.Throwable) actionRequestValidationException8, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][hi!]}");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(actionRequestValidationException8);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.index.VersionType versionType1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.versionType(versionType1);
        deleteRequest0.primaryTerm((long) 1);
        org.elasticsearch.common.unit.TimeValue timeValue5 = deleteRequest0.timeout();
        java.lang.String str6 = deleteRequest0.id();
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest0.setShardId(shardId7);
        org.elasticsearch.index.shard.ShardId shardId9 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest0.setShardId(shardId9);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.version((long) (short) 1);
        org.elasticsearch.index.shard.IndexShard indexShard13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete14 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest10, indexShard13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(timeValue5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        java.lang.String str4 = deleteRequest3.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.type("");
        org.elasticsearch.common.transport.TransportAddress transportAddress7 = deleteRequest3.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.refresh(true);
        boolean boolean10 = deleteRequest9.refresh();
        org.elasticsearch.common.transport.TransportAddress transportAddress11 = deleteRequest9.remoteAddress();
        java.lang.String str12 = deleteRequest9.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[delete {[hi!][delete {[][hi!][hi!]}][hi!]}][hi!][null]}", deleteRequest9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNull(transportAddress7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(transportAddress11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId19 = deleteRequest18.getParentTask();
        org.elasticsearch.tasks.Task task20 = deleteRequest11.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId19);
        java.lang.String str21 = deleteRequest11.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType24 = deleteRequest23.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest11.versionType(versionType24);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException26 = deleteRequest25.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure28 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "", (java.lang.Throwable) actionRequestValidationException26, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure30 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "delete {[hi!][null][null]}", (java.lang.Throwable) actionRequestValidationException26, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure32 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "hi!", (java.lang.Throwable) actionRequestValidationException26, "delete {[hi!][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure34 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "hi!", (java.lang.Throwable) actionRequestValidationException26, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure36 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[][hi!][hi!]}", (java.lang.Throwable) actionRequestValidationException26, "hi!");
        java.lang.String str37 = shardFailure36.reason;
        java.lang.String str38 = shardFailure36.indexUUID;
        org.junit.Assert.assertNotNull(taskId19);
        org.junit.Assert.assertNotNull(task20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "delete {[hi!][null][null]}" + "'", str21, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType24);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(actionRequestValidationException26);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "delete {[][hi!][hi!]}" + "'", str37, "delete {[][hi!][hi!]}");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.version((long) (byte) -1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.version(0L);
        deleteRequest4.setParentTask("delete {[][hi!][hi!]}", (long) '#');
        java.lang.String str8 = deleteRequest4.toString();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "delete {[null][null][null]}" + "'", str8, "delete {[null][null][null]}");
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue6 = deleteRequest5.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest5.index("");
        org.elasticsearch.common.unit.TimeValue timeValue9 = deleteRequest5.timeout();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[null][null][null]}", deleteRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(timeValue9);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][hi!][hi!]}", "", "delete {[][hi!][hi!]}");
        org.elasticsearch.index.VersionType versionType4 = deleteRequest3.versionType();
        boolean boolean5 = deleteRequest3.refresh();
        org.elasticsearch.common.io.stream.StreamInput streamInput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.readFrom(streamInput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        long long1 = deleteRequest0.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.consistencyLevel(writeConsistencyLevel2);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType6 = deleteRequest5.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId11 = deleteRequest10.getParentTask();
        deleteRequest5.setParentTask(taskId11);
        deleteRequest0.setParentTask(taskId11);
        org.elasticsearch.index.shard.ShardId shardId14 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest0.setShardId(shardId14);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId25 = deleteRequest24.getParentTask();
        org.elasticsearch.tasks.Task task26 = deleteRequest17.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId25);
        java.lang.String str27 = deleteRequest17.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType30 = deleteRequest29.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest17.versionType(versionType30);
        java.lang.String str32 = deleteRequest31.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = deleteRequest31.routing("hi!");
        java.lang.String str35 = deleteRequest34.index();
        long long36 = deleteRequest34.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest38 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest40 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        deleteRequest40.primaryTerm(10L);
        java.lang.String str43 = deleteRequest40.toString();
        java.lang.String str44 = deleteRequest40.getDescription();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel45 = deleteRequest40.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest46 = deleteRequest38.consistencyLevel(writeConsistencyLevel45);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest47 = deleteRequest34.consistencyLevel(writeConsistencyLevel45);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest48 = deleteRequest0.consistencyLevel(writeConsistencyLevel45);
        org.elasticsearch.index.shard.ShardId shardId49 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest50 = deleteRequest0.setShardId(shardId49);
        org.elasticsearch.common.io.stream.StreamInput streamInput51 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.readFrom(streamInput51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(versionType6);
        org.junit.Assert.assertNotNull(taskId11);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(taskId25);
        org.junit.Assert.assertNotNull(task26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "delete {[hi!][null][null]}" + "'", str27, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType30);
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "delete {[hi!][null][null]}" + "'", str32, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "delete {[hi!][null][null]}" + "'", str43, "delete {[hi!][null][null]}");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "delete {[hi!][null][null]}" + "'", str44, "delete {[hi!][null][null]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel45 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel45.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest46);
        org.junit.Assert.assertNotNull(deleteRequest47);
        org.junit.Assert.assertNotNull(deleteRequest48);
        org.junit.Assert.assertNotNull(deleteRequest50);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][hi!][hi!]}", "", "delete {[][hi!][hi!]}");
        org.elasticsearch.tasks.TaskId taskId4 = deleteRequest3.getParentTask();
        org.elasticsearch.action.support.IndicesOptions indicesOptions5 = deleteRequest3.indicesOptions();
        java.lang.String str6 = deleteRequest3.parent();
        org.elasticsearch.common.transport.TransportAddress transportAddress7 = null;
        deleteRequest3.remoteAddress(transportAddress7);
        org.junit.Assert.assertNotNull(taskId4);
        org.junit.Assert.assertNotNull(indicesOptions5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        long long1 = deleteRequest0.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.consistencyLevel(writeConsistencyLevel2);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.version((long) (short) 0);
        boolean boolean6 = deleteRequest0.getShouldPersistResult();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest0.timeout("delete {[hi!][null][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[hi!][null][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        deleteRequest3.seqNo((-1L));
        java.lang.String str6 = deleteRequest3.toString();
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.setShardId(shardId7);
        deleteRequest8.primaryTerm((-1L));
        org.elasticsearch.tasks.TaskId taskId11 = deleteRequest8.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest8.version((long) 'a');
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType16 = deleteRequest15.versionType();
        java.lang.String str17 = deleteRequest15.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest18.version((long) (byte) 10);
        org.elasticsearch.tasks.TaskId taskId21 = deleteRequest18.getParentTask();
        deleteRequest15.setParentTask(taskId21);
        org.elasticsearch.index.VersionType versionType23 = deleteRequest15.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest8.versionType(versionType23);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "delete {[hi!][delete {[][hi!][hi!]}][hi!]}" + "'", str6, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(taskId11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(versionType16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(taskId21);
        org.junit.Assert.assertNotNull(versionType23);
        org.junit.Assert.assertNotNull(deleteRequest24);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        boolean boolean1 = deleteRequest0.getShouldPersistResult();
        java.lang.Class<?> wildcardClass2 = deleteRequest0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest3.timeout();
        java.lang.String[] strArray5 = deleteRequest3.indices();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.writeTo(streamOutput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        long long3 = deleteRequest2.seqNo();
        boolean boolean4 = deleteRequest2.getShouldPersistResult();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[delete {[hi!][delete {[][hi!][hi!]}][hi!]}][hi!][null]}", deleteRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][null][null]}", "delete {[hi!][null][null]}", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue8 = deleteRequest7.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.timeout(timeValue8);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest3.routing("");
        java.lang.String str12 = deleteRequest11.toString();
        java.lang.String str13 = deleteRequest11.getDescription();
        org.elasticsearch.index.shard.IndexShard indexShard14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete15 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest11, indexShard14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}" + "'", str12, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}" + "'", str13, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}");
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][hi!][hi!]}", "", "delete {[][hi!][hi!]}");
        org.elasticsearch.tasks.TaskId taskId4 = deleteRequest3.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.index("delete {[null][null][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.refresh(false);
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest8.setParentTask("", (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 0 length nodeIds are reserved for EMPTY_TASK_ID and are otherwise invalid.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(taskId4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest8);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "delete {[hi!][delete {[][hi!][hi!]}][hi!]}", "hi!");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = deleteRequest3.consistencyLevel();
        java.lang.Class<?> wildcardClass5 = deleteRequest3.getClass();
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel4 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel4.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.index.VersionType versionType1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.versionType(versionType1);
        deleteRequest0.primaryTerm((long) 1);
        org.elasticsearch.common.unit.TimeValue timeValue5 = deleteRequest0.timeout();
        java.lang.String str6 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest0.index("delete {[][hi!][hi!]}");
        org.elasticsearch.index.shard.ShardId shardId9 = deleteRequest8.shardId();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(timeValue5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNull(shardId9);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.index.VersionType versionType3 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.versionType(versionType3);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.routing("delete {[hi!][null][null]}");
        deleteRequest4.primaryTerm((long) (-1));
        boolean boolean9 = deleteRequest4.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest4.version((long) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[delete {[][hi!][hi!]}][null][null]}", deleteRequest11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(deleteRequest11);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.parent("delete {[hi!][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest4.parent("");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException9 = deleteRequest8.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure11 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[delete {[hi!][null][null]}][null][null]}", (java.lang.Throwable) actionRequestValidationException9, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure13 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][hi!]}", (java.lang.Throwable) actionRequestValidationException9, "delete {[delete {[hi!][delete {[][hi!][hi!]}][hi!]}][hi!][null]}");
        java.lang.String str14 = shardFailure13.reason;
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(actionRequestValidationException9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][hi!]}" + "'", str14, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][hi!]}");
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "delete {[hi!][null][null]}", "");
        org.elasticsearch.action.support.IndicesOptions indicesOptions4 = deleteRequest3.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.index("");
        org.elasticsearch.index.shard.IndexShard indexShard7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete8 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest6, indexShard7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indicesOptions4);
        org.junit.Assert.assertNotNull(deleteRequest6);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId9 = deleteRequest8.getParentTask();
        org.elasticsearch.tasks.Task task10 = deleteRequest1.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId9);
        java.lang.String str11 = deleteRequest1.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType14 = deleteRequest13.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest1.versionType(versionType14);
        org.elasticsearch.index.shard.ShardId shardId16 = deleteRequest1.shardId();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId26 = deleteRequest25.getParentTask();
        org.elasticsearch.tasks.Task task27 = deleteRequest18.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId26);
        java.lang.String str28 = deleteRequest18.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType31 = deleteRequest30.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest18.versionType(versionType31);
        org.elasticsearch.tasks.TaskId taskId33 = deleteRequest32.getParentTask();
        deleteRequest1.setParentTask(taskId33);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest36 = deleteRequest1.routing("delete {[null][null][null]}");
        java.lang.Class<?> wildcardClass37 = deleteRequest36.getClass();
        org.junit.Assert.assertNotNull(taskId9);
        org.junit.Assert.assertNotNull(task10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[hi!][null][null]}" + "'", str11, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType14);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNull(shardId16);
        org.junit.Assert.assertNotNull(taskId26);
        org.junit.Assert.assertNotNull(task27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "delete {[hi!][null][null]}" + "'", str28, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType31);
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertNotNull(taskId33);
        org.junit.Assert.assertNotNull(deleteRequest36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", "delete {[delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][][]}");
        org.elasticsearch.tasks.TaskId taskId4 = null;
        deleteRequest3.setParentTask(taskId4);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.index("delete {[delete {[hi!][null][null]}][null][null]}");
        long long8 = deleteRequest3.primaryTerm();
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "", throwable2, "");
        java.lang.String str5 = shardFailure4.reason;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = shardFailure4.routing;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(shardRouting6);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        long long1 = deleteRequest0.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("delete {[][hi!][hi!]}");
        java.lang.String str4 = deleteRequest3.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.refresh(false);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.writeTo(streamOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(deleteRequest6);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.index.VersionType versionType1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.versionType(versionType1);
        deleteRequest0.primaryTerm((long) 1);
        org.elasticsearch.common.unit.TimeValue timeValue5 = deleteRequest0.timeout();
        java.lang.String str6 = deleteRequest0.id();
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest0.setShardId(shardId7);
        org.elasticsearch.index.shard.ShardId shardId9 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest0.setShardId(shardId9);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest();
        long long12 = deleteRequest11.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel13 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest11.consistencyLevel(writeConsistencyLevel13);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        java.lang.String str17 = deleteRequest16.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest16.type("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest19.routing("delete {[][hi!][hi!]}");
        org.elasticsearch.tasks.TaskId taskId22 = deleteRequest19.getParentTask();
        deleteRequest14.setParentTask(taskId22);
        org.elasticsearch.common.unit.TimeValue timeValue24 = deleteRequest14.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest0.timeout(timeValue24);
        org.elasticsearch.tasks.TaskId taskId26 = deleteRequest25.getParentTask();
        java.lang.String[] strArray27 = deleteRequest25.indices();
        long long28 = deleteRequest25.seqNo();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(timeValue5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(taskId22);
        org.junit.Assert.assertNotNull(timeValue24);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(taskId26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.parent("delete {[hi!][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest8.parent("");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException13 = deleteRequest12.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure15 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "", (java.lang.Throwable) actionRequestValidationException13, "delete {[hi!][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure17 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "", (java.lang.Throwable) actionRequestValidationException13, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure19 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "", (java.lang.Throwable) actionRequestValidationException13, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure21 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "hi!", (java.lang.Throwable) actionRequestValidationException13, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting22 = shardFailure21.routing;
        java.lang.String str23 = shardFailure21.indexUUID;
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(actionRequestValidationException13);
        org.junit.Assert.assertNull(shardRouting22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "delete {[hi!][delete {[][hi!][hi!]}][hi!]}" + "'", str23, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][null][null]}", "delete {[hi!][null][null]}", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue8 = deleteRequest7.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.timeout(timeValue8);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        java.lang.String str19 = deleteRequest18.getDescription();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel20 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest18.consistencyLevel(writeConsistencyLevel20);
        long long22 = deleteRequest18.version();
        org.elasticsearch.tasks.TaskId taskId23 = deleteRequest18.getParentTask();
        org.elasticsearch.tasks.Task task24 = deleteRequest11.createTask((long) (byte) 0, "", "", taskId23);
        org.elasticsearch.index.shard.ShardId shardId25 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest11.setShardId(shardId25);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = new org.elasticsearch.action.delete.DeleteRequest();
        long long28 = deleteRequest27.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel29 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest27.consistencyLevel(writeConsistencyLevel29);
        org.elasticsearch.index.shard.ShardId shardId31 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest30.setShardId(shardId31);
        org.elasticsearch.tasks.TaskId taskId33 = deleteRequest32.getParentTask();
        deleteRequest26.setParentTask(taskId33);
        java.lang.Class<?> wildcardClass35 = taskId33.getClass();
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "delete {[][hi!][hi!]}" + "'", str19, "delete {[][hi!][hi!]}");
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-3L) + "'", long22 == (-3L));
        org.junit.Assert.assertNotNull(taskId23);
        org.junit.Assert.assertNotNull(task24);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertNotNull(taskId33);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId9 = deleteRequest8.getParentTask();
        org.elasticsearch.tasks.Task task10 = deleteRequest1.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId9);
        java.lang.String str11 = deleteRequest1.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType14 = deleteRequest13.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest1.versionType(versionType14);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId25 = deleteRequest24.getParentTask();
        org.elasticsearch.tasks.Task task26 = deleteRequest17.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId25);
        java.lang.String str27 = deleteRequest17.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType30 = deleteRequest29.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest17.versionType(versionType30);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest15.versionType(versionType30);
        deleteRequest32.primaryTerm((long) 100);
        org.elasticsearch.common.transport.TransportAddress transportAddress35 = deleteRequest32.remoteAddress();
        org.junit.Assert.assertNotNull(taskId9);
        org.junit.Assert.assertNotNull(task10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[hi!][null][null]}" + "'", str11, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType14);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(taskId25);
        org.junit.Assert.assertNotNull(task26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "delete {[hi!][null][null]}" + "'", str27, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType30);
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertNull(transportAddress35);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][null][null]}", "delete {[hi!][null][null]}", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue8 = deleteRequest7.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.timeout(timeValue8);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        java.lang.String str19 = deleteRequest18.getDescription();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel20 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest18.consistencyLevel(writeConsistencyLevel20);
        long long22 = deleteRequest18.version();
        org.elasticsearch.tasks.TaskId taskId23 = deleteRequest18.getParentTask();
        org.elasticsearch.tasks.Task task24 = deleteRequest11.createTask((long) (byte) 0, "", "", taskId23);
        org.elasticsearch.index.shard.ShardId shardId25 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest11.setShardId(shardId25);
        org.elasticsearch.tasks.TaskId taskId27 = deleteRequest11.getParentTask();
        org.elasticsearch.common.unit.TimeValue timeValue28 = deleteRequest11.timeout();
        java.lang.String str29 = deleteRequest11.type();
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "delete {[][hi!][hi!]}" + "'", str19, "delete {[][hi!][hi!]}");
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-3L) + "'", long22 == (-3L));
        org.junit.Assert.assertNotNull(taskId23);
        org.junit.Assert.assertNotNull(task24);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNotNull(taskId27);
        org.junit.Assert.assertNotNull(timeValue28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "delete {[hi!][null][null]}" + "'", str29, "delete {[hi!][null][null]}");
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        long long1 = deleteRequest0.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("delete {[][hi!][hi!]}");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = deleteRequest0.consistencyLevel();
        org.elasticsearch.index.shard.IndexShard indexShard5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete6 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest0, indexShard5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel4 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel4.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][null][null]}", throwable2, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId11 = deleteRequest10.getParentTask();
        org.elasticsearch.tasks.Task task12 = deleteRequest3.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId11);
        java.lang.String str13 = deleteRequest3.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType16 = deleteRequest15.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest3.versionType(versionType16);
        org.elasticsearch.index.shard.ShardId shardId18 = deleteRequest3.shardId();
        java.lang.String str19 = deleteRequest3.parent();
        java.lang.String[] strArray20 = deleteRequest3.indices();
        long long21 = deleteRequest3.seqNo();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}", deleteRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(taskId11);
        org.junit.Assert.assertNotNull(task12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "delete {[hi!][null][null]}" + "'", str13, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType16);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNull(shardId18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.version((long) (byte) 10);
        long long3 = deleteRequest0.version();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = deleteRequest0.consistencyLevel();
        java.lang.Class<?> wildcardClass5 = writeConsistencyLevel4.getClass();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel4 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel4.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId15 = deleteRequest14.getParentTask();
        org.elasticsearch.tasks.Task task16 = deleteRequest7.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId15);
        java.lang.String str17 = deleteRequest7.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType20 = deleteRequest19.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest7.versionType(versionType20);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException22 = deleteRequest21.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure24 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}", (java.lang.Throwable) actionRequestValidationException22, "delete {[][hi!][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure26 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "", (java.lang.Throwable) actionRequestValidationException22, "delete {[][hi!][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure28 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[null][null][null]}", (java.lang.Throwable) actionRequestValidationException22, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}");
        java.lang.Throwable throwable29 = shardFailure28.cause;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting30 = shardFailure28.routing;
        org.junit.Assert.assertNotNull(taskId15);
        org.junit.Assert.assertNotNull(task16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "delete {[hi!][null][null]}" + "'", str17, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType20);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(actionRequestValidationException22);
        org.junit.Assert.assertNotNull(throwable29);
        org.junit.Assert.assertEquals(throwable29.getLocalizedMessage(), "Validation Failed: 1: type is missing;2: id is missing;");
        org.junit.Assert.assertEquals(throwable29.getMessage(), "Validation Failed: 1: type is missing;2: id is missing;");
        org.junit.Assert.assertEquals(throwable29.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: type is missing;2: id is missing;");
        org.junit.Assert.assertNull(shardRouting30);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId19 = deleteRequest18.getParentTask();
        org.elasticsearch.tasks.Task task20 = deleteRequest11.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId19);
        java.lang.String str21 = deleteRequest11.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType24 = deleteRequest23.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest11.versionType(versionType24);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException26 = deleteRequest25.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure28 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "", (java.lang.Throwable) actionRequestValidationException26, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure30 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "delete {[hi!][null][null]}", (java.lang.Throwable) actionRequestValidationException26, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure32 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "hi!", (java.lang.Throwable) actionRequestValidationException26, "delete {[hi!][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure34 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "", (java.lang.Throwable) actionRequestValidationException26, "delete {[hi!][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure36 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[][hi!][hi!]}", (java.lang.Throwable) actionRequestValidationException26, "delete {[][hi!][hi!]}");
        java.lang.Class<?> wildcardClass37 = shardFailure36.getClass();
        org.junit.Assert.assertNotNull(taskId19);
        org.junit.Assert.assertNotNull(task20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "delete {[hi!][null][null]}" + "'", str21, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType24);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(actionRequestValidationException26);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.index.VersionType versionType1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.versionType(versionType1);
        deleteRequest0.primaryTerm((long) 1);
        org.elasticsearch.common.unit.TimeValue timeValue5 = deleteRequest0.timeout();
        java.lang.String str6 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest0.version(1L);
        deleteRequest0.setParentTask("delete {[hi!][delete {[][hi!][hi!]}][hi!]}", (long) (short) 100);
        org.elasticsearch.index.VersionType versionType12 = deleteRequest0.versionType();
        deleteRequest0.primaryTerm((long) 100);
        java.lang.String str15 = deleteRequest0.id();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(timeValue5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNull(versionType12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting10 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting12 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest14.parent("delete {[hi!][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest14.parent("");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException19 = deleteRequest18.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure21 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting12, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}", (java.lang.Throwable) actionRequestValidationException19, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure23 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting10, "delete {[hi!][null][null]}", (java.lang.Throwable) actionRequestValidationException19, "delete {[null][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure25 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}", (java.lang.Throwable) actionRequestValidationException19, "delete {[hi!][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure27 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "delete {[null][null][hi!]}", (java.lang.Throwable) actionRequestValidationException19, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure29 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[][null][null]}", (java.lang.Throwable) actionRequestValidationException19, "delete {[null][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure31 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[null][null][hi!]}", (java.lang.Throwable) actionRequestValidationException19, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure33 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[delete {[hi!][delete {[][hi!][hi!]}][hi!]}][hi!][null]}", (java.lang.Throwable) actionRequestValidationException19, "");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting34 = shardFailure33.routing;
        java.lang.Throwable throwable35 = shardFailure33.cause;
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(actionRequestValidationException19);
        org.junit.Assert.assertNull(shardRouting34);
        org.junit.Assert.assertNotNull(throwable35);
        org.junit.Assert.assertEquals(throwable35.getLocalizedMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable35.getMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable35.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        java.lang.String str2 = deleteRequest1.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest1.type("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.routing("delete {[][hi!][hi!]}");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = deleteRequest4.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        java.lang.String str15 = deleteRequest14.getDescription();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel16 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest14.consistencyLevel(writeConsistencyLevel16);
        long long18 = deleteRequest14.version();
        org.elasticsearch.tasks.TaskId taskId19 = deleteRequest14.getParentTask();
        org.elasticsearch.tasks.Task task20 = deleteRequest4.createTask(10L, "hi!", "", taskId19);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest22.index("delete {[][hi!][hi!]}");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel25 = deleteRequest22.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest4.consistencyLevel(writeConsistencyLevel25);
        org.elasticsearch.index.shard.IndexShard indexShard27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete28 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest4, indexShard27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel7 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel7.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "delete {[][hi!][hi!]}" + "'", str15, "delete {[][hi!][hi!]}");
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-3L) + "'", long18 == (-3L));
        org.junit.Assert.assertNotNull(taskId19);
        org.junit.Assert.assertNotNull(task20);
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel25 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel25.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest26);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.parent("delete {[hi!][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.parent("");
        org.elasticsearch.common.transport.TransportAddress transportAddress5 = deleteRequest4.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][null][null]}", "delete {[hi!][null][null]}", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue14 = deleteRequest13.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest9.timeout(timeValue14);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest9.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        java.lang.String str25 = deleteRequest24.getDescription();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel26 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest24.consistencyLevel(writeConsistencyLevel26);
        long long28 = deleteRequest24.version();
        org.elasticsearch.tasks.TaskId taskId29 = deleteRequest24.getParentTask();
        org.elasticsearch.tasks.Task task30 = deleteRequest17.createTask((long) (byte) 0, "", "", taskId29);
        deleteRequest4.setParentTask(taskId29);
        long long32 = deleteRequest4.primaryTerm();
        java.lang.String str33 = deleteRequest4.toString();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNull(transportAddress5);
        org.junit.Assert.assertNotNull(timeValue14);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "delete {[][hi!][hi!]}" + "'", str25, "delete {[][hi!][hi!]}");
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-3L) + "'", long28 == (-3L));
        org.junit.Assert.assertNotNull(taskId29);
        org.junit.Assert.assertNotNull(task30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "delete {[null][null][null]}" + "'", str33, "delete {[null][null][null]}");
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        deleteRequest1.primaryTerm(10L);
        java.lang.String str4 = deleteRequest1.toString();
        java.lang.String str5 = deleteRequest1.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest1.version((-3L));
        deleteRequest1.setParentTask("delete {[null][null][hi!]}", (long) (short) 100);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest1.routing("delete {[delete {[][hi!][hi!]}][][delete {[][hi!][hi!]}]}");
        org.elasticsearch.index.shard.IndexShard indexShard13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete14 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest12, indexShard13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[hi!][null][null]}" + "'", str4, "delete {[hi!][null][null]}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "delete {[hi!][null][null]}" + "'", str5, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest12);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.index.VersionType versionType1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.versionType(versionType1);
        deleteRequest0.primaryTerm((long) 1);
        org.elasticsearch.common.transport.TransportAddress transportAddress5 = deleteRequest0.remoteAddress();
        long long6 = deleteRequest0.seqNo();
        java.lang.String str7 = deleteRequest0.routing();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(transportAddress5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        deleteRequest3.seqNo((-1L));
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.refresh(false);
        boolean boolean8 = deleteRequest7.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest();
        long long10 = deleteRequest9.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest9.parent("delete {[][hi!][hi!]}");
        deleteRequest12.seqNo((long) 100);
        org.elasticsearch.common.unit.TimeValue timeValue15 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest12.timeout(timeValue15);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest7.timeout(timeValue15);
        deleteRequest17.primaryTerm(0L);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(timeValue15);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(deleteRequest17);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", "hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("");
        java.lang.String str6 = deleteRequest5.type();
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "delete {[][hi!][hi!]}" + "'", str6, "delete {[][hi!][hi!]}");
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType3 = deleteRequest2.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.versionType(versionType3);
        long long5 = deleteRequest0.primaryTerm();
        org.elasticsearch.action.support.IndicesOptions indicesOptions6 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.index.VersionType versionType8 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.versionType(versionType8);
        deleteRequest7.primaryTerm((long) 1);
        org.elasticsearch.common.unit.TimeValue timeValue12 = deleteRequest7.timeout();
        java.lang.String str13 = deleteRequest7.id();
        org.elasticsearch.common.unit.TimeValue timeValue14 = deleteRequest7.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest0.timeout(timeValue14);
        org.elasticsearch.common.io.stream.StreamInput streamInput16 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.readFrom(streamInput16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(indicesOptions6);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(timeValue12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(timeValue14);
        org.junit.Assert.assertNotNull(deleteRequest15);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.index.VersionType versionType1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.versionType(versionType1);
        deleteRequest0.primaryTerm((long) 1);
        org.elasticsearch.common.unit.TimeValue timeValue5 = deleteRequest0.timeout();
        java.lang.String str6 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest0.version(1L);
        org.elasticsearch.common.unit.TimeValue timeValue9 = deleteRequest8.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest8.refresh(true);
        java.lang.String str12 = deleteRequest11.index();
        deleteRequest11.seqNo((long) (short) 100);
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(timeValue5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(timeValue9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType2 = deleteRequest1.versionType();
        long long3 = deleteRequest1.primaryTerm();
        org.junit.Assert.assertNotNull(versionType2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        long long1 = deleteRequest0.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("delete {[][hi!][hi!]}");
        deleteRequest3.seqNo((long) 100);
        org.elasticsearch.common.unit.TimeValue timeValue6 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.timeout(timeValue6);
        org.elasticsearch.common.unit.TimeValue timeValue8 = deleteRequest3.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.parent("delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        java.lang.String str11 = deleteRequest3.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest3.type("delete {[delete {[hi!][delete {[][hi!][hi!]}][hi!]}][hi!][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest();
        long long15 = deleteRequest14.seqNo();
        boolean boolean16 = deleteRequest14.getShouldPersistResult();
        org.elasticsearch.common.unit.TimeValue timeValue17 = deleteRequest14.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest3.timeout(timeValue17);
        java.lang.String[] strArray19 = deleteRequest18.indices();
        org.elasticsearch.index.shard.ShardId shardId20 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest18.setShardId(shardId20);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[null][null][null]}" + "'", str11, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(timeValue17);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(deleteRequest21);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.parent("delete {[hi!][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.refresh(true);
        long long7 = deleteRequest6.seqNo();
        deleteRequest6.primaryTerm(0L);
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        long long1 = deleteRequest0.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.consistencyLevel(writeConsistencyLevel2);
        java.lang.String str4 = deleteRequest0.routing();
        java.lang.String str5 = deleteRequest0.index();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = deleteRequest0.consistencyLevel();
        org.elasticsearch.common.transport.TransportAddress transportAddress7 = deleteRequest0.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest0.type("");
        org.elasticsearch.index.shard.IndexShard indexShard10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete11 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest9, indexShard10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(writeConsistencyLevel6);
        org.junit.Assert.assertNull(transportAddress7);
        org.junit.Assert.assertNotNull(deleteRequest9);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId19 = deleteRequest18.getParentTask();
        org.elasticsearch.tasks.Task task20 = deleteRequest11.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId19);
        java.lang.String str21 = deleteRequest11.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType24 = deleteRequest23.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest11.versionType(versionType24);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException26 = deleteRequest25.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure28 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "", (java.lang.Throwable) actionRequestValidationException26, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure30 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "delete {[hi!][null][null]}", (java.lang.Throwable) actionRequestValidationException26, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure32 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[hi!][null][null]}", (java.lang.Throwable) actionRequestValidationException26, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure34 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}", (java.lang.Throwable) actionRequestValidationException26, "delete {[hi!][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure36 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[null][null][null]}", (java.lang.Throwable) actionRequestValidationException26, "");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting37 = shardFailure36.routing;
        org.junit.Assert.assertNotNull(taskId19);
        org.junit.Assert.assertNotNull(task20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "delete {[hi!][null][null]}" + "'", str21, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType24);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(actionRequestValidationException26);
        org.junit.Assert.assertNull(shardRouting37);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId19 = deleteRequest18.getParentTask();
        org.elasticsearch.tasks.Task task20 = deleteRequest11.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId19);
        java.lang.String str21 = deleteRequest11.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType24 = deleteRequest23.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest11.versionType(versionType24);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException26 = deleteRequest25.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure28 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}", (java.lang.Throwable) actionRequestValidationException26, "delete {[][hi!][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure30 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "delete {[][hi!][hi!]}", (java.lang.Throwable) actionRequestValidationException26, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure32 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[delete {[hi!][delete {[][hi!][hi!]}][hi!]}][hi!][null]}", (java.lang.Throwable) actionRequestValidationException26, "delete {[][][delete {[][hi!][hi!]}]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure34 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][][]}", (java.lang.Throwable) actionRequestValidationException26, "delete {[delete {[hi!][null][null]}][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure36 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[delete {[hi!][delete {[][hi!][hi!]}][hi!]}][hi!][null]}", (java.lang.Throwable) actionRequestValidationException26, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}");
        org.junit.Assert.assertNotNull(taskId19);
        org.junit.Assert.assertNotNull(task20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "delete {[hi!][null][null]}" + "'", str21, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType24);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(actionRequestValidationException26);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        long long1 = deleteRequest0.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.consistencyLevel(writeConsistencyLevel2);
        java.lang.String str4 = deleteRequest0.routing();
        org.elasticsearch.index.shard.ShardId shardId5 = deleteRequest0.shardId();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = shardId5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(shardId5);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting10 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting12 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId23 = deleteRequest22.getParentTask();
        org.elasticsearch.tasks.Task task24 = deleteRequest15.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId23);
        java.lang.String str25 = deleteRequest15.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType28 = deleteRequest27.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest15.versionType(versionType28);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException30 = deleteRequest29.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure32 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting12, "", (java.lang.Throwable) actionRequestValidationException30, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure34 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting10, "delete {[hi!][null][null]}", (java.lang.Throwable) actionRequestValidationException30, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure36 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "hi!", (java.lang.Throwable) actionRequestValidationException30, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure38 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "delete {[hi!][null][null]}", (java.lang.Throwable) actionRequestValidationException30, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure40 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}", (java.lang.Throwable) actionRequestValidationException30, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure42 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[][hi!][hi!]}", (java.lang.Throwable) actionRequestValidationException30, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure44 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[hi!][null][null]}", (java.lang.Throwable) actionRequestValidationException30, "delete {[null][delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][null]}");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting45 = shardFailure44.routing;
        org.junit.Assert.assertNotNull(taskId23);
        org.junit.Assert.assertNotNull(task24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "delete {[hi!][null][null]}" + "'", str25, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType28);
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertNotNull(actionRequestValidationException30);
        org.junit.Assert.assertNull(shardRouting45);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][hi!][hi!]}", "", "delete {[][hi!][hi!]}");
        org.elasticsearch.index.VersionType versionType4 = deleteRequest3.versionType();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = deleteRequest3.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        java.lang.String str8 = deleteRequest7.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest7.type("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.routing("delete {[][hi!][hi!]}");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel13 = deleteRequest10.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest3.consistencyLevel(writeConsistencyLevel13);
        java.lang.String str15 = deleteRequest14.index();
        org.junit.Assert.assertNotNull(versionType4);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel5 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel5.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel13 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel13.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "delete {[][hi!][hi!]}" + "'", str15, "delete {[][hi!][hi!]}");
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "delete {[][hi!][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.type("");
        boolean boolean6 = deleteRequest5.getShouldPersistResult();
        java.lang.String str7 = deleteRequest5.getDescription();
        org.elasticsearch.common.unit.TimeValue timeValue8 = deleteRequest5.timeout();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest5.writeTo(streamOutput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "delete {[][][delete {[][hi!][hi!]}]}" + "'", str7, "delete {[][][delete {[][hi!][hi!]}]}");
        org.junit.Assert.assertNotNull(timeValue8);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        deleteRequest3.seqNo((-1L));
        java.lang.String str6 = deleteRequest3.toString();
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.setShardId(shardId7);
        org.elasticsearch.index.shard.IndexShard indexShard9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete10 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest8, indexShard9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "delete {[hi!][delete {[][hi!][hi!]}][hi!]}" + "'", str6, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.junit.Assert.assertNotNull(deleteRequest8);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting10 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId21 = deleteRequest20.getParentTask();
        org.elasticsearch.tasks.Task task22 = deleteRequest13.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId21);
        java.lang.String str23 = deleteRequest13.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType26 = deleteRequest25.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest13.versionType(versionType26);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException28 = deleteRequest27.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure30 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting10, "", (java.lang.Throwable) actionRequestValidationException28, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure32 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "delete {[hi!][null][null]}", (java.lang.Throwable) actionRequestValidationException28, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure34 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "hi!", (java.lang.Throwable) actionRequestValidationException28, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure36 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[hi!][null][null]}", (java.lang.Throwable) actionRequestValidationException28, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure38 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}", (java.lang.Throwable) actionRequestValidationException28, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure40 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[][hi!][hi!]}", (java.lang.Throwable) actionRequestValidationException28, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        java.lang.String str41 = shardFailure40.reason;
        org.junit.Assert.assertNotNull(taskId21);
        org.junit.Assert.assertNotNull(task22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "delete {[hi!][null][null]}" + "'", str23, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType26);
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertNotNull(actionRequestValidationException28);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "delete {[][hi!][hi!]}" + "'", str41, "delete {[][hi!][hi!]}");
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.setShardId(shardId4);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[null][][null]}", deleteRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting10 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId21 = deleteRequest20.getParentTask();
        org.elasticsearch.tasks.Task task22 = deleteRequest13.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId21);
        java.lang.String str23 = deleteRequest13.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType26 = deleteRequest25.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest13.versionType(versionType26);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException28 = deleteRequest27.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure30 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting10, "", (java.lang.Throwable) actionRequestValidationException28, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure32 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "delete {[hi!][null][null]}", (java.lang.Throwable) actionRequestValidationException28, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure34 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "", (java.lang.Throwable) actionRequestValidationException28, "delete {[null][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure36 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[null][null][hi!]}", (java.lang.Throwable) actionRequestValidationException28, "delete {[null][null][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure38 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[delete {[null][null][hi!]}][delete {[null][null][hi!]}][]}", (java.lang.Throwable) actionRequestValidationException28, "delete {[delete {[hi!][null][null]}][delete {[hi!][delete {[][hi!][hi!]}][hi!]}][delete {[][hi!][hi!]}]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure40 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[delete {[][hi!][hi!]}][][delete {[][hi!][hi!]}]}", (java.lang.Throwable) actionRequestValidationException28, "delete {[delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][][]}");
        org.junit.Assert.assertNotNull(taskId21);
        org.junit.Assert.assertNotNull(task22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "delete {[hi!][null][null]}" + "'", str23, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType26);
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertNotNull(actionRequestValidationException28);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.index.VersionType versionType1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.versionType(versionType1);
        deleteRequest0.primaryTerm((long) 1);
        org.elasticsearch.common.unit.TimeValue timeValue5 = deleteRequest0.timeout();
        java.lang.String str6 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest0.version(1L);
        org.elasticsearch.common.unit.TimeValue timeValue9 = deleteRequest8.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest8.refresh(true);
        java.lang.String str12 = deleteRequest11.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.parent("delete {[hi!][null][null]}");
        org.elasticsearch.index.VersionType versionType16 = deleteRequest13.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest11.versionType(versionType16);
        java.lang.Class<?> wildcardClass18 = deleteRequest17.getClass();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(timeValue5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(timeValue9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(versionType16);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting10 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting12 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest14.parent("delete {[hi!][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest14.parent("");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException19 = deleteRequest18.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure21 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting12, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}", (java.lang.Throwable) actionRequestValidationException19, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure23 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting10, "delete {[hi!][null][null]}", (java.lang.Throwable) actionRequestValidationException19, "delete {[null][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure25 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}", (java.lang.Throwable) actionRequestValidationException19, "delete {[hi!][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure27 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "delete {[null][null][hi!]}", (java.lang.Throwable) actionRequestValidationException19, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure29 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[][null][null]}", (java.lang.Throwable) actionRequestValidationException19, "delete {[null][null][null]}");
        java.lang.Throwable throwable30 = shardFailure29.cause;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure32 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[][null][null]}", throwable30, "delete {[hi!][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure34 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[][null][null]}", throwable30, "delete {[delete {[delete {[hi!][delete {[][hi!][hi!]}][hi!]}][hi!][null]}][delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][hi!]}][delete {[delete {[null][null][hi!]}][delete {[null][null][hi!]}][]}]}");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting35 = shardFailure34.routing;
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(actionRequestValidationException19);
        org.junit.Assert.assertNotNull(throwable30);
        org.junit.Assert.assertEquals(throwable30.getLocalizedMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable30.getMessage(), "Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertEquals(throwable30.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;2: type is missing;3: id is missing;");
        org.junit.Assert.assertNull(shardRouting35);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        long long1 = deleteRequest0.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("delete {[][hi!][hi!]}");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = deleteRequest0.consistencyLevel();
        deleteRequest0.primaryTerm(1L);
        org.elasticsearch.common.transport.TransportAddress transportAddress7 = deleteRequest0.remoteAddress();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel4 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel4.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNull(transportAddress7);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId19 = deleteRequest18.getParentTask();
        org.elasticsearch.tasks.Task task20 = deleteRequest11.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId19);
        java.lang.String str21 = deleteRequest11.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType24 = deleteRequest23.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest11.versionType(versionType24);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException26 = deleteRequest25.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure28 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "", (java.lang.Throwable) actionRequestValidationException26, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure30 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "delete {[hi!][null][null]}", (java.lang.Throwable) actionRequestValidationException26, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure32 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "", (java.lang.Throwable) actionRequestValidationException26, "delete {[null][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure34 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[][hi!][hi!]}", (java.lang.Throwable) actionRequestValidationException26, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure36 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[null][null][null]}", (java.lang.Throwable) actionRequestValidationException26, "");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting37 = shardFailure36.routing;
        java.lang.String str38 = shardFailure36.indexUUID;
        org.junit.Assert.assertNotNull(taskId19);
        org.junit.Assert.assertNotNull(task20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "delete {[hi!][null][null]}" + "'", str21, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType24);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(actionRequestValidationException26);
        org.junit.Assert.assertNull(shardRouting37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.version((long) (byte) -1);
        long long3 = deleteRequest0.version();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.version((long) (short) 10);
        java.lang.String str6 = deleteRequest0.type();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        long long1 = deleteRequest0.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.consistencyLevel(writeConsistencyLevel2);
        java.lang.String str4 = deleteRequest0.routing();
        boolean boolean5 = deleteRequest0.getShouldPersistResult();
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest0.remoteAddress(transportAddress6);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        java.lang.String str13 = deleteRequest12.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.index.VersionType versionType15 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest14.versionType(versionType15);
        deleteRequest14.primaryTerm((long) 1);
        org.elasticsearch.common.unit.TimeValue timeValue19 = deleteRequest14.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest12.timeout(timeValue19);
        org.elasticsearch.index.shard.ShardId shardId21 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest12.setShardId(shardId21);
        org.elasticsearch.common.transport.TransportAddress transportAddress23 = null;
        deleteRequest22.remoteAddress(transportAddress23);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        deleteRequest28.seqNo((-1L));
        java.lang.String str31 = deleteRequest28.toString();
        org.elasticsearch.index.shard.ShardId shardId32 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest28.setShardId(shardId32);
        deleteRequest33.primaryTerm((-1L));
        org.elasticsearch.tasks.TaskId taskId36 = deleteRequest33.getParentTask();
        deleteRequest22.setParentTask(taskId36);
        org.elasticsearch.tasks.Task task38 = deleteRequest0.createTask((long) 1, "", "", taskId36);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest40 = deleteRequest0.parent("delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][hi!]}");
        org.elasticsearch.common.io.stream.StreamOutput streamOutput41 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.writeTo(streamOutput41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(timeValue19);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "delete {[hi!][delete {[][hi!][hi!]}][hi!]}" + "'", str31, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertNotNull(taskId36);
        org.junit.Assert.assertNotNull(task38);
        org.junit.Assert.assertNotNull(deleteRequest40);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType3 = deleteRequest2.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.versionType(versionType3);
        deleteRequest0.seqNo((long) 'a');
        org.elasticsearch.common.io.stream.StreamOutput streamOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.writeTo(streamOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNotNull(deleteRequest4);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        deleteRequest3.seqNo((-1L));
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.parent("delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.id("delete {[hi!][null][null]}");
        java.lang.String str12 = deleteRequest11.routing();
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][hi!][hi!]}", "", "delete {[][null][null]}");
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        java.lang.String str2 = deleteRequest1.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest1.type("");
        org.elasticsearch.common.transport.TransportAddress transportAddress5 = deleteRequest1.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest1.refresh(true);
        boolean boolean8 = deleteRequest7.refresh();
        org.elasticsearch.common.transport.TransportAddress transportAddress9 = deleteRequest7.remoteAddress();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest7.timeout("delete {[][hi!][hi!]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[][hi!][hi!]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNull(transportAddress5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(transportAddress9);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "delete {[][hi!][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType9 = deleteRequest8.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId14 = deleteRequest13.getParentTask();
        deleteRequest8.setParentTask(taskId14);
        org.elasticsearch.tasks.Task task16 = deleteRequest3.createTask(10L, "", "delete {[hi!][null][null]}", taskId14);
        java.lang.String str17 = deleteRequest3.parent();
        boolean boolean18 = deleteRequest3.refresh();
        boolean boolean19 = deleteRequest3.refresh();
        deleteRequest3.seqNo((long) (short) 10);
        org.junit.Assert.assertNotNull(versionType9);
        org.junit.Assert.assertNotNull(taskId14);
        org.junit.Assert.assertNotNull(task16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "delete {[][hi!][hi!]}");
        deleteRequest3.setParentTask("delete {[hi!][null][null]}", (long) 'a');
        java.lang.String str7 = deleteRequest3.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "delete {[][][delete {[][hi!][hi!]}]}" + "'", str7, "delete {[][][delete {[][hi!][hi!]}]}");
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        java.lang.String str2 = deleteRequest1.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest1.type("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest1.type("delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest1.type("delete {[delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.index("delete {[][][delete {[][hi!][hi!]}]}");
        org.elasticsearch.action.support.IndicesOptions indicesOptions11 = deleteRequest10.indicesOptions();
        java.lang.String[] strArray12 = deleteRequest10.indices();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(indicesOptions11);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", "delete {[delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][][]}");
        org.elasticsearch.tasks.TaskId taskId4 = null;
        deleteRequest3.setParentTask(taskId4);
        org.elasticsearch.action.support.IndicesOptions indicesOptions6 = deleteRequest3.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest();
        long long11 = deleteRequest10.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel12 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest10.consistencyLevel(writeConsistencyLevel12);
        java.lang.String str14 = deleteRequest10.routing();
        java.lang.String str15 = deleteRequest10.index();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel16 = deleteRequest10.consistencyLevel();
        org.elasticsearch.common.transport.TransportAddress transportAddress17 = deleteRequest10.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest10.type("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][hi!][hi!]}", "", "delete {[][hi!][hi!]}");
        org.elasticsearch.tasks.TaskId taskId24 = deleteRequest23.getParentTask();
        deleteRequest19.setParentTask(taskId24);
        org.elasticsearch.tasks.Task task26 = deleteRequest3.createTask((long) 0, "delete {[delete {[delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][][]}][delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][delete {[hi!][null][null]}]}", "delete {[delete {[][hi!][hi!]}][null][null]}", taskId24);
        org.junit.Assert.assertNotNull(indicesOptions6);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(writeConsistencyLevel16);
        org.junit.Assert.assertNull(transportAddress17);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(taskId24);
        org.junit.Assert.assertNotNull(task26);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        deleteRequest3.seqNo((-1L));
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.version((long) (byte) 1);
        org.elasticsearch.common.unit.TimeValue timeValue10 = deleteRequest9.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest9.index("");
        java.lang.String str13 = deleteRequest9.index();
        org.elasticsearch.index.shard.ShardId shardId14 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest9.setShardId(shardId14);
        org.elasticsearch.index.shard.IndexShard indexShard16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete17 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest15, indexShard16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(timeValue10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(deleteRequest15);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[][hi!][hi!]}][][delete {[][hi!][hi!]}]}", "delete {[delete {[hi!][delete {[][hi!][hi!]}][hi!]}][hi!][null]}", "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][hi!]}");
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][hi!][hi!]}", "", "delete {[][hi!][hi!]}");
        org.elasticsearch.index.VersionType versionType4 = deleteRequest3.versionType();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = deleteRequest3.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        java.lang.String str8 = deleteRequest7.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest7.type("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.routing("delete {[][hi!][hi!]}");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel13 = deleteRequest10.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest3.consistencyLevel(writeConsistencyLevel13);
        org.elasticsearch.common.transport.TransportAddress transportAddress15 = deleteRequest14.remoteAddress();
        long long16 = deleteRequest14.primaryTerm();
        org.junit.Assert.assertNotNull(versionType4);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel5 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel5.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel13 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel13.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNull(transportAddress15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType3 = deleteRequest2.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.versionType(versionType3);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.parent("delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.setShardId(shardId7);
        deleteRequest8.seqNo((-1L));
        java.lang.String str11 = deleteRequest8.parent();
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[hi!][delete {[][hi!][hi!]}][hi!]}" + "'", str11, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][hi!]}", "delete {[delete {[hi!][delete {[][hi!][hi!]}][hi!]}][delete {[hi!][null][null]}][delete {[delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][][]}]}", "");
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.parent("delete {[hi!][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest8.parent("");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException13 = deleteRequest12.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure15 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}", (java.lang.Throwable) actionRequestValidationException13, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure17 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "", (java.lang.Throwable) actionRequestValidationException13, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure19 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}", (java.lang.Throwable) actionRequestValidationException13, "delete {[delete {[hi!][delete {[][hi!][hi!]}][hi!]}][hi!][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure21 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}", (java.lang.Throwable) actionRequestValidationException13, "delete {[null][null][null]}");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting22 = shardFailure21.routing;
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(actionRequestValidationException13);
        org.junit.Assert.assertNull(shardRouting22);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.index.VersionType versionType1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.versionType(versionType1);
        deleteRequest0.primaryTerm((long) 1);
        org.elasticsearch.common.unit.TimeValue timeValue5 = deleteRequest0.timeout();
        java.lang.String str6 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest0.index("delete {[][hi!][hi!]}");
        java.lang.Class<?> wildcardClass9 = deleteRequest0.getClass();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(timeValue5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][null][null]}", "delete {[hi!][null][null]}", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue8 = deleteRequest7.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.timeout(timeValue8);
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = null;
        deleteRequest3.remoteAddress(transportAddress10);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        deleteRequest13.primaryTerm(10L);
        java.lang.String str16 = deleteRequest13.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType19 = deleteRequest18.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest13.versionType(versionType19);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest3.versionType(versionType19);
        org.elasticsearch.common.io.stream.StreamInput streamInput22 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.readFrom(streamInput22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "delete {[hi!][null][null]}" + "'", str16, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType19);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(deleteRequest21);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        long long1 = deleteRequest0.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.consistencyLevel(writeConsistencyLevel2);
        java.lang.String str4 = deleteRequest0.routing();
        org.elasticsearch.index.shard.ShardId shardId5 = deleteRequest0.shardId();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        long long7 = deleteRequest6.seqNo();
        boolean boolean8 = deleteRequest6.getShouldPersistResult();
        deleteRequest6.primaryTerm((long) (byte) 1);
        org.elasticsearch.common.unit.TimeValue timeValue11 = deleteRequest6.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest0.timeout(timeValue11);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest0.type("delete {[delete {[delete {[hi!][delete {[][hi!][hi!]}][hi!]}][hi!][null]}][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest0.refresh(true);
        java.lang.Class<?> wildcardClass17 = deleteRequest0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(shardId5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(timeValue11);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][hi!][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.version((long) (byte) -1);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = deleteRequest6.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.consistencyLevel(writeConsistencyLevel7);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.timeout("delete {[delete {[][null][null]}][delete {[][hi!][hi!]}][]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[delete {[][null][null]}][delete {[][hi!][hi!]}][]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel7 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel7.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest8);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.index.VersionType versionType1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.versionType(versionType1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.routing("delete {[hi!][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest2.parent("delete {[][hi!][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest2.routing("delete {[][hi!][hi!]}");
        long long9 = deleteRequest8.seqNo();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType2 = deleteRequest1.versionType();
        org.elasticsearch.common.transport.TransportAddress transportAddress3 = null;
        deleteRequest1.remoteAddress(transportAddress3);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        java.lang.String str7 = deleteRequest6.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][null][null]}", "delete {[hi!][null][null]}", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue16 = deleteRequest15.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest11.timeout(timeValue16);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest6.timeout(timeValue16);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest1.timeout(timeValue16);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = new org.elasticsearch.action.delete.DeleteRequest();
        long long21 = deleteRequest20.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest20.parent("delete {[][hi!][hi!]}");
        deleteRequest23.seqNo((long) 100);
        org.elasticsearch.common.unit.TimeValue timeValue26 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest23.timeout(timeValue26);
        org.elasticsearch.common.unit.TimeValue timeValue28 = deleteRequest23.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest1.timeout(timeValue28);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest1.timeout("delete {[delete {[hi!][null][null]}][null][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[delete {[hi!][null][null]}][null][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(timeValue16);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(timeValue26);
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertNotNull(timeValue28);
        org.junit.Assert.assertNotNull(deleteRequest29);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "delete {[][hi!][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.type("");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException6 = deleteRequest3.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.refresh(false);
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.setParentTask("", (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 0 length nodeIds are reserved for EMPTY_TASK_ID and are otherwise invalid.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(actionRequestValidationException6);
        org.junit.Assert.assertNotNull(deleteRequest8);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType2 = deleteRequest1.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId7 = deleteRequest6.getParentTask();
        deleteRequest1.setParentTask(taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest1.id("delete {[hi!][null][null]}");
        org.elasticsearch.index.shard.ShardId shardId11 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.setShardId(shardId11);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest10.id("delete {[][hi!][hi!]}");
        deleteRequest14.primaryTerm(10L);
        org.junit.Assert.assertNotNull(versionType2);
        org.junit.Assert.assertNotNull(taskId7);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest14);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.setShardId(shardId2);
        long long4 = deleteRequest1.seqNo();
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.version((long) (byte) -1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId7 = deleteRequest6.getParentTask();
        deleteRequest0.setParentTask(taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest();
        long long10 = deleteRequest9.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest9.consistencyLevel(writeConsistencyLevel11);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType15 = deleteRequest14.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId20 = deleteRequest19.getParentTask();
        deleteRequest14.setParentTask(taskId20);
        deleteRequest9.setParentTask(taskId20);
        org.elasticsearch.index.shard.ShardId shardId23 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest9.setShardId(shardId23);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId34 = deleteRequest33.getParentTask();
        org.elasticsearch.tasks.Task task35 = deleteRequest26.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId34);
        java.lang.String str36 = deleteRequest26.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest38 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType39 = deleteRequest38.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest40 = deleteRequest26.versionType(versionType39);
        java.lang.String str41 = deleteRequest40.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest43 = deleteRequest40.routing("hi!");
        java.lang.String str44 = deleteRequest43.index();
        long long45 = deleteRequest43.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest47 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest49 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        deleteRequest49.primaryTerm(10L);
        java.lang.String str52 = deleteRequest49.toString();
        java.lang.String str53 = deleteRequest49.getDescription();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel54 = deleteRequest49.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest55 = deleteRequest47.consistencyLevel(writeConsistencyLevel54);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest56 = deleteRequest43.consistencyLevel(writeConsistencyLevel54);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest57 = deleteRequest9.consistencyLevel(writeConsistencyLevel54);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest58 = deleteRequest0.consistencyLevel(writeConsistencyLevel54);
        org.elasticsearch.index.shard.ShardId shardId59 = deleteRequest58.shardId();
        org.elasticsearch.common.io.stream.StreamInput streamInput60 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest58.readFrom(streamInput60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(taskId7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(versionType15);
        org.junit.Assert.assertNotNull(taskId20);
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNotNull(taskId34);
        org.junit.Assert.assertNotNull(task35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "delete {[hi!][null][null]}" + "'", str36, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType39);
        org.junit.Assert.assertNotNull(deleteRequest40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "delete {[hi!][null][null]}" + "'", str41, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "delete {[hi!][null][null]}" + "'", str52, "delete {[hi!][null][null]}");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "delete {[hi!][null][null]}" + "'", str53, "delete {[hi!][null][null]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel54 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel54.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest55);
        org.junit.Assert.assertNotNull(deleteRequest56);
        org.junit.Assert.assertNotNull(deleteRequest57);
        org.junit.Assert.assertNotNull(deleteRequest58);
        org.junit.Assert.assertNull(shardId59);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.parent("delete {[hi!][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest10.parent("");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException15 = deleteRequest14.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure17 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}", (java.lang.Throwable) actionRequestValidationException15, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure19 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "delete {[hi!][null][null]}", (java.lang.Throwable) actionRequestValidationException15, "delete {[null][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure21 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}", (java.lang.Throwable) actionRequestValidationException15, "delete {[hi!][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure23 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[][hi!][hi!]}", (java.lang.Throwable) actionRequestValidationException15, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure25 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}", (java.lang.Throwable) actionRequestValidationException15, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(actionRequestValidationException15);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.index.VersionType versionType1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.versionType(versionType1);
        deleteRequest0.primaryTerm((long) 1);
        org.elasticsearch.common.transport.TransportAddress transportAddress5 = deleteRequest0.remoteAddress();
        long long6 = deleteRequest0.seqNo();
        java.lang.String str7 = deleteRequest0.toString();
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = null;
        deleteRequest0.remoteAddress(transportAddress8);
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(transportAddress5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "delete {[null][null][null]}" + "'", str7, "delete {[null][null][null]}");
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting10 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting12 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting14 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId25 = deleteRequest24.getParentTask();
        org.elasticsearch.tasks.Task task26 = deleteRequest17.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId25);
        java.lang.String str27 = deleteRequest17.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType30 = deleteRequest29.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest17.versionType(versionType30);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException32 = deleteRequest31.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure34 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting14, "", (java.lang.Throwable) actionRequestValidationException32, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure36 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting12, "delete {[hi!][null][null]}", (java.lang.Throwable) actionRequestValidationException32, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure38 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting10, "hi!", (java.lang.Throwable) actionRequestValidationException32, "delete {[hi!][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure40 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "hi!", (java.lang.Throwable) actionRequestValidationException32, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure42 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}", (java.lang.Throwable) actionRequestValidationException32, "delete {[hi!][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure44 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[hi!][null][null]}", (java.lang.Throwable) actionRequestValidationException32, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure46 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[][hi!][hi!]}", (java.lang.Throwable) actionRequestValidationException32, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure48 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}", (java.lang.Throwable) actionRequestValidationException32, "delete {[null][delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][null]}");
        java.lang.String str49 = shardFailure48.reason;
        org.junit.Assert.assertNotNull(taskId25);
        org.junit.Assert.assertNotNull(task26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "delete {[hi!][null][null]}" + "'", str27, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType30);
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertNotNull(actionRequestValidationException32);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "delete {[hi!][delete {[][hi!][hi!]}][hi!]}" + "'", str49, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        long long1 = deleteRequest0.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.consistencyLevel(writeConsistencyLevel2);
        java.lang.String str4 = deleteRequest0.routing();
        boolean boolean5 = deleteRequest0.getShouldPersistResult();
        java.lang.String str6 = deleteRequest0.getDescription();
        deleteRequest0.seqNo((long) '#');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "delete {[null][null][null]}" + "'", str6, "delete {[null][null][null]}");
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType3 = deleteRequest2.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.versionType(versionType3);
        long long5 = deleteRequest0.primaryTerm();
        org.elasticsearch.action.support.IndicesOptions indicesOptions6 = deleteRequest0.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.index.VersionType versionType8 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.versionType(versionType8);
        deleteRequest7.primaryTerm((long) 1);
        org.elasticsearch.common.unit.TimeValue timeValue12 = deleteRequest7.timeout();
        java.lang.String str13 = deleteRequest7.id();
        org.elasticsearch.common.unit.TimeValue timeValue14 = deleteRequest7.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest0.timeout(timeValue14);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest0.timeout("delete {[delete {[hi!][delete {[][hi!][hi!]}][hi!]}][hi!][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[delete {[hi!][delete {[][hi!][hi!]}][hi!]}][hi!][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(indicesOptions6);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(timeValue12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(timeValue14);
        org.junit.Assert.assertNotNull(deleteRequest15);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][null][null]}", "delete {[hi!][null][null]}", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue8 = deleteRequest7.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.timeout(timeValue8);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        java.lang.String str19 = deleteRequest18.getDescription();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel20 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest18.consistencyLevel(writeConsistencyLevel20);
        long long22 = deleteRequest18.version();
        org.elasticsearch.tasks.TaskId taskId23 = deleteRequest18.getParentTask();
        org.elasticsearch.tasks.Task task24 = deleteRequest11.createTask((long) (byte) 0, "", "", taskId23);
        org.elasticsearch.index.shard.ShardId shardId25 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest11.setShardId(shardId25);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][hi!][hi!]}", "delete {[][hi!][hi!]}", "");
        org.elasticsearch.common.unit.TimeValue timeValue34 = deleteRequest33.timeout();
        org.elasticsearch.tasks.TaskId taskId35 = deleteRequest33.getParentTask();
        org.elasticsearch.tasks.Task task36 = deleteRequest26.createTask((long) 1, "delete {[delete {[null][null][hi!]}][delete {[null][null][hi!]}][]}", "delete {[][null][null]}", taskId35);
        java.lang.Class<?> wildcardClass37 = deleteRequest26.getClass();
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "delete {[][hi!][hi!]}" + "'", str19, "delete {[][hi!][hi!]}");
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-3L) + "'", long22 == (-3L));
        org.junit.Assert.assertNotNull(taskId23);
        org.junit.Assert.assertNotNull(task24);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNotNull(timeValue34);
        org.junit.Assert.assertNotNull(taskId35);
        org.junit.Assert.assertNotNull(task36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        long long1 = deleteRequest0.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.consistencyLevel(writeConsistencyLevel2);
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.setShardId(shardId4);
        org.elasticsearch.index.VersionType versionType6 = deleteRequest3.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.version(0L);
        org.elasticsearch.common.io.stream.StreamInput streamInput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.readFrom(streamInput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(versionType6);
        org.junit.Assert.assertNotNull(deleteRequest8);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.version((long) (byte) 10);
        org.elasticsearch.tasks.TaskId taskId3 = deleteRequest0.getParentTask();
        long long4 = deleteRequest0.seqNo();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(taskId3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}", "delete {[hi!][delete {[][hi!][hi!]}][hi!]}", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("delete {[null][null][hi!]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.timeout("delete {[delete {[][hi!][hi!]}][delete {[][hi!][hi!]}][hi!]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[delete {[][hi!][hi!]}][delete {[][hi!][hi!]}][hi!]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        deleteRequest3.seqNo((-1L));
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.setShardId(shardId6);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel8 = deleteRequest7.consistencyLevel();
        boolean boolean9 = deleteRequest7.getShouldPersistResult();
        long long10 = deleteRequest7.primaryTerm();
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel8 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel8.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", "hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.routing("delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        java.lang.String str6 = deleteRequest3.id();
        java.lang.String str7 = deleteRequest3.id();
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][hi!][hi!]}", "delete {[][hi!][hi!]}", "hi!");
        boolean boolean4 = deleteRequest3.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.version(0L);
        deleteRequest6.primaryTerm((long) ' ');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(deleteRequest6);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        long long1 = deleteRequest0.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("delete {[][hi!][hi!]}");
        deleteRequest3.seqNo((long) 100);
        org.elasticsearch.common.unit.TimeValue timeValue6 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.timeout(timeValue6);
        org.elasticsearch.common.unit.TimeValue timeValue8 = deleteRequest3.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.parent("delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.elasticsearch.index.shard.ShardId shardId11 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest3.setShardId(shardId11);
        long long13 = deleteRequest3.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest3.version((long) 0);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.index.VersionType versionType17 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest16.versionType(versionType17);
        deleteRequest16.primaryTerm((long) 1);
        org.elasticsearch.common.unit.TimeValue timeValue21 = deleteRequest16.timeout();
        java.lang.String str22 = deleteRequest16.id();
        org.elasticsearch.common.unit.TimeValue timeValue23 = deleteRequest16.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest3.timeout(timeValue23);
        org.elasticsearch.tasks.TaskId taskId25 = deleteRequest3.getParentTask();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest3.timeout("delete {[delete {[delete {[hi!][delete {[][hi!][hi!]}][hi!]}][hi!][null]}][null][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[delete {[delete {[hi!][delete {[][hi!][hi!]}][hi!]}][hi!][null]}][null][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(timeValue21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(timeValue23);
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNotNull(taskId25);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.parent("delete {[hi!][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.refresh(true);
        java.lang.String str7 = deleteRequest6.toString();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest6.writeTo(streamOutput8);
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
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.index("");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[delete {[delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][][]}][delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][delete {[hi!][null][null]}]}", deleteRequest5);
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
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        long long3 = deleteRequest2.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.parent("delete {[][hi!][hi!]}");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException6 = deleteRequest5.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure8 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}", (java.lang.Throwable) actionRequestValidationException6, "hi!");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting9 = shardFailure8.routing;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting10 = shardFailure8.routing;
        java.lang.String str11 = shardFailure8.indexUUID;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(actionRequestValidationException6);
        org.junit.Assert.assertNull(shardRouting9);
        org.junit.Assert.assertNull(shardRouting10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId19 = deleteRequest18.getParentTask();
        org.elasticsearch.tasks.Task task20 = deleteRequest11.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId19);
        java.lang.String str21 = deleteRequest11.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType24 = deleteRequest23.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest11.versionType(versionType24);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException26 = deleteRequest25.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure28 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "", (java.lang.Throwable) actionRequestValidationException26, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure30 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "delete {[hi!][null][null]}", (java.lang.Throwable) actionRequestValidationException26, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        java.lang.Throwable throwable31 = shardFailure30.cause;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure33 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}", throwable31, "delete {[delete {[hi!][delete {[][hi!][hi!]}][hi!]}][hi!][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure35 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "", throwable31, "delete {[][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure37 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[delete {[hi!][delete {[][hi!][hi!]}][hi!]}][hi!][null]}", throwable31, "delete {[delete {[delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][][]}][delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][delete {[hi!][null][null]}]}");
        org.junit.Assert.assertNotNull(taskId19);
        org.junit.Assert.assertNotNull(task20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "delete {[hi!][null][null]}" + "'", str21, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType24);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(actionRequestValidationException26);
        org.junit.Assert.assertNotNull(throwable31);
        org.junit.Assert.assertEquals(throwable31.getLocalizedMessage(), "Validation Failed: 1: type is missing;2: id is missing;");
        org.junit.Assert.assertEquals(throwable31.getMessage(), "Validation Failed: 1: type is missing;2: id is missing;");
        org.junit.Assert.assertEquals(throwable31.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: type is missing;2: id is missing;");
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][hi!][hi!]}", "", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout("delete {[delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][null][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][null][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][null][null]}", "hi!", "delete {[hi!][null][null]}");
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
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        long long1 = deleteRequest0.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.consistencyLevel(writeConsistencyLevel2);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType6 = deleteRequest5.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId11 = deleteRequest10.getParentTask();
        deleteRequest5.setParentTask(taskId11);
        deleteRequest0.setParentTask(taskId11);
        org.elasticsearch.index.shard.ShardId shardId14 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest0.setShardId(shardId14);
        long long16 = deleteRequest15.primaryTerm();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest15.timeout("");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(versionType6);
        org.junit.Assert.assertNotNull(taskId11);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        deleteRequest3.seqNo((-1L));
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.parent("delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.id("delete {[hi!][null][null]}");
        deleteRequest9.primaryTerm((long) (byte) 10);
        org.elasticsearch.common.io.stream.StreamInput streamInput14 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest9.readFrom(streamInput14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.parent("delete {[hi!][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.parent("");
        org.elasticsearch.common.transport.TransportAddress transportAddress5 = deleteRequest4.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][null][null]}", "delete {[hi!][null][null]}", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue14 = deleteRequest13.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest9.timeout(timeValue14);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest9.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        java.lang.String str25 = deleteRequest24.getDescription();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel26 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest24.consistencyLevel(writeConsistencyLevel26);
        long long28 = deleteRequest24.version();
        org.elasticsearch.tasks.TaskId taskId29 = deleteRequest24.getParentTask();
        org.elasticsearch.tasks.Task task30 = deleteRequest17.createTask((long) (byte) 0, "", "", taskId29);
        deleteRequest4.setParentTask(taskId29);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput32 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest4.writeTo(streamOutput32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNull(transportAddress5);
        org.junit.Assert.assertNotNull(timeValue14);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "delete {[][hi!][hi!]}" + "'", str25, "delete {[][hi!][hi!]}");
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-3L) + "'", long28 == (-3L));
        org.junit.Assert.assertNotNull(taskId29);
        org.junit.Assert.assertNotNull(task30);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][][null]}", "delete {[null][delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][null]}", "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[delete {[delete {[hi!][delete {[][hi!][hi!]}][hi!]}][hi!][null]}][null][null]}", deleteRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        long long1 = deleteRequest0.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.consistencyLevel(writeConsistencyLevel2);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType6 = deleteRequest5.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId11 = deleteRequest10.getParentTask();
        deleteRequest5.setParentTask(taskId11);
        deleteRequest0.setParentTask(taskId11);
        deleteRequest0.seqNo(0L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][null][null]}", "delete {[hi!][null][null]}", "");
        deleteRequest22.seqNo((long) 100);
        java.lang.String str25 = deleteRequest22.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest22.id("delete {[hi!][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest31.parent("delete {[hi!][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = deleteRequest31.parent("");
        org.elasticsearch.common.transport.TransportAddress transportAddress36 = deleteRequest35.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest40 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][null][null]}", "delete {[hi!][null][null]}", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest44 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue45 = deleteRequest44.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest46 = deleteRequest40.timeout(timeValue45);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest48 = deleteRequest40.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest55 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        java.lang.String str56 = deleteRequest55.getDescription();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel57 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest58 = deleteRequest55.consistencyLevel(writeConsistencyLevel57);
        long long59 = deleteRequest55.version();
        org.elasticsearch.tasks.TaskId taskId60 = deleteRequest55.getParentTask();
        org.elasticsearch.tasks.Task task61 = deleteRequest48.createTask((long) (byte) 0, "", "", taskId60);
        deleteRequest35.setParentTask(taskId60);
        org.elasticsearch.tasks.Task task63 = deleteRequest27.createTask((long) (byte) 1, "delete {[null][null][hi!]}", "delete {[hi!][null][null]}", taskId60);
        org.elasticsearch.tasks.Task task64 = deleteRequest0.createTask((long) 10, "delete {[][hi!][hi!]}", "delete {[null][null][hi!]}", taskId60);
        java.lang.String str65 = deleteRequest0.id();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(versionType6);
        org.junit.Assert.assertNotNull(taskId11);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "delete {[hi!][null][null]}" + "'", str25, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertNotNull(deleteRequest35);
        org.junit.Assert.assertNull(transportAddress36);
        org.junit.Assert.assertNotNull(timeValue45);
        org.junit.Assert.assertNotNull(deleteRequest46);
        org.junit.Assert.assertNotNull(deleteRequest48);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "delete {[][hi!][hi!]}" + "'", str56, "delete {[][hi!][hi!]}");
        org.junit.Assert.assertNotNull(deleteRequest58);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + (-3L) + "'", long59 == (-3L));
        org.junit.Assert.assertNotNull(taskId60);
        org.junit.Assert.assertNotNull(task61);
        org.junit.Assert.assertNotNull(task63);
        org.junit.Assert.assertNotNull(task64);
        org.junit.Assert.assertNull(str65);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        long long1 = deleteRequest0.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("delete {[][hi!][hi!]}");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = deleteRequest0.consistencyLevel();
        java.lang.String str5 = deleteRequest0.toString();
        java.lang.String[] strArray6 = deleteRequest0.indices();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel4 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel4.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "delete {[null][null][null]}" + "'", str5, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        long long1 = deleteRequest0.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("delete {[][hi!][hi!]}");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = deleteRequest0.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest0.routing("delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.timeout("delete {[delete {[hi!][null][null]}][null][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[delete {[hi!][null][null]}][null][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel4 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel4.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest6);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "delete {[][hi!][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.type("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType11 = deleteRequest10.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId16 = deleteRequest15.getParentTask();
        deleteRequest10.setParentTask(taskId16);
        org.elasticsearch.tasks.Task task18 = deleteRequest3.createTask((long) (short) 0, "", "delete {[hi!][null][null]}", taskId16);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException19 = deleteRequest3.validate();
        org.elasticsearch.common.unit.TimeValue timeValue20 = deleteRequest3.timeout();
        org.elasticsearch.common.unit.TimeValue timeValue21 = deleteRequest3.timeout();
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(versionType11);
        org.junit.Assert.assertNotNull(taskId16);
        org.junit.Assert.assertNotNull(task18);
        org.junit.Assert.assertNull(actionRequestValidationException19);
        org.junit.Assert.assertNotNull(timeValue20);
        org.junit.Assert.assertNotNull(timeValue21);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][null][null]}", "delete {[hi!][delete {[][hi!][hi!]}][hi!]}", "delete {[][hi!][hi!]}");
        long long4 = deleteRequest3.primaryTerm();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId9 = deleteRequest8.getParentTask();
        org.elasticsearch.tasks.Task task10 = deleteRequest1.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId9);
        java.lang.String str11 = deleteRequest1.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType14 = deleteRequest13.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest1.versionType(versionType14);
        java.lang.String str16 = deleteRequest15.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest15.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest15.parent("delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}");
        java.lang.String str21 = deleteRequest15.getDescription();
        boolean boolean22 = deleteRequest15.refresh();
        org.elasticsearch.tasks.TaskId taskId26 = null;
        org.elasticsearch.tasks.Task task27 = deleteRequest15.createTask((long) (short) 0, "delete {[][][delete {[][hi!][hi!]}]}", "delete {[delete {[][hi!][hi!]}][null][null]}", taskId26);
        long long28 = deleteRequest15.seqNo();
        org.junit.Assert.assertNotNull(taskId9);
        org.junit.Assert.assertNotNull(task10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[hi!][null][null]}" + "'", str11, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType14);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "delete {[hi!][null][null]}" + "'", str16, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "delete {[hi!][null][null]}" + "'", str21, "delete {[hi!][null][null]}");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(task27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType3 = deleteRequest2.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.versionType(versionType3);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.parent("delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        boolean boolean7 = deleteRequest4.refresh();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.index("delete {[][hi!][hi!]}");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel12 = deleteRequest9.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest4.consistencyLevel(writeConsistencyLevel12);
        deleteRequest4.primaryTerm((long) 1);
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel12 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel12.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest13);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[][null][null]}][delete {[][hi!][hi!]}][]}");
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId9 = deleteRequest8.getParentTask();
        org.elasticsearch.tasks.Task task10 = deleteRequest1.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId9);
        java.lang.String str11 = deleteRequest1.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType14 = deleteRequest13.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest1.versionType(versionType14);
        java.lang.String str16 = deleteRequest15.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest15.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest15.parent("delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}");
        java.lang.String str21 = deleteRequest15.getDescription();
        org.elasticsearch.index.shard.ShardId shardId22 = deleteRequest15.shardId();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput23 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest15.writeTo(streamOutput23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(taskId9);
        org.junit.Assert.assertNotNull(task10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[hi!][null][null]}" + "'", str11, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType14);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "delete {[hi!][null][null]}" + "'", str16, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "delete {[hi!][null][null]}" + "'", str21, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNull(shardId22);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.index.VersionType versionType3 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.versionType(versionType3);
        deleteRequest2.primaryTerm((long) 1);
        java.lang.String str7 = deleteRequest2.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest2.refresh(false);
        java.lang.String[] strArray10 = deleteRequest9.indices();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[delete {[null][null][hi!]}][delete {[null][null][hi!]}][]}", deleteRequest9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        long long1 = deleteRequest0.seqNo();
        boolean boolean2 = deleteRequest0.getShouldPersistResult();
        long long3 = deleteRequest0.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.version((long) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.timeout("delete {[delete {[delete {[hi!][delete {[][hi!][hi!]}][hi!]}][hi!][null]}][delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][hi!]}][delete {[delete {[null][null][hi!]}][delete {[null][null][hi!]}][]}]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[delete {[delete {[hi!][delete {[][hi!][hi!]}][hi!]}][hi!][null]}][delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][hi!]}][delete {[delete {[null][null][hi!]}][delete {[null][null][hi!]}][]}]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest5);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId17 = deleteRequest16.getParentTask();
        org.elasticsearch.tasks.Task task18 = deleteRequest9.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId17);
        java.lang.String str19 = deleteRequest9.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType22 = deleteRequest21.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest9.versionType(versionType22);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException24 = deleteRequest23.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure26 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "delete {[][hi!][hi!]}", (java.lang.Throwable) actionRequestValidationException24, "delete {[hi!][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure28 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[hi!][null][null]}", (java.lang.Throwable) actionRequestValidationException24, "hi!");
        java.lang.String str29 = shardFailure28.indexUUID;
        java.lang.Throwable throwable30 = shardFailure28.cause;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure32 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[][][delete {[][hi!][hi!]}]}", throwable30, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure34 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}", throwable30, "delete {[delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][][]}");
        org.junit.Assert.assertNotNull(taskId17);
        org.junit.Assert.assertNotNull(task18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "delete {[hi!][null][null]}" + "'", str19, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType22);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(actionRequestValidationException24);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(throwable30);
        org.junit.Assert.assertEquals(throwable30.getLocalizedMessage(), "Validation Failed: 1: type is missing;2: id is missing;");
        org.junit.Assert.assertEquals(throwable30.getMessage(), "Validation Failed: 1: type is missing;2: id is missing;");
        org.junit.Assert.assertEquals(throwable30.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: type is missing;2: id is missing;");
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[][hi!][hi!]}][][delete {[][hi!][hi!]}]}", "delete {[hi!][delete {[][hi!][hi!]}][hi!]}", "delete {[delete {[][hi!][hi!]}][delete {[][hi!][hi!]}][hi!]}");
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][hi!][hi!]}", "delete {[hi!][null][null]}", "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        boolean boolean4 = deleteRequest3.refresh();
        long long5 = deleteRequest3.seqNo();
        boolean boolean6 = deleteRequest3.refresh();
        deleteRequest3.seqNo(100L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.parent("delete {[hi!][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest8.parent("");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException13 = deleteRequest12.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure15 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "", (java.lang.Throwable) actionRequestValidationException13, "delete {[hi!][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure17 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "", (java.lang.Throwable) actionRequestValidationException13, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure19 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "", (java.lang.Throwable) actionRequestValidationException13, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure21 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}", (java.lang.Throwable) actionRequestValidationException13, "");
        java.lang.String str22 = shardFailure21.reason;
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(actionRequestValidationException13);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}" + "'", str22, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}");
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.parent("delete {[hi!][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.parent("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.refresh(true);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("", "", "delete {[][hi!][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.type("");
        boolean boolean16 = deleteRequest15.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][null][null]}", "delete {[hi!][null][null]}", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue28 = deleteRequest27.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest23.timeout(timeValue28);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest23.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest38 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        java.lang.String str39 = deleteRequest38.getDescription();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel40 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest41 = deleteRequest38.consistencyLevel(writeConsistencyLevel40);
        long long42 = deleteRequest38.version();
        org.elasticsearch.tasks.TaskId taskId43 = deleteRequest38.getParentTask();
        org.elasticsearch.tasks.Task task44 = deleteRequest31.createTask((long) (byte) 0, "", "", taskId43);
        org.elasticsearch.index.shard.ShardId shardId45 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest46 = deleteRequest31.setShardId(shardId45);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest47 = new org.elasticsearch.action.delete.DeleteRequest();
        long long48 = deleteRequest47.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel49 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest50 = deleteRequest47.consistencyLevel(writeConsistencyLevel49);
        org.elasticsearch.index.shard.ShardId shardId51 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest52 = deleteRequest50.setShardId(shardId51);
        org.elasticsearch.tasks.TaskId taskId53 = deleteRequest52.getParentTask();
        deleteRequest46.setParentTask(taskId53);
        org.elasticsearch.tasks.Task task55 = deleteRequest15.createTask((long) (byte) 100, "delete {[null][null][null]}", "delete {[hi!][null][null]}", taskId53);
        org.elasticsearch.tasks.Task task56 = deleteRequest4.createTask((long) (byte) 0, "delete {[null][delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][null]}", "", taskId53);
        org.elasticsearch.common.unit.TimeValue timeValue57 = deleteRequest4.timeout();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(timeValue28);
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "delete {[][hi!][hi!]}" + "'", str39, "delete {[][hi!][hi!]}");
        org.junit.Assert.assertNotNull(deleteRequest41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-3L) + "'", long42 == (-3L));
        org.junit.Assert.assertNotNull(taskId43);
        org.junit.Assert.assertNotNull(task44);
        org.junit.Assert.assertNotNull(deleteRequest46);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest50);
        org.junit.Assert.assertNotNull(deleteRequest52);
        org.junit.Assert.assertNotNull(taskId53);
        org.junit.Assert.assertNotNull(task55);
        org.junit.Assert.assertNotNull(task56);
        org.junit.Assert.assertNotNull(timeValue57);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.index.VersionType versionType1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.versionType(versionType1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.routing("delete {[hi!][null][null]}");
        deleteRequest2.primaryTerm((long) (-1));
        boolean boolean7 = deleteRequest2.refresh();
        java.lang.String str8 = deleteRequest2.toString();
        org.elasticsearch.common.io.stream.StreamInput streamInput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest2.readFrom(streamInput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "delete {[null][null][null]}" + "'", str8, "delete {[null][null][null]}");
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        deleteRequest3.seqNo((-1L));
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.version((long) (byte) 1);
        org.elasticsearch.common.unit.TimeValue timeValue10 = deleteRequest9.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest9.index("");
        java.lang.String str13 = deleteRequest9.index();
        org.elasticsearch.index.shard.ShardId shardId14 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest9.setShardId(shardId14);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest15.refresh(false);
        org.elasticsearch.common.transport.TransportAddress transportAddress18 = deleteRequest17.remoteAddress();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = transportAddress18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(timeValue10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNull(transportAddress18);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        long long1 = deleteRequest0.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.consistencyLevel(writeConsistencyLevel2);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.timeout("delete {[null][delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[null][delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest3);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.index.VersionType versionType1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.versionType(versionType1);
        deleteRequest0.primaryTerm((long) 1);
        org.elasticsearch.common.unit.TimeValue timeValue5 = deleteRequest0.timeout();
        java.lang.String str6 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest0.version(1L);
        org.elasticsearch.index.VersionType versionType9 = deleteRequest8.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        java.lang.String str14 = deleteRequest13.getDescription();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel15 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest13.consistencyLevel(writeConsistencyLevel15);
        long long17 = deleteRequest13.version();
        org.elasticsearch.tasks.TaskId taskId18 = deleteRequest13.getParentTask();
        deleteRequest8.setParentTask(taskId18);
        long long20 = deleteRequest8.seqNo();
        org.elasticsearch.index.shard.IndexShard indexShard21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete22 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest8, indexShard21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(timeValue5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNull(versionType9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "delete {[][hi!][hi!]}" + "'", str14, "delete {[][hi!][hi!]}");
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-3L) + "'", long17 == (-3L));
        org.junit.Assert.assertNotNull(taskId18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        java.lang.String str4 = deleteRequest3.getDescription();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.consistencyLevel(writeConsistencyLevel5);
        java.lang.String[] strArray7 = deleteRequest3.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.version((long) (short) 100);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.parent("delete {[delete {[delete {[hi!][delete {[][hi!][hi!]}][hi!]}][hi!][null]}][delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][hi!]}][delete {[delete {[null][null][hi!]}][delete {[null][null][hi!]}][]}]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest9.parent("delete {[delete {[][null][null]}][delete {[][hi!][hi!]}][]}");
        org.elasticsearch.index.VersionType versionType14 = deleteRequest13.versionType();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest13.timeout("delete {[delete {[null][null][hi!]}][hi!][hi!]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[delete {[null][null][hi!]}][hi!][hi!]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[][hi!][hi!]}" + "'", str4, "delete {[][hi!][hi!]}");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(versionType14);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "delete {[][hi!][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.type("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType11 = deleteRequest10.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId16 = deleteRequest15.getParentTask();
        deleteRequest10.setParentTask(taskId16);
        org.elasticsearch.tasks.Task task18 = deleteRequest3.createTask((long) (short) 0, "", "delete {[hi!][null][null]}", taskId16);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest3.timeout("delete {[][hi!][hi!]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[][hi!][hi!]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(versionType11);
        org.junit.Assert.assertNotNull(taskId16);
        org.junit.Assert.assertNotNull(task18);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId15 = deleteRequest14.getParentTask();
        org.elasticsearch.tasks.Task task16 = deleteRequest7.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId15);
        java.lang.String str17 = deleteRequest7.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType20 = deleteRequest19.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest7.versionType(versionType20);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException22 = deleteRequest21.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure24 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "", (java.lang.Throwable) actionRequestValidationException22, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure26 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[hi!][null][null]}", (java.lang.Throwable) actionRequestValidationException22, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure28 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "hi!", (java.lang.Throwable) actionRequestValidationException22, "delete {[hi!][null][null]}");
        java.lang.Throwable throwable29 = shardFailure28.cause;
        java.lang.String str30 = shardFailure28.indexUUID;
        org.junit.Assert.assertNotNull(taskId15);
        org.junit.Assert.assertNotNull(task16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "delete {[hi!][null][null]}" + "'", str17, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType20);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(actionRequestValidationException22);
        org.junit.Assert.assertNotNull(throwable29);
        org.junit.Assert.assertEquals(throwable29.getLocalizedMessage(), "Validation Failed: 1: type is missing;2: id is missing;");
        org.junit.Assert.assertEquals(throwable29.getMessage(), "Validation Failed: 1: type is missing;2: id is missing;");
        org.junit.Assert.assertEquals(throwable29.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: type is missing;2: id is missing;");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "delete {[hi!][null][null]}" + "'", str30, "delete {[hi!][null][null]}");
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][hi!][hi!]}", "delete {[][hi!][hi!]}", "hi!");
        boolean boolean6 = deleteRequest5.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest5.version(0L);
        org.elasticsearch.index.VersionType versionType9 = deleteRequest8.versionType();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[delete {[delete {[hi!][delete {[][hi!][hi!]}][hi!]}][hi!][null]}][delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][hi!]}][delete {[delete {[null][null][hi!]}][delete {[null][null][hi!]}][]}]}", deleteRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(versionType9);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        java.lang.String str4 = deleteRequest3.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.type("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.routing("delete {[][hi!][hi!]}");
        org.elasticsearch.tasks.TaskId taskId9 = deleteRequest6.getParentTask();
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = null;
        deleteRequest6.remoteAddress(transportAddress10);
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest6.setShardId(shardId12);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}", deleteRequest13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(taskId9);
        org.junit.Assert.assertNotNull(deleteRequest13);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        java.lang.String str4 = deleteRequest3.getDescription();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.consistencyLevel(writeConsistencyLevel5);
        org.elasticsearch.common.transport.TransportAddress transportAddress7 = null;
        deleteRequest6.remoteAddress(transportAddress7);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest6.timeout("delete {[][hi!][hi!]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[][hi!][hi!]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[][hi!][hi!]}" + "'", str4, "delete {[][hi!][hi!]}");
        org.junit.Assert.assertNotNull(deleteRequest6);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", "hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.id("");
        deleteRequest3.setParentTask("hi!", (long) '#');
        org.elasticsearch.common.io.stream.StreamOutput streamOutput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.writeTo(streamOutput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        java.lang.String str4 = deleteRequest3.getDescription();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.consistencyLevel(writeConsistencyLevel5);
        java.lang.String[] strArray7 = deleteRequest3.indices();
        deleteRequest3.primaryTerm((long) (short) 1);
        deleteRequest3.primaryTerm((long) (short) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[][hi!][hi!]}" + "'", str4, "delete {[][hi!][hi!]}");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        long long1 = deleteRequest0.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.consistencyLevel(writeConsistencyLevel2);
        org.elasticsearch.index.shard.IndexShard indexShard4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete5 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest3, indexShard4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest3);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId17 = deleteRequest16.getParentTask();
        org.elasticsearch.tasks.Task task18 = deleteRequest9.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId17);
        java.lang.String str19 = deleteRequest9.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType22 = deleteRequest21.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest9.versionType(versionType22);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException24 = deleteRequest23.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure26 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "", (java.lang.Throwable) actionRequestValidationException24, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure28 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "hi!", (java.lang.Throwable) actionRequestValidationException24, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure30 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "", (java.lang.Throwable) actionRequestValidationException24, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure32 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "", (java.lang.Throwable) actionRequestValidationException24, "delete {[null][null][null]}");
        java.lang.String str33 = shardFailure32.reason;
        org.junit.Assert.assertNotNull(taskId17);
        org.junit.Assert.assertNotNull(task18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "delete {[hi!][null][null]}" + "'", str19, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType22);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(actionRequestValidationException24);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.index.VersionType versionType1 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.versionType(versionType1);
        deleteRequest0.primaryTerm((long) 1);
        org.elasticsearch.common.transport.TransportAddress transportAddress5 = deleteRequest0.remoteAddress();
        java.lang.String str6 = deleteRequest0.index();
        org.elasticsearch.action.support.IndicesOptions indicesOptions7 = deleteRequest0.indicesOptions();
        java.lang.String[] strArray8 = deleteRequest0.indices();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(transportAddress5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(indicesOptions7);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.parent("delete {[hi!][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest8.parent("");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException13 = deleteRequest12.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure15 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "", (java.lang.Throwable) actionRequestValidationException13, "delete {[hi!][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure17 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "", (java.lang.Throwable) actionRequestValidationException13, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure19 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "", (java.lang.Throwable) actionRequestValidationException13, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure21 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}", (java.lang.Throwable) actionRequestValidationException13, "");
        java.lang.String str22 = shardFailure21.indexUUID;
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(actionRequestValidationException13);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId9 = deleteRequest8.getParentTask();
        org.elasticsearch.tasks.Task task10 = deleteRequest1.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId9);
        java.lang.String str11 = deleteRequest1.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType14 = deleteRequest13.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest1.versionType(versionType14);
        org.elasticsearch.index.shard.ShardId shardId16 = deleteRequest1.shardId();
        java.lang.String str17 = deleteRequest1.parent();
        java.lang.String[] strArray18 = deleteRequest1.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        deleteRequest22.seqNo((-1L));
        org.elasticsearch.index.shard.ShardId shardId25 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest22.setShardId(shardId25);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel27 = deleteRequest26.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest1.consistencyLevel(writeConsistencyLevel27);
        org.elasticsearch.index.shard.IndexShard indexShard29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete30 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest1, indexShard29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(taskId9);
        org.junit.Assert.assertNotNull(task10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[hi!][null][null]}" + "'", str11, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType14);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNull(shardId16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel27 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel27.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest28);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        deleteRequest3.seqNo((-1L));
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.version((long) (byte) 1);
        org.elasticsearch.common.unit.TimeValue timeValue10 = deleteRequest9.timeout();
        java.lang.String str11 = deleteRequest9.getDescription();
        boolean boolean12 = deleteRequest9.refresh();
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(timeValue10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[hi!][delete {[][hi!][hi!]}][hi!]}" + "'", str11, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        java.lang.String str2 = deleteRequest1.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}", "hi!", "");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = deleteRequest6.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest1.consistencyLevel(writeConsistencyLevel7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest1.type("delete {[hi!][null][null]}");
        java.lang.String str11 = deleteRequest1.index();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel7 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel7.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        java.lang.String str4 = deleteRequest3.getDescription();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel5 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.consistencyLevel(writeConsistencyLevel5);
        boolean boolean7 = deleteRequest6.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.type("delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.refresh(true);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest9.refresh(false);
        boolean boolean14 = deleteRequest9.getShouldPersistResult();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[][hi!][hi!]}" + "'", str4, "delete {[][hi!][hi!]}");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][][null]}", "delete {[delete {[delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][][]}][delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][delete {[hi!][null][null]}]}", "delete {[delete {[delete {[hi!][delete {[][hi!][hi!]}][hi!]}][hi!][null]}][null][null]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout("delete {[hi!][][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[hi!][][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][][delete {[][hi!][hi!]}]}", "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}", "");
        long long4 = deleteRequest3.version();
        deleteRequest3.setParentTask("delete {[delete {[delete {[hi!][delete {[][hi!][hi!]}][hi!]}][hi!][null]}][null][null]}", (long) 0);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.writeTo(streamOutput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3L) + "'", long4 == (-3L));
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", "hi!");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = deleteRequest3.consistencyLevel();
        org.elasticsearch.common.unit.TimeValue timeValue5 = deleteRequest3.timeout();
        org.elasticsearch.index.shard.ShardId shardId6 = deleteRequest3.shardId();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.index("delete {[delete {[delete {[][hi!][hi!]}][null][null]}][hi!][delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}]}");
        java.lang.String str9 = deleteRequest3.index();
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel4 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel4.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(timeValue5);
        org.junit.Assert.assertNull(shardId6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "delete {[delete {[delete {[][hi!][hi!]}][null][null]}][hi!][delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}]}" + "'", str9, "delete {[delete {[delete {[][hi!][hi!]}][null][null]}][hi!][delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}]}");
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting8 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting10 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting12 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting14 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting16 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting18 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting20 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId31 = deleteRequest30.getParentTask();
        org.elasticsearch.tasks.Task task32 = deleteRequest23.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId31);
        java.lang.String str33 = deleteRequest23.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType36 = deleteRequest35.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest37 = deleteRequest23.versionType(versionType36);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException38 = deleteRequest37.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure40 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting20, "", (java.lang.Throwable) actionRequestValidationException38, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure42 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting18, "delete {[hi!][null][null]}", (java.lang.Throwable) actionRequestValidationException38, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure44 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting16, "hi!", (java.lang.Throwable) actionRequestValidationException38, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure46 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting14, "delete {[hi!][null][null]}", (java.lang.Throwable) actionRequestValidationException38, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure48 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting12, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}", (java.lang.Throwable) actionRequestValidationException38, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure50 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting10, "delete {[][hi!][hi!]}", (java.lang.Throwable) actionRequestValidationException38, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure52 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting8, "delete {[null][null][null]}", (java.lang.Throwable) actionRequestValidationException38, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure54 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "", (java.lang.Throwable) actionRequestValidationException38, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure56 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[delete {[hi!][null][null]}][null][null]}", (java.lang.Throwable) actionRequestValidationException38, "delete {[delete {[null][null][hi!]}][hi!][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure58 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[][null][null]}", (java.lang.Throwable) actionRequestValidationException38, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure60 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[delete {[null][null][hi!]}][hi!][hi!]}", (java.lang.Throwable) actionRequestValidationException38, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(taskId31);
        org.junit.Assert.assertNotNull(task32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "delete {[hi!][null][null]}" + "'", str33, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType36);
        org.junit.Assert.assertNotNull(deleteRequest37);
        org.junit.Assert.assertNotNull(actionRequestValidationException38);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][hi!]}", "delete {[delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][][]}", "delete {[delete {[delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][][]}][delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][delete {[hi!][null][null]}]}");
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][hi!][hi!]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress2 = null;
        deleteRequest1.remoteAddress(transportAddress2);
        deleteRequest1.seqNo((long) (byte) 1);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId9 = deleteRequest8.getParentTask();
        org.elasticsearch.tasks.Task task10 = deleteRequest1.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId9);
        java.lang.String str11 = deleteRequest1.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType14 = deleteRequest13.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest1.versionType(versionType14);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId25 = deleteRequest24.getParentTask();
        org.elasticsearch.tasks.Task task26 = deleteRequest17.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId25);
        java.lang.String str27 = deleteRequest17.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType30 = deleteRequest29.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest17.versionType(versionType30);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest15.versionType(versionType30);
        org.elasticsearch.index.shard.ShardId shardId33 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = deleteRequest15.setShardId(shardId33);
        org.elasticsearch.tasks.TaskId taskId35 = deleteRequest15.getParentTask();
        org.elasticsearch.common.io.stream.StreamInput streamInput36 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest15.readFrom(streamInput36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(taskId9);
        org.junit.Assert.assertNotNull(task10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[hi!][null][null]}" + "'", str11, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType14);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(taskId25);
        org.junit.Assert.assertNotNull(task26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "delete {[hi!][null][null]}" + "'", str27, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType30);
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertNotNull(deleteRequest34);
        org.junit.Assert.assertNotNull(taskId35);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][hi!]}", "delete {[delete {[][hi!][hi!]}][delete {[][hi!][hi!]}][hi!]}", "delete {[delete {[delete {[hi!][delete {[][hi!][hi!]}][hi!]}][hi!][null]}][null][null]}");
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId17 = deleteRequest16.getParentTask();
        org.elasticsearch.tasks.Task task18 = deleteRequest9.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId17);
        java.lang.String str19 = deleteRequest9.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType22 = deleteRequest21.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest9.versionType(versionType22);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException24 = deleteRequest23.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure26 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "", (java.lang.Throwable) actionRequestValidationException24, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure28 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "", (java.lang.Throwable) actionRequestValidationException24, "delete {[][hi!][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure30 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[delete {[hi!][delete {[][hi!][hi!]}][hi!]}][hi!][null]}", (java.lang.Throwable) actionRequestValidationException24, "delete {[delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][][]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure32 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[delete {[delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][][]}][delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][delete {[hi!][null][null]}]}", (java.lang.Throwable) actionRequestValidationException24, "delete {[delete {[null][null][hi!]}][delete {[null][null][hi!]}][]}");
        java.lang.String str33 = shardFailure32.reason;
        org.junit.Assert.assertNotNull(taskId17);
        org.junit.Assert.assertNotNull(task18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "delete {[hi!][null][null]}" + "'", str19, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType22);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(actionRequestValidationException24);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "delete {[delete {[delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][][]}][delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][delete {[hi!][null][null]}]}" + "'", str33, "delete {[delete {[delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][][]}][delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][delete {[hi!][null][null]}]}");
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId15 = deleteRequest14.getParentTask();
        org.elasticsearch.tasks.Task task16 = deleteRequest7.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId15);
        java.lang.String str17 = deleteRequest7.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType20 = deleteRequest19.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest7.versionType(versionType20);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException22 = deleteRequest21.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure24 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "", (java.lang.Throwable) actionRequestValidationException22, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure26 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "", (java.lang.Throwable) actionRequestValidationException22, "delete {[][hi!][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure28 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}", (java.lang.Throwable) actionRequestValidationException22, "delete {[hi!][null][null]}");
        java.lang.String str29 = shardFailure28.indexUUID;
        java.lang.String str30 = shardFailure28.indexUUID;
        org.junit.Assert.assertNotNull(taskId15);
        org.junit.Assert.assertNotNull(task16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "delete {[hi!][null][null]}" + "'", str17, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType20);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(actionRequestValidationException22);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "delete {[hi!][null][null]}" + "'", str29, "delete {[hi!][null][null]}");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "delete {[hi!][null][null]}" + "'", str30, "delete {[hi!][null][null]}");
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        long long1 = deleteRequest0.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.consistencyLevel(writeConsistencyLevel2);
        java.lang.String str4 = deleteRequest3.getDescription();
        org.elasticsearch.tasks.TaskId taskId8 = null;
        org.elasticsearch.tasks.Task task9 = deleteRequest3.createTask((long) 100, "delete {[][null][null]}", "delete {[][hi!][hi!]}", taskId8);
        java.lang.String str10 = deleteRequest3.type();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[null][null][null]}" + "'", str4, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(task9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        boolean boolean4 = deleteRequest3.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.type("delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        boolean boolean7 = deleteRequest3.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.parent("hi!");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException10 = deleteRequest9.validate();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNull(actionRequestValidationException10);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        deleteRequest3.seqNo((-1L));
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.refresh(false);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.version((long) (byte) 1);
        org.elasticsearch.common.unit.TimeValue timeValue10 = deleteRequest9.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest9.index("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest12.version((long) (byte) 100);
        java.lang.String[] strArray15 = deleteRequest14.indices();
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(timeValue10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][null][null]}", "delete {[hi!][null][null]}", "");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        org.elasticsearch.common.unit.TimeValue timeValue8 = deleteRequest7.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.timeout(timeValue8);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        java.lang.String str19 = deleteRequest18.getDescription();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel20 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest18.consistencyLevel(writeConsistencyLevel20);
        long long22 = deleteRequest18.version();
        org.elasticsearch.tasks.TaskId taskId23 = deleteRequest18.getParentTask();
        org.elasticsearch.tasks.Task task24 = deleteRequest11.createTask((long) (byte) 0, "", "", taskId23);
        org.elasticsearch.index.shard.ShardId shardId25 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest11.setShardId(shardId25);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = new org.elasticsearch.action.delete.DeleteRequest();
        long long28 = deleteRequest27.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel29 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest27.consistencyLevel(writeConsistencyLevel29);
        org.elasticsearch.index.shard.ShardId shardId31 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest30.setShardId(shardId31);
        org.elasticsearch.tasks.TaskId taskId33 = deleteRequest32.getParentTask();
        deleteRequest26.setParentTask(taskId33);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest36 = deleteRequest26.version((long) (byte) 10);
        deleteRequest26.setParentTask("delete {[delete {[hi!][delete {[][hi!][hi!]}][hi!]}][hi!][null]}", (long) (short) 1);
        org.elasticsearch.index.shard.IndexShard indexShard40 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete41 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest26, indexShard40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "delete {[][hi!][hi!]}" + "'", str19, "delete {[][hi!][hi!]}");
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-3L) + "'", long22 == (-3L));
        org.junit.Assert.assertNotNull(taskId23);
        org.junit.Assert.assertNotNull(task24);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertNotNull(taskId33);
        org.junit.Assert.assertNotNull(deleteRequest36);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "delete {[][][delete {[][hi!][hi!]}]}", "delete {[delete {[null][null][hi!]}][hi!][hi!]}");
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[][hi!][hi!]}", "hi!");
        deleteRequest3.seqNo((-1L));
        java.lang.String str6 = deleteRequest3.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.version((long) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.timeout("delete {[delete {[][hi!][hi!]}][null][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[delete {[][hi!][hi!]}][null][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "delete {[hi!][delete {[][hi!][hi!]}][hi!]}" + "'", str6, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.junit.Assert.assertNotNull(deleteRequest8);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][hi!][hi!]}", "delete {[][hi!][hi!]}", "hi!");
        boolean boolean4 = deleteRequest3.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.version(0L);
        org.elasticsearch.index.VersionType versionType7 = deleteRequest6.versionType();
        java.lang.Class<?> wildcardClass8 = deleteRequest6.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(versionType7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType3 = deleteRequest2.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.versionType(versionType3);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.index("delete {[hi!][null][null]}");
        java.lang.String str7 = deleteRequest6.id();
        long long8 = deleteRequest6.primaryTerm();
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        java.lang.String str2 = deleteRequest1.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest1.type("");
        org.elasticsearch.common.transport.TransportAddress transportAddress5 = deleteRequest1.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest1.routing("delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}");
        org.elasticsearch.common.io.stream.StreamInput streamInput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest7.readFrom(streamInput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNull(transportAddress5);
        org.junit.Assert.assertNotNull(deleteRequest7);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        long long1 = deleteRequest0.seqNo();
        boolean boolean2 = deleteRequest0.getShouldPersistResult();
        boolean boolean3 = deleteRequest0.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.index.VersionType versionType5 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.versionType(versionType5);
        deleteRequest4.primaryTerm((long) 1);
        org.elasticsearch.common.unit.TimeValue timeValue9 = deleteRequest4.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest0.timeout(timeValue9);
        java.lang.String str11 = deleteRequest0.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest0.timeout("delete {[hi!][][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[hi!][][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(timeValue9);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.tasks.TaskId taskId9 = deleteRequest8.getParentTask();
        org.elasticsearch.tasks.Task task10 = deleteRequest1.createTask((long) 10, "delete {[hi!][null][null]}", "delete {[][hi!][hi!]}", taskId9);
        java.lang.String str11 = deleteRequest1.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType14 = deleteRequest13.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest1.versionType(versionType14);
        java.lang.String str16 = deleteRequest15.toString();
        org.elasticsearch.common.transport.TransportAddress transportAddress17 = null;
        deleteRequest15.remoteAddress(transportAddress17);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = new org.elasticsearch.action.delete.DeleteRequest();
        long long20 = deleteRequest19.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest19.parent("delete {[][hi!][hi!]}");
        deleteRequest22.seqNo((long) 100);
        org.elasticsearch.common.unit.TimeValue timeValue25 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest22.timeout(timeValue25);
        org.elasticsearch.common.unit.TimeValue timeValue27 = deleteRequest22.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest15.timeout(timeValue27);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel29 = deleteRequest28.consistencyLevel();
        java.lang.String str30 = deleteRequest28.index();
        org.junit.Assert.assertNotNull(taskId9);
        org.junit.Assert.assertNotNull(task10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[hi!][null][null]}" + "'", str11, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(versionType14);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "delete {[hi!][null][null]}" + "'", str16, "delete {[hi!][null][null]}");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertNotNull(timeValue25);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNotNull(timeValue27);
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel29 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel29.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        long long1 = deleteRequest0.seqNo();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.consistencyLevel(writeConsistencyLevel2);
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.setShardId(shardId4);
        org.elasticsearch.action.support.IndicesOptions indicesOptions6 = deleteRequest3.indicesOptions();
        boolean boolean7 = deleteRequest3.refresh();
        org.elasticsearch.action.support.IndicesOptions indicesOptions8 = deleteRequest3.indicesOptions();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.type("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest3.version((long) (short) 0);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest12.routing("delete {[delete {[hi!][delete {[][hi!][hi!]}][hi!]}][hi!][null]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress15 = deleteRequest14.remoteAddress();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(indicesOptions6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(indicesOptions8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNull(transportAddress15);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][hi!][hi!]}", "delete {[][hi!][hi!]}", "hi!");
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
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.VersionType versionType11 = deleteRequest10.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest8.versionType(versionType11);
        long long13 = deleteRequest8.primaryTerm();
        org.elasticsearch.action.support.IndicesOptions indicesOptions14 = deleteRequest8.indicesOptions();
        long long15 = deleteRequest8.version();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest8.type("delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException18 = deleteRequest8.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure20 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting6, "delete {[null][null][null]}", (java.lang.Throwable) actionRequestValidationException18, "delete {[][][delete {[][hi!][hi!]}]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure22 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[delete {[delete {[hi!][null][null]}][delete {[hi!][null][null]}][]}][][]}", (java.lang.Throwable) actionRequestValidationException18, "delete {[][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure24 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[][hi!][hi!]}", (java.lang.Throwable) actionRequestValidationException18, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure26 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "hi!", (java.lang.Throwable) actionRequestValidationException18, "delete {[][][delete {[][hi!][hi!]}]}");
        java.lang.Throwable throwable27 = shardFailure26.cause;
        org.junit.Assert.assertNotNull(versionType11);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(indicesOptions14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-3L) + "'", long15 == (-3L));
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(actionRequestValidationException18);
        org.junit.Assert.assertNotNull(throwable27);
        org.junit.Assert.assertEquals(throwable27.getLocalizedMessage(), "Validation Failed: 1: index is missing;2: id is missing;");
        org.junit.Assert.assertEquals(throwable27.getMessage(), "Validation Failed: 1: index is missing;2: id is missing;");
        org.junit.Assert.assertEquals(throwable27.toString(), "org.elasticsearch.action.ActionRequestValidationException: Validation Failed: 1: index is missing;2: id is missing;");
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        long long7 = deleteRequest6.seqNo();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.parent("delete {[][hi!][hi!]}");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException10 = deleteRequest9.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure12 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[hi!][delete {[][hi!][hi!]}][hi!]}", (java.lang.Throwable) actionRequestValidationException10, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure14 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "hi!", (java.lang.Throwable) actionRequestValidationException10, "hi!");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure16 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[][null][null]}", (java.lang.Throwable) actionRequestValidationException10, "delete {[delete {[hi!][delete {[][hi!][hi!]}][hi!]}][hi!][null]}");
        java.lang.String str17 = shardFailure16.reason;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting18 = shardFailure16.routing;
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(actionRequestValidationException10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "delete {[][null][null]}" + "'", str17, "delete {[][null][null]}");
        org.junit.Assert.assertNull(shardRouting18);
    }
}

