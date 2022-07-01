import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
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
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.util.EnumSet<org.elasticsearch.index.shard.IndexShardState> indexShardStateSet0 = org.elasticsearch.index.shard.IndexShard.writeAllowedStatesForPrimary;
        org.junit.Assert.assertNotNull(indexShardStateSet0);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.common.io.stream.StreamInput streamInput1 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.readFrom(streamInput1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "hi!", deleteRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.tasks.TaskId taskId9 = null;
        deleteRequest3.setParentTask(taskId9);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest3.timeout("hi!");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [hi!] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.index.shard.IndexShard indexShard4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult5 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest3, indexShard4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.id("hi!");
        org.elasticsearch.common.io.stream.StreamOutput streamOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.writeTo(streamOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(deleteRequest6);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue2 = deleteRequest1.timeout();
        org.elasticsearch.index.shard.IndexShard indexShard3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete4 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest1, indexShard3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue2);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.index.shard.IndexShard indexShard1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult2 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest0, indexShard1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.index();
        org.elasticsearch.index.shard.IndexShard indexShard2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete3 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest0, indexShard2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        java.lang.Class<?> wildcardClass2 = deleteRequest1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.index.shard.ShardId shardId5 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.setShardId(shardId5);
        org.elasticsearch.index.shard.IndexShard indexShard7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete8 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest3, indexShard7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(deleteRequest6);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.type();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.writeTo(streamOutput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest3.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = deleteRequest0.remoteAddress();
        org.elasticsearch.index.shard.IndexShard indexShard7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete8 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest0, indexShard7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(transportAddress6);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = deleteRequest10.consistencyLevel();
        org.elasticsearch.action.support.IndicesOptions indicesOptions12 = deleteRequest10.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId13 = null;
        deleteRequest10.setParentTask(taskId13);
        deleteRequest10.primaryTerm((long) 'a');
        org.elasticsearch.common.io.stream.StreamOutput streamOutput17 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest10.writeTo(streamOutput17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel11 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel11.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(indicesOptions12);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str3 = deleteRequest2.toString();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException4 = deleteRequest2.validate();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[][][]}", deleteRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "delete {[null][null][null]}" + "'", str3, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(actionRequestValidationException4);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.id("hi!");
        org.elasticsearch.tasks.TaskId taskId7 = deleteRequest6.getParentTask();
        java.lang.Class<?> wildcardClass8 = taskId7.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(taskId7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        java.lang.String str5 = deleteRequest3.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.type("delete {[][][]}");
        org.elasticsearch.index.shard.IndexShard indexShard8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult9 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest7, indexShard8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(deleteRequest7);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.common.unit.TimeValue timeValue5 = deleteRequest3.timeout();
        long long6 = deleteRequest3.primaryTerm();
        org.elasticsearch.common.io.stream.StreamInput streamInput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.readFrom(streamInput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(timeValue5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        java.lang.String[] strArray11 = deleteRequest10.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId19 = null;
        org.elasticsearch.tasks.Task task20 = deleteRequest15.createTask(0L, "", "", taskId19);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest15.setRefreshPolicy("");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel23 = deleteRequest22.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest10.consistencyLevel(writeConsistencyLevel23);
        deleteRequest24.setParentTask("hi!", (long) (short) 100);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest24.routing("hi!");
        org.elasticsearch.index.shard.IndexShard indexShard30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult31 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest29, indexShard30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(task20);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel23 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel23.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNotNull(deleteRequest29);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        org.elasticsearch.index.VersionType versionType11 = deleteRequest3.versionType();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest3.timeout("delete {[][][hi!]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[][][hi!]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(versionType11);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[null][null][null]}", throwable2, "delete {[][][hi!]}");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting5 = shardFailure4.routing;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting6 = shardFailure4.routing;
        java.lang.String str7 = shardFailure4.indexUUID;
        java.lang.Class<?> wildcardClass8 = shardFailure4.getClass();
        org.junit.Assert.assertNull(shardRouting5);
        org.junit.Assert.assertNull(shardRouting6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "delete {[][][hi!]}" + "'", str7, "delete {[][][hi!]}");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.index.VersionType versionType4 = deleteRequest3.versionType();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.writeTo(streamOutput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType4);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.parent();
        org.elasticsearch.common.transport.TransportAddress transportAddress2 = deleteRequest0.remoteAddress();
        org.elasticsearch.index.shard.IndexShard indexShard3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete4 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest0, indexShard3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(transportAddress2);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
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
        org.elasticsearch.index.shard.SearchOperationListener[] searchOperationListenerArray14 = new org.elasticsearch.index.shard.SearchOperationListener[] {};
        java.util.ArrayList<org.elasticsearch.index.shard.SearchOperationListener> searchOperationListenerList15 = new java.util.ArrayList<org.elasticsearch.index.shard.SearchOperationListener>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.elasticsearch.index.shard.SearchOperationListener>) searchOperationListenerList15, searchOperationListenerArray14);
        org.elasticsearch.index.shard.IndexingOperationListener[] indexingOperationListenerArray17 = new org.elasticsearch.index.shard.IndexingOperationListener[] {};
        java.util.ArrayList<org.elasticsearch.index.shard.IndexingOperationListener> indexingOperationListenerList18 = new java.util.ArrayList<org.elasticsearch.index.shard.IndexingOperationListener>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.elasticsearch.index.shard.IndexingOperationListener>) indexingOperationListenerList18, indexingOperationListenerArray17);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.shard.IndexShard indexShard20 = new org.elasticsearch.index.shard.IndexShard(shardRouting0, indexSettings1, shardPath2, store3, indexCache4, mapperService5, similarityService6, indexFieldDataService7, engineFactory8, indexEventListener9, indexSearcherWrapper10, threadPool11, bigArrays12, warmer13, (java.util.List<org.elasticsearch.index.shard.SearchOperationListener>) searchOperationListenerList15, (java.util.List<org.elasticsearch.index.shard.IndexingOperationListener>) indexingOperationListenerList18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchOperationListenerArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(indexingOperationListenerArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        java.lang.String[] strArray11 = deleteRequest10.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId19 = null;
        org.elasticsearch.tasks.Task task20 = deleteRequest15.createTask(0L, "", "", taskId19);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest15.setRefreshPolicy("");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel23 = deleteRequest22.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest10.consistencyLevel(writeConsistencyLevel23);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest24.setRefreshPolicy("delete {[][][]}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [delete {[][][]}].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(task20);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel23 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel23.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest24);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.version((long) (short) 100);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.routing("delete {[][][hi!]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.setRefreshPolicy("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [hi!].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.id("hi!");
        org.elasticsearch.tasks.TaskId taskId7 = deleteRequest6.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.setRefreshPolicy("");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy10 = deleteRequest6.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId18 = null;
        org.elasticsearch.tasks.Task task19 = deleteRequest14.createTask(0L, "", "", taskId18);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest14.setRefreshPolicy("");
        org.elasticsearch.index.VersionType versionType22 = deleteRequest14.versionType();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel23 = deleteRequest14.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest6.consistencyLevel(writeConsistencyLevel23);
        org.elasticsearch.index.shard.IndexShard indexShard25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete26 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest6, indexShard25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(taskId7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertTrue("'" + refreshPolicy10 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE + "'", refreshPolicy10.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE));
        org.junit.Assert.assertNotNull(task19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(versionType22);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel23 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel23.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest24);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
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
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        long long2 = deleteRequest1.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str4 = deleteRequest3.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue7 = deleteRequest6.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.timeout(timeValue7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.id("delete {[][][hi!]}");
        org.elasticsearch.tasks.TaskId taskId11 = deleteRequest10.getParentTask();
        deleteRequest1.setParentTask(taskId11);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest1.setRefreshPolicy("delete {[null][null][null]}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [delete {[null][null][null]}].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(timeValue7);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(taskId11);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.type("delete {[][][hi!]}");
        org.elasticsearch.index.shard.IndexShard indexShard6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete7 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest3, indexShard6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue2 = deleteRequest1.timeout();
        org.elasticsearch.common.transport.TransportAddress transportAddress3 = null;
        deleteRequest1.remoteAddress(transportAddress3);
        java.lang.String str5 = deleteRequest1.index();
        org.elasticsearch.index.VersionType versionType6 = deleteRequest1.versionType();
        org.elasticsearch.index.shard.IndexShard indexShard7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult8 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest1, indexShard7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "delete {[null][null][null]}" + "'", str5, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(versionType6);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = deleteRequest3.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId17 = null;
        org.elasticsearch.tasks.Task task18 = deleteRequest13.createTask(0L, "", "", taskId17);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy19 = deleteRequest13.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest3.setRefreshPolicy(refreshPolicy19);
        java.lang.String str21 = deleteRequest3.getDescription();
        org.elasticsearch.common.io.stream.StreamInput streamInput22 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.readFrom(streamInput22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(task18);
        org.junit.Assert.assertTrue("'" + refreshPolicy19 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy19.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "delete {[][][]}" + "'", str21, "delete {[][][]}");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        java.lang.String str5 = deleteRequest3.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.type("delete {[][][]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.timeout("delete {[delete {[][][hi!]}][null][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[delete {[][][hi!]}][null][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(deleteRequest7);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = null;
        org.elasticsearch.index.shard.IndexShard indexShard1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult2 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest0, indexShard1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "", "delete {[][][]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = deleteRequest3.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId12 = null;
        org.elasticsearch.tasks.Task task13 = deleteRequest8.createTask(0L, "", "", taskId12);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy14 = deleteRequest8.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest3.setRefreshPolicy(refreshPolicy14);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput16 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest15.writeTo(streamOutput16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(transportAddress4);
        org.junit.Assert.assertNotNull(task13);
        org.junit.Assert.assertTrue("'" + refreshPolicy14 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy14.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest15);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        java.lang.String[] strArray11 = deleteRequest10.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId19 = null;
        org.elasticsearch.tasks.Task task20 = deleteRequest15.createTask(0L, "", "", taskId19);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest15.setRefreshPolicy("");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel23 = deleteRequest22.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest10.consistencyLevel(writeConsistencyLevel23);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest10.timeout("");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(task20);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel23 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel23.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest24);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        java.lang.String[] strArray11 = deleteRequest10.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId19 = null;
        org.elasticsearch.tasks.Task task20 = deleteRequest15.createTask(0L, "", "", taskId19);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest15.setRefreshPolicy("");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel23 = deleteRequest22.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest10.consistencyLevel(writeConsistencyLevel23);
        deleteRequest24.setParentTask("hi!", (long) (short) 100);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest24.routing("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest24.setRefreshPolicy("delete {[delete {[][][hi!]}][null][null]}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [delete {[delete {[][][hi!]}][null][null]}].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(task20);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel23 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel23.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNotNull(deleteRequest29);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue2 = deleteRequest1.timeout();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest1.timeout("delete {[null][null][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[null][null][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue2);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        long long2 = deleteRequest1.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str4 = deleteRequest3.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue7 = deleteRequest6.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.timeout(timeValue7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.id("delete {[][][hi!]}");
        org.elasticsearch.tasks.TaskId taskId11 = deleteRequest10.getParentTask();
        deleteRequest1.setParentTask(taskId11);
        org.elasticsearch.index.shard.IndexShard indexShard13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete14 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest1, indexShard13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(timeValue7);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(taskId11);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = deleteRequest0.consistencyLevel();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput2 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.writeTo(streamOutput2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel1 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel1.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        long long2 = deleteRequest1.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str4 = deleteRequest3.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue7 = deleteRequest6.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.timeout(timeValue7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.id("delete {[][][hi!]}");
        org.elasticsearch.tasks.TaskId taskId11 = deleteRequest10.getParentTask();
        deleteRequest1.setParentTask(taskId11);
        java.lang.Class<?> wildcardClass13 = taskId11.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(timeValue7);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(taskId11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = deleteRequest3.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId17 = null;
        org.elasticsearch.tasks.Task task18 = deleteRequest13.createTask(0L, "", "", taskId17);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy19 = deleteRequest13.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest3.setRefreshPolicy(refreshPolicy19);
        org.elasticsearch.common.io.stream.StreamInput streamInput21 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest20.readFrom(streamInput21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(task18);
        org.junit.Assert.assertTrue("'" + refreshPolicy19 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy19.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest20);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = deleteRequest0.consistencyLevel();
        org.elasticsearch.index.shard.IndexShard indexShard2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult3 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest0, indexShard2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel1 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel1.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.index();
        java.lang.Class<?> wildcardClass2 = deleteRequest0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = deleteRequest10.consistencyLevel();
        org.elasticsearch.action.support.IndicesOptions indicesOptions12 = deleteRequest10.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId13 = null;
        deleteRequest10.setParentTask(taskId13);
        deleteRequest10.primaryTerm((long) (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest10.timeout("delete {[delete {[][][hi!]}][null][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[delete {[][][hi!]}][null][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel11 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel11.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(indicesOptions12);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.tasks.TaskId taskId9 = null;
        deleteRequest3.setParentTask(taskId9);
        org.elasticsearch.index.shard.IndexShard indexShard11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete12 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest3, indexShard11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.parent();
        deleteRequest0.primaryTerm((long) (short) 100);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.setRefreshPolicy("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.type("delete {[null][null][null]}");
        java.lang.String str8 = deleteRequest5.parent();
        java.lang.Class<?> wildcardClass9 = deleteRequest5.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue2 = deleteRequest1.timeout();
        org.elasticsearch.common.transport.TransportAddress transportAddress3 = null;
        deleteRequest1.remoteAddress(transportAddress3);
        java.lang.String str5 = deleteRequest1.index();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest1.setRefreshPolicy("delete {[delete {[][][hi!]}][null][null]}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [delete {[delete {[][][hi!]}][null][null]}].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "delete {[null][null][null]}" + "'", str5, "delete {[null][null][null]}");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = deleteRequest0.consistencyLevel();
        java.lang.String str2 = deleteRequest0.parent();
        org.elasticsearch.index.shard.ShardId shardId3 = deleteRequest0.shardId();
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel1 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel1.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(shardId3);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        org.elasticsearch.index.VersionType versionType11 = deleteRequest3.versionType();
        java.lang.String str12 = deleteRequest3.parent();
        org.elasticsearch.common.transport.TransportAddress transportAddress13 = deleteRequest3.remoteAddress();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest3.setRefreshPolicy("delete {[delete {[][][hi!]}][null][null]}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [delete {[delete {[][][hi!]}][null][null]}].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(versionType11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(transportAddress13);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.getDescription();
        java.lang.String str5 = deleteRequest3.routing();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.writeTo(streamOutput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[][][]}" + "'", str4, "delete {[][][]}");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.id("hi!");
        org.elasticsearch.tasks.TaskId taskId7 = deleteRequest6.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.setRefreshPolicy("");
        org.elasticsearch.common.io.stream.StreamOutput streamOutput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest9.writeTo(streamOutput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(taskId7);
        org.junit.Assert.assertNotNull(deleteRequest9);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str6 = deleteRequest5.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest5.id("hi!");
        org.elasticsearch.tasks.TaskId taskId9 = deleteRequest8.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest8.setRefreshPolicy("");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[delete {[][][hi!]}][null][null]}", deleteRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(taskId9);
        org.junit.Assert.assertNotNull(deleteRequest11);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.type("delete {[][][]}");
        java.lang.String str8 = deleteRequest5.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest5.id("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.parent("delete {[][][]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "", deleteRequest12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "delete {[][][]}" + "'", str8, "delete {[][][]}");
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        java.lang.Class<?> wildcardClass2 = deleteRequest1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("");
        deleteRequest3.primaryTerm((long) (byte) 0);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue8 = deleteRequest7.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.timeout(timeValue8);
        java.lang.String str10 = deleteRequest3.toString();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException11 = deleteRequest3.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure13 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[delete {[][][hi!]}][null][null]}", (java.lang.Throwable) actionRequestValidationException11, "delete {[][null][null]}");
        java.lang.Class<?> wildcardClass14 = shardFailure13.getClass();
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "delete {[][null][null]}" + "'", str10, "delete {[][null][null]}");
        org.junit.Assert.assertNotNull(actionRequestValidationException11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.index();
        org.elasticsearch.common.io.stream.StreamInput streamInput2 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.readFrom(streamInput2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}", "delete {[][][hi!]}", "hi!");
        org.elasticsearch.index.shard.IndexShard indexShard4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult5 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest3, indexShard4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.index("delete {[][][hi!]}");
        java.lang.String str3 = deleteRequest2.parent();
        org.elasticsearch.common.io.stream.StreamInput streamInput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest2.readFrom(streamInput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.parent("delete {[][][]}");
        org.elasticsearch.index.VersionType versionType3 = deleteRequest2.versionType();
        java.lang.Class<?> wildcardClass4 = deleteRequest2.getClass();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = deleteRequest3.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId17 = null;
        org.elasticsearch.tasks.Task task18 = deleteRequest13.createTask(0L, "", "", taskId17);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy19 = deleteRequest13.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest3.setRefreshPolicy(refreshPolicy19);
        org.elasticsearch.index.shard.IndexShard indexShard21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult22 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest3, indexShard21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(task18);
        org.junit.Assert.assertTrue("'" + refreshPolicy19 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy19.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest20);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.index.shard.ShardId shardId5 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.setShardId(shardId5);
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.setShardId(shardId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.routing("delete {[][][hi!]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest10.timeout("hi!");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [hi!] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId9 = null;
        org.elasticsearch.tasks.Task task10 = deleteRequest5.createTask(0L, "", "", taskId9);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy11 = deleteRequest5.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId19 = null;
        org.elasticsearch.tasks.Task task20 = deleteRequest15.createTask(0L, "", "", taskId19);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy21 = deleteRequest15.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest5.setRefreshPolicy(refreshPolicy21);
        java.lang.String str23 = deleteRequest5.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[][null][null]}", deleteRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task10);
        org.junit.Assert.assertTrue("'" + refreshPolicy11 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy11.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(task20);
        org.junit.Assert.assertTrue("'" + refreshPolicy21 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy21.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "delete {[][][]}" + "'", str23, "delete {[][][]}");
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        deleteRequest1.primaryTerm((long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest1.setParentTask("", (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 0 length nodeIds are reserved for EMPTY_TASK_ID and are otherwise invalid.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.parent("delete {[][][]}");
        org.elasticsearch.index.VersionType versionType3 = deleteRequest2.versionType();
        java.lang.String str4 = deleteRequest2.index();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(versionType3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
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
        java.util.List<org.elasticsearch.index.shard.SearchOperationListener> searchOperationListenerList14 = null;
        java.util.List<org.elasticsearch.index.shard.IndexingOperationListener> indexingOperationListenerList15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.shard.IndexShard indexShard16 = new org.elasticsearch.index.shard.IndexShard(shardRouting0, indexSettings1, shardPath2, store3, indexCache4, mapperService5, similarityService6, indexFieldDataService7, engineFactory8, indexEventListener9, indexSearcherWrapper10, threadPool11, bigArrays12, warmer13, searchOperationListenerList14, indexingOperationListenerList15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str7 = deleteRequest6.toString();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException8 = deleteRequest6.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure10 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "hi!", (java.lang.Throwable) actionRequestValidationException8, "delete {[][][]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure12 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "", (java.lang.Throwable) actionRequestValidationException8, "delete {[][][hi!]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure14 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[][delete {[][][]}][delete {[][][]}]}", (java.lang.Throwable) actionRequestValidationException8, "");
        java.lang.Class<?> wildcardClass15 = shardFailure14.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "delete {[null][null][null]}" + "'", str7, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(actionRequestValidationException8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        java.lang.String str11 = deleteRequest10.toString();
        java.lang.String[] strArray12 = deleteRequest10.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest10.index("");
        org.elasticsearch.common.unit.TimeValue timeValue15 = deleteRequest14.timeout();
        deleteRequest14.setParentTask("hi!", (long) 100);
        org.elasticsearch.index.shard.IndexShard indexShard19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult20 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest14, indexShard19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[][][]}" + "'", str11, "delete {[][][]}");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(timeValue15);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
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
        java.util.List<org.elasticsearch.index.shard.SearchOperationListener> searchOperationListenerList14 = null;
        org.elasticsearch.index.shard.IndexingOperationListener[] indexingOperationListenerArray15 = new org.elasticsearch.index.shard.IndexingOperationListener[] {};
        java.util.ArrayList<org.elasticsearch.index.shard.IndexingOperationListener> indexingOperationListenerList16 = new java.util.ArrayList<org.elasticsearch.index.shard.IndexingOperationListener>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.elasticsearch.index.shard.IndexingOperationListener>) indexingOperationListenerList16, indexingOperationListenerArray15);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.shard.IndexShard indexShard18 = new org.elasticsearch.index.shard.IndexShard(shardRouting0, indexSettings1, shardPath2, store3, indexCache4, mapperService5, similarityService6, indexFieldDataService7, engineFactory8, indexEventListener9, indexSearcherWrapper10, threadPool11, bigArrays12, warmer13, searchOperationListenerList14, (java.util.List<org.elasticsearch.index.shard.IndexingOperationListener>) indexingOperationListenerList16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(indexingOperationListenerArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.type("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.id("delete {[][][]}");
        org.elasticsearch.index.shard.IndexShard indexShard8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult9 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest7, indexShard8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest3.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest0.remoteAddress(transportAddress6);
        org.elasticsearch.index.shard.IndexShard indexShard8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult9 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest0, indexShard8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str6 = deleteRequest5.type();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[null][null][null]}", deleteRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.id("hi!");
        org.elasticsearch.tasks.TaskId taskId7 = deleteRequest6.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.setRefreshPolicy("");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy10 = deleteRequest6.getRefreshPolicy();
        long long11 = deleteRequest6.version();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest6.id("delete {[][][]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest6.timeout("delete {[null][null][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[null][null][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(taskId7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertTrue("'" + refreshPolicy10 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE + "'", refreshPolicy10.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-3L) + "'", long11 == (-3L));
        org.junit.Assert.assertNotNull(deleteRequest13);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.type("delete {[][][]}");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy8 = deleteRequest5.getRefreshPolicy();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[null][null][null]}", deleteRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertTrue("'" + refreshPolicy8 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy8.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.index("delete {[][][hi!]}");
        java.lang.String str3 = deleteRequest2.parent();
        org.elasticsearch.action.support.IndicesOptions indicesOptions4 = deleteRequest2.indicesOptions();
        org.elasticsearch.index.shard.IndexShard indexShard5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult6 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest2, indexShard5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(indicesOptions4);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.index("delete {[][][hi!]}");
        java.lang.String str3 = deleteRequest2.parent();
        java.lang.String str4 = deleteRequest2.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest2.version((long) (short) 100);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = deleteRequest6.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId15 = null;
        org.elasticsearch.tasks.Task task16 = deleteRequest11.createTask(0L, "", "", taskId15);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy17 = deleteRequest11.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest6.setRefreshPolicy(refreshPolicy17);
        org.elasticsearch.common.unit.TimeValue timeValue19 = deleteRequest6.timeout();
        org.elasticsearch.common.io.stream.StreamInput streamInput20 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest6.readFrom(streamInput20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel7 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel7.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(task16);
        org.junit.Assert.assertTrue("'" + refreshPolicy17 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy17.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(timeValue19);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest3.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.timeout(timeValue4);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.id("delete {[][][hi!]}");
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest7.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest7.id("");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest7.setRefreshPolicy("delete {[][null][null]}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [delete {[][null][null]}].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNotNull(deleteRequest10);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        org.elasticsearch.index.VersionType versionType11 = deleteRequest3.versionType();
        java.lang.String str12 = deleteRequest3.parent();
        org.elasticsearch.common.transport.TransportAddress transportAddress13 = deleteRequest3.remoteAddress();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest3.setRefreshPolicy("delete {[][delete {[][][]}][delete {[][][]}]}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [delete {[][delete {[][][]}][delete {[][][]}]}].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(versionType11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(transportAddress13);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.type("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.id("delete {[][][]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.timeout("hi!");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [hi!] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        java.lang.String[] strArray11 = deleteRequest10.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId19 = null;
        org.elasticsearch.tasks.Task task20 = deleteRequest15.createTask(0L, "", "", taskId19);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest15.setRefreshPolicy("");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel23 = deleteRequest22.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest10.consistencyLevel(writeConsistencyLevel23);
        org.elasticsearch.index.shard.IndexShard indexShard25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult26 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest10, indexShard25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(task20);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel23 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel23.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest24);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        java.lang.String[] strArray11 = deleteRequest10.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId19 = null;
        org.elasticsearch.tasks.Task task20 = deleteRequest15.createTask(0L, "", "", taskId19);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest15.setRefreshPolicy("");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel23 = deleteRequest22.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest10.consistencyLevel(writeConsistencyLevel23);
        deleteRequest24.setParentTask("hi!", (long) (short) 100);
        org.elasticsearch.index.VersionType versionType28 = deleteRequest24.versionType();
        java.lang.Class<?> wildcardClass29 = deleteRequest24.getClass();
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(task20);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel23 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel23.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNotNull(versionType28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.index("delete {[][][hi!]}");
        java.lang.String str3 = deleteRequest2.parent();
        java.lang.String str4 = deleteRequest2.type();
        long long5 = deleteRequest2.primaryTerm();
        long long6 = deleteRequest2.version();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest2.timeout("delete {[][][hi!]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[][][hi!]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-3L) + "'", long6 == (-3L));
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId9 = null;
        org.elasticsearch.tasks.Task task10 = deleteRequest5.createTask(0L, "", "", taskId9);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest5.setRefreshPolicy("");
        org.elasticsearch.index.VersionType versionType13 = deleteRequest5.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str21 = deleteRequest20.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest20.id("hi!");
        org.elasticsearch.tasks.TaskId taskId24 = deleteRequest23.getParentTask();
        org.elasticsearch.tasks.Task task25 = deleteRequest5.createTask(10L, "delete {[hi!][null][null]}", "delete {[delete {[][][hi!]}][null][null]}", taskId24);
        org.elasticsearch.tasks.TaskId taskId26 = deleteRequest5.getParentTask();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[][null][null]}", deleteRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(versionType13);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(taskId24);
        org.junit.Assert.assertNotNull(task25);
        org.junit.Assert.assertNotNull(taskId26);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.id("hi!");
        org.elasticsearch.tasks.TaskId taskId7 = deleteRequest6.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.setRefreshPolicy("");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy10 = deleteRequest6.getRefreshPolicy();
        long long11 = deleteRequest6.version();
        org.elasticsearch.common.io.stream.StreamInput streamInput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest6.readFrom(streamInput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(taskId7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertTrue("'" + refreshPolicy10 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE + "'", refreshPolicy10.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-3L) + "'", long11 == (-3L));
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest3.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.timeout(timeValue4);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.id("delete {[][][hi!]}");
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest7.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest7.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.index("delete {[][][hi!]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest12.setRefreshPolicy("delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.id("hi!");
        org.elasticsearch.tasks.TaskId taskId7 = deleteRequest6.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.setRefreshPolicy("");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy10 = deleteRequest6.getRefreshPolicy();
        java.lang.String str11 = deleteRequest6.getDescription();
        org.elasticsearch.index.shard.IndexShard indexShard12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult13 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest6, indexShard12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(taskId7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertTrue("'" + refreshPolicy10 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE + "'", refreshPolicy10.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[][][hi!]}" + "'", str11, "delete {[][][hi!]}");
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.type("delete {[][][]}");
        java.lang.String str6 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.id("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.parent("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest14.type("delete {[][][hi!]}");
        org.elasticsearch.index.VersionType versionType17 = deleteRequest16.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest8.versionType(versionType17);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput19 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest8.writeTo(streamOutput19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "delete {[][][]}" + "'", str6, "delete {[][][]}");
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(versionType17);
        org.junit.Assert.assertNotNull(deleteRequest18);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.id("hi!");
        java.lang.String str7 = deleteRequest6.routing();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest6.writeTo(streamOutput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.id("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.setRefreshPolicy("delete {[hi!][delete {[hi!][null][null]}][delete {[delete {[][][hi!]}][null][null]}]}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [delete {[hi!][delete {[hi!][null][null]}][delete {[delete {[][][hi!]}][null][null]}]}].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(deleteRequest6);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest3.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.timeout(timeValue4);
        java.lang.String str6 = deleteRequest0.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest0.timeout("delete {[null][null][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[null][null][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "delete {[null][null][null]}" + "'", str6, "delete {[null][null][null]}");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        long long2 = deleteRequest1.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str4 = deleteRequest3.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue7 = deleteRequest6.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.timeout(timeValue7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.id("delete {[][][hi!]}");
        org.elasticsearch.tasks.TaskId taskId11 = deleteRequest10.getParentTask();
        deleteRequest1.setParentTask(taskId11);
        deleteRequest1.setParentTask("delete {[null][null][null]}", (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(timeValue7);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(taskId11);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest3.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.timeout(timeValue4);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.id("delete {[][][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.version((long) 10);
        org.elasticsearch.common.io.stream.StreamInput streamInput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest7.readFrom(streamInput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.index("delete {[][][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.type("delete {[][][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId12 = null;
        org.elasticsearch.tasks.Task task13 = deleteRequest8.createTask(0L, "", "", taskId12);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy14 = deleteRequest8.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId22 = null;
        org.elasticsearch.tasks.Task task23 = deleteRequest18.createTask(0L, "", "", taskId22);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy24 = deleteRequest18.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest8.setRefreshPolicy(refreshPolicy24);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest4.setRefreshPolicy(refreshPolicy24);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest26.setRefreshPolicy("delete {[][][hi!]}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [delete {[][][hi!]}].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(task13);
        org.junit.Assert.assertTrue("'" + refreshPolicy14 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy14.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(task23);
        org.junit.Assert.assertTrue("'" + refreshPolicy24 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy24.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(deleteRequest26);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest3.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.timeout(timeValue4);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.id("delete {[][][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.version((long) 10);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest7.writeTo(streamOutput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.index("delete {[][][hi!]}");
        org.elasticsearch.index.shard.IndexShard indexShard3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete4 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest2, indexShard3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.parent();
        org.elasticsearch.common.transport.TransportAddress transportAddress2 = deleteRequest0.remoteAddress();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput3 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.writeTo(streamOutput3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(transportAddress2);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        org.elasticsearch.index.VersionType versionType11 = deleteRequest3.versionType();
        java.lang.String str12 = deleteRequest3.parent();
        org.elasticsearch.common.transport.TransportAddress transportAddress13 = deleteRequest3.remoteAddress();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy14 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest3.setRefreshPolicy(refreshPolicy14);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy16 = deleteRequest3.getRefreshPolicy();
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(versionType11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(transportAddress13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNull(refreshPolicy16);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.parent();
        org.elasticsearch.index.VersionType versionType2 = deleteRequest0.versionType();
        java.lang.String[] strArray3 = deleteRequest0.indices();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.writeTo(streamOutput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(versionType2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.type("delete {[][][]}");
        java.lang.String str6 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.id("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = deleteRequest9.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = deleteRequest9.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest3.consistencyLevel(writeConsistencyLevel11);
        org.elasticsearch.common.transport.TransportAddress transportAddress13 = null;
        deleteRequest3.remoteAddress(transportAddress13);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput15 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.writeTo(streamOutput15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "delete {[][][]}" + "'", str6, "delete {[][][]}");
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel11 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel11.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest12);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.getDescription();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest("");
        long long10 = deleteRequest9.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str12 = deleteRequest11.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue15 = deleteRequest14.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest11.timeout(timeValue15);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest16.id("delete {[][][hi!]}");
        org.elasticsearch.tasks.TaskId taskId19 = deleteRequest18.getParentTask();
        deleteRequest9.setParentTask(taskId19);
        org.elasticsearch.tasks.Task task21 = deleteRequest3.createTask((long) ' ', "delete {[][][hi!]}", "delete {[][][]}", taskId19);
        org.elasticsearch.common.transport.TransportAddress transportAddress22 = deleteRequest3.remoteAddress();
        long long23 = deleteRequest3.version();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[][][]}" + "'", str4, "delete {[][][]}");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(timeValue15);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(taskId19);
        org.junit.Assert.assertNotNull(task21);
        org.junit.Assert.assertNull(transportAddress22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-3L) + "'", long23 == (-3L));
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.routing("delete {[][][]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.setRefreshPolicy("delete {[][][hi!]}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [delete {[][][hi!]}].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest8);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.type("delete {[][][]}");
        java.lang.String str6 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.id("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str13 = deleteRequest12.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue16 = deleteRequest15.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest12.timeout(timeValue16);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest17.id("delete {[][][hi!]}");
        org.elasticsearch.tasks.TaskId taskId20 = deleteRequest19.getParentTask();
        org.elasticsearch.tasks.Task task21 = deleteRequest8.createTask((long) ' ', "delete {[delete {[][][hi!]}][null][null]}", "delete {[][null][null]}", taskId20);
        java.lang.Class<?> wildcardClass22 = taskId20.getClass();
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "delete {[][][]}" + "'", str6, "delete {[][][]}");
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(timeValue16);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(taskId20);
        org.junit.Assert.assertNotNull(task21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        deleteRequest10.primaryTerm(1L);
        org.elasticsearch.index.shard.IndexShard indexShard13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete14 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest10, indexShard13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = deleteRequest0.consistencyLevel();
        java.lang.String str2 = deleteRequest0.parent();
        boolean boolean3 = deleteRequest0.getShouldPersistResult();
        org.elasticsearch.index.shard.IndexShard indexShard4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete5 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest0, indexShard4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel1 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel1.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.version((long) (short) 100);
        java.lang.String str4 = deleteRequest3.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.id("delete {[hi!][null][null]}");
        org.elasticsearch.common.io.stream.StreamInput streamInput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest6.readFrom(streamInput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(deleteRequest6);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.timeout("");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        org.elasticsearch.index.VersionType versionType11 = deleteRequest3.versionType();
        java.lang.String str12 = deleteRequest3.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId20 = null;
        org.elasticsearch.tasks.Task task21 = deleteRequest16.createTask(0L, "", "", taskId20);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy22 = deleteRequest16.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest3.setRefreshPolicy(refreshPolicy22);
        org.elasticsearch.common.io.stream.StreamInput streamInput24 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest23.readFrom(streamInput24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(versionType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "delete {[][][]}" + "'", str12, "delete {[][][]}");
        org.junit.Assert.assertNotNull(task21);
        org.junit.Assert.assertTrue("'" + refreshPolicy22 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy22.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest23);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.setShardId(shardId2);
        java.lang.String str4 = deleteRequest3.toString();
        java.lang.Class<?> wildcardClass5 = deleteRequest3.getClass();
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[hi!][null][null]}" + "'", str4, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        long long2 = deleteRequest1.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue3 = deleteRequest1.timeout();
        java.lang.Class<?> wildcardClass4 = timeValue3.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(timeValue3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.index.VersionType versionType4 = deleteRequest3.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.version((long) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.timeout("delete {[hi!][null][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[hi!][null][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType4);
        org.junit.Assert.assertNotNull(deleteRequest6);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.type("delete {[][][]}");
        java.lang.String str6 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.id("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.index("delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress11 = null;
        deleteRequest3.remoteAddress(transportAddress11);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "delete {[][][]}" + "'", str6, "delete {[][][]}");
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.getDescription();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest("");
        long long10 = deleteRequest9.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str12 = deleteRequest11.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue15 = deleteRequest14.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest11.timeout(timeValue15);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest16.id("delete {[][][hi!]}");
        org.elasticsearch.tasks.TaskId taskId19 = deleteRequest18.getParentTask();
        deleteRequest9.setParentTask(taskId19);
        org.elasticsearch.tasks.Task task21 = deleteRequest3.createTask((long) ' ', "delete {[][][hi!]}", "delete {[][][]}", taskId19);
        org.elasticsearch.common.transport.TransportAddress transportAddress22 = deleteRequest3.remoteAddress();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput23 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.writeTo(streamOutput23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[][][]}" + "'", str4, "delete {[][][]}");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(timeValue15);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(taskId19);
        org.junit.Assert.assertNotNull(task21);
        org.junit.Assert.assertNull(transportAddress22);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str6 = deleteRequest5.id();
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest5.setShardId(shardId7);
        org.elasticsearch.index.shard.ShardId shardId9 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest5.setShardId(shardId9);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.parent("delete {[][][]}");
        org.elasticsearch.index.VersionType versionType14 = deleteRequest13.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest10.versionType(versionType14);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[delete {[][][hi!]}][null][null]}", deleteRequest10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(versionType14);
        org.junit.Assert.assertNotNull(deleteRequest15);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        deleteRequest1.primaryTerm((long) (byte) 0);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue6 = deleteRequest5.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest1.timeout(timeValue6);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str9 = deleteRequest8.parent();
        org.elasticsearch.index.VersionType versionType10 = deleteRequest8.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest1.versionType(versionType10);
        long long12 = deleteRequest11.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest11.type("");
        org.elasticsearch.common.unit.TimeValue timeValue15 = deleteRequest11.timeout();
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(versionType10);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(timeValue15);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.index("delete {[][][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.index("");
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
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest3.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.timeout(timeValue4);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.id("delete {[][][hi!]}");
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest7.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest7.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.index("delete {[][][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest10.type("delete {[][][hi!]}");
        org.elasticsearch.common.io.stream.StreamOutput streamOutput15 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest14.writeTo(streamOutput15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest14);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue2 = deleteRequest1.timeout();
        org.elasticsearch.common.transport.TransportAddress transportAddress3 = null;
        deleteRequest1.remoteAddress(transportAddress3);
        org.elasticsearch.common.unit.TimeValue timeValue5 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest1.timeout(timeValue5);
        java.lang.String str7 = deleteRequest1.type();
        org.elasticsearch.index.shard.IndexShard indexShard8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult9 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest1, indexShard8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue2);
        org.junit.Assert.assertNotNull(timeValue5);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.id("hi!");
        org.elasticsearch.tasks.TaskId taskId7 = deleteRequest6.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.setRefreshPolicy("");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy10 = deleteRequest6.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId18 = null;
        org.elasticsearch.tasks.Task task19 = deleteRequest14.createTask(0L, "", "", taskId18);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest14.setRefreshPolicy("");
        org.elasticsearch.index.VersionType versionType22 = deleteRequest14.versionType();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel23 = deleteRequest14.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest6.consistencyLevel(writeConsistencyLevel23);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput25 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest24.writeTo(streamOutput25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(taskId7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertTrue("'" + refreshPolicy10 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE + "'", refreshPolicy10.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE));
        org.junit.Assert.assertNotNull(task19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(versionType22);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel23 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel23.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest24);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.setShardId(shardId2);
        deleteRequest1.primaryTerm((long) 1);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy6 = deleteRequest1.getRefreshPolicy();
        org.elasticsearch.index.shard.IndexShard indexShard7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete8 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest1, indexShard7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertTrue("'" + refreshPolicy6 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy6.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        java.lang.String str5 = deleteRequest3.index();
        java.lang.String str6 = deleteRequest3.parent();
        org.elasticsearch.common.io.stream.StreamInput streamInput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.readFrom(streamInput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        long long2 = deleteRequest1.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest1.index("");
        boolean boolean5 = deleteRequest1.getShouldPersistResult();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest1.writeTo(streamOutput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue2 = deleteRequest1.timeout();
        org.elasticsearch.common.transport.TransportAddress transportAddress3 = null;
        deleteRequest1.remoteAddress(transportAddress3);
        java.lang.String str5 = deleteRequest1.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest1.parent("delete {[hi!][null][null]}");
        org.elasticsearch.common.io.stream.StreamOutput streamOutput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest1.writeTo(streamOutput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "delete {[null][null][null]}" + "'", str5, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest7);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("delete {[][delete {[][][hi!]}][delete {[][][]}]}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [delete {[][delete {[][][hi!]}][delete {[][][]}]}].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId9 = null;
        org.elasticsearch.tasks.Task task10 = deleteRequest5.createTask(0L, "", "", taskId9);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest5.setRefreshPolicy("");
        org.elasticsearch.index.VersionType versionType13 = deleteRequest5.versionType();
        java.lang.String str14 = deleteRequest5.parent();
        org.elasticsearch.common.transport.TransportAddress transportAddress15 = deleteRequest5.remoteAddress();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy16 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest5.setRefreshPolicy(refreshPolicy16);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[][delete {[][][]}][delete {[][][]}]}", deleteRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(versionType13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(transportAddress15);
        org.junit.Assert.assertNotNull(deleteRequest17);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest3.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.timeout(timeValue4);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.id("delete {[][][hi!]}");
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest7.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest7.id("");
        org.elasticsearch.action.support.IndicesOptions indicesOptions11 = deleteRequest7.indicesOptions();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest7.setRefreshPolicy("delete {[delete {[][][]}][delete {[][][hi!]}][delete {[null][null][null]}]}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [delete {[delete {[][][]}][delete {[][][hi!]}][delete {[null][null][null]}]}].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(indicesOptions11);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.type("delete {[][][]}");
        java.lang.String str8 = deleteRequest5.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest5.id("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.parent("delete {[][][]}");
        long long13 = deleteRequest12.version();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[][null][null]}", deleteRequest12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "delete {[][][]}" + "'", str8, "delete {[][][]}");
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-3L) + "'", long13 == (-3L));
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        java.lang.String[] strArray11 = deleteRequest10.indices();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest10.setRefreshPolicy("delete {[delete {[][][hi!]}][null][null]}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [delete {[delete {[][][hi!]}][null][null]}].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[][][hi!]}][null][null]}", "hi!", "hi!");
        org.elasticsearch.index.shard.IndexShard indexShard4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult5 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest3, indexShard4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest3.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = deleteRequest0.remoteAddress();
        long long7 = deleteRequest0.version();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest0.timeout("delete {[][][]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[][][]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(transportAddress6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-3L) + "'", long7 == (-3L));
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest3.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = deleteRequest5.remoteAddress();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest5.setRefreshPolicy("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [hi!].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(transportAddress6);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("hi!");
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.setShardId(shardId4);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.timeout("delete {[][delete {[][][hi!]}][delete {[][][]}]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[][delete {[][][hi!]}][delete {[][][]}]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "delete {[null][null][null]}" + "'", str1, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.routing("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest6.version(1L);
        java.lang.String str11 = deleteRequest10.type();
        org.elasticsearch.index.shard.IndexShard indexShard12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult13 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest10, indexShard12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.parent("delete {[][delete {[][][]}][delete {[][][]}]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.setRefreshPolicy("delete {[][][]}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [delete {[][][]}].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str3 = deleteRequest2.parent();
        deleteRequest2.primaryTerm((long) (short) 100);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest2.setRefreshPolicy("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.type("delete {[null][null][null]}");
        java.lang.String str10 = deleteRequest7.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[][][hi!]}", deleteRequest7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest3.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.timeout(timeValue4);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.id("delete {[][][hi!]}");
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest7.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest7.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.index("delete {[][][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest10.type("delete {[][][hi!]}");
        org.elasticsearch.index.shard.ShardId shardId15 = deleteRequest10.shardId();
        java.lang.String str16 = deleteRequest10.toString();
        java.lang.String str17 = deleteRequest10.getDescription();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNull(shardId15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}" + "'", str16, "delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}" + "'", str17, "delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        deleteRequest1.setParentTask("hi!", (long) (short) 1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.type("delete {[][][]}");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy11 = deleteRequest8.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest1.setRefreshPolicy(refreshPolicy11);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest1.writeTo(streamOutput13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertTrue("'" + refreshPolicy11 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy11.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest12);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        java.lang.String str5 = deleteRequest3.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.type("delete {[][][]}");
        java.lang.String str8 = deleteRequest7.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest7.type("");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = deleteRequest10.consistencyLevel();
        org.elasticsearch.index.shard.IndexShard indexShard12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult13 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest10, indexShard12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "delete {[][][]}" + "'", str8, "delete {[][][]}");
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel11 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel11.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.type("delete {[null][null][null]}");
        java.lang.String str4 = deleteRequest1.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest1.index("");
        java.lang.String str7 = deleteRequest1.index();
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("");
        deleteRequest3.primaryTerm((long) (byte) 0);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue8 = deleteRequest7.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.timeout(timeValue8);
        java.lang.String str10 = deleteRequest3.toString();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException11 = deleteRequest3.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure13 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[delete {[][][hi!]}][null][null]}", (java.lang.Throwable) actionRequestValidationException11, "delete {[][null][null]}");
        java.lang.String str14 = shardFailure13.indexUUID;
        java.lang.String str15 = shardFailure13.indexUUID;
        java.lang.Class<?> wildcardClass16 = shardFailure13.getClass();
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "delete {[][null][null]}" + "'", str10, "delete {[][null][null]}");
        org.junit.Assert.assertNotNull(actionRequestValidationException11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "delete {[][null][null]}" + "'", str14, "delete {[][null][null]}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "delete {[][null][null]}" + "'", str15, "delete {[][null][null]}");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        java.lang.String[] strArray11 = deleteRequest10.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId19 = null;
        org.elasticsearch.tasks.Task task20 = deleteRequest15.createTask(0L, "", "", taskId19);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest15.setRefreshPolicy("");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel23 = deleteRequest22.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest10.consistencyLevel(writeConsistencyLevel23);
        deleteRequest24.setParentTask("hi!", (long) (short) 100);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest24.routing("hi!");
        org.elasticsearch.common.transport.TransportAddress transportAddress30 = deleteRequest29.remoteAddress();
        org.elasticsearch.common.io.stream.StreamInput streamInput31 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest29.readFrom(streamInput31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(task20);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel23 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel23.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertNull(transportAddress30);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[][][hi!]}][null][null]}", "delete {[][][]}", "");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = deleteRequest3.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.type("delete {[][delete {[][][]}][delete {[][][]}]}");
        org.elasticsearch.common.io.stream.StreamInput streamInput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest6.readFrom(streamInput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel4 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel4.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest6);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId9 = null;
        org.elasticsearch.tasks.Task task10 = deleteRequest5.createTask(0L, "", "", taskId9);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException11 = deleteRequest5.validate();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "", deleteRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task10);
        org.junit.Assert.assertNull(actionRequestValidationException11);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.id("hi!");
        org.elasticsearch.tasks.TaskId taskId7 = deleteRequest6.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.setRefreshPolicy("");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy10 = deleteRequest6.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId18 = null;
        org.elasticsearch.tasks.Task task19 = deleteRequest14.createTask(0L, "", "", taskId18);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest14.setRefreshPolicy("");
        org.elasticsearch.index.VersionType versionType22 = deleteRequest14.versionType();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel23 = deleteRequest14.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest6.consistencyLevel(writeConsistencyLevel23);
        boolean boolean25 = deleteRequest6.getShouldPersistResult();
        org.elasticsearch.action.support.IndicesOptions indicesOptions26 = deleteRequest6.indicesOptions();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest6.timeout("delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(taskId7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertTrue("'" + refreshPolicy10 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE + "'", refreshPolicy10.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE));
        org.junit.Assert.assertNotNull(task19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(versionType22);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel23 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel23.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(indicesOptions26);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        org.elasticsearch.index.VersionType versionType11 = deleteRequest3.versionType();
        java.lang.String str12 = deleteRequest3.parent();
        org.elasticsearch.common.transport.TransportAddress transportAddress13 = deleteRequest3.remoteAddress();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy14 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest3.setRefreshPolicy(refreshPolicy14);
        org.elasticsearch.action.support.IndicesOptions indicesOptions16 = deleteRequest3.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException17 = deleteRequest3.validate();
        java.lang.String[] strArray18 = deleteRequest3.indices();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest3.timeout("");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(versionType11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(transportAddress13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(indicesOptions16);
        org.junit.Assert.assertNull(actionRequestValidationException17);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.type("delete {[][][hi!]}");
        org.elasticsearch.index.VersionType versionType6 = deleteRequest5.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "", "delete {[][][]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress11 = deleteRequest10.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId19 = null;
        org.elasticsearch.tasks.Task task20 = deleteRequest15.createTask(0L, "", "", taskId19);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy21 = deleteRequest15.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest10.setRefreshPolicy(refreshPolicy21);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest5.setRefreshPolicy(refreshPolicy21);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest5.id("delete {[delete {[][][]}][delete {[][][hi!]}][delete {[null][null][null]}]}");
        org.elasticsearch.common.io.stream.StreamInput streamInput26 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest5.readFrom(streamInput26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(versionType6);
        org.junit.Assert.assertNull(transportAddress11);
        org.junit.Assert.assertNotNull(task20);
        org.junit.Assert.assertTrue("'" + refreshPolicy21 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy21.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(deleteRequest25);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.type("delete {[][][]}");
        java.lang.String str6 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.id("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId16 = null;
        org.elasticsearch.tasks.Task task17 = deleteRequest12.createTask(0L, "", "", taskId16);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest12.setRefreshPolicy("");
        java.lang.String str20 = deleteRequest19.toString();
        java.lang.String[] strArray21 = deleteRequest19.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest19.index("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str32 = deleteRequest31.id();
        java.lang.String str33 = deleteRequest31.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str35 = deleteRequest34.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest37 = deleteRequest34.version((long) (short) 100);
        org.elasticsearch.tasks.TaskId taskId38 = deleteRequest34.getParentTask();
        deleteRequest31.setParentTask(taskId38);
        deleteRequest27.setParentTask(taskId38);
        deleteRequest23.setParentTask(taskId38);
        deleteRequest8.setParentTask(taskId38);
        java.lang.Class<?> wildcardClass43 = deleteRequest8.getClass();
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "delete {[][][]}" + "'", str6, "delete {[][][]}");
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(task17);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "delete {[][][]}" + "'", str20, "delete {[][][]}");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(deleteRequest37);
        org.junit.Assert.assertNotNull(taskId38);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest3.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.timeout(timeValue4);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.id("delete {[][][hi!]}");
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest7.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest7.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.index("delete {[][][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest10.type("delete {[][][hi!]}");
        org.elasticsearch.index.shard.ShardId shardId15 = deleteRequest10.shardId();
        java.lang.String str16 = deleteRequest10.type();
        org.elasticsearch.index.shard.IndexShard indexShard17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult18 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest10, indexShard17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNull(shardId15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "delete {[][][hi!]}" + "'", str16, "delete {[][][hi!]}");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.id("hi!");
        org.elasticsearch.tasks.TaskId taskId7 = deleteRequest6.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.setRefreshPolicy("");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy10 = deleteRequest6.getRefreshPolicy();
        long long11 = deleteRequest6.version();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest6.id("delete {[][][]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.timeout("delete {[][delete {[][][]}][delete {[][][]}]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[][delete {[][][]}][delete {[][][]}]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(taskId7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertTrue("'" + refreshPolicy10 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE + "'", refreshPolicy10.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-3L) + "'", long11 == (-3L));
        org.junit.Assert.assertNotNull(deleteRequest13);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
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
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        java.lang.String str5 = deleteRequest3.index();
        org.elasticsearch.tasks.TaskId taskId6 = deleteRequest3.getParentTask();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException7 = deleteRequest3.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue10 = deleteRequest9.timeout();
        org.elasticsearch.common.transport.TransportAddress transportAddress11 = null;
        deleteRequest9.remoteAddress(transportAddress11);
        org.elasticsearch.common.unit.TimeValue timeValue13 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest9.timeout(timeValue13);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest3.timeout(timeValue13);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest3.setRefreshPolicy("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [hi!].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(taskId6);
        org.junit.Assert.assertNull(actionRequestValidationException7);
        org.junit.Assert.assertNotNull(timeValue10);
        org.junit.Assert.assertNotNull(timeValue13);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest15);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.type("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.id("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.parent("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.parent("hi!");
        org.elasticsearch.index.VersionType versionType12 = deleteRequest9.versionType();
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(versionType12);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.parent();
        deleteRequest0.primaryTerm((long) (short) 100);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.setRefreshPolicy("");
        org.elasticsearch.index.shard.ShardId shardId6 = deleteRequest5.shardId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(shardId6);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        java.lang.String[] strArray11 = deleteRequest10.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId19 = null;
        org.elasticsearch.tasks.Task task20 = deleteRequest15.createTask(0L, "", "", taskId19);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest15.setRefreshPolicy("");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel23 = deleteRequest22.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest10.consistencyLevel(writeConsistencyLevel23);
        deleteRequest24.setParentTask("hi!", (long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest24.timeout("delete {[][][]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[][][]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(task20);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel23 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel23.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest24);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][null][null]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.setRefreshPolicy("delete {[hi!][delete {[hi!][null][null]}][delete {[delete {[][][hi!]}][null][null]}]}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [delete {[hi!][delete {[hi!][null][null]}][delete {[delete {[][][hi!]}][null][null]}]}].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = deleteRequest3.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId17 = null;
        org.elasticsearch.tasks.Task task18 = deleteRequest13.createTask(0L, "", "", taskId17);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy19 = deleteRequest13.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest3.setRefreshPolicy(refreshPolicy19);
        java.lang.String str21 = deleteRequest3.getDescription();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest3.id("hi!");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel24 = deleteRequest3.consistencyLevel();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest3.setRefreshPolicy("delete {[][delete {[][][hi!]}][delete {[][][]}]}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [delete {[][delete {[][][hi!]}][delete {[][][]}]}].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(task18);
        org.junit.Assert.assertTrue("'" + refreshPolicy19 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy19.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "delete {[][][]}" + "'", str21, "delete {[][][]}");
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel24 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel24.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        java.lang.String[] strArray11 = deleteRequest10.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId19 = null;
        org.elasticsearch.tasks.Task task20 = deleteRequest15.createTask(0L, "", "", taskId19);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest15.setRefreshPolicy("");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel23 = deleteRequest22.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest10.consistencyLevel(writeConsistencyLevel23);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue27 = deleteRequest26.timeout();
        org.elasticsearch.common.transport.TransportAddress transportAddress28 = null;
        deleteRequest26.remoteAddress(transportAddress28);
        org.elasticsearch.common.unit.TimeValue timeValue30 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest26.timeout(timeValue30);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest10.timeout(timeValue30);
        org.elasticsearch.index.shard.IndexShard indexShard33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete34 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest10, indexShard33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(task20);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel23 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel23.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNotNull(timeValue27);
        org.junit.Assert.assertNotNull(timeValue30);
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertNotNull(deleteRequest32);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        deleteRequest1.setParentTask("hi!", (long) (short) 1);
        long long5 = deleteRequest1.version();
        org.elasticsearch.index.shard.IndexShard indexShard6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete7 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest1, indexShard6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-3L) + "'", long5 == (-3L));
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue2 = deleteRequest1.timeout();
        org.elasticsearch.common.transport.TransportAddress transportAddress3 = null;
        deleteRequest1.remoteAddress(transportAddress3);
        java.lang.String str5 = deleteRequest1.index();
        org.elasticsearch.index.VersionType versionType6 = deleteRequest1.versionType();
        java.lang.Class<?> wildcardClass7 = deleteRequest1.getClass();
        org.junit.Assert.assertNotNull(timeValue2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "delete {[null][null][null]}" + "'", str5, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(versionType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.index.shard.ShardId shardId5 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.setShardId(shardId5);
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.setShardId(shardId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        java.lang.String str11 = deleteRequest3.type();
        org.elasticsearch.index.shard.IndexShard indexShard12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult13 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest3, indexShard12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        org.elasticsearch.index.VersionType versionType11 = deleteRequest3.versionType();
        java.lang.String str12 = deleteRequest3.parent();
        org.elasticsearch.common.transport.TransportAddress transportAddress13 = deleteRequest3.remoteAddress();
        long long14 = deleteRequest3.version();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException15 = deleteRequest3.validate();
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(versionType11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(transportAddress13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-3L) + "'", long14 == (-3L));
        org.junit.Assert.assertNull(actionRequestValidationException15);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.type("delete {[][][hi!]}");
        org.elasticsearch.index.VersionType versionType6 = deleteRequest5.versionType();
        deleteRequest5.primaryTerm((-1L));
        org.elasticsearch.common.io.stream.StreamOutput streamOutput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest5.writeTo(streamOutput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(versionType6);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest3.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.timeout(timeValue4);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.id("delete {[][][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.version((long) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.timeout("hi!");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [hi!] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        java.lang.String str5 = deleteRequest3.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.type("delete {[][][]}");
        java.lang.String str8 = deleteRequest7.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest7.type("");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = deleteRequest10.consistencyLevel();
        org.elasticsearch.common.io.stream.StreamInput streamInput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest10.readFrom(streamInput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "delete {[][][]}" + "'", str8, "delete {[][][]}");
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel11 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel11.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.getDescription();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest("");
        long long10 = deleteRequest9.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str12 = deleteRequest11.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue15 = deleteRequest14.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest11.timeout(timeValue15);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest16.id("delete {[][][hi!]}");
        org.elasticsearch.tasks.TaskId taskId19 = deleteRequest18.getParentTask();
        deleteRequest9.setParentTask(taskId19);
        org.elasticsearch.tasks.Task task21 = deleteRequest3.createTask((long) ' ', "delete {[][][hi!]}", "delete {[][][]}", taskId19);
        java.lang.String str22 = deleteRequest3.getDescription();
        org.elasticsearch.common.io.stream.StreamInput streamInput23 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.readFrom(streamInput23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[][][]}" + "'", str4, "delete {[][][]}");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(timeValue15);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(taskId19);
        org.junit.Assert.assertNotNull(task21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "delete {[][][]}" + "'", str22, "delete {[][][]}");
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.index();
        deleteRequest0.setParentTask("delete {[][][hi!]}", (long) '#');
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException5 = deleteRequest0.validate();
        java.lang.Class<?> wildcardClass6 = deleteRequest0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(actionRequestValidationException5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[][null][null]}][][]}", "delete {[delete {[][][hi!]}][null][null]}", "delete {[hi!][null][null]}");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = deleteRequest0.consistencyLevel();
        java.lang.String str2 = deleteRequest0.parent();
        boolean boolean3 = deleteRequest0.getShouldPersistResult();
        boolean boolean4 = deleteRequest0.getShouldPersistResult();
        org.elasticsearch.common.transport.TransportAddress transportAddress5 = null;
        deleteRequest0.remoteAddress(transportAddress5);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel1 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel1.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.id("hi!");
        org.elasticsearch.tasks.TaskId taskId7 = deleteRequest6.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.setRefreshPolicy("");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy10 = deleteRequest6.getRefreshPolicy();
        long long11 = deleteRequest6.version();
        long long12 = deleteRequest6.version();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest6.type("");
        java.lang.String str15 = deleteRequest14.parent();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(taskId7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertTrue("'" + refreshPolicy10 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE + "'", refreshPolicy10.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-3L) + "'", long11 == (-3L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-3L) + "'", long12 == (-3L));
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.parent();
        deleteRequest0.primaryTerm((long) (short) 100);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str5 = deleteRequest4.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest4.version((long) (short) 100);
        java.lang.String str8 = deleteRequest7.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest7.id("delete {[hi!][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest("");
        long long13 = deleteRequest12.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str15 = deleteRequest14.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue18 = deleteRequest17.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest14.timeout(timeValue18);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest19.id("delete {[][][hi!]}");
        org.elasticsearch.tasks.TaskId taskId22 = deleteRequest21.getParentTask();
        deleteRequest12.setParentTask(taskId22);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel24 = deleteRequest12.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest7.consistencyLevel(writeConsistencyLevel24);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest0.consistencyLevel(writeConsistencyLevel24);
        org.elasticsearch.index.shard.IndexShard indexShard27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete28 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest0, indexShard27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(timeValue18);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(taskId22);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel24 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel24.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(deleteRequest26);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.parent();
        deleteRequest0.primaryTerm((long) (short) 100);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.setRefreshPolicy("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.type("delete {[null][null][null]}");
        java.lang.String str8 = deleteRequest5.parent();
        org.elasticsearch.index.VersionType versionType9 = deleteRequest5.versionType();
        java.lang.String[] strArray10 = deleteRequest5.indices();
        org.elasticsearch.index.shard.IndexShard indexShard11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult12 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest5, indexShard11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(versionType9);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException9 = deleteRequest3.validate();
        java.lang.String str10 = deleteRequest3.getDescription();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.writeTo(streamOutput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNull(actionRequestValidationException9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "delete {[][][]}" + "'", str10, "delete {[][][]}");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        org.elasticsearch.index.VersionType versionType11 = deleteRequest3.versionType();
        java.lang.String str12 = deleteRequest3.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId20 = null;
        org.elasticsearch.tasks.Task task21 = deleteRequest16.createTask(0L, "", "", taskId20);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest16.setRefreshPolicy("");
        java.lang.String str24 = deleteRequest23.toString();
        java.lang.String[] strArray25 = deleteRequest23.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest23.index("");
        org.elasticsearch.common.unit.TimeValue timeValue28 = deleteRequest27.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest3.timeout(timeValue28);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "", "delete {[][][]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress34 = deleteRequest33.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest38 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId42 = null;
        org.elasticsearch.tasks.Task task43 = deleteRequest38.createTask(0L, "", "", taskId42);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy44 = deleteRequest38.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest45 = deleteRequest33.setRefreshPolicy(refreshPolicy44);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest46 = deleteRequest29.setRefreshPolicy(refreshPolicy44);
        org.elasticsearch.common.unit.TimeValue timeValue47 = deleteRequest29.timeout();
        java.lang.String str48 = deleteRequest29.index();
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(versionType11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(task21);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "delete {[][][]}" + "'", str24, "delete {[][][]}");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertNotNull(timeValue28);
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertNull(transportAddress34);
        org.junit.Assert.assertNotNull(task43);
        org.junit.Assert.assertTrue("'" + refreshPolicy44 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy44.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest45);
        org.junit.Assert.assertNotNull(deleteRequest46);
        org.junit.Assert.assertNotNull(timeValue47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.index("delete {[][][hi!]}");
        java.lang.String str3 = deleteRequest2.parent();
        java.lang.String str4 = deleteRequest2.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest2.version((long) (short) 100);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = deleteRequest6.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId15 = null;
        org.elasticsearch.tasks.Task task16 = deleteRequest11.createTask(0L, "", "", taskId15);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy17 = deleteRequest11.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest6.setRefreshPolicy(refreshPolicy17);
        java.lang.Class<?> wildcardClass19 = deleteRequest18.getClass();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel7 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel7.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(task16);
        org.junit.Assert.assertTrue("'" + refreshPolicy17 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy17.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId9 = null;
        org.elasticsearch.tasks.Task task10 = deleteRequest5.createTask(0L, "", "", taskId9);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest5.setRefreshPolicy("");
        org.elasticsearch.index.VersionType versionType13 = deleteRequest5.versionType();
        java.lang.String str14 = deleteRequest5.parent();
        org.elasticsearch.common.transport.TransportAddress transportAddress15 = deleteRequest5.remoteAddress();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy16 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest5.setRefreshPolicy(refreshPolicy16);
        org.elasticsearch.action.support.IndicesOptions indicesOptions18 = deleteRequest5.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException19 = deleteRequest5.validate();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[][null][null]}", deleteRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(versionType13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(transportAddress15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(indicesOptions18);
        org.junit.Assert.assertNull(actionRequestValidationException19);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.parent("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.type("delete {[hi!][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue5 = deleteRequest2.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest2.type("hi!");
        org.elasticsearch.common.io.stream.StreamInput streamInput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest2.readFrom(streamInput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(timeValue5);
        org.junit.Assert.assertNotNull(deleteRequest7);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.index("delete {[][][hi!]}");
        java.lang.String str3 = deleteRequest2.parent();
        java.lang.String str4 = deleteRequest2.type();
        long long5 = deleteRequest2.primaryTerm();
        long long6 = deleteRequest2.version();
        java.lang.String str7 = deleteRequest2.type();
        deleteRequest2.primaryTerm(1L);
        org.elasticsearch.common.io.stream.StreamInput streamInput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest2.readFrom(streamInput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-3L) + "'", long6 == (-3L));
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.index.shard.ShardId shardId5 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.setShardId(shardId5);
        org.elasticsearch.action.support.IndicesOptions indicesOptions7 = deleteRequest6.indicesOptions();
        java.lang.String str8 = deleteRequest6.toString();
        org.elasticsearch.index.shard.IndexShard indexShard9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete10 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest6, indexShard9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(indicesOptions7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "delete {[][][]}" + "'", str8, "delete {[][][]}");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.version((long) (short) 100);
        deleteRequest0.primaryTerm(100L);
        boolean boolean6 = deleteRequest0.getShouldPersistResult();
        org.elasticsearch.index.shard.IndexShard indexShard7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult8 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest0, indexShard7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str3 = deleteRequest2.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue6 = deleteRequest5.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest2.timeout(timeValue6);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.id("delete {[][][hi!]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[hi!][null][null]}", deleteRequest7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.timeout("delete {[null][null][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[null][null][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.type("delete {[null][null][null]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[][][]}", deleteRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.id("hi!");
        org.elasticsearch.tasks.TaskId taskId7 = deleteRequest6.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.setRefreshPolicy("");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy10 = deleteRequest6.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId18 = null;
        org.elasticsearch.tasks.Task task19 = deleteRequest14.createTask(0L, "", "", taskId18);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest14.setRefreshPolicy("");
        org.elasticsearch.index.VersionType versionType22 = deleteRequest14.versionType();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel23 = deleteRequest14.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest6.consistencyLevel(writeConsistencyLevel23);
        boolean boolean25 = deleteRequest6.getShouldPersistResult();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest6.setRefreshPolicy("delete {[delete {[][delete {[][][]}][delete {[][][]}]}][null][null]}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [delete {[delete {[][delete {[][][]}][delete {[][][]}]}][null][null]}].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(taskId7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertTrue("'" + refreshPolicy10 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE + "'", refreshPolicy10.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE));
        org.junit.Assert.assertNotNull(task19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(versionType22);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel23 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel23.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[null][null][null]}", throwable2, "delete {[][][]}");
        java.lang.String str5 = shardFailure4.reason;
        java.lang.Throwable throwable6 = shardFailure4.cause;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting7 = shardFailure4.routing;
        java.lang.String str8 = shardFailure4.indexUUID;
        java.lang.String str9 = shardFailure4.indexUUID;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting10 = shardFailure4.routing;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting11 = shardFailure4.routing;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "delete {[null][null][null]}" + "'", str5, "delete {[null][null][null]}");
        org.junit.Assert.assertNull(throwable6);
        org.junit.Assert.assertNull(shardRouting7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "delete {[][][]}" + "'", str8, "delete {[][][]}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "delete {[][][]}" + "'", str9, "delete {[][][]}");
        org.junit.Assert.assertNull(shardRouting10);
        org.junit.Assert.assertNull(shardRouting11);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = deleteRequest3.getRefreshPolicy();
        org.elasticsearch.index.shard.ShardId shardId10 = deleteRequest3.shardId();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.index("delete {[][][hi!]}");
        java.lang.String str14 = deleteRequest13.parent();
        org.elasticsearch.action.support.IndicesOptions indicesOptions15 = deleteRequest13.indicesOptions();
        org.elasticsearch.index.VersionType versionType16 = deleteRequest13.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest3.versionType(versionType16);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException18 = deleteRequest3.validate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = actionRequestValidationException18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNull(shardId10);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(indicesOptions15);
        org.junit.Assert.assertNotNull(versionType16);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNull(actionRequestValidationException18);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][null][null]}", "hi!", "delete {[][][]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[hi!][null][null]}", deleteRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.index("delete {[][][hi!]}");
        java.lang.String str3 = deleteRequest2.parent();
        java.lang.String str4 = deleteRequest2.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest2.parent("delete {[][][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest2.parent("delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.routing("delete {[][][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.index("delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}");
        java.lang.Class<?> wildcardClass13 = deleteRequest10.getClass();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[delete {[][][hi!]}][null][null]}" + "'", str4, "delete {[delete {[][][hi!]}][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        long long2 = deleteRequest1.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest1.index("");
        boolean boolean5 = deleteRequest1.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest1.version((long) 1);
        org.elasticsearch.index.shard.IndexShard indexShard8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete9 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest1, indexShard8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(deleteRequest7);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.index("delete {[][][hi!]}");
        java.lang.String str3 = deleteRequest2.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.id("delete {[][][]}");
        org.elasticsearch.index.shard.IndexShard indexShard6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete7 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest5, indexShard6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(deleteRequest5);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.index("delete {[][][hi!]}");
        java.lang.String str3 = deleteRequest2.parent();
        java.lang.String str4 = deleteRequest2.type();
        java.lang.String str5 = deleteRequest2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest2.setRefreshPolicy("delete {[][delete {[][][]}][delete {[][][]}]}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [delete {[][delete {[][][]}][delete {[][][]}]}].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "delete {[delete {[][][hi!]}][null][null]}" + "'", str5, "delete {[delete {[][][hi!]}][null][null]}");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str5 = deleteRequest4.toString();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException6 = deleteRequest4.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure8 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[][null][null]}", (java.lang.Throwable) actionRequestValidationException6, "delete {[][null][null]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure10 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[delete {[][][]}][delete {[][][hi!]}][delete {[null][null][null]}]}", (java.lang.Throwable) actionRequestValidationException6, "delete {[delete {[][][hi!]}][null][null]}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "delete {[null][null][null]}" + "'", str5, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(actionRequestValidationException6);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.type("delete {[][][]}");
        java.lang.String str6 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.id("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.parent("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest14.type("delete {[][][hi!]}");
        org.elasticsearch.index.VersionType versionType17 = deleteRequest16.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest8.versionType(versionType17);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel19 = deleteRequest8.consistencyLevel();
        java.lang.Class<?> wildcardClass20 = deleteRequest8.getClass();
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "delete {[][][]}" + "'", str6, "delete {[][][]}");
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(versionType17);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel19 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel19.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        org.elasticsearch.index.VersionType versionType11 = deleteRequest3.versionType();
        java.lang.String str12 = deleteRequest3.parent();
        org.elasticsearch.common.transport.TransportAddress transportAddress13 = deleteRequest3.remoteAddress();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy14 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest3.setRefreshPolicy(refreshPolicy14);
        org.elasticsearch.action.support.IndicesOptions indicesOptions16 = deleteRequest3.indicesOptions();
        org.elasticsearch.index.shard.ShardId shardId17 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest3.setShardId(shardId17);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest3.timeout("delete {[hi!][delete {[hi!][null][null]}][delete {[delete {[][][hi!]}][null][null]}]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[hi!][delete {[hi!][null][null]}][delete {[delete {[][][hi!]}][null][null]}]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(versionType11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(transportAddress13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(indicesOptions16);
        org.junit.Assert.assertNotNull(deleteRequest18);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.index("delete {[][][hi!]}");
        java.lang.String str3 = deleteRequest2.parent();
        java.lang.String str4 = deleteRequest2.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest2.version((long) (short) 100);
        boolean boolean7 = deleteRequest2.getShouldPersistResult();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest2.setRefreshPolicy("delete {[delete {[][][hi!]}][null][null]}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [delete {[delete {[][][hi!]}][null][null]}].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        org.elasticsearch.index.VersionType versionType11 = deleteRequest3.versionType();
        java.lang.String str12 = deleteRequest3.parent();
        org.elasticsearch.common.transport.TransportAddress transportAddress13 = deleteRequest3.remoteAddress();
        long long14 = deleteRequest3.version();
        org.elasticsearch.common.io.stream.StreamInput streamInput15 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.readFrom(streamInput15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(versionType11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(transportAddress13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-3L) + "'", long14 == (-3L));
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str3 = deleteRequest2.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.version((long) (short) 100);
        org.elasticsearch.tasks.TaskId taskId6 = deleteRequest2.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest2.id("delete {[][][hi!]}");
        java.lang.String[] strArray9 = deleteRequest2.indices();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}", deleteRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(taskId6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel9 = deleteRequest3.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "", "delete {[][][]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress14 = deleteRequest13.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId22 = null;
        org.elasticsearch.tasks.Task task23 = deleteRequest18.createTask(0L, "", "", taskId22);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy24 = deleteRequest18.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest13.setRefreshPolicy(refreshPolicy24);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest3.setRefreshPolicy(refreshPolicy24);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest26.timeout("delete {[delete {[][][]}][delete {[][][hi!]}][delete {[null][null][null]}]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[delete {[][][]}][delete {[][][hi!]}][delete {[null][null][null]}]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel9 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel9.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNull(transportAddress14);
        org.junit.Assert.assertNotNull(task23);
        org.junit.Assert.assertTrue("'" + refreshPolicy24 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy24.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(deleteRequest26);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        long long2 = deleteRequest1.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest1.index("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest1.parent("hi!");
        org.elasticsearch.common.io.stream.StreamOutput streamOutput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest6.writeTo(streamOutput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        deleteRequest1.setParentTask("hi!", (long) (short) 1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.type("delete {[][][]}");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy11 = deleteRequest8.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest1.setRefreshPolicy(refreshPolicy11);
        org.elasticsearch.tasks.TaskId taskId13 = deleteRequest1.getParentTask();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput14 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest1.writeTo(streamOutput14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertTrue("'" + refreshPolicy11 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy11.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(taskId13);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][][hi!]}");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        java.lang.String str5 = deleteRequest3.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str7 = deleteRequest6.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.version((long) (short) 100);
        org.elasticsearch.tasks.TaskId taskId10 = deleteRequest6.getParentTask();
        deleteRequest3.setParentTask(taskId10);
        org.elasticsearch.tasks.TaskId taskId12 = deleteRequest3.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest3.version(100L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest3.routing("delete {[][][hi!]}");
        java.lang.String str17 = deleteRequest16.index();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput18 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest16.writeTo(streamOutput18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(taskId10);
        org.junit.Assert.assertNotNull(taskId12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.type("delete {[null][null][null]}");
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest1.setShardId(shardId4);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.setRefreshPolicy("delete {[][delete {[][][]}][delete {[][][]}]}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [delete {[][delete {[][][]}][delete {[][][]}]}].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = deleteRequest3.getRefreshPolicy();
        org.elasticsearch.index.shard.ShardId shardId10 = deleteRequest3.shardId();
        java.lang.String str11 = deleteRequest3.getDescription();
        long long12 = deleteRequest3.primaryTerm();
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNull(shardId10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[][][]}" + "'", str11, "delete {[][][]}");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.getDescription();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest("");
        long long10 = deleteRequest9.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str12 = deleteRequest11.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue15 = deleteRequest14.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest11.timeout(timeValue15);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest16.id("delete {[][][hi!]}");
        org.elasticsearch.tasks.TaskId taskId19 = deleteRequest18.getParentTask();
        deleteRequest9.setParentTask(taskId19);
        org.elasticsearch.tasks.Task task21 = deleteRequest3.createTask((long) ' ', "delete {[][][hi!]}", "delete {[][][]}", taskId19);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel22 = deleteRequest3.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest3.type("delete {[][][hi!]}");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException25 = deleteRequest24.validate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[][][]}" + "'", str4, "delete {[][][]}");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(timeValue15);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(taskId19);
        org.junit.Assert.assertNotNull(task21);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel22 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel22.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNull(actionRequestValidationException25);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest3.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = null;
        deleteRequest0.remoteAddress(transportAddress6);
        org.elasticsearch.index.shard.IndexShard indexShard8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete9 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest0, indexShard8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.index();
        deleteRequest0.setParentTask("delete {[][][hi!]}", (long) '#');
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException5 = deleteRequest0.validate();
        long long6 = deleteRequest0.primaryTerm();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest0.timeout("delete {[][][hi!]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[][][hi!]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(actionRequestValidationException5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId9 = null;
        org.elasticsearch.tasks.Task task10 = deleteRequest5.createTask(0L, "", "", taskId9);
        org.elasticsearch.common.unit.TimeValue timeValue11 = deleteRequest5.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str16 = deleteRequest15.id();
        java.lang.String str17 = deleteRequest15.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest15.type("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str24 = deleteRequest23.parent();
        deleteRequest23.primaryTerm((long) (short) 100);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest23.setRefreshPolicy("");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy29 = deleteRequest28.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str31 = deleteRequest30.toString();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException32 = deleteRequest30.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = new org.elasticsearch.action.delete.DeleteRequest("");
        deleteRequest34.primaryTerm((long) (byte) 0);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest38 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue39 = deleteRequest38.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest40 = deleteRequest34.timeout(timeValue39);
        java.lang.String str41 = deleteRequest34.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest48 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str49 = deleteRequest48.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest53 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest55 = deleteRequest53.type("delete {[][][]}");
        java.lang.String str56 = deleteRequest53.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest58 = deleteRequest53.id("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest62 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId66 = null;
        org.elasticsearch.tasks.Task task67 = deleteRequest62.createTask(0L, "", "", taskId66);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest69 = deleteRequest62.setRefreshPolicy("");
        java.lang.String str70 = deleteRequest69.toString();
        java.lang.String[] strArray71 = deleteRequest69.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest73 = deleteRequest69.index("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest77 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest81 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str82 = deleteRequest81.id();
        java.lang.String str83 = deleteRequest81.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest84 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str85 = deleteRequest84.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest87 = deleteRequest84.version((long) (short) 100);
        org.elasticsearch.tasks.TaskId taskId88 = deleteRequest84.getParentTask();
        deleteRequest81.setParentTask(taskId88);
        deleteRequest77.setParentTask(taskId88);
        deleteRequest73.setParentTask(taskId88);
        deleteRequest58.setParentTask(taskId88);
        deleteRequest48.setParentTask(taskId88);
        org.elasticsearch.tasks.Task task94 = deleteRequest34.createTask((long) 100, "delete {[][][hi!]}", "hi!", taskId88);
        deleteRequest30.setParentTask(taskId88);
        deleteRequest28.setParentTask(taskId88);
        org.elasticsearch.tasks.Task task97 = deleteRequest19.createTask((long) 'a', "delete {[delete {[][][hi!]}][null][null]}", "delete {[][null][null]}", taskId88);
        deleteRequest5.setParentTask(taskId88);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[][delete {[][][]}][delete {[][][]}]}", deleteRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task10);
        org.junit.Assert.assertNotNull(timeValue11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertTrue("'" + refreshPolicy29 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE + "'", refreshPolicy29.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "delete {[null][null][null]}" + "'", str31, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(actionRequestValidationException32);
        org.junit.Assert.assertNotNull(timeValue39);
        org.junit.Assert.assertNotNull(deleteRequest40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(deleteRequest55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "delete {[][][]}" + "'", str56, "delete {[][][]}");
        org.junit.Assert.assertNotNull(deleteRequest58);
        org.junit.Assert.assertNotNull(task67);
        org.junit.Assert.assertNotNull(deleteRequest69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "delete {[][][]}" + "'", str70, "delete {[][][]}");
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(deleteRequest73);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertNull(str85);
        org.junit.Assert.assertNotNull(deleteRequest87);
        org.junit.Assert.assertNotNull(taskId88);
        org.junit.Assert.assertNotNull(task94);
        org.junit.Assert.assertNotNull(task97);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][delete {[hi!][delete {[hi!][null][null]}][delete {[delete {[][][hi!]}][null][null]}]}][delete {[][][]}]}", "delete {[delete {[][null][null]}][][]}", "delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.index("delete {[][][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.type("delete {[][][hi!]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[delete {[][delete {[][][]}][delete {[][][]}]}][null][null]}", deleteRequest4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(deleteRequest6);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][delete {[][][]}][delete {[][][]}]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.timeout("delete {[][delete {[hi!][delete {[hi!][null][null]}][delete {[delete {[][][hi!]}][null][null]}]}][delete {[][][]}]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[][delete {[hi!][delete {[hi!][null][null]}][delete {[delete {[][][hi!]}][null][null]}]}][delete {[][][]}]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.id("hi!");
        org.elasticsearch.tasks.TaskId taskId7 = deleteRequest6.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.setRefreshPolicy("");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy10 = deleteRequest6.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId18 = null;
        org.elasticsearch.tasks.Task task19 = deleteRequest14.createTask(0L, "", "", taskId18);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest14.setRefreshPolicy("");
        org.elasticsearch.index.VersionType versionType22 = deleteRequest14.versionType();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel23 = deleteRequest14.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest6.consistencyLevel(writeConsistencyLevel23);
        org.elasticsearch.index.shard.ShardId shardId25 = deleteRequest24.shardId();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest24.version((long) (short) 1);
        java.lang.String[] strArray28 = deleteRequest24.indices();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest24.timeout("delete {[delete {[][null][null]}][][]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[delete {[][null][null]}][][]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(taskId7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertTrue("'" + refreshPolicy10 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE + "'", refreshPolicy10.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE));
        org.junit.Assert.assertNotNull(task19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(versionType22);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel23 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel23.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNull(shardId25);
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertNotNull(strArray28);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "", "delete {[][][]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = deleteRequest3.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId12 = null;
        org.elasticsearch.tasks.Task task13 = deleteRequest8.createTask(0L, "", "", taskId12);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy14 = deleteRequest8.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest3.setRefreshPolicy(refreshPolicy14);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest3.id("delete {[hi!][null][null]}");
        org.elasticsearch.index.shard.ShardId shardId18 = deleteRequest17.shardId();
        org.junit.Assert.assertNull(transportAddress4);
        org.junit.Assert.assertNotNull(task13);
        org.junit.Assert.assertTrue("'" + refreshPolicy14 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy14.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNull(shardId18);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.type("delete {[null][null][null]}");
        java.lang.Class<?> wildcardClass4 = deleteRequest1.getClass();
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.parent();
        deleteRequest0.primaryTerm((long) (short) 100);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.setRefreshPolicy("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.type("delete {[null][null][null]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = null;
        deleteRequest5.remoteAddress(transportAddress8);
        java.lang.String str10 = deleteRequest5.id();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest5.writeTo(streamOutput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "", "delete {[][][]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = deleteRequest3.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId12 = null;
        org.elasticsearch.tasks.Task task13 = deleteRequest8.createTask(0L, "", "", taskId12);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy14 = deleteRequest8.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest3.setRefreshPolicy(refreshPolicy14);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest3.id("delete {[hi!][null][null]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest17.timeout("delete {[][delete {[hi!][delete {[hi!][null][null]}][delete {[delete {[][][hi!]}][null][null]}]}][delete {[][][]}]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[][delete {[hi!][delete {[hi!][null][null]}][delete {[delete {[][][hi!]}][null][null]}]}][delete {[][][]}]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(transportAddress4);
        org.junit.Assert.assertNotNull(task13);
        org.junit.Assert.assertTrue("'" + refreshPolicy14 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy14.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest17);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.getDescription();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest("");
        long long10 = deleteRequest9.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str12 = deleteRequest11.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue15 = deleteRequest14.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest11.timeout(timeValue15);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest16.id("delete {[][][hi!]}");
        org.elasticsearch.tasks.TaskId taskId19 = deleteRequest18.getParentTask();
        deleteRequest9.setParentTask(taskId19);
        org.elasticsearch.tasks.Task task21 = deleteRequest3.createTask((long) ' ', "delete {[][][hi!]}", "delete {[][][]}", taskId19);
        org.elasticsearch.common.transport.TransportAddress transportAddress22 = deleteRequest3.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest3.id("delete {[null][null][null]}");
        org.elasticsearch.index.shard.IndexShard indexShard25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult26 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest24, indexShard25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[][][]}" + "'", str4, "delete {[][][]}");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(timeValue15);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(taskId19);
        org.junit.Assert.assertNotNull(task21);
        org.junit.Assert.assertNull(transportAddress22);
        org.junit.Assert.assertNotNull(deleteRequest24);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId9 = null;
        org.elasticsearch.tasks.Task task10 = deleteRequest5.createTask(0L, "", "", taskId9);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest5.setRefreshPolicy("");
        org.elasticsearch.index.VersionType versionType13 = deleteRequest5.versionType();
        java.lang.String str14 = deleteRequest5.parent();
        org.elasticsearch.common.transport.TransportAddress transportAddress15 = deleteRequest5.remoteAddress();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy16 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest5.setRefreshPolicy(refreshPolicy16);
        org.elasticsearch.action.support.IndicesOptions indicesOptions18 = deleteRequest5.indicesOptions();
        org.elasticsearch.index.shard.ShardId shardId19 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest5.setShardId(shardId19);
        org.elasticsearch.index.shard.ShardId shardId21 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest5.setShardId(shardId21);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[][][hi!]}", deleteRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(versionType13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(transportAddress15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(indicesOptions18);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(deleteRequest22);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str6 = deleteRequest5.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest5.id("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "hi!", deleteRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(deleteRequest8);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest3.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.timeout(timeValue4);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.id("delete {[][][hi!]}");
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest7.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest7.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.index("delete {[][][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest16.type("delete {[][][hi!]}");
        java.lang.String str19 = deleteRequest16.getDescription();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy20 = deleteRequest16.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest10.setRefreshPolicy(refreshPolicy20);
        boolean boolean22 = deleteRequest10.getShouldPersistResult();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "delete {[][delete {[][][hi!]}][delete {[][][]}]}" + "'", str19, "delete {[][delete {[][][hi!]}][delete {[][][]}]}");
        org.junit.Assert.assertTrue("'" + refreshPolicy20 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy20.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue2 = deleteRequest1.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest1.id("");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.timeout("delete {[][][hi!]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[][][hi!]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue2);
        org.junit.Assert.assertNotNull(deleteRequest4);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[][delete {[][][hi!]}][delete {[][][]}]}", deleteRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        java.lang.String str5 = deleteRequest3.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str7 = deleteRequest6.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.version((long) (short) 100);
        org.elasticsearch.tasks.TaskId taskId10 = deleteRequest6.getParentTask();
        deleteRequest3.setParentTask(taskId10);
        org.elasticsearch.tasks.TaskId taskId12 = deleteRequest3.getParentTask();
        org.elasticsearch.index.VersionType versionType13 = deleteRequest3.versionType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(taskId10);
        org.junit.Assert.assertNotNull(taskId12);
        org.junit.Assert.assertNotNull(versionType13);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[][][]}][delete {[][][hi!]}][delete {[null][null][null]}]}");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.type("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.id("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.parent("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.timeout("delete {[delete {[][][]}][delete {[][][hi!]}][delete {[null][null][null]}]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[delete {[][][]}][delete {[][][hi!]}][delete {[null][null][null]}]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[null][null][null]}");
        deleteRequest3.setParentTask("delete {[delete {[][null][null]}][][]}", (long) (short) 10);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.version((long) (short) 100);
        java.lang.String str4 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue7 = deleteRequest6.timeout();
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = null;
        deleteRequest6.remoteAddress(transportAddress8);
        java.lang.String str10 = deleteRequest6.index();
        org.elasticsearch.index.VersionType versionType11 = deleteRequest6.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest0.versionType(versionType11);
        java.lang.String str13 = deleteRequest12.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(timeValue7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "delete {[null][null][null]}" + "'", str10, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(versionType11);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "delete {[null][null][null]}" + "'", str13, "delete {[null][null][null]}");
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.setShardId(shardId2);
        java.lang.String str4 = deleteRequest1.routing();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest1.writeTo(streamOutput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = deleteRequest0.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = deleteRequest0.consistencyLevel();
        deleteRequest0.setParentTask("delete {[delete {[][][hi!]}][null][null]}", (long) 100);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId13 = null;
        org.elasticsearch.tasks.Task task14 = deleteRequest9.createTask(0L, "", "", taskId13);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest9.setRefreshPolicy("");
        org.elasticsearch.index.VersionType versionType17 = deleteRequest9.versionType();
        java.lang.String str18 = deleteRequest9.parent();
        org.elasticsearch.common.transport.TransportAddress transportAddress19 = deleteRequest9.remoteAddress();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy20 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest9.setRefreshPolicy(refreshPolicy20);
        long long22 = deleteRequest9.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue23 = deleteRequest9.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest0.timeout(timeValue23);
        java.lang.Class<?> wildcardClass25 = deleteRequest0.getClass();
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel1 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel1.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel2 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel2.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(task14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(versionType17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(transportAddress19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(timeValue23);
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][delete {[][][]}][delete {[][][]}]}", "", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.index("delete {[delete {[][null][null]}][][]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.setRefreshPolicy("delete {[delete {[delete {[][][]}][delete {[][][hi!]}][delete {[null][null][null]}]}][null][null]}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [delete {[delete {[delete {[][][]}][delete {[][][hi!]}][delete {[null][null][null]}]}][null][null]}].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.id("hi!");
        org.elasticsearch.tasks.TaskId taskId7 = deleteRequest6.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.setRefreshPolicy("");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy10 = deleteRequest6.getRefreshPolicy();
        java.lang.String str11 = deleteRequest6.index();
        org.elasticsearch.common.transport.TransportAddress transportAddress12 = deleteRequest6.remoteAddress();
        org.elasticsearch.index.shard.ShardId shardId13 = deleteRequest6.shardId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(taskId7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertTrue("'" + refreshPolicy10 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE + "'", refreshPolicy10.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(transportAddress12);
        org.junit.Assert.assertNull(shardId13);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = deleteRequest0.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = deleteRequest0.consistencyLevel();
        deleteRequest0.primaryTerm((long) (short) 10);
        long long5 = deleteRequest0.version();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId16 = null;
        org.elasticsearch.tasks.Task task17 = deleteRequest12.createTask(0L, "", "", taskId16);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest12.setRefreshPolicy("");
        java.lang.String str20 = deleteRequest19.toString();
        java.lang.String[] strArray21 = deleteRequest19.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest19.index("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str32 = deleteRequest31.id();
        java.lang.String str33 = deleteRequest31.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str35 = deleteRequest34.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest37 = deleteRequest34.version((long) (short) 100);
        org.elasticsearch.tasks.TaskId taskId38 = deleteRequest34.getParentTask();
        deleteRequest31.setParentTask(taskId38);
        deleteRequest27.setParentTask(taskId38);
        deleteRequest23.setParentTask(taskId38);
        org.elasticsearch.tasks.Task task42 = deleteRequest0.createTask((-1L), "delete {[][delete {[][][]}][delete {[][][]}]}", "delete {[][][hi!]}", taskId38);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput43 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.writeTo(streamOutput43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel1 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel1.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel2 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel2.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-3L) + "'", long5 == (-3L));
        org.junit.Assert.assertNotNull(task17);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "delete {[][][]}" + "'", str20, "delete {[][][]}");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(deleteRequest37);
        org.junit.Assert.assertNotNull(taskId38);
        org.junit.Assert.assertNotNull(task42);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        org.elasticsearch.index.VersionType versionType11 = deleteRequest3.versionType();
        java.lang.String str12 = deleteRequest3.parent();
        org.elasticsearch.common.transport.TransportAddress transportAddress13 = deleteRequest3.remoteAddress();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy14 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest3.setRefreshPolicy(refreshPolicy14);
        java.lang.String str16 = deleteRequest15.getDescription();
        java.lang.String str17 = deleteRequest15.routing();
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(versionType11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(transportAddress13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "delete {[][][]}" + "'", str16, "delete {[][][]}");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        java.lang.String[] strArray11 = deleteRequest10.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("");
        long long14 = deleteRequest13.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str16 = deleteRequest15.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue19 = deleteRequest18.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest15.timeout(timeValue19);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest20.id("delete {[][][hi!]}");
        org.elasticsearch.tasks.TaskId taskId23 = deleteRequest22.getParentTask();
        deleteRequest13.setParentTask(taskId23);
        deleteRequest10.setParentTask(taskId23);
        org.elasticsearch.common.io.stream.StreamInput streamInput26 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest10.readFrom(streamInput26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(timeValue19);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertNotNull(taskId23);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = deleteRequest10.consistencyLevel();
        org.elasticsearch.action.support.IndicesOptions indicesOptions12 = deleteRequest10.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId13 = null;
        deleteRequest10.setParentTask(taskId13);
        deleteRequest10.primaryTerm((long) (-1));
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest23.type("delete {[][][]}");
        java.lang.String str26 = deleteRequest23.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest23.id("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str33 = deleteRequest32.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue36 = deleteRequest35.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest37 = deleteRequest32.timeout(timeValue36);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest39 = deleteRequest37.id("delete {[][][hi!]}");
        org.elasticsearch.tasks.TaskId taskId40 = deleteRequest39.getParentTask();
        org.elasticsearch.tasks.Task task41 = deleteRequest28.createTask((long) ' ', "delete {[delete {[][][hi!]}][null][null]}", "delete {[][null][null]}", taskId40);
        org.elasticsearch.tasks.Task task42 = deleteRequest10.createTask((long) (short) 0, "hi!", "delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}", taskId40);
        java.lang.Class<?> wildcardClass43 = deleteRequest10.getClass();
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel11 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel11.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(indicesOptions12);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "delete {[][][]}" + "'", str26, "delete {[][][]}");
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(timeValue36);
        org.junit.Assert.assertNotNull(deleteRequest37);
        org.junit.Assert.assertNotNull(deleteRequest39);
        org.junit.Assert.assertNotNull(taskId40);
        org.junit.Assert.assertNotNull(task41);
        org.junit.Assert.assertNotNull(task42);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        java.lang.String str5 = deleteRequest3.index();
        org.elasticsearch.tasks.TaskId taskId6 = deleteRequest3.getParentTask();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException7 = deleteRequest3.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue10 = deleteRequest9.timeout();
        org.elasticsearch.common.transport.TransportAddress transportAddress11 = null;
        deleteRequest9.remoteAddress(transportAddress11);
        org.elasticsearch.common.unit.TimeValue timeValue13 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest9.timeout(timeValue13);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest3.timeout(timeValue13);
        org.elasticsearch.index.shard.IndexShard indexShard16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete17 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest3, indexShard16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(taskId6);
        org.junit.Assert.assertNull(actionRequestValidationException7);
        org.junit.Assert.assertNotNull(timeValue10);
        org.junit.Assert.assertNotNull(timeValue13);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest15);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.parent();
        deleteRequest0.primaryTerm((long) (short) 100);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.setRefreshPolicy("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.type("delete {[null][null][null]}");
        java.lang.String str8 = deleteRequest5.parent();
        org.elasticsearch.index.VersionType versionType9 = deleteRequest5.versionType();
        java.lang.String[] strArray10 = deleteRequest5.indices();
        java.lang.Class<?> wildcardClass11 = deleteRequest5.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(versionType9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.type("delete {[null][null][null]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = deleteRequest3.remoteAddress();
        org.elasticsearch.action.support.IndicesOptions indicesOptions5 = deleteRequest3.indicesOptions();
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNull(transportAddress4);
        org.junit.Assert.assertNotNull(indicesOptions5);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("");
        deleteRequest5.primaryTerm((long) (byte) 0);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue10 = deleteRequest9.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest5.timeout(timeValue10);
        java.lang.String str12 = deleteRequest5.toString();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException13 = deleteRequest5.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure15 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "", (java.lang.Throwable) actionRequestValidationException13, "delete {[][][]}");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure17 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[][delete {[][][hi!]}][delete {[][][]}]}", (java.lang.Throwable) actionRequestValidationException13, "delete {[][delete {[][][]}][delete {[][][]}]}");
        java.lang.Class<?> wildcardClass18 = shardFailure17.getClass();
        org.junit.Assert.assertNotNull(timeValue10);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "delete {[][null][null]}" + "'", str12, "delete {[][null][null]}");
        org.junit.Assert.assertNotNull(actionRequestValidationException13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.getDescription();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest("");
        long long10 = deleteRequest9.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str12 = deleteRequest11.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue15 = deleteRequest14.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest11.timeout(timeValue15);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest16.id("delete {[][][hi!]}");
        org.elasticsearch.tasks.TaskId taskId19 = deleteRequest18.getParentTask();
        deleteRequest9.setParentTask(taskId19);
        org.elasticsearch.tasks.Task task21 = deleteRequest3.createTask((long) ' ', "delete {[][][hi!]}", "delete {[][][]}", taskId19);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel22 = deleteRequest3.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest3.type("delete {[][][hi!]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest24.timeout("delete {[][null][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[][null][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[][][]}" + "'", str4, "delete {[][][]}");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(timeValue15);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(taskId19);
        org.junit.Assert.assertNotNull(task21);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel22 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel22.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest24);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        java.lang.String str5 = deleteRequest3.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str7 = deleteRequest6.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.version((long) (short) 100);
        org.elasticsearch.tasks.TaskId taskId10 = deleteRequest6.getParentTask();
        deleteRequest3.setParentTask(taskId10);
        org.elasticsearch.tasks.TaskId taskId12 = deleteRequest3.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest3.parent("delete {[][delete {[][][]}][delete {[][][]}]}");
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest14.setParentTask("", (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 0 length nodeIds are reserved for EMPTY_TASK_ID and are otherwise invalid.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(taskId10);
        org.junit.Assert.assertNotNull(taskId12);
        org.junit.Assert.assertNotNull(deleteRequest14);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.type("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.id("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.type("delete {[hi!][delete {[hi!][null][null]}][delete {[delete {[][][hi!]}][null][null]}]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest3.type("delete {[][delete {[][][hi!]}][delete {[][][]}]}");
        boolean boolean12 = deleteRequest11.getShouldPersistResult();
        java.lang.Class<?> wildcardClass13 = deleteRequest11.getClass();
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        org.elasticsearch.index.VersionType versionType11 = deleteRequest3.versionType();
        java.lang.String str12 = deleteRequest3.parent();
        org.elasticsearch.common.transport.TransportAddress transportAddress13 = deleteRequest3.remoteAddress();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy14 = deleteRequest3.getRefreshPolicy();
        java.lang.String str15 = deleteRequest3.routing();
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(versionType11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(transportAddress13);
        org.junit.Assert.assertTrue("'" + refreshPolicy14 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE + "'", refreshPolicy14.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE));
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.index("delete {[][][hi!]}");
        java.lang.String str3 = deleteRequest2.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.id("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest2.index("delete {[delete {[][][]}][delete {[][][hi!]}][delete {[null][null][null]}]}");
        org.elasticsearch.common.io.stream.StreamOutput streamOutput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest7.writeTo(streamOutput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest3.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.timeout(timeValue4);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.id("delete {[][][hi!]}");
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest7.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest7.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.index("delete {[][][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest16.type("delete {[][][hi!]}");
        java.lang.String str19 = deleteRequest16.getDescription();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy20 = deleteRequest16.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest10.setRefreshPolicy(refreshPolicy20);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest21.timeout("delete {[][][hi!]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[][][hi!]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "delete {[][delete {[][][hi!]}][delete {[][][]}]}" + "'", str19, "delete {[][delete {[][][hi!]}][delete {[][][]}]}");
        org.junit.Assert.assertTrue("'" + refreshPolicy20 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy20.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest21);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.routing("delete {[][][]}");
        java.lang.String str9 = deleteRequest8.type();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest8.writeTo(streamOutput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.version((long) (short) 100);
        java.lang.String str4 = deleteRequest3.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.id("delete {[hi!][delete {[hi!][null][null]}][delete {[delete {[][][hi!]}][null][null]}]}");
        java.lang.String str7 = deleteRequest6.type();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest3.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.timeout(timeValue4);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.id("delete {[][][hi!]}");
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest7.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest7.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest7.version((-1L));
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest7.id("delete {[delete {[][][hi!]}][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest14.index("delete {[delete {[hi!][null][null]}][null][null]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest14.timeout("delete {[][null][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[][null][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest16);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.index("delete {[][][hi!]}");
        java.lang.String str3 = deleteRequest2.parent();
        java.lang.String str4 = deleteRequest2.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest2.version((long) (short) 100);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel7 = deleteRequest6.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId15 = null;
        org.elasticsearch.tasks.Task task16 = deleteRequest11.createTask(0L, "", "", taskId15);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy17 = deleteRequest11.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest6.setRefreshPolicy(refreshPolicy17);
        org.elasticsearch.common.unit.TimeValue timeValue19 = deleteRequest6.timeout();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput20 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest6.writeTo(streamOutput20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel7 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel7.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(task16);
        org.junit.Assert.assertTrue("'" + refreshPolicy17 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy17.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(timeValue19);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        java.lang.String str11 = deleteRequest10.toString();
        java.lang.String[] strArray12 = deleteRequest10.indices();
        deleteRequest10.primaryTerm(0L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest10.routing("delete {[null][null][null]}");
        org.elasticsearch.index.shard.IndexShard indexShard17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete18 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest16, indexShard17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[][][]}" + "'", str11, "delete {[][][]}");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(deleteRequest16);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.index.shard.ShardId shardId5 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.setShardId(shardId5);
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.setShardId(shardId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        org.elasticsearch.common.transport.TransportAddress transportAddress11 = null;
        deleteRequest10.remoteAddress(transportAddress11);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel13 = deleteRequest10.consistencyLevel();
        long long14 = deleteRequest10.primaryTerm();
        org.elasticsearch.index.shard.IndexShard indexShard15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult16 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest10, indexShard15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel13 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel13.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.parent();
        org.elasticsearch.common.transport.TransportAddress transportAddress2 = deleteRequest0.remoteAddress();
        org.elasticsearch.index.shard.ShardId shardId3 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.setShardId(shardId3);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId12 = null;
        org.elasticsearch.tasks.Task task13 = deleteRequest8.createTask(0L, "", "", taskId12);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy14 = deleteRequest8.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest0.setRefreshPolicy(refreshPolicy14);
        org.elasticsearch.index.shard.IndexShard indexShard16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult17 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest15, indexShard16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(transportAddress2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(task13);
        org.junit.Assert.assertTrue("'" + refreshPolicy14 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy14.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest15);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest3.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = deleteRequest5.remoteAddress();
        org.elasticsearch.common.unit.TimeValue timeValue7 = deleteRequest5.timeout();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(transportAddress6);
        org.junit.Assert.assertNotNull(timeValue7);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.index("delete {[][][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.type("delete {[][][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId12 = null;
        org.elasticsearch.tasks.Task task13 = deleteRequest8.createTask(0L, "", "", taskId12);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy14 = deleteRequest8.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId22 = null;
        org.elasticsearch.tasks.Task task23 = deleteRequest18.createTask(0L, "", "", taskId22);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy24 = deleteRequest18.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest8.setRefreshPolicy(refreshPolicy24);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest4.setRefreshPolicy(refreshPolicy24);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest4.parent("delete {[][delete {[][][]}][delete {[][][]}]}");
        java.lang.String str29 = deleteRequest28.getDescription();
        org.elasticsearch.common.io.stream.StreamInput streamInput30 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest28.readFrom(streamInput30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(task13);
        org.junit.Assert.assertTrue("'" + refreshPolicy14 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy14.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(task23);
        org.junit.Assert.assertTrue("'" + refreshPolicy24 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy24.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "delete {[delete {[][][hi!]}][delete {[][][hi!]}][null]}" + "'", str29, "delete {[delete {[][][hi!]}][delete {[][][hi!]}][null]}");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.id("hi!");
        org.elasticsearch.tasks.TaskId taskId7 = deleteRequest6.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.setRefreshPolicy("");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy10 = deleteRequest6.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId18 = null;
        org.elasticsearch.tasks.Task task19 = deleteRequest14.createTask(0L, "", "", taskId18);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest14.setRefreshPolicy("");
        org.elasticsearch.index.VersionType versionType22 = deleteRequest14.versionType();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel23 = deleteRequest14.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest6.consistencyLevel(writeConsistencyLevel23);
        boolean boolean25 = deleteRequest6.getShouldPersistResult();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest6.timeout("delete {[hi!][null][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[hi!][null][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(taskId7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertTrue("'" + refreshPolicy10 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE + "'", refreshPolicy10.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE));
        org.junit.Assert.assertNotNull(task19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(versionType22);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel23 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel23.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.common.unit.TimeValue timeValue5 = deleteRequest3.timeout();
        long long6 = deleteRequest3.primaryTerm();
        java.lang.String str7 = deleteRequest3.index();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(timeValue5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][delete {[hi!][null][null]}][delete {[delete {[][][hi!]}][null][null]}]}", "delete {[][delete {[][][]}][delete {[][][]}]}", "delete {[delete {[][][]}][delete {[][][hi!]}][delete {[null][null][null]}]}");
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
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.id("hi!");
        java.lang.String str7 = deleteRequest6.routing();
        boolean boolean8 = deleteRequest6.getShouldPersistResult();
        org.elasticsearch.common.io.stream.StreamInput streamInput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest6.readFrom(streamInput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.type("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.id("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.type("delete {[hi!][delete {[hi!][null][null]}][delete {[delete {[][][hi!]}][null][null]}]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest3.type("delete {[][delete {[][][hi!]}][delete {[][][]}]}");
        boolean boolean12 = deleteRequest11.getShouldPersistResult();
        org.elasticsearch.index.shard.IndexShard indexShard13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete14 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest11, indexShard13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str3 = deleteRequest2.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue6 = deleteRequest5.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest2.timeout(timeValue6);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.id("delete {[][][hi!]}");
        org.elasticsearch.tasks.TaskId taskId10 = deleteRequest9.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest9.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest12.index("delete {[][][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest18.type("delete {[][][hi!]}");
        java.lang.String str21 = deleteRequest18.getDescription();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy22 = deleteRequest18.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest12.setRefreshPolicy(refreshPolicy22);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "", deleteRequest12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(taskId10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "delete {[][delete {[][][hi!]}][delete {[][][]}]}" + "'", str21, "delete {[][delete {[][][hi!]}][delete {[][][]}]}");
        org.junit.Assert.assertTrue("'" + refreshPolicy22 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy22.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest23);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        java.lang.String str5 = deleteRequest3.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.type("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest("");
        long long10 = deleteRequest9.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue11 = deleteRequest9.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest7.timeout(timeValue11);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = new org.elasticsearch.action.delete.DeleteRequest("");
        deleteRequest17.setParentTask("hi!", (long) (short) 1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest24.type("delete {[][][]}");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy27 = deleteRequest24.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest17.setRefreshPolicy(refreshPolicy27);
        org.elasticsearch.tasks.TaskId taskId29 = deleteRequest17.getParentTask();
        org.elasticsearch.tasks.Task task30 = deleteRequest12.createTask(1L, "", "delete {[null][null][null]}", taskId29);
        java.lang.Class<?> wildcardClass31 = task30.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeValue11);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertTrue("'" + refreshPolicy27 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy27.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertNotNull(taskId29);
        org.junit.Assert.assertNotNull(task30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str3 = deleteRequest2.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue6 = deleteRequest5.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest2.timeout(timeValue6);
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = deleteRequest2.remoteAddress();
        long long9 = deleteRequest2.version();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[][][hi!]}", deleteRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNull(transportAddress8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-3L) + "'", long9 == (-3L));
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][delete {[hi!][delete {[hi!][null][null]}][delete {[delete {[][][hi!]}][null][null]}]}][delete {[][][]}]}", "delete {[delete {[][null][null]}][][]}", "delete {[][null][null]}");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.type("delete {[][][]}");
        java.lang.String str6 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.id("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.index("delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}");
        org.elasticsearch.common.io.stream.StreamInput streamInput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.readFrom(streamInput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "delete {[][][]}" + "'", str6, "delete {[][][]}");
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][][]}", "delete {[hi!][delete {[hi!][null][null]}][delete {[delete {[][][hi!]}][null][null]}]}", "delete {[][][hi!]}");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.consistencyLevel(writeConsistencyLevel4);
        org.elasticsearch.common.io.stream.StreamInput streamInput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest5.readFrom(streamInput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.type("delete {[][][]}");
        java.lang.String str6 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.id("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.index("delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}");
        long long11 = deleteRequest3.version();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest3.setRefreshPolicy("delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "delete {[][][]}" + "'", str6, "delete {[][][]}");
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-3L) + "'", long11 == (-3L));
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.type("delete {[null][null][null]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = deleteRequest3.remoteAddress();
        org.elasticsearch.index.VersionType versionType5 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.versionType(versionType5);
        org.elasticsearch.common.io.stream.StreamInput streamInput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.readFrom(streamInput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNull(transportAddress4);
        org.junit.Assert.assertNotNull(deleteRequest6);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        java.lang.String[] strArray11 = deleteRequest10.indices();
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest10.setShardId(shardId12);
        org.elasticsearch.common.io.stream.StreamInput streamInput14 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest10.readFrom(streamInput14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(deleteRequest13);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.id("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.routing("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest6.version(1L);
        java.lang.String str11 = deleteRequest10.type();
        java.lang.String str12 = deleteRequest10.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest10.setRefreshPolicy("delete {[delete {[][][hi!]}][delete {[][][hi!]}][null]}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [delete {[delete {[][][hi!]}][delete {[][][hi!]}][null]}].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][delete {[][][]}][delete {[][][]}]}", "", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.index("delete {[delete {[][null][null]}][][]}");
        org.elasticsearch.index.shard.IndexShard indexShard6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult7 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest5, indexShard6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        java.lang.String str11 = deleteRequest10.toString();
        java.lang.String[] strArray12 = deleteRequest10.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest10.index("");
        org.elasticsearch.common.unit.TimeValue timeValue15 = deleteRequest14.timeout();
        org.elasticsearch.index.VersionType versionType16 = deleteRequest14.versionType();
        org.elasticsearch.common.io.stream.StreamInput streamInput17 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest14.readFrom(streamInput17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[][][]}" + "'", str11, "delete {[][][]}");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(timeValue15);
        org.junit.Assert.assertNotNull(versionType16);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue2 = deleteRequest1.timeout();
        org.elasticsearch.common.transport.TransportAddress transportAddress3 = null;
        deleteRequest1.remoteAddress(transportAddress3);
        java.lang.String str5 = deleteRequest1.index();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest1.setRefreshPolicy("delete {[delete {[hi!][null][null]}][null][null]}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [delete {[delete {[hi!][null][null]}][null][null]}].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "delete {[null][null][null]}" + "'", str5, "delete {[null][null][null]}");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException9 = deleteRequest3.validate();
        org.elasticsearch.index.shard.IndexShard indexShard10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult11 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest3, indexShard10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNull(actionRequestValidationException9);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.parent("delete {[][][]}");
        java.lang.String str3 = deleteRequest0.toString();
        java.lang.String str4 = deleteRequest0.parent();
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.setParentTask("", (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 0 length nodeIds are reserved for EMPTY_TASK_ID and are otherwise invalid.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "delete {[null][null][null]}" + "'", str3, "delete {[null][null][null]}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[][][]}" + "'", str4, "delete {[][][]}");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][delete {[][][]}][delete {[][][]}]}", "delete {[delete {[][][]}][delete {[][][hi!]}][delete {[null][null][null]}]}", "delete {[delete {[hi!][null][null]}][null][null]}");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.type("delete {[][][hi!]}");
        org.elasticsearch.common.unit.TimeValue timeValue6 = deleteRequest5.timeout();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest5.timeout("delete {[delete {[][][hi!]}][delete {[][][hi!]}][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[delete {[][][hi!]}][delete {[][][hi!]}][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(timeValue6);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[null][null][null]}", throwable2, "delete {[][][]}");
        java.lang.String str5 = shardFailure4.reason;
        java.lang.Throwable throwable6 = shardFailure4.cause;
        java.lang.String str7 = shardFailure4.indexUUID;
        java.lang.String str8 = shardFailure4.indexUUID;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting9 = shardFailure4.routing;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "delete {[null][null][null]}" + "'", str5, "delete {[null][null][null]}");
        org.junit.Assert.assertNull(throwable6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "delete {[][][]}" + "'", str7, "delete {[][][]}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "delete {[][][]}" + "'", str8, "delete {[][][]}");
        org.junit.Assert.assertNull(shardRouting9);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.index.VersionType versionType4 = deleteRequest3.versionType();
        org.elasticsearch.index.shard.IndexShard indexShard5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete6 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest3, indexShard5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(versionType4);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.type("delete {[][][]}");
        java.lang.String str8 = deleteRequest5.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest5.id("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.parent("delete {[][][]}");
        java.lang.String str13 = deleteRequest12.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest12.type("delete {[delete {[][][]}][delete {[][][hi!]}][delete {[null][null][null]}]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest12.index("delete {[delete {[hi!][null][null]}][null][null]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[hi!][null][null]}", deleteRequest17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "delete {[][][]}" + "'", str8, "delete {[][][]}");
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest17);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId9 = null;
        org.elasticsearch.tasks.Task task10 = deleteRequest5.createTask(0L, "", "", taskId9);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = deleteRequest5.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest5.parent("delete {[hi!][delete {[hi!][null][null]}][delete {[delete {[][][hi!]}][null][null]}]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}", deleteRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task10);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel11 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel11.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest13);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.index("delete {[][][hi!]}");
        java.lang.String str3 = deleteRequest2.parent();
        java.lang.String str4 = deleteRequest2.type();
        long long5 = deleteRequest2.primaryTerm();
        long long6 = deleteRequest2.version();
        java.lang.String str7 = deleteRequest2.type();
        deleteRequest2.primaryTerm(1L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest2.index("delete {[delete {[][][]}][delete {[][][hi!]}][delete {[null][null][null]}]}");
        java.lang.String str12 = deleteRequest11.toString();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest11.writeTo(streamOutput13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-3L) + "'", long6 == (-3L));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "delete {[delete {[delete {[][][]}][delete {[][][hi!]}][delete {[null][null][null]}]}][null][null]}" + "'", str12, "delete {[delete {[delete {[][][]}][delete {[][][hi!]}][delete {[null][null][null]}]}][null][null]}");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.type("delete {[][][]}");
        java.lang.String str8 = deleteRequest5.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest5.id("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.parent("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest16.type("delete {[][][hi!]}");
        org.elasticsearch.index.VersionType versionType19 = deleteRequest18.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest10.versionType(versionType19);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel21 = deleteRequest10.consistencyLevel();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[delete {[][delete {[][][]}][delete {[][][]}]}][null][null]}", deleteRequest10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "delete {[][][]}" + "'", str8, "delete {[][][]}");
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(versionType19);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel21 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel21.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        org.elasticsearch.index.VersionType versionType11 = deleteRequest3.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str19 = deleteRequest18.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest18.id("hi!");
        org.elasticsearch.tasks.TaskId taskId22 = deleteRequest21.getParentTask();
        org.elasticsearch.tasks.Task task23 = deleteRequest3.createTask(10L, "delete {[hi!][null][null]}", "delete {[delete {[][][hi!]}][null][null]}", taskId22);
        org.elasticsearch.tasks.TaskId taskId24 = deleteRequest3.getParentTask();
        org.elasticsearch.index.shard.IndexShard indexShard25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult26 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest3, indexShard25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(versionType11);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(taskId22);
        org.junit.Assert.assertNotNull(task23);
        org.junit.Assert.assertNotNull(taskId24);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        deleteRequest1.primaryTerm((long) (byte) 0);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue6 = deleteRequest5.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest1.timeout(timeValue6);
        java.lang.String str8 = deleteRequest1.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest1.timeout("delete {[][][]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[][][]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "delete {[][null][null]}" + "'", str8, "delete {[][null][null]}");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = deleteRequest3.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId17 = null;
        org.elasticsearch.tasks.Task task18 = deleteRequest13.createTask(0L, "", "", taskId17);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy19 = deleteRequest13.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest3.setRefreshPolicy(refreshPolicy19);
        java.lang.String str21 = deleteRequest3.getDescription();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest3.parent("delete {[][][]}");
        org.elasticsearch.common.io.stream.StreamInput streamInput24 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.readFrom(streamInput24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(task18);
        org.junit.Assert.assertTrue("'" + refreshPolicy19 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy19.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "delete {[][][]}" + "'", str21, "delete {[][][]}");
        org.junit.Assert.assertNotNull(deleteRequest23);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str6 = deleteRequest5.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest5.id("hi!");
        org.elasticsearch.tasks.TaskId taskId9 = deleteRequest8.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest8.setRefreshPolicy("");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy12 = deleteRequest8.getRefreshPolicy();
        long long13 = deleteRequest8.version();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest8.version((long) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[delete {[][delete {[][][]}][delete {[][][]}]}][null][null]}", deleteRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(taskId9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertTrue("'" + refreshPolicy12 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE + "'", refreshPolicy12.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-3L) + "'", long13 == (-3L));
        org.junit.Assert.assertNotNull(deleteRequest15);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest3.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.timeout(timeValue4);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.id("delete {[][][hi!]}");
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest7.getParentTask();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException9 = deleteRequest7.validate();
        org.elasticsearch.index.shard.IndexShard indexShard10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult11 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest7, indexShard10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNotNull(actionRequestValidationException9);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][][hi!]}", "delete {[hi!][null][null]}", "delete {[null][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][null][null]}");
        org.elasticsearch.index.shard.ShardId shardId6 = deleteRequest5.shardId();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId14 = null;
        org.elasticsearch.tasks.Task task15 = deleteRequest10.createTask(0L, "", "", taskId14);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest10.setRefreshPolicy("");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel18 = deleteRequest17.consistencyLevel();
        org.elasticsearch.action.support.IndicesOptions indicesOptions19 = deleteRequest17.indicesOptions();
        java.lang.String str20 = deleteRequest17.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str22 = deleteRequest21.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest21.version((long) (short) 100);
        deleteRequest21.primaryTerm(100L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str28 = deleteRequest27.parent();
        org.elasticsearch.index.VersionType versionType29 = deleteRequest27.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest21.versionType(versionType29);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest17.versionType(versionType29);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest5.versionType(versionType29);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest3.versionType(versionType29);
        java.lang.String str34 = deleteRequest33.id();
        org.junit.Assert.assertNull(shardId6);
        org.junit.Assert.assertNotNull(task15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel18 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel18.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(indicesOptions19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "delete {[][][]}" + "'", str20, "delete {[][][]}");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(versionType29);
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "delete {[null][null][null]}" + "'", str34, "delete {[null][null][null]}");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        java.lang.String str11 = deleteRequest10.toString();
        java.lang.String[] strArray12 = deleteRequest10.indices();
        java.lang.String[] strArray13 = deleteRequest10.indices();
        org.elasticsearch.index.shard.ShardId shardId14 = deleteRequest10.shardId();
        deleteRequest10.primaryTerm((long) (short) -1);
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[][][]}" + "'", str11, "delete {[][][]}");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(shardId14);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.index("delete {[][][hi!]}");
        java.lang.String str3 = deleteRequest2.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.id("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest2.index("delete {[delete {[][][]}][delete {[][][hi!]}][delete {[null][null][null]}]}");
        org.elasticsearch.common.io.stream.StreamInput streamInput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest7.readFrom(streamInput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        org.elasticsearch.index.VersionType versionType11 = deleteRequest3.versionType();
        java.lang.String str12 = deleteRequest3.parent();
        org.elasticsearch.common.transport.TransportAddress transportAddress13 = deleteRequest3.remoteAddress();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy14 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest3.setRefreshPolicy(refreshPolicy14);
        long long16 = deleteRequest3.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue17 = deleteRequest3.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = new org.elasticsearch.action.delete.DeleteRequest("");
        deleteRequest19.primaryTerm((long) (byte) 0);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue24 = deleteRequest23.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest19.timeout(timeValue24);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str27 = deleteRequest26.parent();
        org.elasticsearch.index.VersionType versionType28 = deleteRequest26.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest19.versionType(versionType28);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest3.versionType(versionType28);
        java.lang.String str31 = deleteRequest3.routing();
        org.elasticsearch.index.shard.IndexShard indexShard32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete33 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest3, indexShard32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(versionType11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(transportAddress13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(timeValue17);
        org.junit.Assert.assertNotNull(timeValue24);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(versionType28);
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][delete {[][][hi!]}][delete {[][][]}]}", "delete {[][delete {[][][]}][delete {[][][]}]}", "hi!");
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][delete {[][][]}][delete {[][][]}]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.version((long) (-1));
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = null;
        deleteRequest3.remoteAddress(transportAddress4);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.index("delete {[][delete {[][][]}][delete {[][][]}]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.setRefreshPolicy("delete {[null][null][null]}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [delete {[null][null][null]}].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest7);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.id("hi!");
        org.elasticsearch.tasks.TaskId taskId7 = deleteRequest6.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.setRefreshPolicy("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest6.type("delete {[hi!][null][null]}");
        org.elasticsearch.common.io.stream.StreamInput streamInput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest11.readFrom(streamInput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(taskId7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        java.lang.String str11 = deleteRequest3.index();
        java.lang.String str12 = deleteRequest3.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest3.version((long) (byte) 1);
        java.lang.Class<?> wildcardClass15 = deleteRequest3.getClass();
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.common.transport.TransportAddress transportAddress5 = deleteRequest3.remoteAddress();
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.setShardId(shardId6);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.type("delete {[][][hi!]}");
        org.elasticsearch.index.VersionType versionType14 = deleteRequest13.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest7.versionType(versionType14);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput16 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest15.writeTo(streamOutput16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(transportAddress5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(versionType14);
        org.junit.Assert.assertNotNull(deleteRequest15);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue2 = deleteRequest1.timeout();
        org.elasticsearch.common.transport.TransportAddress transportAddress3 = null;
        deleteRequest1.remoteAddress(transportAddress3);
        org.elasticsearch.common.io.stream.StreamInput streamInput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest1.readFrom(streamInput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue2);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.parent("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.type("delete {[hi!][null][null]}");
        org.elasticsearch.index.shard.IndexShard indexShard5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult6 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest4, indexShard5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}", "delete {[][delete {[][][hi!]}][delete {[][][]}]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.parent("");
        org.elasticsearch.index.shard.IndexShard indexShard6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult7 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest3, indexShard6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str6 = deleteRequest5.id();
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest5.setShardId(shardId7);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[delete {[][][hi!]}][delete {[][][hi!]}][null]}", deleteRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(deleteRequest8);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.id("hi!");
        org.elasticsearch.tasks.TaskId taskId7 = deleteRequest6.getParentTask();
        java.lang.Class<?> wildcardClass8 = deleteRequest6.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(taskId7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.id("hi!");
        org.elasticsearch.tasks.TaskId taskId7 = deleteRequest6.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.setRefreshPolicy("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.type("delete {[][][hi!]}");
        org.elasticsearch.index.VersionType versionType16 = deleteRequest15.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "", "delete {[][][]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress21 = deleteRequest20.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId29 = null;
        org.elasticsearch.tasks.Task task30 = deleteRequest25.createTask(0L, "", "", taskId29);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy31 = deleteRequest25.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest20.setRefreshPolicy(refreshPolicy31);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest15.setRefreshPolicy(refreshPolicy31);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = deleteRequest9.setRefreshPolicy(refreshPolicy31);
        java.lang.Class<?> wildcardClass35 = deleteRequest9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(taskId7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(versionType16);
        org.junit.Assert.assertNull(transportAddress21);
        org.junit.Assert.assertNotNull(task30);
        org.junit.Assert.assertTrue("'" + refreshPolicy31 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy31.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertNotNull(deleteRequest34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest3.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.timeout(timeValue4);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.id("delete {[][][hi!]}");
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest7.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest7.id("");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest7.timeout("delete {[hi!][null][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[hi!][null][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNotNull(deleteRequest10);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.id("hi!");
        java.lang.String str7 = deleteRequest3.id();
        org.elasticsearch.index.shard.IndexShard indexShard8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete9 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest3, indexShard8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.type("delete {[][][]}");
        java.lang.String str6 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.id("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.parent("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId18 = null;
        org.elasticsearch.tasks.Task task19 = deleteRequest14.createTask(0L, "", "", taskId18);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest14.setRefreshPolicy("");
        java.lang.String[] strArray22 = deleteRequest21.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId30 = null;
        org.elasticsearch.tasks.Task task31 = deleteRequest26.createTask(0L, "", "", taskId30);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest26.setRefreshPolicy("");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel34 = deleteRequest33.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = deleteRequest21.consistencyLevel(writeConsistencyLevel34);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest37 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue38 = deleteRequest37.timeout();
        org.elasticsearch.common.transport.TransportAddress transportAddress39 = null;
        deleteRequest37.remoteAddress(transportAddress39);
        org.elasticsearch.common.unit.TimeValue timeValue41 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest42 = deleteRequest37.timeout(timeValue41);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest43 = deleteRequest21.timeout(timeValue41);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest44 = deleteRequest10.timeout(timeValue41);
        org.elasticsearch.common.io.stream.StreamInput streamInput45 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest44.readFrom(streamInput45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "delete {[][][]}" + "'", str6, "delete {[][][]}");
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(task19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(task31);
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel34 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel34.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest35);
        org.junit.Assert.assertNotNull(timeValue38);
        org.junit.Assert.assertNotNull(timeValue41);
        org.junit.Assert.assertNotNull(deleteRequest42);
        org.junit.Assert.assertNotNull(deleteRequest43);
        org.junit.Assert.assertNotNull(deleteRequest44);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.index("delete {[][][hi!]}");
        java.lang.String str3 = deleteRequest2.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest2.id("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest2.index("delete {[delete {[][][]}][delete {[][][hi!]}][delete {[null][null][null]}]}");
        long long8 = deleteRequest2.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.type("delete {[null][null][null]}");
        java.lang.String str13 = deleteRequest10.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest10.index("");
        org.elasticsearch.tasks.TaskId taskId16 = deleteRequest15.getParentTask();
        deleteRequest2.setParentTask(taskId16);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest2.timeout("delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(taskId16);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        java.lang.String str11 = deleteRequest10.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("");
        long long14 = deleteRequest13.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str16 = deleteRequest15.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue19 = deleteRequest18.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest15.timeout(timeValue19);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest20.id("delete {[][][hi!]}");
        org.elasticsearch.tasks.TaskId taskId23 = deleteRequest22.getParentTask();
        deleteRequest13.setParentTask(taskId23);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel25 = deleteRequest13.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest10.consistencyLevel(writeConsistencyLevel25);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest10.timeout("delete {[][delete {[][][hi!]}][delete {[][][]}]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[][delete {[][][hi!]}][delete {[][][]}]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[][][]}" + "'", str11, "delete {[][][]}");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(timeValue19);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertNotNull(taskId23);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel25 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel25.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest26);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        java.lang.String str5 = deleteRequest3.index();
        org.elasticsearch.tasks.TaskId taskId6 = deleteRequest3.getParentTask();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException7 = deleteRequest3.validate();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.setRefreshPolicy("delete {[][delete {[][][hi!]}][delete {[][][]}]}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [delete {[][delete {[][][hi!]}][delete {[][][]}]}].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(taskId6);
        org.junit.Assert.assertNull(actionRequestValidationException7);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.index.shard.ShardId shardId5 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.setShardId(shardId5);
        org.elasticsearch.action.support.IndicesOptions indicesOptions7 = deleteRequest6.indicesOptions();
        java.lang.String str8 = deleteRequest6.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str16 = deleteRequest15.id();
        java.lang.String str17 = deleteRequest15.index();
        org.elasticsearch.tasks.TaskId taskId18 = deleteRequest15.getParentTask();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException19 = deleteRequest15.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue22 = deleteRequest21.timeout();
        org.elasticsearch.common.transport.TransportAddress transportAddress23 = null;
        deleteRequest21.remoteAddress(transportAddress23);
        org.elasticsearch.common.unit.TimeValue timeValue25 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest21.timeout(timeValue25);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest15.timeout(timeValue25);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str35 = deleteRequest34.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest39 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest41 = deleteRequest39.type("delete {[][][]}");
        java.lang.String str42 = deleteRequest39.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest44 = deleteRequest39.id("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest48 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId52 = null;
        org.elasticsearch.tasks.Task task53 = deleteRequest48.createTask(0L, "", "", taskId52);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest55 = deleteRequest48.setRefreshPolicy("");
        java.lang.String str56 = deleteRequest55.toString();
        java.lang.String[] strArray57 = deleteRequest55.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest59 = deleteRequest55.index("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest63 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest67 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str68 = deleteRequest67.id();
        java.lang.String str69 = deleteRequest67.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest70 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str71 = deleteRequest70.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest73 = deleteRequest70.version((long) (short) 100);
        org.elasticsearch.tasks.TaskId taskId74 = deleteRequest70.getParentTask();
        deleteRequest67.setParentTask(taskId74);
        deleteRequest63.setParentTask(taskId74);
        deleteRequest59.setParentTask(taskId74);
        deleteRequest44.setParentTask(taskId74);
        deleteRequest34.setParentTask(taskId74);
        org.elasticsearch.tasks.Task task80 = deleteRequest27.createTask((long) (short) -1, "delete {[hi!][null][null]}", "hi!", taskId74);
        org.elasticsearch.tasks.Task task81 = deleteRequest6.createTask((-1L), "delete {[null][null][null]}", "delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}", taskId74);
        org.elasticsearch.common.io.stream.StreamInput streamInput82 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest6.readFrom(streamInput82);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(indicesOptions7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "delete {[][][]}" + "'", str8, "delete {[][][]}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(taskId18);
        org.junit.Assert.assertNull(actionRequestValidationException19);
        org.junit.Assert.assertNotNull(timeValue22);
        org.junit.Assert.assertNotNull(timeValue25);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(deleteRequest41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "delete {[][][]}" + "'", str42, "delete {[][][]}");
        org.junit.Assert.assertNotNull(deleteRequest44);
        org.junit.Assert.assertNotNull(task53);
        org.junit.Assert.assertNotNull(deleteRequest55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "delete {[][][]}" + "'", str56, "delete {[][][]}");
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(deleteRequest59);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNotNull(deleteRequest73);
        org.junit.Assert.assertNotNull(taskId74);
        org.junit.Assert.assertNotNull(task80);
        org.junit.Assert.assertNotNull(task81);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.id("hi!");
        java.lang.String str7 = deleteRequest3.index();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.common.unit.TimeValue timeValue5 = deleteRequest3.timeout();
        java.lang.String str6 = deleteRequest3.parent();
        org.elasticsearch.index.shard.IndexShard indexShard7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult8 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest3, indexShard7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(timeValue5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = deleteRequest10.consistencyLevel();
        org.elasticsearch.action.support.IndicesOptions indicesOptions12 = deleteRequest10.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId13 = null;
        deleteRequest10.setParentTask(taskId13);
        deleteRequest10.primaryTerm((long) 'a');
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest10.parent("delete {[][delete {[][][]}][delete {[][][]}]}");
        java.lang.String str19 = deleteRequest18.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest18.type("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest18.setRefreshPolicy("");
        org.elasticsearch.common.unit.TimeValue timeValue24 = deleteRequest23.timeout();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest23.setRefreshPolicy("delete {[delete {[][delete {[][][]}][delete {[][][]}]}][null][null]}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [delete {[delete {[][delete {[][][]}][delete {[][][]}]}][null][null]}].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel11 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel11.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(indicesOptions12);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(timeValue24);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.type("delete {[][][hi!]}");
        org.elasticsearch.common.unit.TimeValue timeValue6 = deleteRequest5.timeout();
        java.lang.String str7 = deleteRequest5.type();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest5.setRefreshPolicy("delete {[][][]}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [delete {[][][]}].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "delete {[][][hi!]}" + "'", str7, "delete {[][][hi!]}");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = deleteRequest0.consistencyLevel();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy2 = deleteRequest0.getRefreshPolicy();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.setRefreshPolicy("delete {[delete {[][][]}][delete {[][][hi!]}][delete {[null][null][null]}]}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [delete {[delete {[][][]}][delete {[][][hi!]}][delete {[null][null][null]}]}].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel1 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel1.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + refreshPolicy2 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy2.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.version((long) (short) 100);
        org.elasticsearch.tasks.TaskId taskId4 = deleteRequest0.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest0.id("delete {[][][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest0.index("delete {[hi!][null][null]}");
        java.lang.String str9 = deleteRequest8.type();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(taskId4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.type("delete {[][][]}");
        java.lang.String str6 = deleteRequest3.id();
        java.lang.String str7 = deleteRequest3.getDescription();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException8 = deleteRequest3.validate();
        java.lang.String str9 = deleteRequest3.routing();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.writeTo(streamOutput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "delete {[][][]}" + "'", str6, "delete {[][][]}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "delete {[][delete {[][][]}][delete {[][][]}]}" + "'", str7, "delete {[][delete {[][][]}][delete {[][][]}]}");
        org.junit.Assert.assertNull(actionRequestValidationException8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = deleteRequest10.consistencyLevel();
        org.elasticsearch.action.support.IndicesOptions indicesOptions12 = deleteRequest10.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId13 = null;
        deleteRequest10.setParentTask(taskId13);
        deleteRequest10.primaryTerm((long) (-1));
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}", "delete {[][][hi!]}", "hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str31 = deleteRequest30.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest30.id("hi!");
        org.elasticsearch.tasks.TaskId taskId34 = deleteRequest33.getParentTask();
        org.elasticsearch.tasks.TaskId taskId35 = deleteRequest33.getParentTask();
        org.elasticsearch.tasks.Task task36 = deleteRequest23.createTask((-1L), "", "hi!", taskId35);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest40 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel41 = deleteRequest40.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel42 = deleteRequest40.consistencyLevel();
        deleteRequest40.primaryTerm((long) (short) 10);
        long long45 = deleteRequest40.version();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest52 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId56 = null;
        org.elasticsearch.tasks.Task task57 = deleteRequest52.createTask(0L, "", "", taskId56);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest59 = deleteRequest52.setRefreshPolicy("");
        java.lang.String str60 = deleteRequest59.toString();
        java.lang.String[] strArray61 = deleteRequest59.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest63 = deleteRequest59.index("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest67 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest71 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str72 = deleteRequest71.id();
        java.lang.String str73 = deleteRequest71.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest74 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str75 = deleteRequest74.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest77 = deleteRequest74.version((long) (short) 100);
        org.elasticsearch.tasks.TaskId taskId78 = deleteRequest74.getParentTask();
        deleteRequest71.setParentTask(taskId78);
        deleteRequest67.setParentTask(taskId78);
        deleteRequest63.setParentTask(taskId78);
        org.elasticsearch.tasks.Task task82 = deleteRequest40.createTask((-1L), "delete {[][delete {[][][]}][delete {[][][]}]}", "delete {[][][hi!]}", taskId78);
        org.elasticsearch.tasks.Task task83 = deleteRequest23.createTask((long) (byte) 100, "delete {[][][hi!]}", "delete {[][][hi!]}", taskId78);
        org.elasticsearch.tasks.Task task84 = deleteRequest10.createTask((long) (-1), "delete {[delete {[][][hi!]}][null][null]}", "delete {[][null][null]}", taskId78);
        org.elasticsearch.index.shard.IndexShard indexShard85 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult86 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest10, indexShard85);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel11 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel11.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(indicesOptions12);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertNotNull(taskId34);
        org.junit.Assert.assertNotNull(taskId35);
        org.junit.Assert.assertNotNull(task36);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel41 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel41.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel42 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel42.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-3L) + "'", long45 == (-3L));
        org.junit.Assert.assertNotNull(task57);
        org.junit.Assert.assertNotNull(deleteRequest59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "delete {[][][]}" + "'", str60, "delete {[][][]}");
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(deleteRequest63);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertNotNull(deleteRequest77);
        org.junit.Assert.assertNotNull(taskId78);
        org.junit.Assert.assertNotNull(task82);
        org.junit.Assert.assertNotNull(task83);
        org.junit.Assert.assertNotNull(task84);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        java.lang.String[] strArray11 = deleteRequest10.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId19 = null;
        org.elasticsearch.tasks.Task task20 = deleteRequest15.createTask(0L, "", "", taskId19);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest15.setRefreshPolicy("");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel23 = deleteRequest22.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest10.consistencyLevel(writeConsistencyLevel23);
        deleteRequest24.setParentTask("hi!", (long) (short) 100);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel29 = deleteRequest28.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel30 = deleteRequest28.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest24.consistencyLevel(writeConsistencyLevel30);
        org.elasticsearch.common.io.stream.StreamInput streamInput32 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest24.readFrom(streamInput32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(task20);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel23 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel23.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel29 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel29.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel30 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel30.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest31);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        long long2 = deleteRequest1.primaryTerm();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel3 = deleteRequest1.consistencyLevel();
        org.elasticsearch.common.io.stream.StreamInput streamInput4 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest1.readFrom(streamInput4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel3 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel3.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.type("delete {[][][]}");
        java.lang.String str6 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.id("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = deleteRequest9.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = deleteRequest9.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest3.consistencyLevel(writeConsistencyLevel11);
        deleteRequest12.setParentTask("delete {[][delete {[][][]}][delete {[][][]}]}", (-1L));
        java.lang.String str16 = deleteRequest12.type();
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "delete {[][][]}" + "'", str6, "delete {[][][]}");
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel11 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel11.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "delete {[][][]}" + "'", str16, "delete {[][][]}");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.id("hi!");
        java.lang.String str7 = deleteRequest6.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str15 = deleteRequest14.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest14.id("hi!");
        org.elasticsearch.tasks.TaskId taskId18 = deleteRequest17.getParentTask();
        org.elasticsearch.tasks.TaskId taskId19 = deleteRequest17.getParentTask();
        org.elasticsearch.tasks.Task task20 = deleteRequest6.createTask((long) '4', "", "delete {[][][]}", taskId19);
        deleteRequest6.setParentTask("delete {[delete {[hi!][null][null]}][null][null]}", (-3L));
        org.elasticsearch.index.shard.IndexShard indexShard24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult25 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest6, indexShard24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "delete {[][][hi!]}" + "'", str7, "delete {[][][hi!]}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(taskId18);
        org.junit.Assert.assertNotNull(taskId19);
        org.junit.Assert.assertNotNull(task20);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "", "delete {[][][]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = deleteRequest5.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId14 = null;
        org.elasticsearch.tasks.Task task15 = deleteRequest10.createTask(0L, "", "", taskId14);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy16 = deleteRequest10.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest5.setRefreshPolicy(refreshPolicy16);
        java.lang.String str18 = deleteRequest5.index();
        org.elasticsearch.index.shard.ShardId shardId19 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest5.setShardId(shardId19);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "hi!", deleteRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(transportAddress6);
        org.junit.Assert.assertNotNull(task15);
        org.junit.Assert.assertTrue("'" + refreshPolicy16 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy16.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(deleteRequest20);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][null][null]}", "delete {[delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}][delete {[][][]}][delete {[][][]}]}", "delete {[delete {[][][hi!]}][null][null]}");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        java.lang.Throwable throwable2 = null;
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure4 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "hi!", throwable2, "delete {[null][null][null]}");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting5 = shardFailure4.routing;
        java.lang.String str6 = shardFailure4.indexUUID;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting7 = shardFailure4.routing;
        java.lang.String str8 = shardFailure4.indexUUID;
        org.junit.Assert.assertNull(shardRouting5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "delete {[null][null][null]}" + "'", str6, "delete {[null][null][null]}");
        org.junit.Assert.assertNull(shardRouting7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "delete {[null][null][null]}" + "'", str8, "delete {[null][null][null]}");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.index("delete {[][][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.type("delete {[][][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId12 = null;
        org.elasticsearch.tasks.Task task13 = deleteRequest8.createTask(0L, "", "", taskId12);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy14 = deleteRequest8.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId22 = null;
        org.elasticsearch.tasks.Task task23 = deleteRequest18.createTask(0L, "", "", taskId22);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy24 = deleteRequest18.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest8.setRefreshPolicy(refreshPolicy24);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest4.setRefreshPolicy(refreshPolicy24);
        org.elasticsearch.index.shard.ShardId shardId27 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest4.setShardId(shardId27);
        org.elasticsearch.index.shard.IndexShard indexShard29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete30 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest4, indexShard29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(task13);
        org.junit.Assert.assertTrue("'" + refreshPolicy14 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy14.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(task23);
        org.junit.Assert.assertTrue("'" + refreshPolicy24 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy24.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNotNull(deleteRequest28);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[][][hi!]}][null][null]}", "delete {[][][]}", "");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = deleteRequest3.consistencyLevel();
        org.elasticsearch.index.shard.ShardId shardId5 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.setShardId(shardId5);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.parent("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.type("delete {[hi!][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue12 = deleteRequest9.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest6.timeout(timeValue12);
        org.elasticsearch.common.io.stream.StreamInput streamInput14 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest13.readFrom(streamInput14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel4 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel4.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(timeValue12);
        org.junit.Assert.assertNotNull(deleteRequest13);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.parent();
        org.elasticsearch.common.transport.TransportAddress transportAddress2 = deleteRequest0.remoteAddress();
        org.elasticsearch.index.shard.ShardId shardId3 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.setShardId(shardId3);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId12 = null;
        org.elasticsearch.tasks.Task task13 = deleteRequest8.createTask(0L, "", "", taskId12);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy14 = deleteRequest8.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest0.setRefreshPolicy(refreshPolicy14);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = new org.elasticsearch.action.delete.DeleteRequest("");
        long long18 = deleteRequest17.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str20 = deleteRequest19.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue23 = deleteRequest22.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest19.timeout(timeValue23);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest24.id("delete {[][][hi!]}");
        org.elasticsearch.tasks.TaskId taskId27 = deleteRequest26.getParentTask();
        deleteRequest17.setParentTask(taskId27);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel29 = deleteRequest17.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest0.consistencyLevel(writeConsistencyLevel29);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest0.version((long) 'a');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(transportAddress2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(task13);
        org.junit.Assert.assertTrue("'" + refreshPolicy14 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy14.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(timeValue23);
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNotNull(taskId27);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel29 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel29.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertNotNull(deleteRequest32);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.getDescription();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest("");
        long long10 = deleteRequest9.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str12 = deleteRequest11.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue15 = deleteRequest14.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest11.timeout(timeValue15);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest16.id("delete {[][][hi!]}");
        org.elasticsearch.tasks.TaskId taskId19 = deleteRequest18.getParentTask();
        deleteRequest9.setParentTask(taskId19);
        org.elasticsearch.tasks.Task task21 = deleteRequest3.createTask((long) ' ', "delete {[][][hi!]}", "delete {[][][]}", taskId19);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel22 = deleteRequest3.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest3.type("delete {[][][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest24.id("");
        org.elasticsearch.common.io.stream.StreamOutput streamOutput27 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest24.writeTo(streamOutput27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[][][]}" + "'", str4, "delete {[][][]}");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(timeValue15);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(taskId19);
        org.junit.Assert.assertNotNull(task21);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel22 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel22.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNotNull(deleteRequest26);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.index("delete {[][][hi!]}");
        java.lang.String str3 = deleteRequest2.parent();
        org.elasticsearch.action.support.IndicesOptions indicesOptions4 = deleteRequest2.indicesOptions();
        org.elasticsearch.index.shard.ShardId shardId5 = deleteRequest2.shardId();
        java.lang.String str6 = deleteRequest2.routing();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy7 = deleteRequest2.getRefreshPolicy();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(indicesOptions4);
        org.junit.Assert.assertNull(shardId5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + refreshPolicy7 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy7.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.index("delete {[][][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.type("delete {[][][hi!]}");
        java.lang.String str5 = deleteRequest2.routing();
        org.elasticsearch.index.shard.IndexShard indexShard6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete7 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest2, indexShard6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.index("delete {[][][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.type("delete {[][][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId12 = null;
        org.elasticsearch.tasks.Task task13 = deleteRequest8.createTask(0L, "", "", taskId12);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy14 = deleteRequest8.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId22 = null;
        org.elasticsearch.tasks.Task task23 = deleteRequest18.createTask(0L, "", "", taskId22);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy24 = deleteRequest18.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest8.setRefreshPolicy(refreshPolicy24);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest4.setRefreshPolicy(refreshPolicy24);
        org.elasticsearch.index.shard.ShardId shardId27 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest4.setShardId(shardId27);
        java.lang.String str29 = deleteRequest28.getDescription();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(task13);
        org.junit.Assert.assertTrue("'" + refreshPolicy14 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy14.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(task23);
        org.junit.Assert.assertTrue("'" + refreshPolicy24 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy24.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "delete {[delete {[][][hi!]}][delete {[][][hi!]}][null]}" + "'", str29, "delete {[delete {[][][hi!]}][delete {[][][hi!]}][null]}");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.parent();
        org.elasticsearch.index.VersionType versionType2 = deleteRequest0.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.version((long) 'a');
        org.elasticsearch.index.shard.ShardId shardId5 = deleteRequest4.shardId();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str10 = deleteRequest9.id();
        org.elasticsearch.common.transport.TransportAddress transportAddress11 = deleteRequest9.remoteAddress();
        org.elasticsearch.index.shard.ShardId shardId12 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest9.setShardId(shardId12);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest17.type("delete {[][][hi!]}");
        org.elasticsearch.index.VersionType versionType20 = deleteRequest19.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest13.versionType(versionType20);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str26 = deleteRequest25.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest25.parent("hi!");
        org.elasticsearch.tasks.TaskId taskId29 = deleteRequest25.getParentTask();
        org.elasticsearch.tasks.Task task30 = deleteRequest21.createTask((-3L), "delete {[][][hi!]}", "delete {[hi!][delete {[hi!][null][null]}][delete {[delete {[][][hi!]}][null][null]}]}", taskId29);
        deleteRequest4.setParentTask(taskId29);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest4.setRefreshPolicy("delete {[hi!][null][null]}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [delete {[hi!][null][null]}].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(versionType2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNull(shardId5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(transportAddress11);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(versionType20);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "delete {[null][null][null]}" + "'", str26, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertNotNull(taskId29);
        org.junit.Assert.assertNotNull(task30);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        java.lang.String[] strArray11 = deleteRequest10.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId19 = null;
        org.elasticsearch.tasks.Task task20 = deleteRequest15.createTask(0L, "", "", taskId19);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest15.setRefreshPolicy("");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel23 = deleteRequest22.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest10.consistencyLevel(writeConsistencyLevel23);
        deleteRequest24.setParentTask("hi!", (long) (short) 100);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel29 = deleteRequest28.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel30 = deleteRequest28.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest24.consistencyLevel(writeConsistencyLevel30);
        org.elasticsearch.common.unit.TimeValue timeValue32 = deleteRequest31.timeout();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput33 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest31.writeTo(streamOutput33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(task20);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel23 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel23.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel29 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel29.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel30 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel30.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertNotNull(timeValue32);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.id("hi!");
        org.elasticsearch.tasks.TaskId taskId7 = deleteRequest6.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.setRefreshPolicy("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.type("delete {[][][hi!]}");
        org.elasticsearch.index.VersionType versionType16 = deleteRequest15.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "", "delete {[][][]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress21 = deleteRequest20.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId29 = null;
        org.elasticsearch.tasks.Task task30 = deleteRequest25.createTask(0L, "", "", taskId29);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy31 = deleteRequest25.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest20.setRefreshPolicy(refreshPolicy31);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest15.setRefreshPolicy(refreshPolicy31);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = deleteRequest9.setRefreshPolicy(refreshPolicy31);
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest9.setParentTask("", (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 0 length nodeIds are reserved for EMPTY_TASK_ID and are otherwise invalid.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(taskId7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(versionType16);
        org.junit.Assert.assertNull(transportAddress21);
        org.junit.Assert.assertNotNull(task30);
        org.junit.Assert.assertTrue("'" + refreshPolicy31 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy31.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertNotNull(deleteRequest34);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        java.lang.String str5 = deleteRequest3.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str7 = deleteRequest6.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.version((long) (short) 100);
        org.elasticsearch.tasks.TaskId taskId10 = deleteRequest6.getParentTask();
        deleteRequest3.setParentTask(taskId10);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel13 = deleteRequest12.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel14 = deleteRequest12.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest3.consistencyLevel(writeConsistencyLevel14);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest3.type("delete {[delete {[][][hi!]}][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest17.type("delete {[][][]}");
        org.elasticsearch.tasks.TaskId taskId20 = deleteRequest19.getParentTask();
        org.elasticsearch.index.shard.IndexShard indexShard21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult22 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest19, indexShard21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(taskId10);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel13 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel13.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel14 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel14.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(taskId20);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.index.shard.ShardId shardId5 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.setShardId(shardId5);
        org.elasticsearch.action.support.IndicesOptions indicesOptions7 = deleteRequest6.indicesOptions();
        java.lang.String str8 = deleteRequest6.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest6.setRefreshPolicy("delete {[][null][null]}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [delete {[][null][null]}].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(indicesOptions7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "delete {[][][]}" + "'", str8, "delete {[][][]}");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.index.shard.ShardId shardId5 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.setShardId(shardId5);
        java.lang.String str7 = deleteRequest3.toString();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.writeTo(streamOutput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "delete {[][][]}" + "'", str7, "delete {[][][]}");
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.getDescription();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest("");
        long long10 = deleteRequest9.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str12 = deleteRequest11.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue15 = deleteRequest14.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest11.timeout(timeValue15);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest16.id("delete {[][][hi!]}");
        org.elasticsearch.tasks.TaskId taskId19 = deleteRequest18.getParentTask();
        deleteRequest9.setParentTask(taskId19);
        org.elasticsearch.tasks.Task task21 = deleteRequest3.createTask((long) ' ', "delete {[][][hi!]}", "delete {[][][]}", taskId19);
        org.elasticsearch.common.transport.TransportAddress transportAddress22 = deleteRequest3.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest3.id("delete {[null][null][null]}");
        org.elasticsearch.index.VersionType versionType25 = deleteRequest3.versionType();
        java.lang.Class<?> wildcardClass26 = versionType25.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[][][]}" + "'", str4, "delete {[][][]}");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(timeValue15);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(taskId19);
        org.junit.Assert.assertNotNull(task21);
        org.junit.Assert.assertNull(transportAddress22);
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNotNull(versionType25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.type("delete {[][][hi!]}");
        boolean boolean6 = deleteRequest5.getShouldPersistResult();
        org.elasticsearch.common.io.stream.StreamInput streamInput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest5.readFrom(streamInput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        deleteRequest1.primaryTerm((long) (byte) 0);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue6 = deleteRequest5.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest1.timeout(timeValue6);
        java.lang.String str8 = deleteRequest1.toString();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException9 = deleteRequest1.validate();
        java.lang.String str10 = deleteRequest1.getDescription();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest("");
        long long13 = deleteRequest12.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest12.index("");
        boolean boolean16 = deleteRequest12.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest12.version((long) 1);
        org.elasticsearch.common.unit.TimeValue timeValue19 = deleteRequest12.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest1.timeout(timeValue19);
        java.lang.String str21 = deleteRequest20.id();
        java.lang.Class<?> wildcardClass22 = deleteRequest20.getClass();
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "delete {[][null][null]}" + "'", str8, "delete {[][null][null]}");
        org.junit.Assert.assertNotNull(actionRequestValidationException9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "delete {[][null][null]}" + "'", str10, "delete {[][null][null]}");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(timeValue19);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.parent("delete {[][delete {[][][]}][delete {[][][]}]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[delete {[][][]}][delete {[][][hi!]}][delete {[null][null][null]}]}", deleteRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest7);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        java.lang.String str5 = deleteRequest3.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.type("delete {[][][]}");
        java.lang.String str8 = deleteRequest7.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest7.type("");
        java.lang.String str11 = deleteRequest10.parent();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "delete {[][][]}" + "'", str8, "delete {[][][]}");
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[][][hi!]}][null][null]}", "delete {[][][]}", "");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = deleteRequest3.consistencyLevel();
        org.elasticsearch.index.shard.ShardId shardId5 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.setShardId(shardId5);
        org.elasticsearch.tasks.TaskId taskId7 = deleteRequest6.getParentTask();
        org.elasticsearch.index.shard.IndexShard indexShard8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete9 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest6, indexShard8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel4 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel4.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(taskId7);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.type("delete {[][][]}");
        java.lang.String str6 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.id("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.index("delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.routing("delete {[delete {[][null][null]}][][]}");
        org.elasticsearch.common.io.stream.StreamInput streamInput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest12.readFrom(streamInput13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "delete {[][][]}" + "'", str6, "delete {[][][]}");
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = deleteRequest10.consistencyLevel();
        org.elasticsearch.action.support.IndicesOptions indicesOptions12 = deleteRequest10.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId13 = null;
        deleteRequest10.setParentTask(taskId13);
        deleteRequest10.primaryTerm((long) 'a');
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest10.parent("delete {[][delete {[][][]}][delete {[][][]}]}");
        java.lang.String str19 = deleteRequest18.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest18.type("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest18.setRefreshPolicy("delete {[delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}][delete {[][][]}][delete {[][][]}]}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [delete {[delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}][delete {[][][]}][delete {[][][]}]}].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel11 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel11.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(indicesOptions12);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(deleteRequest21);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
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
        org.elasticsearch.index.shard.SearchOperationListener[] searchOperationListenerArray14 = new org.elasticsearch.index.shard.SearchOperationListener[] {};
        java.util.ArrayList<org.elasticsearch.index.shard.SearchOperationListener> searchOperationListenerList15 = new java.util.ArrayList<org.elasticsearch.index.shard.SearchOperationListener>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.elasticsearch.index.shard.SearchOperationListener>) searchOperationListenerList15, searchOperationListenerArray14);
        java.util.List<org.elasticsearch.index.shard.IndexingOperationListener> indexingOperationListenerList17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.shard.IndexShard indexShard18 = new org.elasticsearch.index.shard.IndexShard(shardRouting0, indexSettings1, shardPath2, store3, indexCache4, mapperService5, similarityService6, indexFieldDataService7, engineFactory8, indexEventListener9, indexSearcherWrapper10, threadPool11, bigArrays12, warmer13, (java.util.List<org.elasticsearch.index.shard.SearchOperationListener>) searchOperationListenerList15, indexingOperationListenerList17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(searchOperationListenerArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        java.lang.String[] strArray11 = deleteRequest10.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId19 = null;
        org.elasticsearch.tasks.Task task20 = deleteRequest15.createTask(0L, "", "", taskId19);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest15.setRefreshPolicy("");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel23 = deleteRequest22.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest10.consistencyLevel(writeConsistencyLevel23);
        deleteRequest24.setParentTask("hi!", (long) (short) 100);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest24.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest24.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId39 = null;
        org.elasticsearch.tasks.Task task40 = deleteRequest35.createTask(0L, "", "", taskId39);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest42 = deleteRequest35.setRefreshPolicy("");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel43 = deleteRequest42.consistencyLevel();
        org.elasticsearch.action.support.IndicesOptions indicesOptions44 = deleteRequest42.indicesOptions();
        java.lang.String str45 = deleteRequest42.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest46 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str47 = deleteRequest46.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest49 = deleteRequest46.version((long) (short) 100);
        deleteRequest46.primaryTerm(100L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest52 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str53 = deleteRequest52.parent();
        org.elasticsearch.index.VersionType versionType54 = deleteRequest52.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest55 = deleteRequest46.versionType(versionType54);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest56 = deleteRequest42.versionType(versionType54);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest57 = deleteRequest31.versionType(versionType54);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest59 = deleteRequest57.parent("");
        java.lang.String str60 = deleteRequest57.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest62 = deleteRequest57.setRefreshPolicy("");
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(task20);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel23 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel23.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertNotNull(task40);
        org.junit.Assert.assertNotNull(deleteRequest42);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel43 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel43.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(indicesOptions44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "delete {[][][]}" + "'", str45, "delete {[][][]}");
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(deleteRequest49);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(versionType54);
        org.junit.Assert.assertNotNull(deleteRequest55);
        org.junit.Assert.assertNotNull(deleteRequest56);
        org.junit.Assert.assertNotNull(deleteRequest57);
        org.junit.Assert.assertNotNull(deleteRequest59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(deleteRequest62);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[][][hi!]}][null][null]}", "delete {[][][]}", "");
        long long6 = deleteRequest5.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][null][null]}");
        org.elasticsearch.index.shard.ShardId shardId9 = deleteRequest8.shardId();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId17 = null;
        org.elasticsearch.tasks.Task task18 = deleteRequest13.createTask(0L, "", "", taskId17);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest13.setRefreshPolicy("");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel21 = deleteRequest20.consistencyLevel();
        org.elasticsearch.action.support.IndicesOptions indicesOptions22 = deleteRequest20.indicesOptions();
        java.lang.String str23 = deleteRequest20.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str25 = deleteRequest24.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest24.version((long) (short) 100);
        deleteRequest24.primaryTerm(100L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str31 = deleteRequest30.parent();
        org.elasticsearch.index.VersionType versionType32 = deleteRequest30.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest24.versionType(versionType32);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = deleteRequest20.versionType(versionType32);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = deleteRequest8.versionType(versionType32);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest36 = deleteRequest5.versionType(versionType32);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[][delete {[][][]}][delete {[][][]}]}", deleteRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(shardId9);
        org.junit.Assert.assertNotNull(task18);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel21 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel21.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(indicesOptions22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "delete {[][][]}" + "'", str23, "delete {[][][]}");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(versionType32);
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertNotNull(deleteRequest34);
        org.junit.Assert.assertNotNull(deleteRequest35);
        org.junit.Assert.assertNotNull(deleteRequest36);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "", "delete {[][][]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = deleteRequest3.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId12 = null;
        org.elasticsearch.tasks.Task task13 = deleteRequest8.createTask(0L, "", "", taskId12);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy14 = deleteRequest8.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest3.setRefreshPolicy(refreshPolicy14);
        java.lang.String str16 = deleteRequest3.index();
        org.elasticsearch.index.shard.ShardId shardId17 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest3.setShardId(shardId17);
        java.lang.Class<?> wildcardClass19 = deleteRequest18.getClass();
        org.junit.Assert.assertNull(transportAddress4);
        org.junit.Assert.assertNotNull(task13);
        org.junit.Assert.assertTrue("'" + refreshPolicy14 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy14.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        java.lang.String str5 = deleteRequest3.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str7 = deleteRequest6.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.version((long) (short) 100);
        org.elasticsearch.tasks.TaskId taskId10 = deleteRequest6.getParentTask();
        deleteRequest3.setParentTask(taskId10);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel13 = deleteRequest12.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel14 = deleteRequest12.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest3.consistencyLevel(writeConsistencyLevel14);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest3.type("delete {[delete {[][][hi!]}][null][null]}");
        deleteRequest3.primaryTerm((-1L));
        org.elasticsearch.common.transport.TransportAddress transportAddress20 = null;
        deleteRequest3.remoteAddress(transportAddress20);
        org.elasticsearch.index.shard.IndexShard indexShard22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult23 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest3, indexShard22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(taskId10);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel13 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel13.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel14 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel14.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest17);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.type("delete {[][][hi!]}");
        org.elasticsearch.index.VersionType versionType6 = deleteRequest5.versionType();
        java.lang.String str7 = deleteRequest5.index();
        org.elasticsearch.common.unit.TimeValue timeValue8 = deleteRequest5.timeout();
        org.elasticsearch.index.VersionType versionType9 = deleteRequest5.versionType();
        java.lang.Class<?> wildcardClass10 = deleteRequest5.getClass();
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(versionType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(versionType9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.index.shard.ShardId shardId5 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.setShardId(shardId5);
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.setShardId(shardId7);
        java.lang.String str9 = deleteRequest3.index();
        org.elasticsearch.common.io.stream.StreamInput streamInput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.readFrom(streamInput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        org.elasticsearch.index.VersionType versionType11 = deleteRequest3.versionType();
        java.lang.String str12 = deleteRequest3.parent();
        org.elasticsearch.common.transport.TransportAddress transportAddress13 = deleteRequest3.remoteAddress();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy14 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest3.setRefreshPolicy(refreshPolicy14);
        org.elasticsearch.action.support.IndicesOptions indicesOptions16 = deleteRequest3.indicesOptions();
        org.elasticsearch.index.shard.ShardId shardId17 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest3.setShardId(shardId17);
        org.elasticsearch.index.shard.ShardId shardId19 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest3.setShardId(shardId19);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest20.timeout("delete {[delete {[][][hi!]}][null][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[delete {[][][hi!]}][null][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(versionType11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(transportAddress13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(indicesOptions16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(deleteRequest20);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        org.elasticsearch.index.VersionType versionType11 = deleteRequest3.versionType();
        java.lang.String str12 = deleteRequest3.parent();
        org.elasticsearch.common.transport.TransportAddress transportAddress13 = deleteRequest3.remoteAddress();
        org.elasticsearch.index.shard.IndexShard indexShard14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult15 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest3, indexShard14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(versionType11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(transportAddress13);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = deleteRequest0.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = deleteRequest0.consistencyLevel();
        deleteRequest0.setParentTask("delete {[delete {[][][hi!]}][null][null]}", (long) 100);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId13 = null;
        org.elasticsearch.tasks.Task task14 = deleteRequest9.createTask(0L, "", "", taskId13);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest9.setRefreshPolicy("");
        org.elasticsearch.index.VersionType versionType17 = deleteRequest9.versionType();
        java.lang.String str18 = deleteRequest9.parent();
        org.elasticsearch.common.transport.TransportAddress transportAddress19 = deleteRequest9.remoteAddress();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy20 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest9.setRefreshPolicy(refreshPolicy20);
        long long22 = deleteRequest9.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue23 = deleteRequest9.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest0.timeout(timeValue23);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest24.parent("delete {[delete {[delete {[][][]}][delete {[][][hi!]}][delete {[null][null][null]}]}][null][null]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest26.setRefreshPolicy("delete {[delete {[][][]}][delete {[][][hi!]}][delete {[null][null][null]}]}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [delete {[delete {[][][]}][delete {[][][hi!]}][delete {[null][null][null]}]}].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel1 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel1.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel2 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel2.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(task14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(versionType17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(transportAddress19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(timeValue23);
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNotNull(deleteRequest26);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str6 = deleteRequest5.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest5.id("hi!");
        org.elasticsearch.tasks.TaskId taskId9 = deleteRequest8.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest8.setRefreshPolicy("");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy12 = deleteRequest8.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId20 = null;
        org.elasticsearch.tasks.Task task21 = deleteRequest16.createTask(0L, "", "", taskId20);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest16.setRefreshPolicy("");
        org.elasticsearch.index.VersionType versionType24 = deleteRequest16.versionType();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel25 = deleteRequest16.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest8.consistencyLevel(writeConsistencyLevel25);
        org.elasticsearch.index.shard.ShardId shardId27 = deleteRequest26.shardId();
        org.elasticsearch.index.shard.ShardId shardId28 = deleteRequest26.shardId();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest26.parent("delete {[null][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][null][null]}", "delete {[hi!][null][null]}", "delete {[hi!][null][null]}");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel35 = deleteRequest34.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest36 = deleteRequest26.consistencyLevel(writeConsistencyLevel35);
        java.lang.String str37 = deleteRequest26.index();
        java.lang.String str38 = deleteRequest26.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest40 = deleteRequest26.index("delete {[][delete {[][][]}][delete {[][][]}]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[null][null][null]}", deleteRequest26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(taskId9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertTrue("'" + refreshPolicy12 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE + "'", refreshPolicy12.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE));
        org.junit.Assert.assertNotNull(task21);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(versionType24);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel25 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel25.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNull(shardId27);
        org.junit.Assert.assertNull(shardId28);
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel35 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel35.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "delete {[][][hi!]}" + "'", str38, "delete {[][][hi!]}");
        org.junit.Assert.assertNotNull(deleteRequest40);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.index("delete {[][][hi!]}");
        java.lang.String str3 = deleteRequest2.parent();
        java.lang.String str4 = deleteRequest2.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest2.parent("delete {[][][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest2.parent("delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.routing("delete {[][][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.index("delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str20 = deleteRequest19.getDescription();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = new org.elasticsearch.action.delete.DeleteRequest("");
        long long26 = deleteRequest25.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str28 = deleteRequest27.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue31 = deleteRequest30.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest27.timeout(timeValue31);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = deleteRequest32.id("delete {[][][hi!]}");
        org.elasticsearch.tasks.TaskId taskId35 = deleteRequest34.getParentTask();
        deleteRequest25.setParentTask(taskId35);
        org.elasticsearch.tasks.Task task37 = deleteRequest19.createTask((long) ' ', "delete {[][][hi!]}", "delete {[][][]}", taskId35);
        org.elasticsearch.tasks.Task task38 = deleteRequest10.createTask(0L, "delete {[][delete {[][][hi!]}][delete {[][][]}]}", "", taskId35);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest40 = deleteRequest10.timeout("delete {[][delete {[hi!][delete {[hi!][null][null]}][delete {[delete {[][][hi!]}][null][null]}]}][delete {[][][]}]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[][delete {[hi!][delete {[hi!][null][null]}][delete {[delete {[][][hi!]}][null][null]}]}][delete {[][][]}]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[delete {[][][hi!]}][null][null]}" + "'", str4, "delete {[delete {[][][hi!]}][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "delete {[][][]}" + "'", str20, "delete {[][][]}");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(timeValue31);
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertNotNull(deleteRequest34);
        org.junit.Assert.assertNotNull(taskId35);
        org.junit.Assert.assertNotNull(task37);
        org.junit.Assert.assertNotNull(task38);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][delete {[][][]}][delete {[][][]}]}", "", "delete {[][][]}");
        long long4 = deleteRequest3.version();
        org.elasticsearch.common.io.stream.StreamInput streamInput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.readFrom(streamInput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3L) + "'", long4 == (-3L));
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.index.shard.ShardId shardId5 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.setShardId(shardId5);
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.setShardId(shardId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        org.elasticsearch.common.transport.TransportAddress transportAddress11 = null;
        deleteRequest10.remoteAddress(transportAddress11);
        boolean boolean13 = deleteRequest10.getShouldPersistResult();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest10.setRefreshPolicy("delete {[][null][null]}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [delete {[][null][null]}].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.parent();
        deleteRequest0.primaryTerm((long) (short) 100);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.setRefreshPolicy("");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException6 = deleteRequest5.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest5.index("delete {[hi!][null][null]}");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = deleteRequest5.getRefreshPolicy();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(actionRequestValidationException6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE));
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.index();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.setRefreshPolicy("delete {[][delete {[null][null][null]}][null]}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [delete {[][delete {[null][null][null]}][null]}].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.type("delete {[null][null][null]}");
        java.lang.String str6 = deleteRequest3.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.index("");
        org.elasticsearch.tasks.TaskId taskId9 = deleteRequest8.getParentTask();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[][null][null]}", deleteRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(taskId9);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue2 = deleteRequest1.timeout();
        org.elasticsearch.common.transport.TransportAddress transportAddress3 = null;
        deleteRequest1.remoteAddress(transportAddress3);
        java.lang.String str5 = deleteRequest1.index();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException6 = deleteRequest1.validate();
        java.lang.String[] strArray7 = deleteRequest1.indices();
        org.junit.Assert.assertNotNull(timeValue2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "delete {[null][null][null]}" + "'", str5, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(actionRequestValidationException6);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("");
        deleteRequest3.primaryTerm((long) (byte) 0);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue8 = deleteRequest7.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.timeout(timeValue8);
        java.lang.String str10 = deleteRequest3.toString();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException11 = deleteRequest3.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure13 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[delete {[][][hi!]}][null][null]}", (java.lang.Throwable) actionRequestValidationException11, "delete {[][null][null]}");
        java.lang.String str14 = shardFailure13.indexUUID;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting15 = shardFailure13.routing;
        java.lang.String str16 = shardFailure13.reason;
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "delete {[][null][null]}" + "'", str10, "delete {[][null][null]}");
        org.junit.Assert.assertNotNull(actionRequestValidationException11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "delete {[][null][null]}" + "'", str14, "delete {[][null][null]}");
        org.junit.Assert.assertNull(shardRouting15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "delete {[delete {[][][hi!]}][null][null]}" + "'", str16, "delete {[delete {[][][hi!]}][null][null]}");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.version((long) (short) 100);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.type("delete {[][][]}");
        java.lang.String str10 = deleteRequest7.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest7.id("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest12.parent("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId22 = null;
        org.elasticsearch.tasks.Task task23 = deleteRequest18.createTask(0L, "", "", taskId22);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest18.setRefreshPolicy("");
        java.lang.String[] strArray26 = deleteRequest25.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId34 = null;
        org.elasticsearch.tasks.Task task35 = deleteRequest30.createTask(0L, "", "", taskId34);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest37 = deleteRequest30.setRefreshPolicy("");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel38 = deleteRequest37.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest39 = deleteRequest25.consistencyLevel(writeConsistencyLevel38);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest41 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue42 = deleteRequest41.timeout();
        org.elasticsearch.common.transport.TransportAddress transportAddress43 = null;
        deleteRequest41.remoteAddress(transportAddress43);
        org.elasticsearch.common.unit.TimeValue timeValue45 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest46 = deleteRequest41.timeout(timeValue45);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest47 = deleteRequest25.timeout(timeValue45);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest48 = deleteRequest14.timeout(timeValue45);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest49 = deleteRequest3.timeout(timeValue45);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest51 = deleteRequest3.type("delete {[][][]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest53 = deleteRequest3.timeout("delete {[][delete {[null][null][null]}][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[][delete {[null][null][null]}][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "delete {[][][]}" + "'", str10, "delete {[][][]}");
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(task23);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(task35);
        org.junit.Assert.assertNotNull(deleteRequest37);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel38 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel38.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest39);
        org.junit.Assert.assertNotNull(timeValue42);
        org.junit.Assert.assertNotNull(timeValue45);
        org.junit.Assert.assertNotNull(deleteRequest46);
        org.junit.Assert.assertNotNull(deleteRequest47);
        org.junit.Assert.assertNotNull(deleteRequest48);
        org.junit.Assert.assertNotNull(deleteRequest49);
        org.junit.Assert.assertNotNull(deleteRequest51);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.version((long) (short) 100);
        java.lang.String str4 = deleteRequest3.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest("");
        long long7 = deleteRequest6.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.index("");
        boolean boolean10 = deleteRequest6.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest6.version((long) 1);
        org.elasticsearch.common.unit.TimeValue timeValue13 = deleteRequest6.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest3.timeout(timeValue13);
        java.lang.String str15 = deleteRequest3.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(timeValue13);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "delete {[null][null][null]}" + "'", str15, "delete {[null][null][null]}");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.type("delete {[][][]}");
        java.lang.String str6 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.id("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.parent("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest14.type("delete {[][][hi!]}");
        org.elasticsearch.index.VersionType versionType17 = deleteRequest16.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest8.versionType(versionType17);
        java.lang.String str19 = deleteRequest8.toString();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput20 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest8.writeTo(streamOutput20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "delete {[][][]}" + "'", str6, "delete {[][][]}");
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(versionType17);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "delete {[][delete {[][][]}][delete {[][][]}]}" + "'", str19, "delete {[][delete {[][][]}][delete {[][][]}]}");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = deleteRequest0.consistencyLevel();
        java.lang.String str2 = deleteRequest0.parent();
        boolean boolean3 = deleteRequest0.getShouldPersistResult();
        java.lang.String str4 = deleteRequest0.parent();
        java.lang.String str5 = deleteRequest0.toString();
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel1 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel1.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "delete {[null][null][null]}" + "'", str5, "delete {[null][null][null]}");
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        java.lang.String[] strArray11 = deleteRequest10.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId19 = null;
        org.elasticsearch.tasks.Task task20 = deleteRequest15.createTask(0L, "", "", taskId19);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest15.setRefreshPolicy("");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel23 = deleteRequest22.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest10.consistencyLevel(writeConsistencyLevel23);
        deleteRequest24.setParentTask("hi!", (long) (short) 100);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel29 = deleteRequest28.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel30 = deleteRequest28.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest24.consistencyLevel(writeConsistencyLevel30);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str33 = deleteRequest32.parent();
        deleteRequest32.primaryTerm((long) (short) 100);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest37 = deleteRequest32.setRefreshPolicy("");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy38 = deleteRequest37.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest39 = deleteRequest31.setRefreshPolicy(refreshPolicy38);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException40 = deleteRequest31.validate();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput41 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest31.writeTo(streamOutput41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(task20);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel23 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel23.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel29 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel29.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel30 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel30.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(deleteRequest37);
        org.junit.Assert.assertTrue("'" + refreshPolicy38 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE + "'", refreshPolicy38.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE));
        org.junit.Assert.assertNotNull(deleteRequest39);
        org.junit.Assert.assertNull(actionRequestValidationException40);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest3.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.timeout(timeValue4);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.id("delete {[][][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.version((long) 10);
        org.elasticsearch.action.support.IndicesOptions indicesOptions10 = deleteRequest7.indicesOptions();
        java.lang.String str11 = deleteRequest7.type();
        deleteRequest7.primaryTerm((long) 'a');
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest7.type("delete {[delete {[hi!][null][null]}][null][null]}");
        org.elasticsearch.tasks.TaskId taskId16 = deleteRequest15.getParentTask();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest15.setRefreshPolicy("delete {[delete {[delete {[][][]}][delete {[][][hi!]}][delete {[null][null][null]}]}][null][null]}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [delete {[delete {[delete {[][][]}][delete {[][][hi!]}][delete {[null][null][null]}]}][null][null]}].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(indicesOptions10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(taskId16);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[hi!][null][null]}", "delete {[delete {[][][hi!]}][null][null]}");
        java.lang.String str6 = deleteRequest5.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[hi!][delete {[hi!][null][null]}][delete {[delete {[][][hi!]}][null][null]}]}", deleteRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "delete {[hi!][delete {[hi!][null][null]}][delete {[delete {[][][hi!]}][null][null]}]}" + "'", str6, "delete {[hi!][delete {[hi!][null][null]}][delete {[delete {[][][hi!]}][null][null]}]}");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.setShardId(shardId2);
        java.lang.String str4 = deleteRequest3.toString();
        org.elasticsearch.common.transport.TransportAddress transportAddress5 = null;
        deleteRequest3.remoteAddress(transportAddress5);
        java.lang.String str7 = deleteRequest3.toString();
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[hi!][null][null]}" + "'", str4, "delete {[hi!][null][null]}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "delete {[hi!][null][null]}" + "'", str7, "delete {[hi!][null][null]}");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.type("delete {[null][null][null]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = deleteRequest3.remoteAddress();
        org.elasticsearch.index.shard.ShardId shardId5 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.setShardId(shardId5);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.version((long) '4');
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId16 = null;
        org.elasticsearch.tasks.Task task17 = deleteRequest12.createTask(0L, "", "", taskId16);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel18 = deleteRequest12.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "", "delete {[][][]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress23 = deleteRequest22.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId31 = null;
        org.elasticsearch.tasks.Task task32 = deleteRequest27.createTask(0L, "", "", taskId31);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy33 = deleteRequest27.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = deleteRequest22.setRefreshPolicy(refreshPolicy33);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = deleteRequest12.setRefreshPolicy(refreshPolicy33);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest36 = deleteRequest6.setRefreshPolicy(refreshPolicy33);
        org.elasticsearch.common.io.stream.StreamInput streamInput37 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest6.readFrom(streamInput37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNull(transportAddress4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(task17);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel18 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel18.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNull(transportAddress23);
        org.junit.Assert.assertNotNull(task32);
        org.junit.Assert.assertTrue("'" + refreshPolicy33 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy33.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest34);
        org.junit.Assert.assertNotNull(deleteRequest35);
        org.junit.Assert.assertNotNull(deleteRequest36);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][delete {[][][]}][delete {[][][]}]}", "", "delete {[][][]}");
        long long4 = deleteRequest3.version();
        java.lang.Class<?> wildcardClass5 = deleteRequest3.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3L) + "'", long4 == (-3L));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str6 = deleteRequest5.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest5.id("hi!");
        org.elasticsearch.tasks.TaskId taskId9 = deleteRequest8.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest8.setRefreshPolicy("");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy12 = deleteRequest8.getRefreshPolicy();
        long long13 = deleteRequest8.version();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}", deleteRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(taskId9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertTrue("'" + refreshPolicy12 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE + "'", refreshPolicy12.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-3L) + "'", long13 == (-3L));
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.setShardId(shardId2);
        java.lang.String str4 = deleteRequest3.toString();
        org.elasticsearch.common.transport.TransportAddress transportAddress5 = null;
        deleteRequest3.remoteAddress(transportAddress5);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId14 = null;
        org.elasticsearch.tasks.Task task15 = deleteRequest10.createTask(0L, "", "", taskId14);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest10.setRefreshPolicy("");
        java.lang.String str18 = deleteRequest17.toString();
        java.lang.String[] strArray19 = deleteRequest17.indices();
        deleteRequest17.primaryTerm(0L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest17.routing("delete {[null][null][null]}");
        org.elasticsearch.index.shard.ShardId shardId24 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest23.setShardId(shardId24);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest30.index("delete {[][][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = deleteRequest32.type("delete {[][][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest38 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId42 = null;
        org.elasticsearch.tasks.Task task43 = deleteRequest38.createTask(0L, "", "", taskId42);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy44 = deleteRequest38.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest48 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId52 = null;
        org.elasticsearch.tasks.Task task53 = deleteRequest48.createTask(0L, "", "", taskId52);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy54 = deleteRequest48.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest55 = deleteRequest38.setRefreshPolicy(refreshPolicy54);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest56 = deleteRequest34.setRefreshPolicy(refreshPolicy54);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest58 = deleteRequest34.parent("delete {[][delete {[][][]}][delete {[][][]}]}");
        deleteRequest58.setParentTask("delete {[][][hi!]}", (long) (byte) 100);
        org.elasticsearch.common.transport.TransportAddress transportAddress62 = null;
        deleteRequest58.remoteAddress(transportAddress62);
        org.elasticsearch.index.VersionType versionType64 = deleteRequest58.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest65 = deleteRequest29.versionType(versionType64);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest66 = deleteRequest25.versionType(versionType64);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest67 = deleteRequest3.versionType(versionType64);
        org.elasticsearch.index.shard.IndexShard indexShard68 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult69 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest67, indexShard68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[hi!][null][null]}" + "'", str4, "delete {[hi!][null][null]}");
        org.junit.Assert.assertNotNull(task15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "delete {[][][]}" + "'", str18, "delete {[][][]}");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertNotNull(deleteRequest34);
        org.junit.Assert.assertNotNull(task43);
        org.junit.Assert.assertTrue("'" + refreshPolicy44 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy44.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(task53);
        org.junit.Assert.assertTrue("'" + refreshPolicy54 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy54.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest55);
        org.junit.Assert.assertNotNull(deleteRequest56);
        org.junit.Assert.assertNotNull(deleteRequest58);
        org.junit.Assert.assertNotNull(versionType64);
        org.junit.Assert.assertNotNull(deleteRequest65);
        org.junit.Assert.assertNotNull(deleteRequest66);
        org.junit.Assert.assertNotNull(deleteRequest67);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.index("delete {[][][hi!]}");
        java.lang.String str3 = deleteRequest2.parent();
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = deleteRequest2.remoteAddress();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(transportAddress4);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest3.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.timeout(timeValue4);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.id("delete {[][][hi!]}");
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest7.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest7.id("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.index("delete {[][][hi!]}");
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest12.setParentTask("", (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 0 length nodeIds are reserved for EMPTY_TASK_ID and are otherwise invalid.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[][null][null]}][][]}", "delete {[][delete {[][][hi!]}][delete {[][][]}]}", "delete {[][][hi!]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.timeout("delete {[][delete {[null][null][null]}][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[][delete {[null][null][null]}][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][][hi!]}", "delete {[null][null][null]}", "");
        java.lang.String[] strArray4 = deleteRequest3.indices();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput5 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.writeTo(streamOutput5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.id("hi!");
        org.elasticsearch.tasks.TaskId taskId7 = deleteRequest6.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId15 = null;
        org.elasticsearch.tasks.Task task16 = deleteRequest11.createTask(0L, "", "", taskId15);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest11.setRefreshPolicy("");
        java.lang.String[] strArray19 = deleteRequest18.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId27 = null;
        org.elasticsearch.tasks.Task task28 = deleteRequest23.createTask(0L, "", "", taskId27);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest23.setRefreshPolicy("");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel31 = deleteRequest30.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest18.consistencyLevel(writeConsistencyLevel31);
        deleteRequest32.setParentTask("hi!", (long) (short) 100);
        org.elasticsearch.index.VersionType versionType36 = deleteRequest32.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest37 = deleteRequest6.versionType(versionType36);
        org.elasticsearch.index.shard.IndexShard indexShard38 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete39 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest6, indexShard38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(taskId7);
        org.junit.Assert.assertNotNull(task16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(task28);
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel31 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel31.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertNotNull(versionType36);
        org.junit.Assert.assertNotNull(deleteRequest37);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[][null][null]}][][]}", "delete {[][delete {[][][hi!]}][delete {[][][]}]}", "delete {[][][hi!]}");
        org.elasticsearch.index.shard.IndexShard indexShard4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult5 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest3, indexShard4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[][][hi!]}][null][null]}");
        java.lang.String str2 = deleteRequest1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "delete {[delete {[delete {[][][hi!]}][null][null]}][null][null]}" + "'", str2, "delete {[delete {[delete {[][][hi!]}][null][null]}][null][null]}");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.type("delete {[null][null][null]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = deleteRequest7.remoteAddress();
        org.elasticsearch.index.shard.ShardId shardId9 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest7.setShardId(shardId9);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.version((long) '4');
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy13 = deleteRequest10.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest3.setRefreshPolicy(refreshPolicy13);
        org.elasticsearch.index.shard.IndexShard indexShard15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult16 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest3, indexShard15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNull(transportAddress8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertTrue("'" + refreshPolicy13 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy13.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest14);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        java.lang.String[] strArray11 = deleteRequest10.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId19 = null;
        org.elasticsearch.tasks.Task task20 = deleteRequest15.createTask(0L, "", "", taskId19);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest15.setRefreshPolicy("");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel23 = deleteRequest22.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest10.consistencyLevel(writeConsistencyLevel23);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue27 = deleteRequest26.timeout();
        org.elasticsearch.common.transport.TransportAddress transportAddress28 = null;
        deleteRequest26.remoteAddress(transportAddress28);
        org.elasticsearch.common.unit.TimeValue timeValue30 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest26.timeout(timeValue30);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest10.timeout(timeValue30);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = deleteRequest32.parent("delete {[][][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest38 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[][][hi!]}][null][null]}", "delete {[][][]}", "");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel39 = deleteRequest38.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest40 = deleteRequest34.consistencyLevel(writeConsistencyLevel39);
        org.elasticsearch.common.io.stream.StreamInput streamInput41 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest34.readFrom(streamInput41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(task20);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel23 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel23.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNotNull(timeValue27);
        org.junit.Assert.assertNotNull(timeValue30);
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertNotNull(deleteRequest34);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel39 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel39.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest40);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.type("delete {[null][null][null]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress8 = deleteRequest7.remoteAddress();
        org.elasticsearch.index.shard.ShardId shardId9 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest7.setShardId(shardId9);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.version((long) '4');
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy13 = deleteRequest10.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest3.setRefreshPolicy(refreshPolicy13);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException15 = deleteRequest3.validate();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException16 = deleteRequest3.validate();
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNull(transportAddress8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertTrue("'" + refreshPolicy13 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy13.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNull(actionRequestValidationException15);
        org.junit.Assert.assertNull(actionRequestValidationException16);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.index("delete {[][][hi!]}");
        java.lang.String str3 = deleteRequest2.parent();
        java.lang.String str4 = deleteRequest2.type();
        long long5 = deleteRequest2.primaryTerm();
        long long6 = deleteRequest2.version();
        java.lang.String str7 = deleteRequest2.type();
        java.lang.String str8 = deleteRequest2.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest2.timeout("delete {[][delete {[][][hi!]}][delete {[][][]}]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[][delete {[][][hi!]}][delete {[][][]}]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-3L) + "'", long6 == (-3L));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "delete {[delete {[][][hi!]}][null][null]}" + "'", str8, "delete {[delete {[][][hi!]}][null][null]}");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[][delete {[hi!][delete {[hi!][null][null]}][delete {[delete {[][][hi!]}][null][null]}]}][delete {[][][]}]}", deleteRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.type("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.id("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.parent("hi!");
        org.elasticsearch.index.shard.IndexShard indexShard10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult11 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest9, indexShard10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId9 = null;
        org.elasticsearch.tasks.Task task10 = deleteRequest5.createTask(0L, "", "", taskId9);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest5.setRefreshPolicy("");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "", deleteRequest12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task10);
        org.junit.Assert.assertNotNull(deleteRequest12);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = deleteRequest3.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId17 = null;
        org.elasticsearch.tasks.Task task18 = deleteRequest13.createTask(0L, "", "", taskId17);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy19 = deleteRequest13.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest3.setRefreshPolicy(refreshPolicy19);
        java.lang.String str21 = deleteRequest3.getDescription();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest3.id("hi!");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel24 = deleteRequest3.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest28.type("delete {[][][]}");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel31 = deleteRequest30.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest3.consistencyLevel(writeConsistencyLevel31);
        java.lang.Class<?> wildcardClass33 = writeConsistencyLevel31.getClass();
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(task18);
        org.junit.Assert.assertTrue("'" + refreshPolicy19 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy19.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "delete {[][][]}" + "'", str21, "delete {[][][]}");
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel24 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel24.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel31 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel31.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.id("hi!");
        org.elasticsearch.tasks.TaskId taskId7 = deleteRequest6.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.setRefreshPolicy("");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy10 = deleteRequest6.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId18 = null;
        org.elasticsearch.tasks.Task task19 = deleteRequest14.createTask(0L, "", "", taskId18);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest14.setRefreshPolicy("");
        org.elasticsearch.index.VersionType versionType22 = deleteRequest14.versionType();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel23 = deleteRequest14.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest6.consistencyLevel(writeConsistencyLevel23);
        long long25 = deleteRequest24.version();
        org.elasticsearch.index.shard.IndexShard indexShard26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult27 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest24, indexShard26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(taskId7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertTrue("'" + refreshPolicy10 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE + "'", refreshPolicy10.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE));
        org.junit.Assert.assertNotNull(task19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(versionType22);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel23 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel23.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-3L) + "'", long25 == (-3L));
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        java.lang.String str5 = deleteRequest3.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.type("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest("");
        long long10 = deleteRequest9.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue11 = deleteRequest9.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest7.timeout(timeValue11);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = new org.elasticsearch.action.delete.DeleteRequest("");
        deleteRequest17.setParentTask("hi!", (long) (short) 1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest24.type("delete {[][][]}");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy27 = deleteRequest24.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest17.setRefreshPolicy(refreshPolicy27);
        org.elasticsearch.tasks.TaskId taskId29 = deleteRequest17.getParentTask();
        org.elasticsearch.tasks.Task task30 = deleteRequest12.createTask(1L, "", "delete {[null][null][null]}", taskId29);
        java.lang.String str31 = deleteRequest12.id();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeValue11);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertTrue("'" + refreshPolicy27 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy27.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertNotNull(taskId29);
        org.junit.Assert.assertNotNull(task30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("");
        deleteRequest5.primaryTerm((long) (byte) 0);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue10 = deleteRequest9.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest5.timeout(timeValue10);
        java.lang.String str12 = deleteRequest5.toString();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException13 = deleteRequest5.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure15 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "delete {[][null][null]}", (java.lang.Throwable) actionRequestValidationException13, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure17 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "hi!", (java.lang.Throwable) actionRequestValidationException13, "");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting18 = shardFailure17.routing;
        org.junit.Assert.assertNotNull(timeValue10);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "delete {[][null][null]}" + "'", str12, "delete {[][null][null]}");
        org.junit.Assert.assertNotNull(actionRequestValidationException13);
        org.junit.Assert.assertNull(shardRouting18);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][delete {[][][]}][delete {[][][]}]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.version((long) (-1));
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = null;
        deleteRequest3.remoteAddress(transportAddress4);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.index("delete {[][delete {[][][]}][delete {[][][]}]}");
        org.elasticsearch.common.io.stream.StreamInput streamInput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.readFrom(streamInput8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest7);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[][][hi!]}][null][null]}", "delete {[][][]}", "");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = deleteRequest3.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.type("delete {[][delete {[][][]}][delete {[][][]}]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.type("delete {[null][null][null]}");
        java.lang.String str14 = deleteRequest11.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest11.index("");
        org.elasticsearch.tasks.TaskId taskId17 = deleteRequest16.getParentTask();
        org.elasticsearch.tasks.Task task18 = deleteRequest6.createTask((long) 1, "delete {[][null][null]}", "delete {[null][null][null]}", taskId17);
        org.elasticsearch.index.shard.ShardId shardId19 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest6.setShardId(shardId19);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel4 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel4.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(taskId17);
        org.junit.Assert.assertNotNull(task18);
        org.junit.Assert.assertNotNull(deleteRequest20);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = deleteRequest0.consistencyLevel();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy2 = deleteRequest0.getRefreshPolicy();
        deleteRequest0.setParentTask("delete {[hi!][null][null]}", (long) (short) 10);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest12.type("delete {[][][]}");
        java.lang.String str15 = deleteRequest12.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest12.id("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest12.index("delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}", "delete {[][][hi!]}", "hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str34 = deleteRequest33.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest36 = deleteRequest33.id("hi!");
        org.elasticsearch.tasks.TaskId taskId37 = deleteRequest36.getParentTask();
        org.elasticsearch.tasks.TaskId taskId38 = deleteRequest36.getParentTask();
        org.elasticsearch.tasks.Task task39 = deleteRequest26.createTask((-1L), "", "hi!", taskId38);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest43 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel44 = deleteRequest43.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel45 = deleteRequest43.consistencyLevel();
        deleteRequest43.primaryTerm((long) (short) 10);
        long long48 = deleteRequest43.version();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest55 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId59 = null;
        org.elasticsearch.tasks.Task task60 = deleteRequest55.createTask(0L, "", "", taskId59);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest62 = deleteRequest55.setRefreshPolicy("");
        java.lang.String str63 = deleteRequest62.toString();
        java.lang.String[] strArray64 = deleteRequest62.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest66 = deleteRequest62.index("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest70 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest74 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str75 = deleteRequest74.id();
        java.lang.String str76 = deleteRequest74.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest77 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str78 = deleteRequest77.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest80 = deleteRequest77.version((long) (short) 100);
        org.elasticsearch.tasks.TaskId taskId81 = deleteRequest77.getParentTask();
        deleteRequest74.setParentTask(taskId81);
        deleteRequest70.setParentTask(taskId81);
        deleteRequest66.setParentTask(taskId81);
        org.elasticsearch.tasks.Task task85 = deleteRequest43.createTask((-1L), "delete {[][delete {[][][]}][delete {[][][]}]}", "delete {[][][hi!]}", taskId81);
        org.elasticsearch.tasks.Task task86 = deleteRequest26.createTask((long) (byte) 100, "delete {[][][hi!]}", "delete {[][][hi!]}", taskId81);
        org.elasticsearch.tasks.Task task87 = deleteRequest19.createTask(1L, "delete {[][delete {[][][]}][delete {[][][]}]}", "delete {[][][]}", taskId81);
        org.elasticsearch.tasks.Task task88 = deleteRequest0.createTask(100L, "delete {[null][null][null]}", "delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}", taskId81);
        org.elasticsearch.common.transport.TransportAddress transportAddress89 = null;
        deleteRequest0.remoteAddress(transportAddress89);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel1 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel1.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + refreshPolicy2 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy2.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "delete {[][][]}" + "'", str15, "delete {[][][]}");
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(deleteRequest36);
        org.junit.Assert.assertNotNull(taskId37);
        org.junit.Assert.assertNotNull(taskId38);
        org.junit.Assert.assertNotNull(task39);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel44 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel44.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel45 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel45.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-3L) + "'", long48 == (-3L));
        org.junit.Assert.assertNotNull(task60);
        org.junit.Assert.assertNotNull(deleteRequest62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "delete {[][][]}" + "'", str63, "delete {[][][]}");
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(deleteRequest66);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertNotNull(deleteRequest80);
        org.junit.Assert.assertNotNull(taskId81);
        org.junit.Assert.assertNotNull(task85);
        org.junit.Assert.assertNotNull(task86);
        org.junit.Assert.assertNotNull(task87);
        org.junit.Assert.assertNotNull(task88);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        org.elasticsearch.index.VersionType versionType11 = deleteRequest3.versionType();
        java.lang.String str12 = deleteRequest3.parent();
        org.elasticsearch.common.transport.TransportAddress transportAddress13 = deleteRequest3.remoteAddress();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy14 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest3.setRefreshPolicy(refreshPolicy14);
        org.elasticsearch.action.support.IndicesOptions indicesOptions16 = deleteRequest3.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException17 = deleteRequest3.validate();
        java.lang.String[] strArray18 = deleteRequest3.indices();
        java.lang.String str19 = deleteRequest3.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str21 = deleteRequest20.parent();
        deleteRequest20.primaryTerm((long) (short) 100);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest20.setRefreshPolicy("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest25.type("delete {[null][null][null]}");
        org.elasticsearch.index.VersionType versionType28 = deleteRequest27.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest3.versionType(versionType28);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest3.routing("");
        long long32 = deleteRequest3.primaryTerm();
        java.lang.Class<?> wildcardClass33 = deleteRequest3.getClass();
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(versionType11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(transportAddress13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(indicesOptions16);
        org.junit.Assert.assertNull(actionRequestValidationException17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertNotNull(versionType28);
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.type("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.id("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.type("delete {[hi!][delete {[hi!][null][null]}][delete {[delete {[][][hi!]}][null][null]}]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId17 = null;
        org.elasticsearch.tasks.Task task18 = deleteRequest13.createTask(0L, "", "", taskId17);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest13.setRefreshPolicy("");
        org.elasticsearch.index.VersionType versionType21 = deleteRequest13.versionType();
        java.lang.String str22 = deleteRequest13.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId30 = null;
        org.elasticsearch.tasks.Task task31 = deleteRequest26.createTask(0L, "", "", taskId30);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy32 = deleteRequest26.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest13.setRefreshPolicy(refreshPolicy32);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = deleteRequest9.setRefreshPolicy(refreshPolicy32);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest36 = deleteRequest9.parent("delete {[delete {[][][hi!]}][delete {[][][hi!]}][null]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress37 = deleteRequest9.remoteAddress();
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(task18);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(versionType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "delete {[][][]}" + "'", str22, "delete {[][][]}");
        org.junit.Assert.assertNotNull(task31);
        org.junit.Assert.assertTrue("'" + refreshPolicy32 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy32.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertNotNull(deleteRequest34);
        org.junit.Assert.assertNotNull(deleteRequest36);
        org.junit.Assert.assertNull(transportAddress37);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.type();
        deleteRequest3.setParentTask("delete {[][][hi!]}", (long) (short) 1);
        java.lang.String str8 = deleteRequest3.parent();
        org.elasticsearch.common.io.stream.StreamInput streamInput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.readFrom(streamInput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[][][hi!]}][null][null]}", "delete {[][][]}", "");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = deleteRequest3.consistencyLevel();
        org.elasticsearch.index.shard.ShardId shardId5 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.setShardId(shardId5);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.parent("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.type("delete {[hi!][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue12 = deleteRequest9.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest6.timeout(timeValue12);
        org.elasticsearch.common.io.stream.StreamInput streamInput14 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest6.readFrom(streamInput14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel4 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel4.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(timeValue12);
        org.junit.Assert.assertNotNull(deleteRequest13);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        org.elasticsearch.index.VersionType versionType11 = deleteRequest3.versionType();
        java.lang.String str12 = deleteRequest3.parent();
        org.elasticsearch.common.transport.TransportAddress transportAddress13 = deleteRequest3.remoteAddress();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy14 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest3.setRefreshPolicy(refreshPolicy14);
        org.elasticsearch.action.support.IndicesOptions indicesOptions16 = deleteRequest3.indicesOptions();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException17 = deleteRequest3.validate();
        java.lang.String[] strArray18 = deleteRequest3.indices();
        java.lang.String str19 = deleteRequest3.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str21 = deleteRequest20.parent();
        deleteRequest20.primaryTerm((long) (short) 100);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest20.setRefreshPolicy("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest25.type("delete {[null][null][null]}");
        org.elasticsearch.index.VersionType versionType28 = deleteRequest27.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest3.versionType(versionType28);
        java.lang.Class<?> wildcardClass30 = versionType28.getClass();
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(versionType11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(transportAddress13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(indicesOptions16);
        org.junit.Assert.assertNull(actionRequestValidationException17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertNotNull(versionType28);
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "", "delete {[][][]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = deleteRequest3.remoteAddress();
        java.lang.String str5 = deleteRequest3.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId16 = null;
        org.elasticsearch.tasks.Task task17 = deleteRequest12.createTask(0L, "", "", taskId16);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest12.setRefreshPolicy("");
        java.lang.String[] strArray20 = deleteRequest19.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId28 = null;
        org.elasticsearch.tasks.Task task29 = deleteRequest24.createTask(0L, "", "", taskId28);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest24.setRefreshPolicy("");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel32 = deleteRequest31.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest19.consistencyLevel(writeConsistencyLevel32);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue36 = deleteRequest35.timeout();
        org.elasticsearch.common.transport.TransportAddress transportAddress37 = null;
        deleteRequest35.remoteAddress(transportAddress37);
        org.elasticsearch.common.unit.TimeValue timeValue39 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest40 = deleteRequest35.timeout(timeValue39);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest41 = deleteRequest19.timeout(timeValue39);
        org.elasticsearch.index.shard.ShardId shardId42 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest43 = deleteRequest41.setShardId(shardId42);
        org.elasticsearch.tasks.TaskId taskId44 = deleteRequest41.getParentTask();
        org.elasticsearch.tasks.Task task45 = deleteRequest3.createTask((long) '#', "delete {[][][]}", "delete {[][][hi!]}", taskId44);
        java.lang.Class<?> wildcardClass46 = deleteRequest3.getClass();
        org.junit.Assert.assertNull(transportAddress4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(task17);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(task29);
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel32 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel32.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertNotNull(timeValue36);
        org.junit.Assert.assertNotNull(timeValue39);
        org.junit.Assert.assertNotNull(deleteRequest40);
        org.junit.Assert.assertNotNull(deleteRequest41);
        org.junit.Assert.assertNotNull(deleteRequest43);
        org.junit.Assert.assertNotNull(taskId44);
        org.junit.Assert.assertNotNull(task45);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.common.transport.TransportAddress transportAddress5 = deleteRequest3.remoteAddress();
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.setShardId(shardId6);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.type("delete {[][][hi!]}");
        org.elasticsearch.index.VersionType versionType14 = deleteRequest13.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest7.versionType(versionType14);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest15.id("delete {[delete {[][][]}][delete {[][][hi!]}][delete {[null][null][null]}]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest17.timeout("delete {[delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}][delete {[][][]}][delete {[][][]}]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}][delete {[][][]}][delete {[][][]}]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(transportAddress5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(versionType14);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest17);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        deleteRequest1.setParentTask("hi!", (long) (short) 1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.type("delete {[][][]}");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy11 = deleteRequest8.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest1.setRefreshPolicy(refreshPolicy11);
        long long13 = deleteRequest1.version();
        org.elasticsearch.index.shard.ShardId shardId14 = deleteRequest1.shardId();
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertTrue("'" + refreshPolicy11 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy11.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-3L) + "'", long13 == (-3L));
        org.junit.Assert.assertNull(shardId14);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str6 = deleteRequest5.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest5.id("hi!");
        java.lang.String str9 = deleteRequest8.routing();
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = null;
        deleteRequest8.remoteAddress(transportAddress10);
        org.elasticsearch.common.transport.TransportAddress transportAddress12 = deleteRequest8.remoteAddress();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "", deleteRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(transportAddress12);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str3 = deleteRequest2.parent();
        deleteRequest2.primaryTerm((long) (short) 100);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest2.setRefreshPolicy("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.type("delete {[null][null][null]}");
        java.lang.String str10 = deleteRequest7.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest7.index("delete {[][][]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[delete {[][delete {[][][]}][delete {[][][]}]}][null][null]}", deleteRequest12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(deleteRequest12);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.version((long) (short) 100);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.routing("delete {[][][hi!]}");
        org.elasticsearch.common.io.stream.StreamOutput streamOutput6 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.writeTo(streamOutput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str6 = deleteRequest5.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest5.id("hi!");
        org.elasticsearch.tasks.TaskId taskId9 = deleteRequest8.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest8.setRefreshPolicy("");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy12 = deleteRequest8.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId20 = null;
        org.elasticsearch.tasks.Task task21 = deleteRequest16.createTask(0L, "", "", taskId20);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest16.setRefreshPolicy("");
        org.elasticsearch.index.VersionType versionType24 = deleteRequest16.versionType();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel25 = deleteRequest16.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest8.consistencyLevel(writeConsistencyLevel25);
        org.elasticsearch.index.shard.ShardId shardId27 = deleteRequest26.shardId();
        org.elasticsearch.index.shard.ShardId shardId28 = deleteRequest26.shardId();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[delete {[][][hi!]}][null][null]}", deleteRequest26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(taskId9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertTrue("'" + refreshPolicy12 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE + "'", refreshPolicy12.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE));
        org.junit.Assert.assertNotNull(task21);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(versionType24);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel25 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel25.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNull(shardId27);
        org.junit.Assert.assertNull(shardId28);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("hi!");
        org.elasticsearch.index.shard.ShardId shardId2 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.setShardId(shardId2);
        deleteRequest1.primaryTerm((long) 1);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy6 = deleteRequest1.getRefreshPolicy();
        org.elasticsearch.tasks.TaskId taskId7 = deleteRequest1.getParentTask();
        java.lang.String str8 = deleteRequest1.routing();
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertTrue("'" + refreshPolicy6 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy6.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(taskId7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}", "delete {[][delete {[][][hi!]}][delete {[][][]}]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest4.index("delete {[][][hi!]}");
        java.lang.String str7 = deleteRequest6.parent();
        java.lang.String str8 = deleteRequest6.type();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest6.version((long) (short) 100);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = deleteRequest10.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId19 = null;
        org.elasticsearch.tasks.Task task20 = deleteRequest15.createTask(0L, "", "", taskId19);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy21 = deleteRequest15.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest10.setRefreshPolicy(refreshPolicy21);
        org.elasticsearch.common.unit.TimeValue timeValue23 = deleteRequest10.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest3.timeout(timeValue23);
        java.lang.Class<?> wildcardClass25 = deleteRequest3.getClass();
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel11 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel11.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(task20);
        org.junit.Assert.assertTrue("'" + refreshPolicy21 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy21.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertNotNull(timeValue23);
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.index("delete {[][][hi!]}");
        java.lang.String str3 = deleteRequest2.parent();
        java.lang.String str4 = deleteRequest2.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest2.parent("delete {[][][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest2.parent("delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.routing("delete {[][][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.index("delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException13 = deleteRequest10.validate();
        java.lang.String str14 = deleteRequest10.index();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput15 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest10.writeTo(streamOutput15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[delete {[][][hi!]}][null][null]}" + "'", str4, "delete {[delete {[][][hi!]}][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(actionRequestValidationException13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}" + "'", str14, "delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[hi!][delete {[hi!][null][null]}][delete {[delete {[][][hi!]}][null][null]}]}", "delete {[][null][null]}", "delete {[][delete {[][][]}][delete {[][][]}]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId11 = null;
        org.elasticsearch.tasks.Task task12 = deleteRequest7.createTask(0L, "", "", taskId11);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy13 = deleteRequest7.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest3.setRefreshPolicy(refreshPolicy13);
        org.elasticsearch.tasks.TaskId taskId15 = deleteRequest14.getParentTask();
        java.lang.Class<?> wildcardClass16 = deleteRequest14.getClass();
        org.junit.Assert.assertNotNull(task12);
        org.junit.Assert.assertTrue("'" + refreshPolicy13 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy13.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(taskId15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.type("delete {[][][hi!]}");
        org.elasticsearch.index.VersionType versionType6 = deleteRequest5.versionType();
        deleteRequest5.primaryTerm((-1L));
        org.elasticsearch.index.shard.IndexShard indexShard9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete10 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest5, indexShard9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(versionType6);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        java.lang.String str5 = deleteRequest3.index();
        org.elasticsearch.tasks.TaskId taskId6 = deleteRequest3.getParentTask();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException7 = deleteRequest3.validate();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue10 = deleteRequest9.timeout();
        org.elasticsearch.common.transport.TransportAddress transportAddress11 = null;
        deleteRequest9.remoteAddress(transportAddress11);
        org.elasticsearch.common.unit.TimeValue timeValue13 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest9.timeout(timeValue13);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest3.timeout(timeValue13);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str23 = deleteRequest22.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest27.type("delete {[][][]}");
        java.lang.String str30 = deleteRequest27.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest27.id("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest36 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId40 = null;
        org.elasticsearch.tasks.Task task41 = deleteRequest36.createTask(0L, "", "", taskId40);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest43 = deleteRequest36.setRefreshPolicy("");
        java.lang.String str44 = deleteRequest43.toString();
        java.lang.String[] strArray45 = deleteRequest43.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest47 = deleteRequest43.index("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest51 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest55 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str56 = deleteRequest55.id();
        java.lang.String str57 = deleteRequest55.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest58 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str59 = deleteRequest58.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest61 = deleteRequest58.version((long) (short) 100);
        org.elasticsearch.tasks.TaskId taskId62 = deleteRequest58.getParentTask();
        deleteRequest55.setParentTask(taskId62);
        deleteRequest51.setParentTask(taskId62);
        deleteRequest47.setParentTask(taskId62);
        deleteRequest32.setParentTask(taskId62);
        deleteRequest22.setParentTask(taskId62);
        org.elasticsearch.tasks.Task task68 = deleteRequest15.createTask((long) (short) -1, "delete {[hi!][null][null]}", "hi!", taskId62);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest70 = deleteRequest15.index("delete {[][null][null]}");
        java.lang.String str71 = deleteRequest70.getDescription();
        deleteRequest70.primaryTerm((long) (short) -1);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput74 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest70.writeTo(streamOutput74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(taskId6);
        org.junit.Assert.assertNull(actionRequestValidationException7);
        org.junit.Assert.assertNotNull(timeValue10);
        org.junit.Assert.assertNotNull(timeValue13);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "delete {[][][]}" + "'", str30, "delete {[][][]}");
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertNotNull(task41);
        org.junit.Assert.assertNotNull(deleteRequest43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "delete {[][][]}" + "'", str44, "delete {[][][]}");
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(deleteRequest47);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(deleteRequest61);
        org.junit.Assert.assertNotNull(taskId62);
        org.junit.Assert.assertNotNull(task68);
        org.junit.Assert.assertNotNull(deleteRequest70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "delete {[delete {[][null][null]}][][]}" + "'", str71, "delete {[delete {[][null][null]}][][]}");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.elasticsearch.cluster.routing.ShardRouting shardRouting0 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting2 = null;
        org.elasticsearch.cluster.routing.ShardRouting shardRouting4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest("");
        deleteRequest7.primaryTerm((long) (byte) 0);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue12 = deleteRequest11.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest7.timeout(timeValue12);
        java.lang.String str14 = deleteRequest7.toString();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException15 = deleteRequest7.validate();
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure17 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting4, "delete {[][null][null]}", (java.lang.Throwable) actionRequestValidationException15, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure19 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting2, "hi!", (java.lang.Throwable) actionRequestValidationException15, "");
        org.elasticsearch.index.shard.IndexShard.ShardFailure shardFailure21 = new org.elasticsearch.index.shard.IndexShard.ShardFailure(shardRouting0, "delete {[][delete {[hi!][delete {[hi!][null][null]}][delete {[delete {[][][hi!]}][null][null]}]}][delete {[][][]}]}", (java.lang.Throwable) actionRequestValidationException15, "delete {[delete {[hi!][null][null]}][null][null]}");
        java.lang.String str22 = shardFailure21.reason;
        org.junit.Assert.assertNotNull(timeValue12);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "delete {[][null][null]}" + "'", str14, "delete {[][null][null]}");
        org.junit.Assert.assertNotNull(actionRequestValidationException15);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "delete {[][delete {[hi!][delete {[hi!][null][null]}][delete {[delete {[][][hi!]}][null][null]}]}][delete {[][][]}]}" + "'", str22, "delete {[][delete {[hi!][delete {[hi!][null][null]}][delete {[delete {[][][hi!]}][null][null]}]}][delete {[][][]}]}");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}", "delete {[delete {[hi!][null][null]}][null][null]}", "delete {[null][null][null]}");
        org.elasticsearch.index.shard.IndexShard indexShard4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult5 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest3, indexShard4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        deleteRequest1.primaryTerm((long) (byte) 0);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue6 = deleteRequest5.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest1.timeout(timeValue6);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException8 = deleteRequest1.validate();
        org.elasticsearch.index.VersionType versionType9 = deleteRequest1.versionType();
        org.elasticsearch.common.io.stream.StreamInput streamInput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest1.readFrom(streamInput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(actionRequestValidationException8);
        org.junit.Assert.assertNotNull(versionType9);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.index("delete {[][][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest2.type("delete {[][][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId12 = null;
        org.elasticsearch.tasks.Task task13 = deleteRequest8.createTask(0L, "", "", taskId12);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy14 = deleteRequest8.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId22 = null;
        org.elasticsearch.tasks.Task task23 = deleteRequest18.createTask(0L, "", "", taskId22);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy24 = deleteRequest18.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest8.setRefreshPolicy(refreshPolicy24);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest4.setRefreshPolicy(refreshPolicy24);
        org.elasticsearch.common.unit.TimeValue timeValue27 = deleteRequest26.timeout();
        org.elasticsearch.index.shard.IndexShard indexShard28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete29 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest26, indexShard28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(task13);
        org.junit.Assert.assertTrue("'" + refreshPolicy14 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy14.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(task23);
        org.junit.Assert.assertTrue("'" + refreshPolicy24 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy24.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNotNull(timeValue27);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        java.lang.String str5 = deleteRequest3.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str7 = deleteRequest6.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.version((long) (short) 100);
        org.elasticsearch.tasks.TaskId taskId10 = deleteRequest6.getParentTask();
        deleteRequest3.setParentTask(taskId10);
        org.elasticsearch.tasks.TaskId taskId12 = deleteRequest3.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest3.parent("delete {[][delete {[][][]}][delete {[][][]}]}");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException15 = deleteRequest14.validate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(taskId10);
        org.junit.Assert.assertNotNull(taskId12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNull(actionRequestValidationException15);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[][][hi!]}][null][null]}", "delete {[][][]}", "");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel6 = deleteRequest5.consistencyLevel();
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest5.setShardId(shardId7);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}][delete {[][][]}][delete {[][][]}]}", deleteRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel6 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel6.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest8);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        java.lang.String[] strArray11 = deleteRequest10.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId19 = null;
        org.elasticsearch.tasks.Task task20 = deleteRequest15.createTask(0L, "", "", taskId19);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest15.setRefreshPolicy("");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel23 = deleteRequest22.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest10.consistencyLevel(writeConsistencyLevel23);
        deleteRequest24.setParentTask("hi!", (long) (short) 100);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest24.routing("hi!");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest24.routing("hi!");
        long long32 = deleteRequest31.primaryTerm();
        org.elasticsearch.tasks.TaskId taskId33 = deleteRequest31.getParentTask();
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(task20);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel23 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel23.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(taskId33);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        java.lang.String[] strArray11 = deleteRequest10.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId19 = null;
        org.elasticsearch.tasks.Task task20 = deleteRequest15.createTask(0L, "", "", taskId19);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest15.setRefreshPolicy("");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel23 = deleteRequest22.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest10.consistencyLevel(writeConsistencyLevel23);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue27 = deleteRequest26.timeout();
        org.elasticsearch.common.transport.TransportAddress transportAddress28 = null;
        deleteRequest26.remoteAddress(transportAddress28);
        org.elasticsearch.common.unit.TimeValue timeValue30 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest26.timeout(timeValue30);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest10.timeout(timeValue30);
        org.elasticsearch.index.shard.ShardId shardId33 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest34 = deleteRequest32.setShardId(shardId33);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest36 = deleteRequest34.timeout("delete {[delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}][delete {[][][]}][delete {[][][]}]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}][delete {[][][]}][delete {[][][]}]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(task20);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel23 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel23.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNotNull(timeValue27);
        org.junit.Assert.assertNotNull(timeValue30);
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertNotNull(deleteRequest32);
        org.junit.Assert.assertNotNull(deleteRequest34);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest3.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.timeout(timeValue4);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.id("delete {[][][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.version((long) 10);
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = deleteRequest7.remoteAddress();
        long long11 = deleteRequest7.primaryTerm();
        org.elasticsearch.index.shard.IndexShard indexShard12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete13 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest7, indexShard12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNull(transportAddress10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.index("delete {[][][hi!]}");
        java.lang.String str3 = deleteRequest2.parent();
        java.lang.String str4 = deleteRequest2.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest2.parent("delete {[][][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest2.parent("delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.routing("delete {[][][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.index("delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}");
        java.lang.String str13 = deleteRequest10.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest10.setRefreshPolicy("delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[delete {[][][hi!]}][null][null]}" + "'", str4, "delete {[delete {[][][hi!]}][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}" + "'", str13, "delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}");
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        deleteRequest1.primaryTerm((long) (byte) 0);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue6 = deleteRequest5.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest1.timeout(timeValue6);
        java.lang.String str8 = deleteRequest1.toString();
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException9 = deleteRequest1.validate();
        java.lang.String str10 = deleteRequest1.getDescription();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = new org.elasticsearch.action.delete.DeleteRequest("");
        long long13 = deleteRequest12.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest12.index("");
        boolean boolean16 = deleteRequest12.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest12.version((long) 1);
        org.elasticsearch.common.unit.TimeValue timeValue19 = deleteRequest12.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest1.timeout(timeValue19);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest1.id("delete {[][delete {[][][hi!]}][delete {[][][]}]}");
        org.elasticsearch.index.shard.IndexShard indexShard23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete24 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest1, indexShard23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "delete {[][null][null]}" + "'", str8, "delete {[][null][null]}");
        org.junit.Assert.assertNotNull(actionRequestValidationException9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "delete {[][null][null]}" + "'", str10, "delete {[][null][null]}");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(timeValue19);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(deleteRequest22);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.writeTo(streamOutput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.common.unit.TimeValue timeValue5 = deleteRequest3.timeout();
        long long6 = deleteRequest3.version();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.index("");
        java.lang.String str9 = deleteRequest3.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest3.parent("hi!");
        org.elasticsearch.common.transport.TransportAddress transportAddress12 = null;
        deleteRequest3.remoteAddress(transportAddress12);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput14 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.writeTo(streamOutput14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(timeValue5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-3L) + "'", long6 == (-3L));
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(deleteRequest11);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[][][]}][delete {[][][hi!]}][delete {[null][null][null]}]}", "hi!", "delete {[hi!][delete {[hi!][null][null]}][delete {[delete {[][][hi!]}][null][null]}]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.routing("delete {[][null][null]}");
        org.elasticsearch.index.shard.IndexShard indexShard6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult7 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest3, indexShard6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.type("delete {[null][null][null]}");
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest1.setShardId(shardId4);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException6 = deleteRequest1.validate();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest1.setRefreshPolicy("delete {[null][null][null]}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [delete {[null][null][null]}].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(actionRequestValidationException6);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = deleteRequest3.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId17 = null;
        org.elasticsearch.tasks.Task task18 = deleteRequest13.createTask(0L, "", "", taskId17);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy19 = deleteRequest13.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest3.setRefreshPolicy(refreshPolicy19);
        java.lang.String str21 = deleteRequest3.getDescription();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest3.id("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest23.setRefreshPolicy("delete {[null][null][null]}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [delete {[null][null][null]}].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(task18);
        org.junit.Assert.assertTrue("'" + refreshPolicy19 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy19.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "delete {[][][]}" + "'", str21, "delete {[][][]}");
        org.junit.Assert.assertNotNull(deleteRequest23);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.type("delete {[][][]}");
        java.lang.String str6 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.id("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.parent("delete {[][][]}");
        java.lang.String str11 = deleteRequest10.id();
        java.lang.String str12 = deleteRequest10.routing();
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "delete {[][][]}" + "'", str6, "delete {[][][]}");
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[][][]}" + "'", str11, "delete {[][][]}");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.id("hi!");
        org.elasticsearch.tasks.TaskId taskId7 = deleteRequest6.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.setRefreshPolicy("");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy10 = deleteRequest6.getRefreshPolicy();
        java.lang.String str11 = deleteRequest6.index();
        java.lang.String str12 = deleteRequest6.parent();
        java.lang.Class<?> wildcardClass13 = deleteRequest6.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(taskId7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertTrue("'" + refreshPolicy10 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE + "'", refreshPolicy10.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        java.lang.String[] strArray11 = deleteRequest10.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("");
        long long14 = deleteRequest13.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str16 = deleteRequest15.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue19 = deleteRequest18.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest15.timeout(timeValue19);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest20.id("delete {[][][hi!]}");
        org.elasticsearch.tasks.TaskId taskId23 = deleteRequest22.getParentTask();
        deleteRequest13.setParentTask(taskId23);
        deleteRequest10.setParentTask(taskId23);
        java.lang.String str26 = deleteRequest10.type();
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest10.setParentTask("", (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 0 length nodeIds are reserved for EMPTY_TASK_ID and are otherwise invalid.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(timeValue19);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertNotNull(taskId23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.type("delete {[][][]}");
        java.lang.String str6 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.id("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.index("delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}");
        boolean boolean11 = deleteRequest10.getShouldPersistResult();
        long long12 = deleteRequest10.version();
        java.lang.String str13 = deleteRequest10.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest10.timeout("");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "delete {[][][]}" + "'", str6, "delete {[][][]}");
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-3L) + "'", long12 == (-3L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "delete {[delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}][delete {[][][]}][delete {[][][]}]}" + "'", str13, "delete {[delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}][delete {[][][]}][delete {[][][]}]}");
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str6 = deleteRequest5.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest5.id("hi!");
        org.elasticsearch.tasks.TaskId taskId9 = deleteRequest8.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest8.setRefreshPolicy("");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy12 = deleteRequest8.getRefreshPolicy();
        java.lang.String str13 = deleteRequest8.index();
        java.lang.String str14 = deleteRequest8.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest8.index("");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[][delete {[][][hi!]}][delete {[][][]}]}", deleteRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(taskId9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertTrue("'" + refreshPolicy12 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE + "'", refreshPolicy12.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(deleteRequest16);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.index("delete {[][][hi!]}");
        java.lang.String str3 = deleteRequest2.parent();
        java.lang.String str4 = deleteRequest2.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest2.parent("delete {[][][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest2.parent("delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}");
        deleteRequest8.primaryTerm((long) ' ');
        org.elasticsearch.common.transport.TransportAddress transportAddress11 = null;
        deleteRequest8.remoteAddress(transportAddress11);
        org.elasticsearch.index.shard.ShardId shardId13 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest8.setShardId(shardId13);
        boolean boolean15 = deleteRequest8.getShouldPersistResult();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[delete {[][][hi!]}][null][null]}" + "'", str4, "delete {[delete {[][][hi!]}][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[][null][null]}][null][null]}", "delete {[delete {[][][]}][delete {[][][hi!]}][delete {[null][null][null]}]}", "delete {[delete {[hi!][null][null]}][null][null]}");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.type("delete {[null][null][null]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = deleteRequest3.remoteAddress();
        org.elasticsearch.index.VersionType versionType5 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.versionType(versionType5);
        org.elasticsearch.index.shard.IndexShard indexShard7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete8 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest6, indexShard7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNull(transportAddress4);
        org.junit.Assert.assertNotNull(deleteRequest6);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][null][null]}", "delete {[hi!][null][null]}", "delete {[hi!][null][null]}");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = deleteRequest3.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.version((long) (short) 10);
        java.lang.String str7 = deleteRequest3.parent();
        org.elasticsearch.action.support.IndicesOptions indicesOptions8 = deleteRequest3.indicesOptions();
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel4 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel4.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(indicesOptions8);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = deleteRequest0.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel2 = deleteRequest0.consistencyLevel();
        deleteRequest0.setParentTask("delete {[delete {[][][hi!]}][null][null]}", (long) 100);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId13 = null;
        org.elasticsearch.tasks.Task task14 = deleteRequest9.createTask(0L, "", "", taskId13);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest9.setRefreshPolicy("");
        org.elasticsearch.index.VersionType versionType17 = deleteRequest9.versionType();
        java.lang.String str18 = deleteRequest9.parent();
        org.elasticsearch.common.transport.TransportAddress transportAddress19 = deleteRequest9.remoteAddress();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy20 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest9.setRefreshPolicy(refreshPolicy20);
        long long22 = deleteRequest9.primaryTerm();
        org.elasticsearch.common.unit.TimeValue timeValue23 = deleteRequest9.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest0.timeout(timeValue23);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest24.parent("delete {[delete {[delete {[][][]}][delete {[][][hi!]}][delete {[null][null][null]}]}][null][null]}");
        long long27 = deleteRequest26.version();
        org.elasticsearch.index.shard.IndexShard indexShard28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete29 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest26, indexShard28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel1 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel1.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel2 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel2.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(task14);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(versionType17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(transportAddress19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(timeValue23);
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-3L) + "'", long27 == (-3L));
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel11 = deleteRequest10.consistencyLevel();
        org.elasticsearch.action.support.IndicesOptions indicesOptions12 = deleteRequest10.indicesOptions();
        java.lang.String str13 = deleteRequest10.toString();
        java.lang.Class<?> wildcardClass14 = deleteRequest10.getClass();
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel11 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel11.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(indicesOptions12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "delete {[][][]}" + "'", str13, "delete {[][][]}");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.getDescription();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest("");
        long long10 = deleteRequest9.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str12 = deleteRequest11.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue15 = deleteRequest14.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest11.timeout(timeValue15);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest16.id("delete {[][][hi!]}");
        org.elasticsearch.tasks.TaskId taskId19 = deleteRequest18.getParentTask();
        deleteRequest9.setParentTask(taskId19);
        org.elasticsearch.tasks.Task task21 = deleteRequest3.createTask((long) ' ', "delete {[][][hi!]}", "delete {[][][]}", taskId19);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel22 = deleteRequest3.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest3.type("delete {[][][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest24.id("");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest24.setRefreshPolicy("delete {[delete {[][][hi!]}][null][null]}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [delete {[delete {[][][hi!]}][null][null]}].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[][][]}" + "'", str4, "delete {[][][]}");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(timeValue15);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(taskId19);
        org.junit.Assert.assertNotNull(task21);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel22 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel22.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNotNull(deleteRequest26);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        org.elasticsearch.index.VersionType versionType11 = deleteRequest3.versionType();
        java.lang.String str12 = deleteRequest3.parent();
        org.elasticsearch.index.shard.ShardId shardId13 = deleteRequest3.shardId();
        deleteRequest3.setParentTask("delete {[][delete {[][][]}][delete {[][][]}]}", (long) (byte) 100);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest3.id("delete {[delete {[][delete {[][][]}][delete {[][][]}]}][null][null]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest3.timeout("delete {[][null][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[][null][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(versionType11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(shardId13);
        org.junit.Assert.assertNotNull(deleteRequest18);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.type("delete {[][][]}");
        java.lang.String str8 = deleteRequest5.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest5.id("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest10.parent("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest16.type("delete {[][][hi!]}");
        org.elasticsearch.index.VersionType versionType19 = deleteRequest18.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest10.versionType(versionType19);
        org.elasticsearch.common.unit.TimeValue timeValue21 = deleteRequest20.timeout();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "hi!", deleteRequest20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "delete {[][][]}" + "'", str8, "delete {[][][]}");
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(versionType19);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(timeValue21);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        java.lang.String str5 = deleteRequest3.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str7 = deleteRequest6.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.version((long) (short) 100);
        org.elasticsearch.tasks.TaskId taskId10 = deleteRequest6.getParentTask();
        deleteRequest3.setParentTask(taskId10);
        org.elasticsearch.tasks.TaskId taskId12 = deleteRequest3.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest3.parent("delete {[][delete {[][][]}][delete {[][][]}]}");
        java.lang.String str15 = deleteRequest14.id();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput16 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest14.writeTo(streamOutput16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(taskId10);
        org.junit.Assert.assertNotNull(taskId12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue2 = deleteRequest1.timeout();
        org.elasticsearch.common.transport.TransportAddress transportAddress3 = null;
        deleteRequest1.remoteAddress(transportAddress3);
        org.elasticsearch.common.unit.TimeValue timeValue5 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest1.timeout(timeValue5);
        java.lang.String str7 = deleteRequest1.type();
        org.elasticsearch.index.shard.ShardId shardId8 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest1.setShardId(shardId8);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy10 = deleteRequest1.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest14.type("delete {[][][hi!]}");
        java.lang.String str17 = deleteRequest14.getDescription();
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy18 = deleteRequest14.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest1.setRefreshPolicy(refreshPolicy18);
        org.elasticsearch.tasks.TaskId taskId20 = deleteRequest19.getParentTask();
        org.junit.Assert.assertNotNull(timeValue2);
        org.junit.Assert.assertNotNull(timeValue5);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertTrue("'" + refreshPolicy10 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy10.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "delete {[][delete {[][][hi!]}][delete {[][][]}]}" + "'", str17, "delete {[][delete {[][][hi!]}][delete {[][][]}]}");
        org.junit.Assert.assertTrue("'" + refreshPolicy18 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy18.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(taskId20);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.type("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.id("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest3.parent("hi!");
        java.lang.String str10 = deleteRequest9.parent();
        org.elasticsearch.common.io.stream.StreamInput streamInput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest9.readFrom(streamInput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.common.unit.TimeValue timeValue5 = deleteRequest3.timeout();
        long long6 = deleteRequest3.version();
        java.lang.String str7 = deleteRequest3.routing();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str9 = deleteRequest8.parent();
        deleteRequest8.primaryTerm((long) (short) 100);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest8.setRefreshPolicy("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest13.type("delete {[null][null][null]}");
        java.lang.String str16 = deleteRequest13.parent();
        java.lang.String str17 = deleteRequest13.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId28 = null;
        org.elasticsearch.tasks.Task task29 = deleteRequest24.createTask(0L, "", "", taskId28);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest24.setRefreshPolicy("");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel32 = deleteRequest31.consistencyLevel();
        org.elasticsearch.action.support.IndicesOptions indicesOptions33 = deleteRequest31.indicesOptions();
        org.elasticsearch.tasks.TaskId taskId34 = null;
        deleteRequest31.setParentTask(taskId34);
        deleteRequest31.primaryTerm((long) (-1));
        org.elasticsearch.action.delete.DeleteRequest deleteRequest44 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest46 = deleteRequest44.type("delete {[][][]}");
        java.lang.String str47 = deleteRequest44.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest49 = deleteRequest44.id("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest53 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str54 = deleteRequest53.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest56 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue57 = deleteRequest56.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest58 = deleteRequest53.timeout(timeValue57);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest60 = deleteRequest58.id("delete {[][][hi!]}");
        org.elasticsearch.tasks.TaskId taskId61 = deleteRequest60.getParentTask();
        org.elasticsearch.tasks.Task task62 = deleteRequest49.createTask((long) ' ', "delete {[delete {[][][hi!]}][null][null]}", "delete {[][null][null]}", taskId61);
        org.elasticsearch.tasks.Task task63 = deleteRequest31.createTask((long) (short) 0, "hi!", "delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}", taskId61);
        org.elasticsearch.tasks.Task task64 = deleteRequest13.createTask((long) (byte) 0, "delete {[delete {[][delete {[][][]}][delete {[][][]}]}][null][null]}", "delete {[delete {[][delete {[][][]}][delete {[][][]}]}][null][null]}", taskId61);
        deleteRequest3.setParentTask(taskId61);
        org.elasticsearch.index.shard.IndexShard indexShard66 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete67 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest3, indexShard66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(timeValue5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-3L) + "'", long6 == (-3L));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(task29);
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel32 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel32.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(indicesOptions33);
        org.junit.Assert.assertNotNull(deleteRequest46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "delete {[][][]}" + "'", str47, "delete {[][][]}");
        org.junit.Assert.assertNotNull(deleteRequest49);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(timeValue57);
        org.junit.Assert.assertNotNull(deleteRequest58);
        org.junit.Assert.assertNotNull(deleteRequest60);
        org.junit.Assert.assertNotNull(taskId61);
        org.junit.Assert.assertNotNull(task62);
        org.junit.Assert.assertNotNull(task63);
        org.junit.Assert.assertNotNull(task64);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        java.lang.String str11 = deleteRequest10.toString();
        java.lang.String[] strArray12 = deleteRequest10.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest10.index("");
        org.elasticsearch.common.unit.TimeValue timeValue15 = deleteRequest14.timeout();
        deleteRequest14.setParentTask("hi!", (long) 100);
        java.lang.String[] strArray19 = deleteRequest14.indices();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest14.timeout("delete {[][delete {[hi!][delete {[hi!][null][null]}][delete {[delete {[][][hi!]}][null][null]}]}][delete {[][][]}]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[][delete {[hi!][delete {[hi!][null][null]}][delete {[delete {[][][hi!]}][null][null]}]}][delete {[][][]}]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[][][]}" + "'", str11, "delete {[][][]}");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(timeValue15);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.id("hi!");
        org.elasticsearch.tasks.TaskId taskId7 = deleteRequest6.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.setRefreshPolicy("");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy10 = deleteRequest6.getRefreshPolicy();
        java.lang.String str11 = deleteRequest6.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(taskId7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertTrue("'" + refreshPolicy10 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE + "'", refreshPolicy10.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[][][hi!]}" + "'", str11, "delete {[][][hi!]}");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.version((long) (short) 100);
        deleteRequest0.primaryTerm(100L);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest0.index("delete {[delete {[][][]}][delete {[][][hi!]}][delete {[null][null][null]}]}");
        java.lang.Class<?> wildcardClass8 = deleteRequest0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        java.lang.String str11 = deleteRequest10.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("");
        long long14 = deleteRequest13.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str16 = deleteRequest15.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue19 = deleteRequest18.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest15.timeout(timeValue19);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest20.id("delete {[][][hi!]}");
        org.elasticsearch.tasks.TaskId taskId23 = deleteRequest22.getParentTask();
        deleteRequest13.setParentTask(taskId23);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel25 = deleteRequest13.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest10.consistencyLevel(writeConsistencyLevel25);
        org.elasticsearch.common.unit.TimeValue timeValue27 = deleteRequest10.timeout();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest10.setRefreshPolicy("delete {[delete {[][null][null]}][][]}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [delete {[delete {[][null][null]}][][]}].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[][][]}" + "'", str11, "delete {[][][]}");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(timeValue19);
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertNotNull(taskId23);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel25 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel25.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNotNull(timeValue27);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest3.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.timeout(timeValue4);
        org.elasticsearch.common.transport.TransportAddress transportAddress6 = deleteRequest0.remoteAddress();
        long long7 = deleteRequest0.version();
        java.lang.String str8 = deleteRequest0.routing();
        org.elasticsearch.tasks.TaskId taskId9 = deleteRequest0.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest0.routing("delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}");
        org.elasticsearch.common.io.stream.StreamOutput streamOutput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest11.writeTo(streamOutput12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(transportAddress6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-3L) + "'", long7 == (-3L));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(taskId9);
        org.junit.Assert.assertNotNull(deleteRequest11);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "", "delete {[][][]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = deleteRequest3.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId12 = null;
        org.elasticsearch.tasks.Task task13 = deleteRequest8.createTask(0L, "", "", taskId12);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy14 = deleteRequest8.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest3.setRefreshPolicy(refreshPolicy14);
        java.lang.String str16 = deleteRequest3.index();
        org.elasticsearch.index.shard.ShardId shardId17 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest3.setShardId(shardId17);
        deleteRequest3.primaryTerm(0L);
        org.elasticsearch.common.io.stream.StreamOutput streamOutput21 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest3.writeTo(streamOutput21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(transportAddress4);
        org.junit.Assert.assertNotNull(task13);
        org.junit.Assert.assertTrue("'" + refreshPolicy14 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy14.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(deleteRequest18);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.id("hi!");
        org.elasticsearch.tasks.TaskId taskId7 = deleteRequest6.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.setRefreshPolicy("");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy10 = deleteRequest6.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId18 = null;
        org.elasticsearch.tasks.Task task19 = deleteRequest14.createTask(0L, "", "", taskId18);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest14.setRefreshPolicy("");
        org.elasticsearch.index.VersionType versionType22 = deleteRequest14.versionType();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel23 = deleteRequest14.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest6.consistencyLevel(writeConsistencyLevel23);
        org.elasticsearch.index.shard.ShardId shardId25 = deleteRequest24.shardId();
        org.elasticsearch.index.VersionType versionType26 = deleteRequest24.versionType();
        org.elasticsearch.index.shard.IndexShard indexShard27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult28 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest24, indexShard27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(taskId7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertTrue("'" + refreshPolicy10 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE + "'", refreshPolicy10.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE));
        org.junit.Assert.assertNotNull(task19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(versionType22);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel23 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel23.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNull(shardId25);
        org.junit.Assert.assertNotNull(versionType26);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.parent();
        deleteRequest0.primaryTerm((long) (short) 100);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.setRefreshPolicy("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.type("delete {[null][null][null]}");
        java.lang.String str8 = deleteRequest5.parent();
        org.elasticsearch.index.VersionType versionType9 = deleteRequest5.versionType();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel10 = deleteRequest5.consistencyLevel();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest5.timeout("delete {[][][]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[][][]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(versionType9);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel10 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel10.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel3 = deleteRequest2.consistencyLevel();
        java.lang.String str4 = deleteRequest2.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest2.index("hi!");
        long long7 = deleteRequest2.version();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[delete {[][null][null]}][null][null]}", deleteRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel3 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel3.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-3L) + "'", long7 == (-3L));
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "", "delete {[][][]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = deleteRequest3.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId12 = null;
        org.elasticsearch.tasks.Task task13 = deleteRequest8.createTask(0L, "", "", taskId12);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy14 = deleteRequest8.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest3.setRefreshPolicy(refreshPolicy14);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest3.id("delete {[hi!][null][null]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest3.id("delete {[][][]}");
        java.lang.Class<?> wildcardClass20 = deleteRequest3.getClass();
        org.junit.Assert.assertNull(transportAddress4);
        org.junit.Assert.assertNotNull(task13);
        org.junit.Assert.assertTrue("'" + refreshPolicy14 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy14.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(deleteRequest19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.type("delete {[null][null][null]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = deleteRequest3.remoteAddress();
        org.elasticsearch.index.shard.ShardId shardId5 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.setShardId(shardId5);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.version((long) '4');
        org.elasticsearch.common.io.stream.StreamInput streamInput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest6.readFrom(streamInput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNull(transportAddress4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest8);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "delete {[delete {[][delete {[][][]}][delete {[][][]}]}][null][null]}", "delete {[hi!][null][null]}");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = deleteRequest3.consistencyLevel();
        java.lang.String str5 = deleteRequest3.index();
        org.elasticsearch.action.support.IndicesOptions indicesOptions6 = deleteRequest3.indicesOptions();
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel4 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel4.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(indicesOptions6);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.type("delete {[][][hi!]}");
        org.elasticsearch.common.unit.TimeValue timeValue6 = deleteRequest5.timeout();
        java.lang.String str7 = deleteRequest5.type();
        java.lang.Class<?> wildcardClass8 = deleteRequest5.getClass();
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "delete {[][][hi!]}" + "'", str7, "delete {[][][hi!]}");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.type("delete {[][][hi!]}");
        java.lang.String str8 = deleteRequest7.id();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[][delete {[null][null][null]}][null]}", deleteRequest7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "delete {[][][]}" + "'", str8, "delete {[][][]}");
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][delete {[][][]}][delete {[][][]}]}", "", "delete {[][][]}");
        long long4 = deleteRequest3.version();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.setRefreshPolicy("delete {[delete {[][][hi!]}][delete {[][][hi!]}][null]}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [delete {[delete {[][][hi!]}][delete {[][][hi!]}][null]}].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3L) + "'", long4 == (-3L));
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.type("delete {[][][hi!]}");
        boolean boolean6 = deleteRequest5.getShouldPersistResult();
        org.elasticsearch.index.shard.ShardId shardId7 = deleteRequest5.shardId();
        java.lang.String str8 = deleteRequest5.toString();
        boolean boolean9 = deleteRequest5.getShouldPersistResult();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest5.writeTo(streamOutput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(shardId7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "delete {[][delete {[][][hi!]}][delete {[][][]}]}" + "'", str8, "delete {[][delete {[][][hi!]}][delete {[][][]}]}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        org.elasticsearch.index.VersionType versionType11 = deleteRequest3.versionType();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel12 = deleteRequest3.consistencyLevel();
        java.lang.String str13 = deleteRequest3.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue16 = deleteRequest15.timeout();
        org.elasticsearch.common.transport.TransportAddress transportAddress17 = null;
        deleteRequest15.remoteAddress(transportAddress17);
        java.lang.String str19 = deleteRequest15.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest15.parent("delete {[hi!][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue22 = deleteRequest15.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest3.timeout(timeValue22);
        java.lang.String[] strArray24 = deleteRequest23.indices();
        java.lang.Class<?> wildcardClass25 = strArray24.getClass();
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(versionType11);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel12 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel12.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "delete {[][][]}" + "'", str13, "delete {[][][]}");
        org.junit.Assert.assertNotNull(timeValue16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "delete {[null][null][null]}" + "'", str19, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(timeValue22);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest3.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.timeout(timeValue4);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.id("delete {[][][hi!]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.timeout("delete {[][][hi!]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[][][hi!]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.index.shard.ShardId shardId5 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.setShardId(shardId5);
        org.elasticsearch.index.shard.ShardId shardId7 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.setShardId(shardId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str15 = deleteRequest14.id();
        org.elasticsearch.common.unit.TimeValue timeValue16 = deleteRequest14.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest3.timeout(timeValue16);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str22 = deleteRequest21.id();
        org.elasticsearch.index.shard.ShardId shardId23 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest21.setShardId(shardId23);
        org.elasticsearch.index.shard.ShardId shardId25 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest21.setShardId(shardId25);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest27.parent("delete {[][][]}");
        org.elasticsearch.index.VersionType versionType30 = deleteRequest29.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest31 = deleteRequest26.versionType(versionType30);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest33 = deleteRequest31.parent("delete {[hi!][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue34 = deleteRequest31.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = deleteRequest17.timeout(timeValue34);
        java.lang.Class<?> wildcardClass36 = timeValue34.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(timeValue16);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertNotNull(versionType30);
        org.junit.Assert.assertNotNull(deleteRequest31);
        org.junit.Assert.assertNotNull(deleteRequest33);
        org.junit.Assert.assertNotNull(timeValue34);
        org.junit.Assert.assertNotNull(deleteRequest35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.id("hi!");
        org.elasticsearch.tasks.TaskId taskId7 = deleteRequest6.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.setRefreshPolicy("");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy10 = deleteRequest6.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId18 = null;
        org.elasticsearch.tasks.Task task19 = deleteRequest14.createTask(0L, "", "", taskId18);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest14.setRefreshPolicy("");
        org.elasticsearch.index.VersionType versionType22 = deleteRequest14.versionType();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel23 = deleteRequest14.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest6.consistencyLevel(writeConsistencyLevel23);
        org.elasticsearch.index.shard.ShardId shardId25 = deleteRequest24.shardId();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest24.version((long) (short) 1);
        java.lang.String str28 = deleteRequest24.id();
        org.elasticsearch.common.io.stream.StreamInput streamInput29 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest24.readFrom(streamInput29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(taskId7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertTrue("'" + refreshPolicy10 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE + "'", refreshPolicy10.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE));
        org.junit.Assert.assertNotNull(task19);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertNotNull(versionType22);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel23 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel23.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNull(shardId25);
        org.junit.Assert.assertNotNull(deleteRequest27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.common.unit.TimeValue timeValue5 = deleteRequest3.timeout();
        long long6 = deleteRequest3.version();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.index("");
        java.lang.String str9 = deleteRequest3.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest3.parent("hi!");
        org.elasticsearch.index.shard.IndexShard indexShard12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.support.replication.TransportWriteAction.WriteResult<org.elasticsearch.action.delete.DeleteResponse> deleteResponseWriteResult13 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnPrimary(deleteRequest3, indexShard12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(timeValue5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-3L) + "'", long6 == (-3L));
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(deleteRequest11);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.parent();
        deleteRequest0.primaryTerm((long) (short) 100);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.setRefreshPolicy("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.type("delete {[null][null][null]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.setRefreshPolicy("delete {[null][null][delete {[delete {[][][hi!]}][null][null]}]}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [delete {[null][null][delete {[delete {[][][hi!]}][null][null]}]}].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][][hi!]}", "delete {[null][null][null]}", "");
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException4 = deleteRequest3.validate();
        org.junit.Assert.assertNull(actionRequestValidationException4);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.common.transport.TransportAddress transportAddress5 = deleteRequest3.remoteAddress();
        org.elasticsearch.index.shard.ShardId shardId6 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.setShardId(shardId6);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest11.type("delete {[][][hi!]}");
        org.elasticsearch.index.VersionType versionType14 = deleteRequest13.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest7.versionType(versionType14);
        java.lang.Class<?> wildcardClass16 = versionType14.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(transportAddress5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(versionType14);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest1.type("delete {[null][null][null]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress4 = deleteRequest3.remoteAddress();
        org.elasticsearch.index.shard.ShardId shardId5 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.setShardId(shardId5);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest6.version((long) '4');
        org.elasticsearch.common.transport.TransportAddress transportAddress9 = deleteRequest8.remoteAddress();
        org.elasticsearch.index.VersionType versionType10 = deleteRequest8.versionType();
        java.lang.String[] strArray11 = deleteRequest8.indices();
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNull(transportAddress4);
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNull(transportAddress9);
        org.junit.Assert.assertNotNull(versionType10);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.type("delete {[][][]}");
        java.lang.String str6 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.id("delete {[][][]}");
        long long9 = deleteRequest3.primaryTerm();
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "delete {[][][]}" + "'", str6, "delete {[][][]}");
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.getDescription();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest("");
        long long10 = deleteRequest9.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str12 = deleteRequest11.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue15 = deleteRequest14.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest11.timeout(timeValue15);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest16.id("delete {[][][hi!]}");
        org.elasticsearch.tasks.TaskId taskId19 = deleteRequest18.getParentTask();
        deleteRequest9.setParentTask(taskId19);
        org.elasticsearch.tasks.Task task21 = deleteRequest3.createTask((long) ' ', "delete {[][][hi!]}", "delete {[][][]}", taskId19);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel22 = deleteRequest3.consistencyLevel();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest3.timeout("delete {[delete {[][null][null]}][null][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[delete {[][null][null]}][null][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[][][]}" + "'", str4, "delete {[][][]}");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(timeValue15);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(taskId19);
        org.junit.Assert.assertNotNull(task21);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel22 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel22.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy9 = deleteRequest3.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId17 = null;
        org.elasticsearch.tasks.Task task18 = deleteRequest13.createTask(0L, "", "", taskId17);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy19 = deleteRequest13.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest20 = deleteRequest3.setRefreshPolicy(refreshPolicy19);
        java.lang.String str21 = deleteRequest3.getDescription();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest3.id("hi!");
        deleteRequest23.primaryTerm((long) (short) 100);
        org.elasticsearch.common.transport.TransportAddress transportAddress26 = null;
        deleteRequest23.remoteAddress(transportAddress26);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest23.routing("");
        java.lang.String str30 = deleteRequest23.routing();
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertTrue("'" + refreshPolicy9 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy9.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(task18);
        org.junit.Assert.assertTrue("'" + refreshPolicy19 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy19.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "delete {[][][]}" + "'", str21, "delete {[][][]}");
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        deleteRequest1.primaryTerm((long) (byte) 0);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue6 = deleteRequest5.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest1.timeout(timeValue6);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str9 = deleteRequest8.parent();
        org.elasticsearch.index.VersionType versionType10 = deleteRequest8.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest1.versionType(versionType10);
        long long12 = deleteRequest11.version();
        java.lang.String[] strArray13 = deleteRequest11.indices();
        java.lang.String str14 = deleteRequest11.index();
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(versionType10);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-3L) + "'", long12 == (-3L));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        deleteRequest1.setParentTask("hi!", (long) (short) 1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.type("delete {[][][]}");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy11 = deleteRequest8.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest1.setRefreshPolicy(refreshPolicy11);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest16.type("delete {[][][]}");
        java.lang.String str19 = deleteRequest16.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest16.id("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel23 = deleteRequest22.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel24 = deleteRequest22.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest16.consistencyLevel(writeConsistencyLevel24);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest12.consistencyLevel(writeConsistencyLevel24);
        java.lang.String str27 = deleteRequest26.id();
        java.lang.String str28 = deleteRequest26.getDescription();
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertTrue("'" + refreshPolicy11 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy11.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "delete {[][][]}" + "'", str19, "delete {[][][]}");
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel23 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel23.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel24 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel24.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "delete {[][null][null]}" + "'", str28, "delete {[][null][null]}");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.version((long) (short) 100);
        deleteRequest0.primaryTerm(100L);
        boolean boolean6 = deleteRequest0.getShouldPersistResult();
        boolean boolean7 = deleteRequest0.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest0.id("delete {[hi!][delete {[hi!][null][null]}][delete {[delete {[][][hi!]}][null][null]}]}");
        org.elasticsearch.index.shard.IndexShard indexShard10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete11 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest9, indexShard10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(deleteRequest9);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.type("delete {[][][hi!]}");
        org.elasticsearch.index.VersionType versionType6 = deleteRequest5.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest("hi!", "", "delete {[][][]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress11 = deleteRequest10.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId19 = null;
        org.elasticsearch.tasks.Task task20 = deleteRequest15.createTask(0L, "", "", taskId19);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy21 = deleteRequest15.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest22 = deleteRequest10.setRefreshPolicy(refreshPolicy21);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest23 = deleteRequest5.setRefreshPolicy(refreshPolicy21);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel25 = deleteRequest24.consistencyLevel();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel26 = deleteRequest24.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest27 = deleteRequest5.consistencyLevel(writeConsistencyLevel26);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest27.setRefreshPolicy("delete {[delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}][delete {[][][]}][delete {[][][]}]}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [delete {[delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}][delete {[][][]}][delete {[][][]}]}].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(versionType6);
        org.junit.Assert.assertNull(transportAddress11);
        org.junit.Assert.assertNotNull(task20);
        org.junit.Assert.assertTrue("'" + refreshPolicy21 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy21.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest22);
        org.junit.Assert.assertNotNull(deleteRequest23);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel25 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel25.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel26 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel26.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest27);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.toString();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.parent("hi!");
        org.elasticsearch.index.shard.ShardId shardId4 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.setShardId(shardId4);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest3.routing("delete {[hi!][delete {[hi!][null][null]}][delete {[delete {[][][hi!]}][null][null]}]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.type("delete {[delete {[][null][null]}][][]}");
        org.elasticsearch.common.transport.TransportAddress transportAddress10 = deleteRequest7.remoteAddress();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "delete {[null][null][null]}" + "'", str1, "delete {[null][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNull(transportAddress10);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[delete {[][][hi!]}][null][null]}", "delete {[][][]}", "");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel4 = deleteRequest3.consistencyLevel();
        org.elasticsearch.index.shard.ShardId shardId5 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.setShardId(shardId5);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.parent("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest9.type("delete {[hi!][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue12 = deleteRequest9.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest6.timeout(timeValue12);
        java.lang.String str14 = deleteRequest6.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest6.parent("delete {[hi!][delete {[hi!][null][null]}][delete {[delete {[][][hi!]}][null][null]}]}");
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel4 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel4.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertNotNull(timeValue12);
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "delete {[delete {[][][hi!]}][null][null]}" + "'", str14, "delete {[delete {[][][hi!]}][null][null]}");
        org.junit.Assert.assertNotNull(deleteRequest16);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][][hi!]}", "delete {[null][null][null]}", "");
        boolean boolean4 = deleteRequest3.getShouldPersistResult();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest8.type("delete {[][][]}");
        java.lang.String str11 = deleteRequest8.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest13 = deleteRequest8.id("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest8.index("delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest19.type("delete {[][][]}");
        java.lang.String str22 = deleteRequest19.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest19.id("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest24.parent("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest24.type("delete {[][][]}");
        org.elasticsearch.common.unit.TimeValue timeValue29 = deleteRequest24.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = deleteRequest15.timeout(timeValue29);
        org.elasticsearch.common.unit.TimeValue timeValue31 = deleteRequest15.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = deleteRequest3.timeout(timeValue31);
        org.elasticsearch.common.io.stream.StreamInput streamInput33 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest32.readFrom(streamInput33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "delete {[][][]}" + "'", str11, "delete {[][][]}");
        org.junit.Assert.assertNotNull(deleteRequest13);
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "delete {[][][]}" + "'", str22, "delete {[][][]}");
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertNotNull(timeValue29);
        org.junit.Assert.assertNotNull(deleteRequest30);
        org.junit.Assert.assertNotNull(timeValue31);
        org.junit.Assert.assertNotNull(deleteRequest32);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        deleteRequest10.primaryTerm(1L);
        deleteRequest10.primaryTerm((long) 0);
        org.elasticsearch.index.shard.ShardId shardId15 = deleteRequest10.shardId();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel16 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest10.consistencyLevel(writeConsistencyLevel16);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest19 = deleteRequest17.routing("delete {[delete {[delete {[][][hi!]}][delete {[][][hi!]}][]}][delete {[][][]}][delete {[][][]}]}");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest21 = deleteRequest17.timeout("delete {[delete {[][null][null]}][null][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[delete {[][null][null]}][null][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNull(shardId15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertNotNull(deleteRequest19);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.version((long) (short) 100);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest7.type("delete {[][][]}");
        java.lang.String str10 = deleteRequest7.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest7.id("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest12.parent("delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId22 = null;
        org.elasticsearch.tasks.Task task23 = deleteRequest18.createTask(0L, "", "", taskId22);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest25 = deleteRequest18.setRefreshPolicy("");
        java.lang.String[] strArray26 = deleteRequest25.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest30 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId34 = null;
        org.elasticsearch.tasks.Task task35 = deleteRequest30.createTask(0L, "", "", taskId34);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest37 = deleteRequest30.setRefreshPolicy("");
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel38 = deleteRequest37.consistencyLevel();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest39 = deleteRequest25.consistencyLevel(writeConsistencyLevel38);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest41 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue42 = deleteRequest41.timeout();
        org.elasticsearch.common.transport.TransportAddress transportAddress43 = null;
        deleteRequest41.remoteAddress(transportAddress43);
        org.elasticsearch.common.unit.TimeValue timeValue45 = org.elasticsearch.action.support.replication.ReplicationRequest.DEFAULT_TIMEOUT;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest46 = deleteRequest41.timeout(timeValue45);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest47 = deleteRequest25.timeout(timeValue45);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest48 = deleteRequest14.timeout(timeValue45);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest49 = deleteRequest3.timeout(timeValue45);
        org.elasticsearch.action.support.IndicesOptions indicesOptions50 = deleteRequest49.indicesOptions();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest52 = deleteRequest49.setRefreshPolicy("delete {[delete {[][][hi!]}][null][null]}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown value for refresh: [delete {[delete {[][][hi!]}][null][null]}].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "delete {[][][]}" + "'", str10, "delete {[][][]}");
        org.junit.Assert.assertNotNull(deleteRequest12);
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(task23);
        org.junit.Assert.assertNotNull(deleteRequest25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(task35);
        org.junit.Assert.assertNotNull(deleteRequest37);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel38 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel38.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNotNull(deleteRequest39);
        org.junit.Assert.assertNotNull(timeValue42);
        org.junit.Assert.assertNotNull(timeValue45);
        org.junit.Assert.assertNotNull(deleteRequest46);
        org.junit.Assert.assertNotNull(deleteRequest47);
        org.junit.Assert.assertNotNull(deleteRequest48);
        org.junit.Assert.assertNotNull(deleteRequest49);
        org.junit.Assert.assertNotNull(indicesOptions50);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.parent();
        org.elasticsearch.common.transport.TransportAddress transportAddress2 = deleteRequest0.remoteAddress();
        org.elasticsearch.index.shard.ShardId shardId3 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest4 = deleteRequest0.setShardId(shardId3);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId12 = null;
        org.elasticsearch.tasks.Task task13 = deleteRequest8.createTask(0L, "", "", taskId12);
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy14 = deleteRequest8.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest15 = deleteRequest0.setRefreshPolicy(refreshPolicy14);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = new org.elasticsearch.action.delete.DeleteRequest("");
        deleteRequest17.setParentTask("hi!", (long) (short) 1);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest26 = deleteRequest24.type("delete {[][][]}");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy27 = deleteRequest24.getRefreshPolicy();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest28 = deleteRequest17.setRefreshPolicy(refreshPolicy27);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest29 = deleteRequest0.setRefreshPolicy(refreshPolicy27);
        java.lang.String str30 = deleteRequest0.routing();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(transportAddress2);
        org.junit.Assert.assertNotNull(deleteRequest4);
        org.junit.Assert.assertNotNull(task13);
        org.junit.Assert.assertTrue("'" + refreshPolicy14 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy14.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest15);
        org.junit.Assert.assertNotNull(deleteRequest26);
        org.junit.Assert.assertTrue("'" + refreshPolicy27 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE + "'", refreshPolicy27.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.NONE));
        org.junit.Assert.assertNotNull(deleteRequest28);
        org.junit.Assert.assertNotNull(deleteRequest29);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel1 = deleteRequest0.consistencyLevel();
        java.lang.String str2 = deleteRequest0.parent();
        boolean boolean3 = deleteRequest0.getShouldPersistResult();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.timeout("delete {[null][null][null]}");
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchParseException; message: Failed to parse setting [DeleteRequest.timeout] with value [delete {[null][null][null]}] as a time value: unit is missing or unrecognized");
        } catch (org.elasticsearch.ElasticsearchParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel1 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel1.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("", "hi!", "delete {[][][]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.type("delete {[][][hi!]}");
        org.elasticsearch.index.VersionType versionType8 = deleteRequest7.versionType();
        java.lang.String str9 = deleteRequest7.index();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[][delete {[hi!][delete {[hi!][null][null]}][delete {[delete {[][][hi!]}][null][null]}]}][delete {[][][]}]}", deleteRequest7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(versionType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId7 = null;
        org.elasticsearch.tasks.Task task8 = deleteRequest3.createTask(0L, "", "", taskId7);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest3.setRefreshPolicy("");
        deleteRequest10.primaryTerm(1L);
        deleteRequest10.primaryTerm((long) 0);
        org.elasticsearch.index.shard.ShardId shardId15 = deleteRequest10.shardId();
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel16 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest10.consistencyLevel(writeConsistencyLevel16);
        org.elasticsearch.index.shard.IndexShard indexShard18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete19 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest17, indexShard18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(task8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNull(shardId15);
        org.junit.Assert.assertNotNull(deleteRequest17);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.type("delete {[null][null][null]}");
        java.lang.String str6 = deleteRequest3.id();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[delete {[delete {[][][]}][delete {[][][hi!]}][delete {[null][null][null]}]}][null][null]}", deleteRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.getDescription();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = new org.elasticsearch.action.delete.DeleteRequest("");
        long long10 = deleteRequest9.primaryTerm();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str12 = deleteRequest11.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue15 = deleteRequest14.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest16 = deleteRequest11.timeout(timeValue15);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest18 = deleteRequest16.id("delete {[][][hi!]}");
        org.elasticsearch.tasks.TaskId taskId19 = deleteRequest18.getParentTask();
        deleteRequest9.setParentTask(taskId19);
        org.elasticsearch.tasks.Task task21 = deleteRequest3.createTask((long) ' ', "delete {[][][hi!]}", "delete {[][][]}", taskId19);
        org.elasticsearch.common.transport.TransportAddress transportAddress22 = deleteRequest3.remoteAddress();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest24 = deleteRequest3.id("delete {[null][null][null]}");
        org.elasticsearch.index.VersionType versionType25 = deleteRequest3.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest32 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str33 = deleteRequest32.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest35 = deleteRequest32.id("hi!");
        org.elasticsearch.tasks.TaskId taskId36 = deleteRequest35.getParentTask();
        org.elasticsearch.tasks.Task task37 = deleteRequest3.createTask((long) (short) -1, "delete {[hi!][delete {[hi!][null][null]}][delete {[delete {[][][hi!]}][null][null]}]}", "", taskId36);
        long long38 = deleteRequest3.primaryTerm();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "delete {[][][]}" + "'", str4, "delete {[][][]}");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(timeValue15);
        org.junit.Assert.assertNotNull(deleteRequest16);
        org.junit.Assert.assertNotNull(deleteRequest18);
        org.junit.Assert.assertNotNull(taskId19);
        org.junit.Assert.assertNotNull(task21);
        org.junit.Assert.assertNull(transportAddress22);
        org.junit.Assert.assertNotNull(deleteRequest24);
        org.junit.Assert.assertNotNull(versionType25);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(deleteRequest35);
        org.junit.Assert.assertNotNull(taskId36);
        org.junit.Assert.assertNotNull(task37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.index("delete {[][][hi!]}");
        java.lang.String str3 = deleteRequest2.parent();
        java.lang.String str4 = deleteRequest2.type();
        java.lang.String str5 = deleteRequest2.routing();
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.elasticsearch.cluster.metadata.MetaData metaData0 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest3.type("delete {[null][null][null]}");
        java.lang.String str6 = deleteRequest3.parent();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = deleteRequest3.index("");
        org.elasticsearch.common.transport.TransportAddress transportAddress9 = null;
        deleteRequest8.remoteAddress(transportAddress9);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest12 = deleteRequest8.setRefreshPolicy("");
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.delete.TransportDeleteAction.resolveAndValidateRouting(metaData0, "delete {[delete {[][null][null]}][null][null]}", deleteRequest12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(deleteRequest8);
        org.junit.Assert.assertNotNull(deleteRequest12);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.id("hi!");
        org.elasticsearch.tasks.TaskId taskId7 = deleteRequest6.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest9 = deleteRequest6.setRefreshPolicy("");
        org.elasticsearch.action.support.WriteRequest.RefreshPolicy refreshPolicy10 = deleteRequest6.getRefreshPolicy();
        long long11 = deleteRequest6.version();
        long long12 = deleteRequest6.version();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest14 = deleteRequest6.type("");
        java.lang.String[] strArray15 = deleteRequest14.indices();
        org.elasticsearch.index.shard.IndexShard indexShard16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete17 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest14, indexShard16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNotNull(taskId7);
        org.junit.Assert.assertNotNull(deleteRequest9);
        org.junit.Assert.assertTrue("'" + refreshPolicy10 + "' != '" + org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE + "'", refreshPolicy10.equals(org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-3L) + "'", long11 == (-3L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-3L) + "'", long12 == (-3L));
        org.junit.Assert.assertNotNull(deleteRequest14);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = deleteRequest0.version((long) (short) 100);
        org.elasticsearch.tasks.TaskId taskId4 = deleteRequest0.getParentTask();
        java.lang.Class<?> wildcardClass5 = taskId4.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(deleteRequest3);
        org.junit.Assert.assertNotNull(taskId4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str1 = deleteRequest0.index();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue4 = deleteRequest3.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = deleteRequest0.timeout(timeValue4);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest5.id("delete {[][][hi!]}");
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest7.getParentTask();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = deleteRequest7.id("");
        org.elasticsearch.action.support.IndicesOptions indicesOptions11 = deleteRequest7.indicesOptions();
        org.elasticsearch.index.shard.IndexShard indexShard12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.engine.Engine.Delete delete13 = org.elasticsearch.action.delete.TransportDeleteAction.executeDeleteRequestOnReplica(deleteRequest7, indexShard12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(timeValue4);
        org.junit.Assert.assertNotNull(deleteRequest5);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNotNull(taskId8);
        org.junit.Assert.assertNotNull(deleteRequest10);
        org.junit.Assert.assertNotNull(indicesOptions11);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest1 = new org.elasticsearch.action.delete.DeleteRequest("");
        deleteRequest1.primaryTerm((long) (byte) 0);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest("delete {[null][null][null]}");
        org.elasticsearch.common.unit.TimeValue timeValue6 = deleteRequest5.timeout();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest7 = deleteRequest1.timeout(timeValue6);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest8 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str9 = deleteRequest8.parent();
        org.elasticsearch.index.VersionType versionType10 = deleteRequest8.versionType();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest11 = deleteRequest1.versionType(versionType10);
        org.elasticsearch.action.WriteConsistencyLevel writeConsistencyLevel12 = deleteRequest1.consistencyLevel();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest1.writeTo(streamOutput13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertNotNull(deleteRequest7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(versionType10);
        org.junit.Assert.assertNotNull(deleteRequest11);
        org.junit.Assert.assertTrue("'" + writeConsistencyLevel12 + "' != '" + org.elasticsearch.action.WriteConsistencyLevel.DEFAULT + "'", writeConsistencyLevel12.equals(org.elasticsearch.action.WriteConsistencyLevel.DEFAULT));
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("delete {[][null][null]}", "", "delete {[][][hi!]}");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest10 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        org.elasticsearch.tasks.TaskId taskId14 = null;
        org.elasticsearch.tasks.Task task15 = deleteRequest10.createTask(0L, "", "", taskId14);
        org.elasticsearch.action.delete.DeleteRequest deleteRequest17 = deleteRequest10.setRefreshPolicy("");
        java.lang.String str18 = deleteRequest17.toString();
        java.lang.String[] strArray19 = deleteRequest17.indices();
        java.lang.String[] strArray20 = deleteRequest17.indices();
        org.elasticsearch.tasks.TaskId taskId21 = deleteRequest17.getParentTask();
        org.elasticsearch.tasks.Task task22 = deleteRequest3.createTask((long) 100, "delete {[delete {[hi!][null][null]}][null][null]}", "delete {[][delete {[hi!][delete {[hi!][null][null]}][delete {[delete {[][][hi!]}][null][null]}]}][delete {[][][]}]}", taskId21);
        java.lang.Class<?> wildcardClass23 = taskId21.getClass();
        org.junit.Assert.assertNotNull(task15);
        org.junit.Assert.assertNotNull(deleteRequest17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "delete {[][][]}" + "'", str18, "delete {[][][]}");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(taskId21);
        org.junit.Assert.assertNotNull(task22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest3 = new org.elasticsearch.action.delete.DeleteRequest("", "", "");
        java.lang.String str4 = deleteRequest3.id();
        org.elasticsearch.index.shard.ShardId shardId5 = null;
        org.elasticsearch.action.delete.DeleteRequest deleteRequest6 = deleteRequest3.setShardId(shardId5);
        org.elasticsearch.action.ActionRequestValidationException actionRequestValidationException7 = deleteRequest6.validate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(deleteRequest6);
        org.junit.Assert.assertNull(actionRequestValidationException7);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.elasticsearch.action.delete.DeleteRequest deleteRequest0 = new org.elasticsearch.action.delete.DeleteRequest();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest2 = deleteRequest0.parent("delete {[][][]}");
        java.lang.String str3 = deleteRequest0.id();
        java.lang.String[] strArray4 = deleteRequest0.indices();
        org.elasticsearch.action.delete.DeleteRequest deleteRequest5 = new org.elasticsearch.action.delete.DeleteRequest();
        java.lang.String str6 = deleteRequest5.parent();
        org.elasticsearch.common.transport.TransportAddress transportAddress7 = deleteRequest5.remoteAddress();
        org.elasticsearch.tasks.TaskId taskId8 = deleteRequest5.getParentTask();
        deleteRequest0.setParentTask(taskId8);
        org.elasticsearch.common.io.stream.StreamInput streamInput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            deleteRequest0.readFrom(streamInput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(deleteRequest2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(transportAddress7);
        org.junit.Assert.assertNotNull(taskId8);
    }
}

